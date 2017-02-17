
package com.ljwd.plms.web.wsdl.webservice.service;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for refundRequestOperation.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="refundRequestOperation">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="SUBMIT"/>
 *     &lt;enumeration value="REVIEW_1"/>
 *     &lt;enumeration value="REVIEW_2"/>
 *     &lt;enumeration value="APPROVE"/>
 *     &lt;enumeration value="PAY_CONFIRME"/>
 *     &lt;enumeration value="REJECT"/>
 *     &lt;enumeration value="DELETE_DRAFT"/>
 *     &lt;enumeration value="UPDATE_PAY_DATE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "refundRequestOperation")
@XmlEnum
public enum RefundRequestOperation {

    SUBMIT,
    REVIEW_1,
    REVIEW_2,
    APPROVE,
    PAY_CONFIRME,
    REJECT,
    DELETE_DRAFT,
    UPDATE_PAY_DATE;

    public String value() {
        return name();
    }

    public static RefundRequestOperation fromValue(String v) {
        return valueOf(v);
    }

}
