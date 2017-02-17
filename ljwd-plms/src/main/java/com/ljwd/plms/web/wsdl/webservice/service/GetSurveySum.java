
package com.ljwd.plms.web.wsdl.webservice.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getSurveySum complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getSurveySum">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="applyId" type="{http://www.w3.org/2001/XMLSchema}long"/>
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
@XmlType(name = "getSurveySum", propOrder = {
    "applyId",
    "taskInfoId"
})
public class GetSurveySum {

    protected long applyId;
    protected long taskInfoId;

    /**
     * Gets the value of the applyId property.
     * 
     */
    public long getApplyId() {
        return applyId;
    }

    /**
     * Sets the value of the applyId property.
     * 
     */
    public void setApplyId(long value) {
        this.applyId = value;
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
