
package com.ljwd.plms.web.wsdl.webservice.service;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for applicationLedger complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="applicationLedger">
 *   &lt;complexContent>
 *     &lt;extension base="{http://webservice.loan.mfbms.flinkmf.com/}baseVersionableCreatorAwareEntity">
 *       &lt;sequence>
 *         &lt;element name="amount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="applicationInfo" type="{http://webservice.loan.mfbms.flinkmf.com/}applicationInfo" minOccurs="0"/>
 *         &lt;element name="applicationInfoId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="calculateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="calculatedBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="isCalculated" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="isOverrided" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ledgerType" type="{http://webservice.loan.mfbms.flinkmf.com/}ledgerType" minOccurs="0"/>
 *         &lt;element name="ledgerTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="overrideTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="overridedBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="remark" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="value" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
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
@XmlType(name = "applicationLedger", propOrder = {
    "amount",
    "applicationInfo",
    "applicationInfoId",
    "calculateTime",
    "calculatedBy",
    "isCalculated",
    "isOverrided",
    "ledgerType",
    "ledgerTypeCode",
    "overrideTime",
    "overridedBy",
    "remark",
    "value",
    "valueType"
})
public class ApplicationLedger
    extends BaseVersionableCreatorAwareEntity
{

    protected BigDecimal amount;
    protected ApplicationInfo applicationInfo;
    protected Long applicationInfoId;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar calculateTime;
    protected String calculatedBy;
    protected Boolean isCalculated;
    protected Boolean isOverrided;
    protected LedgerType ledgerType;
    protected String ledgerTypeCode;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar overrideTime;
    protected String overridedBy;
    protected String remark;
    protected BigDecimal value;
    protected ValueType valueType;

    /**
     * Gets the value of the amount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAmount() {
        return amount;
    }

    /**
     * Sets the value of the amount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAmount(BigDecimal value) {
        this.amount = value;
    }

    /**
     * Gets the value of the applicationInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ApplicationInfo }
     *     
     */
    public ApplicationInfo getApplicationInfo() {
        return applicationInfo;
    }

    /**
     * Sets the value of the applicationInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApplicationInfo }
     *     
     */
    public void setApplicationInfo(ApplicationInfo value) {
        this.applicationInfo = value;
    }

    /**
     * Gets the value of the applicationInfoId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getApplicationInfoId() {
        return applicationInfoId;
    }

    /**
     * Sets the value of the applicationInfoId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setApplicationInfoId(Long value) {
        this.applicationInfoId = value;
    }

    /**
     * Gets the value of the calculateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCalculateTime() {
        return calculateTime;
    }

    /**
     * Sets the value of the calculateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCalculateTime(XMLGregorianCalendar value) {
        this.calculateTime = value;
    }

    /**
     * Gets the value of the calculatedBy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCalculatedBy() {
        return calculatedBy;
    }

    /**
     * Sets the value of the calculatedBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCalculatedBy(String value) {
        this.calculatedBy = value;
    }

    /**
     * Gets the value of the isCalculated property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsCalculated() {
        return isCalculated;
    }

    /**
     * Sets the value of the isCalculated property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsCalculated(Boolean value) {
        this.isCalculated = value;
    }

    /**
     * Gets the value of the isOverrided property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsOverrided() {
        return isOverrided;
    }

    /**
     * Sets the value of the isOverrided property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsOverrided(Boolean value) {
        this.isOverrided = value;
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
     * Gets the value of the overrideTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOverrideTime() {
        return overrideTime;
    }

    /**
     * Sets the value of the overrideTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOverrideTime(XMLGregorianCalendar value) {
        this.overrideTime = value;
    }

    /**
     * Gets the value of the overridedBy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOverridedBy() {
        return overridedBy;
    }

    /**
     * Sets the value of the overridedBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOverridedBy(String value) {
        this.overridedBy = value;
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

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setValue(BigDecimal value) {
        this.value = value;
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
