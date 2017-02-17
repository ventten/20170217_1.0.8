
package com.ljwd.plms.web.wsdl.webservice.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for dailyReconciliationParamDto complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dailyReconciliationParamDto">
 *   &lt;complexContent>
 *     &lt;extension base="{http://webservice.loan.mfbms.flinkmf.com/}baseDataControlDto">
 *       &lt;sequence>
 *       &lt;/sequence>
 *       &lt;attribute name="reconDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="status" type="{http://webservice.loan.mfbms.flinkmf.com/}reconciliationStatus" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dailyReconciliationParamDto")
public class DailyReconciliationParamDto
    extends BaseDataControlDto
{

    @XmlAttribute(name = "reconDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar reconDate;
    @XmlAttribute(name = "status")
    protected ReconciliationStatus status;

    /**
     * Gets the value of the reconDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getReconDate() {
        return reconDate;
    }

    /**
     * Sets the value of the reconDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setReconDate(XMLGregorianCalendar value) {
        this.reconDate = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link ReconciliationStatus }
     *     
     */
    public ReconciliationStatus getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReconciliationStatus }
     *     
     */
    public void setStatus(ReconciliationStatus value) {
        this.status = value;
    }

}
