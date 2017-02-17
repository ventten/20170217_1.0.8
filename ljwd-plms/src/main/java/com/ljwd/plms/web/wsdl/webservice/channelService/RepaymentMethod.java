
package com.ljwd.plms.web.wsdl.webservice.channelService;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for repaymentMethod.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="repaymentMethod">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="PER_INT_ONE_OFF_PRIN"/>
 *     &lt;enumeration value="PER_MON_INT_ONE_OFF_PRIN"/>
 *     &lt;enumeration value="EQUAL_PRIN_INT"/>
 *     &lt;enumeration value="EQUAL_PRINCIPAL"/>
 *     &lt;enumeration value="ONE_OFF_PRIN_INT"/>
 *     &lt;enumeration value="ONE_OFF_PRIN_INT_BY_DAY"/>
 *     &lt;enumeration value="INT_ONE_OFF_PRIN"/>
 *     &lt;enumeration value="EQUAL_PRIN_EQUAL_INT"/>
 *     &lt;enumeration value="WHOLE_PAYMENT"/>
 *     &lt;enumeration value="MATURE_PAYMENT"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "repaymentMethod")
@XmlEnum
public enum RepaymentMethod {

    PER_INT_ONE_OFF_PRIN,
    PER_MON_INT_ONE_OFF_PRIN,
    EQUAL_PRIN_INT,
    EQUAL_PRINCIPAL,
    ONE_OFF_PRIN_INT,
    ONE_OFF_PRIN_INT_BY_DAY,
    INT_ONE_OFF_PRIN,
    EQUAL_PRIN_EQUAL_INT,
    WHOLE_PAYMENT,
    MATURE_PAYMENT;

    public String value() {
        return name();
    }

    public static RepaymentMethod fromValue(String v) {
        return valueOf(v);
    }

}
