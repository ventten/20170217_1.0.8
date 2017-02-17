
package com.ljwd.plms.web.wsdl.webservice.service;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for checkLoanManType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="checkLoanManType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="CLIENT_NAME"/>
 *     &lt;enumeration value="ID_CARD"/>
 *     &lt;enumeration value="ALL_PHONE"/>
 *     &lt;enumeration value="HOME_ADDRESS"/>
 *     &lt;enumeration value="COMPANY_NAME"/>
 *     &lt;enumeration value="COMPANY_ADDRESS"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "checkLoanManType")
@XmlEnum
public enum CheckLoanManType {

    CLIENT_NAME,
    ID_CARD,
    ALL_PHONE,
    HOME_ADDRESS,
    COMPANY_NAME,
    COMPANY_ADDRESS;

    public String value() {
        return name();
    }

    public static CheckLoanManType fromValue(String v) {
        return valueOf(v);
    }

}
