
package com.ljwd.plms.web.wsdl.webservice.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getMaterialByApplyId complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getMaterialByApplyId">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="applicationInfoId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getMaterialByApplyId", propOrder = {
    "applicationInfoId"
})
public class GetMaterialByApplyId {

    protected long applicationInfoId;

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

}
