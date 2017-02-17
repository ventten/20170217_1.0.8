package com.ljwd.plms.mapp.filter;

import com.ljwd.plms.core.util.HttpUtils;
import com.ljwd.plms.mapp.utils.AES;
import com.ljwd.plms.mapp.utils.SHA1;
import org.apache.commons.io.IOUtils;
import org.apache.shiro.authz.AuthorizationException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletRequestWrapper;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;

/**
 * POST内容读取请求包装类,用于可重复读取POST请求body中内容并解密app请求的加密数据
 * @author tangjialin on 2016-08-29 0029.
 */
public class AESHttpServletRequestWrapper extends HttpServletRequestWrapper {
    public static final Charset DEFAULT_CHARSET = Charset.forName("UTF-8");

    /** 与APP对接应用标识 */
    public static final String APP_ID = "3BAC9992A2954A408136213F1D3AA3F9";
    /** 与APP对接数据加解密密钥 */
    public static final String SECRET_KEY = "#BF3C947$D6&52EA";
    /** app的唯一标识对应的键 */
    public static final String APP_ID_PARAMETER = "appid";
    /** app接口请求时间戳对应的键 */
    public static final String APP_TIMESTAMP_PARAMETER = "timestamp";
    /** app接口请求随机数对应的键 */
    public static final String APP_NONCE_PARAMETER = "nonce";
    /** app接口请求签名信息对应的键 */
    public static final String APP_SIGNATURE_PARAMETER = "signature";

    protected Logger logger = LoggerFactory.getLogger(getClass());
    protected boolean isInfoEnabled = logger.isInfoEnabled();
    /** APP请求源地址 */
    private final String clientIp;
    /** APP唯一标识 */
    private final String appId;
    /** 请求APP对应的密钥 */
    private final String secretKey;
    /** 接口请求时间戳 */
    private final String timestamp;
    /** 接口请求随机数 */
    private final String nonce;
    /** 接口请求签名 */
    private final String signature;
    /** 接口请求解密后的数据 */
    private final byte[] decryptedBodyBytes;
    /** 接口请求解密后的数据字符串形式 */
    private final String decryptedBodyContent;
    /** 接口请求加解密策略 */
    private final AESAuthen aesAuthen;

    public AESHttpServletRequestWrapper(AESAuthen aesAuthen, HttpServletRequest request) throws IOException {
        super(request);
        InputStream is = null;
        try {
            this.aesAuthen = aesAuthen;
            this.clientIp = HttpUtils.getRequestFullIp(request);
            this.appId = request.getParameter(APP_ID_PARAMETER);
            this.timestamp = request.getParameter(APP_TIMESTAMP_PARAMETER);
            this.nonce = request.getParameter(APP_NONCE_PARAMETER);
            this.signature = request.getParameter(APP_SIGNATURE_PARAMETER);
            this.secretKey = SECRET_KEY;
            is = request.getInputStream();
            byte[] originalBodyBytes = IOUtils.toByteArray(is);
            // 请求验证
            if (aesAuthen == null || aesAuthen.requestCheck()) {
                if (!APP_ID.equals(this.appId)) { throw new AuthorizationException("非法的appId:" + appId); }
                String originalBodyContent = aesAuthen == null || aesAuthen.requestCheckAndBody() ? new String(originalBodyBytes, DEFAULT_CHARSET) : "";
                if (!requestCheck(originalBodyContent)) { throw new AuthorizationException("非法请求:请求验证不通过"); }

                // 请求数据解密
                if (aesAuthen == null || aesAuthen.requestDecrypt()) {
                    String data = AES.instance.decrypt(originalBodyContent, secretKey);
                    // replace("(null)", "")解决IOS传入参数"(null)"导致Long或Int类型等转换异常
                    this.decryptedBodyContent = data == null ? "" : data.replace("\"(null)\"", "null");
                    this.decryptedBodyBytes = decryptedBodyContent.getBytes(DEFAULT_CHARSET);
                } else {
                    this.decryptedBodyContent = originalBodyContent;
                    this.decryptedBodyBytes = originalBodyBytes;
                }
            } else {
                this.decryptedBodyContent = new String(originalBodyBytes, DEFAULT_CHARSET);
                this.decryptedBodyBytes = originalBodyBytes;
            }
            if (isInfoEnabled) {
                String process = aesAuthen == null || aesAuthen.requestCheck() ? "签名验证通过" : "不验证签名";
                String requestURI = request.getRequestURI();
                // 请求日志记录
                if (aesAuthen == null || aesAuthen.requestLog()) {
                    logger.info("请求来源:[{}] 请求接口:[{}] {} 接收数据:[{}]", new Object[]{clientIp, requestURI, process, decryptedBodyContent});
                } else {
                    logger.info("请求来源:[{}] 请求接口:[{}] {}", new Object[]{clientIp, requestURI, process});
                }
            }
        } finally {
            IOUtils.closeQuietly(is);
        }
    }

    /**
     * 验证请求是否合法
     * @return
     */
    public boolean requestCheck(String originalBodyContent) {
        AESHttpServletRequestWrapper request = this;
        String requestURI = request.getRequestURI();
        String queryString = request.getQueryString();
        try {
//            if (isInfoEnabled) {
//                if (aesAuthen == null || aesAuthen.detail()) {
//                    logger.info("请求来源:[{}] 请求接口:[{}] 请求内容:[{}]", new Object[]{clientIp, requestURI, originalBodyContent});
//                } else {
//                    logger.info("请求来源:[{}] 请求接口:[{}]", new Object[]{clientIp, requestURI});
//                }
//            }
            // 计算签名
            String sha1 = SHA1.instance.getSHA1(appId, secretKey, timestamp, nonce, originalBodyContent);
            boolean isOK = signature.equals(sha1);
            if (isInfoEnabled) {
                String userAgent = HttpUtils.getUserAgent(request);
                logger.info("请求来源:[{}] 请求接口:[{}] 签名验证结果:[{}] 请求参数:[{}] User-Agent:[{}]", new Object[]{clientIp, requestURI, isOK, queryString, userAgent});
            }
            return isOK;
        } catch (Exception e) {
            String userAgent = HttpUtils.getUserAgent(request);
            String format = String.format("请求验证失败.请求来源:[{}] 请求接口:[%s] 请求参数:[%s] User-Agent:[{}]", clientIp, requestURI, queryString, userAgent);
            logger.error(format, e);
            return false;
        }
    }

    /** APP请求源地址 */
    public String getClientIp() {
        return clientIp;
    }

    /** APP唯一标识 */
    public String getAppId() {
        return appId;
    }

    /** 接口请求时间戳 */
    public String getTimestamp() {
        return timestamp;
    }

    /** 接口请求随机数 */
    public String getNonce() {
        return nonce;
    }

    /** 接口请求签名 */
    public String getSignature() {
        return signature;
    }

    /** 请求APP对应的密钥 */
    public String getSecretKey() {
        return secretKey;
    }

    /** 接口请求解密后的数据 */
    public byte[] getDecryptedBodyBytes() {
        return decryptedBodyBytes;
    }

    /** 接口请求解密后的数据字符串形式 */
    public String getDecryptedBodyContent() {
        return decryptedBodyContent;
    }

    /** 接口请求加解密策略 */
    public AESAuthen getAesAuthen() {
        return aesAuthen;
    }

    @Override
    public BufferedReader getReader() throws IOException {
        return new BufferedReader(new InputStreamReader(getInputStream()));
    }

    @Override
    public javax.servlet.ServletInputStream getInputStream() throws IOException {
        if (isInfoEnabled) { logger.info("解析请求数据,读取POST请求正文内容,即输入流信息"); }
        return new ServletInputStream(getDecryptedBodyBytes());
    }

    /**
     * 扩展输入流,以适应可以重复读取
     */
    class ServletInputStream extends javax.servlet.ServletInputStream {
        private InputStream is = null;

        public ServletInputStream(byte[] data) {
            is = new ByteArrayInputStream(data);
        }

        public boolean isFinished() {
            return false;
        }

        public boolean isReady() {
            return false;
        }

        public int read() throws IOException {
            return is.read();
        }

        public void close() throws IOException {
            super.close();
            is.close();
        }
    }
}