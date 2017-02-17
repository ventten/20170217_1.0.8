
package com.ljwd.plms.web.wsdl.webservice.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for updateDepositDateAfterOfferReply complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="updateDepositDateAfterOfferReply">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="depositeDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="replyBatchCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "updateDepositDateAfterOfferReply", propOrder = {
    "depositeDate",
    "replyBatchCode"
})
public class UpdateDepositDateAfterOfferReply {

    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar depositeDate;
    protected String replyBatchCode;

    /**
     * Gets the value of the depositeDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDepositeDate() {
        return depositeDate;
    }

    /**
     * Sets the value of the depositeDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDepositeDate(XMLGregorianCalendar value) {
        this.depositeDate = value;
    }

    /**
     * Gets the value of the replyBatchCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReplyBatchCode() {
        return replyBatchCode;
    }

    /**
     * Sets the value of the replyBatchCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReplyBatchCode(String value) {
        this.replyBatchCode = value;
    }

}
