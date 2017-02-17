
package com.ljwd.plms.web.wsdl.webservice.service;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for vehicleCheckStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="vehicleCheckStatus">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="UNHANDLED"/>
 *     &lt;enumeration value="CHECK_MORTGAGE_SUBMITTED"/>
 *     &lt;enumeration value="CHANGE_BENEFICIARY_PENDING"/>
 *     &lt;enumeration value="CHANGE_BENEFICIARY_SUBMITTED"/>
 *     &lt;enumeration value="GPS_PENDING"/>
 *     &lt;enumeration value="AGREED"/>
 *     &lt;enumeration value="REJECTED"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "vehicleCheckStatus")
@XmlEnum
public enum VehicleCheckStatus {

    UNHANDLED,
    CHECK_MORTGAGE_SUBMITTED,
    CHANGE_BENEFICIARY_PENDING,
    CHANGE_BENEFICIARY_SUBMITTED,
    GPS_PENDING,
    AGREED,
    REJECTED;

    public String value() {
        return name();
    }

    public static VehicleCheckStatus fromValue(String v) {
        return valueOf(v);
    }

}
