
package com.ljwd.plms.web.wsdl.webservice.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for searchAssetMakeInfoParamDto complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="searchAssetMakeInfoParamDto">
 *   &lt;complexContent>
 *     &lt;extension base="{http://webservice.loan.mfbms.flinkmf.com/}baseDataControlDto">
 *       &lt;sequence>
 *       &lt;/sequence>
 *       &lt;attribute name="paymnetType" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="dtePayDateFrom" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="dtePayDateTo" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "searchAssetMakeInfoParamDto")
public class SearchAssetMakeInfoParamDto
    extends BaseDataControlDto
{

    @XmlAttribute(name = "paymnetType")
    protected String paymnetType;
    @XmlAttribute(name = "dtePayDateFrom")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dtePayDateFrom;
    @XmlAttribute(name = "dtePayDateTo")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dtePayDateTo;

    /**
     * Gets the value of the paymnetType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymnetType() {
        return paymnetType;
    }

    /**
     * Sets the value of the paymnetType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymnetType(String value) {
        this.paymnetType = value;
    }

    /**
     * Gets the value of the dtePayDateFrom property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDtePayDateFrom() {
        return dtePayDateFrom;
    }

    /**
     * Sets the value of the dtePayDateFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDtePayDateFrom(XMLGregorianCalendar value) {
        this.dtePayDateFrom = value;
    }

    /**
     * Gets the value of the dtePayDateTo property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDtePayDateTo() {
        return dtePayDateTo;
    }

    /**
     * Sets the value of the dtePayDateTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDtePayDateTo(XMLGregorianCalendar value) {
        this.dtePayDateTo = value;
    }

}
