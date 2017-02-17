
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
 * <p>Java class for advanceReceivedDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="advanceReceivedDetail">
 *   &lt;complexContent>
 *     &lt;extension base="{http://webservice.loan.mfbms.flinkmf.com/}baseVersionableCreatorAwareEntity">
 *       &lt;sequence>
 *         &lt;element name="action" type="{http://webservice.loan.mfbms.flinkmf.com/}advanceReceivedAction" minOccurs="0"/>
 *         &lt;element name="amount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="applicationAccount" type="{http://webservice.loan.mfbms.flinkmf.com/}applicationAccount" minOccurs="0"/>
 *         &lt;element name="applicationAccountId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="collectCost" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="handleTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="handledBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="remark" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="repayment" type="{http://webservice.loan.mfbms.flinkmf.com/}repayment" minOccurs="0"/>
 *         &lt;element name="repaymentDetails" type="{http://webservice.loan.mfbms.flinkmf.com/}repaymentDetail" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="repaymentId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="status" type="{http://webservice.loan.mfbms.flinkmf.com/}recordStatus" minOccurs="0"/>
 *         &lt;element name="txDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "advanceReceivedDetail", propOrder = {
    "action",
    "amount",
    "applicationAccount",
    "applicationAccountId",
    "collectCost",
    "handleTime",
    "handledBy",
    "remark",
    "repayment",
    "repaymentDetails",
    "repaymentId",
    "status",
    "txDate"
})
public class AdvanceReceivedDetail
    extends BaseVersionableCreatorAwareEntity
{

    protected AdvanceReceivedAction action;
    protected BigDecimal amount;
    protected ApplicationAccount applicationAccount;
    protected Long applicationAccountId;
    protected BigDecimal collectCost;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar handleTime;
    protected String handledBy;
    protected String remark;
    protected Repayment repayment;
    @XmlElement(nillable = true)
    protected List<RepaymentDetail> repaymentDetails;
    protected Long repaymentId;
    protected RecordStatus status;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar txDate;

    /**
     * Gets the value of the action property.
     * 
     * @return
     *     possible object is
     *     {@link AdvanceReceivedAction }
     *     
     */
    public AdvanceReceivedAction getAction() {
        return action;
    }

    /**
     * Sets the value of the action property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdvanceReceivedAction }
     *     
     */
    public void setAction(AdvanceReceivedAction value) {
        this.action = value;
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
     * Gets the value of the applicationAccount property.
     * 
     * @return
     *     possible object is
     *     {@link ApplicationAccount }
     *     
     */
    public ApplicationAccount getApplicationAccount() {
        return applicationAccount;
    }

    /**
     * Sets the value of the applicationAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApplicationAccount }
     *     
     */
    public void setApplicationAccount(ApplicationAccount value) {
        this.applicationAccount = value;
    }

    /**
     * Gets the value of the applicationAccountId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getApplicationAccountId() {
        return applicationAccountId;
    }

    /**
     * Sets the value of the applicationAccountId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setApplicationAccountId(Long value) {
        this.applicationAccountId = value;
    }

    /**
     * Gets the value of the collectCost property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCollectCost() {
        return collectCost;
    }

    /**
     * Sets the value of the collectCost property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCollectCost(BigDecimal value) {
        this.collectCost = value;
    }

    /**
     * Gets the value of the handleTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getHandleTime() {
        return handleTime;
    }

    /**
     * Sets the value of the handleTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setHandleTime(XMLGregorianCalendar value) {
        this.handleTime = value;
    }

    /**
     * Gets the value of the handledBy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHandledBy() {
        return handledBy;
    }

    /**
     * Sets the value of the handledBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHandledBy(String value) {
        this.handledBy = value;
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
     * Gets the value of the repayment property.
     * 
     * @return
     *     possible object is
     *     {@link Repayment }
     *     
     */
    public Repayment getRepayment() {
        return repayment;
    }

    /**
     * Sets the value of the repayment property.
     * 
     * @param value
     *     allowed object is
     *     {@link Repayment }
     *     
     */
    public void setRepayment(Repayment value) {
        this.repayment = value;
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
     * Gets the value of the repaymentId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getRepaymentId() {
        return repaymentId;
    }

    /**
     * Sets the value of the repaymentId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setRepaymentId(Long value) {
        this.repaymentId = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link RecordStatus }
     *     
     */
    public RecordStatus getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecordStatus }
     *     
     */
    public void setStatus(RecordStatus value) {
        this.status = value;
    }

    /**
     * Gets the value of the txDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTxDate() {
        return txDate;
    }

    /**
     * Sets the value of the txDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTxDate(XMLGregorianCalendar value) {
        this.txDate = value;
    }

}
