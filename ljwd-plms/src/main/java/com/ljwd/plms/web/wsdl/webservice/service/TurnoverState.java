
package com.ljwd.plms.web.wsdl.webservice.service;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for turnoverState.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="turnoverState">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NORMAL"/>
 *     &lt;enumeration value="ABNORMAL"/>
 *     &lt;enumeration value="NOTHING"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "turnoverState")
@XmlEnum
public enum TurnoverState {

    NORMAL,
    ABNORMAL,
    NOTHING;

    public String value() {
        return name();
    }

    public static TurnoverState fromValue(String v) {
        return valueOf(v);
    }

}
