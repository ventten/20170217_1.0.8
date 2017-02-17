
package com.ljwd.plms.web.wsdl.webservice.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for jbtnPrintSearchDto complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="jbtnPrintSearchDto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *       &lt;/sequence>
 *       &lt;attribute name="cntrctNo" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="custName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="idCard" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="mobile" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="val" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="payAmt" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="startDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="endDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="payCntrct" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="collectCntrct" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="customer" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="lenderBank" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="lenderCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="lender" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="lenderPhone" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="lenderFax" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="yearRate" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="floatingRate" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="floatRate" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="zero" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="one" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="thirty" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="fifty" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="hundred" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="place" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="cuo" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="dui" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="faYuan" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="xie" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "jbtnPrintSearchDto")
public class JbtnPrintSearchDto {

    @XmlAttribute(name = "cntrctNo")
    protected String cntrctNo;
    @XmlAttribute(name = "custName")
    protected String custName;
    @XmlAttribute(name = "idCard")
    protected String idCard;
    @XmlAttribute(name = "mobile")
    protected String mobile;
    @XmlAttribute(name = "val")
    protected String val;
    @XmlAttribute(name = "payAmt")
    protected Long payAmt;
    @XmlAttribute(name = "startDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar startDate;
    @XmlAttribute(name = "endDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar endDate;
    @XmlAttribute(name = "payCntrct")
    protected String payCntrct;
    @XmlAttribute(name = "collectCntrct")
    protected String collectCntrct;
    @XmlAttribute(name = "customer")
    protected String customer;
    @XmlAttribute(name = "lenderBank")
    protected String lenderBank;
    @XmlAttribute(name = "lenderCode")
    protected String lenderCode;
    @XmlAttribute(name = "lender")
    protected String lender;
    @XmlAttribute(name = "lenderPhone")
    protected String lenderPhone;
    @XmlAttribute(name = "lenderFax")
    protected String lenderFax;
    @XmlAttribute(name = "yearRate")
    protected String yearRate;
    @XmlAttribute(name = "floatingRate")
    protected String floatingRate;
    @XmlAttribute(name = "floatRate")
    protected String floatRate;
    @XmlAttribute(name = "zero")
    protected String zero;
    @XmlAttribute(name = "one")
    protected String one;
    @XmlAttribute(name = "thirty")
    protected String thirty;
    @XmlAttribute(name = "fifty")
    protected String fifty;
    @XmlAttribute(name = "hundred")
    protected String hundred;
    @XmlAttribute(name = "place")
    protected String place;
    @XmlAttribute(name = "cuo")
    protected String cuo;
    @XmlAttribute(name = "dui")
    protected String dui;
    @XmlAttribute(name = "faYuan")
    protected String faYuan;
    @XmlAttribute(name = "xie")
    protected String xie;

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
     * Gets the value of the val property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVal() {
        return val;
    }

    /**
     * Sets the value of the val property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVal(String value) {
        this.val = value;
    }

    /**
     * Gets the value of the payAmt property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPayAmt() {
        return payAmt;
    }

    /**
     * Sets the value of the payAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPayAmt(Long value) {
        this.payAmt = value;
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
     * Gets the value of the payCntrct property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPayCntrct() {
        return payCntrct;
    }

    /**
     * Sets the value of the payCntrct property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPayCntrct(String value) {
        this.payCntrct = value;
    }

    /**
     * Gets the value of the collectCntrct property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCollectCntrct() {
        return collectCntrct;
    }

    /**
     * Sets the value of the collectCntrct property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCollectCntrct(String value) {
        this.collectCntrct = value;
    }

    /**
     * Gets the value of the customer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomer() {
        return customer;
    }

    /**
     * Sets the value of the customer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomer(String value) {
        this.customer = value;
    }

    /**
     * Gets the value of the lenderBank property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLenderBank() {
        return lenderBank;
    }

    /**
     * Sets the value of the lenderBank property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLenderBank(String value) {
        this.lenderBank = value;
    }

    /**
     * Gets the value of the lenderCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLenderCode() {
        return lenderCode;
    }

    /**
     * Sets the value of the lenderCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLenderCode(String value) {
        this.lenderCode = value;
    }

    /**
     * Gets the value of the lender property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLender() {
        return lender;
    }

    /**
     * Sets the value of the lender property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLender(String value) {
        this.lender = value;
    }

    /**
     * Gets the value of the lenderPhone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLenderPhone() {
        return lenderPhone;
    }

    /**
     * Sets the value of the lenderPhone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLenderPhone(String value) {
        this.lenderPhone = value;
    }

    /**
     * Gets the value of the lenderFax property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLenderFax() {
        return lenderFax;
    }

    /**
     * Sets the value of the lenderFax property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLenderFax(String value) {
        this.lenderFax = value;
    }

    /**
     * Gets the value of the yearRate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getYearRate() {
        return yearRate;
    }

    /**
     * Sets the value of the yearRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setYearRate(String value) {
        this.yearRate = value;
    }

    /**
     * Gets the value of the floatingRate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFloatingRate() {
        return floatingRate;
    }

    /**
     * Sets the value of the floatingRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFloatingRate(String value) {
        this.floatingRate = value;
    }

    /**
     * Gets the value of the floatRate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFloatRate() {
        return floatRate;
    }

    /**
     * Sets the value of the floatRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFloatRate(String value) {
        this.floatRate = value;
    }

    /**
     * Gets the value of the zero property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZero() {
        return zero;
    }

    /**
     * Sets the value of the zero property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZero(String value) {
        this.zero = value;
    }

    /**
     * Gets the value of the one property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOne() {
        return one;
    }

    /**
     * Sets the value of the one property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOne(String value) {
        this.one = value;
    }

    /**
     * Gets the value of the thirty property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getThirty() {
        return thirty;
    }

    /**
     * Sets the value of the thirty property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setThirty(String value) {
        this.thirty = value;
    }

    /**
     * Gets the value of the fifty property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFifty() {
        return fifty;
    }

    /**
     * Sets the value of the fifty property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFifty(String value) {
        this.fifty = value;
    }

    /**
     * Gets the value of the hundred property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHundred() {
        return hundred;
    }

    /**
     * Sets the value of the hundred property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHundred(String value) {
        this.hundred = value;
    }

    /**
     * Gets the value of the place property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlace() {
        return place;
    }

    /**
     * Sets the value of the place property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlace(String value) {
        this.place = value;
    }

    /**
     * Gets the value of the cuo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCuo() {
        return cuo;
    }

    /**
     * Sets the value of the cuo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCuo(String value) {
        this.cuo = value;
    }

    /**
     * Gets the value of the dui property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDui() {
        return dui;
    }

    /**
     * Sets the value of the dui property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDui(String value) {
        this.dui = value;
    }

    /**
     * Gets the value of the faYuan property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFaYuan() {
        return faYuan;
    }

    /**
     * Sets the value of the faYuan property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFaYuan(String value) {
        this.faYuan = value;
    }

    /**
     * Gets the value of the xie property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXie() {
        return xie;
    }

    /**
     * Sets the value of the xie property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXie(String value) {
        this.xie = value;
    }

}
