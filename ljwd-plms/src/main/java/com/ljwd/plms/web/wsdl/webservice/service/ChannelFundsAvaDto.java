
package com.ljwd.plms.web.wsdl.webservice.service;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for channelFundsAvaDto complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="channelFundsAvaDto">
 *   &lt;complexContent>
 *     &lt;extension base="{http://webservice.loan.mfbms.flinkmf.com/}baseVersionableCreatorAwareEntityDto">
 *       &lt;sequence>
 *       &lt;/sequence>
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="paymetType" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="businessCategory" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="isLimit" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="avalableCredit" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       &lt;attribute name="usedCredit" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       &lt;attribute name="remainCredit" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "channelFundsAvaDto")
public class ChannelFundsAvaDto
    extends BaseVersionableCreatorAwareEntityDto
{

    @XmlAttribute(name = "id")
    protected Long id;
    @XmlAttribute(name = "paymetType")
    protected String paymetType;
    @XmlAttribute(name = "businessCategory")
    protected String businessCategory;
    @XmlAttribute(name = "isLimit")
    protected String isLimit;
    @XmlAttribute(name = "avalableCredit")
    protected BigDecimal avalableCredit;
    @XmlAttribute(name = "usedCredit")
    protected BigDecimal usedCredit;
    @XmlAttribute(name = "remainCredit")
    protected BigDecimal remainCredit;

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
     * Gets the value of the paymetType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymetType() {
        return paymetType;
    }

    /**
     * Sets the value of the paymetType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymetType(String value) {
        this.paymetType = value;
    }

    /**
     * Gets the value of the businessCategory property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBusinessCategory() {
        return businessCategory;
    }

    /**
     * Sets the value of the businessCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBusinessCategory(String value) {
        this.businessCategory = value;
    }

    /**
     * Gets the value of the isLimit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsLimit() {
        return isLimit;
    }

    /**
     * Sets the value of the isLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsLimit(String value) {
        this.isLimit = value;
    }

    /**
     * Gets the value of the avalableCredit property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAvalableCredit() {
        return avalableCredit;
    }

    /**
     * Sets the value of the avalableCredit property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAvalableCredit(BigDecimal value) {
        this.avalableCredit = value;
    }

    /**
     * Gets the value of the usedCredit property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getUsedCredit() {
        return usedCredit;
    }

    /**
     * Sets the value of the usedCredit property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setUsedCredit(BigDecimal value) {
        this.usedCredit = value;
    }

    /**
     * Gets the value of the remainCredit property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRemainCredit() {
        return remainCredit;
    }

    /**
     * Sets the value of the remainCredit property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRemainCredit(BigDecimal value) {
        this.remainCredit = value;
    }

}
