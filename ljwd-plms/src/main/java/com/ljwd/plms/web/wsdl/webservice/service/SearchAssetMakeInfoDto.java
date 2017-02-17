
package com.ljwd.plms.web.wsdl.webservice.service;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for searchAssetMakeInfoDto complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="searchAssetMakeInfoDto">
 *   &lt;complexContent>
 *     &lt;extension base="{http://webservice.loan.mfbms.flinkmf.com/}baseVersionableCreatorAwareEntityDto">
 *       &lt;sequence>
 *       &lt;/sequence>
 *       &lt;attribute name="applid" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="cntrctno" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="idcardno" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="custname" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="loanamt" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       &lt;attribute name="period" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="paymenttype" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="paydate" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="intrate" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="handamt" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "searchAssetMakeInfoDto")
public class SearchAssetMakeInfoDto
    extends BaseVersionableCreatorAwareEntityDto
{

    @XmlAttribute(name = "applid")
    protected Long applid;
    @XmlAttribute(name = "cntrctno")
    protected String cntrctno;
    @XmlAttribute(name = "idcardno")
    protected String idcardno;
    @XmlAttribute(name = "custname")
    protected String custname;
    @XmlAttribute(name = "loanamt")
    protected BigDecimal loanamt;
    @XmlAttribute(name = "period")
    protected Integer period;
    @XmlAttribute(name = "paymenttype")
    protected String paymenttype;
    @XmlAttribute(name = "paydate")
    protected String paydate;
    @XmlAttribute(name = "intrate")
    protected String intrate;
    @XmlAttribute(name = "handamt")
    protected BigDecimal handamt;

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
     * Gets the value of the paymenttype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymenttype() {
        return paymenttype;
    }

    /**
     * Sets the value of the paymenttype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymenttype(String value) {
        this.paymenttype = value;
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
     * Gets the value of the intrate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIntrate() {
        return intrate;
    }

    /**
     * Sets the value of the intrate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIntrate(String value) {
        this.intrate = value;
    }

    /**
     * Gets the value of the handamt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getHandamt() {
        return handamt;
    }

    /**
     * Sets the value of the handamt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setHandamt(BigDecimal value) {
        this.handamt = value;
    }

}
