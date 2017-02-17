
package com.ljwd.plms.web.wsdl.webservice.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for outVisitDelayAuditSearchParamDto complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="outVisitDelayAuditSearchParamDto">
 *   &lt;complexContent>
 *     &lt;extension base="{http://webservice.loan.mfbms.flinkmf.com/}baseDataControlDto">
 *       &lt;sequence>
 *       &lt;/sequence>
 *       &lt;attribute name="custName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="cardId" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="contractNo" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="areaId" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="delaySubmitBy" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="delayAuditResult" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="delaySumitDateFrom" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="delaySubmitDateTo" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="delayAuditDateFrom" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="delayAuditDateTo" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="delayTimesFrom" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="delayTimesTo" type="{http://www.w3.org/2001/XMLSchema}long" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "outVisitDelayAuditSearchParamDto")
public class OutVisitDelayAuditSearchParamDto
    extends BaseDataControlDto
{

    @XmlAttribute(name = "custName")
    protected String custName;
    @XmlAttribute(name = "cardId")
    protected String cardId;
    @XmlAttribute(name = "contractNo")
    protected String contractNo;
    @XmlAttribute(name = "areaId")
    protected Long areaId;
    @XmlAttribute(name = "delaySubmitBy")
    protected String delaySubmitBy;
    @XmlAttribute(name = "delayAuditResult")
    protected String delayAuditResult;
    @XmlAttribute(name = "delaySumitDateFrom")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar delaySumitDateFrom;
    @XmlAttribute(name = "delaySubmitDateTo")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar delaySubmitDateTo;
    @XmlAttribute(name = "delayAuditDateFrom")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar delayAuditDateFrom;
    @XmlAttribute(name = "delayAuditDateTo")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar delayAuditDateTo;
    @XmlAttribute(name = "delayTimesFrom")
    protected Long delayTimesFrom;
    @XmlAttribute(name = "delayTimesTo")
    protected Long delayTimesTo;

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
     * Gets the value of the areaId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getAreaId() {
        return areaId;
    }

    /**
     * Sets the value of the areaId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setAreaId(Long value) {
        this.areaId = value;
    }

    /**
     * Gets the value of the delaySubmitBy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDelaySubmitBy() {
        return delaySubmitBy;
    }

    /**
     * Sets the value of the delaySubmitBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDelaySubmitBy(String value) {
        this.delaySubmitBy = value;
    }

    /**
     * Gets the value of the delayAuditResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDelayAuditResult() {
        return delayAuditResult;
    }

    /**
     * Sets the value of the delayAuditResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDelayAuditResult(String value) {
        this.delayAuditResult = value;
    }

    /**
     * Gets the value of the delaySumitDateFrom property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDelaySumitDateFrom() {
        return delaySumitDateFrom;
    }

    /**
     * Sets the value of the delaySumitDateFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDelaySumitDateFrom(XMLGregorianCalendar value) {
        this.delaySumitDateFrom = value;
    }

    /**
     * Gets the value of the delaySubmitDateTo property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDelaySubmitDateTo() {
        return delaySubmitDateTo;
    }

    /**
     * Sets the value of the delaySubmitDateTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDelaySubmitDateTo(XMLGregorianCalendar value) {
        this.delaySubmitDateTo = value;
    }

    /**
     * Gets the value of the delayAuditDateFrom property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDelayAuditDateFrom() {
        return delayAuditDateFrom;
    }

    /**
     * Sets the value of the delayAuditDateFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDelayAuditDateFrom(XMLGregorianCalendar value) {
        this.delayAuditDateFrom = value;
    }

    /**
     * Gets the value of the delayAuditDateTo property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDelayAuditDateTo() {
        return delayAuditDateTo;
    }

    /**
     * Sets the value of the delayAuditDateTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDelayAuditDateTo(XMLGregorianCalendar value) {
        this.delayAuditDateTo = value;
    }

    /**
     * Gets the value of the delayTimesFrom property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getDelayTimesFrom() {
        return delayTimesFrom;
    }

    /**
     * Sets the value of the delayTimesFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setDelayTimesFrom(Long value) {
        this.delayTimesFrom = value;
    }

    /**
     * Gets the value of the delayTimesTo property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getDelayTimesTo() {
        return delayTimesTo;
    }

    /**
     * Sets the value of the delayTimesTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setDelayTimesTo(Long value) {
        this.delayTimesTo = value;
    }

}
