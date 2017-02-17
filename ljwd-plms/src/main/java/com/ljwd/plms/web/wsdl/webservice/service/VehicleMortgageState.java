
package com.ljwd.plms.web.wsdl.webservice.service;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for vehicleMortgageState.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="vehicleMortgageState">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NON_MORTGAGED"/>
 *     &lt;enumeration value="MORTGAGED"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "vehicleMortgageState")
@XmlEnum
public enum VehicleMortgageState {

    NON_MORTGAGED,
    MORTGAGED;

    public String value() {
        return name();
    }

    public static VehicleMortgageState fromValue(String v) {
        return valueOf(v);
    }

}
