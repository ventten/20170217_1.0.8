
package com.ljwd.plms.web.wsdl.webservice.service;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for applicationInfoSearchResultDto complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="applicationInfoSearchResultDto">
 *   &lt;complexContent>
 *     &lt;extension base="{http://webservice.loan.mfbms.flinkmf.com/}baseEnquiryResultDto">
 *       &lt;sequence>
 *         &lt;element name="records" type="{http://webservice.loan.mfbms.flinkmf.com/}applicationInfoSearchDto" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "applicationInfoSearchResultDto", propOrder = {
    "records"
})
public class ApplicationInfoSearchResultDto
    extends BaseEnquiryResultDto
{

    @XmlElement(nillable = true)
    protected List<ApplicationInfoSearchDto> records;

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
     * {@link ApplicationInfoSearchDto }
     * 
     * 
     */
    public List<ApplicationInfoSearchDto> getRecords() {
        if (records == null) {
            records = new ArrayList<ApplicationInfoSearchDto>();
        }
        return this.records;
    }

}
