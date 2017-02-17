
package com.ljwd.plms.web.wsdl.webservice.service;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for taskResult.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="taskResult">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="UNKNOWN"/>
 *     &lt;enumeration value="AGREE"/>
 *     &lt;enumeration value="REJECT"/>
 *     &lt;enumeration value="BACK"/>
 *     &lt;enumeration value="CANCEL"/>
 *     &lt;enumeration value="VOID"/>
 *     &lt;enumeration value="REVOKE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "taskResult")
@XmlEnum
public enum TaskResult {

    UNKNOWN,
    AGREE,
    REJECT,
    BACK,
    CANCEL,
    VOID,
    REVOKE;

    public String value() {
        return name();
    }

    public static TaskResult fromValue(String v) {
        return valueOf(v);
    }

}
