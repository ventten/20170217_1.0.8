
package com.ljwd.plms.web.wsdl.webservice.service;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for repaymentStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="repaymentStatus">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="UNPAID"/>
 *     &lt;enumeration value="PAID"/>
 *     &lt;enumeration value="PARTIAL_PAID"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "repaymentStatus")
@XmlEnum
public enum RepaymentStatus {

    UNPAID,
    PAID,
    PARTIAL_PAID;

    public String value() {
        return name();
    }

    public static RepaymentStatus fromValue(String v) {
        return valueOf(v);
    }

}
