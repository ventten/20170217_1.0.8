
package com.ljwd.plms.web.wsdl.webservice.service;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for offerRequestResultDto complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="offerRequestResultDto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="offerReqDetails" type="{http://webservice.loan.mfbms.flinkmf.com/}offerRequestDetail" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="offerReq" type="{http://webservice.loan.mfbms.flinkmf.com/}offerRequest" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "offerRequestResultDto", propOrder = {
    "offerReqDetails",
    "offerReq"
})
public class OfferRequestResultDto {

    @XmlElement(nillable = true)
    protected List<OfferRequestDetail> offerReqDetails;
    protected OfferRequest offerReq;

    /**
     * Gets the value of the offerReqDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the offerReqDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOfferReqDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OfferRequestDetail }
     * 
     * 
     */
    public List<OfferRequestDetail> getOfferReqDetails() {
        if (offerReqDetails == null) {
            offerReqDetails = new ArrayList<OfferRequestDetail>();
        }
        return this.offerReqDetails;
    }

    /**
     * Gets the value of the offerReq property.
     * 
     * @return
     *     possible object is
     *     {@link OfferRequest }
     *     
     */
    public OfferRequest getOfferReq() {
        return offerReq;
    }

    /**
     * Sets the value of the offerReq property.
     * 
     * @param value
     *     allowed object is
     *     {@link OfferRequest }
     *     
     */
    public void setOfferReq(OfferRequest value) {
        this.offerReq = value;
    }

}
