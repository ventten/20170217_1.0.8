
package com.ljwd.plms.web.wsdl.webservice.service;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for refundRequestApplicationInfoDto complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="refundRequestApplicationInfoDto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *       &lt;/sequence>
 *       &lt;attribute name="applyId" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="contractNo" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="customerName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="loanAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       &lt;attribute name="paymentType" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="siteCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="custAttributionId" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="payDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="isClear" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="isWaiveClear" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="overduePeriodCount" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="requester" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="requestSiteCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "refundRequestApplicationInfoDto")
public class RefundRequestApplicationInfoDto {

    @XmlAttribute(name = "applyId")
    protected Long applyId;
    @XmlAttribute(name = "contractNo")
    protected String contractNo;
    @XmlAttribute(name = "customerName")
    protected String customerName;
    @XmlAttribute(name = "loanAmount")
    protected BigDecimal loanAmount;
    @XmlAttribute(name = "paymentType")
    protected String paymentType;
    @XmlAttribute(name = "siteCode")
    protected String siteCode;
    @XmlAttribute(name = "custAttributionId")
    protected Long custAttributionId;
    @XmlAttribute(name = "payDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar payDate;
    @XmlAttribute(name = "isClear")
    protected Boolean isClear;
    @XmlAttribute(name = "isWaiveClear")
    protected Boolean isWaiveClear;
    @XmlAttribute(name = "overduePeriodCount")
    protected Integer overduePeriodCount;
    @XmlAttribute(name = "requester")
    protected String requester;
    @XmlAttribute(name = "requestSiteCode")
    protected String requestSiteCode;

    /**
     * Gets the value of the applyId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getApplyId() {
        return applyId;
    }

    /**
     * Sets the value of the applyId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setApplyId(Long value) {
        this.applyId = value;
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
     * Gets the value of the loanAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getLoanAmount() {
        return loanAmount;
    }

    /**
     * Sets the value of the loanAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setLoanAmount(BigDecimal value) {
        this.loanAmount = value;
    }

    /**
     * Gets the value of the paymentType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentType() {
        return paymentType;
    }

    /**
     * Sets the value of the paymentType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentType(String value) {
        this.paymentType = value;
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
     * Gets the value of the custAttributionId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCustAttributionId() {
        return custAttributionId;
    }

    /**
     * Sets the value of the custAttributionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCustAttributionId(Long value) {
        this.custAttributionId = value;
    }

    /**
     * Gets the value of the payDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPayDate() {
        return payDate;
    }

    /**
     * Sets the value of the payDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPayDate(XMLGregorianCalendar value) {
        this.payDate = value;
    }

    /**
     * Gets the value of the isClear property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsClear() {
        return isClear;
    }

    /**
     * Sets the value of the isClear property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsClear(Boolean value) {
        this.isClear = value;
    }

    /**
     * Gets the value of the isWaiveClear property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsWaiveClear() {
        return isWaiveClear;
    }

    /**
     * Sets the value of the isWaiveClear property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsWaiveClear(Boolean value) {
        this.isWaiveClear = value;
    }

    /**
     * Gets the value of the overduePeriodCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getOverduePeriodCount() {
        return overduePeriodCount;
    }

    /**
     * Sets the value of the overduePeriodCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setOverduePeriodCount(Integer value) {
        this.overduePeriodCount = value;
    }

    /**
     * Gets the value of the requester property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequester() {
        return requester;
    }

    /**
     * Sets the value of the requester property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequester(String value) {
        this.requester = value;
    }

    /**
     * Gets the value of the requestSiteCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequestSiteCode() {
        return requestSiteCode;
    }

    /**
     * Sets the value of the requestSiteCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequestSiteCode(String value) {
        this.requestSiteCode = value;
    }

}
