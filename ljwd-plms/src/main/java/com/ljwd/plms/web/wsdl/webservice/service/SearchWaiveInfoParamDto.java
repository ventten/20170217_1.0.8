
package com.ljwd.plms.web.wsdl.webservice.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for searchWaiveInfoParamDto complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="searchWaiveInfoParamDto">
 *   &lt;complexContent>
 *     &lt;extension base="{http://webservice.loan.mfbms.flinkmf.com/}baseEnquiryParamDto">
 *       &lt;sequence>
 *       &lt;/sequence>
 *       &lt;attribute name="contractno" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="custname" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="idcardno" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="waiveDateFrom" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="waiveDateTo" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="userid" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "searchWaiveInfoParamDto")
public class SearchWaiveInfoParamDto
    extends BaseEnquiryParamDto
{

    @XmlAttribute(name = "contractno")
    protected String contractno;
    @XmlAttribute(name = "custname")
    protected String custname;
    @XmlAttribute(name = "idcardno")
    protected String idcardno;
    @XmlAttribute(name = "waiveDateFrom")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar waiveDateFrom;
    @XmlAttribute(name = "waiveDateTo")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar waiveDateTo;
    @XmlAttribute(name = "userid")
    protected String userid;

    /**
     * Gets the value of the contractno property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContractno() {
        return contractno;
    }

    /**
     * Sets the value of the contractno property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContractno(String value) {
        this.contractno = value;
    }

    /**
     * Gets the value of the custname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustname() {
        return custname;
    }

    /**
     * Sets the value of the custname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustname(String value) {
        this.custname = value;
    }

    /**
     * Gets the value of the idcardno property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdcardno() {
        return idcardno;
    }

    /**
     * Sets the value of the idcardno property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdcardno(String value) {
        this.idcardno = value;
    }

    /**
     * Gets the value of the waiveDateFrom property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getWaiveDateFrom() {
        return waiveDateFrom;
    }

    /**
     * Sets the value of the waiveDateFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setWaiveDateFrom(XMLGregorianCalendar value) {
        this.waiveDateFrom = value;
    }

    /**
     * Gets the value of the waiveDateTo property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getWaiveDateTo() {
        return waiveDateTo;
    }

    /**
     * Sets the value of the waiveDateTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setWaiveDateTo(XMLGregorianCalendar value) {
        this.waiveDateTo = value;
    }

    /**
     * Gets the value of the userid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserid() {
        return userid;
    }

    /**
     * Sets the value of the userid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserid(String value) {
        this.userid = value;
    }

}
