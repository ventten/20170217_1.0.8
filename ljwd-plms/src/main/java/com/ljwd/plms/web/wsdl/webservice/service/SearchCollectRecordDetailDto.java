
package com.ljwd.plms.web.wsdl.webservice.service;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for searchCollectRecordDetailDto complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="searchCollectRecordDetailDto">
 *   &lt;complexContent>
 *     &lt;extension base="{http://webservice.loan.mfbms.flinkmf.com/}baseVersionableCreatorAwareEntityDto">
 *       &lt;sequence>
 *       &lt;/sequence>
 *       &lt;attribute name="collectTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="content" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="contactor" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="telephone" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="collectRecordId" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="applicationId" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="collectMethod" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="repaymentDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="followedBy" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="followerName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="result" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="repaymentAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       &lt;attribute name="relationship" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="status" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="phoneResult" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="contractNo" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="customerName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="abnormityCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="idCardNo" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "searchCollectRecordDetailDto")
public class SearchCollectRecordDetailDto
    extends BaseVersionableCreatorAwareEntityDto
{

    @XmlAttribute(name = "collectTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar collectTime;
    @XmlAttribute(name = "content")
    protected String content;
    @XmlAttribute(name = "contactor")
    protected String contactor;
    @XmlAttribute(name = "telephone")
    protected String telephone;
    @XmlAttribute(name = "collectRecordId")
    protected Long collectRecordId;
    @XmlAttribute(name = "applicationId")
    protected Long applicationId;
    @XmlAttribute(name = "collectMethod")
    protected String collectMethod;
    @XmlAttribute(name = "repaymentDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar repaymentDate;
    @XmlAttribute(name = "followedBy")
    protected String followedBy;
    @XmlAttribute(name = "followerName")
    protected String followerName;
    @XmlAttribute(name = "result")
    protected String result;
    @XmlAttribute(name = "repaymentAmount")
    protected BigDecimal repaymentAmount;
    @XmlAttribute(name = "relationship")
    protected String relationship;
    @XmlAttribute(name = "status")
    protected String status;
    @XmlAttribute(name = "phoneResult")
    protected String phoneResult;
    @XmlAttribute(name = "contractNo")
    protected String contractNo;
    @XmlAttribute(name = "customerName")
    protected String customerName;
    @XmlAttribute(name = "abnormityCode")
    protected String abnormityCode;
    @XmlAttribute(name = "idCardNo")
    protected String idCardNo;

    /**
     * Gets the value of the collectTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCollectTime() {
        return collectTime;
    }

    /**
     * Sets the value of the collectTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCollectTime(XMLGregorianCalendar value) {
        this.collectTime = value;
    }

    /**
     * Gets the value of the content property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContent() {
        return content;
    }

    /**
     * Sets the value of the content property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContent(String value) {
        this.content = value;
    }

    /**
     * Gets the value of the contactor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactor() {
        return contactor;
    }

    /**
     * Sets the value of the contactor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactor(String value) {
        this.contactor = value;
    }

    /**
     * Gets the value of the telephone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTelephone() {
        return telephone;
    }

    /**
     * Sets the value of the telephone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTelephone(String value) {
        this.telephone = value;
    }

    /**
     * Gets the value of the collectRecordId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCollectRecordId() {
        return collectRecordId;
    }

    /**
     * Sets the value of the collectRecordId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCollectRecordId(Long value) {
        this.collectRecordId = value;
    }

    /**
     * Gets the value of the applicationId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getApplicationId() {
        return applicationId;
    }

    /**
     * Sets the value of the applicationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setApplicationId(Long value) {
        this.applicationId = value;
    }

    /**
     * Gets the value of the collectMethod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCollectMethod() {
        return collectMethod;
    }

    /**
     * Sets the value of the collectMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCollectMethod(String value) {
        this.collectMethod = value;
    }

    /**
     * Gets the value of the repaymentDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRepaymentDate() {
        return repaymentDate;
    }

    /**
     * Sets the value of the repaymentDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRepaymentDate(XMLGregorianCalendar value) {
        this.repaymentDate = value;
    }

    /**
     * Gets the value of the followedBy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFollowedBy() {
        return followedBy;
    }

    /**
     * Sets the value of the followedBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFollowedBy(String value) {
        this.followedBy = value;
    }

    /**
     * Gets the value of the followerName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFollowerName() {
        return followerName;
    }

    /**
     * Sets the value of the followerName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFollowerName(String value) {
        this.followerName = value;
    }

    /**
     * Gets the value of the result property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResult() {
        return result;
    }

    /**
     * Sets the value of the result property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResult(String value) {
        this.result = value;
    }

    /**
     * Gets the value of the repaymentAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRepaymentAmount() {
        return repaymentAmount;
    }

    /**
     * Sets the value of the repaymentAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRepaymentAmount(BigDecimal value) {
        this.repaymentAmount = value;
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
     * Gets the value of the phoneResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhoneResult() {
        return phoneResult;
    }

    /**
     * Sets the value of the phoneResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhoneResult(String value) {
        this.phoneResult = value;
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
     * Gets the value of the abnormityCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAbnormityCode() {
        return abnormityCode;
    }

    /**
     * Sets the value of the abnormityCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAbnormityCode(String value) {
        this.abnormityCode = value;
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

}
