
package com.ljwd.plms.web.wsdl.webservice.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for searchDebtTransferParamDto complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="searchDebtTransferParamDto">
 *   &lt;complexContent>
 *     &lt;extension base="{http://webservice.loan.mfbms.flinkmf.com/}baseDataControlDto">
 *       &lt;sequence>
 *       &lt;/sequence>
 *       &lt;attribute name="loanName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="loanIdcarNo" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="contractNo" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="status" type="{http://webservice.loan.mfbms.flinkmf.com/}debtTransferStatus" />
 *       &lt;attribute name="siteCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="productId" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="paymentType" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="payDateFrom" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="payDateTo" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="transferDateFrom" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="transferDateTo" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="redeemDateFrom" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="redeemDateTo" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="handletype" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "searchDebtTransferParamDto")
public class SearchDebtTransferParamDto
    extends BaseDataControlDto
{

    @XmlAttribute(name = "loanName")
    protected String loanName;
    @XmlAttribute(name = "loanIdcarNo")
    protected String loanIdcarNo;
    @XmlAttribute(name = "contractNo")
    protected String contractNo;
    @XmlAttribute(name = "status")
    protected DebtTransferStatus status;
    @XmlAttribute(name = "siteCode")
    protected String siteCode;
    @XmlAttribute(name = "productId")
    protected Long productId;
    @XmlAttribute(name = "paymentType")
    protected String paymentType;
    @XmlAttribute(name = "payDateFrom")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar payDateFrom;
    @XmlAttribute(name = "payDateTo")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar payDateTo;
    @XmlAttribute(name = "transferDateFrom")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar transferDateFrom;
    @XmlAttribute(name = "transferDateTo")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar transferDateTo;
    @XmlAttribute(name = "redeemDateFrom")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar redeemDateFrom;
    @XmlAttribute(name = "redeemDateTo")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar redeemDateTo;
    @XmlAttribute(name = "handletype")
    protected String handletype;

    /**
     * Gets the value of the loanName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLoanName() {
        return loanName;
    }

    /**
     * Sets the value of the loanName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLoanName(String value) {
        this.loanName = value;
    }

    /**
     * Gets the value of the loanIdcarNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLoanIdcarNo() {
        return loanIdcarNo;
    }

    /**
     * Sets the value of the loanIdcarNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLoanIdcarNo(String value) {
        this.loanIdcarNo = value;
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
     * Gets the value of the paymentType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentType() {
        return paymentType;
    }

    /**
     * Sets the value of the paymentType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentType(String value) {
        this.paymentType = value;
    }

    /**
     * Gets the value of the payDateFrom property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPayDateFrom() {
        return payDateFrom;
    }

    /**
     * Sets the value of the payDateFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPayDateFrom(XMLGregorianCalendar value) {
        this.payDateFrom = value;
    }

    /**
     * Gets the value of the payDateTo property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPayDateTo() {
        return payDateTo;
    }

    /**
     * Sets the value of the payDateTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPayDateTo(XMLGregorianCalendar value) {
        this.payDateTo = value;
    }

    /**
     * Gets the value of the transferDateFrom property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTransferDateFrom() {
        return transferDateFrom;
    }

    /**
     * Sets the value of the transferDateFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTransferDateFrom(XMLGregorianCalendar value) {
        this.transferDateFrom = value;
    }

    /**
     * Gets the value of the transferDateTo property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTransferDateTo() {
        return transferDateTo;
    }

    /**
     * Sets the value of the transferDateTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTransferDateTo(XMLGregorianCalendar value) {
        this.transferDateTo = value;
    }

    /**
     * Gets the value of the redeemDateFrom property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRedeemDateFrom() {
        return redeemDateFrom;
    }

    /**
     * Sets the value of the redeemDateFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRedeemDateFrom(XMLGregorianCalendar value) {
        this.redeemDateFrom = value;
    }

    /**
     * Gets the value of the redeemDateTo property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRedeemDateTo() {
        return redeemDateTo;
    }

    /**
     * Sets the value of the redeemDateTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRedeemDateTo(XMLGregorianCalendar value) {
        this.redeemDateTo = value;
    }

    /**
     * Gets the value of the handletype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHandletype() {
        return handletype;
    }

    /**
     * Sets the value of the handletype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHandletype(String value) {
        this.handletype = value;
    }

}
