
package com.ljwd.plms.web.wsdl.webservice.service;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for bankAccountOwnerType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="bankAccountOwnerType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="COMPANY"/>
 *     &lt;enumeration value="PAY_14"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "bankAccountOwnerType")
@XmlEnum
public enum BankAccountOwnerType {

    COMPANY,
    PAY_14;

    public String value() {
        return name();
    }

    public static BankAccountOwnerType fromValue(String v) {
        return valueOf(v);
    }

}
