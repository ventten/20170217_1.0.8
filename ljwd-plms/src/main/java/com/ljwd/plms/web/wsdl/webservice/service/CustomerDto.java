
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
 * <p>Java class for customerDto complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="customerDto">
 *   &lt;complexContent>
 *     &lt;extension base="{http://webservice.loan.mfbms.flinkmf.com/}baseVersionableCreatorAwareEntityDto">
 *       &lt;sequence>
 *         &lt;element name="houseInfos" type="{http://webservice.loan.mfbms.flinkmf.com/}houseInfoDto" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="policyInfos" type="{http://webservice.loan.mfbms.flinkmf.com/}policyInfoDto" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="contactors" type="{http://webservice.loan.mfbms.flinkmf.com/}contactorDto" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="professions" type="{http://webservice.loan.mfbms.flinkmf.com/}professionDto" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="carInfos" type="{http://webservice.loan.mfbms.flinkmf.com/}carInfoDto" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="accountInfos" type="{http://webservice.loan.mfbms.flinkmf.com/}accountInfoDto" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="periodInfos" type="{http://webservice.loan.mfbms.flinkmf.com/}periodInfoDto" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="applid" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="customerName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="age" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="gender" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="marriage" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="idTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="idCardNo" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="socialSecurity" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="tempIdNo" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="birthday" type="{http://www.w3.org/2001/XMLSchema}date" />
 *       &lt;attribute name="birthPlace" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="household" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="education" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="mobile" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="mobile2" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="mobile3" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="mailAddress" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="mailType" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="qqNo" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="liveTime" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="zipCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="isKnown" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="spouseName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="spouseIdCardNo" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="spouseAge" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="spouseTelephone" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="spouseTelephone2" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="spouseTelephone3" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="spouseUnit" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="spouseUnitPosition" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="spouseUnitAddress" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="spouseUnitDepartment" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="spouseUnitTelephone" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="spouseMonthlyIncome" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       &lt;attribute name="estatePurchaseMode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="estateLoanAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       &lt;attribute name="estateMonthlyRepayment" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       &lt;attribute name="carPurchaseMethod" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="carLoanAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       &lt;attribute name="carMonthlyRepayment" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       &lt;attribute name="creditCardTotalNumber" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="creditCardTotalLimit" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       &lt;attribute name="creditCardOneBank" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="creditCardOneLimit" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       &lt;attribute name="creditCardNo" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="investment" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="remark" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="childrenInSz" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="idCardIssuedBy" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="idCardEndDate" type="{http://www.w3.org/2001/XMLSchema}date" />
 *       &lt;attribute name="customerType" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="houseInfoType" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="houseNumer" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="houseEstimateAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       &lt;attribute name="houseLoanAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       &lt;attribute name="houseRepayAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       &lt;attribute name="houseMortgageDate" type="{http://www.w3.org/2001/XMLSchema}date" />
 *       &lt;attribute name="houseMortgageBank" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="houseCertNo" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="idAddressProvinceId" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="idAddressCityId" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="idAddressAreaId" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="idAddressDetails" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="spouseIdAddrProvinceId" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="spouseIdAddrCityId" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="spouseIdAddrAreaId" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="spouseIdAddrDetails" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="spouseIdAddr" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="spouseUnitAddrProvinceId" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="spouseUnitAddrCityId" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="spouseUnitAddrAreaId" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="spouseUnitAddrDetails" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "customerDto", propOrder = {
    "houseInfos",
    "policyInfos",
    "contactors",
    "professions",
    "carInfos",
    "accountInfos",
    "periodInfos"
})
public class CustomerDto
    extends BaseVersionableCreatorAwareEntityDto
{

    @XmlElement(nillable = true)
    protected List<HouseInfoDto> houseInfos;
    @XmlElement(nillable = true)
    protected List<PolicyInfoDto> policyInfos;
    @XmlElement(nillable = true)
    protected List<ContactorDto> contactors;
    @XmlElement(nillable = true)
    protected List<ProfessionDto> professions;
    @XmlElement(nillable = true)
    protected List<CarInfoDto> carInfos;
    @XmlElement(nillable = true)
    protected List<AccountInfoDto> accountInfos;
    @XmlElement(nillable = true)
    protected List<PeriodInfoDto> periodInfos;
    @XmlAttribute(name = "id")
    protected Long id;
    @XmlAttribute(name = "applid")
    protected Long applid;
    @XmlAttribute(name = "customerName")
    protected String customerName;
    @XmlAttribute(name = "age")
    protected Integer age;
    @XmlAttribute(name = "gender")
    protected String gender;
    @XmlAttribute(name = "marriage")
    protected String marriage;
    @XmlAttribute(name = "idTypeCode")
    protected String idTypeCode;
    @XmlAttribute(name = "idCardNo")
    protected String idCardNo;
    @XmlAttribute(name = "socialSecurity")
    protected String socialSecurity;
    @XmlAttribute(name = "tempIdNo")
    protected String tempIdNo;
    @XmlAttribute(name = "birthday")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar birthday;
    @XmlAttribute(name = "birthPlace")
    protected String birthPlace;
    @XmlAttribute(name = "household")
    protected String household;
    @XmlAttribute(name = "education")
    protected String education;
    @XmlAttribute(name = "mobile")
    protected String mobile;
    @XmlAttribute(name = "mobile2")
    protected String mobile2;
    @XmlAttribute(name = "mobile3")
    protected String mobile3;
    @XmlAttribute(name = "mailAddress")
    protected String mailAddress;
    @XmlAttribute(name = "mailType")
    protected String mailType;
    @XmlAttribute(name = "qqNo")
    protected String qqNo;
    @XmlAttribute(name = "liveTime")
    protected String liveTime;
    @XmlAttribute(name = "zipCode")
    protected String zipCode;
    @XmlAttribute(name = "isKnown")
    protected Boolean isKnown;
    @XmlAttribute(name = "spouseName")
    protected String spouseName;
    @XmlAttribute(name = "spouseIdCardNo")
    protected String spouseIdCardNo;
    @XmlAttribute(name = "spouseAge")
    protected Integer spouseAge;
    @XmlAttribute(name = "spouseTelephone")
    protected String spouseTelephone;
    @XmlAttribute(name = "spouseTelephone2")
    protected String spouseTelephone2;
    @XmlAttribute(name = "spouseTelephone3")
    protected String spouseTelephone3;
    @XmlAttribute(name = "spouseUnit")
    protected String spouseUnit;
    @XmlAttribute(name = "spouseUnitPosition")
    protected String spouseUnitPosition;
    @XmlAttribute(name = "spouseUnitAddress")
    protected String spouseUnitAddress;
    @XmlAttribute(name = "spouseUnitDepartment")
    protected String spouseUnitDepartment;
    @XmlAttribute(name = "spouseUnitTelephone")
    protected String spouseUnitTelephone;
    @XmlAttribute(name = "spouseMonthlyIncome")
    protected BigDecimal spouseMonthlyIncome;
    @XmlAttribute(name = "estatePurchaseMode")
    protected String estatePurchaseMode;
    @XmlAttribute(name = "estateLoanAmount")
    protected BigDecimal estateLoanAmount;
    @XmlAttribute(name = "estateMonthlyRepayment")
    protected BigDecimal estateMonthlyRepayment;
    @XmlAttribute(name = "carPurchaseMethod")
    protected String carPurchaseMethod;
    @XmlAttribute(name = "carLoanAmount")
    protected BigDecimal carLoanAmount;
    @XmlAttribute(name = "carMonthlyRepayment")
    protected BigDecimal carMonthlyRepayment;
    @XmlAttribute(name = "creditCardTotalNumber")
    protected Integer creditCardTotalNumber;
    @XmlAttribute(name = "creditCardTotalLimit")
    protected BigDecimal creditCardTotalLimit;
    @XmlAttribute(name = "creditCardOneBank")
    protected String creditCardOneBank;
    @XmlAttribute(name = "creditCardOneLimit")
    protected BigDecimal creditCardOneLimit;
    @XmlAttribute(name = "creditCardNo")
    protected String creditCardNo;
    @XmlAttribute(name = "investment")
    protected String investment;
    @XmlAttribute(name = "remark")
    protected String remark;
    @XmlAttribute(name = "childrenInSz")
    protected Boolean childrenInSz;
    @XmlAttribute(name = "idCardIssuedBy")
    protected String idCardIssuedBy;
    @XmlAttribute(name = "idCardEndDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar idCardEndDate;
    @XmlAttribute(name = "customerType")
    protected String customerType;
    @XmlAttribute(name = "houseInfoType")
    protected String houseInfoType;
    @XmlAttribute(name = "houseNumer")
    protected Integer houseNumer;
    @XmlAttribute(name = "houseEstimateAmount")
    protected BigDecimal houseEstimateAmount;
    @XmlAttribute(name = "houseLoanAmount")
    protected BigDecimal houseLoanAmount;
    @XmlAttribute(name = "houseRepayAmount")
    protected BigDecimal houseRepayAmount;
    @XmlAttribute(name = "houseMortgageDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar houseMortgageDate;
    @XmlAttribute(name = "houseMortgageBank")
    protected String houseMortgageBank;
    @XmlAttribute(name = "houseCertNo")
    protected String houseCertNo;
    @XmlAttribute(name = "idAddressProvinceId")
    protected Long idAddressProvinceId;
    @XmlAttribute(name = "idAddressCityId")
    protected Long idAddressCityId;
    @XmlAttribute(name = "idAddressAreaId")
    protected Long idAddressAreaId;
    @XmlAttribute(name = "idAddressDetails")
    protected String idAddressDetails;
    @XmlAttribute(name = "spouseIdAddrProvinceId")
    protected Long spouseIdAddrProvinceId;
    @XmlAttribute(name = "spouseIdAddrCityId")
    protected Long spouseIdAddrCityId;
    @XmlAttribute(name = "spouseIdAddrAreaId")
    protected Long spouseIdAddrAreaId;
    @XmlAttribute(name = "spouseIdAddrDetails")
    protected String spouseIdAddrDetails;
    @XmlAttribute(name = "spouseIdAddr")
    protected String spouseIdAddr;
    @XmlAttribute(name = "spouseUnitAddrProvinceId")
    protected Long spouseUnitAddrProvinceId;
    @XmlAttribute(name = "spouseUnitAddrCityId")
    protected Long spouseUnitAddrCityId;
    @XmlAttribute(name = "spouseUnitAddrAreaId")
    protected Long spouseUnitAddrAreaId;
    @XmlAttribute(name = "spouseUnitAddrDetails")
    protected String spouseUnitAddrDetails;

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
     * {@link HouseInfoDto }
     * 
     * 
     */
    public List<HouseInfoDto> getHouseInfos() {
        if (houseInfos == null) {
            houseInfos = new ArrayList<HouseInfoDto>();
        }
        return this.houseInfos;
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
     * {@link PolicyInfoDto }
     * 
     * 
     */
    public List<PolicyInfoDto> getPolicyInfos() {
        if (policyInfos == null) {
            policyInfos = new ArrayList<PolicyInfoDto>();
        }
        return this.policyInfos;
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
     * {@link ContactorDto }
     * 
     * 
     */
    public List<ContactorDto> getContactors() {
        if (contactors == null) {
            contactors = new ArrayList<ContactorDto>();
        }
        return this.contactors;
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
     * {@link ProfessionDto }
     * 
     * 
     */
    public List<ProfessionDto> getProfessions() {
        if (professions == null) {
            professions = new ArrayList<ProfessionDto>();
        }
        return this.professions;
    }

    /**
     * Gets the value of the carInfos property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the carInfos property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCarInfos().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CarInfoDto }
     * 
     * 
     */
    public List<CarInfoDto> getCarInfos() {
        if (carInfos == null) {
            carInfos = new ArrayList<CarInfoDto>();
        }
        return this.carInfos;
    }

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
     * {@link AccountInfoDto }
     * 
     * 
     */
    public List<AccountInfoDto> getAccountInfos() {
        if (accountInfos == null) {
            accountInfos = new ArrayList<AccountInfoDto>();
        }
        return this.accountInfos;
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
     * {@link PeriodInfoDto }
     * 
     * 
     */
    public List<PeriodInfoDto> getPeriodInfos() {
        if (periodInfos == null) {
            periodInfos = new ArrayList<PeriodInfoDto>();
        }
        return this.periodInfos;
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
     * Gets the value of the applid property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getApplid() {
        return applid;
    }

    /**
     * Sets the value of the applid property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setApplid(Long value) {
        this.applid = value;
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

}
