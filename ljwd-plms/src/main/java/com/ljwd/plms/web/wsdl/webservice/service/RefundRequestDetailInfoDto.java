
package com.ljwd.plms.web.wsdl.webservice.service;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for refundRequestDetailInfoDto complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="refundRequestDetailInfoDto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="refundRequestDto" type="{http://webservice.loan.mfbms.flinkmf.com/}refundRequestDto" minOccurs="0"/>
 *         &lt;element name="applyInfo" type="{http://webservice.loan.mfbms.flinkmf.com/}refundRequestApplicationInfoDto" minOccurs="0"/>
 *         &lt;element name="requestLogs" type="{http://webservice.loan.mfbms.flinkmf.com/}requestLogDto" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "refundRequestDetailInfoDto", propOrder = {
    "refundRequestDto",
    "applyInfo",
    "requestLogs"
})
public class RefundRequestDetailInfoDto {

    protected RefundRequestDto refundRequestDto;
    protected RefundRequestApplicationInfoDto applyInfo;
    @XmlElement(nillable = true)
    protected List<RequestLogDto> requestLogs;

    /**
     * Gets the value of the refundRequestDto property.
     * 
     * @return
     *     possible object is
     *     {@link RefundRequestDto }
     *     
     */
    public RefundRequestDto getRefundRequestDto() {
        return refundRequestDto;
    }

    /**
     * Sets the value of the refundRequestDto property.
     * 
     * @param value
     *     allowed object is
     *     {@link RefundRequestDto }
     *     
     */
    public void setRefundRequestDto(RefundRequestDto value) {
        this.refundRequestDto = value;
    }

    /**
     * Gets the value of the applyInfo property.
     * 
     * @return
     *     possible object is
     *     {@link RefundRequestApplicationInfoDto }
     *     
     */
    public RefundRequestApplicationInfoDto getApplyInfo() {
        return applyInfo;
    }

    /**
     * Sets the value of the applyInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link RefundRequestApplicationInfoDto }
     *     
     */
    public void setApplyInfo(RefundRequestApplicationInfoDto value) {
        this.applyInfo = value;
    }

    /**
     * Gets the value of the requestLogs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the requestLogs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRequestLogs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RequestLogDto }
     * 
     * 
     */
    public List<RequestLogDto> getRequestLogs() {
        if (requestLogs == null) {
            requestLogs = new ArrayList<RequestLogDto>();
        }
        return this.requestLogs;
    }

}
