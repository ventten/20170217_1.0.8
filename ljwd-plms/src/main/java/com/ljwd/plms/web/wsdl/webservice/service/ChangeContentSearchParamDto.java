
package com.ljwd.plms.web.wsdl.webservice.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for changeContentSearchParamDto complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="changeContentSearchParamDto">
 *   &lt;complexContent>
 *     &lt;extension base="{http://webservice.loan.mfbms.flinkmf.com/}baseDataControlDto">
 *       &lt;sequence>
 *       &lt;/sequence>
 *       &lt;attribute name="applid" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="applinfoid" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="changetype" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "changeContentSearchParamDto")
public class ChangeContentSearchParamDto
    extends BaseDataControlDto
{

    @XmlAttribute(name = "applid")
    protected Long applid;
    @XmlAttribute(name = "applinfoid")
    protected Long applinfoid;
    @XmlAttribute(name = "changetype")
    protected String changetype;

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
     * Gets the value of the applinfoid property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getApplinfoid() {
        return applinfoid;
    }

    /**
     * Sets the value of the applinfoid property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setApplinfoid(Long value) {
        this.applinfoid = value;
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

}
