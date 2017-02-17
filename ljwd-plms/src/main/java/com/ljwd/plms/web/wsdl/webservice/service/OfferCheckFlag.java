
package com.ljwd.plms.web.wsdl.webservice.service;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for offerCheckFlag.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="offerCheckFlag">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="UNCHECKED"/>
 *     &lt;enumeration value="PASSED"/>
 *     &lt;enumeration value="FAILED"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "offerCheckFlag")
@XmlEnum
public enum OfferCheckFlag {

    UNCHECKED,
    PASSED,
    FAILED;

    public String value() {
        return name();
    }

    public static OfferCheckFlag fromValue(String v) {
        return valueOf(v);
    }

}
