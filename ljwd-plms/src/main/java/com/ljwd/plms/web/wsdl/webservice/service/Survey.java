
package com.ljwd.plms.web.wsdl.webservice.service;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for survey complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="survey">
 *   &lt;complexContent>
 *     &lt;extension base="{http://webservice.loan.mfbms.flinkmf.com/}baseVersionableCreatorAwareEntity">
 *       &lt;sequence>
 *         &lt;element name="address" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="age" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="applicationAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="applicationInfo" type="{http://webservice.loan.mfbms.flinkmf.com/}applicationInfo" minOccurs="0"/>
 *         &lt;element name="badnessAnnal" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="badnessStatus" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="bankAccount" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="contactor" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="contractFee" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="contractFeeAdjust" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="contractItem" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="contractRate" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="contractRateAdjustFlag" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="coroprationLicense" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="customer" type="{http://webservice.loan.mfbms.flinkmf.com/}customer" minOccurs="0"/>
 *         &lt;element name="debitRate" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="fieldSurvey" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="homeAddress" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="houseInfo" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="incomeInfo" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="isBankAccount" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="isCheck" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="loanPeriod" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="maxLoanAmount" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="monthlyRepayment" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="overdueRenewal" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="personalIncome" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="rejectReason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="remark" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="reopenedBacklist" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="servYearPosition" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="sixtyUp" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="socialSecurity" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="surveyResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="surveyTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="surveyUser" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="thirtyLess" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="thirtySixty" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="totalDebitAmount" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="workCoropration" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="workPeriod" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="workProve" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "survey", propOrder = {
    "address",
    "age",
    "applicationAmount",
    "applicationInfo",
    "badnessAnnal",
    "badnessStatus",
    "bankAccount",
    "contactor",
    "contractFee",
    "contractFeeAdjust",
    "contractItem",
    "contractRate",
    "contractRateAdjustFlag",
    "coroprationLicense",
    "customer",
    "debitRate",
    "fieldSurvey",
    "homeAddress",
    "houseInfo",
    "incomeInfo",
    "isBankAccount",
    "isCheck",
    "loanPeriod",
    "maxLoanAmount",
    "monthlyRepayment",
    "overdueRenewal",
    "personalIncome",
    "rejectReason",
    "remark",
    "reopenedBacklist",
    "servYearPosition",
    "sixtyUp",
    "socialSecurity",
    "surveyResult",
    "surveyTime",
    "surveyUser",
    "thirtyLess",
    "thirtySixty",
    "totalDebitAmount",
    "workCoropration",
    "workPeriod",
    "workProve"
})
public class Survey
    extends BaseVersionableCreatorAwareEntity
{

    protected Boolean address;
    protected Boolean age;
    protected BigDecimal applicationAmount;
    protected ApplicationInfo applicationInfo;
    protected Boolean badnessAnnal;
    protected Boolean badnessStatus;
    protected Boolean bankAccount;
    protected Boolean contactor;
    protected Boolean contractFee;
    protected Integer contractFeeAdjust;
    protected String contractItem;
    protected Boolean contractRate;
    protected Integer contractRateAdjustFlag;
    protected Boolean coroprationLicense;
    protected Customer customer;
    protected Boolean debitRate;
    protected Boolean fieldSurvey;
    protected Boolean homeAddress;
    protected Boolean houseInfo;
    protected Boolean incomeInfo;
    protected Boolean isBankAccount;
    protected Boolean isCheck;
    protected Boolean loanPeriod;
    protected Boolean maxLoanAmount;
    protected Boolean monthlyRepayment;
    protected Boolean overdueRenewal;
    protected Boolean personalIncome;
    protected String rejectReason;
    protected String remark;
    protected Boolean reopenedBacklist;
    protected Boolean servYearPosition;
    protected Integer sixtyUp;
    protected Boolean socialSecurity;
    protected String surveyResult;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar surveyTime;
    protected String surveyUser;
    protected Integer thirtyLess;
    protected Integer thirtySixty;
    protected Boolean totalDebitAmount;
    protected Boolean workCoropration;
    protected Boolean workPeriod;
    protected Boolean workProve;

    /**
     * Gets the value of the address property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAddress() {
        return address;
    }

    /**
     * Sets the value of the address property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAddress(Boolean value) {
        this.address = value;
    }

    /**
     * Gets the value of the age property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAge() {
        return age;
    }

    /**
     * Sets the value of the age property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAge(Boolean value) {
        this.age = value;
    }

    /**
     * Gets the value of the applicationAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getApplicationAmount() {
        return applicationAmount;
    }

    /**
     * Sets the value of the applicationAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setApplicationAmount(BigDecimal value) {
        this.applicationAmount = value;
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
     * Gets the value of the badnessAnnal property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBadnessAnnal() {
        return badnessAnnal;
    }

    /**
     * Sets the value of the badnessAnnal property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBadnessAnnal(Boolean value) {
        this.badnessAnnal = value;
    }

    /**
     * Gets the value of the badnessStatus property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBadnessStatus() {
        return badnessStatus;
    }

    /**
     * Sets the value of the badnessStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBadnessStatus(Boolean value) {
        this.badnessStatus = value;
    }

    /**
     * Gets the value of the bankAccount property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBankAccount() {
        return bankAccount;
    }

    /**
     * Sets the value of the bankAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBankAccount(Boolean value) {
        this.bankAccount = value;
    }

    /**
     * Gets the value of the contactor property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isContactor() {
        return contactor;
    }

    /**
     * Sets the value of the contactor property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setContactor(Boolean value) {
        this.contactor = value;
    }

    /**
     * Gets the value of the contractFee property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isContractFee() {
        return contractFee;
    }

    /**
     * Sets the value of the contractFee property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setContractFee(Boolean value) {
        this.contractFee = value;
    }

    /**
     * Gets the value of the contractFeeAdjust property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getContractFeeAdjust() {
        return contractFeeAdjust;
    }

    /**
     * Sets the value of the contractFeeAdjust property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setContractFeeAdjust(Integer value) {
        this.contractFeeAdjust = value;
    }

    /**
     * Gets the value of the contractItem property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContractItem() {
        return contractItem;
    }

    /**
     * Sets the value of the contractItem property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContractItem(String value) {
        this.contractItem = value;
    }

    /**
     * Gets the value of the contractRate property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isContractRate() {
        return contractRate;
    }

    /**
     * Sets the value of the contractRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setContractRate(Boolean value) {
        this.contractRate = value;
    }

    /**
     * Gets the value of the contractRateAdjustFlag property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getContractRateAdjustFlag() {
        return contractRateAdjustFlag;
    }

    /**
     * Sets the value of the contractRateAdjustFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setContractRateAdjustFlag(Integer value) {
        this.contractRateAdjustFlag = value;
    }

    /**
     * Gets the value of the coroprationLicense property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCoroprationLicense() {
        return coroprationLicense;
    }

    /**
     * Sets the value of the coroprationLicense property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCoroprationLicense(Boolean value) {
        this.coroprationLicense = value;
    }

    /**
     * Gets the value of the customer property.
     * 
     * @return
     *     possible object is
     *     {@link Customer }
     *     
     */
    public Customer getCustomer() {
        return customer;
    }

    /**
     * Sets the value of the customer property.
     * 
     * @param value
     *     allowed object is
     *     {@link Customer }
     *     
     */
    public void setCustomer(Customer value) {
        this.customer = value;
    }

    /**
     * Gets the value of the debitRate property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDebitRate() {
        return debitRate;
    }

    /**
     * Sets the value of the debitRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDebitRate(Boolean value) {
        this.debitRate = value;
    }

    /**
     * Gets the value of the fieldSurvey property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFieldSurvey() {
        return fieldSurvey;
    }

    /**
     * Sets the value of the fieldSurvey property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFieldSurvey(Boolean value) {
        this.fieldSurvey = value;
    }

    /**
     * Gets the value of the homeAddress property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHomeAddress() {
        return homeAddress;
    }

    /**
     * Sets the value of the homeAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHomeAddress(Boolean value) {
        this.homeAddress = value;
    }

    /**
     * Gets the value of the houseInfo property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHouseInfo() {
        return houseInfo;
    }

    /**
     * Sets the value of the houseInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHouseInfo(Boolean value) {
        this.houseInfo = value;
    }

    /**
     * Gets the value of the incomeInfo property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIncomeInfo() {
        return incomeInfo;
    }

    /**
     * Sets the value of the incomeInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIncomeInfo(Boolean value) {
        this.incomeInfo = value;
    }

    /**
     * Gets the value of the isBankAccount property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsBankAccount() {
        return isBankAccount;
    }

    /**
     * Sets the value of the isBankAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsBankAccount(Boolean value) {
        this.isBankAccount = value;
    }

    /**
     * Gets the value of the isCheck property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsCheck() {
        return isCheck;
    }

    /**
     * Sets the value of the isCheck property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsCheck(Boolean value) {
        this.isCheck = value;
    }

    /**
     * Gets the value of the loanPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLoanPeriod() {
        return loanPeriod;
    }

    /**
     * Sets the value of the loanPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLoanPeriod(Boolean value) {
        this.loanPeriod = value;
    }

    /**
     * Gets the value of the maxLoanAmount property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMaxLoanAmount() {
        return maxLoanAmount;
    }

    /**
     * Sets the value of the maxLoanAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMaxLoanAmount(Boolean value) {
        this.maxLoanAmount = value;
    }

    /**
     * Gets the value of the monthlyRepayment property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMonthlyRepayment() {
        return monthlyRepayment;
    }

    /**
     * Sets the value of the monthlyRepayment property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMonthlyRepayment(Boolean value) {
        this.monthlyRepayment = value;
    }

    /**
     * Gets the value of the overdueRenewal property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOverdueRenewal() {
        return overdueRenewal;
    }

    /**
     * Sets the value of the overdueRenewal property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOverdueRenewal(Boolean value) {
        this.overdueRenewal = value;
    }

    /**
     * Gets the value of the personalIncome property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPersonalIncome() {
        return personalIncome;
    }

    /**
     * Sets the value of the personalIncome property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPersonalIncome(Boolean value) {
        this.personalIncome = value;
    }

    /**
     * Gets the value of the rejectReason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRejectReason() {
        return rejectReason;
    }

    /**
     * Sets the value of the rejectReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRejectReason(String value) {
        this.rejectReason = value;
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
     * Gets the value of the reopenedBacklist property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isReopenedBacklist() {
        return reopenedBacklist;
    }

    /**
     * Sets the value of the reopenedBacklist property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setReopenedBacklist(Boolean value) {
        this.reopenedBacklist = value;
    }

    /**
     * Gets the value of the servYearPosition property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isServYearPosition() {
        return servYearPosition;
    }

    /**
     * Sets the value of the servYearPosition property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setServYearPosition(Boolean value) {
        this.servYearPosition = value;
    }

    /**
     * Gets the value of the sixtyUp property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSixtyUp() {
        return sixtyUp;
    }

    /**
     * Sets the value of the sixtyUp property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSixtyUp(Integer value) {
        this.sixtyUp = value;
    }

    /**
     * Gets the value of the socialSecurity property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSocialSecurity() {
        return socialSecurity;
    }

    /**
     * Sets the value of the socialSecurity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSocialSecurity(Boolean value) {
        this.socialSecurity = value;
    }

    /**
     * Gets the value of the surveyResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSurveyResult() {
        return surveyResult;
    }

    /**
     * Sets the value of the surveyResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSurveyResult(String value) {
        this.surveyResult = value;
    }

    /**
     * Gets the value of the surveyTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSurveyTime() {
        return surveyTime;
    }

    /**
     * Sets the value of the surveyTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSurveyTime(XMLGregorianCalendar value) {
        this.surveyTime = value;
    }

    /**
     * Gets the value of the surveyUser property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSurveyUser() {
        return surveyUser;
    }

    /**
     * Sets the value of the surveyUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSurveyUser(String value) {
        this.surveyUser = value;
    }

    /**
     * Gets the value of the thirtyLess property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getThirtyLess() {
        return thirtyLess;
    }

    /**
     * Sets the value of the thirtyLess property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setThirtyLess(Integer value) {
        this.thirtyLess = value;
    }

    /**
     * Gets the value of the thirtySixty property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getThirtySixty() {
        return thirtySixty;
    }

    /**
     * Sets the value of the thirtySixty property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setThirtySixty(Integer value) {
        this.thirtySixty = value;
    }

    /**
     * Gets the value of the totalDebitAmount property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTotalDebitAmount() {
        return totalDebitAmount;
    }

    /**
     * Sets the value of the totalDebitAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTotalDebitAmount(Boolean value) {
        this.totalDebitAmount = value;
    }

    /**
     * Gets the value of the workCoropration property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isWorkCoropration() {
        return workCoropration;
    }

    /**
     * Sets the value of the workCoropration property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setWorkCoropration(Boolean value) {
        this.workCoropration = value;
    }

    /**
     * Gets the value of the workPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isWorkPeriod() {
        return workPeriod;
    }

    /**
     * Sets the value of the workPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setWorkPeriod(Boolean value) {
        this.workPeriod = value;
    }

    /**
     * Gets the value of the workProve property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isWorkProve() {
        return workProve;
    }

    /**
     * Sets the value of the workProve property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setWorkProve(Boolean value) {
        this.workProve = value;
    }

}
