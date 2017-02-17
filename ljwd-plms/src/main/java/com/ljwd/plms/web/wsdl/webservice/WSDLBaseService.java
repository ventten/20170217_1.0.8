package com.ljwd.plms.web.wsdl.webservice;

import com.ljwd.plms.web.wsdl.webservice.channelService.UserProfileDto;
import com.ljwd.plms.web.wsdl.webservice.exception.ErrorInfoException_Exception;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * Created by zhengzw on 2016/7/4
 */
public interface WSDLBaseService {

    /**
     * @param plainPwd
     * @param userId
     * @return
     *     returns com.ljwd.plms.web.wsdl.webservice.UserProfileDto
     * @throws com.ljwd.plms.web.wsdl.webservice.exception.ErrorInfoException_Exception
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "login", targetNamespace = "http://webservice.loan.mfbms.flinkmf.com/", className = "com.ljwd.plms.web.wsdl.webservice.Login")
    @ResponseWrapper(localName = "loginResponse", targetNamespace = "http://webservice.loan.mfbms.flinkmf.com/", className = "com.ljwd.plms.web.wsdl.webservice.LoginResponse")
    public UserProfileDto login(
            @WebParam(name = "plainPwd", targetNamespace = "")
            String plainPwd,
            @WebParam(name = "userId", targetNamespace = "")
            String userId)
            throws ErrorInfoException_Exception
    ;

}
