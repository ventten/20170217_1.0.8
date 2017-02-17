
package com.ljwd.plms.web.wsdl.webservice.service;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for applicationInfoApprovalProgressResultDto complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="applicationInfoApprovalProgressResultDto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="latestApprovalInfo" type="{http://webservice.loan.mfbms.flinkmf.com/}taskInfoDto" minOccurs="0"/>
 *         &lt;element name="progressRecords" type="{http://webservice.loan.mfbms.flinkmf.com/}approvalProgressDto" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "applicationInfoApprovalProgressResultDto", propOrder = {
    "latestApprovalInfo",
    "progressRecords"
})
public class ApplicationInfoApprovalProgressResultDto {

    protected TaskInfoDto latestApprovalInfo;
    @XmlElement(nillable = true)
    protected List<ApprovalProgressDto> progressRecords;

    /**
     * Gets the value of the latestApprovalInfo property.
     * 
     * @return
     *     possible object is
     *     {@link TaskInfoDto }
     *     
     */
    public TaskInfoDto getLatestApprovalInfo() {
        return latestApprovalInfo;
    }

    /**
     * Sets the value of the latestApprovalInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaskInfoDto }
     *     
     */
    public void setLatestApprovalInfo(TaskInfoDto value) {
        this.latestApprovalInfo = value;
    }

    /**
     * Gets the value of the progressRecords property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the progressRecords property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProgressRecords().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ApprovalProgressDto }
     * 
     * 
     */
    public List<ApprovalProgressDto> getProgressRecords() {
        if (progressRecords == null) {
            progressRecords = new ArrayList<ApprovalProgressDto>();
        }
        return this.progressRecords;
    }

}
