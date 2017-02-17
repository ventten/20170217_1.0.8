
package com.ljwd.plms.web.wsdl.webservice.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for suspendTaskDto complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="suspendTaskDto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *       &lt;/sequence>
 *       &lt;attribute name="taskId" use="required" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="taskVersionId" use="required" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="applicationId" use="required" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="suspendReason" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "suspendTaskDto")
public class SuspendTaskDto {

    @XmlAttribute(name = "taskId", required = true)
    protected long taskId;
    @XmlAttribute(name = "taskVersionId", required = true)
    protected long taskVersionId;
    @XmlAttribute(name = "applicationId", required = true)
    protected long applicationId;
    @XmlAttribute(name = "suspendReason")
    protected String suspendReason;

    /**
     * Gets the value of the taskId property.
     * 
     */
    public long getTaskId() {
        return taskId;
    }

    /**
     * Sets the value of the taskId property.
     * 
     */
    public void setTaskId(long value) {
        this.taskId = value;
    }

    /**
     * Gets the value of the taskVersionId property.
     * 
     */
    public long getTaskVersionId() {
        return taskVersionId;
    }

    /**
     * Sets the value of the taskVersionId property.
     * 
     */
    public void setTaskVersionId(long value) {
        this.taskVersionId = value;
    }

    /**
     * Gets the value of the applicationId property.
     * 
     */
    public long getApplicationId() {
        return applicationId;
    }

    /**
     * Sets the value of the applicationId property.
     * 
     */
    public void setApplicationId(long value) {
        this.applicationId = value;
    }

    /**
     * Gets the value of the suspendReason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSuspendReason() {
        return suspendReason;
    }

    /**
     * Sets the value of the suspendReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSuspendReason(String value) {
        this.suspendReason = value;
    }

}
