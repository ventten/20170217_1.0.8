
package com.ljwd.plms.web.wsdl.webservice.service;

import java.math.BigDecimal;
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
 * <p>Java class for waiveRequestDto complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="waiveRequestDto">
 *   &lt;complexContent>
 *     &lt;extension base="{http://webservice.loan.mfbms.flinkmf.com/}baseVersionableCreatorAwareEntityDto">
 *       &lt;sequence>
 *         &lt;element name="waiveRequestDetails" type="{http://webservice.loan.mfbms.flinkmf.com/}waiveRequestDetailDto" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="paymentId" use="required" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="contractId" use="required" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="applicationId" use="required" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="waivedTotalAmount" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       &lt;attribute name="applicationUser" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="applicationTime" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="status" use="required" type="{http://webservice.loan.mfbms.flinkmf.com/}approvalStatus" />
 *       &lt;attribute name="approvedBy" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="approveTime" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="remark" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="waiveReason" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "waiveRequestDto", propOrder = {
    "waiveRequestDetails"
})
public class WaiveRequestDto
    extends BaseVersionableCreatorAwareEntityDto
{

    @XmlElement(nillable = true)
    protected List<WaiveRequestDetailDto> waiveRequestDetails;
    @XmlAttribute(name = "id")
    protected Long id;
    @XmlAttribute(name = "paymentId", required = true)
    protected long paymentId;
    @XmlAttribute(name = "contractId", required = true)
    protected long contractId;
    @XmlAttribute(name = "applicationId", required = true)
    protected long applicationId;
    @XmlAttribute(name = "waivedTotalAmount", required = true)
    protected BigDecimal waivedTotalAmount;
    @XmlAttribute(name = "applicationUser", required = true)
    protected String applicationUser;
    @XmlAttribute(name = "applicationTime", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar applicationTime;
    @XmlAttribute(name = "status", required = true)
    protected ApprovalStatus status;
    @XmlAttribute(name = "approvedBy", required = true)
    protected String approvedBy;
    @XmlAttribute(name = "approveTime", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar approveTime;
    @XmlAttribute(name = "remark")
    protected String remark;
    @XmlAttribute(name = "waiveReason")
    protected String waiveReason;

    /**
     * Gets the value of the waiveRequestDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the waiveRequestDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWaiveRequestDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WaiveRequestDetailDto }
     * 
     * 
     */
    public List<WaiveRequestDetailDto> getWaiveRequestDetails() {
        if (waiveRequestDetails == null) {
            waiveRequestDetails = new ArrayList<WaiveRequestDetailDto>();
        }
        return this.waiveRequestDetails;
    }

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
     * Gets the value of the contractId property.
     * 
     */
    public long getContractId() {
        return contractId;
    }

    /**
     * Sets the value of the contractId property.
     * 
     */
    public void setContractId(long value) {
        this.contractId = value;
    }

    /**
     * Gets the value of the applicationId property.
     * 
     */
    public long getApplicationId() {
        return applicationId;
    }

    /**
     * Sets the value of the applicationId property.
     * 
     */
    public void setApplicationId(long value) {
        this.applicationId = value;
    }

    /**
     * Gets the value of the waivedTotalAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getWaivedTotalAmount() {
        return waivedTotalAmount;
    }

    /**
     * Sets the value of the waivedTotalAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setWaivedTotalAmount(BigDecimal value) {
        this.waivedTotalAmount = value;
    }

    /**
     * Gets the value of the applicationUser property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApplicationUser() {
        return applicationUser;
    }

    /**
     * Sets the value of the applicationUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApplicationUser(String value) {
        this.applicationUser = value;
    }

    /**
     * Gets the value of the applicationTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getApplicationTime() {
        return applicationTime;
    }

    /**
     * Sets the value of the applicationTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setApplicationTime(XMLGregorianCalendar value) {
        this.applicationTime = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link ApprovalStatus }
     *     
     */
    public ApprovalStatus getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApprovalStatus }
     *     
     */
    public void setStatus(ApprovalStatus value) {
        this.status = value;
    }

    /**
     * Gets the value of the approvedBy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApprovedBy() {
        return approvedBy;
    }

    /**
     * Sets the value of the approvedBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApprovedBy(String value) {
        this.approvedBy = value;
    }

    /**
     * Gets the value of the approveTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getApproveTime() {
        return approveTime;
    }

    /**
     * Sets the value of the approveTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setApproveTime(XMLGregorianCalendar value) {
        this.approveTime = value;
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

}
