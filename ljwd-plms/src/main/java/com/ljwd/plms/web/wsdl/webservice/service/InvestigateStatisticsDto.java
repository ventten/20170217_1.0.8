
package com.ljwd.plms.web.wsdl.webservice.service;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for investigateStatisticsDto complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="investigateStatisticsDto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *       &lt;/sequence>
 *       &lt;attribute name="userId" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="handleByUser" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="orgName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="totalDuration" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       &lt;attribute name="timeOutSingle" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       &lt;attribute name="timeOutSingle2" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "investigateStatisticsDto")
public class InvestigateStatisticsDto {

    @XmlAttribute(name = "userId")
    protected String userId;
    @XmlAttribute(name = "handleByUser")
    protected String handleByUser;
    @XmlAttribute(name = "orgName")
    protected String orgName;
    @XmlAttribute(name = "totalDuration")
    protected BigDecimal totalDuration;
    @XmlAttribute(name = "timeOutSingle")
    protected BigDecimal timeOutSingle;
    @XmlAttribute(name = "timeOutSingle2")
    protected BigDecimal timeOutSingle2;

    /**
     * Gets the value of the userId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserId() {
        return userId;
    }

    /**
     * Sets the value of the userId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserId(String value) {
        this.userId = value;
    }

    /**
     * Gets the value of the handleByUser property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHandleByUser() {
        return handleByUser;
    }

    /**
     * Sets the value of the handleByUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHandleByUser(String value) {
        this.handleByUser = value;
    }

    /**
     * Gets the value of the orgName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrgName() {
        return orgName;
    }

    /**
     * Sets the value of the orgName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrgName(String value) {
        this.orgName = value;
    }

    /**
     * Gets the value of the totalDuration property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalDuration() {
        return totalDuration;
    }

    /**
     * Sets the value of the totalDuration property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotalDuration(BigDecimal value) {
        this.totalDuration = value;
    }

    /**
     * Gets the value of the timeOutSingle property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTimeOutSingle() {
        return timeOutSingle;
    }

    /**
     * Sets the value of the timeOutSingle property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTimeOutSingle(BigDecimal value) {
        this.timeOutSingle = value;
    }

    /**
     * Gets the value of the timeOutSingle2 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTimeOutSingle2() {
        return timeOutSingle2;
    }

    /**
     * Sets the value of the timeOutSingle2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTimeOutSingle2(BigDecimal value) {
        this.timeOutSingle2 = value;
    }

}
