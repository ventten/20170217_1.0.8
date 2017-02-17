
package com.ljwd.plms.web.wsdl.webservice.service;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for infoValidityType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="infoValidityType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="TRUE"/>
 *     &lt;enumeration value="COMPLEMENT"/>
 *     &lt;enumeration value="FALSE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "infoValidityType")
@XmlEnum
public enum InfoValidityType {

    TRUE,
    COMPLEMENT,
    FALSE;

    public String value() {
        return name();
    }

    public static InfoValidityType fromValue(String v) {
        return valueOf(v);
    }

}
