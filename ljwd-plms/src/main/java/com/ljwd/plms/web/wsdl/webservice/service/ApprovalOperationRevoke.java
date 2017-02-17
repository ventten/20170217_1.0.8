
package com.ljwd.plms.web.wsdl.webservice.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for approvalOperationRevoke complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="approvalOperationRevoke">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="applicationInfoId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="revokeReason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "approvalOperationRevoke", propOrder = {
    "applicationInfoId",
    "revokeReason"
})
public class ApprovalOperationRevoke {

    protected long applicationInfoId;
    protected String revokeReason;

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
     * Gets the value of the revokeReason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRevokeReason() {
        return revokeReason;
    }

    /**
     * Sets the value of the revokeReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRevokeReason(String value) {
        this.revokeReason = value;
    }

}
