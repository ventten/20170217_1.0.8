
package com.ljwd.plms.web.wsdl.webservice.service;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for bankAccount complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="bankAccount">
 *   &lt;complexContent>
 *     &lt;extension base="{http://webservice.loan.mfbms.flinkmf.com/}baseVersionableCreatorAwareEntity">
 *       &lt;sequence>
 *         &lt;element name="bankAccountDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="bankAccountName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="bankAccountNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="bankAccountType" type="{http://webservice.loan.mfbms.flinkmf.com/}bankAccountType" minOccurs="0"/>
 *         &lt;element name="bankBranch" type="{http://webservice.loan.mfbms.flinkmf.com/}bankBranch" minOccurs="0"/>
 *         &lt;element name="bankBranchId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="bankCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="bankJournals" type="{http://webservice.loan.mfbms.flinkmf.com/}bankJournal" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="bankNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="branchBankNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="isDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="isRefund" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="isValid" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="offerBatches" type="{http://webservice.loan.mfbms.flinkmf.com/}offerBatch" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="offerParametersForCollectBankAcId" type="{http://webservice.loan.mfbms.flinkmf.com/}offerParameter" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="offerParametersForPayBankAcId" type="{http://webservice.loan.mfbms.flinkmf.com/}offerParameter" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ownerType" type="{http://webservice.loan.mfbms.flinkmf.com/}bankAccountOwnerType" minOccurs="0"/>
 *         &lt;element name="remark" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="repayments" type="{http://webservice.loan.mfbms.flinkmf.com/}repayment" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "bankAccount", propOrder = {
    "bankAccountDescription",
    "bankAccountName",
    "bankAccountNo",
    "bankAccountType",
    "bankBranch",
    "bankBranchId",
    "bankCode",
    "bankJournals",
    "bankNo",
    "branchBankNo",
    "isDefault",
    "isRefund",
    "isValid",
    "offerBatches",
    "offerParametersForCollectBankAcId",
    "offerParametersForPayBankAcId",
    "ownerType",
    "remark",
    "repayments"
})
public class BankAccount
    extends BaseVersionableCreatorAwareEntity
{

    protected String bankAccountDescription;
    protected String bankAccountName;
    protected String bankAccountNo;
    protected BankAccountType bankAccountType;
    protected BankBranch bankBranch;
    protected Long bankBranchId;
    protected String bankCode;
    @XmlElement(nillable = true)
    protected List<BankJournal> bankJournals;
    protected String bankNo;
    protected String branchBankNo;
    protected Boolean isDefault;
    protected Boolean isRefund;
    protected Boolean isValid;
    @XmlElement(nillable = true)
    protected List<OfferBatch> offerBatches;
    @XmlElement(nillable = true)
    protected List<OfferParameter> offerParametersForCollectBankAcId;
    @XmlElement(nillable = true)
    protected List<OfferParameter> offerParametersForPayBankAcId;
    protected BankAccountOwnerType ownerType;
    protected String remark;
    @XmlElement(nillable = true)
    protected List<Repayment> repayments;

    /**
     * Gets the value of the bankAccountDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBankAccountDescription() {
        return bankAccountDescription;
    }

    /**
     * Sets the value of the bankAccountDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBankAccountDescription(String value) {
        this.bankAccountDescription = value;
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
     * Gets the value of the bankAccountType property.
     * 
     * @return
     *     possible object is
     *     {@link BankAccountType }
     *     
     */
    public BankAccountType getBankAccountType() {
        return bankAccountType;
    }

    /**
     * Sets the value of the bankAccountType property.
     * 
     * @param value
     *     allowed object is
     *     {@link BankAccountType }
     *     
     */
    public void setBankAccountType(BankAccountType value) {
        this.bankAccountType = value;
    }

    /**
     * Gets the value of the bankBranch property.
     * 
     * @return
     *     possible object is
     *     {@link BankBranch }
     *     
     */
    public BankBranch getBankBranch() {
        return bankBranch;
    }

    /**
     * Sets the value of the bankBranch property.
     * 
     * @param value
     *     allowed object is
     *     {@link BankBranch }
     *     
     */
    public void setBankBranch(BankBranch value) {
        this.bankBranch = value;
    }

    /**
     * Gets the value of the bankBranchId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getBankBranchId() {
        return bankBranchId;
    }

    /**
     * Sets the value of the bankBranchId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setBankBranchId(Long value) {
        this.bankBranchId = value;
    }

    /**
     * Gets the value of the bankCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBankCode() {
        return bankCode;
    }

    /**
     * Sets the value of the bankCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBankCode(String value) {
        this.bankCode = value;
    }

    /**
     * Gets the value of the bankJournals property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bankJournals property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBankJournals().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BankJournal }
     * 
     * 
     */
    public List<BankJournal> getBankJournals() {
        if (bankJournals == null) {
            bankJournals = new ArrayList<BankJournal>();
        }
        return this.bankJournals;
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
     * Gets the value of the isDefault property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsDefault() {
        return isDefault;
    }

    /**
     * Sets the value of the isDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsDefault(Boolean value) {
        this.isDefault = value;
    }

    /**
     * Gets the value of the isRefund property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsRefund() {
        return isRefund;
    }

    /**
     * Sets the value of the isRefund property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsRefund(Boolean value) {
        this.isRefund = value;
    }

    /**
     * Gets the value of the isValid property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsValid() {
        return isValid;
    }

    /**
     * Sets the value of the isValid property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsValid(Boolean value) {
        this.isValid = value;
    }

    /**
     * Gets the value of the offerBatches property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the offerBatches property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOfferBatches().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OfferBatch }
     * 
     * 
     */
    public List<OfferBatch> getOfferBatches() {
        if (offerBatches == null) {
            offerBatches = new ArrayList<OfferBatch>();
        }
        return this.offerBatches;
    }

    /**
     * Gets the value of the offerParametersForCollectBankAcId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the offerParametersForCollectBankAcId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOfferParametersForCollectBankAcId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OfferParameter }
     * 
     * 
     */
    public List<OfferParameter> getOfferParametersForCollectBankAcId() {
        if (offerParametersForCollectBankAcId == null) {
            offerParametersForCollectBankAcId = new ArrayList<OfferParameter>();
        }
        return this.offerParametersForCollectBankAcId;
    }

    /**
     * Gets the value of the offerParametersForPayBankAcId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the offerParametersForPayBankAcId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOfferParametersForPayBankAcId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OfferParameter }
     * 
     * 
     */
    public List<OfferParameter> getOfferParametersForPayBankAcId() {
        if (offerParametersForPayBankAcId == null) {
            offerParametersForPayBankAcId = new ArrayList<OfferParameter>();
        }
        return this.offerParametersForPayBankAcId;
    }

    /**
     * Gets the value of the ownerType property.
     * 
     * @return
     *     possible object is
     *     {@link BankAccountOwnerType }
     *     
     */
    public BankAccountOwnerType getOwnerType() {
        return ownerType;
    }

    /**
     * Sets the value of the ownerType property.
     * 
     * @param value
     *     allowed object is
     *     {@link BankAccountOwnerType }
     *     
     */
    public void setOwnerType(BankAccountOwnerType value) {
        this.ownerType = value;
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

}
