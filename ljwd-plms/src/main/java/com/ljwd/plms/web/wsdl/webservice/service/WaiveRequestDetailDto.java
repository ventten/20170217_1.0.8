
package com.ljwd.plms.web.wsdl.webservice.service;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for waiveRequestDetailDto complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="waiveRequestDetailDto">
 *   &lt;complexContent>
 *     &lt;extension base="{http://webservice.loan.mfbms.flinkmf.com/}baseVersionableCreatorAwareEntityDto">
 *       &lt;sequence>
 *       &lt;/sequence>
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="waiveRequestId" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="receivableId" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="ledgerCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="waivedAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "waiveRequestDetailDto")
public class WaiveRequestDetailDto
    extends BaseVersionableCreatorAwareEntityDto
{

    @XmlAttribute(name = "id")
    protected Long id;
    @XmlAttribute(name = "waiveRequestId")
    protected Long waiveRequestId;
    @XmlAttribute(name = "receivableId")
    protected Long receivableId;
    @XmlAttribute(name = "ledgerCode")
    protected String ledgerCode;
    @XmlAttribute(name = "waivedAmount")
    protected BigDecimal waivedAmount;

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
     * Gets the value of the waiveRequestId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getWaiveRequestId() {
        return waiveRequestId;
    }

    /**
     * Sets the value of the waiveRequestId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setWaiveRequestId(Long value) {
        this.waiveRequestId = value;
    }

    /**
     * Gets the value of the receivableId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getReceivableId() {
        return receivableId;
    }

    /**
     * Sets the value of the receivableId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setReceivableId(Long value) {
        this.receivableId = value;
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
     * Gets the value of the waivedAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getWaivedAmount() {
        return waivedAmount;
    }

    /**
     * Sets the value of the waivedAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setWaivedAmount(BigDecimal value) {
        this.waivedAmount = value;
    }

}
