
package com.ljwd.plms.web.wsdl.webservice.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for creditCustomerDto complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="creditCustomerDto">
 *   &lt;complexContent>
 *     &lt;extension base="{http://webservice.loan.mfbms.flinkmf.com/}baseVersionableCreatorAwareEntityDto">
 *       &lt;sequence>
 *       &lt;/sequence>
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="custName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="cardNo" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="custType" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="status" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="addReason" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="delReason" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="inputBy" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="inputTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="voidBy" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="voidTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="registration" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "creditCustomerDto")
public class CreditCustomerDto
    extends BaseVersionableCreatorAwareEntityDto
{

    @XmlAttribute(name = "id")
    protected Long id;
    @XmlAttribute(name = "custName")
    protected String custName;
    @XmlAttribute(name = "cardNo")
    protected String cardNo;
    @XmlAttribute(name = "custType")
    protected String custType;
    @XmlAttribute(name = "status")
    protected String status;
    @XmlAttribute(name = "addReason")
    protected String addReason;
    @XmlAttribute(name = "delReason")
    protected String delReason;
    @XmlAttribute(name = "inputBy")
    protected String inputBy;
    @XmlAttribute(name = "inputTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inputTime;
    @XmlAttribute(name = "voidBy")
    protected String voidBy;
    @XmlAttribute(name = "voidTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar voidTime;
    @XmlAttribute(name = "registration")
    protected String registration;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setId(Long value) {
        this.id = value;
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
     * Gets the value of the cardNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardNo() {
        return cardNo;
    }

    /**
     * Sets the value of the cardNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardNo(String value) {
        this.cardNo = value;
    }

    /**
     * Gets the value of the custType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustType() {
        return custType;
    }

    /**
     * Sets the value of the custType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustType(String value) {
        this.custType = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

    /**
     * Gets the value of the addReason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddReason() {
        return addReason;
    }

    /**
     * Sets the value of the addReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddReason(String value) {
        this.addReason = value;
    }

    /**
     * Gets the value of the delReason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDelReason() {
        return delReason;
    }

    /**
     * Sets the value of the delReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDelReason(String value) {
        this.delReason = value;
    }

    /**
     * Gets the value of the inputBy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInputBy() {
        return inputBy;
    }

    /**
     * Sets the value of the inputBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInputBy(String value) {
        this.inputBy = value;
    }

    /**
     * Gets the value of the inputTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInputTime() {
        return inputTime;
    }

    /**
     * Sets the value of the inputTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInputTime(XMLGregorianCalendar value) {
        this.inputTime = value;
    }

    /**
     * Gets the value of the voidBy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVoidBy() {
        return voidBy;
    }

    /**
     * Sets the value of the voidBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVoidBy(String value) {
        this.voidBy = value;
    }

    /**
     * Gets the value of the voidTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getVoidTime() {
        return voidTime;
    }

    /**
     * Sets the value of the voidTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setVoidTime(XMLGregorianCalendar value) {
        this.voidTime = value;
    }

    /**
     * Gets the value of the registration property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegistration() {
        return registration;
    }

    /**
     * Sets the value of the registration property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegistration(String value) {
        this.registration = value;
    }

}
