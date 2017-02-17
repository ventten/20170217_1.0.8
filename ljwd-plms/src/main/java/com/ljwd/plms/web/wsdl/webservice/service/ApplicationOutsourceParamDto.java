
package com.ljwd.plms.web.wsdl.webservice.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for applicationOutsourceParamDto complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="applicationOutsourceParamDto">
 *   &lt;complexContent>
 *     &lt;extension base="{http://webservice.loan.mfbms.flinkmf.com/}baseEnquiryParamDto">
 *       &lt;sequence>
 *       &lt;/sequence>
 *       &lt;attribute name="startDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="endDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="outSrcType" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="contractNo" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="customeName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="idCard" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="approveDateFrom" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="approveDateTo" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="status" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="endDateFrom" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="endDateTo" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="outsrcCompanyId" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="applStatus" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="siteCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="checkNoOutsourced" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "applicationOutsourceParamDto")
public class ApplicationOutsourceParamDto
    extends BaseEnquiryParamDto
{

    @XmlAttribute(name = "startDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar startDate;
    @XmlAttribute(name = "endDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar endDate;
    @XmlAttribute(name = "outSrcType")
    protected String outSrcType;
    @XmlAttribute(name = "contractNo")
    protected String contractNo;
    @XmlAttribute(name = "customeName")
    protected String customeName;
    @XmlAttribute(name = "idCard")
    protected String idCard;
    @XmlAttribute(name = "approveDateFrom")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar approveDateFrom;
    @XmlAttribute(name = "approveDateTo")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar approveDateTo;
    @XmlAttribute(name = "status")
    protected String status;
    @XmlAttribute(name = "endDateFrom")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar endDateFrom;
    @XmlAttribute(name = "endDateTo")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar endDateTo;
    @XmlAttribute(name = "outsrcCompanyId")
    protected Long outsrcCompanyId;
    @XmlAttribute(name = "applStatus")
    protected String applStatus;
    @XmlAttribute(name = "siteCode")
    protected String siteCode;
    @XmlAttribute(name = "checkNoOutsourced", required = true)
    protected boolean checkNoOutsourced;

    /**
     * Gets the value of the startDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStartDate() {
        return startDate;
    }

    /**
     * Sets the value of the startDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStartDate(XMLGregorianCalendar value) {
        this.startDate = value;
    }

    /**
     * Gets the value of the endDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEndDate() {
        return endDate;
    }

    /**
     * Sets the value of the endDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEndDate(XMLGregorianCalendar value) {
        this.endDate = value;
    }

    /**
     * Gets the value of the outSrcType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSrcType() {
        return outSrcType;
    }

    /**
     * Sets the value of the outSrcType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSrcType(String value) {
        this.outSrcType = value;
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
     * Gets the value of the customeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomeName() {
        return customeName;
    }

    /**
     * Sets the value of the customeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomeName(String value) {
        this.customeName = value;
    }

    /**
     * Gets the value of the idCard property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdCard() {
        return idCard;
    }

    /**
     * Sets the value of the idCard property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdCard(String value) {
        this.idCard = value;
    }

    /**
     * Gets the value of the approveDateFrom property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getApproveDateFrom() {
        return approveDateFrom;
    }

    /**
     * Sets the value of the approveDateFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setApproveDateFrom(XMLGregorianCalendar value) {
        this.approveDateFrom = value;
    }

    /**
     * Gets the value of the approveDateTo property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getApproveDateTo() {
        return approveDateTo;
    }

    /**
     * Sets the value of the approveDateTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setApproveDateTo(XMLGregorianCalendar value) {
        this.approveDateTo = value;
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
     * Gets the value of the endDateFrom property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEndDateFrom() {
        return endDateFrom;
    }

    /**
     * Sets the value of the endDateFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEndDateFrom(XMLGregorianCalendar value) {
        this.endDateFrom = value;
    }

    /**
     * Gets the value of the endDateTo property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEndDateTo() {
        return endDateTo;
    }

    /**
     * Sets the value of the endDateTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEndDateTo(XMLGregorianCalendar value) {
        this.endDateTo = value;
    }

    /**
     * Gets the value of the outsrcCompanyId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getOutsrcCompanyId() {
        return outsrcCompanyId;
    }

    /**
     * Sets the value of the outsrcCompanyId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setOutsrcCompanyId(Long value) {
        this.outsrcCompanyId = value;
    }

    /**
     * Gets the value of the applStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApplStatus() {
        return applStatus;
    }

    /**
     * Sets the value of the applStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApplStatus(String value) {
        this.applStatus = value;
    }

    /**
     * Gets the value of the siteCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSiteCode() {
        return siteCode;
    }

    /**
     * Sets the value of the siteCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSiteCode(String value) {
        this.siteCode = value;
    }

    /**
     * Gets the value of the checkNoOutsourced property.
     * 
     */
    public boolean isCheckNoOutsourced() {
        return checkNoOutsourced;
    }

    /**
     * Sets the value of the checkNoOutsourced property.
     * 
     */
    public void setCheckNoOutsourced(boolean value) {
        this.checkNoOutsourced = value;
    }

}
