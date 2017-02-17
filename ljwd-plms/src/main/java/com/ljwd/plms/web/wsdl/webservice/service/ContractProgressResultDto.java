
package com.ljwd.plms.web.wsdl.webservice.service;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for contractProgressResultDto complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="contractProgressResultDto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
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
@XmlType(name = "contractProgressResultDto", propOrder = {
    "progressRecords"
})
public class ContractProgressResultDto {

    @XmlElement(nillable = true)
    protected List<ApprovalProgressDto> progressRecords;

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
