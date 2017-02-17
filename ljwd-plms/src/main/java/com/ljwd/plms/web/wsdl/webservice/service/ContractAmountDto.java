
package com.ljwd.plms.web.wsdl.webservice.service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for contractAmountDto complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="contractAmountDto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="returnAmount1th" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="returnAmount2th" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="returnAmount3th" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="returnAmount4th" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="contractAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="approvalAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="contractFees" type="{http://webservice.loan.mfbms.flinkmf.com/}contractFeeDto" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="totalAmount0Th" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       &lt;attribute name="totalAmount1Th" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       &lt;attribute name="totalAmountOther" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       &lt;attribute name="interestRate" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       &lt;attribute name="totalFeeRate" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "contractAmountDto", propOrder = {
    "returnAmount1Th",
    "returnAmount2Th",
    "returnAmount3Th",
    "returnAmount4Th",
    "contractAmount",
    "approvalAmount",
    "contractFees"
})
public class ContractAmountDto {

    @XmlElement(name = "returnAmount1th")
    protected BigDecimal returnAmount1Th;
    @XmlElement(name = "returnAmount2th")
    protected BigDecimal returnAmount2Th;
    @XmlElement(name = "returnAmount3th")
    protected BigDecimal returnAmount3Th;
    @XmlElement(name = "returnAmount4th")
    protected BigDecimal returnAmount4Th;
    protected BigDecimal contractAmount;
    protected BigDecimal approvalAmount;
    @XmlElement(nillable = true)
    protected List<ContractFeeDto> contractFees;
    @XmlAttribute(name = "totalAmount0Th", required = true)
    protected BigDecimal totalAmount0Th;
    @XmlAttribute(name = "totalAmount1Th", required = true)
    protected BigDecimal totalAmount1Th;
    @XmlAttribute(name = "totalAmountOther", required = true)
    protected BigDecimal totalAmountOther;
    @XmlAttribute(name = "interestRate", required = true)
    protected BigDecimal interestRate;
    @XmlAttribute(name = "totalFeeRate", required = true)
    protected BigDecimal totalFeeRate;

    /**
     * Gets the value of the returnAmount1Th property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getReturnAmount1Th() {
        return returnAmount1Th;
    }

    /**
     * Sets the value of the returnAmount1Th property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setReturnAmount1Th(BigDecimal value) {
        this.returnAmount1Th = value;
    }

    /**
     * Gets the value of the returnAmount2Th property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getReturnAmount2Th() {
        return returnAmount2Th;
    }

    /**
     * Sets the value of the returnAmount2Th property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setReturnAmount2Th(BigDecimal value) {
        this.returnAmount2Th = value;
    }

    /**
     * Gets the value of the returnAmount3Th property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getReturnAmount3Th() {
        return returnAmount3Th;
    }

    /**
     * Sets the value of the returnAmount3Th property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setReturnAmount3Th(BigDecimal value) {
        this.returnAmount3Th = value;
    }

    /**
     * Gets the value of the returnAmount4Th property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getReturnAmount4Th() {
        return returnAmount4Th;
    }

    /**
     * Sets the value of the returnAmount4Th property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setReturnAmount4Th(BigDecimal value) {
        this.returnAmount4Th = value;
    }

    /**
     * Gets the value of the contractAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getContractAmount() {
        return contractAmount;
    }

    /**
     * Sets the value of the contractAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setContractAmount(BigDecimal value) {
        this.contractAmount = value;
    }

    /**
     * Gets the value of the approvalAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getApprovalAmount() {
        return approvalAmount;
    }

    /**
     * Sets the value of the approvalAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setApprovalAmount(BigDecimal value) {
        this.approvalAmount = value;
    }

    /**
     * Gets the value of the contractFees property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contractFees property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContractFees().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ContractFeeDto }
     * 
     * 
     */
    public List<ContractFeeDto> getContractFees() {
        if (contractFees == null) {
            contractFees = new ArrayList<ContractFeeDto>();
        }
        return this.contractFees;
    }

    /**
     * Gets the value of the totalAmount0Th property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalAmount0Th() {
        return totalAmount0Th;
    }

    /**
     * Sets the value of the totalAmount0Th property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotalAmount0Th(BigDecimal value) {
        this.totalAmount0Th = value;
    }

    /**
     * Gets the value of the totalAmount1Th property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalAmount1Th() {
        return totalAmount1Th;
    }

    /**
     * Sets the value of the totalAmount1Th property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotalAmount1Th(BigDecimal value) {
        this.totalAmount1Th = value;
    }

    /**
     * Gets the value of the totalAmountOther property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalAmountOther() {
        return totalAmountOther;
    }

    /**
     * Sets the value of the totalAmountOther property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotalAmountOther(BigDecimal value) {
        this.totalAmountOther = value;
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
     * Gets the value of the totalFeeRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalFeeRate() {
        return totalFeeRate;
    }

    /**
     * Sets the value of the totalFeeRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotalFeeRate(BigDecimal value) {
        this.totalFeeRate = value;
    }

}
