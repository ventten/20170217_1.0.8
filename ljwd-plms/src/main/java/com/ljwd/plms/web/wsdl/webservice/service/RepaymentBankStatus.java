
package com.ljwd.plms.web.wsdl.webservice.service;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for repaymentBankStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="repaymentBankStatus">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="UNPAID"/>
 *     &lt;enumeration value="REPAID"/>
 *     &lt;enumeration value="REDEEMED"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "repaymentBankStatus")
@XmlEnum
public enum RepaymentBankStatus {

    UNPAID,
    REPAID,
    REDEEMED;

    public String value() {
        return name();
    }

    public static RepaymentBankStatus fromValue(String v) {
        return valueOf(v);
    }

}
