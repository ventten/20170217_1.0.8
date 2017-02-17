
package com.ljwd.plms.web.wsdl.webservice.annexService;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for sendStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="sendStatus">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="PENDING"/>
 *     &lt;enumeration value="SENT_FAILURE"/>
 *     &lt;enumeration value="SENT_SUCCESS"/>
 *     &lt;enumeration value="RETURN_ERROR"/>
 *     &lt;enumeration value="FINISHED"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "sendStatus")
@XmlEnum
public enum SendStatus {

    PENDING,
    SENT_FAILURE,
    SENT_SUCCESS,
    RETURN_ERROR,
    FINISHED;

    public String value() {
        return name();
    }

    public static SendStatus fromValue(String v) {
        return valueOf(v);
    }

}
