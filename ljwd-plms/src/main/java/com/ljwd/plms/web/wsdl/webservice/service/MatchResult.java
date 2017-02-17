
package com.ljwd.plms.web.wsdl.webservice.service;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for matchResult.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="matchResult">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ABNORMAL"/>
 *     &lt;enumeration value="NOT_MATCH"/>
 *     &lt;enumeration value="NORMAL"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "matchResult")
@XmlEnum
public enum MatchResult {

    ABNORMAL,
    NOT_MATCH,
    NORMAL;

    public String value() {
        return name();
    }

    public static MatchResult fromValue(String v) {
        return valueOf(v);
    }

}
