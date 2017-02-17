
package com.ljwd.plms.web.wsdl.webservice.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for auditInvestigateAssignParamDto complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="auditInvestigateAssignParamDto">
 *   &lt;complexContent>
 *     &lt;extension base="{http://webservice.loan.mfbms.flinkmf.com/}baseDataControlDto">
 *       &lt;sequence>
 *       &lt;/sequence>
 *       &lt;attribute name="applyCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="idCardNo" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="customerName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="customerManager" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="siteCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="productId" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="auditor1" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="loanstatus" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="loanuserid" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="signnote" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="signstatus" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="signsite" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="signDateFrom" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="signDateTo" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "auditInvestigateAssignParamDto")
public class AuditInvestigateAssignParamDto
    extends BaseDataControlDto
{

    @XmlAttribute(name = "applyCode")
    protected String applyCode;
    @XmlAttribute(name = "idCardNo")
    protected String idCardNo;
    @XmlAttribute(name = "customerName")
    protected String customerName;
    @XmlAttribute(name = "customerManager")
    protected String customerManager;
    @XmlAttribute(name = "siteCode")
    protected String siteCode;
    @XmlAttribute(name = "productId")
    protected Long productId;
    @XmlAttribute(name = "auditor1")
    protected String auditor1;
    @XmlAttribute(name = "loanstatus")
    protected String loanstatus;
    @XmlAttribute(name = "loanuserid")
    protected String loanuserid;
    @XmlAttribute(name = "signnote")
    protected String signnote;
    @XmlAttribute(name = "signstatus")
    protected String signstatus;
    @XmlAttribute(name = "signsite")
    protected String signsite;
    @XmlAttribute(name = "signDateFrom")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar signDateFrom;
    @XmlAttribute(name = "signDateTo")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar signDateTo;

    /**
     * Gets the value of the applyCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApplyCode() {
        return applyCode;
    }

    /**
     * Sets the value of the applyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApplyCode(String value) {
        this.applyCode = value;
    }

    /**
     * Gets the value of the idCardNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdCardNo() {
        return idCardNo;
    }

    /**
     * Sets the value of the idCardNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdCardNo(String value) {
        this.idCardNo = value;
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
     * Gets the value of the customerManager property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerManager() {
        return customerManager;
    }

    /**
     * Sets the value of the customerManager property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerManager(String value) {
        this.customerManager = value;
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
     * Gets the value of the productId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getProductId() {
        return productId;
    }

    /**
     * Sets the value of the productId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setProductId(Long value) {
        this.productId = value;
    }

    /**
     * Gets the value of the auditor1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuditor1() {
        return auditor1;
    }

    /**
     * Sets the value of the auditor1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuditor1(String value) {
        this.auditor1 = value;
    }

    /**
     * Gets the value of the loanstatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLoanstatus() {
        return loanstatus;
    }

    /**
     * Sets the value of the loanstatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLoanstatus(String value) {
        this.loanstatus = value;
    }

    /**
     * Gets the value of the loanuserid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLoanuserid() {
        return loanuserid;
    }

    /**
     * Sets the value of the loanuserid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLoanuserid(String value) {
        this.loanuserid = value;
    }

    /**
     * Gets the value of the signnote property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSignnote() {
        return signnote;
    }

    /**
     * Sets the value of the signnote property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSignnote(String value) {
        this.signnote = value;
    }

    /**
     * Gets the value of the signstatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSignstatus() {
        return signstatus;
    }

    /**
     * Sets the value of the signstatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSignstatus(String value) {
        this.signstatus = value;
    }

    /**
     * Gets the value of the signsite property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSignsite() {
        return signsite;
    }

    /**
     * Sets the value of the signsite property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSignsite(String value) {
        this.signsite = value;
    }

    /**
     * Gets the value of the signDateFrom property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSignDateFrom() {
        return signDateFrom;
    }

    /**
     * Sets the value of the signDateFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSignDateFrom(XMLGregorianCalendar value) {
        this.signDateFrom = value;
    }

    /**
     * Gets the value of the signDateTo property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSignDateTo() {
        return signDateTo;
    }

    /**
     * Sets the value of the signDateTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSignDateTo(XMLGregorianCalendar value) {
        this.signDateTo = value;
    }

}
