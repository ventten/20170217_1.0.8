
package com.ljwd.plms.web.wsdl.webservice.service;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for payRequestStrategyType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="payRequestStrategyType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ONCE"/>
 *     &lt;enumeration value="MULTI_TWO_FIX_AMT"/>
 *     &lt;enumeration value="MULTI_DIVIDE_TWO"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "payRequestStrategyType")
@XmlEnum
public enum PayRequestStrategyType {

    ONCE,
    MULTI_TWO_FIX_AMT,
    MULTI_DIVIDE_TWO;

    public String value() {
        return name();
    }

    public static PayRequestStrategyType fromValue(String v) {
        return valueOf(v);
    }

}
