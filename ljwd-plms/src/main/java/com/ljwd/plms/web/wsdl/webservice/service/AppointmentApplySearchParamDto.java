
package com.ljwd.plms.web.wsdl.webservice.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for appointmentApplySearchParamDto complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="appointmentApplySearchParamDto">
 *   &lt;complexContent>
 *     &lt;extension base="{http://webservice.loan.mfbms.flinkmf.com/}baseDataControlDto">
 *       &lt;sequence>
 *       &lt;/sequence>
 *       &lt;attribute name="custname" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="idcardno" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="salessite" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="appsionsite" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="status" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="acpuirDateFrom" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="acpuirDateTo" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="appsionsiteDateFrom" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="appsionsiteDateTo" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="isall" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="headname" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="headtemp" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="inputby" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "appointmentApplySearchParamDto")
public class AppointmentApplySearchParamDto
    extends BaseDataControlDto
{

    @XmlAttribute(name = "custname")
    protected String custname;
    @XmlAttribute(name = "idcardno")
    protected String idcardno;
    @XmlAttribute(name = "salessite")
    protected String salessite;
    @XmlAttribute(name = "appsionsite")
    protected String appsionsite;
    @XmlAttribute(name = "status")
    protected String status;
    @XmlAttribute(name = "acpuirDateFrom")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar acpuirDateFrom;
    @XmlAttribute(name = "acpuirDateTo")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar acpuirDateTo;
    @XmlAttribute(name = "appsionsiteDateFrom")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar appsionsiteDateFrom;
    @XmlAttribute(name = "appsionsiteDateTo")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar appsionsiteDateTo;
    @XmlAttribute(name = "isall")
    protected String isall;
    @XmlAttribute(name = "headname")
    protected String headname;
    @XmlAttribute(name = "headtemp")
    protected Long headtemp;
    @XmlAttribute(name = "inputby")
    protected String inputby;

    /**
     * Gets the value of the custname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustname() {
        return custname;
    }

    /**
     * Sets the value of the custname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustname(String value) {
        this.custname = value;
    }

    /**
     * Gets the value of the idcardno property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdcardno() {
        return idcardno;
    }

    /**
     * Sets the value of the idcardno property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdcardno(String value) {
        this.idcardno = value;
    }

    /**
     * Gets the value of the salessite property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSalessite() {
        return salessite;
    }

    /**
     * Sets the value of the salessite property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSalessite(String value) {
        this.salessite = value;
    }

    /**
     * Gets the value of the appsionsite property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAppsionsite() {
        return appsionsite;
    }

    /**
     * Sets the value of the appsionsite property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAppsionsite(String value) {
        this.appsionsite = value;
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
     * Gets the value of the acpuirDateFrom property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getAcpuirDateFrom() {
        return acpuirDateFrom;
    }

    /**
     * Sets the value of the acpuirDateFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setAcpuirDateFrom(XMLGregorianCalendar value) {
        this.acpuirDateFrom = value;
    }

    /**
     * Gets the value of the acpuirDateTo property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getAcpuirDateTo() {
        return acpuirDateTo;
    }

    /**
     * Sets the value of the acpuirDateTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setAcpuirDateTo(XMLGregorianCalendar value) {
        this.acpuirDateTo = value;
    }

    /**
     * Gets the value of the appsionsiteDateFrom property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getAppsionsiteDateFrom() {
        return appsionsiteDateFrom;
    }

    /**
     * Sets the value of the appsionsiteDateFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setAppsionsiteDateFrom(XMLGregorianCalendar value) {
        this.appsionsiteDateFrom = value;
    }

    /**
     * Gets the value of the appsionsiteDateTo property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getAppsionsiteDateTo() {
        return appsionsiteDateTo;
    }

    /**
     * Sets the value of the appsionsiteDateTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setAppsionsiteDateTo(XMLGregorianCalendar value) {
        this.appsionsiteDateTo = value;
    }

    /**
     * Gets the value of the isall property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsall() {
        return isall;
    }

    /**
     * Sets the value of the isall property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsall(String value) {
        this.isall = value;
    }

    /**
     * Gets the value of the headname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHeadname() {
        return headname;
    }

    /**
     * Sets the value of the headname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHeadname(String value) {
        this.headname = value;
    }

    /**
     * Gets the value of the headtemp property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getHeadtemp() {
        return headtemp;
    }

    /**
     * Sets the value of the headtemp property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setHeadtemp(Long value) {
        this.headtemp = value;
    }

    /**
     * Gets the value of the inputby property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInputby() {
        return inputby;
    }

    /**
     * Sets the value of the inputby property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInputby(String value) {
        this.inputby = value;
    }

}
