
package com.ljwd.plms.web.wsdl.webservice.service;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for searchAssetBagDto complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="searchAssetBagDto">
 *   &lt;complexContent>
 *     &lt;extension base="{http://webservice.loan.mfbms.flinkmf.com/}baseVersionableCreatorAwareEntityDto">
 *       &lt;sequence>
 *       &lt;/sequence>
 *       &lt;attribute name="assdtlid" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="applid" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="corpname" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="batch" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="prdname" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="cntrctno" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="paydate" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="custname" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="idcardno" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="loanamt" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       &lt;attribute name="period" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="actualamt" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       &lt;attribute name="periodnum" type="{http://www.w3.org/2001/XMLSchema}int" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "searchAssetBagDto")
public class SearchAssetBagDto
    extends BaseVersionableCreatorAwareEntityDto
{

    @XmlAttribute(name = "assdtlid")
    protected Long assdtlid;
    @XmlAttribute(name = "applid")
    protected Long applid;
    @XmlAttribute(name = "corpname")
    protected String corpname;
    @XmlAttribute(name = "batch")
    protected String batch;
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
    @XmlAttribute(name = "period")
    protected Integer period;
    @XmlAttribute(name = "actualamt")
    protected BigDecimal actualamt;
    @XmlAttribute(name = "periodnum")
    protected Integer periodnum;

    /**
     * Gets the value of the assdtlid property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getAssdtlid() {
        return assdtlid;
    }

    /**
     * Sets the value of the assdtlid property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setAssdtlid(Long value) {
        this.assdtlid = value;
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
     * Gets the value of the corpname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCorpname() {
        return corpname;
    }

    /**
     * Sets the value of the corpname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCorpname(String value) {
        this.corpname = value;
    }

    /**
     * Gets the value of the batch property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBatch() {
        return batch;
    }

    /**
     * Sets the value of the batch property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBatch(String value) {
        this.batch = value;
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
     * Gets the value of the period property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPeriod() {
        return period;
    }

    /**
     * Sets the value of the period property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPeriod(Integer value) {
        this.period = value;
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

}
