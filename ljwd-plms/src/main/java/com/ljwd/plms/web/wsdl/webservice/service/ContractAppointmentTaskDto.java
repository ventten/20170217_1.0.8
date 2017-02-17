
package com.ljwd.plms.web.wsdl.webservice.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for contractAppointmentTaskDto complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="contractAppointmentTaskDto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="detail" type="{http://webservice.loan.mfbms.flinkmf.com/}contractAppointmentDetailDto" minOccurs="0"/>
 *         &lt;element name="appoint" type="{http://webservice.loan.mfbms.flinkmf.com/}appointDto" minOccurs="0"/>
 *         &lt;element name="signSitoCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "contractAppointmentTaskDto", propOrder = {
    "detail",
    "appoint",
    "signSitoCode"
})
public class ContractAppointmentTaskDto {

    protected ContractAppointmentDetailDto detail;
    protected AppointDto appoint;
    protected String signSitoCode;

    /**
     * Gets the value of the detail property.
     * 
     * @return
     *     possible object is
     *     {@link ContractAppointmentDetailDto }
     *     
     */
    public ContractAppointmentDetailDto getDetail() {
        return detail;
    }

    /**
     * Sets the value of the detail property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContractAppointmentDetailDto }
     *     
     */
    public void setDetail(ContractAppointmentDetailDto value) {
        this.detail = value;
    }

    /**
     * Gets the value of the appoint property.
     * 
     * @return
     *     possible object is
     *     {@link AppointDto }
     *     
     */
    public AppointDto getAppoint() {
        return appoint;
    }

    /**
     * Sets the value of the appoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link AppointDto }
     *     
     */
    public void setAppoint(AppointDto value) {
        this.appoint = value;
    }

    /**
     * Gets the value of the signSitoCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSignSitoCode() {
        return signSitoCode;
    }

    /**
     * Sets the value of the signSitoCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSignSitoCode(String value) {
        this.signSitoCode = value;
    }

}
