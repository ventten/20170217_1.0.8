
package com.ljwd.plms.web.wsdl.webservice.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for validationGWOfferRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="validationGWOfferRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="offerBatDetails" type="{http://webservice.loan.mfbms.flinkmf.com/}offerBatchDetailResultDto" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "validationGWOfferRequest", propOrder = {
    "offerBatDetails"
})
public class ValidationGWOfferRequest {

    protected OfferBatchDetailResultDto offerBatDetails;

    /**
     * Gets the value of the offerBatDetails property.
     * 
     * @return
     *     possible object is
     *     {@link OfferBatchDetailResultDto }
     *     
     */
    public OfferBatchDetailResultDto getOfferBatDetails() {
        return offerBatDetails;
    }

    /**
     * Sets the value of the offerBatDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link OfferBatchDetailResultDto }
     *     
     */
    public void setOfferBatDetails(OfferBatchDetailResultDto value) {
        this.offerBatDetails = value;
    }

}
