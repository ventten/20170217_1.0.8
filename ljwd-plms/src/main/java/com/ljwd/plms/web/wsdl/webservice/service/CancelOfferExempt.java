
package com.ljwd.plms.web.wsdl.webservice.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for cancelOfferExempt complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="cancelOfferExempt">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="offerExemptDto" type="{http://webservice.loan.mfbms.flinkmf.com/}offerExemptDto" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "cancelOfferExempt", propOrder = {
    "offerExemptDto"
})
public class CancelOfferExempt {

    protected OfferExemptDto offerExemptDto;

    /**
     * Gets the value of the offerExemptDto property.
     * 
     * @return
     *     possible object is
     *     {@link OfferExemptDto }
     *     
     */
    public OfferExemptDto getOfferExemptDto() {
        return offerExemptDto;
    }

    /**
     * Sets the value of the offerExemptDto property.
     * 
     * @param value
     *     allowed object is
     *     {@link OfferExemptDto }
     *     
     */
    public void setOfferExemptDto(OfferExemptDto value) {
        this.offerExemptDto = value;
    }

}
