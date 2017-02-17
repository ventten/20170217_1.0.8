
package com.ljwd.plms.web.wsdl.webservice.channelService;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for matchStyle.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="matchStyle">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="EXACT"/>
 *     &lt;enumeration value="ANYWHERE"/>
 *     &lt;enumeration value="START"/>
 *     &lt;enumeration value="END"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "matchStyle")
@XmlEnum
public enum MatchStyle {

    EXACT,
    ANYWHERE,
    START,
    END;

    public String value() {
        return name();
    }

    public static MatchStyle fromValue(String v) {
        return valueOf(v);
    }

}
