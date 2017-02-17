
package com.ljwd.plms.web.wsdl.webservice.service;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for loanStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="loanStatus">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="DRAFT"/>
 *     &lt;enumeration value="APPROVING"/>
 *     &lt;enumeration value="SIGNING"/>
 *     &lt;enumeration value="PAYING"/>
 *     &lt;enumeration value="REPAYING"/>
 *     &lt;enumeration value="OVERDUE"/>
 *     &lt;enumeration value="CLEAR"/>
 *     &lt;enumeration value="REJECTED"/>
 *     &lt;enumeration value="VOIDED"/>
 *     &lt;enumeration value="CANCELLED"/>
 *     &lt;enumeration value="WRITE_OFF"/>
 *     &lt;enumeration value="INTERNAL_APPROVED"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "loanStatus")
@XmlEnum
public enum LoanStatus {

    DRAFT,
    APPROVING,
    SIGNING,
    PAYING,
    REPAYING,
    OVERDUE,
    CLEAR,
    REJECTED,
    VOIDED,
    CANCELLED,
    WRITE_OFF,
    INTERNAL_APPROVED;

    public String value() {
        return name();
    }

    public static LoanStatus fromValue(String v) {
        return valueOf(v);
    }

}
