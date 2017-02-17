
package com.ljwd.plms.web.wsdl.webservice.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for pendingSurveyDto complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="pendingSurveyDto">
 *   &lt;complexContent>
 *     &lt;extension base="{http://webservice.loan.mfbms.flinkmf.com/}baseVersionableCreatorAwareEntityDto">
 *       &lt;sequence>
 *       &lt;/sequence>
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="applicationInfoId" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="requestBy" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="requestTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="isExported" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="exportedBy" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="exportTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="remark" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="foreardTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="foreardBy" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="returnTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="returnBy" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="inspectState" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="inspectScore" type="{http://www.w3.org/2001/XMLSchema}short" />
 *       &lt;attribute name="isRecall" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="appointTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="inspectCancel" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="inspectCancelTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "pendingSurveyDto")
public class PendingSurveyDto
    extends BaseVersionableCreatorAwareEntityDto
{

    @XmlAttribute(name = "id")
    protected Long id;
    @XmlAttribute(name = "applicationInfoId")
    protected Long applicationInfoId;
    @XmlAttribute(name = "requestBy")
    protected String requestBy;
    @XmlAttribute(name = "requestTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar requestTime;
    @XmlAttribute(name = "isExported")
    protected Boolean isExported;
    @XmlAttribute(name = "exportedBy")
    protected String exportedBy;
    @XmlAttribute(name = "exportTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar exportTime;
    @XmlAttribute(name = "remark")
    protected String remark;
    @XmlAttribute(name = "foreardTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar foreardTime;
    @XmlAttribute(name = "foreardBy")
    protected String foreardBy;
    @XmlAttribute(name = "returnTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar returnTime;
    @XmlAttribute(name = "returnBy")
    protected String returnBy;
    @XmlAttribute(name = "inspectState")
    protected String inspectState;
    @XmlAttribute(name = "inspectScore")
    protected Short inspectScore;
    @XmlAttribute(name = "isRecall")
    protected Boolean isRecall;
    @XmlAttribute(name = "appointTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar appointTime;
    @XmlAttribute(name = "inspectCancel")
    protected Boolean inspectCancel;
    @XmlAttribute(name = "inspectCancelTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inspectCancelTime;

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
     * Gets the value of the applicationInfoId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getApplicationInfoId() {
        return applicationInfoId;
    }

    /**
     * Sets the value of the applicationInfoId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setApplicationInfoId(Long value) {
        this.applicationInfoId = value;
    }

    /**
     * Gets the value of the requestBy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequestBy() {
        return requestBy;
    }

    /**
     * Sets the value of the requestBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequestBy(String value) {
        this.requestBy = value;
    }

    /**
     * Gets the value of the requestTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRequestTime() {
        return requestTime;
    }

    /**
     * Sets the value of the requestTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRequestTime(XMLGregorianCalendar value) {
        this.requestTime = value;
    }

    /**
     * Gets the value of the isExported property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsExported() {
        return isExported;
    }

    /**
     * Sets the value of the isExported property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsExported(Boolean value) {
        this.isExported = value;
    }

    /**
     * Gets the value of the exportedBy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExportedBy() {
        return exportedBy;
    }

    /**
     * Sets the value of the exportedBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExportedBy(String value) {
        this.exportedBy = value;
    }

    /**
     * Gets the value of the exportTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getExportTime() {
        return exportTime;
    }

    /**
     * Sets the value of the exportTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setExportTime(XMLGregorianCalendar value) {
        this.exportTime = value;
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
     * Gets the value of the foreardTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getForeardTime() {
        return foreardTime;
    }

    /**
     * Sets the value of the foreardTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setForeardTime(XMLGregorianCalendar value) {
        this.foreardTime = value;
    }

    /**
     * Gets the value of the foreardBy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getForeardBy() {
        return foreardBy;
    }

    /**
     * Sets the value of the foreardBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setForeardBy(String value) {
        this.foreardBy = value;
    }

    /**
     * Gets the value of the returnTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getReturnTime() {
        return returnTime;
    }

    /**
     * Sets the value of the returnTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setReturnTime(XMLGregorianCalendar value) {
        this.returnTime = value;
    }

    /**
     * Gets the value of the returnBy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReturnBy() {
        return returnBy;
    }

    /**
     * Sets the value of the returnBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReturnBy(String value) {
        this.returnBy = value;
    }

    /**
     * Gets the value of the inspectState property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInspectState() {
        return inspectState;
    }

    /**
     * Sets the value of the inspectState property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInspectState(String value) {
        this.inspectState = value;
    }

    /**
     * Gets the value of the inspectScore property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getInspectScore() {
        return inspectScore;
    }

    /**
     * Sets the value of the inspectScore property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setInspectScore(Short value) {
        this.inspectScore = value;
    }

    /**
     * Gets the value of the isRecall property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsRecall() {
        return isRecall;
    }

    /**
     * Sets the value of the isRecall property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsRecall(Boolean value) {
        this.isRecall = value;
    }

    /**
     * Gets the value of the appointTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getAppointTime() {
        return appointTime;
    }

    /**
     * Sets the value of the appointTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setAppointTime(XMLGregorianCalendar value) {
        this.appointTime = value;
    }

    /**
     * Gets the value of the inspectCancel property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isInspectCancel() {
        return inspectCancel;
    }

    /**
     * Sets the value of the inspectCancel property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setInspectCancel(Boolean value) {
        this.inspectCancel = value;
    }

    /**
     * Gets the value of the inspectCancelTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInspectCancelTime() {
        return inspectCancelTime;
    }

    /**
     * Sets the value of the inspectCancelTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInspectCancelTime(XMLGregorianCalendar value) {
        this.inspectCancelTime = value;
    }

}
