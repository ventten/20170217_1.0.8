
package com.ljwd.plms.web.wsdl.webservice.service;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for advanceReceivedAction.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="advanceReceivedAction">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="UNHANDLED"/>
 *     &lt;enumeration value="REFUND"/>
 *     &lt;enumeration value="POST"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "advanceReceivedAction")
@XmlEnum
public enum AdvanceReceivedAction {

    UNHANDLED,
    REFUND,
    POST;

    public String value() {
        return name();
    }

    public static AdvanceReceivedAction fromValue(String v) {
        return valueOf(v);
    }

}
