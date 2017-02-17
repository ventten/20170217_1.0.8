
package com.ljwd.plms.web.wsdl.webservice.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for auditCheckParamDto complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="auditCheckParamDto">
 *   &lt;complexContent>
 *     &lt;extension base="{http://webservice.loan.mfbms.flinkmf.com/}baseDataControlDto">
 *       &lt;sequence>
 *       &lt;/sequence>
 *       &lt;attribute name="applid" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="checktime" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="checkquery" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "auditCheckParamDto")
public class AuditCheckParamDto
    extends BaseDataControlDto
{

    @XmlAttribute(name = "applid")
    protected Long applid;
    @XmlAttribute(name = "checktime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar checktime;
    @XmlAttribute(name = "checkquery")
    protected String checkquery;

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
     * Gets the value of the checktime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getChecktime() {
        return checktime;
    }

    /**
     * Sets the value of the checktime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setChecktime(XMLGregorianCalendar value) {
        this.checktime = value;
    }

    /**
     * Gets the value of the checkquery property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCheckquery() {
        return checkquery;
    }

    /**
     * Sets the value of the checkquery property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCheckquery(String value) {
        this.checkquery = value;
    }

}
