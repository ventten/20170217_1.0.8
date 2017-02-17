
package com.ljwd.plms.web.wsdl.webservice.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for refundAdvanceReceivedDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="refundAdvanceReceivedDetail">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="advanceReceivedDetailId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="reason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "refundAdvanceReceivedDetail", propOrder = {
    "advanceReceivedDetailId",
    "reason"
})
public class RefundAdvanceReceivedDetail {

    protected long advanceReceivedDetailId;
    protected String reason;

    /**
     * Gets the value of the advanceReceivedDetailId property.
     * 
     */
    public long getAdvanceReceivedDetailId() {
        return advanceReceivedDetailId;
    }

    /**
     * Sets the value of the advanceReceivedDetailId property.
     * 
     */
    public void setAdvanceReceivedDetailId(long value) {
        this.advanceReceivedDetailId = value;
    }

    /**
     * Gets the value of the reason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReason() {
        return reason;
    }

    /**
     * Sets the value of the reason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReason(String value) {
        this.reason = value;
    }

}
