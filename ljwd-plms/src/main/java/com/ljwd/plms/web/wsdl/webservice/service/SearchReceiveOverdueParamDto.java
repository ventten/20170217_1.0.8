
package com.ljwd.plms.web.wsdl.webservice.service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for searchReceiveOverdueParamDto complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="searchReceiveOverdueParamDto">
 *   &lt;complexContent>
 *     &lt;extension base="{http://webservice.loan.mfbms.flinkmf.com/}baseDataControlDto">
 *       &lt;sequence>
 *       &lt;/sequence>
 *       &lt;attribute name="loanName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="loanIdcarNo" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="contractNo" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="overdueDay" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="collector" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="loanAmountFrom" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       &lt;attribute name="loanAmountTo" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       &lt;attribute name="repaymentFrom" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="repaymentTo" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="paymentId" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="periodNum" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="agentStartDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="agentEndDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="agent" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="overdueDayFrom" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="overdueDayTo" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="remainderAmountStr" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="remainderAmountFrom" type="{http://www.w3.org/2001/XMLSchema}double" />
 *       &lt;attribute name="remainderAmountTo" type="{http://www.w3.org/2001/XMLSchema}double" />
 *       &lt;attribute name="remainderAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       &lt;attribute name="randomValue" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="outsourceState" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="paymentType" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="siteCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="offerStatus" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="queryPerm" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="siteCodeList">
 *         &lt;simpleType>
 *           &lt;list itemType="{http://www.w3.org/2001/XMLSchema}string" />
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="paymentTypeList">
 *         &lt;simpleType>
 *           &lt;list itemType="{http://www.w3.org/2001/XMLSchema}string" />
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="businessCategory" type="{http://webservice.loan.mfbms.flinkmf.com/}businessCategory" />
 *       &lt;attribute name="productId" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="prdType" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="isOfferReplyFail" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "searchReceiveOverdueParamDto")
public class SearchReceiveOverdueParamDto
    extends BaseDataControlDto
{

    @XmlAttribute(name = "loanName")
    protected String loanName;
    @XmlAttribute(name = "loanIdcarNo")
    protected String loanIdcarNo;
    @XmlAttribute(name = "contractNo")
    protected String contractNo;
    @XmlAttribute(name = "overdueDay")
    protected String overdueDay;
    @XmlAttribute(name = "collector")
    protected String collector;
    @XmlAttribute(name = "loanAmountFrom")
    protected BigDecimal loanAmountFrom;
    @XmlAttribute(name = "loanAmountTo")
    protected BigDecimal loanAmountTo;
    @XmlAttribute(name = "repaymentFrom")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar repaymentFrom;
    @XmlAttribute(name = "repaymentTo")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar repaymentTo;
    @XmlAttribute(name = "paymentId")
    protected Long paymentId;
    @XmlAttribute(name = "periodNum")
    protected Integer periodNum;
    @XmlAttribute(name = "agentStartDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar agentStartDate;
    @XmlAttribute(name = "agentEndDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar agentEndDate;
    @XmlAttribute(name = "agent")
    protected String agent;
    @XmlAttribute(name = "overdueDayFrom")
    protected Integer overdueDayFrom;
    @XmlAttribute(name = "overdueDayTo")
    protected Integer overdueDayTo;
    @XmlAttribute(name = "remainderAmountStr")
    protected String remainderAmountStr;
    @XmlAttribute(name = "remainderAmountFrom")
    protected Double remainderAmountFrom;
    @XmlAttribute(name = "remainderAmountTo")
    protected Double remainderAmountTo;
    @XmlAttribute(name = "remainderAmount")
    protected BigDecimal remainderAmount;
    @XmlAttribute(name = "randomValue")
    protected Integer randomValue;
    @XmlAttribute(name = "outsourceState")
    protected String outsourceState;
    @XmlAttribute(name = "paymentType")
    protected String paymentType;
    @XmlAttribute(name = "siteCode")
    protected String siteCode;
    @XmlAttribute(name = "offerStatus")
    protected String offerStatus;
    @XmlAttribute(name = "queryPerm")
    protected String queryPerm;
    @XmlAttribute(name = "siteCodeList")
    protected List<String> siteCodeList;
    @XmlAttribute(name = "paymentTypeList")
    protected List<String> paymentTypeList;
    @XmlAttribute(name = "businessCategory")
    protected BusinessCategory businessCategory;
    @XmlAttribute(name = "productId")
    protected Long productId;
    @XmlAttribute(name = "prdType")
    protected String prdType;
    @XmlAttribute(name = "isOfferReplyFail")
    protected Boolean isOfferReplyFail;

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
     * Gets the value of the overdueDay property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOverdueDay() {
        return overdueDay;
    }

    /**
     * Sets the value of the overdueDay property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOverdueDay(String value) {
        this.overdueDay = value;
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
     * Gets the value of the loanAmountFrom property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getLoanAmountFrom() {
        return loanAmountFrom;
    }

    /**
     * Sets the value of the loanAmountFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setLoanAmountFrom(BigDecimal value) {
        this.loanAmountFrom = value;
    }

    /**
     * Gets the value of the loanAmountTo property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getLoanAmountTo() {
        return loanAmountTo;
    }

    /**
     * Sets the value of the loanAmountTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setLoanAmountTo(BigDecimal value) {
        this.loanAmountTo = value;
    }

    /**
     * Gets the value of the repaymentFrom property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRepaymentFrom() {
        return repaymentFrom;
    }

    /**
     * Sets the value of the repaymentFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRepaymentFrom(XMLGregorianCalendar value) {
        this.repaymentFrom = value;
    }

    /**
     * Gets the value of the repaymentTo property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRepaymentTo() {
        return repaymentTo;
    }

    /**
     * Sets the value of the repaymentTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRepaymentTo(XMLGregorianCalendar value) {
        this.repaymentTo = value;
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
     * Gets the value of the agentStartDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getAgentStartDate() {
        return agentStartDate;
    }

    /**
     * Sets the value of the agentStartDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setAgentStartDate(XMLGregorianCalendar value) {
        this.agentStartDate = value;
    }

    /**
     * Gets the value of the agentEndDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getAgentEndDate() {
        return agentEndDate;
    }

    /**
     * Sets the value of the agentEndDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setAgentEndDate(XMLGregorianCalendar value) {
        this.agentEndDate = value;
    }

    /**
     * Gets the value of the agent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgent() {
        return agent;
    }

    /**
     * Sets the value of the agent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgent(String value) {
        this.agent = value;
    }

    /**
     * Gets the value of the overdueDayFrom property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getOverdueDayFrom() {
        return overdueDayFrom;
    }

    /**
     * Sets the value of the overdueDayFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setOverdueDayFrom(Integer value) {
        this.overdueDayFrom = value;
    }

    /**
     * Gets the value of the overdueDayTo property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getOverdueDayTo() {
        return overdueDayTo;
    }

    /**
     * Sets the value of the overdueDayTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setOverdueDayTo(Integer value) {
        this.overdueDayTo = value;
    }

    /**
     * Gets the value of the remainderAmountStr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRemainderAmountStr() {
        return remainderAmountStr;
    }

    /**
     * Sets the value of the remainderAmountStr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRemainderAmountStr(String value) {
        this.remainderAmountStr = value;
    }

    /**
     * Gets the value of the remainderAmountFrom property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getRemainderAmountFrom() {
        return remainderAmountFrom;
    }

    /**
     * Sets the value of the remainderAmountFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setRemainderAmountFrom(Double value) {
        this.remainderAmountFrom = value;
    }

    /**
     * Gets the value of the remainderAmountTo property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getRemainderAmountTo() {
        return remainderAmountTo;
    }

    /**
     * Sets the value of the remainderAmountTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setRemainderAmountTo(Double value) {
        this.remainderAmountTo = value;
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
     * Gets the value of the randomValue property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRandomValue() {
        return randomValue;
    }

    /**
     * Sets the value of the randomValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRandomValue(Integer value) {
        this.randomValue = value;
    }

    /**
     * Gets the value of the outsourceState property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutsourceState() {
        return outsourceState;
    }

    /**
     * Sets the value of the outsourceState property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutsourceState(String value) {
        this.outsourceState = value;
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
     * Gets the value of the offerStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOfferStatus() {
        return offerStatus;
    }

    /**
     * Sets the value of the offerStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOfferStatus(String value) {
        this.offerStatus = value;
    }

    /**
     * Gets the value of the queryPerm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQueryPerm() {
        return queryPerm;
    }

    /**
     * Sets the value of the queryPerm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQueryPerm(String value) {
        this.queryPerm = value;
    }

    /**
     * Gets the value of the siteCodeList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the siteCodeList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSiteCodeList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getSiteCodeList() {
        if (siteCodeList == null) {
            siteCodeList = new ArrayList<String>();
        }
        return this.siteCodeList;
    }

    /**
     * Gets the value of the paymentTypeList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the paymentTypeList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPaymentTypeList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getPaymentTypeList() {
        if (paymentTypeList == null) {
            paymentTypeList = new ArrayList<String>();
        }
        return this.paymentTypeList;
    }

    /**
     * Gets the value of the businessCategory property.
     * 
     * @return
     *     possible object is
     *     {@link BusinessCategory }
     *     
     */
    public BusinessCategory getBusinessCategory() {
        return businessCategory;
    }

    /**
     * Sets the value of the businessCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link BusinessCategory }
     *     
     */
    public void setBusinessCategory(BusinessCategory value) {
        this.businessCategory = value;
    }

    /**
     * Gets the value of the productId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getProductId() {
        return productId;
    }

    /**
     * Sets the value of the productId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setProductId(Long value) {
        this.productId = value;
    }

    /**
     * Gets the value of the prdType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrdType() {
        return prdType;
    }

    /**
     * Sets the value of the prdType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrdType(String value) {
        this.prdType = value;
    }

    /**
     * Gets the value of the isOfferReplyFail property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsOfferReplyFail() {
        return isOfferReplyFail;
    }

    /**
     * Sets the value of the isOfferReplyFail property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsOfferReplyFail(Boolean value) {
        this.isOfferReplyFail = value;
    }

}
