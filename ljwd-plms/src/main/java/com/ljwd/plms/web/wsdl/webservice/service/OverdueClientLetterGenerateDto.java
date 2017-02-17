
package com.ljwd.plms.web.wsdl.webservice.service;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for overdueClientLetterGenerateDto complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="overdueClientLetterGenerateDto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *       &lt;/sequence>
 *       &lt;attribute name="siteName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="paymentType" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="paymentTypeName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="clientName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="idCardNo" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="clientAddr" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="addrType" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="contractNo" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="loanAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       &lt;attribute name="repaymentDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="overdueDay" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="paymentId" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="applyId" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="collector" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="gender" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="collectorId" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="collectPhone" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="contractId" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="remainderPrincipal" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       &lt;attribute name="overduePrincipal" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       &lt;attribute name="overdueInterest" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       &lt;attribute name="overdueBrokerFee" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       &lt;attribute name="overduePenalty" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       &lt;attribute name="overdueFailCollectFee" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       &lt;attribute name="clearAmt" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "overdueClientLetterGenerateDto")
public class OverdueClientLetterGenerateDto {

    @XmlAttribute(name = "siteName")
    protected String siteName;
    @XmlAttribute(name = "paymentType")
    protected String paymentType;
    @XmlAttribute(name = "paymentTypeName")
    protected String paymentTypeName;
    @XmlAttribute(name = "clientName")
    protected String clientName;
    @XmlAttribute(name = "idCardNo")
    protected String idCardNo;
    @XmlAttribute(name = "clientAddr")
    protected String clientAddr;
    @XmlAttribute(name = "addrType")
    protected String addrType;
    @XmlAttribute(name = "contractNo")
    protected String contractNo;
    @XmlAttribute(name = "loanAmount")
    protected BigDecimal loanAmount;
    @XmlAttribute(name = "repaymentDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar repaymentDate;
    @XmlAttribute(name = "overdueDay")
    protected Integer overdueDay;
    @XmlAttribute(name = "paymentId")
    protected Long paymentId;
    @XmlAttribute(name = "applyId")
    protected Long applyId;
    @XmlAttribute(name = "collector")
    protected String collector;
    @XmlAttribute(name = "gender")
    protected String gender;
    @XmlAttribute(name = "collectorId")
    protected String collectorId;
    @XmlAttribute(name = "collectPhone")
    protected String collectPhone;
    @XmlAttribute(name = "contractId")
    protected Long contractId;
    @XmlAttribute(name = "remainderPrincipal")
    protected BigDecimal remainderPrincipal;
    @XmlAttribute(name = "overduePrincipal")
    protected BigDecimal overduePrincipal;
    @XmlAttribute(name = "overdueInterest")
    protected BigDecimal overdueInterest;
    @XmlAttribute(name = "overdueBrokerFee")
    protected BigDecimal overdueBrokerFee;
    @XmlAttribute(name = "overduePenalty")
    protected BigDecimal overduePenalty;
    @XmlAttribute(name = "overdueFailCollectFee")
    protected BigDecimal overdueFailCollectFee;
    @XmlAttribute(name = "clearAmt")
    protected BigDecimal clearAmt;

    /**
     * Gets the value of the siteName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSiteName() {
        return siteName;
    }

    /**
     * Sets the value of the siteName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSiteName(String value) {
        this.siteName = value;
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
     * Gets the value of the paymentTypeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentTypeName() {
        return paymentTypeName;
    }

    /**
     * Sets the value of the paymentTypeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentTypeName(String value) {
        this.paymentTypeName = value;
    }

    /**
     * Gets the value of the clientName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClientName() {
        return clientName;
    }

    /**
     * Sets the value of the clientName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClientName(String value) {
        this.clientName = value;
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
     * Gets the value of the clientAddr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClientAddr() {
        return clientAddr;
    }

    /**
     * Sets the value of the clientAddr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClientAddr(String value) {
        this.clientAddr = value;
    }

    /**
     * Gets the value of the addrType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddrType() {
        return addrType;
    }

    /**
     * Sets the value of the addrType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddrType(String value) {
        this.addrType = value;
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
     * Gets the value of the overdueDay property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getOverdueDay() {
        return overdueDay;
    }

    /**
     * Sets the value of the overdueDay property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setOverdueDay(Integer value) {
        this.overdueDay = value;
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
     * Gets the value of the collectorId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCollectorId() {
        return collectorId;
    }

    /**
     * Sets the value of the collectorId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCollectorId(String value) {
        this.collectorId = value;
    }

    /**
     * Gets the value of the collectPhone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCollectPhone() {
        return collectPhone;
    }

    /**
     * Sets the value of the collectPhone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCollectPhone(String value) {
        this.collectPhone = value;
    }

    /**
     * Gets the value of the contractId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getContractId() {
        return contractId;
    }

    /**
     * Sets the value of the contractId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setContractId(Long value) {
        this.contractId = value;
    }

    /**
     * Gets the value of the remainderPrincipal property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRemainderPrincipal() {
        return remainderPrincipal;
    }

    /**
     * Sets the value of the remainderPrincipal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRemainderPrincipal(BigDecimal value) {
        this.remainderPrincipal = value;
    }

    /**
     * Gets the value of the overduePrincipal property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOverduePrincipal() {
        return overduePrincipal;
    }

    /**
     * Sets the value of the overduePrincipal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOverduePrincipal(BigDecimal value) {
        this.overduePrincipal = value;
    }

    /**
     * Gets the value of the overdueInterest property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOverdueInterest() {
        return overdueInterest;
    }

    /**
     * Sets the value of the overdueInterest property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOverdueInterest(BigDecimal value) {
        this.overdueInterest = value;
    }

    /**
     * Gets the value of the overdueBrokerFee property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOverdueBrokerFee() {
        return overdueBrokerFee;
    }

    /**
     * Sets the value of the overdueBrokerFee property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOverdueBrokerFee(BigDecimal value) {
        this.overdueBrokerFee = value;
    }

    /**
     * Gets the value of the overduePenalty property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOverduePenalty() {
        return overduePenalty;
    }

    /**
     * Sets the value of the overduePenalty property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOverduePenalty(BigDecimal value) {
        this.overduePenalty = value;
    }

    /**
     * Gets the value of the overdueFailCollectFee property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOverdueFailCollectFee() {
        return overdueFailCollectFee;
    }

    /**
     * Sets the value of the overdueFailCollectFee property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOverdueFailCollectFee(BigDecimal value) {
        this.overdueFailCollectFee = value;
    }

    /**
     * Gets the value of the clearAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getClearAmt() {
        return clearAmt;
    }

    /**
     * Sets the value of the clearAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setClearAmt(BigDecimal value) {
        this.clearAmt = value;
    }

}
