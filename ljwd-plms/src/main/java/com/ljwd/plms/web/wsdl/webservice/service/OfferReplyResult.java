
package com.ljwd.plms.web.wsdl.webservice.service;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for offerReplyResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="offerReplyResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="offReply" type="{http://webservice.loan.mfbms.flinkmf.com/}offerReply" minOccurs="0"/>
 *         &lt;element name="offReplyDetails" type="{http://webservice.loan.mfbms.flinkmf.com/}offerReplyDetail" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "offerReplyResult", propOrder = {
    "offReply",
    "offReplyDetails"
})
public class OfferReplyResult {

    protected OfferReply offReply;
    @XmlElement(nillable = true)
    protected List<OfferReplyDetail> offReplyDetails;

    /**
     * Gets the value of the offReply property.
     * 
     * @return
     *     possible object is
     *     {@link OfferReply }
     *     
     */
    public OfferReply getOffReply() {
        return offReply;
    }

    /**
     * Sets the value of the offReply property.
     * 
     * @param value
     *     allowed object is
     *     {@link OfferReply }
     *     
     */
    public void setOffReply(OfferReply value) {
        this.offReply = value;
    }

    /**
     * Gets the value of the offReplyDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the offReplyDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOffReplyDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OfferReplyDetail }
     * 
     * 
     */
    public List<OfferReplyDetail> getOffReplyDetails() {
        if (offReplyDetails == null) {
            offReplyDetails = new ArrayList<OfferReplyDetail>();
        }
        return this.offReplyDetails;
    }

}
