
package com.ljwd.plms.web.wsdl.webservice.service;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for offerFileType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="offerFileType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="REQ_SUM"/>
 *     &lt;enumeration value="REQ_DTL"/>
 *     &lt;enumeration value="REPLY_SUM"/>
 *     &lt;enumeration value="REPLY_DTL"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "offerFileType")
@XmlEnum
public enum OfferFileType {

    REQ_SUM,
    REQ_DTL,
    REPLY_SUM,
    REPLY_DTL;

    public String value() {
        return name();
    }

    public static OfferFileType fromValue(String v) {
        return valueOf(v);
    }

}
