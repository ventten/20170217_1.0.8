
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
 * <p>Java class for outVisitPlanSearchParamDto complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="outVisitPlanSearchParamDto">
 *   &lt;complexContent>
 *     &lt;extension base="{http://webservice.loan.mfbms.flinkmf.com/}baseDataControlDto">
 *       &lt;sequence>
 *       &lt;/sequence>
 *       &lt;attribute name="applId" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="cntrctNo" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="custName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="cardId" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="orgID">
 *         &lt;simpleType>
 *           &lt;list itemType="{http://www.w3.org/2001/XMLSchema}long" />
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="visitBy">
 *         &lt;simpleType>
 *           &lt;list itemType="{http://www.w3.org/2001/XMLSchema}string" />
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="planStatus" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="planStatusStr" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="planStartTimeFrom" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="planStartTimeTo" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="outVisitInfoId" type="{http://www.w3.org/2001/XMLSchema}long" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "outVisitPlanSearchParamDto")
public class OutVisitPlanSearchParamDto
    extends BaseDataControlDto
{

    @XmlAttribute(name = "applId")
    protected Long applId;
    @XmlAttribute(name = "cntrctNo")
    protected String cntrctNo;
    @XmlAttribute(name = "custName")
    protected String custName;
    @XmlAttribute(name = "cardId")
    protected String cardId;
    @XmlAttribute(name = "orgID")
    protected List<Long> orgID;
    @XmlAttribute(name = "visitBy")
    protected List<String> visitBy;
    @XmlAttribute(name = "planStatus")
    protected String planStatus;
    @XmlAttribute(name = "planStatusStr")
    protected String planStatusStr;
    @XmlAttribute(name = "planStartTimeFrom")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar planStartTimeFrom;
    @XmlAttribute(name = "planStartTimeTo")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar planStartTimeTo;
    @XmlAttribute(name = "id")
    protected Long id;
    @XmlAttribute(name = "outVisitInfoId")
    protected Long outVisitInfoId;

    /**
     * Gets the value of the applId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getApplId() {
        return applId;
    }

    /**
     * Sets the value of the applId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setApplId(Long value) {
        this.applId = value;
    }

    /**
     * Gets the value of the cntrctNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCntrctNo() {
        return cntrctNo;
    }

    /**
     * Sets the value of the cntrctNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCntrctNo(String value) {
        this.cntrctNo = value;
    }

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
     * Gets the value of the cardId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardId() {
        return cardId;
    }

    /**
     * Sets the value of the cardId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardId(String value) {
        this.cardId = value;
    }

    /**
     * Gets the value of the orgID property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the orgID property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOrgID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Long }
     * 
     * 
     */
    public List<Long> getOrgID() {
        if (orgID == null) {
            orgID = new ArrayList<Long>();
        }
        return this.orgID;
    }

    /**
     * Gets the value of the visitBy property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the visitBy property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVisitBy().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getVisitBy() {
        if (visitBy == null) {
            visitBy = new ArrayList<String>();
        }
        return this.visitBy;
    }

    /**
     * Gets the value of the planStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlanStatus() {
        return planStatus;
    }

    /**
     * Sets the value of the planStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlanStatus(String value) {
        this.planStatus = value;
    }

    /**
     * Gets the value of the planStatusStr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlanStatusStr() {
        return planStatusStr;
    }

    /**
     * Sets the value of the planStatusStr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlanStatusStr(String value) {
        this.planStatusStr = value;
    }

    /**
     * Gets the value of the planStartTimeFrom property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPlanStartTimeFrom() {
        return planStartTimeFrom;
    }

    /**
     * Sets the value of the planStartTimeFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPlanStartTimeFrom(XMLGregorianCalendar value) {
        this.planStartTimeFrom = value;
    }

    /**
     * Gets the value of the planStartTimeTo property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPlanStartTimeTo() {
        return planStartTimeTo;
    }

    /**
     * Sets the value of the planStartTimeTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPlanStartTimeTo(XMLGregorianCalendar value) {
        this.planStartTimeTo = value;
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
     * Gets the value of the outVisitInfoId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getOutVisitInfoId() {
        return outVisitInfoId;
    }

    /**
     * Sets the value of the outVisitInfoId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setOutVisitInfoId(Long value) {
        this.outVisitInfoId = value;
    }

}
