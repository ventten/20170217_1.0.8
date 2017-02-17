
package com.ljwd.plms.web.wsdl.webservice.service;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for vehicleOwnerType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="vehicleOwnerType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="HUMAN"/>
 *     &lt;enumeration value="NON_HUMAN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "vehicleOwnerType")
@XmlEnum
public enum VehicleOwnerType {

    HUMAN,
    NON_HUMAN;

    public String value() {
        return name();
    }

    public static VehicleOwnerType fromValue(String v) {
        return valueOf(v);
    }

}
