
package com.ljwd.plms.web.wsdl.webservice.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for aPenClearResultDto complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="aPenClearResultDto">
 *   &lt;complexContent>
 *     &lt;extension base="{http://webservice.loan.mfbms.flinkmf.com/}baseVersionableCreatorAwareEntityDto">
 *       &lt;sequence>
 *       &lt;/sequence>
 *       &lt;attribute name="applid" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="appldate" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="status" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="surplus" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="actualdate" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="maxdate" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="apartdate" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "aPenClearResultDto")
public class APenClearResultDto
    extends BaseVersionableCreatorAwareEntityDto
{

    @XmlAttribute(name = "applid")
    protected Long applid;
    @XmlAttribute(name = "appldate")
    protected String appldate;
    @XmlAttribute(name = "status")
    protected String status;
    @XmlAttribute(name = "surplus")
    protected String surplus;
    @XmlAttribute(name = "actualdate")
    protected String actualdate;
    @XmlAttribute(name = "maxdate")
    protected String maxdate;
    @XmlAttribute(name = "apartdate")
    protected String apartdate;

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
     * Gets the value of the appldate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAppldate() {
        return appldate;
    }

    /**
     * Sets the value of the appldate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAppldate(String value) {
        this.appldate = value;
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
     * Gets the value of the surplus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSurplus() {
        return surplus;
    }

    /**
     * Sets the value of the surplus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSurplus(String value) {
        this.surplus = value;
    }

    /**
     * Gets the value of the actualdate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActualdate() {
        return actualdate;
    }

    /**
     * Sets the value of the actualdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActualdate(String value) {
        this.actualdate = value;
    }

    /**
     * Gets the value of the maxdate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaxdate() {
        return maxdate;
    }

    /**
     * Sets the value of the maxdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaxdate(String value) {
        this.maxdate = value;
    }

    /**
     * Gets the value of the apartdate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApartdate() {
        return apartdate;
    }

    /**
     * Sets the value of the apartdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApartdate(String value) {
        this.apartdate = value;
    }

}
