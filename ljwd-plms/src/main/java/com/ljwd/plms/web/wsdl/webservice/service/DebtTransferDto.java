
package com.ljwd.plms.web.wsdl.webservice.service;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for debtTransferDto complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="debtTransferDto">
 *   &lt;complexContent>
 *     &lt;extension base="{http://webservice.loan.mfbms.flinkmf.com/}baseVersionableCreatorAwareEntityDto">
 *       &lt;sequence>
 *       &lt;/sequence>
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="paymentId" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="debtFileImportId" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="overdueDays" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="debtAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       &lt;attribute name="remainPrincipal" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       &lt;attribute name="transferAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       &lt;attribute name="transferRate" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       &lt;attribute name="status" type="{http://webservice.loan.mfbms.flinkmf.com/}debtTransferStatus" />
 *       &lt;attribute name="transferedBy" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="transferDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="revokedBy" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="revokeDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="reason" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "debtTransferDto")
public class DebtTransferDto
    extends BaseVersionableCreatorAwareEntityDto
{

    @XmlAttribute(name = "id")
    protected Long id;
    @XmlAttribute(name = "paymentId")
    protected Long paymentId;
    @XmlAttribute(name = "debtFileImportId")
    protected Long debtFileImportId;
    @XmlAttribute(name = "overdueDays")
    protected Integer overdueDays;
    @XmlAttribute(name = "debtAmount")
    protected BigDecimal debtAmount;
    @XmlAttribute(name = "remainPrincipal")
    protected BigDecimal remainPrincipal;
    @XmlAttribute(name = "transferAmount")
    protected BigDecimal transferAmount;
    @XmlAttribute(name = "transferRate")
    protected BigDecimal transferRate;
    @XmlAttribute(name = "status")
    protected DebtTransferStatus status;
    @XmlAttribute(name = "transferedBy")
    protected String transferedBy;
    @XmlAttribute(name = "transferDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar transferDate;
    @XmlAttribute(name = "revokedBy")
    protected String revokedBy;
    @XmlAttribute(name = "revokeDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar revokeDate;
    @XmlAttribute(name = "reason")
    protected String reason;

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
     * Gets the value of the debtFileImportId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getDebtFileImportId() {
        return debtFileImportId;
    }

    /**
     * Sets the value of the debtFileImportId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setDebtFileImportId(Long value) {
        this.debtFileImportId = value;
    }

    /**
     * Gets the value of the overdueDays property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getOverdueDays() {
        return overdueDays;
    }

    /**
     * Sets the value of the overdueDays property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setOverdueDays(Integer value) {
        this.overdueDays = value;
    }

    /**
     * Gets the value of the debtAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDebtAmount() {
        return debtAmount;
    }

    /**
     * Sets the value of the debtAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDebtAmount(BigDecimal value) {
        this.debtAmount = value;
    }

    /**
     * Gets the value of the remainPrincipal property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRemainPrincipal() {
        return remainPrincipal;
    }

    /**
     * Sets the value of the remainPrincipal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRemainPrincipal(BigDecimal value) {
        this.remainPrincipal = value;
    }

    /**
     * Gets the value of the transferAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTransferAmount() {
        return transferAmount;
    }

    /**
     * Sets the value of the transferAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTransferAmount(BigDecimal value) {
        this.transferAmount = value;
    }

    /**
     * Gets the value of the transferRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTransferRate() {
        return transferRate;
    }

    /**
     * Sets the value of the transferRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTransferRate(BigDecimal value) {
        this.transferRate = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link DebtTransferStatus }
     *     
     */
    public DebtTransferStatus getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link DebtTransferStatus }
     *     
     */
    public void setStatus(DebtTransferStatus value) {
        this.status = value;
    }

    /**
     * Gets the value of the transferedBy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransferedBy() {
        return transferedBy;
    }

    /**
     * Sets the value of the transferedBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransferedBy(String value) {
        this.transferedBy = value;
    }

    /**
     * Gets the value of the transferDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTransferDate() {
        return transferDate;
    }

    /**
     * Sets the value of the transferDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTransferDate(XMLGregorianCalendar value) {
        this.transferDate = value;
    }

    /**
     * Gets the value of the revokedBy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRevokedBy() {
        return revokedBy;
    }

    /**
     * Sets the value of the revokedBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRevokedBy(String value) {
        this.revokedBy = value;
    }

    /**
     * Gets the value of the revokeDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRevokeDate() {
        return revokeDate;
    }

    /**
     * Sets the value of the revokeDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRevokeDate(XMLGregorianCalendar value) {
        this.revokeDate = value;
    }

    /**
     * Gets the value of the reason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReason() {
        return reason;
    }

    /**
     * Sets the value of the reason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReason(String value) {
        this.reason = value;
    }

}
