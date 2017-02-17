
package com.ljwd.plms.web.wsdl.webservice.service;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for repaymentState.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="repaymentState">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NORMAL"/>
 *     &lt;enumeration value="IS_OVERDUE"/>
 *     &lt;enumeration value="WAS_OVERDUE"/>
 *     &lt;enumeration value="VERY_OVERDUE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "repaymentState")
@XmlEnum
public enum RepaymentState {

    NORMAL,
    IS_OVERDUE,
    WAS_OVERDUE,
    VERY_OVERDUE;

    public String value() {
        return name();
    }

    public static RepaymentState fromValue(String v) {
        return valueOf(v);
    }

}
