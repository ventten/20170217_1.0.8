
package com.ljwd.plms.web.wsdl.webservice.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for handleRefundRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="handleRefundRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="action" type="{http://webservice.loan.mfbms.flinkmf.com/}refundRequestOperation" minOccurs="0"/>
 *         &lt;element name="requestDto" type="{http://webservice.loan.mfbms.flinkmf.com/}refundRequestDto" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "handleRefundRequest", propOrder = {
    "action",
    "requestDto"
})
public class HandleRefundRequest {

    protected RefundRequestOperation action;
    protected RefundRequestDto requestDto;

    /**
     * Gets the value of the action property.
     * 
     * @return
     *     possible object is
     *     {@link RefundRequestOperation }
     *     
     */
    public RefundRequestOperation getAction() {
        return action;
    }

    /**
     * Sets the value of the action property.
     * 
     * @param value
     *     allowed object is
     *     {@link RefundRequestOperation }
     *     
     */
    public void setAction(RefundRequestOperation value) {
        this.action = value;
    }

    /**
     * Gets the value of the requestDto property.
     * 
     * @return
     *     possible object is
     *     {@link RefundRequestDto }
     *     
     */
    public RefundRequestDto getRequestDto() {
        return requestDto;
    }

    /**
     * Sets the value of the requestDto property.
     * 
     * @param value
     *     allowed object is
     *     {@link RefundRequestDto }
     *     
     */
    public void setRequestDto(RefundRequestDto value) {
        this.requestDto = value;
    }

}
