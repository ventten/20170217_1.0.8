
package com.ljwd.plms.web.wsdl.webservice.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for vehicleCheckInfoDto complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="vehicleCheckInfoDto">
 *   &lt;complexContent>
 *     &lt;extension base="{http://webservice.loan.mfbms.flinkmf.com/}baseVersionableCreatorAwareEntityDto">
 *       &lt;sequence>
 *       &lt;/sequence>
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="applyId" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="status" type="{http://webservice.loan.mfbms.flinkmf.com/}vehicleCheckStatus" />
 *       &lt;attribute name="preStatus" type="{http://webservice.loan.mfbms.flinkmf.com/}vehicleCheckStatus" />
 *       &lt;attribute name="reason" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="isReturn" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="handledBy" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="handleTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "vehicleCheckInfoDto")
public class VehicleCheckInfoDto
    extends BaseVersionableCreatorAwareEntityDto
{

    @XmlAttribute(name = "id")
    protected Long id;
    @XmlAttribute(name = "applyId")
    protected Long applyId;
    @XmlAttribute(name = "status")
    protected VehicleCheckStatus status;
    @XmlAttribute(name = "preStatus")
    protected VehicleCheckStatus preStatus;
    @XmlAttribute(name = "reason")
    protected String reason;
    @XmlAttribute(name = "isReturn")
    protected Boolean isReturn;
    @XmlAttribute(name = "handledBy")
    protected String handledBy;
    @XmlAttribute(name = "handleTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar handleTime;

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
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link VehicleCheckStatus }
     *     
     */
    public VehicleCheckStatus getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleCheckStatus }
     *     
     */
    public void setStatus(VehicleCheckStatus value) {
        this.status = value;
    }

    /**
     * Gets the value of the preStatus property.
     * 
     * @return
     *     possible object is
     *     {@link VehicleCheckStatus }
     *     
     */
    public VehicleCheckStatus getPreStatus() {
        return preStatus;
    }

    /**
     * Sets the value of the preStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleCheckStatus }
     *     
     */
    public void setPreStatus(VehicleCheckStatus value) {
        this.preStatus = value;
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

    /**
     * Gets the value of the isReturn property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsReturn() {
        return isReturn;
    }

    /**
     * Sets the value of the isReturn property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsReturn(Boolean value) {
        this.isReturn = value;
    }

    /**
     * Gets the value of the handledBy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHandledBy() {
        return handledBy;
    }

    /**
     * Sets the value of the handledBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHandledBy(String value) {
        this.handledBy = value;
    }

    /**
     * Gets the value of the handleTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getHandleTime() {
        return handleTime;
    }

    /**
     * Sets the value of the handleTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setHandleTime(XMLGregorianCalendar value) {
        this.handleTime = value;
    }

}
