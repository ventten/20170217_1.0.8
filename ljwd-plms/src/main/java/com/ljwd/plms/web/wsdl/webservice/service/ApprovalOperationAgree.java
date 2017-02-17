
package com.ljwd.plms.web.wsdl.webservice.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for approvalOperationAgree complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="approvalOperationAgree">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="applicationInfoId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="signingNotes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="taskInfoParam" type="{http://webservice.loan.mfbms.flinkmf.com/}taskInfoDto" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "approvalOperationAgree", propOrder = {
    "applicationInfoId",
    "signingNotes",
    "taskInfoParam"
})
public class ApprovalOperationAgree {

    protected long applicationInfoId;
    protected String signingNotes;
    protected TaskInfoDto taskInfoParam;

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
     * Gets the value of the signingNotes property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSigningNotes() {
        return signingNotes;
    }

    /**
     * Sets the value of the signingNotes property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSigningNotes(String value) {
        this.signingNotes = value;
    }

    /**
     * Gets the value of the taskInfoParam property.
     * 
     * @return
     *     possible object is
     *     {@link TaskInfoDto }
     *     
     */
    public TaskInfoDto getTaskInfoParam() {
        return taskInfoParam;
    }

    /**
     * Sets the value of the taskInfoParam property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaskInfoDto }
     *     
     */
    public void setTaskInfoParam(TaskInfoDto value) {
        this.taskInfoParam = value;
    }

}
