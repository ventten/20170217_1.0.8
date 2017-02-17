
package com.ljwd.plms.web.wsdl.webservice.service;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for bankAccountType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="bankAccountType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="COLLECT"/>
 *     &lt;enumeration value="PAY"/>
 *     &lt;enumeration value="TRANSFER"/>
 *     &lt;enumeration value="OTHER"/>
 *     &lt;enumeration value="VIRTUAL"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "bankAccountType")
@XmlEnum
public enum BankAccountType {

    COLLECT,
    PAY,
    TRANSFER,
    OTHER,
    VIRTUAL;

    public String value() {
        return name();
    }

    public static BankAccountType fromValue(String v) {
        return valueOf(v);
    }

}
