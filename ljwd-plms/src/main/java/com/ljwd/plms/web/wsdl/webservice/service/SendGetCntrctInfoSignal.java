
package com.ljwd.plms.web.wsdl.webservice.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for sendGetCntrctInfoSignal complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="sendGetCntrctInfoSignal">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="applicationInfoDto" type="{http://webservice.loan.mfbms.flinkmf.com/}applicationInfoDto" minOccurs="0"/>
 *         &lt;element name="cntrctNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="contrctId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "sendGetCntrctInfoSignal", propOrder = {
    "applicationInfoDto",
    "cntrctNo",
    "contrctId"
})
public class SendGetCntrctInfoSignal {

    protected ApplicationInfoDto applicationInfoDto;
    protected String cntrctNo;
    protected Long contrctId;

    /**
     * Gets the value of the applicationInfoDto property.
     * 
     * @return
     *     possible object is
     *     {@link ApplicationInfoDto }
     *     
     */
    public ApplicationInfoDto getApplicationInfoDto() {
        return applicationInfoDto;
    }

    /**
     * Sets the value of the applicationInfoDto property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApplicationInfoDto }
     *     
     */
    public void setApplicationInfoDto(ApplicationInfoDto value) {
        this.applicationInfoDto = value;
    }

    /**
     * Gets the value of the cntrctNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCntrctNo() {
        return cntrctNo;
    }

    /**
     * Sets the value of the cntrctNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCntrctNo(String value) {
        this.cntrctNo = value;
    }

    /**
     * Gets the value of the contrctId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getContrctId() {
        return contrctId;
    }

    /**
     * Sets the value of the contrctId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setContrctId(Long value) {
        this.contrctId = value;
    }

}
