
package com.ljwd.plms.web.wsdl.webservice.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for feeWaiveApprovalSearchParamDto complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="feeWaiveApprovalSearchParamDto">
 *   &lt;complexContent>
 *     &lt;extension base="{http://webservice.loan.mfbms.flinkmf.com/}baseEnquiryParamDto">
 *       &lt;sequence>
 *       &lt;/sequence>
 *       &lt;attribute name="loanName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="idNo" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="applCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="contractNo" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="processStatus" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="status" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="applyDateFrom" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="applyDateTo" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="waiveRequestId" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="userApprovalMaxLevel" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="approvalLevel" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="remark" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="waiveRequestRecordVersion" type="{http://www.w3.org/2001/XMLSchema}long" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "feeWaiveApprovalSearchParamDto")
public class FeeWaiveApprovalSearchParamDto
    extends BaseEnquiryParamDto
{

    @XmlAttribute(name = "loanName")
    protected String loanName;
    @XmlAttribute(name = "idNo")
    protected String idNo;
    @XmlAttribute(name = "applCode")
    protected String applCode;
    @XmlAttribute(name = "contractNo")
    protected String contractNo;
    @XmlAttribute(name = "processStatus")
    protected String processStatus;
    @XmlAttribute(name = "status")
    protected String status;
    @XmlAttribute(name = "applyDateFrom")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar applyDateFrom;
    @XmlAttribute(name = "applyDateTo")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar applyDateTo;
    @XmlAttribute(name = "waiveRequestId")
    protected Long waiveRequestId;
    @XmlAttribute(name = "userApprovalMaxLevel")
    protected Integer userApprovalMaxLevel;
    @XmlAttribute(name = "approvalLevel")
    protected Integer approvalLevel;
    @XmlAttribute(name = "remark")
    protected String remark;
    @XmlAttribute(name = "waiveRequestRecordVersion")
    protected Long waiveRequestRecordVersion;

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
     * Gets the value of the idNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdNo() {
        return idNo;
    }

    /**
     * Sets the value of the idNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdNo(String value) {
        this.idNo = value;
    }

    /**
     * Gets the value of the applCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApplCode() {
        return applCode;
    }

    /**
     * Sets the value of the applCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApplCode(String value) {
        this.applCode = value;
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
     * Gets the value of the processStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProcessStatus() {
        return processStatus;
    }

    /**
     * Sets the value of the processStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProcessStatus(String value) {
        this.processStatus = value;
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
     * Gets the value of the applyDateFrom property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getApplyDateFrom() {
        return applyDateFrom;
    }

    /**
     * Sets the value of the applyDateFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setApplyDateFrom(XMLGregorianCalendar value) {
        this.applyDateFrom = value;
    }

    /**
     * Gets the value of the applyDateTo property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getApplyDateTo() {
        return applyDateTo;
    }

    /**
     * Sets the value of the applyDateTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setApplyDateTo(XMLGregorianCalendar value) {
        this.applyDateTo = value;
    }

    /**
     * Gets the value of the waiveRequestId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getWaiveRequestId() {
        return waiveRequestId;
    }

    /**
     * Sets the value of the waiveRequestId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setWaiveRequestId(Long value) {
        this.waiveRequestId = value;
    }

    /**
     * Gets the value of the userApprovalMaxLevel property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getUserApprovalMaxLevel() {
        return userApprovalMaxLevel;
    }

    /**
     * Sets the value of the userApprovalMaxLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setUserApprovalMaxLevel(Integer value) {
        this.userApprovalMaxLevel = value;
    }

    /**
     * Gets the value of the approvalLevel property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getApprovalLevel() {
        return approvalLevel;
    }

    /**
     * Sets the value of the approvalLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setApprovalLevel(Integer value) {
        this.approvalLevel = value;
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
     * Gets the value of the waiveRequestRecordVersion property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getWaiveRequestRecordVersion() {
        return waiveRequestRecordVersion;
    }

    /**
     * Sets the value of the waiveRequestRecordVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setWaiveRequestRecordVersion(Long value) {
        this.waiveRequestRecordVersion = value;
    }

}
