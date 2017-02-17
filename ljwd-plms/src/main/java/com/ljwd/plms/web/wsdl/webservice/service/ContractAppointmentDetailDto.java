
package com.ljwd.plms.web.wsdl.webservice.service;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for contractAppointmentDetailDto complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="contractAppointmentDetailDto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *       &lt;/sequence>
 *       &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="applicationInfoId" use="required" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="siteCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="productId" use="required" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="applicationCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="approvalAmount" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       &lt;attribute name="approvalPeriod" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="loanPurpose" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="address" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="customerName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="age" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="gender" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="marriage" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="idTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="idCardNo" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="birthday" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="birthPlace" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="household" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="education" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="mobile" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="mobile2" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="mobile3" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="mailAddress" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="qqNo" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="appointTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="appointNote" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="appointedBy" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="recordVersion" use="required" type="{http://www.w3.org/2001/XMLSchema}long" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "contractAppointmentDetailDto")
public class ContractAppointmentDetailDto {

    @XmlAttribute(name = "id", required = true)
    protected long id;
    @XmlAttribute(name = "applicationInfoId", required = true)
    protected long applicationInfoId;
    @XmlAttribute(name = "siteCode")
    protected String siteCode;
    @XmlAttribute(name = "productId", required = true)
    protected long productId;
    @XmlAttribute(name = "applicationCode")
    protected String applicationCode;
    @XmlAttribute(name = "approvalAmount", required = true)
    protected BigDecimal approvalAmount;
    @XmlAttribute(name = "approvalPeriod", required = true)
    protected int approvalPeriod;
    @XmlAttribute(name = "loanPurpose")
    protected String loanPurpose;
    @XmlAttribute(name = "address")
    protected String address;
    @XmlAttribute(name = "customerName")
    protected String customerName;
    @XmlAttribute(name = "age")
    protected Integer age;
    @XmlAttribute(name = "gender")
    protected String gender;
    @XmlAttribute(name = "marriage")
    protected String marriage;
    @XmlAttribute(name = "idTypeCode")
    protected String idTypeCode;
    @XmlAttribute(name = "idCardNo")
    protected String idCardNo;
    @XmlAttribute(name = "birthday")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar birthday;
    @XmlAttribute(name = "birthPlace")
    protected String birthPlace;
    @XmlAttribute(name = "household")
    protected String household;
    @XmlAttribute(name = "education")
    protected String education;
    @XmlAttribute(name = "mobile")
    protected String mobile;
    @XmlAttribute(name = "mobile2")
    protected String mobile2;
    @XmlAttribute(name = "mobile3")
    protected String mobile3;
    @XmlAttribute(name = "mailAddress")
    protected String mailAddress;
    @XmlAttribute(name = "qqNo")
    protected String qqNo;
    @XmlAttribute(name = "appointTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar appointTime;
    @XmlAttribute(name = "appointNote")
    protected String appointNote;
    @XmlAttribute(name = "appointedBy")
    protected String appointedBy;
    @XmlAttribute(name = "recordVersion", required = true)
    protected long recordVersion;

    /**
     * Gets the value of the id property.
     * 
     */
    public long getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     */
    public void setId(long value) {
        this.id = value;
    }

    /**
     * Gets the value of the applicationInfoId property.
     * 
     */
    public long getApplicationInfoId() {
        return applicationInfoId;
    }

    /**
     * Sets the value of the applicationInfoId property.
     * 
     */
    public void setApplicationInfoId(long value) {
        this.applicationInfoId = value;
    }

    /**
     * Gets the value of the siteCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSiteCode() {
        return siteCode;
    }

    /**
     * Sets the value of the siteCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSiteCode(String value) {
        this.siteCode = value;
    }

    /**
     * Gets the value of the productId property.
     * 
     */
    public long getProductId() {
        return productId;
    }

    /**
     * Sets the value of the productId property.
     * 
     */
    public void setProductId(long value) {
        this.productId = value;
    }

    /**
     * Gets the value of the applicationCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApplicationCode() {
        return applicationCode;
    }

    /**
     * Sets the value of the applicationCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApplicationCode(String value) {
        this.applicationCode = value;
    }

    /**
     * Gets the value of the approvalAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getApprovalAmount() {
        return approvalAmount;
    }

    /**
     * Sets the value of the approvalAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setApprovalAmount(BigDecimal value) {
        this.approvalAmount = value;
    }

    /**
     * Gets the value of the approvalPeriod property.
     * 
     */
    public int getApprovalPeriod() {
        return approvalPeriod;
    }

    /**
     * Sets the value of the approvalPeriod property.
     * 
     */
    public void setApprovalPeriod(int value) {
        this.approvalPeriod = value;
    }

    /**
     * Gets the value of the loanPurpose property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLoanPurpose() {
        return loanPurpose;
    }

    /**
     * Sets the value of the loanPurpose property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLoanPurpose(String value) {
        this.loanPurpose = value;
    }

    /**
     * Gets the value of the address property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddress() {
        return address;
    }

    /**
     * Sets the value of the address property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddress(String value) {
        this.address = value;
    }

    /**
     * Gets the value of the customerName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerName() {
        return customerName;
    }

    /**
     * Sets the value of the customerName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerName(String value) {
        this.customerName = value;
    }

    /**
     * Gets the value of the age property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAge() {
        return age;
    }

    /**
     * Sets the value of the age property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAge(Integer value) {
        this.age = value;
    }

    /**
     * Gets the value of the gender property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGender() {
        return gender;
    }

    /**
     * Sets the value of the gender property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGender(String value) {
        this.gender = value;
    }

    /**
     * Gets the value of the marriage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMarriage() {
        return marriage;
    }

    /**
     * Sets the value of the marriage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMarriage(String value) {
        this.marriage = value;
    }

    /**
     * Gets the value of the idTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdTypeCode() {
        return idTypeCode;
    }

    /**
     * Sets the value of the idTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdTypeCode(String value) {
        this.idTypeCode = value;
    }

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
     * Gets the value of the birthday property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getBirthday() {
        return birthday;
    }

    /**
     * Sets the value of the birthday property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setBirthday(XMLGregorianCalendar value) {
        this.birthday = value;
    }

    /**
     * Gets the value of the birthPlace property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBirthPlace() {
        return birthPlace;
    }

    /**
     * Sets the value of the birthPlace property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBirthPlace(String value) {
        this.birthPlace = value;
    }

    /**
     * Gets the value of the household property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHousehold() {
        return household;
    }

    /**
     * Sets the value of the household property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHousehold(String value) {
        this.household = value;
    }

    /**
     * Gets the value of the education property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEducation() {
        return education;
    }

    /**
     * Sets the value of the education property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEducation(String value) {
        this.education = value;
    }

    /**
     * Gets the value of the mobile property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMobile() {
        return mobile;
    }

    /**
     * Sets the value of the mobile property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMobile(String value) {
        this.mobile = value;
    }

    /**
     * Gets the value of the mobile2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMobile2() {
        return mobile2;
    }

    /**
     * Sets the value of the mobile2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMobile2(String value) {
        this.mobile2 = value;
    }

    /**
     * Gets the value of the mobile3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMobile3() {
        return mobile3;
    }

    /**
     * Sets the value of the mobile3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMobile3(String value) {
        this.mobile3 = value;
    }

    /**
     * Gets the value of the mailAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMailAddress() {
        return mailAddress;
    }

    /**
     * Sets the value of the mailAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMailAddress(String value) {
        this.mailAddress = value;
    }

    /**
     * Gets the value of the qqNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQqNo() {
        return qqNo;
    }

    /**
     * Sets the value of the qqNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQqNo(String value) {
        this.qqNo = value;
    }

    /**
     * Gets the value of the appointTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getAppointTime() {
        return appointTime;
    }

    /**
     * Sets the value of the appointTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setAppointTime(XMLGregorianCalendar value) {
        this.appointTime = value;
    }

    /**
     * Gets the value of the appointNote property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAppointNote() {
        return appointNote;
    }

    /**
     * Sets the value of the appointNote property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAppointNote(String value) {
        this.appointNote = value;
    }

    /**
     * Gets the value of the appointedBy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAppointedBy() {
        return appointedBy;
    }

    /**
     * Sets the value of the appointedBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAppointedBy(String value) {
        this.appointedBy = value;
    }

    /**
     * Gets the value of the recordVersion property.
     * 
     */
    public long getRecordVersion() {
        return recordVersion;
    }

    /**
     * Sets the value of the recordVersion property.
     * 
     */
    public void setRecordVersion(long value) {
        this.recordVersion = value;
    }

}
