
package com.ljwd.plms.web.wsdl.webservice.service;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for batchApplRepaymentDetailResultDto complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="batchApplRepaymentDetailResultDto">
 *   &lt;complexContent>
 *     &lt;extension base="{http://webservice.loan.mfbms.flinkmf.com/}baseEnquiryResultDto">
 *       &lt;sequence>
 *         &lt;element name="records" type="{http://webservice.loan.mfbms.flinkmf.com/}offerBatchDetailDto" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "batchApplRepaymentDetailResultDto", propOrder = {
    "records"
})
public class BatchApplRepaymentDetailResultDto
    extends BaseEnquiryResultDto
{

    @XmlElement(nillable = true)
    protected List<OfferBatchDetailDto> records;

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
     * {@link OfferBatchDetailDto }
     * 
     * 
     */
    public List<OfferBatchDetailDto> getRecords() {
        if (records == null) {
            records = new ArrayList<OfferBatchDetailDto>();
        }
        return this.records;
    }

}
