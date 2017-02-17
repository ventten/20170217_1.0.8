
package com.ljwd.plms.web.wsdl.webservice.service;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for simulateDepositParamDto complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="simulateDepositParamDto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *       &lt;/sequence>
 *       &lt;attribute name="repaymentDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="depositDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="contractId" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="contractNo" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="repaymentAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       &lt;attribute name="isInAdvanceRepayment" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="bankAccountId" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="bankJournalId" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="paymentMethod" type="{http://webservice.loan.mfbms.flinkmf.com/}paymentMethod" />
 *       &lt;attribute name="postType" type="{http://webservice.loan.mfbms.flinkmf.com/}postType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "simulateDepositParamDto")
public class SimulateDepositParamDto {

    @XmlAttribute(name = "repaymentDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar repaymentDate;
    @XmlAttribute(name = "depositDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar depositDate;
    @XmlAttribute(name = "contractId")
    protected Long contractId;
    @XmlAttribute(name = "contractNo")
    protected String contractNo;
    @XmlAttribute(name = "repaymentAmount")
    protected BigDecimal repaymentAmount;
    @XmlAttribute(name = "isInAdvanceRepayment")
    protected Boolean isInAdvanceRepayment;
    @XmlAttribute(name = "bankAccountId")
    protected Long bankAccountId;
    @XmlAttribute(name = "bankJournalId")
    protected Long bankJournalId;
    @XmlAttribute(name = "paymentMethod")
    protected PaymentMethod paymentMethod;
    @XmlAttribute(name = "postType")
    protected PostType postType;

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
     * Gets the value of the depositDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDepositDate() {
        return depositDate;
    }

    /**
     * Sets the value of the depositDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDepositDate(XMLGregorianCalendar value) {
        this.depositDate = value;
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
     * Gets the value of the contractNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContractNo() {
        return contractNo;
    }

    /**
     * Sets the value of the contractNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContractNo(String value) {
        this.contractNo = value;
    }

    /**
     * Gets the value of the repaymentAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRepaymentAmount() {
        return repaymentAmount;
    }

    /**
     * Sets the value of the repaymentAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRepaymentAmount(BigDecimal value) {
        this.repaymentAmount = value;
    }

    /**
     * Gets the value of the isInAdvanceRepayment property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsInAdvanceRepayment() {
        return isInAdvanceRepayment;
    }

    /**
     * Sets the value of the isInAdvanceRepayment property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsInAdvanceRepayment(Boolean value) {
        this.isInAdvanceRepayment = value;
    }

    /**
     * Gets the value of the bankAccountId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getBankAccountId() {
        return bankAccountId;
    }

    /**
     * Sets the value of the bankAccountId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setBankAccountId(Long value) {
        this.bankAccountId = value;
    }

    /**
     * Gets the value of the bankJournalId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getBankJournalId() {
        return bankJournalId;
    }

    /**
     * Sets the value of the bankJournalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setBankJournalId(Long value) {
        this.bankJournalId = value;
    }

    /**
     * Gets the value of the paymentMethod property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentMethod }
     *     
     */
    public PaymentMethod getPaymentMethod() {
        return paymentMethod;
    }

    /**
     * Sets the value of the paymentMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentMethod }
     *     
     */
    public void setPaymentMethod(PaymentMethod value) {
        this.paymentMethod = value;
    }

    /**
     * Gets the value of the postType property.
     * 
     * @return
     *     possible object is
     *     {@link PostType }
     *     
     */
    public PostType getPostType() {
        return postType;
    }

    /**
     * Sets the value of the postType property.
     * 
     * @param value
     *     allowed object is
     *     {@link PostType }
     *     
     */
    public void setPostType(PostType value) {
        this.postType = value;
    }

}
