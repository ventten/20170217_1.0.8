
package com.ljwd.plms.web.wsdl.webservice.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for auditInvestigateAssignSumDto complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="auditInvestigateAssignSumDto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *       &lt;/sequence>
 *       &lt;attribute name="userid" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="username" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="sumauditor" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="dayauditor" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "auditInvestigateAssignSumDto")
public class AuditInvestigateAssignSumDto {

    @XmlAttribute(name = "userid")
    protected String userid;
    @XmlAttribute(name = "username")
    protected String username;
    @XmlAttribute(name = "sumauditor")
    protected String sumauditor;
    @XmlAttribute(name = "dayauditor")
    protected String dayauditor;

    /**
     * Gets the value of the userid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserid() {
        return userid;
    }

    /**
     * Sets the value of the userid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserid(String value) {
        this.userid = value;
    }

    /**
     * Gets the value of the username property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsername() {
        return username;
    }

    /**
     * Sets the value of the username property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsername(String value) {
        this.username = value;
    }

    /**
     * Gets the value of the sumauditor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSumauditor() {
        return sumauditor;
    }

    /**
     * Sets the value of the sumauditor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSumauditor(String value) {
        this.sumauditor = value;
    }

    /**
     * Gets the value of the dayauditor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDayauditor() {
        return dayauditor;
    }

    /**
     * Sets the value of the dayauditor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDayauditor(String value) {
        this.dayauditor = value;
    }

}
