
package com.ljwd.plms.web.wsdl.webservice.service;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for offerBatchsResultDto complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="offerBatchsResultDto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="offerBat" type="{http://webservice.loan.mfbms.flinkmf.com/}offerBatchDto" minOccurs="0"/>
 *         &lt;element name="offerBatDetailDtos" type="{http://webservice.loan.mfbms.flinkmf.com/}offerBatchDetailDto" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="offerBatDetails" type="{http://webservice.loan.mfbms.flinkmf.com/}offerBatchDetail" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "offerBatchsResultDto", propOrder = {
    "offerBat",
    "offerBatDetailDtos",
    "offerBatDetails"
})
public class OfferBatchsResultDto {

    protected OfferBatchDto offerBat;
    @XmlElement(nillable = true)
    protected List<OfferBatchDetailDto> offerBatDetailDtos;
    @XmlElement(nillable = true)
    protected List<OfferBatchDetail> offerBatDetails;

    /**
     * Gets the value of the offerBat property.
     * 
     * @return
     *     possible object is
     *     {@link OfferBatchDto }
     *     
     */
    public OfferBatchDto getOfferBat() {
        return offerBat;
    }

    /**
     * Sets the value of the offerBat property.
     * 
     * @param value
     *     allowed object is
     *     {@link OfferBatchDto }
     *     
     */
    public void setOfferBat(OfferBatchDto value) {
        this.offerBat = value;
    }

    /**
     * Gets the value of the offerBatDetailDtos property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the offerBatDetailDtos property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOfferBatDetailDtos().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OfferBatchDetailDto }
     * 
     * 
     */
    public List<OfferBatchDetailDto> getOfferBatDetailDtos() {
        if (offerBatDetailDtos == null) {
            offerBatDetailDtos = new ArrayList<OfferBatchDetailDto>();
        }
        return this.offerBatDetailDtos;
    }

    /**
     * Gets the value of the offerBatDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the offerBatDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOfferBatDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OfferBatchDetail }
     * 
     * 
     */
    public List<OfferBatchDetail> getOfferBatDetails() {
        if (offerBatDetails == null) {
            offerBatDetails = new ArrayList<OfferBatchDetail>();
        }
        return this.offerBatDetails;
    }

}
