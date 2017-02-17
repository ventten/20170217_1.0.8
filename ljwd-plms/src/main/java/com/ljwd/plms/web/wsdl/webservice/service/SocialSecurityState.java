
package com.ljwd.plms.web.wsdl.webservice.service;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for socialSecurityState.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="socialSecurityState">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NORMAL"/>
 *     &lt;enumeration value="NO"/>
 *     &lt;enumeration value="DELAY"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "socialSecurityState")
@XmlEnum
public enum SocialSecurityState {

    NORMAL,
    NO,
    DELAY;

    public String value() {
        return name();
    }

    public static SocialSecurityState fromValue(String v) {
        return valueOf(v);
    }

}
