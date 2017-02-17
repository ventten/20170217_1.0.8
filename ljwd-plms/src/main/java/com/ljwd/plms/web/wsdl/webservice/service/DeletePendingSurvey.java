
package com.ljwd.plms.web.wsdl.webservice.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for deletePendingSurvey complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="deletePendingSurvey">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="pendingSurveyId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "deletePendingSurvey", propOrder = {
    "pendingSurveyId"
})
public class DeletePendingSurvey {

    protected long pendingSurveyId;

    /**
     * Gets the value of the pendingSurveyId property.
     * 
     */
    public long getPendingSurveyId() {
        return pendingSurveyId;
    }

    /**
     * Sets the value of the pendingSurveyId property.
     * 
     */
    public void setPendingSurveyId(long value) {
        this.pendingSurveyId = value;
    }

}
