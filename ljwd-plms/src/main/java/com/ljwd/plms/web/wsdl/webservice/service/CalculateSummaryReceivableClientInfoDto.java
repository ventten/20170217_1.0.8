
package com.ljwd.plms.web.wsdl.webservice.service;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for calculateSummaryReceivableClientInfoDto complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="calculateSummaryReceivableClientInfoDto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *       &lt;/sequence>
 *       &lt;attribute name="applicationId" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="paymentId" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="contractNo" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="loanAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       &lt;attribute name="loanPeriod" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="payDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="paidPeriodNumber" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="firstPeriodReceivable" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       &lt;attribute name="secondPeriodReceivable" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       &lt;attribute name="remainingPrincipal" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       &lt;attribute name="collectBank" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="collectBankNo" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="collectBank2" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="collectBankNo2" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="collectBank3" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="collectBankNo3" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="seqNum" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="outsourceCompany" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="outSourceDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="receivableSumaryAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       &lt;attribute name="overdueDays" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="paymentType" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="collector" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "calculateSummaryReceivableClientInfoDto")
public class CalculateSummaryReceivableClientInfoDto {

    @XmlAttribute(name = "applicationId")
    protected Long applicationId;
    @XmlAttribute(name = "paymentId")
    protected Long paymentId;
    @XmlAttribute(name = "contractNo")
    protected String contractNo;
    @XmlAttribute(name = "loanAmount")
    protected BigDecimal loanAmount;
    @XmlAttribute(name = "loanPeriod")
    protected Integer loanPeriod;
    @XmlAttribute(name = "payDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar payDate;
    @XmlAttribute(name = "paidPeriodNumber")
    protected Integer paidPeriodNumber;
    @XmlAttribute(name = "firstPeriodReceivable")
    protected BigDecimal firstPeriodReceivable;
    @XmlAttribute(name = "secondPeriodReceivable")
    protected BigDecimal secondPeriodReceivable;
    @XmlAttribute(name = "remainingPrincipal")
    protected BigDecimal remainingPrincipal;
    @XmlAttribute(name = "collectBank")
    protected String collectBank;
    @XmlAttribute(name = "collectBankNo")
    protected String collectBankNo;
    @XmlAttribute(name = "collectBank2")
    protected String collectBank2;
    @XmlAttribute(name = "collectBankNo2")
    protected String collectBankNo2;
    @XmlAttribute(name = "collectBank3")
    protected String collectBank3;
    @XmlAttribute(name = "collectBankNo3")
    protected String collectBankNo3;
    @XmlAttribute(name = "seqNum")
    protected Integer seqNum;
    @XmlAttribute(name = "outsourceCompany")
    protected String outsourceCompany;
    @XmlAttribute(name = "outSourceDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outSourceDate;
    @XmlAttribute(name = "receivableSumaryAmount")
    protected BigDecimal receivableSumaryAmount;
    @XmlAttribute(name = "overdueDays")
    protected Integer overdueDays;
    @XmlAttribute(name = "paymentType")
    protected String paymentType;
    @XmlAttribute(name = "collector")
    protected String collector;

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
     * Gets the value of the paymentId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPaymentId() {
        return paymentId;
    }

    /**
     * Sets the value of the paymentId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPaymentId(Long value) {
        this.paymentId = value;
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
     * Gets the value of the loanPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getLoanPeriod() {
        return loanPeriod;
    }

    /**
     * Sets the value of the loanPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setLoanPeriod(Integer value) {
        this.loanPeriod = value;
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
     * Gets the value of the paidPeriodNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPaidPeriodNumber() {
        return paidPeriodNumber;
    }

    /**
     * Sets the value of the paidPeriodNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPaidPeriodNumber(Integer value) {
        this.paidPeriodNumber = value;
    }

    /**
     * Gets the value of the firstPeriodReceivable property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getFirstPeriodReceivable() {
        return firstPeriodReceivable;
    }

    /**
     * Sets the value of the firstPeriodReceivable property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setFirstPeriodReceivable(BigDecimal value) {
        this.firstPeriodReceivable = value;
    }

    /**
     * Gets the value of the secondPeriodReceivable property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSecondPeriodReceivable() {
        return secondPeriodReceivable;
    }

    /**
     * Sets the value of the secondPeriodReceivable property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSecondPeriodReceivable(BigDecimal value) {
        this.secondPeriodReceivable = value;
    }

    /**
     * Gets the value of the remainingPrincipal property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRemainingPrincipal() {
        return remainingPrincipal;
    }

    /**
     * Sets the value of the remainingPrincipal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRemainingPrincipal(BigDecimal value) {
        this.remainingPrincipal = value;
    }

    /**
     * Gets the value of the collectBank property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCollectBank() {
        return collectBank;
    }

    /**
     * Sets the value of the collectBank property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCollectBank(String value) {
        this.collectBank = value;
    }

    /**
     * Gets the value of the collectBankNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCollectBankNo() {
        return collectBankNo;
    }

    /**
     * Sets the value of the collectBankNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCollectBankNo(String value) {
        this.collectBankNo = value;
    }

    /**
     * Gets the value of the collectBank2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCollectBank2() {
        return collectBank2;
    }

    /**
     * Sets the value of the collectBank2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCollectBank2(String value) {
        this.collectBank2 = value;
    }

    /**
     * Gets the value of the collectBankNo2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCollectBankNo2() {
        return collectBankNo2;
    }

    /**
     * Sets the value of the collectBankNo2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCollectBankNo2(String value) {
        this.collectBankNo2 = value;
    }

    /**
     * Gets the value of the collectBank3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCollectBank3() {
        return collectBank3;
    }

    /**
     * Sets the value of the collectBank3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCollectBank3(String value) {
        this.collectBank3 = value;
    }

    /**
     * Gets the value of the collectBankNo3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCollectBankNo3() {
        return collectBankNo3;
    }

    /**
     * Sets the value of the collectBankNo3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCollectBankNo3(String value) {
        this.collectBankNo3 = value;
    }

    /**
     * Gets the value of the seqNum property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSeqNum() {
        return seqNum;
    }

    /**
     * Sets the value of the seqNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSeqNum(Integer value) {
        this.seqNum = value;
    }

    /**
     * Gets the value of the outsourceCompany property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutsourceCompany() {
        return outsourceCompany;
    }

    /**
     * Sets the value of the outsourceCompany property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutsourceCompany(String value) {
        this.outsourceCompany = value;
    }

    /**
     * Gets the value of the outSourceDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutSourceDate() {
        return outSourceDate;
    }

    /**
     * Sets the value of the outSourceDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutSourceDate(XMLGregorianCalendar value) {
        this.outSourceDate = value;
    }

    /**
     * Gets the value of the receivableSumaryAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getReceivableSumaryAmount() {
        return receivableSumaryAmount;
    }

    /**
     * Sets the value of the receivableSumaryAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setReceivableSumaryAmount(BigDecimal value) {
        this.receivableSumaryAmount = value;
    }

    /**
     * Gets the value of the overdueDays property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getOverdueDays() {
        return overdueDays;
    }

    /**
     * Sets the value of the overdueDays property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setOverdueDays(Integer value) {
        this.overdueDays = value;
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
     * Gets the value of the collector property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCollector() {
        return collector;
    }

    /**
     * Sets the value of the collector property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCollector(String value) {
        this.collector = value;
    }

}
