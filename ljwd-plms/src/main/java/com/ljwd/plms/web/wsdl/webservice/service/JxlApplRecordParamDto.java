
package com.ljwd.plms.web.wsdl.webservice.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for jxlApplRecordParamDto complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="jxlApplRecordParamDto">
 *   &lt;complexContent>
 *     &lt;extension base="{http://webservice.loan.mfbms.flinkmf.com/}baseDataControlDto">
 *       &lt;sequence>
 *       &lt;/sequence>
 *       &lt;attribute name="idCardNo" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="applCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="custName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="applDateFrom" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="applDateTo" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "jxlApplRecordParamDto")
public class JxlApplRecordParamDto
    extends BaseDataControlDto
{

    @XmlAttribute(name = "idCardNo")
    protected String idCardNo;
    @XmlAttribute(name = "applCode")
    protected String applCode;
    @XmlAttribute(name = "custName")
    protected String custName;
    @XmlAttribute(name = "applDateFrom")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar applDateFrom;
    @XmlAttribute(name = "applDateTo")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar applDateTo;

    /**
     * Gets the value of the idCardNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdCardNo() {
        return idCardNo;
    }

    /**
     * Sets the value of the idCardNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdCardNo(String value) {
        this.idCardNo = value;
    }

    /**
     * Gets the value of the applCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApplCode() {
        return applCode;
    }

    /**
     * Sets the value of the applCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApplCode(String value) {
        this.applCode = value;
    }

    /**
     * Gets the value of the custName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustName() {
        return custName;
    }

    /**
     * Sets the value of the custName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustName(String value) {
        this.custName = value;
    }

    /**
     * Gets the value of the applDateFrom property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getApplDateFrom() {
        return applDateFrom;
    }

    /**
     * Sets the value of the applDateFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setApplDateFrom(XMLGregorianCalendar value) {
        this.applDateFrom = value;
    }

    /**
     * Gets the value of the applDateTo property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getApplDateTo() {
        return applDateTo;
    }

    /**
     * Sets the value of the applDateTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setApplDateTo(XMLGregorianCalendar value) {
        this.applDateTo = value;
    }

}
