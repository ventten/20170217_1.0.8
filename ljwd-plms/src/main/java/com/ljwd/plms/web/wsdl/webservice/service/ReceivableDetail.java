
package com.ljwd.plms.web.wsdl.webservice.service;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for receivableDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="receivableDetail">
 *   &lt;complexContent>
 *     &lt;extension base="{http://webservice.loan.mfbms.flinkmf.com/}baseVersionableCreatorAwareEntity">
 *       &lt;sequence>
 *         &lt;element name="actualAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="ledgerType" type="{http://webservice.loan.mfbms.flinkmf.com/}ledgerType" minOccurs="0"/>
 *         &lt;element name="ledgerTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="receivable" type="{http://webservice.loan.mfbms.flinkmf.com/}receivable" minOccurs="0"/>
 *         &lt;element name="receivableAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="receivableId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="waivedAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "receivableDetail", propOrder = {
    "actualAmount",
    "ledgerType",
    "ledgerTypeCode",
    "receivable",
    "receivableAmount",
    "receivableId",
    "waivedAmount"
})
public class ReceivableDetail
    extends BaseVersionableCreatorAwareEntity
{

    protected BigDecimal actualAmount;
    protected LedgerType ledgerType;
    protected String ledgerTypeCode;
    protected Receivable receivable;
    protected BigDecimal receivableAmount;
    protected Long receivableId;
    protected BigDecimal waivedAmount;

    /**
     * Gets the value of the actualAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getActualAmount() {
        return actualAmount;
    }

    /**
     * Sets the value of the actualAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setActualAmount(BigDecimal value) {
        this.actualAmount = value;
    }

    /**
     * Gets the value of the ledgerType property.
     * 
     * @return
     *     possible object is
     *     {@link LedgerType }
     *     
     */
    public LedgerType getLedgerType() {
        return ledgerType;
    }

    /**
     * Sets the value of the ledgerType property.
     * 
     * @param value
     *     allowed object is
     *     {@link LedgerType }
     *     
     */
    public void setLedgerType(LedgerType value) {
        this.ledgerType = value;
    }

    /**
     * Gets the value of the ledgerTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLedgerTypeCode() {
        return ledgerTypeCode;
    }

    /**
     * Sets the value of the ledgerTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLedgerTypeCode(String value) {
        this.ledgerTypeCode = value;
    }

    /**
     * Gets the value of the receivable property.
     * 
     * @return
     *     possible object is
     *     {@link Receivable }
     *     
     */
    public Receivable getReceivable() {
        return receivable;
    }

    /**
     * Sets the value of the receivable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Receivable }
     *     
     */
    public void setReceivable(Receivable value) {
        this.receivable = value;
    }

    /**
     * Gets the value of the receivableAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getReceivableAmount() {
        return receivableAmount;
    }

    /**
     * Sets the value of the receivableAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setReceivableAmount(BigDecimal value) {
        this.receivableAmount = value;
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
