
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
 * <p>Java class for outVisitAssignParamDto complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="outVisitAssignParamDto">
 *   &lt;complexContent>
 *     &lt;extension base="{http://webservice.loan.mfbms.flinkmf.com/}baseDataControlDto">
 *       &lt;sequence>
 *       &lt;/sequence>
 *       &lt;attribute name="custName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="contractNo" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="idCardNo" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="collectBy" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="custType">
 *         &lt;simpleType>
 *           &lt;list itemType="{http://www.w3.org/2001/XMLSchema}string" />
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="siteName">
 *         &lt;simpleType>
 *           &lt;list itemType="{http://www.w3.org/2001/XMLSchema}string" />
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="assignStatus">
 *         &lt;simpleType>
 *           &lt;list itemType="{http://www.w3.org/2001/XMLSchema}string" />
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="submitDateFrom" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="submitDateTo" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="assignDateFrom" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="assignDateTo" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="overdueDaysFrom" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="overdueDaysTo" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="submitOrgName" type="{http://www.w3.org/2001/XMLSchema}long" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "outVisitAssignParamDto")
public class OutVisitAssignParamDto
    extends BaseDataControlDto
{

    @XmlAttribute(name = "custName")
    protected String custName;
    @XmlAttribute(name = "contractNo")
    protected String contractNo;
    @XmlAttribute(name = "idCardNo")
    protected String idCardNo;
    @XmlAttribute(name = "collectBy")
    protected String collectBy;
    @XmlAttribute(name = "custType")
    protected List<String> custType;
    @XmlAttribute(name = "siteName")
    protected List<String> siteName;
    @XmlAttribute(name = "assignStatus")
    protected List<String> assignStatus;
    @XmlAttribute(name = "submitDateFrom")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar submitDateFrom;
    @XmlAttribute(name = "submitDateTo")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar submitDateTo;
    @XmlAttribute(name = "assignDateFrom")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar assignDateFrom;
    @XmlAttribute(name = "assignDateTo")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar assignDateTo;
    @XmlAttribute(name = "overdueDaysFrom")
    protected Integer overdueDaysFrom;
    @XmlAttribute(name = "overdueDaysTo")
    protected Integer overdueDaysTo;
    @XmlAttribute(name = "submitOrgName")
    protected Long submitOrgName;

    /**
     * Gets the value of the custName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustName() {
        return custName;
    }

    /**
     * Sets the value of the custName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustName(String value) {
        this.custName = value;
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
     * Gets the value of the collectBy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCollectBy() {
        return collectBy;
    }

    /**
     * Sets the value of the collectBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCollectBy(String value) {
        this.collectBy = value;
    }

    /**
     * Gets the value of the custType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the custType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCustType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getCustType() {
        if (custType == null) {
            custType = new ArrayList<String>();
        }
        return this.custType;
    }

    /**
     * Gets the value of the siteName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the siteName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSiteName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getSiteName() {
        if (siteName == null) {
            siteName = new ArrayList<String>();
        }
        return this.siteName;
    }

    /**
     * Gets the value of the assignStatus property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the assignStatus property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAssignStatus().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getAssignStatus() {
        if (assignStatus == null) {
            assignStatus = new ArrayList<String>();
        }
        return this.assignStatus;
    }

    /**
     * Gets the value of the submitDateFrom property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSubmitDateFrom() {
        return submitDateFrom;
    }

    /**
     * Sets the value of the submitDateFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSubmitDateFrom(XMLGregorianCalendar value) {
        this.submitDateFrom = value;
    }

    /**
     * Gets the value of the submitDateTo property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSubmitDateTo() {
        return submitDateTo;
    }

    /**
     * Sets the value of the submitDateTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSubmitDateTo(XMLGregorianCalendar value) {
        this.submitDateTo = value;
    }

    /**
     * Gets the value of the assignDateFrom property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getAssignDateFrom() {
        return assignDateFrom;
    }

    /**
     * Sets the value of the assignDateFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setAssignDateFrom(XMLGregorianCalendar value) {
        this.assignDateFrom = value;
    }

    /**
     * Gets the value of the assignDateTo property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getAssignDateTo() {
        return assignDateTo;
    }

    /**
     * Sets the value of the assignDateTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setAssignDateTo(XMLGregorianCalendar value) {
        this.assignDateTo = value;
    }

    /**
     * Gets the value of the overdueDaysFrom property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getOverdueDaysFrom() {
        return overdueDaysFrom;
    }

    /**
     * Sets the value of the overdueDaysFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setOverdueDaysFrom(Integer value) {
        this.overdueDaysFrom = value;
    }

    /**
     * Gets the value of the overdueDaysTo property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getOverdueDaysTo() {
        return overdueDaysTo;
    }

    /**
     * Sets the value of the overdueDaysTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setOverdueDaysTo(Integer value) {
        this.overdueDaysTo = value;
    }

    /**
     * Gets the value of the submitOrgName property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSubmitOrgName() {
        return submitOrgName;
    }

    /**
     * Sets the value of the submitOrgName property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSubmitOrgName(Long value) {
        this.submitOrgName = value;
    }

}
