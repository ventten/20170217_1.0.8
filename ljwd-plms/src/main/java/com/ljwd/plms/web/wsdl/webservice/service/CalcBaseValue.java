
package com.ljwd.plms.web.wsdl.webservice.service;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for calcBaseValue.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="calcBaseValue">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ANY"/>
 *     &lt;enumeration value="PERIOD"/>
 *     &lt;enumeration value="AMT"/>
 *     &lt;enumeration value="REMAIN_PERIOD"/>
 *     &lt;enumeration value="REPAID_PERIOD"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "calcBaseValue")
@XmlEnum
public enum CalcBaseValue {

    ANY,
    PERIOD,
    AMT,
    REMAIN_PERIOD,
    REPAID_PERIOD;

    public String value() {
        return name();
    }

    public static CalcBaseValue fromValue(String v) {
        return valueOf(v);
    }

}
