
package com.ljwd.plms.web.wsdl.webservice.service;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for bankJournalStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="bankJournalStatus">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="UNHANDLED"/>
 *     &lt;enumeration value="ASSIGNED"/>
 *     &lt;enumeration value="CONFIRMED"/>
 *     &lt;enumeration value="POSTED"/>
 *     &lt;enumeration value="ASSIGN_ERROR"/>
 *     &lt;enumeration value="CANCELLED"/>
 *     &lt;enumeration value="RETURNED"/>
 *     &lt;enumeration value="SUSPENDED"/>
 *     &lt;enumeration value="REFUNDED"/>
 *     &lt;enumeration value="REVOKE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "bankJournalStatus")
@XmlEnum
public enum BankJournalStatus {

    UNHANDLED,
    ASSIGNED,
    CONFIRMED,
    POSTED,
    ASSIGN_ERROR,
    CANCELLED,
    RETURNED,
    SUSPENDED,
    REFUNDED,
    REVOKE;

    public String value() {
        return name();
    }

    public static BankJournalStatus fromValue(String v) {
        return valueOf(v);
    }

}
