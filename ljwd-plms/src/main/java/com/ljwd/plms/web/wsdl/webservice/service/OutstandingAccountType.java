
package com.ljwd.plms.web.wsdl.webservice.service;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for outstandingAccountType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="outstandingAccountType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="SUSPEND"/>
 *     &lt;enumeration value="CANCEL_POST"/>
 *     &lt;enumeration value="POST"/>
 *     &lt;enumeration value="CANCEL_SUSPEND"/>
 *     &lt;enumeration value="REFUND"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "outstandingAccountType")
@XmlEnum
public enum OutstandingAccountType {

    SUSPEND,
    CANCEL_POST,
    POST,
    CANCEL_SUSPEND,
    REFUND;

    public String value() {
        return name();
    }

    public static OutstandingAccountType fromValue(String v) {
        return valueOf(v);
    }

}
