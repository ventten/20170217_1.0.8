
package com.ljwd.plms.web.wsdl.webservice.service;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for userLoginStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="userLoginStatus">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="SUCCESS"/>
 *     &lt;enumeration value="NOT_FOUND_USER"/>
 *     &lt;enumeration value="WRONG_PWD"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "userLoginStatus")
@XmlEnum
public enum UserLoginStatus {

    SUCCESS,
    NOT_FOUND_USER,
    WRONG_PWD;

    public String value() {
        return name();
    }

    public static UserLoginStatus fromValue(String v) {
        return valueOf(v);
    }

}
