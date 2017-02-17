
package com.ljwd.plms.web.wsdl.webservice.service;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for refundRequestStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="refundRequestStatus">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="DRAFT"/>
 *     &lt;enumeration value="SUBMITTED"/>
 *     &lt;enumeration value="REVIEWED_1"/>
 *     &lt;enumeration value="REVIEWED_2"/>
 *     &lt;enumeration value="APPROVED"/>
 *     &lt;enumeration value="PAY_CONFIRMED"/>
 *     &lt;enumeration value="REJECTED"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "refundRequestStatus")
@XmlEnum
public enum RefundRequestStatus {

    DRAFT,
    SUBMITTED,
    REVIEWED_1,
    REVIEWED_2,
    APPROVED,
    PAY_CONFIRMED,
    REJECTED;

    public String value() {
        return name();
    }

    public static RefundRequestStatus fromValue(String v) {
        return valueOf(v);
    }

}
