
package com.ljwd.plms.web.wsdl.webservice.service;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for payRequestItemDetailStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="payRequestItemDetailStatus">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="CREATED"/>
 *     &lt;enumeration value="SEND_FAILED"/>
 *     &lt;enumeration value="SENT"/>
 *     &lt;enumeration value="SUCCESS"/>
 *     &lt;enumeration value="FAILED"/>
 *     &lt;enumeration value="CANCELLED"/>
 *     &lt;enumeration value="ERROR"/>
 *     &lt;enumeration value="TIMEOUT"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "payRequestItemDetailStatus")
@XmlEnum
public enum PayRequestItemDetailStatus {

    CREATED,
    SEND_FAILED,
    SENT,
    SUCCESS,
    FAILED,
    CANCELLED,
    ERROR,
    TIMEOUT;

    public String value() {
        return name();
    }

    public static PayRequestItemDetailStatus fromValue(String v) {
        return valueOf(v);
    }

}
