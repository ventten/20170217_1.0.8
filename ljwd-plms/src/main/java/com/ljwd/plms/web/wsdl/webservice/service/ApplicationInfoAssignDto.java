
package com.ljwd.plms.web.wsdl.webservice.service;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for applicationInfoAssignDto complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="applicationInfoAssignDto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *       &lt;/sequence>
 *       &lt;attribute name="applyId" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="applyCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="customerId" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="customerName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="idCardNo" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="applyDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="applicationAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       &lt;attribute name="salesUser" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="inputUserName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="inputBy" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="checkStatus" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="handleSiteCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "applicationInfoAssignDto")
public class ApplicationInfoAssignDto {

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
    @XmlAttribute(name = "applyDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar applyDate;
    @XmlAttribute(name = "applicationAmount")
    protected BigDecimal applicationAmount;
    @XmlAttribute(name = "salesUser")
    protected String salesUser;
    @XmlAttribute(name = "inputUserName")
    protected String inputUserName;
    @XmlAttribute(name = "inputBy")
    protected String inputBy;
    @XmlAttribute(name = "checkStatus")
    protected Boolean checkStatus;
    @XmlAttribute(name = "handleSiteCode")
    protected String handleSiteCode;

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
     * Gets the value of the applyDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getApplyDate() {
        return applyDate;
    }

    /**
     * Sets the value of the applyDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setApplyDate(XMLGregorianCalendar value) {
        this.applyDate = value;
    }

    /**
     * Gets the value of the applicationAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getApplicationAmount() {
        return applicationAmount;
    }

    /**
     * Sets the value of the applicationAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setApplicationAmount(BigDecimal value) {
        this.applicationAmount = value;
    }

    /**
     * Gets the value of the salesUser property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSalesUser() {
        return salesUser;
    }

    /**
     * Sets the value of the salesUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSalesUser(String value) {
        this.salesUser = value;
    }

    /**
     * Gets the value of the inputUserName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInputUserName() {
        return inputUserName;
    }

    /**
     * Sets the value of the inputUserName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInputUserName(String value) {
        this.inputUserName = value;
    }

    /**
     * Gets the value of the inputBy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInputBy() {
        return inputBy;
    }

    /**
     * Sets the value of the inputBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInputBy(String value) {
        this.inputBy = value;
    }

    /**
     * Gets the value of the checkStatus property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCheckStatus() {
        return checkStatus;
    }

    /**
     * Sets the value of the checkStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCheckStatus(Boolean value) {
        this.checkStatus = value;
    }

    /**
     * Gets the value of the handleSiteCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHandleSiteCode() {
        return handleSiteCode;
    }

    /**
     * Sets the value of the handleSiteCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHandleSiteCode(String value) {
        this.handleSiteCode = value;
    }

}
