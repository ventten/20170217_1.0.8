package com.ljwd.plms.mapp.controller;

import com.ljwd.plms.core.util.HttpUtils;
import com.ljwd.plms.core.util.JSONUtil;
import com.ljwd.plms.mapp.filter.AESHttpServletRequestWrapper;
import com.ljwd.plms.mapp.utils.AES;
import com.ljwd.plms.mapp.utils.SHA1;
import org.apache.commons.io.FileUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

/**
 * Created by tangjialin on 2016-10-19 0019.
 */
public abstract class AbstractControllerTest {
    protected Logger logger = LoggerFactory.getLogger(getClass());
    protected static String base = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
    /** APP唯一标识 */
    protected String appId = AESHttpServletRequestWrapper.APP_ID;
    /** 请求APP对应的密钥 */
    protected String secretKey = AESHttpServletRequestWrapper.SECRET_KEY;
    protected String baseUrl = "http://127.0.0.1:8083/mapp";
    //    /** 测试机内网 */
//    protected String baseUrl = "http://192.168.11.190:8090/plms/mapp";
//    /** 测试机域名 */
//    protected String baseUrl = "http://loanplms.ljweidai.com/plms/mapp";
    /** 接口请求时间戳 */
    protected String timestamp = new SimpleDateFormat("yyyyMMddHHMMSS").format(new Date()); // 时间戳,格式不固定;
    /** 接口请求随机数 */
    protected String nonce;

    protected File file = null;
    protected String sessionId = null;
    public AbstractControllerTest() {
        StringBuilder builder = new StringBuilder(10);
        Random random = new Random();
        for (int i = 0; i < 10; i++) { builder.append(base.charAt(random.nextInt(base.length()))); }
        nonce = builder.toString();

        String sessionFilePath = getClass().getClassLoader().getResource("") + "sessionFile.txt";
        sessionFilePath = sessionFilePath.replace("file:/", "");
        file = new File(sessionFilePath);
        String content = null;
        try {
            if (!file.exists()) {
                FileUtils.writeStringToFile(file, "");
            } else {
                content = FileUtils.readFileToString(file);
            }
        } catch (IOException e) {
            logger.error("", e);
        }
        sessionId = content;
        logger.info("加载文件信息sessionId:[{}]", content);
    }

    /**
     * 请求地址统一封装
     * @param interfaceUrl 接口地址
     * @param encryptData  发送的加密数据
     * @return 返回最终请求地址
     */
    public String packageUrl(String interfaceUrl, String encryptData) {
        String signature = SHA1.instance.getSHA1(appId, secretKey, timestamp, nonce, encryptData);
        String url = this.baseUrl + interfaceUrl + String.format("?appid=%s&timestamp=%s&nonce=%s&signature=%s", appId, timestamp, nonce, signature);
        logger.info("请求完整地址:[{}]", url);
        return url;
    }

    /**
     * 请求数据统一加密
     * @param reqData 基础地址
     * @return 返回加密后的数据
     */
    public String packageData(Object reqData) {
        String srcData = (reqData instanceof String) ? (String) reqData : JSONUtil.toJSONString(reqData);
        logger.info("请求原始数据:[{}]", srcData);
        String encryptData = AES.instance.encrypt(srcData, secretKey);
        logger.info("加密后的请求数据:[{}]", encryptData);
        return encryptData;
    }

    /**
     * 发送数据,接收数据并解密接收数据
     * @param url         请求地址
     * @param encryptData 发送的数据
     * @param sessionId   会话信息key
     * @return 返回响应数据
     */
    public String send(String url, String encryptData, String sessionId) {
        try {
            logger.info("sessionId:[{}] 请求接口:[{}]", sessionId, url);
            HttpUtils.HttpResult httpResult = HttpUtils.sendPost(url, encryptData, sessionId);
            logger.info("响应原始数据:[{}]", JSONUtil.toJSONString(httpResult));
            if (httpResult.getSessionId() != null && !httpResult.getSessionId().isEmpty()) {
                this.sessionId = httpResult.getSessionId();
                FileUtils.writeStringToFile(file, httpResult.getSessionId());
            }
            String response = AES.instance.decrypt(httpResult.getContext(), secretKey);
            logger.info("响应数据解密:[{}]", response);
            return response;
        } catch (Exception e) {
            logger.error(url, e);
        }
        return null;
    }

    /**
     * 自动发送数据,包含自动转换数据
     * @param url  请求接口地址
     * @param data 请求数据
     * @return 返回响应数据
     */
    public String autoSend(String url, Object data) {
        logger.info("请求接口:[{}] sessionId:[{}]", url, sessionId);
        String encryptData = packageData(data);
        url = packageUrl(url, encryptData);
        return send(url, encryptData, sessionId);
    }

    /**
     * 自动发送数据,包含自动转换数据
     * @param url       请求接口地址
     * @param data      请求数据
     * @param sessionId 会话信息key
     * @return 返回响应数据
     */
    public String autoSend(String url, Object data, String sessionId) {
        logger.info("sessionId:[{}] 请求接口:[{}]", sessionId, url);
        String encryptData = data == null ? "" : packageData(data);
        url = packageUrl(url, encryptData);
        return send(url, encryptData, sessionId);
    }
}
