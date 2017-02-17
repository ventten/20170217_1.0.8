package com.ljwd.plms.core.entity;

import java.io.Serializable;

/**
 * Result : 响应的结果对象
 */
public class Result implements Serializable {
    private static final long serialVersionUID = 6288374846131788743L;

    /**
     * 信息
     */
    private String message;

    /**
     * 状态码
     */
    private int statusCode;

    /**
     * 是否成功
     */
    private boolean success;

    public String getMessage() {
        return message;
    }

    public <E extends Result> E setMessage(String message) {
        this.message = message;
        return (E) this;
    }

    public boolean isSuccess() {
        return success;
    }

    public <E extends Result> E setSuccess(boolean success) {
        this.success = success;
        return (E) this;
    }

    public int getStatusCode() {
        return statusCode;
    }

    public <E extends Result> E setStatusCode(int statusCode) {
        this.statusCode = statusCode;
        return (E) this;
    }

    public Result() {

    }

    public Result(boolean success, String message) {
        this.success = success;
        this.message = message;
    }

}
