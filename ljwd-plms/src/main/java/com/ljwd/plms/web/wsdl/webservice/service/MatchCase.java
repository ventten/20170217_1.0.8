
package com.ljwd.plms.web.wsdl.webservice.service;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for matchCase.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="matchCase">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="MATCH_CASE"/>
 *     &lt;enumeration value="IGNORE_CASE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "matchCase")
@XmlEnum
public enum MatchCase {

    MATCH_CASE,
    IGNORE_CASE;

    public String value() {
        return name();
    }

    public static MatchCase fromValue(String v) {
        return valueOf(v);
    }

}
