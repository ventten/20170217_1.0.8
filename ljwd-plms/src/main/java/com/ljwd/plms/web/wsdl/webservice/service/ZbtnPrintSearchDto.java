
package com.ljwd.plms.web.wsdl.webservice.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for zbtnPrintSearchDto complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="zbtnPrintSearchDto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *       &lt;/sequence>
 *       &lt;attribute name="custName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="debitAccount" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="amountBorrow" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="loanPeriod" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="contractNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="useLoan" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="payName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="payBank" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="receivableAccount" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="contractNumber2" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="loanType" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="party" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="partyDomicile" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="partyTele" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="bName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="bIdCard" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="bTele" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="bHouse" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="bAddress" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="useLoan2" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="useAmount" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="useNumber" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="startDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="endDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="rate" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="fee" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="propertyFee" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="backBank" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="backName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="backAccount" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="payBank2" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="payName2" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="payAccount2" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="firstAmount" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="monthAmount" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="companyBank" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="companyAccount" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "zbtnPrintSearchDto")
public class ZbtnPrintSearchDto {

    @XmlAttribute(name = "custName")
    protected String custName;
    @XmlAttribute(name = "debitAccount")
    protected String debitAccount;
    @XmlAttribute(name = "amountBorrow")
    protected Long amountBorrow;
    @XmlAttribute(name = "loanPeriod")
    protected Long loanPeriod;
    @XmlAttribute(name = "contractNumber")
    protected String contractNumber;
    @XmlAttribute(name = "useLoan")
    protected String useLoan;
    @XmlAttribute(name = "payName")
    protected String payName;
    @XmlAttribute(name = "payBank")
    protected String payBank;
    @XmlAttribute(name = "receivableAccount")
    protected String receivableAccount;
    @XmlAttribute(name = "contractNumber2")
    protected String contractNumber2;
    @XmlAttribute(name = "loanType")
    protected String loanType;
    @XmlAttribute(name = "party")
    protected String party;
    @XmlAttribute(name = "partyDomicile")
    protected String partyDomicile;
    @XmlAttribute(name = "partyTele")
    protected String partyTele;
    @XmlAttribute(name = "bName")
    protected String bName;
    @XmlAttribute(name = "bIdCard")
    protected String bIdCard;
    @XmlAttribute(name = "bTele")
    protected String bTele;
    @XmlAttribute(name = "bHouse")
    protected String bHouse;
    @XmlAttribute(name = "bAddress")
    protected String bAddress;
    @XmlAttribute(name = "useLoan2")
    protected String useLoan2;
    @XmlAttribute(name = "useAmount")
    protected Long useAmount;
    @XmlAttribute(name = "useNumber")
    protected Long useNumber;
    @XmlAttribute(name = "startDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar startDate;
    @XmlAttribute(name = "endDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar endDate;
    @XmlAttribute(name = "rate")
    protected String rate;
    @XmlAttribute(name = "fee")
    protected Long fee;
    @XmlAttribute(name = "propertyFee")
    protected String propertyFee;
    @XmlAttribute(name = "backBank")
    protected String backBank;
    @XmlAttribute(name = "backName")
    protected String backName;
    @XmlAttribute(name = "backAccount")
    protected String backAccount;
    @XmlAttribute(name = "payBank2")
    protected String payBank2;
    @XmlAttribute(name = "payName2")
    protected String payName2;
    @XmlAttribute(name = "payAccount2")
    protected String payAccount2;
    @XmlAttribute(name = "firstAmount")
    protected Long firstAmount;
    @XmlAttribute(name = "monthAmount")
    protected Long monthAmount;
    @XmlAttribute(name = "companyBank")
    protected String companyBank;
    @XmlAttribute(name = "companyAccount")
    protected String companyAccount;

    /**
     * Gets the value of the custName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustName() {
        return custName;
    }

    /**
     * Sets the value of the custName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustName(String value) {
        this.custName = value;
    }

    /**
     * Gets the value of the debitAccount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDebitAccount() {
        return debitAccount;
    }

    /**
     * Sets the value of the debitAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDebitAccount(String value) {
        this.debitAccount = value;
    }

    /**
     * Gets the value of the amountBorrow property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getAmountBorrow() {
        return amountBorrow;
    }

    /**
     * Sets the value of the amountBorrow property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setAmountBorrow(Long value) {
        this.amountBorrow = value;
    }

    /**
     * Gets the value of the loanPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getLoanPeriod() {
        return loanPeriod;
    }

    /**
     * Sets the value of the loanPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setLoanPeriod(Long value) {
        this.loanPeriod = value;
    }

    /**
     * Gets the value of the contractNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContractNumber() {
        return contractNumber;
    }

    /**
     * Sets the value of the contractNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContractNumber(String value) {
        this.contractNumber = value;
    }

    /**
     * Gets the value of the useLoan property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUseLoan() {
        return useLoan;
    }

    /**
     * Sets the value of the useLoan property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUseLoan(String value) {
        this.useLoan = value;
    }

    /**
     * Gets the value of the payName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPayName() {
        return payName;
    }

    /**
     * Sets the value of the payName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPayName(String value) {
        this.payName = value;
    }

    /**
     * Gets the value of the payBank property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPayBank() {
        return payBank;
    }

    /**
     * Sets the value of the payBank property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPayBank(String value) {
        this.payBank = value;
    }

    /**
     * Gets the value of the receivableAccount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReceivableAccount() {
        return receivableAccount;
    }

    /**
     * Sets the value of the receivableAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReceivableAccount(String value) {
        this.receivableAccount = value;
    }

    /**
     * Gets the value of the contractNumber2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContractNumber2() {
        return contractNumber2;
    }

    /**
     * Sets the value of the contractNumber2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContractNumber2(String value) {
        this.contractNumber2 = value;
    }

    /**
     * Gets the value of the loanType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLoanType() {
        return loanType;
    }

    /**
     * Sets the value of the loanType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLoanType(String value) {
        this.loanType = value;
    }

    /**
     * Gets the value of the party property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParty() {
        return party;
    }

    /**
     * Sets the value of the party property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParty(String value) {
        this.party = value;
    }

    /**
     * Gets the value of the partyDomicile property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartyDomicile() {
        return partyDomicile;
    }

    /**
     * Sets the value of the partyDomicile property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartyDomicile(String value) {
        this.partyDomicile = value;
    }

    /**
     * Gets the value of the partyTele property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartyTele() {
        return partyTele;
    }

    /**
     * Sets the value of the partyTele property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartyTele(String value) {
        this.partyTele = value;
    }

    /**
     * Gets the value of the bName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBName() {
        return bName;
    }

    /**
     * Sets the value of the bName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBName(String value) {
        this.bName = value;
    }

    /**
     * Gets the value of the bIdCard property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBIdCard() {
        return bIdCard;
    }

    /**
     * Sets the value of the bIdCard property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBIdCard(String value) {
        this.bIdCard = value;
    }

    /**
     * Gets the value of the bTele property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBTele() {
        return bTele;
    }

    /**
     * Sets the value of the bTele property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBTele(String value) {
        this.bTele = value;
    }

    /**
     * Gets the value of the bHouse property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBHouse() {
        return bHouse;
    }

    /**
     * Sets the value of the bHouse property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBHouse(String value) {
        this.bHouse = value;
    }

    /**
     * Gets the value of the bAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBAddress() {
        return bAddress;
    }

    /**
     * Sets the value of the bAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBAddress(String value) {
        this.bAddress = value;
    }

    /**
     * Gets the value of the useLoan2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUseLoan2() {
        return useLoan2;
    }

    /**
     * Sets the value of the useLoan2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUseLoan2(String value) {
        this.useLoan2 = value;
    }

    /**
     * Gets the value of the useAmount property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getUseAmount() {
        return useAmount;
    }

    /**
     * Sets the value of the useAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setUseAmount(Long value) {
        this.useAmount = value;
    }

    /**
     * Gets the value of the useNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getUseNumber() {
        return useNumber;
    }

    /**
     * Sets the value of the useNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setUseNumber(Long value) {
        this.useNumber = value;
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
     * Gets the value of the rate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRate() {
        return rate;
    }

    /**
     * Sets the value of the rate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRate(String value) {
        this.rate = value;
    }

    /**
     * Gets the value of the fee property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getFee() {
        return fee;
    }

    /**
     * Sets the value of the fee property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setFee(Long value) {
        this.fee = value;
    }

    /**
     * Gets the value of the propertyFee property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPropertyFee() {
        return propertyFee;
    }

    /**
     * Sets the value of the propertyFee property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPropertyFee(String value) {
        this.propertyFee = value;
    }

    /**
     * Gets the value of the backBank property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBackBank() {
        return backBank;
    }

    /**
     * Sets the value of the backBank property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBackBank(String value) {
        this.backBank = value;
    }

    /**
     * Gets the value of the backName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBackName() {
        return backName;
    }

    /**
     * Sets the value of the backName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBackName(String value) {
        this.backName = value;
    }

    /**
     * Gets the value of the backAccount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBackAccount() {
        return backAccount;
    }

    /**
     * Sets the value of the backAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBackAccount(String value) {
        this.backAccount = value;
    }

    /**
     * Gets the value of the payBank2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPayBank2() {
        return payBank2;
    }

    /**
     * Sets the value of the payBank2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPayBank2(String value) {
        this.payBank2 = value;
    }

    /**
     * Gets the value of the payName2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPayName2() {
        return payName2;
    }

    /**
     * Sets the value of the payName2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPayName2(String value) {
        this.payName2 = value;
    }

    /**
     * Gets the value of the payAccount2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPayAccount2() {
        return payAccount2;
    }

    /**
     * Sets the value of the payAccount2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPayAccount2(String value) {
        this.payAccount2 = value;
    }

    /**
     * Gets the value of the firstAmount property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getFirstAmount() {
        return firstAmount;
    }

    /**
     * Sets the value of the firstAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setFirstAmount(Long value) {
        this.firstAmount = value;
    }

    /**
     * Gets the value of the monthAmount property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMonthAmount() {
        return monthAmount;
    }

    /**
     * Sets the value of the monthAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMonthAmount(Long value) {
        this.monthAmount = value;
    }

    /**
     * Gets the value of the companyBank property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompanyBank() {
        return companyBank;
    }

    /**
     * Sets the value of the companyBank property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompanyBank(String value) {
        this.companyBank = value;
    }

    /**
     * Gets the value of the companyAccount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompanyAccount() {
        return companyAccount;
    }

    /**
     * Sets the value of the companyAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompanyAccount(String value) {
        this.companyAccount = value;
    }

}
