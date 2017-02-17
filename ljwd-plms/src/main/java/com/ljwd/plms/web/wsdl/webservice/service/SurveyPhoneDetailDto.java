
package com.ljwd.plms.web.wsdl.webservice.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for surveyPhoneDetailDto complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="surveyPhoneDetailDto">
 *   &lt;complexContent>
 *     &lt;extension base="{http://webservice.loan.mfbms.flinkmf.com/}baseVersionableCreatorAwareEntityDto">
 *       &lt;sequence>
 *       &lt;/sequence>
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="phoneType" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="personName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="phone" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="extension" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="publicOrganization" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="isCheck" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="checkTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="remark" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="relationship" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="checkResult" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="takePhone" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="isAddData" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "surveyPhoneDetailDto")
public class SurveyPhoneDetailDto
    extends BaseVersionableCreatorAwareEntityDto
{

    @XmlAttribute(name = "id")
    protected Long id;
    @XmlAttribute(name = "phoneType")
    protected String phoneType;
    @XmlAttribute(name = "personName")
    protected String personName;
    @XmlAttribute(name = "phone")
    protected String phone;
    @XmlAttribute(name = "extension")
    protected String extension;
    @XmlAttribute(name = "publicOrganization")
    protected String publicOrganization;
    @XmlAttribute(name = "isCheck")
    protected Boolean isCheck;
    @XmlAttribute(name = "checkTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar checkTime;
    @XmlAttribute(name = "remark")
    protected String remark;
    @XmlAttribute(name = "relationship")
    protected String relationship;
    @XmlAttribute(name = "checkResult")
    protected String checkResult;
    @XmlAttribute(name = "takePhone")
    protected String takePhone;
    @XmlAttribute(name = "isAddData")
    protected Boolean isAddData;

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
     * Gets the value of the phoneType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhoneType() {
        return phoneType;
    }

    /**
     * Sets the value of the phoneType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhoneType(String value) {
        this.phoneType = value;
    }

    /**
     * Gets the value of the personName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersonName() {
        return personName;
    }

    /**
     * Sets the value of the personName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersonName(String value) {
        this.personName = value;
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
     * Gets the value of the extension property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExtension() {
        return extension;
    }

    /**
     * Sets the value of the extension property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtension(String value) {
        this.extension = value;
    }

    /**
     * Gets the value of the publicOrganization property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPublicOrganization() {
        return publicOrganization;
    }

    /**
     * Sets the value of the publicOrganization property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPublicOrganization(String value) {
        this.publicOrganization = value;
    }

    /**
     * Gets the value of the isCheck property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsCheck() {
        return isCheck;
    }

    /**
     * Sets the value of the isCheck property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsCheck(Boolean value) {
        this.isCheck = value;
    }

    /**
     * Gets the value of the checkTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCheckTime() {
        return checkTime;
    }

    /**
     * Sets the value of the checkTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCheckTime(XMLGregorianCalendar value) {
        this.checkTime = value;
    }

    /**
     * Gets the value of the remark property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRemark() {
        return remark;
    }

    /**
     * Sets the value of the remark property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRemark(String value) {
        this.remark = value;
    }

    /**
     * Gets the value of the relationship property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRelationship() {
        return relationship;
    }

    /**
     * Sets the value of the relationship property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRelationship(String value) {
        this.relationship = value;
    }

    /**
     * Gets the value of the checkResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCheckResult() {
        return checkResult;
    }

    /**
     * Sets the value of the checkResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCheckResult(String value) {
        this.checkResult = value;
    }

    /**
     * Gets the value of the takePhone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTakePhone() {
        return takePhone;
    }

    /**
     * Sets the value of the takePhone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTakePhone(String value) {
        this.takePhone = value;
    }

    /**
     * Gets the value of the isAddData property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsAddData() {
        return isAddData;
    }

    /**
     * Sets the value of the isAddData property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsAddData(Boolean value) {
        this.isAddData = value;
    }

}
