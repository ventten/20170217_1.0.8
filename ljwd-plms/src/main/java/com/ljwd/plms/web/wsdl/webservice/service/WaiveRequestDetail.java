
package com.ljwd.plms.web.wsdl.webservice.service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for waiveRequestDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="waiveRequestDetail">
 *   &lt;complexContent>
 *     &lt;extension base="{http://webservice.loan.mfbms.flinkmf.com/}baseVersionableCreatorAwareEntity">
 *       &lt;sequence>
 *         &lt;element name="ledgerCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="receivable" type="{http://webservice.loan.mfbms.flinkmf.com/}receivable" minOccurs="0"/>
 *         &lt;element name="receivableId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="waiveRequest" type="{http://webservice.loan.mfbms.flinkmf.com/}waiveRequest" minOccurs="0"/>
 *         &lt;element name="waiveRequestId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="waivedAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="waives" type="{http://webservice.loan.mfbms.flinkmf.com/}waive" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "waiveRequestDetail", propOrder = {
    "ledgerCode",
    "receivable",
    "receivableId",
    "waiveRequest",
    "waiveRequestId",
    "waivedAmount",
    "waives"
})
public class WaiveRequestDetail
    extends BaseVersionableCreatorAwareEntity
{

    protected String ledgerCode;
    protected Receivable receivable;
    protected Long receivableId;
    protected WaiveRequest waiveRequest;
    protected Long waiveRequestId;
    protected BigDecimal waivedAmount;
    @XmlElement(nillable = true)
    protected List<Waive> waives;

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
     * Gets the value of the waiveRequest property.
     * 
     * @return
     *     possible object is
     *     {@link WaiveRequest }
     *     
     */
    public WaiveRequest getWaiveRequest() {
        return waiveRequest;
    }

    /**
     * Sets the value of the waiveRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link WaiveRequest }
     *     
     */
    public void setWaiveRequest(WaiveRequest value) {
        this.waiveRequest = value;
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

    /**
     * Gets the value of the waives property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the waives property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWaives().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Waive }
     * 
     * 
     */
    public List<Waive> getWaives() {
        if (waives == null) {
            waives = new ArrayList<Waive>();
        }
        return this.waives;
    }

}
