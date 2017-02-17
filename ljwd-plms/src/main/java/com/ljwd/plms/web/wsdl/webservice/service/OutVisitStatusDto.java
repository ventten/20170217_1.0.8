
package com.ljwd.plms.web.wsdl.webservice.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for outVisitStatusDto complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="outVisitStatusDto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *       &lt;/sequence>
 *       &lt;attribute name="controlDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="controlBy" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="remarks" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "outVisitStatusDto")
public class OutVisitStatusDto {

    @XmlAttribute(name = "controlDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar controlDate;
    @XmlAttribute(name = "controlBy")
    protected String controlBy;
    @XmlAttribute(name = "remarks")
    protected String remarks;

    /**
     * Gets the value of the controlDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getControlDate() {
        return controlDate;
    }

    /**
     * Sets the value of the controlDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setControlDate(XMLGregorianCalendar value) {
        this.controlDate = value;
    }

    /**
     * Gets the value of the controlBy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getControlBy() {
        return controlBy;
    }

    /**
     * Sets the value of the controlBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setControlBy(String value) {
        this.controlBy = value;
    }

    /**
     * Gets the value of the remarks property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRemarks() {
        return remarks;
    }

    /**
     * Sets the value of the remarks property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRemarks(String value) {
        this.remarks = value;
    }

}
