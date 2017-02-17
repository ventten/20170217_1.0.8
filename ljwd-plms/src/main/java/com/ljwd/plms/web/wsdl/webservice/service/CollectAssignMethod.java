
package com.ljwd.plms.web.wsdl.webservice.service;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for collectAssignMethod.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="collectAssignMethod">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="CLIENT_ASSIGN_COUNT"/>
 *     &lt;enumeration value="REMAINING_PRINCIPAL"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "collectAssignMethod")
@XmlEnum
public enum CollectAssignMethod {

    CLIENT_ASSIGN_COUNT,
    REMAINING_PRINCIPAL;

    public String value() {
        return name();
    }

    public static CollectAssignMethod fromValue(String v) {
        return valueOf(v);
    }

}
