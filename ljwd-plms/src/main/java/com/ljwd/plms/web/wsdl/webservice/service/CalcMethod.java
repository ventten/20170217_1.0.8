
package com.ljwd.plms.web.wsdl.webservice.service;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for calcMethod.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="calcMethod">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="CALC_PER_PERIOD"/>
 *     &lt;enumeration value="FAIL_COLLECT"/>
 *     &lt;enumeration value="ONE_OFF_BASE_TTL_AMT"/>
 *     &lt;enumeration value="ONE_OFF_BASE_APPROVED_AMT"/>
 *     &lt;enumeration value="ONE_OFF_FIX_AMT"/>
 *     &lt;enumeration value="OVERDUE_INTEREST_BASE_REMIND_PRINCIPAL"/>
 *     &lt;enumeration value="OVERDUE_INTEREST_BASE_LOAN_AMT"/>
 *     &lt;enumeration value="PENALTY"/>
 *     &lt;enumeration value="EXPRESSION"/>
 *     &lt;enumeration value="ONE_OFF_BASE_DAY"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "calcMethod")
@XmlEnum
public enum CalcMethod {

    CALC_PER_PERIOD,
    FAIL_COLLECT,
    ONE_OFF_BASE_TTL_AMT,
    ONE_OFF_BASE_APPROVED_AMT,
    ONE_OFF_FIX_AMT,
    OVERDUE_INTEREST_BASE_REMIND_PRINCIPAL,
    OVERDUE_INTEREST_BASE_LOAN_AMT,
    PENALTY,
    EXPRESSION,
    ONE_OFF_BASE_DAY;

    public String value() {
        return name();
    }

    public static CalcMethod fromValue(String v) {
        return valueOf(v);
    }

}
