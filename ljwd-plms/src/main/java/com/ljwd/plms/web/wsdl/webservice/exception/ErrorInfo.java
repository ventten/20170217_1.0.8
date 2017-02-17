
package com.ljwd.plms.web.wsdl.webservice.exception;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for errorInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="errorInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="errorCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="errorLevel" type="{http://webservice.loan.mfbms.flinkmf.com/}errorLevel" minOccurs="0"/>
 *         &lt;element name="errorLocation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="errorParams" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "errorInfo", propOrder = {
    "errorCode",
    "errorLevel",
    "errorLocation",
    "errorParams"
})
public class ErrorInfo {

    protected String errorCode;
    protected ErrorLevel errorLevel;
    protected String errorLocation;
    @XmlElement(nillable = true)
    protected List<String> errorParams;

    /**
     * Gets the value of the errorCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrorCode() {
        return errorCode;
    }

    /**
     * Sets the value of the errorCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErrorCode(String value) {
        this.errorCode = value;
    }

    /**
     * Gets the value of the errorLevel property.
     * 
     * @return
     *     possible object is
     *     {@link com.ljwd.plms.web.wsdl.webservice.channelService.ErrorLevel }
     *
     */
    public ErrorLevel getErrorLevel() {
        return errorLevel;
    }

    /**
     * Sets the value of the errorLevel property.
     *
     * @param value
     *     allowed object is
     *     {@link com.ljwd.plms.web.wsdl.webservice.channelService.ErrorLevel }
     *     
     */
    public void setErrorLevel(ErrorLevel value) {
        this.errorLevel = value;
    }

    /**
     * Gets the value of the errorLocation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrorLocation() {
        return errorLocation;
    }

    /**
     * Sets the value of the errorLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErrorLocation(String value) {
        this.errorLocation = value;
    }

    /**
     * Gets the value of the errorParams property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the errorParams property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getErrorParams().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getErrorParams() {
        if (errorParams == null) {
            errorParams = new ArrayList<String>();
        }
        return this.errorParams;
    }

}
