
package com.ljwd.plms.web.wsdl.webservice.service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for receivable complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="receivable">
 *   &lt;complexContent>
 *     &lt;extension base="{http://webservice.loan.mfbms.flinkmf.com/}baseVersionableCreatorAwareEntity">
 *       &lt;sequence>
 *         &lt;element name="actualRepaymentDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="applicationId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="contract" type="{http://webservice.loan.mfbms.flinkmf.com/}contract" minOccurs="0"/>
 *         &lt;element name="contractId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="endDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="failCollectNumber" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="isAdvanceClear" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="isDeleted" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="isOverdue" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="lastCalcTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="maxRepaymentDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="payment" type="{http://webservice.loan.mfbms.flinkmf.com/}payment" minOccurs="0"/>
 *         &lt;element name="paymentId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="periodNumber" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="reCollectAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="reCollectDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="reCollectIsAdvanceClear" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="receivableDetails" type="{http://webservice.loan.mfbms.flinkmf.com/}receivableDetail" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="receivableFeeDetails" type="{http://webservice.loan.mfbms.flinkmf.com/}receivableFeeDetail" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="repaymentDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="repaymentDetails" type="{http://webservice.loan.mfbms.flinkmf.com/}repaymentDetail" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="returnAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="startDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="status" type="{http://webservice.loan.mfbms.flinkmf.com/}repaymentStatus" minOccurs="0"/>
 *         &lt;element name="totalActualAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="totalReceivableAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="totalWaivedAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="waiveRequestDetails" type="{http://webservice.loan.mfbms.flinkmf.com/}waiveRequestDetail" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="waives" type="{http://webservice.loan.mfbms.flinkmf.com/}waive" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "receivable", propOrder = {
    "actualRepaymentDate",
    "applicationId",
    "contract",
    "contractId",
    "endDate",
    "failCollectNumber",
    "isAdvanceClear",
    "isDeleted",
    "isOverdue",
    "lastCalcTime",
    "maxRepaymentDate",
    "payment",
    "paymentId",
    "periodNumber",
    "reCollectAmount",
    "reCollectDate",
    "reCollectIsAdvanceClear",
    "receivableDetails",
    "receivableFeeDetails",
    "repaymentDate",
    "repaymentDetails",
    "returnAmount",
    "startDate",
    "status",
    "totalActualAmount",
    "totalReceivableAmount",
    "totalWaivedAmount",
    "waiveRequestDetails",
    "waives"
})
public class Receivable
    extends BaseVersionableCreatorAwareEntity
{

    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar actualRepaymentDate;
    protected Long applicationId;
    protected Contract contract;
    protected Long contractId;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar endDate;
    protected Integer failCollectNumber;
    protected Boolean isAdvanceClear;
    protected Boolean isDeleted;
    protected Boolean isOverdue;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastCalcTime;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar maxRepaymentDate;
    protected Payment payment;
    protected Long paymentId;
    protected Integer periodNumber;
    protected BigDecimal reCollectAmount;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar reCollectDate;
    protected Boolean reCollectIsAdvanceClear;
    @XmlElement(nillable = true)
    protected List<ReceivableDetail> receivableDetails;
    @XmlElement(nillable = true)
    protected List<ReceivableFeeDetail> receivableFeeDetails;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar repaymentDate;
    @XmlElement(nillable = true)
    protected List<RepaymentDetail> repaymentDetails;
    protected BigDecimal returnAmount;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar startDate;
    protected RepaymentStatus status;
    protected BigDecimal totalActualAmount;
    protected BigDecimal totalReceivableAmount;
    protected BigDecimal totalWaivedAmount;
    @XmlElement(nillable = true)
    protected List<WaiveRequestDetail> waiveRequestDetails;
    @XmlElement(nillable = true)
    protected List<Waive> waives;

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
     * Gets the value of the contract property.
     * 
     * @return
     *     possible object is
     *     {@link Contract }
     *     
     */
    public Contract getContract() {
        return contract;
    }

    /**
     * Sets the value of the contract property.
     * 
     * @param value
     *     allowed object is
     *     {@link Contract }
     *     
     */
    public void setContract(Contract value) {
        this.contract = value;
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
     * Gets the value of the isAdvanceClear property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsAdvanceClear() {
        return isAdvanceClear;
    }

    /**
     * Sets the value of the isAdvanceClear property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsAdvanceClear(Boolean value) {
        this.isAdvanceClear = value;
    }

    /**
     * Gets the value of the isDeleted property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsDeleted() {
        return isDeleted;
    }

    /**
     * Sets the value of the isDeleted property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsDeleted(Boolean value) {
        this.isDeleted = value;
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
     * Gets the value of the payment property.
     * 
     * @return
     *     possible object is
     *     {@link Payment }
     *     
     */
    public Payment getPayment() {
        return payment;
    }

    /**
     * Sets the value of the payment property.
     * 
     * @param value
     *     allowed object is
     *     {@link Payment }
     *     
     */
    public void setPayment(Payment value) {
        this.payment = value;
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
     * Gets the value of the reCollectIsAdvanceClear property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isReCollectIsAdvanceClear() {
        return reCollectIsAdvanceClear;
    }

    /**
     * Sets the value of the reCollectIsAdvanceClear property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setReCollectIsAdvanceClear(Boolean value) {
        this.reCollectIsAdvanceClear = value;
    }

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
     * {@link ReceivableDetail }
     * 
     * 
     */
    public List<ReceivableDetail> getReceivableDetails() {
        if (receivableDetails == null) {
            receivableDetails = new ArrayList<ReceivableDetail>();
        }
        return this.receivableDetails;
    }

    /**
     * Gets the value of the receivableFeeDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the receivableFeeDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReceivableFeeDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ReceivableFeeDetail }
     * 
     * 
     */
    public List<ReceivableFeeDetail> getReceivableFeeDetails() {
        if (receivableFeeDetails == null) {
            receivableFeeDetails = new ArrayList<ReceivableFeeDetail>();
        }
        return this.receivableFeeDetails;
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

    /**
     * Gets the value of the repaymentDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the repaymentDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRepaymentDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RepaymentDetail }
     * 
     * 
     */
    public List<RepaymentDetail> getRepaymentDetails() {
        if (repaymentDetails == null) {
            repaymentDetails = new ArrayList<RepaymentDetail>();
        }
        return this.repaymentDetails;
    }

    /**
     * Gets the value of the returnAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getReturnAmount() {
        return returnAmount;
    }

    /**
     * Sets the value of the returnAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setReturnAmount(BigDecimal value) {
        this.returnAmount = value;
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
     * Gets the value of the waiveRequestDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the waiveRequestDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWaiveRequestDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WaiveRequestDetail }
     * 
     * 
     */
    public List<WaiveRequestDetail> getWaiveRequestDetails() {
        if (waiveRequestDetails == null) {
            waiveRequestDetails = new ArrayList<WaiveRequestDetail>();
        }
        return this.waiveRequestDetails;
    }

    /**
     * Gets the value of the waives property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the waives property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWaives().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Waive }
     * 
     * 
     */
    public List<Waive> getWaives() {
        if (waives == null) {
            waives = new ArrayList<Waive>();
        }
        return this.waives;
    }

}
