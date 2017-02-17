
package com.ljwd.plms.web.wsdl.webservice.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for bankAccountDto complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="bankAccountDto">
 *   &lt;complexContent>
 *     &lt;extension base="{http://webservice.loan.mfbms.flinkmf.com/}baseVersionableCreatorAwareEntityDto">
 *       &lt;sequence>
 *       &lt;/sequence>
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="bankBranchId" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="bankAccountNo" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="bankAccountDescription" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="bankAccountName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="bankNo" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="branchBankNo" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="bankCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="bankAccountType" type="{http://webservice.loan.mfbms.flinkmf.com/}bankAccountType" />
 *       &lt;attribute name="ownerType" type="{http://webservice.loan.mfbms.flinkmf.com/}bankAccountOwnerType" />
 *       &lt;attribute name="remark" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="isValid" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="bankName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="branchName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="branchCityCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="branchCityName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "bankAccountDto")
public class BankAccountDto
    extends BaseVersionableCreatorAwareEntityDto
{

    @XmlAttribute(name = "id")
    protected Long id;
    @XmlAttribute(name = "bankBranchId")
    protected Long bankBranchId;
    @XmlAttribute(name = "bankAccountNo")
    protected String bankAccountNo;
    @XmlAttribute(name = "bankAccountDescription")
    protected String bankAccountDescription;
    @XmlAttribute(name = "bankAccountName")
    protected String bankAccountName;
    @XmlAttribute(name = "bankNo")
    protected String bankNo;
    @XmlAttribute(name = "branchBankNo")
    protected String branchBankNo;
    @XmlAttribute(name = "bankCode")
    protected String bankCode;
    @XmlAttribute(name = "bankAccountType")
    protected BankAccountType bankAccountType;
    @XmlAttribute(name = "ownerType")
    protected BankAccountOwnerType ownerType;
    @XmlAttribute(name = "remark")
    protected String remark;
    @XmlAttribute(name = "isValid")
    protected Boolean isValid;
    @XmlAttribute(name = "bankName")
    protected String bankName;
    @XmlAttribute(name = "branchName")
    protected String branchName;
    @XmlAttribute(name = "branchCityCode")
    protected String branchCityCode;
    @XmlAttribute(name = "branchCityName")
    protected String branchCityName;

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
     * Gets the value of the branchName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBranchName() {
        return branchName;
    }

    /**
     * Sets the value of the branchName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBranchName(String value) {
        this.branchName = value;
    }

    /**
     * Gets the value of the branchCityCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBranchCityCode() {
        return branchCityCode;
    }

    /**
     * Sets the value of the branchCityCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBranchCityCode(String value) {
        this.branchCityCode = value;
    }

    /**
     * Gets the value of the branchCityName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBranchCityName() {
        return branchCityName;
    }

    /**
     * Sets the value of the branchCityName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBranchCityName(String value) {
        this.branchCityName = value;
    }

}
