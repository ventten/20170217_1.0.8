
package com.ljwd.plms.web.wsdl.webservice.service;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for professionDto complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="professionDto">
 *   &lt;complexContent>
 *     &lt;extension base="{http://webservice.loan.mfbms.flinkmf.com/}baseVersionableCreatorAwareEntityDto">
 *       &lt;sequence>
 *       &lt;/sequence>
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="custid" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="sequence" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="unitName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="unitAddress" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="unitAddress1" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="unitAddress2" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="unitAddress3" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="zipcode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="unitType" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="otherUnitType" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="telephone" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="telephone2" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="telephone3" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="telephone4" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="fax" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="website" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="position" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="servYears" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="servMonths" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="department" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="salary" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       &lt;attribute name="salaryDay" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="salaryPayMode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="industry" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="isHighRisk" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="staffNumberType" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="colleagueName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="colleagueGender" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="colleagueDepartment" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="colleaguePosition" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="colleagueMobile" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="privateBusinessType" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="privateProperty" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="privateRentMonthlyAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       &lt;attribute name="privateRepaymentMonthlyAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       &lt;attribute name="privateEstablishDate" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="privateStaffNumber" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="privateMonthlyTurnover" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       &lt;attribute name="privateMonthlyCost" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       &lt;attribute name="privateMonthlyProfit" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       &lt;attribute name="unitAddressProvinceId" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="unitAddressCityId" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="unitAddressAreaId" type="{http://www.w3.org/2001/XMLSchema}long" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "professionDto")
public class ProfessionDto
    extends BaseVersionableCreatorAwareEntityDto
{

    @XmlAttribute(name = "id")
    protected Long id;
    @XmlAttribute(name = "custid")
    protected Long custid;
    @XmlAttribute(name = "sequence")
    protected Integer sequence;
    @XmlAttribute(name = "unitName")
    protected String unitName;
    @XmlAttribute(name = "unitAddress")
    protected String unitAddress;
    @XmlAttribute(name = "unitAddress1")
    protected String unitAddress1;
    @XmlAttribute(name = "unitAddress2")
    protected String unitAddress2;
    @XmlAttribute(name = "unitAddress3")
    protected String unitAddress3;
    @XmlAttribute(name = "zipcode")
    protected String zipcode;
    @XmlAttribute(name = "unitType")
    protected String unitType;
    @XmlAttribute(name = "otherUnitType")
    protected String otherUnitType;
    @XmlAttribute(name = "telephone")
    protected String telephone;
    @XmlAttribute(name = "telephone2")
    protected String telephone2;
    @XmlAttribute(name = "telephone3")
    protected String telephone3;
    @XmlAttribute(name = "telephone4")
    protected String telephone4;
    @XmlAttribute(name = "fax")
    protected String fax;
    @XmlAttribute(name = "website")
    protected String website;
    @XmlAttribute(name = "position")
    protected String position;
    @XmlAttribute(name = "servYears")
    protected Integer servYears;
    @XmlAttribute(name = "servMonths")
    protected Integer servMonths;
    @XmlAttribute(name = "department")
    protected String department;
    @XmlAttribute(name = "salary")
    protected BigDecimal salary;
    @XmlAttribute(name = "salaryDay")
    protected String salaryDay;
    @XmlAttribute(name = "salaryPayMode")
    protected String salaryPayMode;
    @XmlAttribute(name = "industry")
    protected String industry;
    @XmlAttribute(name = "isHighRisk")
    protected Boolean isHighRisk;
    @XmlAttribute(name = "staffNumberType")
    protected String staffNumberType;
    @XmlAttribute(name = "colleagueName")
    protected String colleagueName;
    @XmlAttribute(name = "colleagueGender")
    protected String colleagueGender;
    @XmlAttribute(name = "colleagueDepartment")
    protected String colleagueDepartment;
    @XmlAttribute(name = "colleaguePosition")
    protected String colleaguePosition;
    @XmlAttribute(name = "colleagueMobile")
    protected String colleagueMobile;
    @XmlAttribute(name = "privateBusinessType")
    protected String privateBusinessType;
    @XmlAttribute(name = "privateProperty")
    protected String privateProperty;
    @XmlAttribute(name = "privateRentMonthlyAmount")
    protected BigDecimal privateRentMonthlyAmount;
    @XmlAttribute(name = "privateRepaymentMonthlyAmount")
    protected BigDecimal privateRepaymentMonthlyAmount;
    @XmlAttribute(name = "privateEstablishDate")
    protected String privateEstablishDate;
    @XmlAttribute(name = "privateStaffNumber")
    protected Integer privateStaffNumber;
    @XmlAttribute(name = "privateMonthlyTurnover")
    protected BigDecimal privateMonthlyTurnover;
    @XmlAttribute(name = "privateMonthlyCost")
    protected BigDecimal privateMonthlyCost;
    @XmlAttribute(name = "privateMonthlyProfit")
    protected BigDecimal privateMonthlyProfit;
    @XmlAttribute(name = "unitAddressProvinceId")
    protected Long unitAddressProvinceId;
    @XmlAttribute(name = "unitAddressCityId")
    protected Long unitAddressCityId;
    @XmlAttribute(name = "unitAddressAreaId")
    protected Long unitAddressAreaId;

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
     * Gets the value of the custid property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCustid() {
        return custid;
    }

    /**
     * Sets the value of the custid property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCustid(Long value) {
        this.custid = value;
    }

    /**
     * Gets the value of the sequence property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSequence() {
        return sequence;
    }

    /**
     * Sets the value of the sequence property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSequence(Integer value) {
        this.sequence = value;
    }

    /**
     * Gets the value of the unitName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnitName() {
        return unitName;
    }

    /**
     * Sets the value of the unitName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnitName(String value) {
        this.unitName = value;
    }

    /**
     * Gets the value of the unitAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnitAddress() {
        return unitAddress;
    }

    /**
     * Sets the value of the unitAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnitAddress(String value) {
        this.unitAddress = value;
    }

    /**
     * Gets the value of the unitAddress1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnitAddress1() {
        return unitAddress1;
    }

    /**
     * Sets the value of the unitAddress1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnitAddress1(String value) {
        this.unitAddress1 = value;
    }

    /**
     * Gets the value of the unitAddress2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnitAddress2() {
        return unitAddress2;
    }

    /**
     * Sets the value of the unitAddress2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnitAddress2(String value) {
        this.unitAddress2 = value;
    }

    /**
     * Gets the value of the unitAddress3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnitAddress3() {
        return unitAddress3;
    }

    /**
     * Sets the value of the unitAddress3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnitAddress3(String value) {
        this.unitAddress3 = value;
    }

    /**
     * Gets the value of the zipcode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZipcode() {
        return zipcode;
    }

    /**
     * Sets the value of the zipcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZipcode(String value) {
        this.zipcode = value;
    }

    /**
     * Gets the value of the unitType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnitType() {
        return unitType;
    }

    /**
     * Sets the value of the unitType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnitType(String value) {
        this.unitType = value;
    }

    /**
     * Gets the value of the otherUnitType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOtherUnitType() {
        return otherUnitType;
    }

    /**
     * Sets the value of the otherUnitType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOtherUnitType(String value) {
        this.otherUnitType = value;
    }

    /**
     * Gets the value of the telephone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTelephone() {
        return telephone;
    }

    /**
     * Sets the value of the telephone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTelephone(String value) {
        this.telephone = value;
    }

    /**
     * Gets the value of the telephone2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTelephone2() {
        return telephone2;
    }

    /**
     * Sets the value of the telephone2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTelephone2(String value) {
        this.telephone2 = value;
    }

    /**
     * Gets the value of the telephone3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTelephone3() {
        return telephone3;
    }

    /**
     * Sets the value of the telephone3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTelephone3(String value) {
        this.telephone3 = value;
    }

    /**
     * Gets the value of the telephone4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTelephone4() {
        return telephone4;
    }

    /**
     * Sets the value of the telephone4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTelephone4(String value) {
        this.telephone4 = value;
    }

    /**
     * Gets the value of the fax property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFax() {
        return fax;
    }

    /**
     * Sets the value of the fax property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFax(String value) {
        this.fax = value;
    }

    /**
     * Gets the value of the website property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWebsite() {
        return website;
    }

    /**
     * Sets the value of the website property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWebsite(String value) {
        this.website = value;
    }

    /**
     * Gets the value of the position property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPosition() {
        return position;
    }

    /**
     * Sets the value of the position property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPosition(String value) {
        this.position = value;
    }

    /**
     * Gets the value of the servYears property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getServYears() {
        return servYears;
    }

    /**
     * Sets the value of the servYears property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setServYears(Integer value) {
        this.servYears = value;
    }

    /**
     * Gets the value of the servMonths property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getServMonths() {
        return servMonths;
    }

    /**
     * Sets the value of the servMonths property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setServMonths(Integer value) {
        this.servMonths = value;
    }

    /**
     * Gets the value of the department property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDepartment() {
        return department;
    }

    /**
     * Sets the value of the department property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDepartment(String value) {
        this.department = value;
    }

    /**
     * Gets the value of the salary property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSalary() {
        return salary;
    }

    /**
     * Sets the value of the salary property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSalary(BigDecimal value) {
        this.salary = value;
    }

    /**
     * Gets the value of the salaryDay property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSalaryDay() {
        return salaryDay;
    }

    /**
     * Sets the value of the salaryDay property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSalaryDay(String value) {
        this.salaryDay = value;
    }

    /**
     * Gets the value of the salaryPayMode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSalaryPayMode() {
        return salaryPayMode;
    }

    /**
     * Sets the value of the salaryPayMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSalaryPayMode(String value) {
        this.salaryPayMode = value;
    }

    /**
     * Gets the value of the industry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIndustry() {
        return industry;
    }

    /**
     * Sets the value of the industry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIndustry(String value) {
        this.industry = value;
    }

    /**
     * Gets the value of the isHighRisk property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsHighRisk() {
        return isHighRisk;
    }

    /**
     * Sets the value of the isHighRisk property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsHighRisk(Boolean value) {
        this.isHighRisk = value;
    }

    /**
     * Gets the value of the staffNumberType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStaffNumberType() {
        return staffNumberType;
    }

    /**
     * Sets the value of the staffNumberType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStaffNumberType(String value) {
        this.staffNumberType = value;
    }

    /**
     * Gets the value of the colleagueName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getColleagueName() {
        return colleagueName;
    }

    /**
     * Sets the value of the colleagueName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setColleagueName(String value) {
        this.colleagueName = value;
    }

    /**
     * Gets the value of the colleagueGender property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getColleagueGender() {
        return colleagueGender;
    }

    /**
     * Sets the value of the colleagueGender property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setColleagueGender(String value) {
        this.colleagueGender = value;
    }

    /**
     * Gets the value of the colleagueDepartment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getColleagueDepartment() {
        return colleagueDepartment;
    }

    /**
     * Sets the value of the colleagueDepartment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setColleagueDepartment(String value) {
        this.colleagueDepartment = value;
    }

    /**
     * Gets the value of the colleaguePosition property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getColleaguePosition() {
        return colleaguePosition;
    }

    /**
     * Sets the value of the colleaguePosition property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setColleaguePosition(String value) {
        this.colleaguePosition = value;
    }

    /**
     * Gets the value of the colleagueMobile property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getColleagueMobile() {
        return colleagueMobile;
    }

    /**
     * Sets the value of the colleagueMobile property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setColleagueMobile(String value) {
        this.colleagueMobile = value;
    }

    /**
     * Gets the value of the privateBusinessType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrivateBusinessType() {
        return privateBusinessType;
    }

    /**
     * Sets the value of the privateBusinessType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrivateBusinessType(String value) {
        this.privateBusinessType = value;
    }

    /**
     * Gets the value of the privateProperty property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrivateProperty() {
        return privateProperty;
    }

    /**
     * Sets the value of the privateProperty property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrivateProperty(String value) {
        this.privateProperty = value;
    }

    /**
     * Gets the value of the privateRentMonthlyAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPrivateRentMonthlyAmount() {
        return privateRentMonthlyAmount;
    }

    /**
     * Sets the value of the privateRentMonthlyAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPrivateRentMonthlyAmount(BigDecimal value) {
        this.privateRentMonthlyAmount = value;
    }

    /**
     * Gets the value of the privateRepaymentMonthlyAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPrivateRepaymentMonthlyAmount() {
        return privateRepaymentMonthlyAmount;
    }

    /**
     * Sets the value of the privateRepaymentMonthlyAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPrivateRepaymentMonthlyAmount(BigDecimal value) {
        this.privateRepaymentMonthlyAmount = value;
    }

    /**
     * Gets the value of the privateEstablishDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrivateEstablishDate() {
        return privateEstablishDate;
    }

    /**
     * Sets the value of the privateEstablishDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrivateEstablishDate(String value) {
        this.privateEstablishDate = value;
    }

    /**
     * Gets the value of the privateStaffNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPrivateStaffNumber() {
        return privateStaffNumber;
    }

    /**
     * Sets the value of the privateStaffNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPrivateStaffNumber(Integer value) {
        this.privateStaffNumber = value;
    }

    /**
     * Gets the value of the privateMonthlyTurnover property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPrivateMonthlyTurnover() {
        return privateMonthlyTurnover;
    }

    /**
     * Sets the value of the privateMonthlyTurnover property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPrivateMonthlyTurnover(BigDecimal value) {
        this.privateMonthlyTurnover = value;
    }

    /**
     * Gets the value of the privateMonthlyCost property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPrivateMonthlyCost() {
        return privateMonthlyCost;
    }

    /**
     * Sets the value of the privateMonthlyCost property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPrivateMonthlyCost(BigDecimal value) {
        this.privateMonthlyCost = value;
    }

    /**
     * Gets the value of the privateMonthlyProfit property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPrivateMonthlyProfit() {
        return privateMonthlyProfit;
    }

    /**
     * Sets the value of the privateMonthlyProfit property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPrivateMonthlyProfit(BigDecimal value) {
        this.privateMonthlyProfit = value;
    }

    /**
     * Gets the value of the unitAddressProvinceId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getUnitAddressProvinceId() {
        return unitAddressProvinceId;
    }

    /**
     * Sets the value of the unitAddressProvinceId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setUnitAddressProvinceId(Long value) {
        this.unitAddressProvinceId = value;
    }

    /**
     * Gets the value of the unitAddressCityId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getUnitAddressCityId() {
        return unitAddressCityId;
    }

    /**
     * Sets the value of the unitAddressCityId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setUnitAddressCityId(Long value) {
        this.unitAddressCityId = value;
    }

    /**
     * Gets the value of the unitAddressAreaId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getUnitAddressAreaId() {
        return unitAddressAreaId;
    }

    /**
     * Sets the value of the unitAddressAreaId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setUnitAddressAreaId(Long value) {
        this.unitAddressAreaId = value;
    }

}
