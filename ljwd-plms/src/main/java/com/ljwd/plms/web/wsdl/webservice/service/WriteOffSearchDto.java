
package com.ljwd.plms.web.wsdl.webservice.service;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for writeOffSearchDto complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="writeOffSearchDto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *       &lt;/sequence>
 *       &lt;attribute name="contractNo" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="productId" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="productName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="applyId" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="applyCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="customerId" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="customerName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="idCardNo" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="approverAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       &lt;attribute name="approverPeriod" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="siteCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="totalActualAmt" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       &lt;attribute name="paymentAmt" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       &lt;attribute name="maxDueDateNum" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="loanStatus" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="paymentId" use="required" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="isWriteOff" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="writeOffDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="loanAmt" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       &lt;attribute name="writeOffAmt" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       &lt;attribute name="returnAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       &lt;attribute name="writeOffPeriod" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="reminderPrincial" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       &lt;attribute name="repaidPrincipal" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "writeOffSearchDto")
public class WriteOffSearchDto {

    @XmlAttribute(name = "contractNo")
    protected String contractNo;
    @XmlAttribute(name = "productId")
    protected Long productId;
    @XmlAttribute(name = "productName")
    protected String productName;
    @XmlAttribute(name = "applyId")
    protected Long applyId;
    @XmlAttribute(name = "applyCode")
    protected String applyCode;
    @XmlAttribute(name = "customerId")
    protected Long customerId;
    @XmlAttribute(name = "customerName")
    protected String customerName;
    @XmlAttribute(name = "idCardNo")
    protected String idCardNo;
    @XmlAttribute(name = "approverAmount")
    protected BigDecimal approverAmount;
    @XmlAttribute(name = "approverPeriod", required = true)
    protected int approverPeriod;
    @XmlAttribute(name = "siteCode")
    protected String siteCode;
    @XmlAttribute(name = "totalActualAmt", required = true)
    protected BigDecimal totalActualAmt;
    @XmlAttribute(name = "paymentAmt", required = true)
    protected BigDecimal paymentAmt;
    @XmlAttribute(name = "maxDueDateNum", required = true)
    protected int maxDueDateNum;
    @XmlAttribute(name = "loanStatus", required = true)
    protected String loanStatus;
    @XmlAttribute(name = "paymentId", required = true)
    protected long paymentId;
    @XmlAttribute(name = "isWriteOff", required = true)
    protected boolean isWriteOff;
    @XmlAttribute(name = "writeOffDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar writeOffDate;
    @XmlAttribute(name = "loanAmt")
    protected BigDecimal loanAmt;
    @XmlAttribute(name = "writeOffAmt")
    protected BigDecimal writeOffAmt;
    @XmlAttribute(name = "returnAmount")
    protected BigDecimal returnAmount;
    @XmlAttribute(name = "writeOffPeriod")
    protected Integer writeOffPeriod;
    @XmlAttribute(name = "reminderPrincial")
    protected BigDecimal reminderPrincial;
    @XmlAttribute(name = "repaidPrincipal")
    protected BigDecimal repaidPrincipal;

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
     * Gets the value of the productId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getProductId() {
        return productId;
    }

    /**
     * Sets the value of the productId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setProductId(Long value) {
        this.productId = value;
    }

    /**
     * Gets the value of the productName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductName() {
        return productName;
    }

    /**
     * Sets the value of the productName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductName(String value) {
        this.productName = value;
    }

    /**
     * Gets the value of the applyId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getApplyId() {
        return applyId;
    }

    /**
     * Sets the value of the applyId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setApplyId(Long value) {
        this.applyId = value;
    }

    /**
     * Gets the value of the applyCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApplyCode() {
        return applyCode;
    }

    /**
     * Sets the value of the applyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApplyCode(String value) {
        this.applyCode = value;
    }

    /**
     * Gets the value of the customerId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCustomerId() {
        return customerId;
    }

    /**
     * Sets the value of the customerId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCustomerId(Long value) {
        this.customerId = value;
    }

    /**
     * Gets the value of the customerName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerName() {
        return customerName;
    }

    /**
     * Sets the value of the customerName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerName(String value) {
        this.customerName = value;
    }

    /**
     * Gets the value of the idCardNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdCardNo() {
        return idCardNo;
    }

    /**
     * Sets the value of the idCardNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdCardNo(String value) {
        this.idCardNo = value;
    }

    /**
     * Gets the value of the approverAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getApproverAmount() {
        return approverAmount;
    }

    /**
     * Sets the value of the approverAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setApproverAmount(BigDecimal value) {
        this.approverAmount = value;
    }

    /**
     * Gets the value of the approverPeriod property.
     * 
     */
    public int getApproverPeriod() {
        return approverPeriod;
    }

    /**
     * Sets the value of the approverPeriod property.
     * 
     */
    public void setApproverPeriod(int value) {
        this.approverPeriod = value;
    }

    /**
     * Gets the value of the siteCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSiteCode() {
        return siteCode;
    }

    /**
     * Sets the value of the siteCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSiteCode(String value) {
        this.siteCode = value;
    }

    /**
     * Gets the value of the totalActualAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalActualAmt() {
        return totalActualAmt;
    }

    /**
     * Sets the value of the totalActualAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotalActualAmt(BigDecimal value) {
        this.totalActualAmt = value;
    }

    /**
     * Gets the value of the paymentAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPaymentAmt() {
        return paymentAmt;
    }

    /**
     * Sets the value of the paymentAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPaymentAmt(BigDecimal value) {
        this.paymentAmt = value;
    }

    /**
     * Gets the value of the maxDueDateNum property.
     * 
     */
    public int getMaxDueDateNum() {
        return maxDueDateNum;
    }

    /**
     * Sets the value of the maxDueDateNum property.
     * 
     */
    public void setMaxDueDateNum(int value) {
        this.maxDueDateNum = value;
    }

    /**
     * Gets the value of the loanStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLoanStatus() {
        return loanStatus;
    }

    /**
     * Sets the value of the loanStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLoanStatus(String value) {
        this.loanStatus = value;
    }

    /**
     * Gets the value of the paymentId property.
     * 
     */
    public long getPaymentId() {
        return paymentId;
    }

    /**
     * Sets the value of the paymentId property.
     * 
     */
    public void setPaymentId(long value) {
        this.paymentId = value;
    }

    /**
     * Gets the value of the isWriteOff property.
     * 
     */
    public boolean isIsWriteOff() {
        return isWriteOff;
    }

    /**
     * Sets the value of the isWriteOff property.
     * 
     */
    public void setIsWriteOff(boolean value) {
        this.isWriteOff = value;
    }

    /**
     * Gets the value of the writeOffDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getWriteOffDate() {
        return writeOffDate;
    }

    /**
     * Sets the value of the writeOffDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setWriteOffDate(XMLGregorianCalendar value) {
        this.writeOffDate = value;
    }

    /**
     * Gets the value of the loanAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getLoanAmt() {
        return loanAmt;
    }

    /**
     * Sets the value of the loanAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setLoanAmt(BigDecimal value) {
        this.loanAmt = value;
    }

    /**
     * Gets the value of the writeOffAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getWriteOffAmt() {
        return writeOffAmt;
    }

    /**
     * Sets the value of the writeOffAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setWriteOffAmt(BigDecimal value) {
        this.writeOffAmt = value;
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
     * Gets the value of the writeOffPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getWriteOffPeriod() {
        return writeOffPeriod;
    }

    /**
     * Sets the value of the writeOffPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setWriteOffPeriod(Integer value) {
        this.writeOffPeriod = value;
    }

    /**
     * Gets the value of the reminderPrincial property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getReminderPrincial() {
        return reminderPrincial;
    }

    /**
     * Sets the value of the reminderPrincial property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setReminderPrincial(BigDecimal value) {
        this.reminderPrincial = value;
    }

    /**
     * Gets the value of the repaidPrincipal property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRepaidPrincipal() {
        return repaidPrincipal;
    }

    /**
     * Sets the value of the repaidPrincipal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRepaidPrincipal(BigDecimal value) {
        this.repaidPrincipal = value;
    }

}
