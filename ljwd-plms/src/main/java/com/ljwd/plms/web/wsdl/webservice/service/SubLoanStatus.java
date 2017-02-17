
package com.ljwd.plms.web.wsdl.webservice.service;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for subLoanStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="subLoanStatus">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="DRAFT"/>
 *     &lt;enumeration value="SURVEYING_NET"/>
 *     &lt;enumeration value="SURVEYING_PHONE"/>
 *     &lt;enumeration value="SURVEYING_CALC"/>
 *     &lt;enumeration value="SURVEYING_SUM"/>
 *     &lt;enumeration value="APPROVING_1"/>
 *     &lt;enumeration value="APPROVING_2"/>
 *     &lt;enumeration value="APPROVING_3"/>
 *     &lt;enumeration value="APPROVING_4"/>
 *     &lt;enumeration value="APPROVING_5"/>
 *     &lt;enumeration value="APPROVING_6"/>
 *     &lt;enumeration value="APPROVING_7"/>
 *     &lt;enumeration value="INTERNAL_APPROVED"/>
 *     &lt;enumeration value="SUBMITTED_TO_BANK"/>
 *     &lt;enumeration value="CONTRACT_UNSIGNED"/>
 *     &lt;enumeration value="CONTRACT_GENERATED"/>
 *     &lt;enumeration value="CONTRACT_SIGNED"/>
 *     &lt;enumeration value="CONTRACT_CONFIRMED"/>
 *     &lt;enumeration value="CONTRACT_VOIDED"/>
 *     &lt;enumeration value="PAYMENT_SUBMITTED"/>
 *     &lt;enumeration value="REPAYING"/>
 *     &lt;enumeration value="OVERDUE"/>
 *     &lt;enumeration value="CLEAR"/>
 *     &lt;enumeration value="REJECTED"/>
 *     &lt;enumeration value="CANCELLED"/>
 *     &lt;enumeration value="WRITE_OFF"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "subLoanStatus")
@XmlEnum
public enum SubLoanStatus {

    DRAFT,
    SURVEYING_NET,
    SURVEYING_PHONE,
    SURVEYING_CALC,
    SURVEYING_SUM,
    APPROVING_1,
    APPROVING_2,
    APPROVING_3,
    APPROVING_4,
    APPROVING_5,
    APPROVING_6,
    APPROVING_7,
    INTERNAL_APPROVED,
    SUBMITTED_TO_BANK,
    CONTRACT_UNSIGNED,
    CONTRACT_GENERATED,
    CONTRACT_SIGNED,
    CONTRACT_CONFIRMED,
    CONTRACT_VOIDED,
    PAYMENT_SUBMITTED,
    REPAYING,
    OVERDUE,
    CLEAR,
    REJECTED,
    CANCELLED,
    WRITE_OFF;

    public String value() {
        return name();
    }

    public static SubLoanStatus fromValue(String v) {
        return valueOf(v);
    }

}
