
package com.ljwd.plms.web.wsdl.webservice.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for uploadOfferReply complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="uploadOfferReply">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="offerRequestFileDto" type="{http://webservice.loan.mfbms.flinkmf.com/}offerRequestFileDto" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "uploadOfferReply", propOrder = {
    "offerRequestFileDto"
})
public class UploadOfferReply {

    protected OfferRequestFileDto offerRequestFileDto;

    /**
     * Gets the value of the offerRequestFileDto property.
     * 
     * @return
     *     possible object is
     *     {@link OfferRequestFileDto }
     *     
     */
    public OfferRequestFileDto getOfferRequestFileDto() {
        return offerRequestFileDto;
    }

    /**
     * Sets the value of the offerRequestFileDto property.
     * 
     * @param value
     *     allowed object is
     *     {@link OfferRequestFileDto }
     *     
     */
    public void setOfferRequestFileDto(OfferRequestFileDto value) {
        this.offerRequestFileDto = value;
    }

}
