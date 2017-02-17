
package com.ljwd.plms.web.wsdl.webservice.service;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for simulateRecollectParamDto complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="simulateRecollectParamDto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *       &lt;/sequence>
 *       &lt;attribute name="paymentId" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="recollectDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="periodNumber" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="isInAdvanceRepayment" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="recollectAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "simulateRecollectParamDto")
public class SimulateRecollectParamDto {

    @XmlAttribute(name = "paymentId")
    protected Long paymentId;
    @XmlAttribute(name = "recollectDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar recollectDate;
    @XmlAttribute(name = "periodNumber")
    protected Integer periodNumber;
    @XmlAttribute(name = "isInAdvanceRepayment")
    protected Boolean isInAdvanceRepayment;
    @XmlAttribute(name = "recollectAmount")
    protected BigDecimal recollectAmount;

    /**
     * Gets the value of the paymentId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPaymentId() {
        return paymentId;
    }

    /**
     * Sets the value of the paymentId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPaymentId(Long value) {
        this.paymentId = value;
    }

    /**
     * Gets the value of the recollectDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRecollectDate() {
        return recollectDate;
    }

    /**
     * Sets the value of the recollectDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRecollectDate(XMLGregorianCalendar value) {
        this.recollectDate = value;
    }

    /**
     * Gets the value of the periodNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPeriodNumber() {
        return periodNumber;
    }

    /**
     * Sets the value of the periodNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPeriodNumber(Integer value) {
        this.periodNumber = value;
    }

    /**
     * Gets the value of the isInAdvanceRepayment property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsInAdvanceRepayment() {
        return isInAdvanceRepayment;
    }

    /**
     * Sets the value of the isInAdvanceRepayment property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsInAdvanceRepayment(Boolean value) {
        this.isInAdvanceRepayment = value;
    }

    /**
     * Gets the value of the recollectAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRecollectAmount() {
        return recollectAmount;
    }

    /**
     * Sets the value of the recollectAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRecollectAmount(BigDecimal value) {
        this.recollectAmount = value;
    }

}
