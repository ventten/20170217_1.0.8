
package com.ljwd.plms.web.wsdl.webservice.service;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for offerBatchStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="offerBatchStatus">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="INIT"/>
 *     &lt;enumeration value="REQ_PASSED"/>
 *     &lt;enumeration value="REQ_FAILED"/>
 *     &lt;enumeration value="REQ_SAVED"/>
 *     &lt;enumeration value="REQ_GEN"/>
 *     &lt;enumeration value="REQ_CONFIRMED"/>
 *     &lt;enumeration value="REPLY_SAVED"/>
 *     &lt;enumeration value="REPLY_PASSED"/>
 *     &lt;enumeration value="REPLY_FAILED"/>
 *     &lt;enumeration value="REPLY_CONFIRMED"/>
 *     &lt;enumeration value="COLLECT_FAILED"/>
 *     &lt;enumeration value="SEND_FAILED"/>
 *     &lt;enumeration value="COLLECT_SUCCESS"/>
 *     &lt;enumeration value="POSTED"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "offerBatchStatus")
@XmlEnum
public enum OfferBatchStatus {

    INIT,
    REQ_PASSED,
    REQ_FAILED,
    REQ_SAVED,
    REQ_GEN,
    REQ_CONFIRMED,
    REPLY_SAVED,
    REPLY_PASSED,
    REPLY_FAILED,
    REPLY_CONFIRMED,
    COLLECT_FAILED,
    SEND_FAILED,
    COLLECT_SUCCESS,
    POSTED;

    public String value() {
        return name();
    }

    public static OfferBatchStatus fromValue(String v) {
        return valueOf(v);
    }

}
