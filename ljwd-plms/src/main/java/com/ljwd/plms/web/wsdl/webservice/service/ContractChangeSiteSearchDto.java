
package com.ljwd.plms.web.wsdl.webservice.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for contractChangeSiteSearchDto complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="contractChangeSiteSearchDto">
 *   &lt;complexContent>
 *     &lt;extension base="{http://webservice.loan.mfbms.flinkmf.com/}baseVersionableCreatorAwareEntityDto">
 *       &lt;sequence>
 *       &lt;/sequence>
 *       &lt;attribute name="contractId" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="contractNo" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="contractLoanAmt" type="{http://www.w3.org/2001/XMLSchema}double" />
 *       &lt;attribute name="contractLoanPeriod" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="contractStatus" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="contractSignUser" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="cntrctSignTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="contractSignSiteCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="contractSignSiteName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="applicationCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="applicationSiteName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="customerName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="customerIdcardNo" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="approvalTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="contractRecordVersion" type="{http://www.w3.org/2001/XMLSchema}int" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "contractChangeSiteSearchDto")
public class ContractChangeSiteSearchDto
    extends BaseVersionableCreatorAwareEntityDto
{

    @XmlAttribute(name = "contractId")
    protected Long contractId;
    @XmlAttribute(name = "contractNo")
    protected String contractNo;
    @XmlAttribute(name = "contractLoanAmt")
    protected Double contractLoanAmt;
    @XmlAttribute(name = "contractLoanPeriod")
    protected Integer contractLoanPeriod;
    @XmlAttribute(name = "contractStatus")
    protected String contractStatus;
    @XmlAttribute(name = "contractSignUser")
    protected String contractSignUser;
    @XmlAttribute(name = "cntrctSignTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar cntrctSignTime;
    @XmlAttribute(name = "contractSignSiteCode")
    protected String contractSignSiteCode;
    @XmlAttribute(name = "contractSignSiteName")
    protected String contractSignSiteName;
    @XmlAttribute(name = "applicationCode")
    protected String applicationCode;
    @XmlAttribute(name = "applicationSiteName")
    protected String applicationSiteName;
    @XmlAttribute(name = "customerName")
    protected String customerName;
    @XmlAttribute(name = "customerIdcardNo")
    protected String customerIdcardNo;
    @XmlAttribute(name = "approvalTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar approvalTime;
    @XmlAttribute(name = "contractRecordVersion")
    protected Integer contractRecordVersion;

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
     * Gets the value of the contractLoanAmt property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getContractLoanAmt() {
        return contractLoanAmt;
    }

    /**
     * Sets the value of the contractLoanAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setContractLoanAmt(Double value) {
        this.contractLoanAmt = value;
    }

    /**
     * Gets the value of the contractLoanPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getContractLoanPeriod() {
        return contractLoanPeriod;
    }

    /**
     * Sets the value of the contractLoanPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setContractLoanPeriod(Integer value) {
        this.contractLoanPeriod = value;
    }

    /**
     * Gets the value of the contractStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContractStatus() {
        return contractStatus;
    }

    /**
     * Sets the value of the contractStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContractStatus(String value) {
        this.contractStatus = value;
    }

    /**
     * Gets the value of the contractSignUser property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContractSignUser() {
        return contractSignUser;
    }

    /**
     * Sets the value of the contractSignUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContractSignUser(String value) {
        this.contractSignUser = value;
    }

    /**
     * Gets the value of the cntrctSignTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCntrctSignTime() {
        return cntrctSignTime;
    }

    /**
     * Sets the value of the cntrctSignTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCntrctSignTime(XMLGregorianCalendar value) {
        this.cntrctSignTime = value;
    }

    /**
     * Gets the value of the contractSignSiteCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContractSignSiteCode() {
        return contractSignSiteCode;
    }

    /**
     * Sets the value of the contractSignSiteCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContractSignSiteCode(String value) {
        this.contractSignSiteCode = value;
    }

    /**
     * Gets the value of the contractSignSiteName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContractSignSiteName() {
        return contractSignSiteName;
    }

    /**
     * Sets the value of the contractSignSiteName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContractSignSiteName(String value) {
        this.contractSignSiteName = value;
    }

    /**
     * Gets the value of the applicationCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApplicationCode() {
        return applicationCode;
    }

    /**
     * Sets the value of the applicationCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApplicationCode(String value) {
        this.applicationCode = value;
    }

    /**
     * Gets the value of the applicationSiteName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApplicationSiteName() {
        return applicationSiteName;
    }

    /**
     * Sets the value of the applicationSiteName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApplicationSiteName(String value) {
        this.applicationSiteName = value;
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
     * Gets the value of the customerIdcardNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerIdcardNo() {
        return customerIdcardNo;
    }

    /**
     * Sets the value of the customerIdcardNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerIdcardNo(String value) {
        this.customerIdcardNo = value;
    }

    /**
     * Gets the value of the approvalTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getApprovalTime() {
        return approvalTime;
    }

    /**
     * Sets the value of the approvalTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setApprovalTime(XMLGregorianCalendar value) {
        this.approvalTime = value;
    }

    /**
     * Gets the value of the contractRecordVersion property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getContractRecordVersion() {
        return contractRecordVersion;
    }

    /**
     * Sets the value of the contractRecordVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setContractRecordVersion(Integer value) {
        this.contractRecordVersion = value;
    }

}
