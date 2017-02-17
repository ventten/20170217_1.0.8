
package com.ljwd.plms.web.wsdl.webservice.service;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for refundRequestParamDto complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="refundRequestParamDto">
 *   &lt;complexContent>
 *     &lt;extension base="{http://webservice.loan.mfbms.flinkmf.com/}baseEnquiryParamDto">
 *       &lt;sequence>
 *       &lt;/sequence>
 *       &lt;attribute name="contractNo" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="customerName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="idCardNo" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="applyBy" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="applyOrg" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="feeTypeList">
 *         &lt;simpleType>
 *           &lt;list itemType="{http://www.w3.org/2001/XMLSchema}string" />
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="feeType" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="payDateFrom" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="payDateTo" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="siteCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="applytimeFrom" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="applytimeTo" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="status" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="loginUserId" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="loginSiteCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="dataRange" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "refundRequestParamDto")
public class RefundRequestParamDto
    extends BaseEnquiryParamDto
{

    @XmlAttribute(name = "contractNo")
    protected String contractNo;
    @XmlAttribute(name = "customerName")
    protected String customerName;
    @XmlAttribute(name = "idCardNo")
    protected String idCardNo;
    @XmlAttribute(name = "applyBy")
    protected String applyBy;
    @XmlAttribute(name = "applyOrg")
    protected String applyOrg;
    @XmlAttribute(name = "feeTypeList")
    protected List<String> feeTypeList;
    @XmlAttribute(name = "feeType")
    protected String feeType;
    @XmlAttribute(name = "payDateFrom")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar payDateFrom;
    @XmlAttribute(name = "payDateTo")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar payDateTo;
    @XmlAttribute(name = "siteCode")
    protected String siteCode;
    @XmlAttribute(name = "applytimeFrom")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar applytimeFrom;
    @XmlAttribute(name = "applytimeTo")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar applytimeTo;
    @XmlAttribute(name = "status")
    protected String status;
    @XmlAttribute(name = "loginUserId")
    protected String loginUserId;
    @XmlAttribute(name = "loginSiteCode")
    protected String loginSiteCode;
    @XmlAttribute(name = "dataRange")
    protected String dataRange;

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
     * Gets the value of the applyBy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApplyBy() {
        return applyBy;
    }

    /**
     * Sets the value of the applyBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApplyBy(String value) {
        this.applyBy = value;
    }

    /**
     * Gets the value of the applyOrg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApplyOrg() {
        return applyOrg;
    }

    /**
     * Sets the value of the applyOrg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApplyOrg(String value) {
        this.applyOrg = value;
    }

    /**
     * Gets the value of the feeTypeList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the feeTypeList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFeeTypeList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getFeeTypeList() {
        if (feeTypeList == null) {
            feeTypeList = new ArrayList<String>();
        }
        return this.feeTypeList;
    }

    /**
     * Gets the value of the feeType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFeeType() {
        return feeType;
    }

    /**
     * Sets the value of the feeType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFeeType(String value) {
        this.feeType = value;
    }

    /**
     * Gets the value of the payDateFrom property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPayDateFrom() {
        return payDateFrom;
    }

    /**
     * Sets the value of the payDateFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPayDateFrom(XMLGregorianCalendar value) {
        this.payDateFrom = value;
    }

    /**
     * Gets the value of the payDateTo property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPayDateTo() {
        return payDateTo;
    }

    /**
     * Sets the value of the payDateTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPayDateTo(XMLGregorianCalendar value) {
        this.payDateTo = value;
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
     * Gets the value of the applytimeFrom property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getApplytimeFrom() {
        return applytimeFrom;
    }

    /**
     * Sets the value of the applytimeFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setApplytimeFrom(XMLGregorianCalendar value) {
        this.applytimeFrom = value;
    }

    /**
     * Gets the value of the applytimeTo property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getApplytimeTo() {
        return applytimeTo;
    }

    /**
     * Sets the value of the applytimeTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setApplytimeTo(XMLGregorianCalendar value) {
        this.applytimeTo = value;
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
     * Gets the value of the loginUserId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLoginUserId() {
        return loginUserId;
    }

    /**
     * Sets the value of the loginUserId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLoginUserId(String value) {
        this.loginUserId = value;
    }

    /**
     * Gets the value of the loginSiteCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLoginSiteCode() {
        return loginSiteCode;
    }

    /**
     * Sets the value of the loginSiteCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLoginSiteCode(String value) {
        this.loginSiteCode = value;
    }

    /**
     * Gets the value of the dataRange property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataRange() {
        return dataRange;
    }

    /**
     * Sets the value of the dataRange property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataRange(String value) {
        this.dataRange = value;
    }

}
