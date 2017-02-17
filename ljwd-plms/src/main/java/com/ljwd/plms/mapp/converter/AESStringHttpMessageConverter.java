package com.ljwd.plms.mapp.converter;

import com.ljwd.plms.mapp.filter.AESAuthen;
import com.ljwd.plms.mapp.filter.AESHttpServletRequestWrapper;
import com.ljwd.plms.mapp.filter.AESHttpServletResponseWrapper;
import com.ljwd.plms.mapp.utils.AES;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpOutputMessage;
import org.springframework.http.converter.StringHttpMessageConverter;
import org.springframework.http.server.ServletServerHttpResponse;

import java.io.IOException;
import java.nio.charset.Charset;

/**
 * String数据转换器包含统一加解密
 * Created by tangjialin on 2016-08-30 0030.
 */
public class AESStringHttpMessageConverter extends StringHttpMessageConverter {
    public static final Charset DEFAULT_CHARSET = Charset.forName("UTF-8");
    protected Logger logger = LoggerFactory.getLogger(getClass());
    protected boolean isInfoEnabled = logger.isInfoEnabled();

    public AESStringHttpMessageConverter(Charset defaultCharset) {
        super(defaultCharset == null ? DEFAULT_CHARSET : defaultCharset);
    }

    /**
     * 实现响应String数据的统一加密
     * @param originalString 响应的原始数据
     * @param outputMessage  输出流等信息
     * @throws IOException
     */
    @Override
    protected void writeInternal(String originalString, HttpOutputMessage outputMessage) throws IOException {
        try {
            HttpHeaders headers = outputMessage.getHeaders();
            ServletServerHttpResponse serverHttpResponse = (ServletServerHttpResponse) outputMessage;
            AESHttpServletResponseWrapper response = (AESHttpServletResponseWrapper) serverHttpResponse.getServletResponse();
            AESHttpServletRequestWrapper request = response.getRequest();
            AESAuthen aesAuthen = request.getAesAuthen();
            String outString = null;
            if (aesAuthen == null || aesAuthen.responseEncrypt()) {
                String secretKey = request.getSecretKey();
                outString = AES.instance.encrypt(originalString, secretKey); // 对输出信息加密
            } else {
                outString = originalString;
            }
            // 重新计算加密后的响应内容长度,否则会造成数据响应不完全或一直挂起
            headers.setContentLength(getContentLength(outString, headers.getContentType()));
            super.writeInternal(outString, outputMessage);
            if (isInfoEnabled) {
                String requestURI = request.getRequestURI();
                if (aesAuthen == null || aesAuthen.responseLog()) {
//                    if (aesAuthen == null || aesAuthen.response()) {
//                        Object[] argArray = {request.getClientIp(), requestURI, originalString, outString};
//                        logger.info("String响应完毕.请求来源:[{}] 请求接口:[{}] 原始响应信息:[{}] 最终响应信息:[{}]", argArray);
//                    } else {
                    Object[] argArray = {request.getClientIp(), requestURI, originalString};
                    logger.info("String响应完毕.请求来源:[{}] 请求接口:[{}] 响应信息:[{}]", argArray);
//                    }
                } else {
                    logger.info("String响应完毕.请求来源:[{}] 请求接口:[{}]", request.getClientIp(), requestURI);
                }
            }
        } catch (Exception e) {
            logger.error("响应异常", e);
        }
    }
}
