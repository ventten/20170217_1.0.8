
package com.ljwd.plms.web.wsdl.webservice.channelService;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for siteCategory.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="siteCategory">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NORMAL"/>
 *     &lt;enumeration value="SECOND"/>
 *     &lt;enumeration value="MICRO"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "siteCategory")
@XmlEnum
public enum SiteCategory {

    NORMAL,
    SECOND,
    MICRO;

    public String value() {
        return name();
    }

    public static SiteCategory fromValue(String v) {
        return valueOf(v);
    }

}
