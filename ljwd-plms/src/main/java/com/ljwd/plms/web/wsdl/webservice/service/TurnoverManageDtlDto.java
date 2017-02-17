
package com.ljwd.plms.web.wsdl.webservice.service;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for turnoverManageDtlDto complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="turnoverManageDtlDto">
 *   &lt;complexContent>
 *     &lt;extension base="{http://webservice.loan.mfbms.flinkmf.com/}baseVersionableCreatorAwareEntityDto">
 *       &lt;sequence>
 *       &lt;/sequence>
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="turnoverManageId" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="turnoverYuan" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       &lt;attribute name="abstracts" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="abstractSeq" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="peer" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="peerSeq" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="turnoverTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="remarks" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "turnoverManageDtlDto")
public class TurnoverManageDtlDto
    extends BaseVersionableCreatorAwareEntityDto
{

    @XmlAttribute(name = "id")
    protected Long id;
    @XmlAttribute(name = "turnoverManageId")
    protected Long turnoverManageId;
    @XmlAttribute(name = "turnoverYuan")
    protected BigDecimal turnoverYuan;
    @XmlAttribute(name = "abstracts")
    protected String abstracts;
    @XmlAttribute(name = "abstractSeq")
    protected Long abstractSeq;
    @XmlAttribute(name = "peer")
    protected String peer;
    @XmlAttribute(name = "peerSeq")
    protected Long peerSeq;
    @XmlAttribute(name = "turnoverTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar turnoverTime;
    @XmlAttribute(name = "remarks")
    protected String remarks;

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
     * Gets the value of the turnoverManageId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTurnoverManageId() {
        return turnoverManageId;
    }

    /**
     * Sets the value of the turnoverManageId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTurnoverManageId(Long value) {
        this.turnoverManageId = value;
    }

    /**
     * Gets the value of the turnoverYuan property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTurnoverYuan() {
        return turnoverYuan;
    }

    /**
     * Sets the value of the turnoverYuan property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTurnoverYuan(BigDecimal value) {
        this.turnoverYuan = value;
    }

    /**
     * Gets the value of the abstracts property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAbstracts() {
        return abstracts;
    }

    /**
     * Sets the value of the abstracts property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAbstracts(String value) {
        this.abstracts = value;
    }

    /**
     * Gets the value of the abstractSeq property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getAbstractSeq() {
        return abstractSeq;
    }

    /**
     * Sets the value of the abstractSeq property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setAbstractSeq(Long value) {
        this.abstractSeq = value;
    }

    /**
     * Gets the value of the peer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPeer() {
        return peer;
    }

    /**
     * Sets the value of the peer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPeer(String value) {
        this.peer = value;
    }

    /**
     * Gets the value of the peerSeq property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPeerSeq() {
        return peerSeq;
    }

    /**
     * Sets the value of the peerSeq property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPeerSeq(Long value) {
        this.peerSeq = value;
    }

    /**
     * Gets the value of the turnoverTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTurnoverTime() {
        return turnoverTime;
    }

    /**
     * Sets the value of the turnoverTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTurnoverTime(XMLGregorianCalendar value) {
        this.turnoverTime = value;
    }

    /**
     * Gets the value of the remarks property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRemarks() {
        return remarks;
    }

    /**
     * Sets the value of the remarks property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRemarks(String value) {
        this.remarks = value;
    }

}
