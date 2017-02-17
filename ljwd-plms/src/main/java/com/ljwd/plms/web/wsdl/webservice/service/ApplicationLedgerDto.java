
package com.ljwd.plms.web.wsdl.webservice.service;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for applicationLedgerDto complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="applicationLedgerDto">
 *   &lt;complexContent>
 *     &lt;extension base="{http://webservice.loan.mfbms.flinkmf.com/}baseVersionableCreatorAwareEntityDto">
 *       &lt;sequence>
 *       &lt;/sequence>
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="ledgerTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="applicationInfoId" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="value" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       &lt;attribute name="valueType" type="{http://webservice.loan.mfbms.flinkmf.com/}valueType" />
 *       &lt;attribute name="isOverrided" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="overridedBy" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="overrideTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="isCalculated" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="amount" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       &lt;attribute name="calculatedBy" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="calculateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="remark" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "applicationLedgerDto")
public class ApplicationLedgerDto
    extends BaseVersionableCreatorAwareEntityDto
{

    @XmlAttribute(name = "id")
    protected Long id;
    @XmlAttribute(name = "ledgerTypeCode")
    protected String ledgerTypeCode;
    @XmlAttribute(name = "applicationInfoId")
    protected Long applicationInfoId;
    @XmlAttribute(name = "value")
    protected BigDecimal value;
    @XmlAttribute(name = "valueType")
    protected ValueType valueType;
    @XmlAttribute(name = "isOverrided")
    protected Boolean isOverrided;
    @XmlAttribute(name = "overridedBy")
    protected String overridedBy;
    @XmlAttribute(name = "overrideTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar overrideTime;
    @XmlAttribute(name = "isCalculated")
    protected Boolean isCalculated;
    @XmlAttribute(name = "amount")
    protected BigDecimal amount;
    @XmlAttribute(name = "calculatedBy")
    protected String calculatedBy;
    @XmlAttribute(name = "calculateTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar calculateTime;
    @XmlAttribute(name = "remark")
    protected String remark;

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
