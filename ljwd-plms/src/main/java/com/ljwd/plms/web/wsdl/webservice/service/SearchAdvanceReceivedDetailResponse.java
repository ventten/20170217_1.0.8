
package com.ljwd.plms.web.wsdl.webservice.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for searchAdvanceReceivedDetailResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="searchAdvanceReceivedDetailResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="return" type="{http://webservice.loan.mfbms.flinkmf.com/}advanceReceivedDetailEnquiryResultDto" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "searchAdvanceReceivedDetailResponse", propOrder = {
    "_return"
})
public class SearchAdvanceReceivedDetailResponse {

    @XmlElement(name = "return")
    protected AdvanceReceivedDetailEnquiryResultDto _return;

    /**
     * Gets the value of the return property.
     * 
     * @return
     *     possible object is
     *     {@link AdvanceReceivedDetailEnquiryResultDto }
     *     
     */
    public AdvanceReceivedDetailEnquiryResultDto getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdvanceReceivedDetailEnquiryResultDto }
     *     
     */
    public void setReturn(AdvanceReceivedDetailEnquiryResultDto value) {
        this._return = value;
    }

}
