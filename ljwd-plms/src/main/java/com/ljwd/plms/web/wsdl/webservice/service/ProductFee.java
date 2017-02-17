
package com.ljwd.plms.web.wsdl.webservice.service;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for productFee complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="productFee">
 *   &lt;complexContent>
 *     &lt;extension base="{http://webservice.loan.mfbms.flinkmf.com/}baseVersionableCreatorAwareEntity">
 *       &lt;sequence>
 *         &lt;element name="baseValue" type="{http://webservice.loan.mfbms.flinkmf.com/}calcBaseValue" minOccurs="0"/>
 *         &lt;element name="calcMethod" type="{http://webservice.loan.mfbms.flinkmf.com/}calcMethod" minOccurs="0"/>
 *         &lt;element name="chargeSchema" type="{http://webservice.loan.mfbms.flinkmf.com/}chargeSchema" minOccurs="0"/>
 *         &lt;element name="chargeTime" type="{http://webservice.loan.mfbms.flinkmf.com/}chargeTime" minOccurs="0"/>
 *         &lt;element name="ledgerType" type="{http://webservice.loan.mfbms.flinkmf.com/}ledgerType" minOccurs="0"/>
 *         &lt;element name="ledgerTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="productFeeDetails" type="{http://webservice.loan.mfbms.flinkmf.com/}productFeeDetail" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="valueType" type="{http://webservice.loan.mfbms.flinkmf.com/}valueType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "productFee", propOrder = {
    "baseValue",
    "calcMethod",
    "chargeSchema",
    "chargeTime",
    "ledgerType",
    "ledgerTypeCode",
    "productFeeDetails",
    "valueType"
})
public class ProductFee
    extends BaseVersionableCreatorAwareEntity
{

    protected CalcBaseValue baseValue;
    protected CalcMethod calcMethod;
    protected ChargeSchema chargeSchema;
    protected ChargeTime chargeTime;
    protected LedgerType ledgerType;
    protected String ledgerTypeCode;
    @XmlElement(nillable = true)
    protected List<ProductFeeDetail> productFeeDetails;
    protected ValueType valueType;

    /**
     * Gets the value of the baseValue property.
     * 
     * @return
     *     possible object is
     *     {@link CalcBaseValue }
     *     
     */
    public CalcBaseValue getBaseValue() {
        return baseValue;
    }

    /**
     * Sets the value of the baseValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link CalcBaseValue }
     *     
     */
    public void setBaseValue(CalcBaseValue value) {
        this.baseValue = value;
    }

    /**
     * Gets the value of the calcMethod property.
     * 
     * @return
     *     possible object is
     *     {@link CalcMethod }
     *     
     */
    public CalcMethod getCalcMethod() {
        return calcMethod;
    }

    /**
     * Sets the value of the calcMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link CalcMethod }
     *     
     */
    public void setCalcMethod(CalcMethod value) {
        this.calcMethod = value;
    }

    /**
     * Gets the value of the chargeSchema property.
     * 
     * @return
     *     possible object is
     *     {@link ChargeSchema }
     *     
     */
    public ChargeSchema getChargeSchema() {
        return chargeSchema;
    }

    /**
     * Sets the value of the chargeSchema property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChargeSchema }
     *     
     */
    public void setChargeSchema(ChargeSchema value) {
        this.chargeSchema = value;
    }

    /**
     * Gets the value of the chargeTime property.
     * 
     * @return
     *     possible object is
     *     {@link ChargeTime }
     *     
     */
    public ChargeTime getChargeTime() {
        return chargeTime;
    }

    /**
     * Sets the value of the chargeTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChargeTime }
     *     
     */
    public void setChargeTime(ChargeTime value) {
        this.chargeTime = value;
    }

    /**
     * Gets the value of the ledgerType property.
     * 
     * @return
     *     possible object is
     *     {@link LedgerType }
     *     
     */
    public LedgerType getLedgerType() {
        return ledgerType;
    }

    /**
     * Sets the value of the ledgerType property.
     * 
     * @param value
     *     allowed object is
     *     {@link LedgerType }
     *     
     */
    public void setLedgerType(LedgerType value) {
        this.ledgerType = value;
    }

    /**
     * Gets the value of the ledgerTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLedgerTypeCode() {
        return ledgerTypeCode;
    }

    /**
     * Sets the value of the ledgerTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLedgerTypeCode(String value) {
        this.ledgerTypeCode = value;
    }

    /**
     * Gets the value of the productFeeDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the productFeeDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProductFeeDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProductFeeDetail }
     * 
     * 
     */
    public List<ProductFeeDetail> getProductFeeDetails() {
        if (productFeeDetails == null) {
            productFeeDetails = new ArrayList<ProductFeeDetail>();
        }
        return this.productFeeDetails;
    }

    /**
     * Gets the value of the valueType property.
     * 
     * @return
     *     possible object is
     *     {@link ValueType }
     *     
     */
    public ValueType getValueType() {
        return valueType;
    }

    /**
     * Sets the value of the valueType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ValueType }
     *     
     */
    public void setValueType(ValueType value) {
        this.valueType = value;
    }

}
