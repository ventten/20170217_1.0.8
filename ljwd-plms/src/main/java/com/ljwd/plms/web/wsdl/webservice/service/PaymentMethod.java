
package com.ljwd.plms.web.wsdl.webservice.service;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for paymentMethod.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="paymentMethod">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="CASH"/>
 *     &lt;enumeration value="TRANSFER"/>
 *     &lt;enumeration value="PAY_AGENCY"/>
 *     &lt;enumeration value="COLLECT_AGENCY"/>
 *     &lt;enumeration value="RENEW_LOAN"/>
 *     &lt;enumeration value="OUTSTANDING"/>
 *     &lt;enumeration value="ANY"/>
 *     &lt;enumeration value="PAY"/>
 *     &lt;enumeration value="REFUND"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "paymentMethod")
@XmlEnum
public enum PaymentMethod {

    CASH,
    TRANSFER,
    PAY_AGENCY,
    COLLECT_AGENCY,
    RENEW_LOAN,
    OUTSTANDING,
    ANY,
    PAY,
    REFUND;

    public String value() {
        return name();
    }

    public static PaymentMethod fromValue(String v) {
        return valueOf(v);
    }

}
