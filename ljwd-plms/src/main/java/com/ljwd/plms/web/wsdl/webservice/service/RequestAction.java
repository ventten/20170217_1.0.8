
package com.ljwd.plms.web.wsdl.webservice.service;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for requestAction.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="requestAction">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="CREATE"/>
 *     &lt;enumeration value="SUBMIT"/>
 *     &lt;enumeration value="CONFIRM"/>
 *     &lt;enumeration value="RETURN"/>
 *     &lt;enumeration value="REJECT"/>
 *     &lt;enumeration value="AGREE"/>
 *     &lt;enumeration value="CANCEL"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "requestAction")
@XmlEnum
public enum RequestAction {

    CREATE,
    SUBMIT,
    CONFIRM,
    RETURN,
    REJECT,
    AGREE,
    CANCEL;

    public String value() {
        return name();
    }

    public static RequestAction fromValue(String v) {
        return valueOf(v);
    }

}
