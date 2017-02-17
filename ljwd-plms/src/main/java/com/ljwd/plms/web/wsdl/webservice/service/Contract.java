
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
 * <p>Java class for contract complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="contract">
 *   &lt;complexContent>
 *     &lt;extension base="{http://webservice.loan.mfbms.flinkmf.com/}baseVersionableCreatorAwareEntity">
 *       &lt;sequence>
 *         &lt;element name="applicationInfo" type="{http://webservice.loan.mfbms.flinkmf.com/}applicationInfo" minOccurs="0"/>
 *         &lt;element name="applicationInfoId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="appointNote" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="appointTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="appointedBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="approvalAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="contractNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="contractPrintHises" type="{http://webservice.loan.mfbms.flinkmf.com/}contractPrintHis" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="contractSn" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="contractStatus" type="{http://webservice.loan.mfbms.flinkmf.com/}subLoanStatus" minOccurs="0"/>
 *         &lt;element name="customerBankAccounts" type="{http://webservice.loan.mfbms.flinkmf.com/}customerBankAccount" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="delayDay" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="interestRate" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="isSignal" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="loanAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="loanDay" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="loanPeriod" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="payment" type="{http://webservice.loan.mfbms.flinkmf.com/}payment" minOccurs="0"/>
 *         &lt;element name="receivables" type="{http://webservice.loan.mfbms.flinkmf.com/}receivable" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="remark" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="repayments" type="{http://webservice.loan.mfbms.flinkmf.com/}repayment" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="signTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="signUser" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="site" type="{http://webservice.loan.mfbms.flinkmf.com/}site" minOccurs="0"/>
 *         &lt;element name="siteCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "contract", propOrder = {
    "applicationInfo",
    "applicationInfoId",
    "appointNote",
    "appointTime",
    "appointedBy",
    "approvalAmount",
    "contractNo",
    "contractPrintHises",
    "contractSn",
    "contractStatus",
    "customerBankAccounts",
    "delayDay",
    "interestRate",
    "isSignal",
    "loanAmount",
    "loanDay",
    "loanPeriod",
    "payment",
    "receivables",
    "remark",
    "repayments",
    "signTime",
    "signUser",
    "site",
    "siteCode"
})
public class Contract
    extends BaseVersionableCreatorAwareEntity
{

    protected ApplicationInfo applicationInfo;
    protected Long applicationInfoId;
    protected String appointNote;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar appointTime;
    protected String appointedBy;
    protected BigDecimal approvalAmount;
    protected String contractNo;
    @XmlElement(nillable = true)
    protected List<ContractPrintHis> contractPrintHises;
    protected Long contractSn;
    protected SubLoanStatus contractStatus;
    @XmlElement(nillable = true)
    protected List<CustomerBankAccount> customerBankAccounts;
    protected Integer delayDay;
    protected BigDecimal interestRate;
    protected Boolean isSignal;
    protected BigDecimal loanAmount;
    protected Integer loanDay;
    protected Integer loanPeriod;
    protected Payment payment;
    @XmlElement(nillable = true)
    protected List<Receivable> receivables;
    protected String remark;
    @XmlElement(nillable = true)
    protected List<Repayment> repayments;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar signTime;
    protected String signUser;
    protected Site site;
    protected String siteCode;

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
     * Gets the value of the contractPrintHises property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contractPrintHises property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContractPrintHises().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ContractPrintHis }
     * 
     * 
     */
    public List<ContractPrintHis> getContractPrintHises() {
        if (contractPrintHises == null) {
            contractPrintHises = new ArrayList<ContractPrintHis>();
        }
        return this.contractPrintHises;
    }

    /**
     * Gets the value of the contractSn property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getContractSn() {
        return contractSn;
    }

    /**
     * Sets the value of the contractSn property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setContractSn(Long value) {
        this.contractSn = value;
    }

    /**
     * Gets the value of the contractStatus property.
     * 
     * @return
     *     possible object is
     *     {@link SubLoanStatus }
     *     
     */
    public SubLoanStatus getContractStatus() {
        return contractStatus;
    }

    /**
     * Sets the value of the contractStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubLoanStatus }
     *     
     */
    public void setContractStatus(SubLoanStatus value) {
        this.contractStatus = value;
    }

    /**
     * Gets the value of the customerBankAccounts property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the customerBankAccounts property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCustomerBankAccounts().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CustomerBankAccount }
     * 
     * 
     */
    public List<CustomerBankAccount> getCustomerBankAccounts() {
        if (customerBankAccounts == null) {
            customerBankAccounts = new ArrayList<CustomerBankAccount>();
        }
        return this.customerBankAccounts;
    }

    /**
     * Gets the value of the delayDay property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDelayDay() {
        return delayDay;
    }

    /**
     * Sets the value of the delayDay property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDelayDay(Integer value) {
        this.delayDay = value;
    }

    /**
     * Gets the value of the interestRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInterestRate() {
        return interestRate;
    }

    /**
     * Sets the value of the interestRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInterestRate(BigDecimal value) {
        this.interestRate = value;
    }

    /**
     * Gets the value of the isSignal property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsSignal() {
        return isSignal;
    }

    /**
     * Sets the value of the isSignal property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsSignal(Boolean value) {
        this.isSignal = value;
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
     * Gets the value of the loanDay property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getLoanDay() {
        return loanDay;
    }

    /**
     * Sets the value of the loanDay property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setLoanDay(Integer value) {
        this.loanDay = value;
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
     * Gets the value of the payment property.
     * 
     * @return
     *     possible object is
     *     {@link Payment }
     *     
     */
    public Payment getPayment() {
        return payment;
    }

    /**
     * Sets the value of the payment property.
     * 
     * @param value
     *     allowed object is
     *     {@link Payment }
     *     
     */
    public void setPayment(Payment value) {
        this.payment = value;
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
     * Gets the value of the signTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSignTime() {
        return signTime;
    }

    /**
     * Sets the value of the signTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSignTime(XMLGregorianCalendar value) {
        this.signTime = value;
    }

    /**
     * Gets the value of the signUser property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSignUser() {
        return signUser;
    }

    /**
     * Sets the value of the signUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSignUser(String value) {
        this.signUser = value;
    }

    /**
     * Gets the value of the site property.
     * 
     * @return
     *     possible object is
     *     {@link Site }
     *     
     */
    public Site getSite() {
        return site;
    }

    /**
     * Sets the value of the site property.
     * 
     * @param value
     *     allowed object is
     *     {@link Site }
     *     
     */
    public void setSite(Site value) {
        this.site = value;
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

}
