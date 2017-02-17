
package com.ljwd.plms.web.wsdl.webservice.service;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for businessCategory.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="businessCategory">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NORMAL"/>
 *     &lt;enumeration value="WHOLE"/>
 *     &lt;enumeration value="MATURE_PAYMENT"/>
 *     &lt;enumeration value="INT_FIRST_PRIN_LAST"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "businessCategory")
@XmlEnum
public enum BusinessCategory {

    NORMAL,
    WHOLE,
    MATURE_PAYMENT,
    INT_FIRST_PRIN_LAST;

    public String value() {
        return name();
    }

    public static BusinessCategory fromValue(String v) {
        return valueOf(v);
    }

}
