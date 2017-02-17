
package com.ljwd.plms.web.wsdl.webservice.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for applRecordInfoResultDto complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="applRecordInfoResultDto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *       &lt;/sequence>
 *       &lt;attribute name="applid" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="status" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="policyscore" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="resultname" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="resultscore" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "applRecordInfoResultDto")
public class ApplRecordInfoResultDto {

    @XmlAttribute(name = "applid")
    protected Long applid;
    @XmlAttribute(name = "status")
    protected String status;
    @XmlAttribute(name = "policyscore")
    protected String policyscore;
    @XmlAttribute(name = "resultname")
    protected String resultname;
    @XmlAttribute(name = "resultscore")
    protected String resultscore;

    /**
     * Gets the value of the applid property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getApplid() {
        return applid;
    }

    /**
     * Sets the value of the applid property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setApplid(Long value) {
        this.applid = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

    /**
     * Gets the value of the policyscore property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPolicyscore() {
        return policyscore;
    }

    /**
     * Sets the value of the policyscore property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPolicyscore(String value) {
        this.policyscore = value;
    }

    /**
     * Gets the value of the resultname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResultname() {
        return resultname;
    }

    /**
     * Sets the value of the resultname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResultname(String value) {
        this.resultname = value;
    }

    /**
     * Gets the value of the resultscore property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResultscore() {
        return resultscore;
    }

    /**
     * Sets the value of the resultscore property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResultscore(String value) {
        this.resultscore = value;
    }

}
