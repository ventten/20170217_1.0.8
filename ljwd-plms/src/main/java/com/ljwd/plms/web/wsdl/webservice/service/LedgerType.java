
package com.ljwd.plms.web.wsdl.webservice.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ledgerType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ledgerType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://webservice.loan.mfbms.flinkmf.com/}baseVersionableCreatorAwareEntity">
 *       &lt;sequence>
 *         &lt;element name="canWaive" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="feeGroup" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="isAdvCollect" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="isFeeAfter" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="isFeeBefore" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="isInterest" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="isPayable" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="isPrincipal" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="isSub" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="repaymentSequence" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="repaymentSequence2" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ledgerType", propOrder = {
    "canWaive",
    "code",
    "feeGroup",
    "isAdvCollect",
    "isFeeAfter",
    "isFeeBefore",
    "isInterest",
    "isPayable",
    "isPrincipal",
    "isSub",
    "name",
    "repaymentSequence",
    "repaymentSequence2"
})
public class LedgerType
    extends BaseVersionableCreatorAwareEntity
{

    protected Boolean canWaive;
    protected String code;
    protected String feeGroup;
    protected Boolean isAdvCollect;
    protected Boolean isFeeAfter;
    protected Boolean isFeeBefore;
    protected Boolean isInterest;
    protected Boolean isPayable;
    protected Boolean isPrincipal;
    protected Boolean isSub;
    protected String name;
    protected Integer repaymentSequence;
    protected Integer repaymentSequence2;

    /**
     * Gets the value of the canWaive property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCanWaive() {
        return canWaive;
    }

    /**
     * Sets the value of the canWaive property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCanWaive(Boolean value) {
        this.canWaive = value;
    }

    /**
     * Gets the value of the code property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCode() {
        return code;
    }

    /**
     * Sets the value of the code property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCode(String value) {
        this.code = value;
    }

    /**
     * Gets the value of the feeGroup property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFeeGroup() {
        return feeGroup;
    }

    /**
     * Sets the value of the feeGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFeeGroup(String value) {
        this.feeGroup = value;
    }

    /**
     * Gets the value of the isAdvCollect property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsAdvCollect() {
        return isAdvCollect;
    }

    /**
     * Sets the value of the isAdvCollect property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsAdvCollect(Boolean value) {
        this.isAdvCollect = value;
    }

    /**
     * Gets the value of the isFeeAfter property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsFeeAfter() {
        return isFeeAfter;
    }

    /**
     * Sets the value of the isFeeAfter property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsFeeAfter(Boolean value) {
        this.isFeeAfter = value;
    }

    /**
     * Gets the value of the isFeeBefore property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsFeeBefore() {
        return isFeeBefore;
    }

    /**
     * Sets the value of the isFeeBefore property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsFeeBefore(Boolean value) {
        this.isFeeBefore = value;
    }

    /**
     * Gets the value of the isInterest property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsInterest() {
        return isInterest;
    }

    /**
     * Sets the value of the isInterest property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsInterest(Boolean value) {
        this.isInterest = value;
    }

    /**
     * Gets the value of the isPayable property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsPayable() {
        return isPayable;
    }

    /**
     * Sets the value of the isPayable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsPayable(Boolean value) {
        this.isPayable = value;
    }

    /**
     * Gets the value of the isPrincipal property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsPrincipal() {
        return isPrincipal;
    }

    /**
     * Sets the value of the isPrincipal property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsPrincipal(Boolean value) {
        this.isPrincipal = value;
    }

    /**
     * Gets the value of the isSub property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsSub() {
        return isSub;
    }

    /**
     * Sets the value of the isSub property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsSub(Boolean value) {
        this.isSub = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the repaymentSequence property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRepaymentSequence() {
        return repaymentSequence;
    }

    /**
     * Sets the value of the repaymentSequence property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRepaymentSequence(Integer value) {
        this.repaymentSequence = value;
    }

    /**
     * Gets the value of the repaymentSequence2 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRepaymentSequence2() {
        return repaymentSequence2;
    }

    /**
     * Sets the value of the repaymentSequence2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRepaymentSequence2(Integer value) {
        this.repaymentSequence2 = value;
    }

}
