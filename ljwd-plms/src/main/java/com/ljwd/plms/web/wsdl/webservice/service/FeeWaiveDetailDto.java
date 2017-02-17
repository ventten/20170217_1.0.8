
package com.ljwd.plms.web.wsdl.webservice.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for feeWaiveDetailDto complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="feeWaiveDetailDto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *       &lt;/sequence>
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="ledgerCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="waiveAmt" type="{http://www.w3.org/2001/XMLSchema}double" />
 *       &lt;attribute name="ledgerName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "feeWaiveDetailDto")
public class FeeWaiveDetailDto {

    @XmlAttribute(name = "id")
    protected Long id;
    @XmlAttribute(name = "ledgerCode")
    protected String ledgerCode;
    @XmlAttribute(name = "waiveAmt")
    protected Double waiveAmt;
    @XmlAttribute(name = "ledgerName")
    protected String ledgerName;

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
     * Gets the value of the ledgerCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLedgerCode() {
        return ledgerCode;
    }

    /**
     * Sets the value of the ledgerCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLedgerCode(String value) {
        this.ledgerCode = value;
    }

    /**
     * Gets the value of the waiveAmt property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getWaiveAmt() {
        return waiveAmt;
    }

    /**
     * Sets the value of the waiveAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setWaiveAmt(Double value) {
        this.waiveAmt = value;
    }

    /**
     * Gets the value of the ledgerName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLedgerName() {
        return ledgerName;
    }

    /**
     * Sets the value of the ledgerName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLedgerName(String value) {
        this.ledgerName = value;
    }

}
