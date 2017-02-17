
package com.ljwd.plms.web.wsdl.webservice.channelService;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for baseEnquiryResultDto complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="baseEnquiryResultDto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *       &lt;/sequence>
 *       &lt;attribute name="totalNoOfRecords" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "baseEnquiryResultDto")
@XmlSeeAlso({
    SiteSearchResultDto.class,
    CompanyCustomerInfoSearchResultDto.class
})
public abstract class BaseEnquiryResultDto {

    @XmlAttribute(name = "totalNoOfRecords", required = true)
    protected int totalNoOfRecords;

    /**
     * Gets the value of the totalNoOfRecords property.
     * 
     */
    public int getTotalNoOfRecords() {
        return totalNoOfRecords;
    }

    /**
     * Sets the value of the totalNoOfRecords property.
     * 
     */
    public void setTotalNoOfRecords(int value) {
        this.totalNoOfRecords = value;
    }

}
