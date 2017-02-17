
package com.ljwd.plms.web.wsdl.webservice.service;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for settleType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="settleType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="T0"/>
 *     &lt;enumeration value="T1"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "settleType")
@XmlEnum
public enum SettleType {

    @XmlEnumValue("T0")
    T_0("T0"),
    @XmlEnumValue("T1")
    T_1("T1");
    private final String value;

    SettleType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SettleType fromValue(String v) {
        for (SettleType c: SettleType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
