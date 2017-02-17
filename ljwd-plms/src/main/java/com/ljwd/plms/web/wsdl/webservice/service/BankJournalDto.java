
package com.ljwd.plms.web.wsdl.webservice.service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for bankJournalDto complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="bankJournalDto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="bankAssigns" type="{http://webservice.loan.mfbms.flinkmf.com/}bankAssignDto" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="batchNo" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="itemNo" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="txDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="bankNo" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="branchBankNo" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="bankName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="txAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       &lt;attribute name="bankAccountName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="idCardNo" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="bankAccountNo" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="inputtedBy" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="inputTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="status" type="{http://webservice.loan.mfbms.flinkmf.com/}bankJournalStatus" />
 *       &lt;attribute name="remark" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="companyBankAC" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="bankAccountId" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="paidDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="parentBankJournalId" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="reason" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="suspendReason" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="assignBys" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="contractNos" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="bankACNo" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="renAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       &lt;attribute name="noRenAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       &lt;attribute name="importTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="sumaryReason" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="actorType" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="revokeReason" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="actionTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="actionBy" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="paymentType" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="subId" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="assignAmt" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "bankJournalDto", propOrder = {
    "bankAssigns"
})
public class BankJournalDto {

    @XmlElement(nillable = true)
    protected List<BankAssignDto> bankAssigns;
    @XmlAttribute(name = "id")
    protected Long id;
    @XmlAttribute(name = "batchNo")
    protected String batchNo;
    @XmlAttribute(name = "itemNo")
    protected String itemNo;
    @XmlAttribute(name = "txDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar txDate;
    @XmlAttribute(name = "bankNo")
    protected String bankNo;
    @XmlAttribute(name = "branchBankNo")
    protected String branchBankNo;
    @XmlAttribute(name = "bankName")
    protected String bankName;
    @XmlAttribute(name = "txAmount")
    protected BigDecimal txAmount;
    @XmlAttribute(name = "bankAccountName")
    protected String bankAccountName;
    @XmlAttribute(name = "idCardNo")
    protected String idCardNo;
    @XmlAttribute(name = "bankAccountNo")
    protected String bankAccountNo;
    @XmlAttribute(name = "inputtedBy")
    protected String inputtedBy;
    @XmlAttribute(name = "inputTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inputTime;
    @XmlAttribute(name = "status")
    protected BankJournalStatus status;
    @XmlAttribute(name = "remark")
    protected String remark;
    @XmlAttribute(name = "companyBankAC")
    protected String companyBankAC;
    @XmlAttribute(name = "bankAccountId")
    protected Long bankAccountId;
    @XmlAttribute(name = "paidDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar paidDate;
    @XmlAttribute(name = "parentBankJournalId")
    protected Long parentBankJournalId;
    @XmlAttribute(name = "reason")
    protected String reason;
    @XmlAttribute(name = "suspendReason")
    protected String suspendReason;
    @XmlAttribute(name = "assignBys")
    protected String assignBys;
    @XmlAttribute(name = "contractNos")
    protected String contractNos;
    @XmlAttribute(name = "bankACNo")
    protected String bankACNo;
    @XmlAttribute(name = "renAmount")
    protected BigDecimal renAmount;
    @XmlAttribute(name = "noRenAmount")
    protected BigDecimal noRenAmount;
    @XmlAttribute(name = "importTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar importTime;
    @XmlAttribute(name = "sumaryReason")
    protected String sumaryReason;
    @XmlAttribute(name = "actorType")
    protected String actorType;
    @XmlAttribute(name = "revokeReason")
    protected String revokeReason;
    @XmlAttribute(name = "actionTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar actionTime;
    @XmlAttribute(name = "actionBy")
    protected String actionBy;
    @XmlAttribute(name = "paymentType")
    protected String paymentType;
    @XmlAttribute(name = "subId")
    protected Long subId;
    @XmlAttribute(name = "assignAmt")
    protected BigDecimal assignAmt;

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
     * {@link BankAssignDto }
     * 
     * 
     */
    public List<BankAssignDto> getBankAssigns() {
        if (bankAssigns == null) {
            bankAssigns = new ArrayList<BankAssignDto>();
        }
        return this.bankAssigns;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setId(Long value) {
        this.id = value;
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
     * Gets the value of the reason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReason() {
        return reason;
    }

    /**
     * Sets the value of the reason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReason(String value) {
        this.reason = value;
    }

    /**
     * Gets the value of the suspendReason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSuspendReason() {
        return suspendReason;
    }

    /**
     * Sets the value of the suspendReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSuspendReason(String value) {
        this.suspendReason = value;
    }

    /**
     * Gets the value of the assignBys property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssignBys() {
        return assignBys;
    }

    /**
     * Sets the value of the assignBys property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssignBys(String value) {
        this.assignBys = value;
    }

    /**
     * Gets the value of the contractNos property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContractNos() {
        return contractNos;
    }

    /**
     * Sets the value of the contractNos property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContractNos(String value) {
        this.contractNos = value;
    }

    /**
     * Gets the value of the bankACNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBankACNo() {
        return bankACNo;
    }

    /**
     * Sets the value of the bankACNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBankACNo(String value) {
        this.bankACNo = value;
    }

    /**
     * Gets the value of the renAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRenAmount() {
        return renAmount;
    }

    /**
     * Sets the value of the renAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRenAmount(BigDecimal value) {
        this.renAmount = value;
    }

    /**
     * Gets the value of the noRenAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNoRenAmount() {
        return noRenAmount;
    }

    /**
     * Sets the value of the noRenAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setNoRenAmount(BigDecimal value) {
        this.noRenAmount = value;
    }

    /**
     * Gets the value of the importTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getImportTime() {
        return importTime;
    }

    /**
     * Sets the value of the importTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setImportTime(XMLGregorianCalendar value) {
        this.importTime = value;
    }

    /**
     * Gets the value of the sumaryReason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSumaryReason() {
        return sumaryReason;
    }

    /**
     * Sets the value of the sumaryReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSumaryReason(String value) {
        this.sumaryReason = value;
    }

    /**
     * Gets the value of the actorType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActorType() {
        return actorType;
    }

    /**
     * Sets the value of the actorType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActorType(String value) {
        this.actorType = value;
    }

    /**
     * Gets the value of the revokeReason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRevokeReason() {
        return revokeReason;
    }

    /**
     * Sets the value of the revokeReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRevokeReason(String value) {
        this.revokeReason = value;
    }

    /**
     * Gets the value of the actionTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getActionTime() {
        return actionTime;
    }

    /**
     * Sets the value of the actionTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setActionTime(XMLGregorianCalendar value) {
        this.actionTime = value;
    }

    /**
     * Gets the value of the actionBy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActionBy() {
        return actionBy;
    }

    /**
     * Sets the value of the actionBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActionBy(String value) {
        this.actionBy = value;
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
     * Gets the value of the subId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSubId() {
        return subId;
    }

    /**
     * Sets the value of the subId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSubId(Long value) {
        this.subId = value;
    }

    /**
     * Gets the value of the assignAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAssignAmt() {
        return assignAmt;
    }

    /**
     * Sets the value of the assignAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAssignAmt(BigDecimal value) {
        this.assignAmt = value;
    }

}
