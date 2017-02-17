
package com.ljwd.plms.web.wsdl.webservice.service;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for vehiclePurposeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="vehiclePurposeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="OPERATION"/>
 *     &lt;enumeration value="NON_OPERATION"/>
 *     &lt;enumeration value="OTHER"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "vehiclePurposeType")
@XmlEnum
public enum VehiclePurposeType {

    OPERATION,
    NON_OPERATION,
    OTHER;

    public String value() {
        return name();
    }

    public static VehiclePurposeType fromValue(String v) {
        return valueOf(v);
    }

}
