package com.ljwd.plms.mapp.converter;

import com.ljwd.plms.mapp.filter.AESAuthen;
import com.ljwd.plms.mapp.filter.AESHttpServletRequestWrapper;
import com.ljwd.plms.mapp.filter.AESHttpServletResponseWrapper;
import com.ljwd.plms.mapp.utils.AES;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpOutputMessage;
import org.springframework.http.MediaType;
import org.springframework.http.converter.HttpMessageNotWritableException;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.http.server.ServletServerHttpResponse;
import org.springframework.util.StreamUtils;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.text.SimpleDateFormat;

/**
 * JSON数据转换器包含统一加解密
 * Created by tangjialin on 2016-08-30 0030.
 */
public class AESMappingJackson2HttpMessageConverter extends MappingJackson2HttpMessageConverter {
    protected Logger logger = LoggerFactory.getLogger(getClass());
    protected boolean isInfoEnabled = logger.isInfoEnabled();
    protected AESStringHttpMessageConverter aesStringHttpMessageConverter;

    public AESMappingJackson2HttpMessageConverter() {
        /**
         * 使用jackson来序列化JAVA对象为JSON字符串
         * 如果使用alibaba的JSON库,为null的属性在生成JSON字符串后会被丢失
         * 为了文档和数据一致性,所以使用jackson
         */
        getObjectMapper().setDateFormat(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"));
    }

    public AESMappingJackson2HttpMessageConverter(AESStringHttpMessageConverter aesStringHttpMessageConverter) {
        this();
        this.aesStringHttpMessageConverter = aesStringHttpMessageConverter;
    }

//    @Override
//    protected void writeInternal(Object object, HttpOutputMessage outputMessage) throws IOException, HttpMessageNotWritableException {
//        aesStringHttpMessageConverter.writeInternal(getObjectMapper().writeValueAsString(object), outputMessage);
//    }

    @Override
    protected void writeInternal(Object object, HttpOutputMessage outputMessage) throws IOException, HttpMessageNotWritableException {
        try {
            String originalString = getObjectMapper().writeValueAsString(object);
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
            Charset charset = getContentTypeCharset(headers.getContentType());
            StreamUtils.copy(outString, charset, outputMessage.getBody());
            if (isInfoEnabled) {
                String requestURI = request.getRequestURI();
                if (aesAuthen == null || aesAuthen.responseLog()) {
//                    if (aesAuthen == null || aesAuthen.response()) {
//                        Object[] argArray = {request.getClientIp(), requestURI, originalString, outString};
//                        logger.info("Jackson2响应完毕.请求来源:[{}] 请求接口:[{}] 原始响应信息:[{}] 最终响应信息:[{}]", argArray);
//                    } else {
                    Object[] argArray = {request.getClientIp(), requestURI, originalString};
                    logger.info("Jackson2响应完毕.请求来源:[{}] 请求接口:[{}] 响应信息:[{}]", argArray);
//                    }
                } else {
                    logger.info("Jackson2响应完毕.请求来源:[{}] 请求接口:[{}]", request.getClientIp(), requestURI);
                }
            }
        } catch (Exception e) {
            logger.error("响应异常", e);
        }
    }

    protected Long getContentLength(Object object, MediaType contentType) throws IOException {
        if (object instanceof String) {
            Charset charset = getContentTypeCharset(contentType);
            try {
                return (long) ((String) object).getBytes(charset.name()).length;
            } catch (UnsupportedEncodingException ex) {
                // should not occur
                throw new IllegalStateException(ex);
            }
        }
        return super.getContentLength(object, contentType);
    }

    protected Charset getContentTypeCharset(MediaType contentType) {
        if (contentType != null && contentType.getCharSet() != null) {
            return contentType.getCharSet();
        } else {
            return DEFAULT_CHARSET;
        }
    }
}