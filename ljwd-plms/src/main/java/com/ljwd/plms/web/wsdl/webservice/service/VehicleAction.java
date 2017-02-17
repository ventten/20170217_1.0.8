
package com.ljwd.plms.web.wsdl.webservice.service;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for vehicleAction.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="vehicleAction">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="SUBMIT"/>
 *     &lt;enumeration value="CONFIRM"/>
 *     &lt;enumeration value="RETURN"/>
 *     &lt;enumeration value="REJECT"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "vehicleAction")
@XmlEnum
public enum VehicleAction {

    SUBMIT,
    CONFIRM,
    RETURN,
    REJECT;

    public String value() {
        return name();
    }

    public static VehicleAction fromValue(String v) {
        return valueOf(v);
    }

}
