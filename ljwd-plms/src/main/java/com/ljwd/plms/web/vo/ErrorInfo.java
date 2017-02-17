package com.ljwd.plms.web.vo;

import javax.xml.bind.annotation.*;

/**
 * Created by zhengzw on 2016/11/16
 * 微贷Http请求执行失败返回提示信息
 */
@XmlRootElement(name = "errorInfo")
@XmlType(name = "ErrorInfo")
public class ErrorInfo {

    private String errorCode;
    private String errorMessage;

    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

}
