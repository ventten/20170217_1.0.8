
package com.ljwd.plms.web.wsdl.webservice.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for collectorIncomeParamDto complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="collectorIncomeParamDto">
 *   &lt;complexContent>
 *     &lt;extension base="{http://webservice.loan.mfbms.flinkmf.com/}baseDataControlDto">
 *       &lt;sequence>
 *       &lt;/sequence>
 *       &lt;attribute name="cntrctNo" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="collector" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="outVisit" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="operationDateStart" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="operationDateEnd" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="rpmntDateStart" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="rpmntDateEnd" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="status" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "collectorIncomeParamDto")
public class CollectorIncomeParamDto
    extends BaseDataControlDto
{

    @XmlAttribute(name = "cntrctNo")
    protected String cntrctNo;
    @XmlAttribute(name = "collector")
    protected String collector;
    @XmlAttribute(name = "outVisit")
    protected String outVisit;
    @XmlAttribute(name = "operationDateStart")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar operationDateStart;
    @XmlAttribute(name = "operationDateEnd")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar operationDateEnd;
    @XmlAttribute(name = "rpmntDateStart")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar rpmntDateStart;
    @XmlAttribute(name = "rpmntDateEnd")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar rpmntDateEnd;
    @XmlAttribute(name = "status")
    protected String status;

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
     * Gets the value of the operationDateStart property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOperationDateStart() {
        return operationDateStart;
    }

    /**
     * Sets the value of the operationDateStart property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOperationDateStart(XMLGregorianCalendar value) {
        this.operationDateStart = value;
    }

    /**
     * Gets the value of the operationDateEnd property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOperationDateEnd() {
        return operationDateEnd;
    }

    /**
     * Sets the value of the operationDateEnd property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOperationDateEnd(XMLGregorianCalendar value) {
        this.operationDateEnd = value;
    }

    /**
     * Gets the value of the rpmntDateStart property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRpmntDateStart() {
        return rpmntDateStart;
    }

    /**
     * Sets the value of the rpmntDateStart property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRpmntDateStart(XMLGregorianCalendar value) {
        this.rpmntDateStart = value;
    }

    /**
     * Gets the value of the rpmntDateEnd property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRpmntDateEnd() {
        return rpmntDateEnd;
    }

    /**
     * Sets the value of the rpmntDateEnd property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRpmntDateEnd(XMLGregorianCalendar value) {
        this.rpmntDateEnd = value;
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

}
