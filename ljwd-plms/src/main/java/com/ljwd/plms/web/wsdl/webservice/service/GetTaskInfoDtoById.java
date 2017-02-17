
package com.ljwd.plms.web.wsdl.webservice.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getTaskInfoDtoById complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getTaskInfoDtoById">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
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
@XmlType(name = "getTaskInfoDtoById", propOrder = {
    "taskInfoId"
})
public class GetTaskInfoDtoById {

    protected long taskInfoId;

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
