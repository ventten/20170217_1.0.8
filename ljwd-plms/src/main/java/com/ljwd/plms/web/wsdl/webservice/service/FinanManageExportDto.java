
package com.ljwd.plms.web.wsdl.webservice.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for finanManageExportDto complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="finanManageExportDto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *       &lt;/sequence>
 *       &lt;attribute name="applid" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="finanid" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="sentDateFrom" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "finanManageExportDto")
public class FinanManageExportDto {

    @XmlAttribute(name = "applid")
    protected Long applid;
    @XmlAttribute(name = "finanid")
    protected Long finanid;
    @XmlAttribute(name = "sentDateFrom")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar sentDateFrom;

    /**
     * Gets the value of the applid property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getApplid() {
        return applid;
    }

    /**
     * Sets the value of the applid property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setApplid(Long value) {
        this.applid = value;
    }

    /**
     * Gets the value of the finanid property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getFinanid() {
        return finanid;
    }

    /**
     * Sets the value of the finanid property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setFinanid(Long value) {
        this.finanid = value;
    }

    /**
     * Gets the value of the sentDateFrom property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSentDateFrom() {
        return sentDateFrom;
    }

    /**
     * Sets the value of the sentDateFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSentDateFrom(XMLGregorianCalendar value) {
        this.sentDateFrom = value;
    }

}
