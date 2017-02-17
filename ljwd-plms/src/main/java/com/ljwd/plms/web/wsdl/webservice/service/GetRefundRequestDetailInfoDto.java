
package com.ljwd.plms.web.wsdl.webservice.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getRefundRequestDetailInfoDto complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getRefundRequestDetailInfoDto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="refundRequestId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getRefundRequestDetailInfoDto", propOrder = {
    "refundRequestId"
})
public class GetRefundRequestDetailInfoDto {

    protected long refundRequestId;

    /**
     * Gets the value of the refundRequestId property.
     * 
     */
    public long getRefundRequestId() {
        return refundRequestId;
    }

    /**
     * Sets the value of the refundRequestId property.
     * 
     */
    public void setRefundRequestId(long value) {
        this.refundRequestId = value;
    }

}
