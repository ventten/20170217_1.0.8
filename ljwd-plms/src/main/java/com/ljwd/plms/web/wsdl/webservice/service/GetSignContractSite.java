
package com.ljwd.plms.web.wsdl.webservice.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getSignContractSite complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getSignContractSite">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="applicationInfoId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="taskInfoId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getSignContractSite", propOrder = {
    "applicationInfoId",
    "taskInfoId"
})
public class GetSignContractSite {

    protected long applicationInfoId;
    protected long taskInfoId;

    /**
     * Gets the value of the applicationInfoId property.
     * 
     */
    public long getApplicationInfoId() {
        return applicationInfoId;
    }

    /**
     * Sets the value of the applicationInfoId property.
     * 
     */
    public void setApplicationInfoId(long value) {
        this.applicationInfoId = value;
    }

    /**
     * Gets the value of the taskInfoId property.
     * 
     */
    public long getTaskInfoId() {
        return taskInfoId;
    }

    /**
     * Sets the value of the taskInfoId property.
     * 
     */
    public void setTaskInfoId(long value) {
        this.taskInfoId = value;
    }

}
