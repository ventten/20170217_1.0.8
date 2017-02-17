
package com.ljwd.plms.web.wsdl.webservice.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for changeCheckSearchParamDto complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="changeCheckSearchParamDto">
 *   &lt;complexContent>
 *     &lt;extension base="{http://webservice.loan.mfbms.flinkmf.com/}baseDataControlDto">
 *       &lt;sequence>
 *       &lt;/sequence>
 *       &lt;attribute name="custname" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="idcardno" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="changetype" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="applcode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="reqfromdate" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="reqtodate" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="status" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="requested" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "changeCheckSearchParamDto")
public class ChangeCheckSearchParamDto
    extends BaseDataControlDto
{

    @XmlAttribute(name = "custname")
    protected String custname;
    @XmlAttribute(name = "idcardno")
    protected String idcardno;
    @XmlAttribute(name = "changetype")
    protected String changetype;
    @XmlAttribute(name = "applcode")
    protected String applcode;
    @XmlAttribute(name = "reqfromdate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar reqfromdate;
    @XmlAttribute(name = "reqtodate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar reqtodate;
    @XmlAttribute(name = "status")
    protected String status;
    @XmlAttribute(name = "requested")
    protected String requested;

    /**
     * Gets the value of the custname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustname() {
        return custname;
    }

    /**
     * Sets the value of the custname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustname(String value) {
        this.custname = value;
    }

    /**
     * Gets the value of the idcardno property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdcardno() {
        return idcardno;
    }

    /**
     * Sets the value of the idcardno property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdcardno(String value) {
        this.idcardno = value;
    }

    /**
     * Gets the value of the changetype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChangetype() {
        return changetype;
    }

    /**
     * Sets the value of the changetype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChangetype(String value) {
        this.changetype = value;
    }

    /**
     * Gets the value of the applcode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApplcode() {
        return applcode;
    }

    /**
     * Sets the value of the applcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApplcode(String value) {
        this.applcode = value;
    }

    /**
     * Gets the value of the reqfromdate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getReqfromdate() {
        return reqfromdate;
    }

    /**
     * Sets the value of the reqfromdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setReqfromdate(XMLGregorianCalendar value) {
        this.reqfromdate = value;
    }

    /**
     * Gets the value of the reqtodate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getReqtodate() {
        return reqtodate;
    }

    /**
     * Sets the value of the reqtodate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setReqtodate(XMLGregorianCalendar value) {
        this.reqtodate = value;
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
     * Gets the value of the requested property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequested() {
        return requested;
    }

    /**
     * Sets the value of the requested property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequested(String value) {
        this.requested = value;
    }

}
