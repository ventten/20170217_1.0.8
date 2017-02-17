
package com.ljwd.plms.web.wsdl.webservice.service;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for requestActionType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="requestActionType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="CREATE"/>
 *     &lt;enumeration value="SUBMIT"/>
 *     &lt;enumeration value="REVIEW_1"/>
 *     &lt;enumeration value="REVIEW_2"/>
 *     &lt;enumeration value="APPROVE"/>
 *     &lt;enumeration value="PAY_CONFIRM"/>
 *     &lt;enumeration value="CONFIRM"/>
 *     &lt;enumeration value="COMPLETE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "requestActionType")
@XmlEnum
public enum RequestActionType {

    CREATE,
    SUBMIT,
    REVIEW_1,
    REVIEW_2,
    APPROVE,
    PAY_CONFIRM,
    CONFIRM,
    COMPLETE;

    public String value() {
        return name();
    }

    public static RequestActionType fromValue(String v) {
        return valueOf(v);
    }

}
