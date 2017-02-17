
package com.ljwd.plms.web.wsdl.webservice.service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for receivableDto complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="receivableDto">
 *   &lt;complexContent>
 *     &lt;extension base="{http://webservice.loan.mfbms.flinkmf.com/}baseVersionableCreatorAwareEntityDto">
 *       &lt;sequence>
 *         &lt;element name="receivableDetails" type="{http://webservice.loan.mfbms.flinkmf.com/}receivableDetailDto" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="relatePlanDto" type="{http://webservice.loan.mfbms.flinkmf.com/}repaymentPlanDto" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="paymentId" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="contractId" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="applicationId" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="periodNumber" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="totalReceivableAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       &lt;attribute name="totalActualAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       &lt;attribute name="totalWaivedAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       &lt;attribute name="actualRepaymentDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="isOverdue" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="startDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="endDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="failCollectNumber" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="reCollectDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="reCollectAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       &lt;attribute name="lastCalcTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="status" type="{http://webservice.loan.mfbms.flinkmf.com/}repaymentStatus" />
 *       &lt;attribute name="isOffer" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="maxRepaymentDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="repaymentDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "receivableDto", propOrder = {
    "receivableDetails",
    "relatePlanDto"
})
public class ReceivableDto
    extends BaseVersionableCreatorAwareEntityDto
{

    @XmlElement(nillable = true)
    protected List<ReceivableDetailDto> receivableDetails;
    protected RepaymentPlanDto relatePlanDto;
    @XmlAttribute(name = "id")
    protected Long id;
    @XmlAttribute(name = "paymentId")
    protected Long paymentId;
    @XmlAttribute(name = "contractId")
    protected Long contractId;
    @XmlAttribute(name = "applicationId")
    protected Long applicationId;
    @XmlAttribute(name = "periodNumber")
    protected Integer periodNumber;
    @XmlAttribute(name = "totalReceivableAmount")
    protected BigDecimal totalReceivableAmount;
    @XmlAttribute(name = "totalActualAmount")
    protected BigDecimal totalActualAmount;
    @XmlAttribute(name = "totalWaivedAmount")
    protected BigDecimal totalWaivedAmount;
    @XmlAttribute(name = "actualRepaymentDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar actualRepaymentDate;
    @XmlAttribute(name = "isOverdue")
    protected Boolean isOverdue;
    @XmlAttribute(name = "startDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar startDate;
    @XmlAttribute(name = "endDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar endDate;
    @XmlAttribute(name = "failCollectNumber")
    protected Integer failCollectNumber;
    @XmlAttribute(name = "reCollectDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar reCollectDate;
    @XmlAttribute(name = "reCollectAmount")
    protected BigDecimal reCollectAmount;
    @XmlAttribute(name = "lastCalcTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastCalcTime;
    @XmlAttribute(name = "status")
    protected RepaymentStatus status;
    @XmlAttribute(name = "isOffer")
    protected Boolean isOffer;
    @XmlAttribute(name = "maxRepaymentDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar maxRepaymentDate;
    @XmlAttribute(name = "repaymentDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar repaymentDate;

    /**
     * Gets the value of the receivableDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the receivableDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReceivableDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ReceivableDetailDto }
     * 
     * 
     */
    public List<ReceivableDetailDto> getReceivableDetails() {
        if (receivableDetails == null) {
            receivableDetails = new ArrayList<ReceivableDetailDto>();
        }
        return this.receivableDetails;
    }

    /**
     * Gets the value of the relatePlanDto property.
     * 
     * @return
     *     possible object is
     *     {@link RepaymentPlanDto }
     *     
     */
    public RepaymentPlanDto getRelatePlanDto() {
        return relatePlanDto;
    }

    /**
     * Sets the value of the relatePlanDto property.
     * 
     * @param value
     *     allowed object is
     *     {@link RepaymentPlanDto }
     *     
     */
    public void setRelatePlanDto(RepaymentPlanDto value) {
        this.relatePlanDto = value;
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
     * Gets the value of the paymentId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPaymentId() {
        return paymentId;
    }

    /**
     * Sets the value of the paymentId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPaymentId(Long value) {
        this.paymentId = value;
    }

    /**
     * Gets the value of the contractId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getContractId() {
        return contractId;
    }

    /**
     * Sets the value of the contractId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setContractId(Long value) {
        this.contractId = value;
    }

    /**
     * Gets the value of the applicationId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getApplicationId() {
        return applicationId;
    }

    /**
     * Sets the value of the applicationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setApplicationId(Long value) {
        this.applicationId = value;
    }

    /**
     * Gets the value of the periodNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPeriodNumber() {
        return periodNumber;
    }

    /**
     * Sets the value of the periodNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPeriodNumber(Integer value) {
        this.periodNumber = value;
    }

    /**
     * Gets the value of the totalReceivableAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalReceivableAmount() {
        return totalReceivableAmount;
    }

    /**
     * Sets the value of the totalReceivableAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotalReceivableAmount(BigDecimal value) {
        this.totalReceivableAmount = value;
    }

    /**
     * Gets the value of the totalActualAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalActualAmount() {
        return totalActualAmount;
    }

    /**
     * Sets the value of the totalActualAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotalActualAmount(BigDecimal value) {
        this.totalActualAmount = value;
    }

    /**
     * Gets the value of the totalWaivedAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalWaivedAmount() {
        return totalWaivedAmount;
    }

    /**
     * Sets the value of the totalWaivedAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotalWaivedAmount(BigDecimal value) {
        this.totalWaivedAmount = value;
    }

    /**
     * Gets the value of the actualRepaymentDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getActualRepaymentDate() {
        return actualRepaymentDate;
    }

    /**
     * Sets the value of the actualRepaymentDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setActualRepaymentDate(XMLGregorianCalendar value) {
        this.actualRepaymentDate = value;
    }

    /**
     * Gets the value of the isOverdue property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsOverdue() {
        return isOverdue;
    }

    /**
     * Sets the value of the isOverdue property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsOverdue(Boolean value) {
        this.isOverdue = value;
    }

    /**
     * Gets the value of the startDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStartDate() {
        return startDate;
    }

    /**
     * Sets the value of the startDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStartDate(XMLGregorianCalendar value) {
        this.startDate = value;
    }

    /**
     * Gets the value of the endDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEndDate() {
        return endDate;
    }

    /**
     * Sets the value of the endDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEndDate(XMLGregorianCalendar value) {
        this.endDate = value;
    }

    /**
     * Gets the value of the failCollectNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getFailCollectNumber() {
        return failCollectNumber;
    }

    /**
     * Sets the value of the failCollectNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setFailCollectNumber(Integer value) {
        this.failCollectNumber = value;
    }

    /**
     * Gets the value of the reCollectDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getReCollectDate() {
        return reCollectDate;
    }

    /**
     * Sets the value of the reCollectDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setReCollectDate(XMLGregorianCalendar value) {
        this.reCollectDate = value;
    }

    /**
     * Gets the value of the reCollectAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getReCollectAmount() {
        return reCollectAmount;
    }

    /**
     * Sets the value of the reCollectAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setReCollectAmount(BigDecimal value) {
        this.reCollectAmount = value;
    }

    /**
     * Gets the value of the lastCalcTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastCalcTime() {
        return lastCalcTime;
    }

    /**
     * Sets the value of the lastCalcTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastCalcTime(XMLGregorianCalendar value) {
        this.lastCalcTime = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link RepaymentStatus }
     *     
     */
    public RepaymentStatus getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link RepaymentStatus }
     *     
     */
    public void setStatus(RepaymentStatus value) {
        this.status = value;
    }

    /**
     * Gets the value of the isOffer property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsOffer() {
        return isOffer;
    }

    /**
     * Sets the value of the isOffer property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsOffer(Boolean value) {
        this.isOffer = value;
    }

    /**
     * Gets the value of the maxRepaymentDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getMaxRepaymentDate() {
        return maxRepaymentDate;
    }

    /**
     * Sets the value of the maxRepaymentDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setMaxRepaymentDate(XMLGregorianCalendar value) {
        this.maxRepaymentDate = value;
    }

    /**
     * Gets the value of the repaymentDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRepaymentDate() {
        return repaymentDate;
    }

    /**
     * Sets the value of the repaymentDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRepaymentDate(XMLGregorianCalendar value) {
        this.repaymentDate = value;
    }

}
