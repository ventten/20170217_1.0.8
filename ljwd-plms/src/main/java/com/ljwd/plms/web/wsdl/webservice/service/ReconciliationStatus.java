
package com.ljwd.plms.web.wsdl.webservice.service;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for reconciliationStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="reconciliationStatus">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="OUTSTANDING"/>
 *     &lt;enumeration value="CORRECT"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "reconciliationStatus")
@XmlEnum
public enum ReconciliationStatus {

    OUTSTANDING,
    CORRECT;

    public String value() {
        return name();
    }

    public static ReconciliationStatus fromValue(String v) {
        return valueOf(v);
    }

}
