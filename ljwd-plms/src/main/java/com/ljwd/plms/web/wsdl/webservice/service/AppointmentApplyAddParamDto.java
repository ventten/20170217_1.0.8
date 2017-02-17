
package com.ljwd.plms.web.wsdl.webservice.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for appointmentApplyAddParamDto complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="appointmentApplyAddParamDto">
 *   &lt;complexContent>
 *     &lt;extension base="{http://webservice.loan.mfbms.flinkmf.com/}baseDataControlDto">
 *       &lt;sequence>
 *       &lt;/sequence>
 *       &lt;attribute name="bookingid" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="bookingflowid" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="applCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="crmDodrid" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="status" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="remark" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="acpuirSite" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="bostatus" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "appointmentApplyAddParamDto")
public class AppointmentApplyAddParamDto
    extends BaseDataControlDto
{

    @XmlAttribute(name = "bookingid")
    protected Long bookingid;
    @XmlAttribute(name = "bookingflowid")
    protected Long bookingflowid;
    @XmlAttribute(name = "applCode")
    protected String applCode;
    @XmlAttribute(name = "crmDodrid")
    protected Long crmDodrid;
    @XmlAttribute(name = "status")
    protected String status;
    @XmlAttribute(name = "remark")
    protected String remark;
    @XmlAttribute(name = "acpuirSite")
    protected String acpuirSite;
    @XmlAttribute(name = "bostatus")
    protected String bostatus;

    /**
     * Gets the value of the bookingid property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getBookingid() {
        return bookingid;
    }

    /**
     * Sets the value of the bookingid property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setBookingid(Long value) {
        this.bookingid = value;
    }

    /**
     * Gets the value of the bookingflowid property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getBookingflowid() {
        return bookingflowid;
    }

    /**
     * Sets the value of the bookingflowid property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setBookingflowid(Long value) {
        this.bookingflowid = value;
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
     * Gets the value of the crmDodrid property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCrmDodrid() {
        return crmDodrid;
    }

    /**
     * Sets the value of the crmDodrid property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCrmDodrid(Long value) {
        this.crmDodrid = value;
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
     * Gets the value of the acpuirSite property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcpuirSite() {
        return acpuirSite;
    }

    /**
     * Sets the value of the acpuirSite property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcpuirSite(String value) {
        this.acpuirSite = value;
    }

    /**
     * Gets the value of the bostatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBostatus() {
        return bostatus;
    }

    /**
     * Sets the value of the bostatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBostatus(String value) {
        this.bostatus = value;
    }

}
