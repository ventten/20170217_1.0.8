
package com.ljwd.plms.web.wsdl.webservice.service;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for feeWaiveApprovalSearchDto complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="feeWaiveApprovalSearchDto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="waiveFeeList" type="{http://webservice.loan.mfbms.flinkmf.com/}feeWaiveDetailDto" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="waiveRequestId" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="loanName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="contractNo" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="applDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="loanAmt" type="{http://www.w3.org/2001/XMLSchema}double" />
 *       &lt;attribute name="waiveTotalAmt" type="{http://www.w3.org/2001/XMLSchema}double" />
 *       &lt;attribute name="status" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="approvalLevel" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="idNo" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="applCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="applUser" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="applUserName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="approver" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="approverName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="approvalTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="remark" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="waiveReason" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="waiveRequestRecordVersion" type="{http://www.w3.org/2001/XMLSchema}long" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "feeWaiveApprovalSearchDto", propOrder = {
    "waiveFeeList"
})
public class FeeWaiveApprovalSearchDto {

    @XmlElement(nillable = true)
    protected List<FeeWaiveDetailDto> waiveFeeList;
    @XmlAttribute(name = "waiveRequestId")
    protected Long waiveRequestId;
    @XmlAttribute(name = "loanName")
    protected String loanName;
    @XmlAttribute(name = "contractNo")
    protected String contractNo;
    @XmlAttribute(name = "applDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar applDate;
    @XmlAttribute(name = "loanAmt")
    protected Double loanAmt;
    @XmlAttribute(name = "waiveTotalAmt")
    protected Double waiveTotalAmt;
    @XmlAttribute(name = "status")
    protected String status;
    @XmlAttribute(name = "approvalLevel")
    protected Integer approvalLevel;
    @XmlAttribute(name = "idNo")
    protected String idNo;
    @XmlAttribute(name = "applCode")
    protected String applCode;
    @XmlAttribute(name = "applUser")
    protected String applUser;
    @XmlAttribute(name = "applUserName")
    protected String applUserName;
    @XmlAttribute(name = "approver")
    protected String approver;
    @XmlAttribute(name = "approverName")
    protected String approverName;
    @XmlAttribute(name = "approvalTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar approvalTime;
    @XmlAttribute(name = "remark")
    protected String remark;
    @XmlAttribute(name = "waiveReason")
    protected String waiveReason;
    @XmlAttribute(name = "waiveRequestRecordVersion")
    protected Long waiveRequestRecordVersion;

    /**
     * Gets the value of the waiveFeeList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the waiveFeeList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWaiveFeeList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FeeWaiveDetailDto }
     * 
     * 
     */
    public List<FeeWaiveDetailDto> getWaiveFeeList() {
        if (waiveFeeList == null) {
            waiveFeeList = new ArrayList<FeeWaiveDetailDto>();
        }
        return this.waiveFeeList;
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
     * Gets the value of the applDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getApplDate() {
        return applDate;
    }

    /**
     * Sets the value of the applDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setApplDate(XMLGregorianCalendar value) {
        this.applDate = value;
    }

    /**
     * Gets the value of the loanAmt property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getLoanAmt() {
        return loanAmt;
    }

    /**
     * Sets the value of the loanAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setLoanAmt(Double value) {
        this.loanAmt = value;
    }

    /**
     * Gets the value of the waiveTotalAmt property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getWaiveTotalAmt() {
        return waiveTotalAmt;
    }

    /**
     * Sets the value of the waiveTotalAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setWaiveTotalAmt(Double value) {
        this.waiveTotalAmt = value;
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
     * Gets the value of the applUser property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApplUser() {
        return applUser;
    }

    /**
     * Sets the value of the applUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApplUser(String value) {
        this.applUser = value;
    }

    /**
     * Gets the value of the applUserName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApplUserName() {
        return applUserName;
    }

    /**
     * Sets the value of the applUserName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApplUserName(String value) {
        this.applUserName = value;
    }

    /**
     * Gets the value of the approver property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApprover() {
        return approver;
    }

    /**
     * Sets the value of the approver property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApprover(String value) {
        this.approver = value;
    }

    /**
     * Gets the value of the approverName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApproverName() {
        return approverName;
    }

    /**
     * Sets the value of the approverName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApproverName(String value) {
        this.approverName = value;
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
     * Gets the value of the waiveReason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWaiveReason() {
        return waiveReason;
    }

    /**
     * Sets the value of the waiveReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWaiveReason(String value) {
        this.waiveReason = value;
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
