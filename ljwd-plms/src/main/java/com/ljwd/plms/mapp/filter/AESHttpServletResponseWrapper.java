package com.ljwd.plms.mapp.filter;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpServletResponseWrapper;
import java.io.IOException;

/**
 * POST内容读取请求包装类,用于可重复读取POST请求body中内容并解密app请求的加密数据
 * @author tangjialin on 2016-08-29 0029.
 */
public class AESHttpServletResponseWrapper extends HttpServletResponseWrapper {
    private final AESHttpServletRequestWrapper request;

    public AESHttpServletResponseWrapper(AESHttpServletRequestWrapper request, HttpServletResponse response) throws IOException {
        super(response);
        this.request = request;
    }

    public AESHttpServletRequestWrapper getRequest() {
        return request;
    }
}