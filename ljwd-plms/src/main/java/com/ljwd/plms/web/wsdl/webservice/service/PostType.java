
package com.ljwd.plms.web.wsdl.webservice.service;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for postType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="postType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NORMAL"/>
 *     &lt;enumeration value="SYS_CANCEL_POST"/>
 *     &lt;enumeration value="USER_CANCEL_POST"/>
 *     &lt;enumeration value="SUSPEND"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "postType")
@XmlEnum
public enum PostType {

    NORMAL,
    SYS_CANCEL_POST,
    USER_CANCEL_POST,
    SUSPEND;

    public String value() {
        return name();
    }

    public static PostType fromValue(String v) {
        return valueOf(v);
    }

}
