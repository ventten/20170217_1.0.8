
package com.ljwd.plms.web.wsdl.webservice.service;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for bankJournalAction.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="bankJournalAction">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="CREATE"/>
 *     &lt;enumeration value="ASSIGN"/>
 *     &lt;enumeration value="CONFIRM"/>
 *     &lt;enumeration value="POST"/>
 *     &lt;enumeration value="ASSIGN_ERROR"/>
 *     &lt;enumeration value="CANCEL"/>
 *     &lt;enumeration value="RETURN"/>
 *     &lt;enumeration value="SUSPEND"/>
 *     &lt;enumeration value="RESUME"/>
 *     &lt;enumeration value="SETTLE"/>
 *     &lt;enumeration value="REFUND"/>
 *     &lt;enumeration value="REVOKE"/>
 *     &lt;enumeration value="WITHDRAW"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "bankJournalAction")
@XmlEnum
public enum BankJournalAction {

    CREATE,
    ASSIGN,
    CONFIRM,
    POST,
    ASSIGN_ERROR,
    CANCEL,
    RETURN,
    SUSPEND,
    RESUME,
    SETTLE,
    REFUND,
    REVOKE,
    WITHDRAW;

    public String value() {
        return name();
    }

    public static BankJournalAction fromValue(String v) {
        return valueOf(v);
    }

}
