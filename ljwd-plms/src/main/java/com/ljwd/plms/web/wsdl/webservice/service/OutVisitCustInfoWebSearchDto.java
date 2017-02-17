
package com.ljwd.plms.web.wsdl.webservice.service;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for outVisitCustInfoWebSearchDto complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="outVisitCustInfoWebSearchDto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *       &lt;/sequence>
 *       &lt;attribute name="custName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="gender" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="idCard" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="education" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="unitName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="position" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="cntrctNo" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="loanAmt" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       &lt;attribute name="setAmt" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       &lt;attribute name="repayment" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       &lt;attribute name="loanPeriod" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="periodNum" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="overdueDays" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="tel" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="mobile1" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="mobile2" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="unitAddress" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="houseHold" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="addr" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "outVisitCustInfoWebSearchDto")
public class OutVisitCustInfoWebSearchDto {

    @XmlAttribute(name = "custName")
    protected String custName;
    @XmlAttribute(name = "gender")
    protected String gender;
    @XmlAttribute(name = "idCard")
    protected String idCard;
    @XmlAttribute(name = "education")
    protected String education;
    @XmlAttribute(name = "unitName")
    protected String unitName;
    @XmlAttribute(name = "position")
    protected String position;
    @XmlAttribute(name = "cntrctNo")
    protected String cntrctNo;
    @XmlAttribute(name = "loanAmt")
    protected BigDecimal loanAmt;
    @XmlAttribute(name = "setAmt")
    protected BigDecimal setAmt;
    @XmlAttribute(name = "repayment")
    protected BigDecimal repayment;
    @XmlAttribute(name = "loanPeriod")
    protected Integer loanPeriod;
    @XmlAttribute(name = "periodNum")
    protected Long periodNum;
    @XmlAttribute(name = "overdueDays")
    protected Integer overdueDays;
    @XmlAttribute(name = "tel")
    protected String tel;
    @XmlAttribute(name = "mobile1")
    protected String mobile1;
    @XmlAttribute(name = "mobile2")
    protected String mobile2;
    @XmlAttribute(name = "unitAddress")
    protected String unitAddress;
    @XmlAttribute(name = "houseHold")
    protected String houseHold;
    @XmlAttribute(name = "addr")
    protected String addr;

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
     * Gets the value of the idCard property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdCard() {
        return idCard;
    }

    /**
     * Sets the value of the idCard property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdCard(String value) {
        this.idCard = value;
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
     * Gets the value of the cntrctNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCntrctNo() {
        return cntrctNo;
    }

    /**
     * Sets the value of the cntrctNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCntrctNo(String value) {
        this.cntrctNo = value;
    }

    /**
     * Gets the value of the loanAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getLoanAmt() {
        return loanAmt;
    }

    /**
     * Sets the value of the loanAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setLoanAmt(BigDecimal value) {
        this.loanAmt = value;
    }

    /**
     * Gets the value of the setAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSetAmt() {
        return setAmt;
    }

    /**
     * Sets the value of the setAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSetAmt(BigDecimal value) {
        this.setAmt = value;
    }

    /**
     * Gets the value of the repayment property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRepayment() {
        return repayment;
    }

    /**
     * Sets the value of the repayment property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRepayment(BigDecimal value) {
        this.repayment = value;
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
     * Gets the value of the periodNum property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPeriodNum() {
        return periodNum;
    }

    /**
     * Sets the value of the periodNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPeriodNum(Long value) {
        this.periodNum = value;
    }

    /**
     * Gets the value of the overdueDays property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getOverdueDays() {
        return overdueDays;
    }

    /**
     * Sets the value of the overdueDays property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setOverdueDays(Integer value) {
        this.overdueDays = value;
    }

    /**
     * Gets the value of the tel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTel() {
        return tel;
    }

    /**
     * Sets the value of the tel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTel(String value) {
        this.tel = value;
    }

    /**
     * Gets the value of the mobile1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMobile1() {
        return mobile1;
    }

    /**
     * Sets the value of the mobile1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMobile1(String value) {
        this.mobile1 = value;
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
     * Gets the value of the houseHold property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHouseHold() {
        return houseHold;
    }

    /**
     * Sets the value of the houseHold property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHouseHold(String value) {
        this.houseHold = value;
    }

    /**
     * Gets the value of the addr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddr() {
        return addr;
    }

    /**
     * Sets the value of the addr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddr(String value) {
        this.addr = value;
    }

}
