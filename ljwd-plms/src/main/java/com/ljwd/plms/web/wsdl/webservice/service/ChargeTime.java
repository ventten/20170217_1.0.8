
package com.ljwd.plms.web.wsdl.webservice.service;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for chargeTime.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="chargeTime">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="PERIOD_ZERO"/>
 *     &lt;enumeration value="PER_PERIOD"/>
 *     &lt;enumeration value="UNDEFINED"/>
 *     &lt;enumeration value="PERIOD_FIRST"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "chargeTime")
@XmlEnum
public enum ChargeTime {

    PERIOD_ZERO,
    PER_PERIOD,
    UNDEFINED,
    PERIOD_FIRST;

    public String value() {
        return name();
    }

    public static ChargeTime fromValue(String v) {
        return valueOf(v);
    }

}
