
package com.ljwd.plms.web.wsdl.webservice.service;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for vehicleActionType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="vehicleActionType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="CHECK_MORTGAGE"/>
 *     &lt;enumeration value="CHANGE_BENEFICIARY"/>
 *     &lt;enumeration value="GPS"/>
 *     &lt;enumeration value="REVOKE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "vehicleActionType")
@XmlEnum
public enum VehicleActionType {

    CHECK_MORTGAGE,
    CHANGE_BENEFICIARY,
    GPS,
    REVOKE;

    public String value() {
        return name();
    }

    public static VehicleActionType fromValue(String v) {
        return valueOf(v);
    }

}
