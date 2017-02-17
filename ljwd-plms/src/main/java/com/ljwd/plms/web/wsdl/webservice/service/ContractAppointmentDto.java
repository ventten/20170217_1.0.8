
package com.ljwd.plms.web.wsdl.webservice.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for contractAppointmentDto complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="contractAppointmentDto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="appoint" type="{http://webservice.loan.mfbms.flinkmf.com/}appointDto" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="contractId" use="required" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="applicationInfoId" use="required" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="appointNote" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="appointedBy" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="recordVersion" use="required" type="{http://www.w3.org/2001/XMLSchema}long" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "contractAppointmentDto", propOrder = {
    "appoint"
})
public class ContractAppointmentDto {

    protected AppointDto appoint;
    @XmlAttribute(name = "contractId", required = true)
    protected long contractId;
    @XmlAttribute(name = "applicationInfoId", required = true)
    protected long applicationInfoId;
    @XmlAttribute(name = "appointNote")
    protected String appointNote;
    @XmlAttribute(name = "appointedBy")
    protected String appointedBy;
    @XmlAttribute(name = "recordVersion", required = true)
    protected long recordVersion;

    /**
     * Gets the value of the appoint property.
     * 
     * @return
     *     possible object is
     *     {@link AppointDto }
     *     
     */
    public AppointDto getAppoint() {
        return appoint;
    }

    /**
     * Sets the value of the appoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link AppointDto }
     *     
     */
    public void setAppoint(AppointDto value) {
        this.appoint = value;
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
     * Gets the value of the applicationInfoId property.
     * 
     */
    public long getApplicationInfoId() {
        return applicationInfoId;
    }

    /**
     * Sets the value of the applicationInfoId property.
     * 
     */
    public void setApplicationInfoId(long value) {
        this.applicationInfoId = value;
    }

    /**
     * Gets the value of the appointNote property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAppointNote() {
        return appointNote;
    }

    /**
     * Sets the value of the appointNote property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAppointNote(String value) {
        this.appointNote = value;
    }

    /**
     * Gets the value of the appointedBy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAppointedBy() {
        return appointedBy;
    }

    /**
     * Sets the value of the appointedBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAppointedBy(String value) {
        this.appointedBy = value;
    }

    /**
     * Gets the value of the recordVersion property.
     * 
     */
    public long getRecordVersion() {
        return recordVersion;
    }

    /**
     * Sets the value of the recordVersion property.
     * 
     */
    public void setRecordVersion(long value) {
        this.recordVersion = value;
    }

}
