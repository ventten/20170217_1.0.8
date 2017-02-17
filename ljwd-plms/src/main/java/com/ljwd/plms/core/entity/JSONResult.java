package com.ljwd.plms.core.entity;

/**
 * JSONResult : Response JSONResult for RESTful,封装返回JSON格式的数据
 */
public class JSONResult<T> extends Result {

    private static final long serialVersionUID = 7880907731807860636L;

    /**
     * 数据
     */
    private T data;


    public JSONResult() {
        super();
    }

    /**
     * 成功返回数据和消息
     * @param success 是否成功
     * @param message 信息
     */
    public JSONResult(boolean success, String message) {
        super(success,message);
    }


    /**
     * 自定义返回的结果
     * @param data 数据
     * @param message 信息
     * @param success 是否成功
     */
    public JSONResult(T data, String message, boolean success) {
        this.data = data;
        super.setMessage(message);
        super.setSuccess(success);
    }

    /**
     * 成功返回数据和消息
     * @param data 数据
     * @param message 信息
     */
    public JSONResult(T data, String message) {
        this.data = data;
        super.setMessage(message);
        super.setSuccess(true);
    }

    /**
     * 成功返回数据
     * @param data 数据
     */
    public JSONResult(T data) {
        this.data = data;
        super.setSuccess(true);
    }

    public T getData() {
        return data;
    }

    public JSONResult<T> setData(T data) {
        this.data = data;
        return this;
    }

}