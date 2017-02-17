
package com.ljwd.plms.web.wsdl.webservice.service;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for turnoverManageDto complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="turnoverManageDto">
 *   &lt;complexContent>
 *     &lt;extension base="{http://webservice.loan.mfbms.flinkmf.com/}baseVersionableCreatorAwareEntityDto">
 *       &lt;sequence>
 *       &lt;/sequence>
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="accountInfoId" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="turnoverTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="balance" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       &lt;attribute name="isCalc" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "turnoverManageDto")
public class TurnoverManageDto
    extends BaseVersionableCreatorAwareEntityDto
{

    @XmlAttribute(name = "id")
    protected Long id;
    @XmlAttribute(name = "accountInfoId")
    protected Long accountInfoId;
    @XmlAttribute(name = "turnoverTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar turnoverTime;
    @XmlAttribute(name = "balance")
    protected BigDecimal balance;
    @XmlAttribute(name = "isCalc")
    protected Boolean isCalc;

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

}
