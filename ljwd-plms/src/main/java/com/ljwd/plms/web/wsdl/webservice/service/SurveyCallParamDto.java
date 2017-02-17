
package com.ljwd.plms.web.wsdl.webservice.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for surveyCallParamDto complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="surveyCallParamDto">
 *   &lt;complexContent>
 *     &lt;extension base="{http://webservice.loan.mfbms.flinkmf.com/}baseEnquiryParamDto">
 *       &lt;sequence>
 *       &lt;/sequence>
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="loanName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="idCard" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="contractNo" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="type" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="callStart" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="callStart2" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="callDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="phone" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="callBy" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="createdBy" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="depType" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "surveyCallParamDto")
public class SurveyCallParamDto
    extends BaseEnquiryParamDto
{

    @XmlAttribute(name = "id")
    protected String id;
    @XmlAttribute(name = "loanName")
    protected String loanName;
    @XmlAttribute(name = "idCard")
    protected String idCard;
    @XmlAttribute(name = "contractNo")
    protected String contractNo;
    @XmlAttribute(name = "type")
    protected String type;
    @XmlAttribute(name = "callStart")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar callStart;
    @XmlAttribute(name = "callStart2")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar callStart2;
    @XmlAttribute(name = "callDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar callDate;
    @XmlAttribute(name = "phone")
    protected String phone;
    @XmlAttribute(name = "callBy")
    protected String callBy;
    @XmlAttribute(name = "createdBy")
    protected String createdBy;
    @XmlAttribute(name = "depType")
    protected String depType;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the loanName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLoanName() {
        return loanName;
    }

    /**
     * Sets the value of the loanName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLoanName(String value) {
        this.loanName = value;
    }

    /**
     * Gets the value of the idCard property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdCard() {
        return idCard;
    }

    /**
     * Sets the value of the idCard property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdCard(String value) {
        this.idCard = value;
    }

    /**
     * Gets the value of the contractNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContractNo() {
        return contractNo;
    }

    /**
     * Sets the value of the contractNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContractNo(String value) {
        this.contractNo = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * Gets the value of the callStart property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCallStart() {
        return callStart;
    }

    /**
     * Sets the value of the callStart property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCallStart(XMLGregorianCalendar value) {
        this.callStart = value;
    }

    /**
     * Gets the value of the callStart2 property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCallStart2() {
        return callStart2;
    }

    /**
     * Sets the value of the callStart2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCallStart2(XMLGregorianCalendar value) {
        this.callStart2 = value;
    }

    /**
     * Gets the value of the callDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCallDate() {
        return callDate;
    }

    /**
     * Sets the value of the callDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCallDate(XMLGregorianCalendar value) {
        this.callDate = value;
    }

    /**
     * Gets the value of the phone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhone() {
        return phone;
    }

    /**
     * Sets the value of the phone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhone(String value) {
        this.phone = value;
    }

    /**
     * Gets the value of the callBy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCallBy() {
        return callBy;
    }

    /**
     * Sets the value of the callBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCallBy(String value) {
        this.callBy = value;
    }

    /**
     * Gets the value of the createdBy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreatedBy() {
        return createdBy;
    }

    /**
     * Sets the value of the createdBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreatedBy(String value) {
        this.createdBy = value;
    }

    /**
     * Gets the value of the depType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDepType() {
        return depType;
    }

    /**
     * Sets the value of the depType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDepType(String value) {
        this.depType = value;
    }

}
