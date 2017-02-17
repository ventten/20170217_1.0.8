
package com.ljwd.plms.web.wsdl.webservice.service;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for approvalStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="approvalStatus">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="DRAFT"/>
 *     &lt;enumeration value="SUBMITTED"/>
 *     &lt;enumeration value="REJECTED"/>
 *     &lt;enumeration value="APPROVED"/>
 *     &lt;enumeration value="ENDED"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "approvalStatus")
@XmlEnum
public enum ApprovalStatus {

    DRAFT,
    SUBMITTED,
    REJECTED,
    APPROVED,
    ENDED;

    public String value() {
        return name();
    }

    public static ApprovalStatus fromValue(String v) {
        return valueOf(v);
    }

}
