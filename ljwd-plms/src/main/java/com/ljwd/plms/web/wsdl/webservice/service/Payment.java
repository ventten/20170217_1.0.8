
package com.ljwd.plms.web.wsdl.webservice.service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for payment complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="payment">
 *   &lt;complexContent>
 *     &lt;extension base="{http://webservice.loan.mfbms.flinkmf.com/}baseVersionableCreatorAwareEntity">
 *       &lt;sequence>
 *         &lt;element name="actualPayAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="applicationInfo" type="{http://webservice.loan.mfbms.flinkmf.com/}applicationInfo" minOccurs="0"/>
 *         &lt;element name="applicationInfoId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="checkByPhone" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="cleanPeriod" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="clearDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="contract" type="{http://webservice.loan.mfbms.flinkmf.com/}contract" minOccurs="0"/>
 *         &lt;element name="contractId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="delayPayDateFee" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="endDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="isAdvanceClear" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="isPaid" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="isWriteOff" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="loanNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="payAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="payDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="paymentDetails" type="{http://webservice.loan.mfbms.flinkmf.com/}paymentDetail" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="receivables" type="{http://webservice.loan.mfbms.flinkmf.com/}receivable" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="remark" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="renewAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="repaymentBank" type="{http://webservice.loan.mfbms.flinkmf.com/}repaymentBank" minOccurs="0"/>
 *         &lt;element name="repaymentBanks" type="{http://webservice.loan.mfbms.flinkmf.com/}repaymentBank" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="repaymentPlanBanks" type="{http://webservice.loan.mfbms.flinkmf.com/}repaymentPlanBank" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="repaymentPlans" type="{http://webservice.loan.mfbms.flinkmf.com/}repaymentPlan" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="repayments" type="{http://webservice.loan.mfbms.flinkmf.com/}repayment" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="returnAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="settleDay" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="startDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "payment", propOrder = {
    "actualPayAmount",
    "applicationInfo",
    "applicationInfoId",
    "checkByPhone",
    "cleanPeriod",
    "clearDate",
    "contract",
    "contractId",
    "delayPayDateFee",
    "endDate",
    "isAdvanceClear",
    "isPaid",
    "isWriteOff",
    "loanNo",
    "payAmount",
    "payDate",
    "paymentDetails",
    "receivables",
    "remark",
    "renewAmount",
    "repaymentBank",
    "repaymentBanks",
    "repaymentPlanBanks",
    "repaymentPlans",
    "repayments",
    "returnAmount",
    "settleDay",
    "startDate"
})
public class Payment
    extends BaseVersionableCreatorAwareEntity
{

    protected BigDecimal actualPayAmount;
    protected ApplicationInfo applicationInfo;
    protected Long applicationInfoId;
    protected Boolean checkByPhone;
    protected Integer cleanPeriod;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar clearDate;
    protected Contract contract;
    protected Long contractId;
    protected BigDecimal delayPayDateFee;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar endDate;
    protected Boolean isAdvanceClear;
    protected Boolean isPaid;
    protected Boolean isWriteOff;
    protected String loanNo;
    protected BigDecimal payAmount;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar payDate;
    @XmlElement(nillable = true)
    protected List<PaymentDetail> paymentDetails;
    @XmlElement(nillable = true)
    protected List<Receivable> receivables;
    protected String remark;
    protected BigDecimal renewAmount;
    protected RepaymentBank repaymentBank;
    @XmlElement(nillable = true)
    protected List<RepaymentBank> repaymentBanks;
    @XmlElement(nillable = true)
    protected List<RepaymentPlanBank> repaymentPlanBanks;
    @XmlElement(nillable = true)
    protected List<RepaymentPlan> repaymentPlans;
    @XmlElement(nillable = true)
    protected List<Repayment> repayments;
    protected BigDecimal returnAmount;
    protected Integer settleDay;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar startDate;

    /**
     * Gets the value of the actualPayAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getActualPayAmount() {
        return actualPayAmount;
    }

    /**
     * Sets the value of the actualPayAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setActualPayAmount(BigDecimal value) {
        this.actualPayAmount = value;
    }

    /**
     * Gets the value of the applicationInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ApplicationInfo }
     *     
     */
    public ApplicationInfo getApplicationInfo() {
        return applicationInfo;
    }

    /**
     * Sets the value of the applicationInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApplicationInfo }
     *     
     */
    public void setApplicationInfo(ApplicationInfo value) {
        this.applicationInfo = value;
    }

    /**
     * Gets the value of the applicationInfoId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getApplicationInfoId() {
        return applicationInfoId;
    }

    /**
     * Sets the value of the applicationInfoId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setApplicationInfoId(Long value) {
        this.applicationInfoId = value;
    }

    /**
     * Gets the value of the checkByPhone property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCheckByPhone() {
        return checkByPhone;
    }

    /**
     * Sets the value of the checkByPhone property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCheckByPhone(Boolean value) {
        this.checkByPhone = value;
    }

    /**
     * Gets the value of the cleanPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCleanPeriod() {
        return cleanPeriod;
    }

    /**
     * Sets the value of the cleanPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCleanPeriod(Integer value) {
        this.cleanPeriod = value;
    }

    /**
     * Gets the value of the clearDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getClearDate() {
        return clearDate;
    }

    /**
     * Sets the value of the clearDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setClearDate(XMLGregorianCalendar value) {
        this.clearDate = value;
    }

    /**
     * Gets the value of the contract property.
     * 
     * @return
     *     possible object is
     *     {@link Contract }
     *     
     */
    public Contract getContract() {
        return contract;
    }

    /**
     * Sets the value of the contract property.
     * 
     * @param value
     *     allowed object is
     *     {@link Contract }
     *     
     */
    public void setContract(Contract value) {
        this.contract = value;
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
     * Gets the value of the delayPayDateFee property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDelayPayDateFee() {
        return delayPayDateFee;
    }

    /**
     * Sets the value of the delayPayDateFee property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDelayPayDateFee(BigDecimal value) {
        this.delayPayDateFee = value;
    }

    /**
     * Gets the value of the endDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEndDate() {
        return endDate;
    }

    /**
     * Sets the value of the endDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEndDate(XMLGregorianCalendar value) {
        this.endDate = value;
    }

    /**
     * Gets the value of the isAdvanceClear property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsAdvanceClear() {
        return isAdvanceClear;
    }

    /**
     * Sets the value of the isAdvanceClear property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsAdvanceClear(Boolean value) {
        this.isAdvanceClear = value;
    }

    /**
     * Gets the value of the isPaid property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsPaid() {
        return isPaid;
    }

    /**
     * Sets the value of the isPaid property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsPaid(Boolean value) {
        this.isPaid = value;
    }

    /**
     * Gets the value of the isWriteOff property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsWriteOff() {
        return isWriteOff;
    }

    /**
     * Sets the value of the isWriteOff property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsWriteOff(Boolean value) {
        this.isWriteOff = value;
    }

    /**
     * Gets the value of the loanNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLoanNo() {
        return loanNo;
    }

    /**
     * Sets the value of the loanNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLoanNo(String value) {
        this.loanNo = value;
    }

    /**
     * Gets the value of the payAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPayAmount() {
        return payAmount;
    }

    /**
     * Sets the value of the payAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPayAmount(BigDecimal value) {
        this.payAmount = value;
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
     * Gets the value of the paymentDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the paymentDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPaymentDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PaymentDetail }
     * 
     * 
     */
    public List<PaymentDetail> getPaymentDetails() {
        if (paymentDetails == null) {
            paymentDetails = new ArrayList<PaymentDetail>();
        }
        return this.paymentDetails;
    }

    /**
     * Gets the value of the receivables property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the receivables property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReceivables().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Receivable }
     * 
     * 
     */
    public List<Receivable> getReceivables() {
        if (receivables == null) {
            receivables = new ArrayList<Receivable>();
        }
        return this.receivables;
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
     * Gets the value of the renewAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRenewAmount() {
        return renewAmount;
    }

    /**
     * Sets the value of the renewAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRenewAmount(BigDecimal value) {
        this.renewAmount = value;
    }

    /**
     * Gets the value of the repaymentBank property.
     * 
     * @return
     *     possible object is
     *     {@link RepaymentBank }
     *     
     */
    public RepaymentBank getRepaymentBank() {
        return repaymentBank;
    }

    /**
     * Sets the value of the repaymentBank property.
     * 
     * @param value
     *     allowed object is
     *     {@link RepaymentBank }
     *     
     */
    public void setRepaymentBank(RepaymentBank value) {
        this.repaymentBank = value;
    }

    /**
     * Gets the value of the repaymentBanks property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the repaymentBanks property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRepaymentBanks().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RepaymentBank }
     * 
     * 
     */
    public List<RepaymentBank> getRepaymentBanks() {
        if (repaymentBanks == null) {
            repaymentBanks = new ArrayList<RepaymentBank>();
        }
        return this.repaymentBanks;
    }

    /**
     * Gets the value of the repaymentPlanBanks property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the repaymentPlanBanks property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRepaymentPlanBanks().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RepaymentPlanBank }
     * 
     * 
     */
    public List<RepaymentPlanBank> getRepaymentPlanBanks() {
        if (repaymentPlanBanks == null) {
            repaymentPlanBanks = new ArrayList<RepaymentPlanBank>();
        }
        return this.repaymentPlanBanks;
    }

    /**
     * Gets the value of the repaymentPlans property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the repaymentPlans property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRepaymentPlans().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RepaymentPlan }
     * 
     * 
     */
    public List<RepaymentPlan> getRepaymentPlans() {
        if (repaymentPlans == null) {
            repaymentPlans = new ArrayList<RepaymentPlan>();
        }
        return this.repaymentPlans;
    }

    /**
     * Gets the value of the repayments property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the repayments property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRepayments().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Repayment }
     * 
     * 
     */
    public List<Repayment> getRepayments() {
        if (repayments == null) {
            repayments = new ArrayList<Repayment>();
        }
        return this.repayments;
    }

    /**
     * Gets the value of the returnAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getReturnAmount() {
        return returnAmount;
    }

    /**
     * Sets the value of the returnAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setReturnAmount(BigDecimal value) {
        this.returnAmount = value;
    }

    /**
     * Gets the value of the settleDay property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSettleDay() {
        return settleDay;
    }

    /**
     * Sets the value of the settleDay property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSettleDay(Integer value) {
        this.settleDay = value;
    }

    /**
     * Gets the value of the startDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStartDate() {
        return startDate;
    }

    /**
     * Sets the value of the startDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStartDate(XMLGregorianCalendar value) {
        this.startDate = value;
    }

}
