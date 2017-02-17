
package com.ljwd.plms.web.wsdl.webservice.service;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for searchAssetBagInfoResultDto complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="searchAssetBagInfoResultDto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *       &lt;/sequence>
 *       &lt;attribute name="recivid" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="periodnum" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="paymentname" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="prdname" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="cntrctno" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="paydate" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="custname" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="idcardno" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="loanamt" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       &lt;attribute name="rpmntdate" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="recivprincipal" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       &lt;attribute name="recivinterest" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       &lt;attribute name="recivotheramt" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       &lt;attribute name="recivamt" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       &lt;attribute name="actualdate" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="actualprincipal" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       &lt;attribute name="actualinterest" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       &lt;attribute name="actualotheramt" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       &lt;attribute name="actualamt" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "searchAssetBagInfoResultDto")
public class SearchAssetBagInfoResultDto {

    @XmlAttribute(name = "recivid")
    protected Long recivid;
    @XmlAttribute(name = "periodnum")
    protected Integer periodnum;
    @XmlAttribute(name = "paymentname")
    protected String paymentname;
    @XmlAttribute(name = "prdname")
    protected String prdname;
    @XmlAttribute(name = "cntrctno")
    protected String cntrctno;
    @XmlAttribute(name = "paydate")
    protected String paydate;
    @XmlAttribute(name = "custname")
    protected String custname;
    @XmlAttribute(name = "idcardno")
    protected String idcardno;
    @XmlAttribute(name = "loanamt")
    protected BigDecimal loanamt;
    @XmlAttribute(name = "rpmntdate")
    protected String rpmntdate;
    @XmlAttribute(name = "recivprincipal")
    protected BigDecimal recivprincipal;
    @XmlAttribute(name = "recivinterest")
    protected BigDecimal recivinterest;
    @XmlAttribute(name = "recivotheramt")
    protected BigDecimal recivotheramt;
    @XmlAttribute(name = "recivamt")
    protected BigDecimal recivamt;
    @XmlAttribute(name = "actualdate")
    protected String actualdate;
    @XmlAttribute(name = "actualprincipal")
    protected BigDecimal actualprincipal;
    @XmlAttribute(name = "actualinterest")
    protected BigDecimal actualinterest;
    @XmlAttribute(name = "actualotheramt")
    protected BigDecimal actualotheramt;
    @XmlAttribute(name = "actualamt")
    protected BigDecimal actualamt;

    /**
     * Gets the value of the recivid property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getRecivid() {
        return recivid;
    }

    /**
     * Sets the value of the recivid property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setRecivid(Long value) {
        this.recivid = value;
    }

    /**
     * Gets the value of the periodnum property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPeriodnum() {
        return periodnum;
    }

    /**
     * Sets the value of the periodnum property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPeriodnum(Integer value) {
        this.periodnum = value;
    }

    /**
     * Gets the value of the paymentname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentname() {
        return paymentname;
    }

    /**
     * Sets the value of the paymentname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentname(String value) {
        this.paymentname = value;
    }

    /**
     * Gets the value of the prdname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrdname() {
        return prdname;
    }

    /**
     * Sets the value of the prdname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrdname(String value) {
        this.prdname = value;
    }

    /**
     * Gets the value of the cntrctno property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCntrctno() {
        return cntrctno;
    }

    /**
     * Sets the value of the cntrctno property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCntrctno(String value) {
        this.cntrctno = value;
    }

    /**
     * Gets the value of the paydate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaydate() {
        return paydate;
    }

    /**
     * Sets the value of the paydate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaydate(String value) {
        this.paydate = value;
    }

    /**
     * Gets the value of the custname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustname() {
        return custname;
    }

    /**
     * Sets the value of the custname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustname(String value) {
        this.custname = value;
    }

    /**
     * Gets the value of the idcardno property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdcardno() {
        return idcardno;
    }

    /**
     * Sets the value of the idcardno property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdcardno(String value) {
        this.idcardno = value;
    }

    /**
     * Gets the value of the loanamt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getLoanamt() {
        return loanamt;
    }

    /**
     * Sets the value of the loanamt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setLoanamt(BigDecimal value) {
        this.loanamt = value;
    }

    /**
     * Gets the value of the rpmntdate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRpmntdate() {
        return rpmntdate;
    }

    /**
     * Sets the value of the rpmntdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRpmntdate(String value) {
        this.rpmntdate = value;
    }

    /**
     * Gets the value of the recivprincipal property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRecivprincipal() {
        return recivprincipal;
    }

    /**
     * Sets the value of the recivprincipal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRecivprincipal(BigDecimal value) {
        this.recivprincipal = value;
    }

    /**
     * Gets the value of the recivinterest property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRecivinterest() {
        return recivinterest;
    }

    /**
     * Sets the value of the recivinterest property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRecivinterest(BigDecimal value) {
        this.recivinterest = value;
    }

    /**
     * Gets the value of the recivotheramt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRecivotheramt() {
        return recivotheramt;
    }

    /**
     * Sets the value of the recivotheramt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRecivotheramt(BigDecimal value) {
        this.recivotheramt = value;
    }

    /**
     * Gets the value of the recivamt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRecivamt() {
        return recivamt;
    }

    /**
     * Sets the value of the recivamt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRecivamt(BigDecimal value) {
        this.recivamt = value;
    }

    /**
     * Gets the value of the actualdate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActualdate() {
        return actualdate;
    }

    /**
     * Sets the value of the actualdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActualdate(String value) {
        this.actualdate = value;
    }

    /**
     * Gets the value of the actualprincipal property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getActualprincipal() {
        return actualprincipal;
    }

    /**
     * Sets the value of the actualprincipal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setActualprincipal(BigDecimal value) {
        this.actualprincipal = value;
    }

    /**
     * Gets the value of the actualinterest property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getActualinterest() {
        return actualinterest;
    }

    /**
     * Sets the value of the actualinterest property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setActualinterest(BigDecimal value) {
        this.actualinterest = value;
    }

    /**
     * Gets the value of the actualotheramt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getActualotheramt() {
        return actualotheramt;
    }

    /**
     * Sets the value of the actualotheramt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setActualotheramt(BigDecimal value) {
        this.actualotheramt = value;
    }

    /**
     * Gets the value of the actualamt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getActualamt() {
        return actualamt;
    }

    /**
     * Sets the value of the actualamt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setActualamt(BigDecimal value) {
        this.actualamt = value;
    }

}
