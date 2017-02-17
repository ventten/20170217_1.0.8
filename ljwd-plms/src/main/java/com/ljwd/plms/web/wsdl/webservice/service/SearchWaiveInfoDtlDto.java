
package com.ljwd.plms.web.wsdl.webservice.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for searchWaiveInfoDtlDto complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="searchWaiveInfoDtlDto">
 *   &lt;complexContent>
 *     &lt;extension base="{http://webservice.loan.mfbms.flinkmf.com/}baseVersionableCreatorAwareEntityDto">
 *       &lt;sequence>
 *       &lt;/sequence>
 *       &lt;attribute name="rpmntid" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="tiaoperiod" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="tiaoledger" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="tiaoactual" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="tiaozperiod" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="tiaozledger" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="tiaozactual" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "searchWaiveInfoDtlDto")
public class SearchWaiveInfoDtlDto
    extends BaseVersionableCreatorAwareEntityDto
{

    @XmlAttribute(name = "rpmntid")
    protected Long rpmntid;
    @XmlAttribute(name = "tiaoperiod")
    protected String tiaoperiod;
    @XmlAttribute(name = "tiaoledger")
    protected String tiaoledger;
    @XmlAttribute(name = "tiaoactual")
    protected String tiaoactual;
    @XmlAttribute(name = "tiaozperiod")
    protected String tiaozperiod;
    @XmlAttribute(name = "tiaozledger")
    protected String tiaozledger;
    @XmlAttribute(name = "tiaozactual")
    protected String tiaozactual;

    /**
     * Gets the value of the rpmntid property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getRpmntid() {
        return rpmntid;
    }

    /**
     * Sets the value of the rpmntid property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setRpmntid(Long value) {
        this.rpmntid = value;
    }

    /**
     * Gets the value of the tiaoperiod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTiaoperiod() {
        return tiaoperiod;
    }

    /**
     * Sets the value of the tiaoperiod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTiaoperiod(String value) {
        this.tiaoperiod = value;
    }

    /**
     * Gets the value of the tiaoledger property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTiaoledger() {
        return tiaoledger;
    }

    /**
     * Sets the value of the tiaoledger property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTiaoledger(String value) {
        this.tiaoledger = value;
    }

    /**
     * Gets the value of the tiaoactual property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTiaoactual() {
        return tiaoactual;
    }

    /**
     * Sets the value of the tiaoactual property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTiaoactual(String value) {
        this.tiaoactual = value;
    }

    /**
     * Gets the value of the tiaozperiod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTiaozperiod() {
        return tiaozperiod;
    }

    /**
     * Sets the value of the tiaozperiod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTiaozperiod(String value) {
        this.tiaozperiod = value;
    }

    /**
     * Gets the value of the tiaozledger property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTiaozledger() {
        return tiaozledger;
    }

    /**
     * Sets the value of the tiaozledger property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTiaozledger(String value) {
        this.tiaozledger = value;
    }

    /**
     * Gets the value of the tiaozactual property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTiaozactual() {
        return tiaozactual;
    }

    /**
     * Sets the value of the tiaozactual property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTiaozactual(String value) {
        this.tiaozactual = value;
    }

}
