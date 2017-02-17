
package com.ljwd.plms.web.wsdl.webservice.annexService;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for offerType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="offerType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="KFT_T1"/>
 *     &lt;enumeration value="KFT_T0"/>
 *     &lt;enumeration value="TLT"/>
 *     &lt;enumeration value="ADV_COLLECT"/>
 *     &lt;enumeration value="KFT_T0_GW"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "offerType")
@XmlEnum
public enum OfferType {

    @XmlEnumValue("KFT_T1")
    KFT_T_1("KFT_T1"),
    @XmlEnumValue("KFT_T0")
    KFT_T_0("KFT_T0"),
    TLT("TLT"),
    ADV_COLLECT("ADV_COLLECT"),
    @XmlEnumValue("KFT_T0_GW")
    KFT_T_0_GW("KFT_T0_GW");
    private final String value;

    OfferType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static OfferType fromValue(String v) {
        for (OfferType c: OfferType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
