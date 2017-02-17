
package com.ljwd.plms.web.wsdl.webservice.service;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for wholeAdvCollectDto complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="wholeAdvCollectDto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *       &lt;/sequence>
 *       &lt;attribute name="advCollectId" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="customerName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="idCardNo" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="contractNo" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="paymentTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="status" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="collectDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="offerSentTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="collectAmt" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       &lt;attribute name="bankName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="collectBankAcount" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="reFundAmt" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       &lt;attribute name="reFundDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="reFundBy" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="reFundName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="remark" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="action" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="isPrimary" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="updateDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="updateBy" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="updateName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="payDate" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="actualAmt" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       &lt;attribute name="collectAllAmt" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "wholeAdvCollectDto")
public class WholeAdvCollectDto {

    @XmlAttribute(name = "advCollectId")
    protected Long advCollectId;
    @XmlAttribute(name = "customerName")
    protected String customerName;
    @XmlAttribute(name = "idCardNo")
    protected String idCardNo;
    @XmlAttribute(name = "contractNo")
    protected String contractNo;
    @XmlAttribute(name = "paymentTypeCode")
    protected String paymentTypeCode;
    @XmlAttribute(name = "status")
    protected String status;
    @XmlAttribute(name = "collectDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar collectDate;
    @XmlAttribute(name = "offerSentTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar offerSentTime;
    @XmlAttribute(name = "collectAmt")
    protected BigDecimal collectAmt;
    @XmlAttribute(name = "bankName")
    protected String bankName;
    @XmlAttribute(name = "collectBankAcount")
    protected String collectBankAcount;
    @XmlAttribute(name = "reFundAmt")
    protected BigDecimal reFundAmt;
    @XmlAttribute(name = "reFundDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar reFundDate;
    @XmlAttribute(name = "reFundBy")
    protected String reFundBy;
    @XmlAttribute(name = "reFundName")
    protected String reFundName;
    @XmlAttribute(name = "remark")
    protected String remark;
    @XmlAttribute(name = "action")
    protected String action;
    @XmlAttribute(name = "isPrimary")
    protected String isPrimary;
    @XmlAttribute(name = "updateDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar updateDate;
    @XmlAttribute(name = "updateBy")
    protected String updateBy;
    @XmlAttribute(name = "updateName")
    protected String updateName;
    @XmlAttribute(name = "payDate")
    protected String payDate;
    @XmlAttribute(name = "actualAmt")
    protected BigDecimal actualAmt;
    @XmlAttribute(name = "collectAllAmt")
    protected BigDecimal collectAllAmt;

    /**
     * Gets the value of the advCollectId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getAdvCollectId() {
        return advCollectId;
    }

    /**
     * Sets the value of the advCollectId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setAdvCollectId(Long value) {
        this.advCollectId = value;
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
     * Gets the value of the paymentTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentTypeCode() {
        return paymentTypeCode;
    }

    /**
     * Sets the value of the paymentTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentTypeCode(String value) {
        this.paymentTypeCode = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

    /**
     * Gets the value of the collectDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCollectDate() {
        return collectDate;
    }

    /**
     * Sets the value of the collectDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCollectDate(XMLGregorianCalendar value) {
        this.collectDate = value;
    }

    /**
     * Gets the value of the offerSentTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOfferSentTime() {
        return offerSentTime;
    }

    /**
     * Sets the value of the offerSentTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOfferSentTime(XMLGregorianCalendar value) {
        this.offerSentTime = value;
    }

    /**
     * Gets the value of the collectAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCollectAmt() {
        return collectAmt;
    }

    /**
     * Sets the value of the collectAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCollectAmt(BigDecimal value) {
        this.collectAmt = value;
    }

    /**
     * Gets the value of the bankName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBankName() {
        return bankName;
    }

    /**
     * Sets the value of the bankName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBankName(String value) {
        this.bankName = value;
    }

    /**
     * Gets the value of the collectBankAcount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCollectBankAcount() {
        return collectBankAcount;
    }

    /**
     * Sets the value of the collectBankAcount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCollectBankAcount(String value) {
        this.collectBankAcount = value;
    }

    /**
     * Gets the value of the reFundAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getReFundAmt() {
        return reFundAmt;
    }

    /**
     * Sets the value of the reFundAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setReFundAmt(BigDecimal value) {
        this.reFundAmt = value;
    }

    /**
     * Gets the value of the reFundDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getReFundDate() {
        return reFundDate;
    }

    /**
     * Sets the value of the reFundDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setReFundDate(XMLGregorianCalendar value) {
        this.reFundDate = value;
    }

    /**
     * Gets the value of the reFundBy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReFundBy() {
        return reFundBy;
    }

    /**
     * Sets the value of the reFundBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReFundBy(String value) {
        this.reFundBy = value;
    }

    /**
     * Gets the value of the reFundName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReFundName() {
        return reFundName;
    }

    /**
     * Sets the value of the reFundName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReFundName(String value) {
        this.reFundName = value;
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
     * Gets the value of the action property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAction() {
        return action;
    }

    /**
     * Sets the value of the action property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAction(String value) {
        this.action = value;
    }

    /**
     * Gets the value of the isPrimary property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsPrimary() {
        return isPrimary;
    }

    /**
     * Sets the value of the isPrimary property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsPrimary(String value) {
        this.isPrimary = value;
    }

    /**
     * Gets the value of the updateDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getUpdateDate() {
        return updateDate;
    }

    /**
     * Sets the value of the updateDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setUpdateDate(XMLGregorianCalendar value) {
        this.updateDate = value;
    }

    /**
     * Gets the value of the updateBy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUpdateBy() {
        return updateBy;
    }

    /**
     * Sets the value of the updateBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUpdateBy(String value) {
        this.updateBy = value;
    }

    /**
     * Gets the value of the updateName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUpdateName() {
        return updateName;
    }

    /**
     * Sets the value of the updateName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUpdateName(String value) {
        this.updateName = value;
    }

    /**
     * Gets the value of the payDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPayDate() {
        return payDate;
    }

    /**
     * Sets the value of the payDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPayDate(String value) {
        this.payDate = value;
    }

    /**
     * Gets the value of the actualAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getActualAmt() {
        return actualAmt;
    }

    /**
     * Sets the value of the actualAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setActualAmt(BigDecimal value) {
        this.actualAmt = value;
    }

    /**
     * Gets the value of the collectAllAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCollectAllAmt() {
        return collectAllAmt;
    }

    /**
     * Sets the value of the collectAllAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCollectAllAmt(BigDecimal value) {
        this.collectAllAmt = value;
    }

}
