
package com.ljwd.plms.web.wsdl.webservice.service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for chargeSchema complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="chargeSchema">
 *   &lt;complexContent>
 *     &lt;extension base="{http://webservice.loan.mfbms.flinkmf.com/}baseVersionableCreatorAwareEntity">
 *       &lt;sequence>
 *         &lt;element name="adjustInterestDecimal" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="adjustPrincipalDecimal" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="baseDays" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="calculatingInterestType" type="{http://webservice.loan.mfbms.flinkmf.com/}calculatingInterestType" minOccurs="0"/>
 *         &lt;element name="decimalPlace" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="interestRate" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="interestRateYear" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="productFees" type="{http://webservice.loan.mfbms.flinkmf.com/}productFee" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="repaymentMethod" type="{http://webservice.loan.mfbms.flinkmf.com/}repaymentMethod" minOccurs="0"/>
 *         &lt;element name="roundingMode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="schemaCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="schemaDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="schemaName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "chargeSchema", propOrder = {
    "adjustInterestDecimal",
    "adjustPrincipalDecimal",
    "baseDays",
    "calculatingInterestType",
    "decimalPlace",
    "interestRate",
    "interestRateYear",
    "productFees",
    "repaymentMethod",
    "roundingMode",
    "schemaCode",
    "schemaDescription",
    "schemaName"
})
public class ChargeSchema
    extends BaseVersionableCreatorAwareEntity
{

    protected Boolean adjustInterestDecimal;
    protected Boolean adjustPrincipalDecimal;
    protected Integer baseDays;
    protected CalculatingInterestType calculatingInterestType;
    protected Integer decimalPlace;
    protected BigDecimal interestRate;
    protected BigDecimal interestRateYear;
    @XmlElement(nillable = true)
    protected List<ProductFee> productFees;
    protected RepaymentMethod repaymentMethod;
    protected String roundingMode;
    protected String schemaCode;
    protected String schemaDescription;
    protected String schemaName;

    /**
     * Gets the value of the adjustInterestDecimal property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAdjustInterestDecimal() {
        return adjustInterestDecimal;
    }

    /**
     * Sets the value of the adjustInterestDecimal property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAdjustInterestDecimal(Boolean value) {
        this.adjustInterestDecimal = value;
    }

    /**
     * Gets the value of the adjustPrincipalDecimal property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAdjustPrincipalDecimal() {
        return adjustPrincipalDecimal;
    }

    /**
     * Sets the value of the adjustPrincipalDecimal property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAdjustPrincipalDecimal(Boolean value) {
        this.adjustPrincipalDecimal = value;
    }

    /**
     * Gets the value of the baseDays property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getBaseDays() {
        return baseDays;
    }

    /**
     * Sets the value of the baseDays property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setBaseDays(Integer value) {
        this.baseDays = value;
    }

    /**
     * Gets the value of the calculatingInterestType property.
     * 
     * @return
     *     possible object is
     *     {@link CalculatingInterestType }
     *     
     */
    public CalculatingInterestType getCalculatingInterestType() {
        return calculatingInterestType;
    }

    /**
     * Sets the value of the calculatingInterestType property.
     * 
     * @param value
     *     allowed object is
     *     {@link CalculatingInterestType }
     *     
     */
    public void setCalculatingInterestType(CalculatingInterestType value) {
        this.calculatingInterestType = value;
    }

    /**
     * Gets the value of the decimalPlace property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDecimalPlace() {
        return decimalPlace;
    }

    /**
     * Sets the value of the decimalPlace property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDecimalPlace(Integer value) {
        this.decimalPlace = value;
    }

    /**
     * Gets the value of the interestRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInterestRate() {
        return interestRate;
    }

    /**
     * Sets the value of the interestRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInterestRate(BigDecimal value) {
        this.interestRate = value;
    }

    /**
     * Gets the value of the interestRateYear property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInterestRateYear() {
        return interestRateYear;
    }

    /**
     * Sets the value of the interestRateYear property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInterestRateYear(BigDecimal value) {
        this.interestRateYear = value;
    }

    /**
     * Gets the value of the productFees property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the productFees property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProductFees().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProductFee }
     * 
     * 
     */
    public List<ProductFee> getProductFees() {
        if (productFees == null) {
            productFees = new ArrayList<ProductFee>();
        }
        return this.productFees;
    }

    /**
     * Gets the value of the repaymentMethod property.
     * 
     * @return
     *     possible object is
     *     {@link RepaymentMethod }
     *     
     */
    public RepaymentMethod getRepaymentMethod() {
        return repaymentMethod;
    }

    /**
     * Sets the value of the repaymentMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link RepaymentMethod }
     *     
     */
    public void setRepaymentMethod(RepaymentMethod value) {
        this.repaymentMethod = value;
    }

    /**
     * Gets the value of the roundingMode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRoundingMode() {
        return roundingMode;
    }

    /**
     * Sets the value of the roundingMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRoundingMode(String value) {
        this.roundingMode = value;
    }

    /**
     * Gets the value of the schemaCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSchemaCode() {
        return schemaCode;
    }

    /**
     * Sets the value of the schemaCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSchemaCode(String value) {
        this.schemaCode = value;
    }

    /**
     * Gets the value of the schemaDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSchemaDescription() {
        return schemaDescription;
    }

    /**
     * Sets the value of the schemaDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSchemaDescription(String value) {
        this.schemaDescription = value;
    }

    /**
     * Gets the value of the schemaName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSchemaName() {
        return schemaName;
    }

    /**
     * Sets the value of the schemaName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSchemaName(String value) {
        this.schemaName = value;
    }

}
