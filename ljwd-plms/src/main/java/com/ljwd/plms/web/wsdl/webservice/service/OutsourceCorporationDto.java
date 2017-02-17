
package com.ljwd.plms.web.wsdl.webservice.service;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for outsourceCorporationDto complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="outsourceCorporationDto">
 *   &lt;complexContent>
 *     &lt;extension base="{http://webservice.loan.mfbms.flinkmf.com/}baseVersionableCreatorAwareEntityDto">
 *       &lt;sequence>
 *         &lt;element name="weightPercentFirst" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="weightPercentSecond" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="receivableAmtSumFirst" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="receivableAmtSumSecond" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="receivableAmtPercentFirst" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="receivableAmtPercentSecond" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="corporationName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="address" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="telephone1" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="telephone2" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="weightFirst" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       &lt;attribute name="weightSecond" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       &lt;attribute name="isValid" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="remark" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "outsourceCorporationDto", propOrder = {
    "weightPercentFirst",
    "weightPercentSecond",
    "receivableAmtSumFirst",
    "receivableAmtSumSecond",
    "receivableAmtPercentFirst",
    "receivableAmtPercentSecond"
})
public class OutsourceCorporationDto
    extends BaseVersionableCreatorAwareEntityDto
{

    protected BigDecimal weightPercentFirst;
    protected BigDecimal weightPercentSecond;
    protected BigDecimal receivableAmtSumFirst;
    protected BigDecimal receivableAmtSumSecond;
    protected BigDecimal receivableAmtPercentFirst;
    protected BigDecimal receivableAmtPercentSecond;
    @XmlAttribute(name = "id")
    protected Long id;
    @XmlAttribute(name = "corporationName")
    protected String corporationName;
    @XmlAttribute(name = "address")
    protected String address;
    @XmlAttribute(name = "telephone1")
    protected String telephone1;
    @XmlAttribute(name = "telephone2")
    protected String telephone2;
    @XmlAttribute(name = "weightFirst")
    protected BigDecimal weightFirst;
    @XmlAttribute(name = "weightSecond")
    protected BigDecimal weightSecond;
    @XmlAttribute(name = "isValid")
    protected Boolean isValid;
    @XmlAttribute(name = "remark")
    protected String remark;

    /**
     * Gets the value of the weightPercentFirst property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getWeightPercentFirst() {
        return weightPercentFirst;
    }

    /**
     * Sets the value of the weightPercentFirst property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setWeightPercentFirst(BigDecimal value) {
        this.weightPercentFirst = value;
    }

    /**
     * Gets the value of the weightPercentSecond property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getWeightPercentSecond() {
        return weightPercentSecond;
    }

    /**
     * Sets the value of the weightPercentSecond property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setWeightPercentSecond(BigDecimal value) {
        this.weightPercentSecond = value;
    }

    /**
     * Gets the value of the receivableAmtSumFirst property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getReceivableAmtSumFirst() {
        return receivableAmtSumFirst;
    }

    /**
     * Sets the value of the receivableAmtSumFirst property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setReceivableAmtSumFirst(BigDecimal value) {
        this.receivableAmtSumFirst = value;
    }

    /**
     * Gets the value of the receivableAmtSumSecond property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getReceivableAmtSumSecond() {
        return receivableAmtSumSecond;
    }

    /**
     * Sets the value of the receivableAmtSumSecond property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setReceivableAmtSumSecond(BigDecimal value) {
        this.receivableAmtSumSecond = value;
    }

    /**
     * Gets the value of the receivableAmtPercentFirst property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getReceivableAmtPercentFirst() {
        return receivableAmtPercentFirst;
    }

    /**
     * Sets the value of the receivableAmtPercentFirst property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setReceivableAmtPercentFirst(BigDecimal value) {
        this.receivableAmtPercentFirst = value;
    }

    /**
     * Gets the value of the receivableAmtPercentSecond property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getReceivableAmtPercentSecond() {
        return receivableAmtPercentSecond;
    }

    /**
     * Sets the value of the receivableAmtPercentSecond property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setReceivableAmtPercentSecond(BigDecimal value) {
        this.receivableAmtPercentSecond = value;
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
     * Gets the value of the corporationName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCorporationName() {
        return corporationName;
    }

    /**
     * Sets the value of the corporationName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCorporationName(String value) {
        this.corporationName = value;
    }

    /**
     * Gets the value of the address property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddress() {
        return address;
    }

    /**
     * Sets the value of the address property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddress(String value) {
        this.address = value;
    }

    /**
     * Gets the value of the telephone1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTelephone1() {
        return telephone1;
    }

    /**
     * Sets the value of the telephone1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTelephone1(String value) {
        this.telephone1 = value;
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
     * Gets the value of the weightFirst property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getWeightFirst() {
        return weightFirst;
    }

    /**
     * Sets the value of the weightFirst property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setWeightFirst(BigDecimal value) {
        this.weightFirst = value;
    }

    /**
     * Gets the value of the weightSecond property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getWeightSecond() {
        return weightSecond;
    }

    /**
     * Sets the value of the weightSecond property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setWeightSecond(BigDecimal value) {
        this.weightSecond = value;
    }

    /**
     * Gets the value of the isValid property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsValid() {
        return isValid;
    }

    /**
     * Sets the value of the isValid property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsValid(Boolean value) {
        this.isValid = value;
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

}
