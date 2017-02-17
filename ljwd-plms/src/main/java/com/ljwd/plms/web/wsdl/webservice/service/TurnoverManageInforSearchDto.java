
package com.ljwd.plms.web.wsdl.webservice.service;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for turnoverManageInforSearchDto complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="turnoverManageInforSearchDto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *       &lt;/sequence>
 *       &lt;attribute name="turnoverCardno" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="abstractAll" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="turnoverType" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="bankname" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="bankNameMark" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="statisticsMonth" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="turnoverMonthWY" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       &lt;attribute name="turnoverMaxMonthWY" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       &lt;attribute name="turnoverMinMonthWY" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       &lt;attribute name="stabilityDegree" type="{http://www.w3.org/2001/XMLSchema}double" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "turnoverManageInforSearchDto")
public class TurnoverManageInforSearchDto {

    @XmlAttribute(name = "turnoverCardno")
    protected String turnoverCardno;
    @XmlAttribute(name = "abstractAll")
    protected String abstractAll;
    @XmlAttribute(name = "turnoverType")
    protected String turnoverType;
    @XmlAttribute(name = "bankname")
    protected String bankname;
    @XmlAttribute(name = "bankNameMark")
    protected String bankNameMark;
    @XmlAttribute(name = "statisticsMonth")
    protected Long statisticsMonth;
    @XmlAttribute(name = "turnoverMonthWY")
    protected BigDecimal turnoverMonthWY;
    @XmlAttribute(name = "turnoverMaxMonthWY")
    protected BigDecimal turnoverMaxMonthWY;
    @XmlAttribute(name = "turnoverMinMonthWY")
    protected BigDecimal turnoverMinMonthWY;
    @XmlAttribute(name = "stabilityDegree")
    protected Double stabilityDegree;

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
     * Gets the value of the abstractAll property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAbstractAll() {
        return abstractAll;
    }

    /**
     * Sets the value of the abstractAll property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAbstractAll(String value) {
        this.abstractAll = value;
    }

    /**
     * Gets the value of the turnoverType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTurnoverType() {
        return turnoverType;
    }

    /**
     * Sets the value of the turnoverType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTurnoverType(String value) {
        this.turnoverType = value;
    }

    /**
     * Gets the value of the bankname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBankname() {
        return bankname;
    }

    /**
     * Sets the value of the bankname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBankname(String value) {
        this.bankname = value;
    }

    /**
     * Gets the value of the bankNameMark property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBankNameMark() {
        return bankNameMark;
    }

    /**
     * Sets the value of the bankNameMark property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBankNameMark(String value) {
        this.bankNameMark = value;
    }

    /**
     * Gets the value of the statisticsMonth property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getStatisticsMonth() {
        return statisticsMonth;
    }

    /**
     * Sets the value of the statisticsMonth property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setStatisticsMonth(Long value) {
        this.statisticsMonth = value;
    }

    /**
     * Gets the value of the turnoverMonthWY property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTurnoverMonthWY() {
        return turnoverMonthWY;
    }

    /**
     * Sets the value of the turnoverMonthWY property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTurnoverMonthWY(BigDecimal value) {
        this.turnoverMonthWY = value;
    }

    /**
     * Gets the value of the turnoverMaxMonthWY property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTurnoverMaxMonthWY() {
        return turnoverMaxMonthWY;
    }

    /**
     * Sets the value of the turnoverMaxMonthWY property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTurnoverMaxMonthWY(BigDecimal value) {
        this.turnoverMaxMonthWY = value;
    }

    /**
     * Gets the value of the turnoverMinMonthWY property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTurnoverMinMonthWY() {
        return turnoverMinMonthWY;
    }

    /**
     * Sets the value of the turnoverMinMonthWY property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTurnoverMinMonthWY(BigDecimal value) {
        this.turnoverMinMonthWY = value;
    }

    /**
     * Gets the value of the stabilityDegree property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getStabilityDegree() {
        return stabilityDegree;
    }

    /**
     * Sets the value of the stabilityDegree property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setStabilityDegree(Double value) {
        this.stabilityDegree = value;
    }

}
