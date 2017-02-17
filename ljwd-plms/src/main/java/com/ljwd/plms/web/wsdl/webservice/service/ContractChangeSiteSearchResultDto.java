
package com.ljwd.plms.web.wsdl.webservice.service;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for contractChangeSiteSearchResultDto complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="contractChangeSiteSearchResultDto">
 *   &lt;complexContent>
 *     &lt;extension base="{http://webservice.loan.mfbms.flinkmf.com/}baseEnquiryResultDto">
 *       &lt;sequence>
 *         &lt;element name="records" type="{http://webservice.loan.mfbms.flinkmf.com/}contractChangeSiteSearchDto" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="operatorSiteCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "contractChangeSiteSearchResultDto", propOrder = {
    "records",
    "operatorSiteCode"
})
public class ContractChangeSiteSearchResultDto
    extends BaseEnquiryResultDto
{

    @XmlElement(nillable = true)
    protected List<ContractChangeSiteSearchDto> records;
    protected String operatorSiteCode;

    /**
     * Gets the value of the records property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the records property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRecords().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ContractChangeSiteSearchDto }
     * 
     * 
     */
    public List<ContractChangeSiteSearchDto> getRecords() {
        if (records == null) {
            records = new ArrayList<ContractChangeSiteSearchDto>();
        }
        return this.records;
    }

    /**
     * Gets the value of the operatorSiteCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOperatorSiteCode() {
        return operatorSiteCode;
    }

    /**
     * Sets the value of the operatorSiteCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOperatorSiteCode(String value) {
        this.operatorSiteCode = value;
    }

}
