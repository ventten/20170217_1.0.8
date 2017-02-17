
package com.ljwd.plms.web.wsdl.webservice.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for offerCountParamDto complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="offerCountParamDto">
 *   &lt;complexContent>
 *     &lt;extension base="{http://webservice.loan.mfbms.flinkmf.com/}baseEnquiryParamDto">
 *       &lt;sequence>
 *         &lt;element name="offerDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="offerDateTo" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "offerCountParamDto", propOrder = {
    "offerDate",
    "offerDateTo"
})
public class OfferCountParamDto
    extends BaseEnquiryParamDto
{

    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar offerDate;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar offerDateTo;

    /**
     * Gets the value of the offerDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOfferDate() {
        return offerDate;
    }

    /**
     * Sets the value of the offerDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOfferDate(XMLGregorianCalendar value) {
        this.offerDate = value;
    }

    /**
     * Gets the value of the offerDateTo property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOfferDateTo() {
        return offerDateTo;
    }

    /**
     * Sets the value of the offerDateTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOfferDateTo(XMLGregorianCalendar value) {
        this.offerDateTo = value;
    }

}
