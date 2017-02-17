
package com.ljwd.plms.web.wsdl.webservice.service;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for bankJournalCategory.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="bankJournalCategory">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="BANK"/>
 *     &lt;enumeration value="SUSPEND"/>
 *     &lt;enumeration value="CANCEL_POST"/>
 *     &lt;enumeration value="ADV_COLLECT"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "bankJournalCategory")
@XmlEnum
public enum BankJournalCategory {

    BANK,
    SUSPEND,
    CANCEL_POST,
    ADV_COLLECT;

    public String value() {
        return name();
    }

    public static BankJournalCategory fromValue(String v) {
        return valueOf(v);
    }

}
