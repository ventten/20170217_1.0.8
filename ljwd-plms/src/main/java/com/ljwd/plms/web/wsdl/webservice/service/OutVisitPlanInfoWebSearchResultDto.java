
package com.ljwd.plms.web.wsdl.webservice.service;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for outVisitPlanInfoWebSearchResultDto complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="outVisitPlanInfoWebSearchResultDto">
 *   &lt;complexContent>
 *     &lt;extension base="{http://webservice.loan.mfbms.flinkmf.com/}baseEnquiryResultDto">
 *       &lt;sequence>
 *         &lt;element name="records" type="{http://webservice.loan.mfbms.flinkmf.com/}outVisitPlanInfoWebSearchDto" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "outVisitPlanInfoWebSearchResultDto", propOrder = {
    "records"
})
public class OutVisitPlanInfoWebSearchResultDto
    extends BaseEnquiryResultDto
{

    @XmlElement(nillable = true)
    protected List<OutVisitPlanInfoWebSearchDto> records;

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
     * {@link OutVisitPlanInfoWebSearchDto }
     * 
     * 
     */
    public List<OutVisitPlanInfoWebSearchDto> getRecords() {
        if (records == null) {
            records = new ArrayList<OutVisitPlanInfoWebSearchDto>();
        }
        return this.records;
    }

}
