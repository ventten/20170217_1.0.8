
package com.ljwd.plms.web.wsdl.webservice.service;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for pymentStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="pymentStatus">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="UNPAID"/>
 *     &lt;enumeration value="PAID"/>
 *     &lt;enumeration value="VOIDED"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "pymentStatus")
@XmlEnum
public enum PymentStatus {

    UNPAID,
    PAID,
    VOIDED;

    public String value() {
        return name();
    }

    public static PymentStatus fromValue(String v) {
        return valueOf(v);
    }

}
