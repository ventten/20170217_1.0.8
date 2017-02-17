
package com.ljwd.plms.web.wsdl.webservice.service;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for searchCollectAssignDto complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="searchCollectAssignDto">
 *   &lt;complexContent>
 *     &lt;extension base="{http://webservice.loan.mfbms.flinkmf.com/}baseVersionableCreatorAwareEntityDto">
 *       &lt;sequence>
 *       &lt;/sequence>
 *       &lt;attribute name="contractNo" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="loanName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="loanIdcarNo" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="loanAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       &lt;attribute name="overdueDay" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="overdueAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       &lt;attribute name="remainderAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       &lt;attribute name="collector" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="collectorName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="overduePeriod" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="assignDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="mobilePhone" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="applicationId" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="paymentId" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="periodNum" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="validMaxPeriodNum" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="status" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="contractId" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="agentCollector" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="agentCollectorName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="latestCollectStatus" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="latestCollectInputTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="paymentName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="redeem" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "searchCollectAssignDto")
public class SearchCollectAssignDto
    extends BaseVersionableCreatorAwareEntityDto
{

    @XmlAttribute(name = "contractNo")
    protected String contractNo;
    @XmlAttribute(name = "loanName")
    protected String loanName;
    @XmlAttribute(name = "loanIdcarNo")
    protected String loanIdcarNo;
    @XmlAttribute(name = "loanAmount")
    protected BigDecimal loanAmount;
    @XmlAttribute(name = "overdueDay")
    protected Integer overdueDay;
    @XmlAttribute(name = "overdueAmount")
    protected BigDecimal overdueAmount;
    @XmlAttribute(name = "remainderAmount")
    protected BigDecimal remainderAmount;
    @XmlAttribute(name = "collector")
    protected String collector;
    @XmlAttribute(name = "collectorName")
    protected String collectorName;
    @XmlAttribute(name = "overduePeriod")
    protected String overduePeriod;
    @XmlAttribute(name = "assignDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar assignDate;
    @XmlAttribute(name = "mobilePhone")
    protected String mobilePhone;
    @XmlAttribute(name = "applicationId")
    protected Long applicationId;
    @XmlAttribute(name = "paymentId")
    protected Long paymentId;
    @XmlAttribute(name = "periodNum")
    protected Integer periodNum;
    @XmlAttribute(name = "validMaxPeriodNum")
    protected Integer validMaxPeriodNum;
    @XmlAttribute(name = "status")
    protected String status;
    @XmlAttribute(name = "contractId")
    protected Long contractId;
    @XmlAttribute(name = "agentCollector")
    protected String agentCollector;
    @XmlAttribute(name = "agentCollectorName")
    protected String agentCollectorName;
    @XmlAttribute(name = "latestCollectStatus")
    protected String latestCollectStatus;
    @XmlAttribute(name = "latestCollectInputTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar latestCollectInputTime;
    @XmlAttribute(name = "paymentName")
    protected String paymentName;
    @XmlAttribute(name = "redeem")
    protected String redeem;

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
     * Gets the value of the loanIdcarNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLoanIdcarNo() {
        return loanIdcarNo;
    }

    /**
     * Sets the value of the loanIdcarNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLoanIdcarNo(String value) {
        this.loanIdcarNo = value;
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
     * Gets the value of the overdueAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOverdueAmount() {
        return overdueAmount;
    }

    /**
     * Sets the value of the overdueAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOverdueAmount(BigDecimal value) {
        this.overdueAmount = value;
    }

    /**
     * Gets the value of the remainderAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRemainderAmount() {
        return remainderAmount;
    }

    /**
     * Sets the value of the remainderAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRemainderAmount(BigDecimal value) {
        this.remainderAmount = value;
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
     * Gets the value of the collectorName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCollectorName() {
        return collectorName;
    }

    /**
     * Sets the value of the collectorName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCollectorName(String value) {
        this.collectorName = value;
    }

    /**
     * Gets the value of the overduePeriod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOverduePeriod() {
        return overduePeriod;
    }

    /**
     * Sets the value of the overduePeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOverduePeriod(String value) {
        this.overduePeriod = value;
    }

    /**
     * Gets the value of the assignDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getAssignDate() {
        return assignDate;
    }

    /**
     * Sets the value of the assignDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setAssignDate(XMLGregorianCalendar value) {
        this.assignDate = value;
    }

    /**
     * Gets the value of the mobilePhone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMobilePhone() {
        return mobilePhone;
    }

    /**
     * Sets the value of the mobilePhone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMobilePhone(String value) {
        this.mobilePhone = value;
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
     * Gets the value of the periodNum property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPeriodNum() {
        return periodNum;
    }

    /**
     * Sets the value of the periodNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPeriodNum(Integer value) {
        this.periodNum = value;
    }

    /**
     * Gets the value of the validMaxPeriodNum property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getValidMaxPeriodNum() {
        return validMaxPeriodNum;
    }

    /**
     * Sets the value of the validMaxPeriodNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setValidMaxPeriodNum(Integer value) {
        this.validMaxPeriodNum = value;
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
     * Gets the value of the agentCollector property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgentCollector() {
        return agentCollector;
    }

    /**
     * Sets the value of the agentCollector property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgentCollector(String value) {
        this.agentCollector = value;
    }

    /**
     * Gets the value of the agentCollectorName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgentCollectorName() {
        return agentCollectorName;
    }

    /**
     * Sets the value of the agentCollectorName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgentCollectorName(String value) {
        this.agentCollectorName = value;
    }

    /**
     * Gets the value of the latestCollectStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLatestCollectStatus() {
        return latestCollectStatus;
    }

    /**
     * Sets the value of the latestCollectStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLatestCollectStatus(String value) {
        this.latestCollectStatus = value;
    }

    /**
     * Gets the value of the latestCollectInputTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLatestCollectInputTime() {
        return latestCollectInputTime;
    }

    /**
     * Sets the value of the latestCollectInputTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLatestCollectInputTime(XMLGregorianCalendar value) {
        this.latestCollectInputTime = value;
    }

    /**
     * Gets the value of the paymentName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentName() {
        return paymentName;
    }

    /**
     * Sets the value of the paymentName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentName(String value) {
        this.paymentName = value;
    }

    /**
     * Gets the value of the redeem property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRedeem() {
        return redeem;
    }

    /**
     * Sets the value of the redeem property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRedeem(String value) {
        this.redeem = value;
    }

}
