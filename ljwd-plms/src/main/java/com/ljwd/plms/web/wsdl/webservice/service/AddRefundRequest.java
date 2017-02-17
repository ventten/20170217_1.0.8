
package com.ljwd.plms.web.wsdl.webservice.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for addRefundRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="addRefundRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="refundReq" type="{http://webservice.loan.mfbms.flinkmf.com/}refundRequestSearchDto" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "addRefundRequest", propOrder = {
    "refundReq"
})
public class AddRefundRequest {

    protected RefundRequestSearchDto refundReq;

    /**
     * Gets the value of the refundReq property.
     * 
     * @return
     *     possible object is
     *     {@link RefundRequestSearchDto }
     *     
     */
    public RefundRequestSearchDto getRefundReq() {
        return refundReq;
    }

    /**
     * Sets the value of the refundReq property.
     * 
     * @param value
     *     allowed object is
     *     {@link RefundRequestSearchDto }
     *     
     */
    public void setRefundReq(RefundRequestSearchDto value) {
        this.refundReq = value;
    }

}
