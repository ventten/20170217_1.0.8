
package com.ljwd.plms.web.wsdl.webservice.service;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for payRequestStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="payRequestStatus">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="INVALID"/>
 *     &lt;enumeration value="VALID"/>
 *     &lt;enumeration value="PROCESSING"/>
 *     &lt;enumeration value="FULL"/>
 *     &lt;enumeration value="PARTIAL"/>
 *     &lt;enumeration value="CANCELLED"/>
 *     &lt;enumeration value="FAILED"/>
 *     &lt;enumeration value="SEND_FAILED"/>
 *     &lt;enumeration value="ERROR"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "payRequestStatus")
@XmlEnum
public enum PayRequestStatus {

    INVALID,
    VALID,
    PROCESSING,
    FULL,
    PARTIAL,
    CANCELLED,
    FAILED,
    SEND_FAILED,
    ERROR;

    public String value() {
        return name();
    }

    public static PayRequestStatus fromValue(String v) {
        return valueOf(v);
    }

}
