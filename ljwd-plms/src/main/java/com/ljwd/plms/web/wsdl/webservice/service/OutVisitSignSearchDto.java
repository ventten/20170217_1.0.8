
package com.ljwd.plms.web.wsdl.webservice.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for outVisitSignSearchDto complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="outVisitSignSearchDto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *       &lt;/sequence>
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="planDtlId" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="signBy" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="signTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="signResult" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="signName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "outVisitSignSearchDto")
public class OutVisitSignSearchDto {

    @XmlAttribute(name = "id")
    protected Long id;
    @XmlAttribute(name = "planDtlId")
    protected Long planDtlId;
    @XmlAttribute(name = "signBy")
    protected String signBy;
    @XmlAttribute(name = "signTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar signTime;
    @XmlAttribute(name = "signResult")
    protected String signResult;
    @XmlAttribute(name = "signName")
    protected String signName;

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
     * Gets the value of the planDtlId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPlanDtlId() {
        return planDtlId;
    }

    /**
     * Sets the value of the planDtlId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPlanDtlId(Long value) {
        this.planDtlId = value;
    }

    /**
     * Gets the value of the signBy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSignBy() {
        return signBy;
    }

    /**
     * Sets the value of the signBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSignBy(String value) {
        this.signBy = value;
    }

    /**
     * Gets the value of the signTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSignTime() {
        return signTime;
    }

    /**
     * Sets the value of the signTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSignTime(XMLGregorianCalendar value) {
        this.signTime = value;
    }

    /**
     * Gets the value of the signResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSignResult() {
        return signResult;
    }

    /**
     * Sets the value of the signResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSignResult(String value) {
        this.signResult = value;
    }

    /**
     * Gets the value of the signName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSignName() {
        return signName;
    }

    /**
     * Sets the value of the signName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSignName(String value) {
        this.signName = value;
    }

}
