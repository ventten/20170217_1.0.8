
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
 * <p>Java class for bankJournal complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="bankJournal">
 *   &lt;complexContent>
 *     &lt;extension base="{http://webservice.loan.mfbms.flinkmf.com/}baseVersionableCreatorAwareEntity">
 *       &lt;sequence>
 *         &lt;element name="actorType" type="{http://webservice.loan.mfbms.flinkmf.com/}generationType" minOccurs="0"/>
 *         &lt;element name="bankAccount" type="{http://webservice.loan.mfbms.flinkmf.com/}bankAccount" minOccurs="0"/>
 *         &lt;element name="bankAccountId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="bankAccountName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="bankAccountNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="bankAssigns" type="{http://webservice.loan.mfbms.flinkmf.com/}bankAssign" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="bankJournalLogs" type="{http://webservice.loan.mfbms.flinkmf.com/}bankJournalLog" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="bankName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="bankNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="batchNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="branchBankNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cancelRepayment" type="{http://webservice.loan.mfbms.flinkmf.com/}repayment" minOccurs="0"/>
 *         &lt;element name="cancelRepaymentId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="category" type="{http://webservice.loan.mfbms.flinkmf.com/}bankJournalCategory" minOccurs="0"/>
 *         &lt;element name="companyBankAC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="idCardNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="inputTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="inputtedBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="itemNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="outstandingAccounts" type="{http://webservice.loan.mfbms.flinkmf.com/}outstandingAccount" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="paidDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="parentBankJournal" type="{http://webservice.loan.mfbms.flinkmf.com/}bankJournal" minOccurs="0"/>
 *         &lt;element name="parentBankJournalId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="remark" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="status" type="{http://webservice.loan.mfbms.flinkmf.com/}bankJournalStatus" minOccurs="0"/>
 *         &lt;element name="txAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="txDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "bankJournal", propOrder = {
    "actorType",
    "bankAccount",
    "bankAccountId",
    "bankAccountName",
    "bankAccountNo",
    "bankAssigns",
    "bankJournalLogs",
    "bankName",
    "bankNo",
    "batchNo",
    "branchBankNo",
    "cancelRepayment",
    "cancelRepaymentId",
    "category",
    "companyBankAC",
    "idCardNo",
    "inputTime",
    "inputtedBy",
    "itemNo",
    "outstandingAccounts",
    "paidDate",
    "parentBankJournal",
    "parentBankJournalId",
    "remark",
    "status",
    "txAmount",
    "txDate"
})
public class BankJournal
    extends BaseVersionableCreatorAwareEntity
{

    protected GenerationType actorType;
    protected BankAccount bankAccount;
    protected Long bankAccountId;
    protected String bankAccountName;
    protected String bankAccountNo;
    @XmlElement(nillable = true)
    protected List<BankAssign> bankAssigns;
    @XmlElement(nillable = true)
    protected List<BankJournalLog> bankJournalLogs;
    protected String bankName;
    protected String bankNo;
    protected String batchNo;
    protected String branchBankNo;
    protected Repayment cancelRepayment;
    protected Long cancelRepaymentId;
    protected BankJournalCategory category;
    protected String companyBankAC;
    protected String idCardNo;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inputTime;
    protected String inputtedBy;
    protected String itemNo;
    @XmlElement(nillable = true)
    protected List<OutstandingAccount> outstandingAccounts;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar paidDate;
    protected BankJournal parentBankJournal;
    protected Long parentBankJournalId;
    protected String remark;
    protected BankJournalStatus status;
    protected BigDecimal txAmount;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar txDate;

    /**
     * Gets the value of the actorType property.
     * 
     * @return
     *     possible object is
     *     {@link GenerationType }
     *     
     */
    public GenerationType getActorType() {
        return actorType;
    }

    /**
     * Sets the value of the actorType property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenerationType }
     *     
     */
    public void setActorType(GenerationType value) {
        this.actorType = value;
    }

    /**
     * Gets the value of the bankAccount property.
     * 
     * @return
     *     possible object is
     *     {@link BankAccount }
     *     
     */
    public BankAccount getBankAccount() {
        return bankAccount;
    }

    /**
     * Sets the value of the bankAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BankAccount }
     *     
     */
    public void setBankAccount(BankAccount value) {
        this.bankAccount = value;
    }

    /**
     * Gets the value of the bankAccountId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getBankAccountId() {
        return bankAccountId;
    }

    /**
     * Sets the value of the bankAccountId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setBankAccountId(Long value) {
        this.bankAccountId = value;
    }

    /**
     * Gets the value of the bankAccountName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBankAccountName() {
        return bankAccountName;
    }

    /**
     * Sets the value of the bankAccountName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBankAccountName(String value) {
        this.bankAccountName = value;
    }

    /**
     * Gets the value of the bankAccountNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBankAccountNo() {
        return bankAccountNo;
    }

    /**
     * Sets the value of the bankAccountNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBankAccountNo(String value) {
        this.bankAccountNo = value;
    }

    /**
     * Gets the value of the bankAssigns property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bankAssigns property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBankAssigns().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BankAssign }
     * 
     * 
     */
    public List<BankAssign> getBankAssigns() {
        if (bankAssigns == null) {
            bankAssigns = new ArrayList<BankAssign>();
        }
        return this.bankAssigns;
    }

    /**
     * Gets the value of the bankJournalLogs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bankJournalLogs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBankJournalLogs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BankJournalLog }
     * 
     * 
     */
    public List<BankJournalLog> getBankJournalLogs() {
        if (bankJournalLogs == null) {
            bankJournalLogs = new ArrayList<BankJournalLog>();
        }
        return this.bankJournalLogs;
    }

    /**
     * Gets the value of the bankName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBankName() {
        return bankName;
    }

    /**
     * Sets the value of the bankName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBankName(String value) {
        this.bankName = value;
    }

    /**
     * Gets the value of the bankNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBankNo() {
        return bankNo;
    }

    /**
     * Sets the value of the bankNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBankNo(String value) {
        this.bankNo = value;
    }

    /**
     * Gets the value of the batchNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBatchNo() {
        return batchNo;
    }

    /**
     * Sets the value of the batchNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBatchNo(String value) {
        this.batchNo = value;
    }

    /**
     * Gets the value of the branchBankNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBranchBankNo() {
        return branchBankNo;
    }

    /**
     * Sets the value of the branchBankNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBranchBankNo(String value) {
        this.branchBankNo = value;
    }

    /**
     * Gets the value of the cancelRepayment property.
     * 
     * @return
     *     possible object is
     *     {@link Repayment }
     *     
     */
    public Repayment getCancelRepayment() {
        return cancelRepayment;
    }

    /**
     * Sets the value of the cancelRepayment property.
     * 
     * @param value
     *     allowed object is
     *     {@link Repayment }
     *     
     */
    public void setCancelRepayment(Repayment value) {
        this.cancelRepayment = value;
    }

    /**
     * Gets the value of the cancelRepaymentId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCancelRepaymentId() {
        return cancelRepaymentId;
    }

    /**
     * Sets the value of the cancelRepaymentId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCancelRepaymentId(Long value) {
        this.cancelRepaymentId = value;
    }

    /**
     * Gets the value of the category property.
     * 
     * @return
     *     possible object is
     *     {@link BankJournalCategory }
     *     
     */
    public BankJournalCategory getCategory() {
        return category;
    }

    /**
     * Sets the value of the category property.
     * 
     * @param value
     *     allowed object is
     *     {@link BankJournalCategory }
     *     
     */
    public void setCategory(BankJournalCategory value) {
        this.category = value;
    }

    /**
     * Gets the value of the companyBankAC property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompanyBankAC() {
        return companyBankAC;
    }

    /**
     * Sets the value of the companyBankAC property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompanyBankAC(String value) {
        this.companyBankAC = value;
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
     * Gets the value of the inputTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInputTime() {
        return inputTime;
    }

    /**
     * Sets the value of the inputTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInputTime(XMLGregorianCalendar value) {
        this.inputTime = value;
    }

    /**
     * Gets the value of the inputtedBy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInputtedBy() {
        return inputtedBy;
    }

    /**
     * Sets the value of the inputtedBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInputtedBy(String value) {
        this.inputtedBy = value;
    }

    /**
     * Gets the value of the itemNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItemNo() {
        return itemNo;
    }

    /**
     * Sets the value of the itemNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItemNo(String value) {
        this.itemNo = value;
    }

    /**
     * Gets the value of the outstandingAccounts property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the outstandingAccounts property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOutstandingAccounts().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OutstandingAccount }
     * 
     * 
     */
    public List<OutstandingAccount> getOutstandingAccounts() {
        if (outstandingAccounts == null) {
            outstandingAccounts = new ArrayList<OutstandingAccount>();
        }
        return this.outstandingAccounts;
    }

    /**
     * Gets the value of the paidDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPaidDate() {
        return paidDate;
    }

    /**
     * Sets the value of the paidDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPaidDate(XMLGregorianCalendar value) {
        this.paidDate = value;
    }

    /**
     * Gets the value of the parentBankJournal property.
     * 
     * @return
     *     possible object is
     *     {@link BankJournal }
     *     
     */
    public BankJournal getParentBankJournal() {
        return parentBankJournal;
    }

    /**
     * Sets the value of the parentBankJournal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BankJournal }
     *     
     */
    public void setParentBankJournal(BankJournal value) {
        this.parentBankJournal = value;
    }

    /**
     * Gets the value of the parentBankJournalId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getParentBankJournalId() {
        return parentBankJournalId;
    }

    /**
     * Sets the value of the parentBankJournalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setParentBankJournalId(Long value) {
        this.parentBankJournalId = value;
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
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link BankJournalStatus }
     *     
     */
    public BankJournalStatus getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link BankJournalStatus }
     *     
     */
    public void setStatus(BankJournalStatus value) {
        this.status = value;
    }

    /**
     * Gets the value of the txAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTxAmount() {
        return txAmount;
    }

    /**
     * Sets the value of the txAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTxAmount(BigDecimal value) {
        this.txAmount = value;
    }

    /**
     * Gets the value of the txDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTxDate() {
        return txDate;
    }

    /**
     * Sets the value of the txDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTxDate(XMLGregorianCalendar value) {
        this.txDate = value;
    }

}
