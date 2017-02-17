
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
 * <p>Java class for customer complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="customer">
 *   &lt;complexContent>
 *     &lt;extension base="{http://webservice.loan.mfbms.flinkmf.com/}baseVersionableCreatorAwareEntity">
 *       &lt;sequence>
 *         &lt;element name="accountInfos" type="{http://webservice.loan.mfbms.flinkmf.com/}accountInfo" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="age" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="applicationInfo" type="{http://webservice.loan.mfbms.flinkmf.com/}applicationInfo" minOccurs="0"/>
 *         &lt;element name="birthPlace" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="birthday" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="carLoanAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="carMonthlyRepayment" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="carPurchaseMethod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="childrenInSz" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="contactors" type="{http://webservice.loan.mfbms.flinkmf.com/}contactor" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="creditCardNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="creditCardOneBank" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="creditCardOneLimit" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="creditCardTotalLimit" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="creditCardTotalNumber" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="customerName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="customerType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="education" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="estateLoanAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="estateMonthlyRepayment" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="estatePurchaseMode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="gender" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="houseCertNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="houseEstimateAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="houseInfoType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="houseInfos" type="{http://webservice.loan.mfbms.flinkmf.com/}houseInfo" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="houseLoanAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="houseMortgageBank" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="houseMortgageDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="houseNumer" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="houseRepayAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="household" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="idAddressAreaId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="idAddressCityId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="idAddressDetails" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="idAddressProvinceId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="idCardEndDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="idCardIssuedBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="idCardNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="idTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="investment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="isKnown" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="liveTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="mailAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="mailType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="marriage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="mobile" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="mobile2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="mobile3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="periodInfos" type="{http://webservice.loan.mfbms.flinkmf.com/}periodInfo" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="policyInfos" type="{http://webservice.loan.mfbms.flinkmf.com/}policyInfo" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="professions" type="{http://webservice.loan.mfbms.flinkmf.com/}profession" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="qqNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="remark" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="socialSecurity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="spouseAge" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="spouseIdAddr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="spouseIdAddrAreaId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="spouseIdAddrCityId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="spouseIdAddrDetails" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="spouseIdAddrProvinceId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="spouseIdCardNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="spouseMonthlyIncome" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="spouseName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="spouseTelephone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="spouseTelephone2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="spouseTelephone3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="spouseUnit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="spouseUnitAddrAreaId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="spouseUnitAddrCityId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="spouseUnitAddrDetails" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="spouseUnitAddrProvinceId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="spouseUnitAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="spouseUnitDepartment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="spouseUnitPosition" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="spouseUnitTelephone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="surveys" type="{http://webservice.loan.mfbms.flinkmf.com/}survey" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="tempIdNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="zipCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "customer", propOrder = {
    "accountInfos",
    "age",
    "applicationInfo",
    "birthPlace",
    "birthday",
    "carLoanAmount",
    "carMonthlyRepayment",
    "carPurchaseMethod",
    "childrenInSz",
    "contactors",
    "creditCardNo",
    "creditCardOneBank",
    "creditCardOneLimit",
    "creditCardTotalLimit",
    "creditCardTotalNumber",
    "customerName",
    "customerType",
    "education",
    "estateLoanAmount",
    "estateMonthlyRepayment",
    "estatePurchaseMode",
    "gender",
    "houseCertNo",
    "houseEstimateAmount",
    "houseInfoType",
    "houseInfos",
    "houseLoanAmount",
    "houseMortgageBank",
    "houseMortgageDate",
    "houseNumer",
    "houseRepayAmount",
    "household",
    "idAddressAreaId",
    "idAddressCityId",
    "idAddressDetails",
    "idAddressProvinceId",
    "idCardEndDate",
    "idCardIssuedBy",
    "idCardNo",
    "idTypeCode",
    "investment",
    "isKnown",
    "liveTime",
    "mailAddress",
    "mailType",
    "marriage",
    "mobile",
    "mobile2",
    "mobile3",
    "periodInfos",
    "policyInfos",
    "professions",
    "qqNo",
    "remark",
    "socialSecurity",
    "spouseAge",
    "spouseIdAddr",
    "spouseIdAddrAreaId",
    "spouseIdAddrCityId",
    "spouseIdAddrDetails",
    "spouseIdAddrProvinceId",
    "spouseIdCardNo",
    "spouseMonthlyIncome",
    "spouseName",
    "spouseTelephone",
    "spouseTelephone2",
    "spouseTelephone3",
    "spouseUnit",
    "spouseUnitAddrAreaId",
    "spouseUnitAddrCityId",
    "spouseUnitAddrDetails",
    "spouseUnitAddrProvinceId",
    "spouseUnitAddress",
    "spouseUnitDepartment",
    "spouseUnitPosition",
    "spouseUnitTelephone",
    "surveys",
    "tempIdNo",
    "zipCode"
})
public class Customer
    extends BaseVersionableCreatorAwareEntity
{

    @XmlElement(nillable = true)
    protected List<AccountInfo> accountInfos;
    protected Integer age;
    protected ApplicationInfo applicationInfo;
    protected String birthPlace;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar birthday;
    protected BigDecimal carLoanAmount;
    protected BigDecimal carMonthlyRepayment;
    protected String carPurchaseMethod;
    protected Boolean childrenInSz;
    @XmlElement(nillable = true)
    protected List<Contactor> contactors;
    protected String creditCardNo;
    protected String creditCardOneBank;
    protected BigDecimal creditCardOneLimit;
    protected BigDecimal creditCardTotalLimit;
    protected Integer creditCardTotalNumber;
    protected String customerName;
    protected String customerType;
    protected String education;
    protected BigDecimal estateLoanAmount;
    protected BigDecimal estateMonthlyRepayment;
    protected String estatePurchaseMode;
    protected String gender;
    protected String houseCertNo;
    protected BigDecimal houseEstimateAmount;
    protected String houseInfoType;
    @XmlElement(nillable = true)
    protected List<HouseInfo> houseInfos;
    protected BigDecimal houseLoanAmount;
    protected String houseMortgageBank;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar houseMortgageDate;
    protected Integer houseNumer;
    protected BigDecimal houseRepayAmount;
    protected String household;
    protected Long idAddressAreaId;
    protected Long idAddressCityId;
    protected String idAddressDetails;
    protected Long idAddressProvinceId;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar idCardEndDate;
    protected String idCardIssuedBy;
    protected String idCardNo;
    protected String idTypeCode;
    protected String investment;
    protected Boolean isKnown;
    protected String liveTime;
    protected String mailAddress;
    protected String mailType;
    protected String marriage;
    protected String mobile;
    protected String mobile2;
    protected String mobile3;
    @XmlElement(nillable = true)
    protected List<PeriodInfo> periodInfos;
    @XmlElement(nillable = true)
    protected List<PolicyInfo> policyInfos;
    @XmlElement(nillable = true)
    protected List<Profession> professions;
    protected String qqNo;
    protected String remark;
    protected String socialSecurity;
    protected Integer spouseAge;
    protected String spouseIdAddr;
    protected Long spouseIdAddrAreaId;
    protected Long spouseIdAddrCityId;
    protected String spouseIdAddrDetails;
    protected Long spouseIdAddrProvinceId;
    protected String spouseIdCardNo;
    protected BigDecimal spouseMonthlyIncome;
    protected String spouseName;
    protected String spouseTelephone;
    protected String spouseTelephone2;
    protected String spouseTelephone3;
    protected String spouseUnit;
    protected Long spouseUnitAddrAreaId;
    protected Long spouseUnitAddrCityId;
    protected String spouseUnitAddrDetails;
    protected Long spouseUnitAddrProvinceId;
    protected String spouseUnitAddress;
    protected String spouseUnitDepartment;
    protected String spouseUnitPosition;
    protected String spouseUnitTelephone;
    @XmlElement(nillable = true)
    protected List<Survey> surveys;
    protected String tempIdNo;
    protected String zipCode;

    /**
     * Gets the value of the accountInfos property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the accountInfos property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAccountInfos().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AccountInfo }
     * 
     * 
     */
    public List<AccountInfo> getAccountInfos() {
        if (accountInfos == null) {
            accountInfos = new ArrayList<AccountInfo>();
        }
        return this.accountInfos;
    }

    /**
     * Gets the value of the age property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAge() {
        return age;
    }

    /**
     * Sets the value of the age property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAge(Integer value) {
        this.age = value;
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
     * Gets the value of the birthPlace property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBirthPlace() {
        return birthPlace;
    }

    /**
     * Sets the value of the birthPlace property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBirthPlace(String value) {
        this.birthPlace = value;
    }

    /**
     * Gets the value of the birthday property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getBirthday() {
        return birthday;
    }

    /**
     * Sets the value of the birthday property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setBirthday(XMLGregorianCalendar value) {
        this.birthday = value;
    }

    /**
     * Gets the value of the carLoanAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCarLoanAmount() {
        return carLoanAmount;
    }

    /**
     * Sets the value of the carLoanAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCarLoanAmount(BigDecimal value) {
        this.carLoanAmount = value;
    }

    /**
     * Gets the value of the carMonthlyRepayment property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCarMonthlyRepayment() {
        return carMonthlyRepayment;
    }

    /**
     * Sets the value of the carMonthlyRepayment property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCarMonthlyRepayment(BigDecimal value) {
        this.carMonthlyRepayment = value;
    }

    /**
     * Gets the value of the carPurchaseMethod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCarPurchaseMethod() {
        return carPurchaseMethod;
    }

    /**
     * Sets the value of the carPurchaseMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCarPurchaseMethod(String value) {
        this.carPurchaseMethod = value;
    }

    /**
     * Gets the value of the childrenInSz property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isChildrenInSz() {
        return childrenInSz;
    }

    /**
     * Sets the value of the childrenInSz property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setChildrenInSz(Boolean value) {
        this.childrenInSz = value;
    }

    /**
     * Gets the value of the contactors property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contactors property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContactors().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Contactor }
     * 
     * 
     */
    public List<Contactor> getContactors() {
        if (contactors == null) {
            contactors = new ArrayList<Contactor>();
        }
        return this.contactors;
    }

    /**
     * Gets the value of the creditCardNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreditCardNo() {
        return creditCardNo;
    }

    /**
     * Sets the value of the creditCardNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreditCardNo(String value) {
        this.creditCardNo = value;
    }

    /**
     * Gets the value of the creditCardOneBank property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreditCardOneBank() {
        return creditCardOneBank;
    }

    /**
     * Sets the value of the creditCardOneBank property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreditCardOneBank(String value) {
        this.creditCardOneBank = value;
    }

    /**
     * Gets the value of the creditCardOneLimit property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCreditCardOneLimit() {
        return creditCardOneLimit;
    }

    /**
     * Sets the value of the creditCardOneLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCreditCardOneLimit(BigDecimal value) {
        this.creditCardOneLimit = value;
    }

    /**
     * Gets the value of the creditCardTotalLimit property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCreditCardTotalLimit() {
        return creditCardTotalLimit;
    }

    /**
     * Sets the value of the creditCardTotalLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCreditCardTotalLimit(BigDecimal value) {
        this.creditCardTotalLimit = value;
    }

    /**
     * Gets the value of the creditCardTotalNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCreditCardTotalNumber() {
        return creditCardTotalNumber;
    }

    /**
     * Sets the value of the creditCardTotalNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCreditCardTotalNumber(Integer value) {
        this.creditCardTotalNumber = value;
    }

    /**
     * Gets the value of the customerName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerName() {
        return customerName;
    }

    /**
     * Sets the value of the customerName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerName(String value) {
        this.customerName = value;
    }

    /**
     * Gets the value of the customerType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerType() {
        return customerType;
    }

    /**
     * Sets the value of the customerType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerType(String value) {
        this.customerType = value;
    }

    /**
     * Gets the value of the education property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEducation() {
        return education;
    }

    /**
     * Sets the value of the education property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEducation(String value) {
        this.education = value;
    }

    /**
     * Gets the value of the estateLoanAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getEstateLoanAmount() {
        return estateLoanAmount;
    }

    /**
     * Sets the value of the estateLoanAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setEstateLoanAmount(BigDecimal value) {
        this.estateLoanAmount = value;
    }

    /**
     * Gets the value of the estateMonthlyRepayment property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getEstateMonthlyRepayment() {
        return estateMonthlyRepayment;
    }

    /**
     * Sets the value of the estateMonthlyRepayment property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setEstateMonthlyRepayment(BigDecimal value) {
        this.estateMonthlyRepayment = value;
    }

    /**
     * Gets the value of the estatePurchaseMode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEstatePurchaseMode() {
        return estatePurchaseMode;
    }

    /**
     * Sets the value of the estatePurchaseMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEstatePurchaseMode(String value) {
        this.estatePurchaseMode = value;
    }

    /**
     * Gets the value of the gender property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGender() {
        return gender;
    }

    /**
     * Sets the value of the gender property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGender(String value) {
        this.gender = value;
    }

    /**
     * Gets the value of the houseCertNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHouseCertNo() {
        return houseCertNo;
    }

    /**
     * Sets the value of the houseCertNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHouseCertNo(String value) {
        this.houseCertNo = value;
    }

    /**
     * Gets the value of the houseEstimateAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getHouseEstimateAmount() {
        return houseEstimateAmount;
    }

    /**
     * Sets the value of the houseEstimateAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setHouseEstimateAmount(BigDecimal value) {
        this.houseEstimateAmount = value;
    }

    /**
     * Gets the value of the houseInfoType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHouseInfoType() {
        return houseInfoType;
    }

    /**
     * Sets the value of the houseInfoType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHouseInfoType(String value) {
        this.houseInfoType = value;
    }

    /**
     * Gets the value of the houseInfos property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the houseInfos property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHouseInfos().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HouseInfo }
     * 
     * 
     */
    public List<HouseInfo> getHouseInfos() {
        if (houseInfos == null) {
            houseInfos = new ArrayList<HouseInfo>();
        }
        return this.houseInfos;
    }

    /**
     * Gets the value of the houseLoanAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getHouseLoanAmount() {
        return houseLoanAmount;
    }

    /**
     * Sets the value of the houseLoanAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setHouseLoanAmount(BigDecimal value) {
        this.houseLoanAmount = value;
    }

    /**
     * Gets the value of the houseMortgageBank property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHouseMortgageBank() {
        return houseMortgageBank;
    }

    /**
     * Sets the value of the houseMortgageBank property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHouseMortgageBank(String value) {
        this.houseMortgageBank = value;
    }

    /**
     * Gets the value of the houseMortgageDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getHouseMortgageDate() {
        return houseMortgageDate;
    }

    /**
     * Sets the value of the houseMortgageDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setHouseMortgageDate(XMLGregorianCalendar value) {
        this.houseMortgageDate = value;
    }

    /**
     * Gets the value of the houseNumer property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getHouseNumer() {
        return houseNumer;
    }

    /**
     * Sets the value of the houseNumer property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setHouseNumer(Integer value) {
        this.houseNumer = value;
    }

    /**
     * Gets the value of the houseRepayAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getHouseRepayAmount() {
        return houseRepayAmount;
    }

    /**
     * Sets the value of the houseRepayAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setHouseRepayAmount(BigDecimal value) {
        this.houseRepayAmount = value;
    }

    /**
     * Gets the value of the household property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHousehold() {
        return household;
    }

    /**
     * Sets the value of the household property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHousehold(String value) {
        this.household = value;
    }

    /**
     * Gets the value of the idAddressAreaId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getIdAddressAreaId() {
        return idAddressAreaId;
    }

    /**
     * Sets the value of the idAddressAreaId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setIdAddressAreaId(Long value) {
        this.idAddressAreaId = value;
    }

    /**
     * Gets the value of the idAddressCityId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getIdAddressCityId() {
        return idAddressCityId;
    }

    /**
     * Sets the value of the idAddressCityId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setIdAddressCityId(Long value) {
        this.idAddressCityId = value;
    }

    /**
     * Gets the value of the idAddressDetails property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdAddressDetails() {
        return idAddressDetails;
    }

    /**
     * Sets the value of the idAddressDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdAddressDetails(String value) {
        this.idAddressDetails = value;
    }

    /**
     * Gets the value of the idAddressProvinceId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getIdAddressProvinceId() {
        return idAddressProvinceId;
    }

    /**
     * Sets the value of the idAddressProvinceId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setIdAddressProvinceId(Long value) {
        this.idAddressProvinceId = value;
    }

    /**
     * Gets the value of the idCardEndDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getIdCardEndDate() {
        return idCardEndDate;
    }

    /**
     * Sets the value of the idCardEndDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setIdCardEndDate(XMLGregorianCalendar value) {
        this.idCardEndDate = value;
    }

    /**
     * Gets the value of the idCardIssuedBy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdCardIssuedBy() {
        return idCardIssuedBy;
    }

    /**
     * Sets the value of the idCardIssuedBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdCardIssuedBy(String value) {
        this.idCardIssuedBy = value;
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
     * Gets the value of the idTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdTypeCode() {
        return idTypeCode;
    }

    /**
     * Sets the value of the idTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdTypeCode(String value) {
        this.idTypeCode = value;
    }

    /**
     * Gets the value of the investment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInvestment() {
        return investment;
    }

    /**
     * Sets the value of the investment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInvestment(String value) {
        this.investment = value;
    }

    /**
     * Gets the value of the isKnown property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsKnown() {
        return isKnown;
    }

    /**
     * Sets the value of the isKnown property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsKnown(Boolean value) {
        this.isKnown = value;
    }

    /**
     * Gets the value of the liveTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLiveTime() {
        return liveTime;
    }

    /**
     * Sets the value of the liveTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLiveTime(String value) {
        this.liveTime = value;
    }

    /**
     * Gets the value of the mailAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMailAddress() {
        return mailAddress;
    }

    /**
     * Sets the value of the mailAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMailAddress(String value) {
        this.mailAddress = value;
    }

    /**
     * Gets the value of the mailType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMailType() {
        return mailType;
    }

    /**
     * Sets the value of the mailType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMailType(String value) {
        this.mailType = value;
    }

    /**
     * Gets the value of the marriage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMarriage() {
        return marriage;
    }

    /**
     * Sets the value of the marriage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMarriage(String value) {
        this.marriage = value;
    }

    /**
     * Gets the value of the mobile property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMobile() {
        return mobile;
    }

    /**
     * Sets the value of the mobile property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMobile(String value) {
        this.mobile = value;
    }

    /**
     * Gets the value of the mobile2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMobile2() {
        return mobile2;
    }

    /**
     * Sets the value of the mobile2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMobile2(String value) {
        this.mobile2 = value;
    }

    /**
     * Gets the value of the mobile3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMobile3() {
        return mobile3;
    }

    /**
     * Sets the value of the mobile3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMobile3(String value) {
        this.mobile3 = value;
    }

    /**
     * Gets the value of the periodInfos property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the periodInfos property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPeriodInfos().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PeriodInfo }
     * 
     * 
     */
    public List<PeriodInfo> getPeriodInfos() {
        if (periodInfos == null) {
            periodInfos = new ArrayList<PeriodInfo>();
        }
        return this.periodInfos;
    }

    /**
     * Gets the value of the policyInfos property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the policyInfos property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPolicyInfos().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PolicyInfo }
     * 
     * 
     */
    public List<PolicyInfo> getPolicyInfos() {
        if (policyInfos == null) {
            policyInfos = new ArrayList<PolicyInfo>();
        }
        return this.policyInfos;
    }

    /**
     * Gets the value of the professions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the professions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProfessions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Profession }
     * 
     * 
     */
    public List<Profession> getProfessions() {
        if (professions == null) {
            professions = new ArrayList<Profession>();
        }
        return this.professions;
    }

    /**
     * Gets the value of the qqNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQqNo() {
        return qqNo;
    }

    /**
     * Sets the value of the qqNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQqNo(String value) {
        this.qqNo = value;
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
     * Gets the value of the socialSecurity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSocialSecurity() {
        return socialSecurity;
    }

    /**
     * Sets the value of the socialSecurity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSocialSecurity(String value) {
        this.socialSecurity = value;
    }

    /**
     * Gets the value of the spouseAge property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSpouseAge() {
        return spouseAge;
    }

    /**
     * Sets the value of the spouseAge property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSpouseAge(Integer value) {
        this.spouseAge = value;
    }

    /**
     * Gets the value of the spouseIdAddr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpouseIdAddr() {
        return spouseIdAddr;
    }

    /**
     * Sets the value of the spouseIdAddr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpouseIdAddr(String value) {
        this.spouseIdAddr = value;
    }

    /**
     * Gets the value of the spouseIdAddrAreaId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSpouseIdAddrAreaId() {
        return spouseIdAddrAreaId;
    }

    /**
     * Sets the value of the spouseIdAddrAreaId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSpouseIdAddrAreaId(Long value) {
        this.spouseIdAddrAreaId = value;
    }

    /**
     * Gets the value of the spouseIdAddrCityId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSpouseIdAddrCityId() {
        return spouseIdAddrCityId;
    }

    /**
     * Sets the value of the spouseIdAddrCityId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSpouseIdAddrCityId(Long value) {
        this.spouseIdAddrCityId = value;
    }

    /**
     * Gets the value of the spouseIdAddrDetails property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpouseIdAddrDetails() {
        return spouseIdAddrDetails;
    }

    /**
     * Sets the value of the spouseIdAddrDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpouseIdAddrDetails(String value) {
        this.spouseIdAddrDetails = value;
    }

    /**
     * Gets the value of the spouseIdAddrProvinceId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSpouseIdAddrProvinceId() {
        return spouseIdAddrProvinceId;
    }

    /**
     * Sets the value of the spouseIdAddrProvinceId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSpouseIdAddrProvinceId(Long value) {
        this.spouseIdAddrProvinceId = value;
    }

    /**
     * Gets the value of the spouseIdCardNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpouseIdCardNo() {
        return spouseIdCardNo;
    }

    /**
     * Sets the value of the spouseIdCardNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpouseIdCardNo(String value) {
        this.spouseIdCardNo = value;
    }

    /**
     * Gets the value of the spouseMonthlyIncome property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSpouseMonthlyIncome() {
        return spouseMonthlyIncome;
    }

    /**
     * Sets the value of the spouseMonthlyIncome property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSpouseMonthlyIncome(BigDecimal value) {
        this.spouseMonthlyIncome = value;
    }

    /**
     * Gets the value of the spouseName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpouseName() {
        return spouseName;
    }

    /**
     * Sets the value of the spouseName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpouseName(String value) {
        this.spouseName = value;
    }

    /**
     * Gets the value of the spouseTelephone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpouseTelephone() {
        return spouseTelephone;
    }

    /**
     * Sets the value of the spouseTelephone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpouseTelephone(String value) {
        this.spouseTelephone = value;
    }

    /**
     * Gets the value of the spouseTelephone2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpouseTelephone2() {
        return spouseTelephone2;
    }

    /**
     * Sets the value of the spouseTelephone2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpouseTelephone2(String value) {
        this.spouseTelephone2 = value;
    }

    /**
     * Gets the value of the spouseTelephone3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpouseTelephone3() {
        return spouseTelephone3;
    }

    /**
     * Sets the value of the spouseTelephone3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpouseTelephone3(String value) {
        this.spouseTelephone3 = value;
    }

    /**
     * Gets the value of the spouseUnit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpouseUnit() {
        return spouseUnit;
    }

    /**
     * Sets the value of the spouseUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpouseUnit(String value) {
        this.spouseUnit = value;
    }

    /**
     * Gets the value of the spouseUnitAddrAreaId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSpouseUnitAddrAreaId() {
        return spouseUnitAddrAreaId;
    }

    /**
     * Sets the value of the spouseUnitAddrAreaId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSpouseUnitAddrAreaId(Long value) {
        this.spouseUnitAddrAreaId = value;
    }

    /**
     * Gets the value of the spouseUnitAddrCityId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSpouseUnitAddrCityId() {
        return spouseUnitAddrCityId;
    }

    /**
     * Sets the value of the spouseUnitAddrCityId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSpouseUnitAddrCityId(Long value) {
        this.spouseUnitAddrCityId = value;
    }

    /**
     * Gets the value of the spouseUnitAddrDetails property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpouseUnitAddrDetails() {
        return spouseUnitAddrDetails;
    }

    /**
     * Sets the value of the spouseUnitAddrDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpouseUnitAddrDetails(String value) {
        this.spouseUnitAddrDetails = value;
    }

    /**
     * Gets the value of the spouseUnitAddrProvinceId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSpouseUnitAddrProvinceId() {
        return spouseUnitAddrProvinceId;
    }

    /**
     * Sets the value of the spouseUnitAddrProvinceId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSpouseUnitAddrProvinceId(Long value) {
        this.spouseUnitAddrProvinceId = value;
    }

    /**
     * Gets the value of the spouseUnitAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpouseUnitAddress() {
        return spouseUnitAddress;
    }

    /**
     * Sets the value of the spouseUnitAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpouseUnitAddress(String value) {
        this.spouseUnitAddress = value;
    }

    /**
     * Gets the value of the spouseUnitDepartment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpouseUnitDepartment() {
        return spouseUnitDepartment;
    }

    /**
     * Sets the value of the spouseUnitDepartment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpouseUnitDepartment(String value) {
        this.spouseUnitDepartment = value;
    }

    /**
     * Gets the value of the spouseUnitPosition property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpouseUnitPosition() {
        return spouseUnitPosition;
    }

    /**
     * Sets the value of the spouseUnitPosition property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpouseUnitPosition(String value) {
        this.spouseUnitPosition = value;
    }

    /**
     * Gets the value of the spouseUnitTelephone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpouseUnitTelephone() {
        return spouseUnitTelephone;
    }

    /**
     * Sets the value of the spouseUnitTelephone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpouseUnitTelephone(String value) {
        this.spouseUnitTelephone = value;
    }

    /**
     * Gets the value of the surveys property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the surveys property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSurveys().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Survey }
     * 
     * 
     */
    public List<Survey> getSurveys() {
        if (surveys == null) {
            surveys = new ArrayList<Survey>();
        }
        return this.surveys;
    }

    /**
     * Gets the value of the tempIdNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTempIdNo() {
        return tempIdNo;
    }

    /**
     * Sets the value of the tempIdNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTempIdNo(String value) {
        this.tempIdNo = value;
    }

    /**
     * Gets the value of the zipCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZipCode() {
        return zipCode;
    }

    /**
     * Sets the value of the zipCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZipCode(String value) {
        this.zipCode = value;
    }

}
