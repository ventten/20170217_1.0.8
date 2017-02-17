
package com.ljwd.plms.web.wsdl.webservice.service;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for repaymentDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="repaymentDetail">
 *   &lt;complexContent>
 *     &lt;extension base="{http://webservice.loan.mfbms.flinkmf.com/}baseVersionableCreatorAwareEntity">
 *       &lt;sequence>
 *         &lt;element name="actualAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="advanceReceivedDetail" type="{http://webservice.loan.mfbms.flinkmf.com/}advanceReceivedDetail" minOccurs="0"/>
 *         &lt;element name="advanceReceivedDetailId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="ledgerType" type="{http://webservice.loan.mfbms.flinkmf.com/}ledgerType" minOccurs="0"/>
 *         &lt;element name="ledgerTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="receivable" type="{http://webservice.loan.mfbms.flinkmf.com/}receivable" minOccurs="0"/>
 *         &lt;element name="receivableId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="repayment" type="{http://webservice.loan.mfbms.flinkmf.com/}repayment" minOccurs="0"/>
 *         &lt;element name="repaymentId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="reversedReason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "repaymentDetail", propOrder = {
    "actualAmount",
    "advanceReceivedDetail",
    "advanceReceivedDetailId",
    "ledgerType",
    "ledgerTypeCode",
    "receivable",
    "receivableId",
    "repayment",
    "repaymentId",
    "reversedReason",
    "status",
    "txDate"
})
public class RepaymentDetail
    extends BaseVersionableCreatorAwareEntity
{

    protected BigDecimal actualAmount;
    protected AdvanceReceivedDetail advanceReceivedDetail;
    protected Long advanceReceivedDetailId;
    protected LedgerType ledgerType;
    protected String ledgerTypeCode;
    protected Receivable receivable;
    protected Long receivableId;
    protected Repayment repayment;
    protected Long repaymentId;
    protected String reversedReason;
    protected RecordStatus status;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar txDate;

    /**
     * Gets the value of the actualAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getActualAmount() {
        return actualAmount;
    }

    /**
     * Sets the value of the actualAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setActualAmount(BigDecimal value) {
        this.actualAmount = value;
    }

    /**
     * Gets the value of the advanceReceivedDetail property.
     * 
     * @return
     *     possible object is
     *     {@link AdvanceReceivedDetail }
     *     
     */
    public AdvanceReceivedDetail getAdvanceReceivedDetail() {
        return advanceReceivedDetail;
    }

    /**
     * Sets the value of the advanceReceivedDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdvanceReceivedDetail }
     *     
     */
    public void setAdvanceReceivedDetail(AdvanceReceivedDetail value) {
        this.advanceReceivedDetail = value;
    }

    /**
     * Gets the value of the advanceReceivedDetailId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getAdvanceReceivedDetailId() {
        return advanceReceivedDetailId;
    }

    /**
     * Sets the value of the advanceReceivedDetailId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setAdvanceReceivedDetailId(Long value) {
        this.advanceReceivedDetailId = value;
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
     * Gets the value of the receivable property.
     * 
     * @return
     *     possible object is
     *     {@link Receivable }
     *     
     */
    public Receivable getReceivable() {
        return receivable;
    }

    /**
     * Sets the value of the receivable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Receivable }
     *     
     */
    public void setReceivable(Receivable value) {
        this.receivable = value;
    }

    /**
     * Gets the value of the receivableId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getReceivableId() {
        return receivableId;
    }

    /**
     * Sets the value of the receivableId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setReceivableId(Long value) {
        this.receivableId = value;
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
     * Gets the value of the reversedReason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReversedReason() {
        return reversedReason;
    }

    /**
     * Sets the value of the reversedReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReversedReason(String value) {
        this.reversedReason = value;
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
