
package com.ljwd.plms.web.wsdl.webservice.service;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for collectorIncomeDto complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="collectorIncomeDto">
 *   &lt;complexContent>
 *     &lt;extension base="{http://webservice.loan.mfbms.flinkmf.com/}baseVersionableCreatorAwareEntityDto">
 *       &lt;sequence>
 *         &lt;element name="updateTimeStr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="rpmntId" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="cntrctNo" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="custName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="idCard" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="collector" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="collectorAgent" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="outVisit" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="rpmntAmt" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       &lt;attribute name="rpmntDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="operationDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="status" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="refundAmt" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       &lt;attribute name="updatedTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "collectorIncomeDto", propOrder = {
    "updateTimeStr"
})
public class CollectorIncomeDto
    extends BaseVersionableCreatorAwareEntityDto
{

    protected String updateTimeStr;
    @XmlAttribute(name = "rpmntId")
    protected Long rpmntId;
    @XmlAttribute(name = "cntrctNo")
    protected String cntrctNo;
    @XmlAttribute(name = "custName")
    protected String custName;
    @XmlAttribute(name = "idCard")
    protected String idCard;
    @XmlAttribute(name = "collector")
    protected String collector;
    @XmlAttribute(name = "collectorAgent")
    protected String collectorAgent;
    @XmlAttribute(name = "outVisit")
    protected String outVisit;
    @XmlAttribute(name = "rpmntAmt")
    protected BigDecimal rpmntAmt;
    @XmlAttribute(name = "rpmntDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar rpmntDate;
    @XmlAttribute(name = "operationDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar operationDate;
    @XmlAttribute(name = "status")
    protected String status;
    @XmlAttribute(name = "refundAmt")
    protected BigDecimal refundAmt;
    @XmlAttribute(name = "updatedTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar updatedTime;

    /**
     * Gets the value of the updateTimeStr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUpdateTimeStr() {
        return updateTimeStr;
    }

    /**
     * Sets the value of the updateTimeStr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUpdateTimeStr(String value) {
        this.updateTimeStr = value;
    }

    /**
     * Gets the value of the rpmntId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getRpmntId() {
        return rpmntId;
    }

    /**
     * Sets the value of the rpmntId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setRpmntId(Long value) {
        this.rpmntId = value;
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
     * Gets the value of the collector property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCollector() {
        return collector;
    }

    /**
     * Sets the value of the collector property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCollector(String value) {
        this.collector = value;
    }

    /**
     * Gets the value of the collectorAgent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCollectorAgent() {
        return collectorAgent;
    }

    /**
     * Sets the value of the collectorAgent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCollectorAgent(String value) {
        this.collectorAgent = value;
    }

    /**
     * Gets the value of the outVisit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutVisit() {
        return outVisit;
    }

    /**
     * Sets the value of the outVisit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutVisit(String value) {
        this.outVisit = value;
    }

    /**
     * Gets the value of the rpmntAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRpmntAmt() {
        return rpmntAmt;
    }

    /**
     * Sets the value of the rpmntAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRpmntAmt(BigDecimal value) {
        this.rpmntAmt = value;
    }

    /**
     * Gets the value of the rpmntDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRpmntDate() {
        return rpmntDate;
    }

    /**
     * Sets the value of the rpmntDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRpmntDate(XMLGregorianCalendar value) {
        this.rpmntDate = value;
    }

    /**
     * Gets the value of the operationDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOperationDate() {
        return operationDate;
    }

    /**
     * Sets the value of the operationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOperationDate(XMLGregorianCalendar value) {
        this.operationDate = value;
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
     * Gets the value of the refundAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRefundAmt() {
        return refundAmt;
    }

    /**
     * Sets the value of the refundAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRefundAmt(BigDecimal value) {
        this.refundAmt = value;
    }

    /**
     * Gets the value of the updatedTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getUpdatedTime() {
        return updatedTime;
    }

    /**
     * Sets the value of the updatedTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setUpdatedTime(XMLGregorianCalendar value) {
        this.updatedTime = value;
    }

}
