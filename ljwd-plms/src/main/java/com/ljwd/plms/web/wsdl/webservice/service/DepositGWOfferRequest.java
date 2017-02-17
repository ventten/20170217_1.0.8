
package com.ljwd.plms.web.wsdl.webservice.service;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for depositGWOfferRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="depositGWOfferRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="offerBats" type="{http://webservice.loan.mfbms.flinkmf.com/}offerBatchDto" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "depositGWOfferRequest", propOrder = {
    "offerBats"
})
public class DepositGWOfferRequest {

    protected List<OfferBatchDto> offerBats;

    /**
     * Gets the value of the offerBats property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the offerBats property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOfferBats().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OfferBatchDto }
     * 
     * 
     */
    public List<OfferBatchDto> getOfferBats() {
        if (offerBats == null) {
            offerBats = new ArrayList<OfferBatchDto>();
        }
        return this.offerBats;
    }

}
