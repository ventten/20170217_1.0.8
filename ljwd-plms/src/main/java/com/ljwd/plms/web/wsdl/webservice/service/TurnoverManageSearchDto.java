
package com.ljwd.plms.web.wsdl.webservice.service;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for turnoverManageSearchDto complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="turnoverManageSearchDto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *       &lt;/sequence>
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="accountInfoId" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="turnoverCardno" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="turnoverTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="balance" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       &lt;attribute name="isCalc" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="applId" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="applCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="turnoverDetailed" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "turnoverManageSearchDto")
public class TurnoverManageSearchDto {

    @XmlAttribute(name = "id")
    protected Long id;
    @XmlAttribute(name = "accountInfoId")
    protected Long accountInfoId;
    @XmlAttribute(name = "turnoverCardno")
    protected String turnoverCardno;
    @XmlAttribute(name = "turnoverTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar turnoverTime;
    @XmlAttribute(name = "balance")
    protected BigDecimal balance;
    @XmlAttribute(name = "isCalc")
    protected Boolean isCalc;
    @XmlAttribute(name = "applId")
    protected Long applId;
    @XmlAttribute(name = "applCode")
    protected String applCode;
    @XmlAttribute(name = "turnoverDetailed")
    protected String turnoverDetailed;

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
     * Gets the value of the accountInfoId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getAccountInfoId() {
        return accountInfoId;
    }

    /**
     * Sets the value of the accountInfoId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setAccountInfoId(Long value) {
        this.accountInfoId = value;
    }

    /**
     * Gets the value of the turnoverCardno property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTurnoverCardno() {
        return turnoverCardno;
    }

    /**
     * Sets the value of the turnoverCardno property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTurnoverCardno(String value) {
        this.turnoverCardno = value;
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
     * Gets the value of the balance property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBalance() {
        return balance;
    }

    /**
     * Sets the value of the balance property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBalance(BigDecimal value) {
        this.balance = value;
    }

    /**
     * Gets the value of the isCalc property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsCalc() {
        return isCalc;
    }

    /**
     * Sets the value of the isCalc property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsCalc(Boolean value) {
        this.isCalc = value;
    }

    /**
     * Gets the value of the applId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getApplId() {
        return applId;
    }

    /**
     * Sets the value of the applId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setApplId(Long value) {
        this.applId = value;
    }

    /**
     * Gets the value of the applCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApplCode() {
        return applCode;
    }

    /**
     * Sets the value of the applCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApplCode(String value) {
        this.applCode = value;
    }

    /**
     * Gets the value of the turnoverDetailed property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTurnoverDetailed() {
        return turnoverDetailed;
    }

    /**
     * Sets the value of the turnoverDetailed property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTurnoverDetailed(String value) {
        this.turnoverDetailed = value;
    }

}
