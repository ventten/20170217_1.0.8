
package com.ljwd.plms.web.wsdl.webservice.service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for contractSearchResultDto complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="contractSearchResultDto">
 *   &lt;complexContent>
 *     &lt;extension base="{http://webservice.loan.mfbms.flinkmf.com/}baseEnquiryResultDto">
 *       &lt;sequence>
 *         &lt;element name="totalLoanAmt" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="records" type="{http://webservice.loan.mfbms.flinkmf.com/}contractSearchDto" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "contractSearchResultDto", propOrder = {
    "totalLoanAmt",
    "records"
})
public class ContractSearchResultDto
    extends BaseEnquiryResultDto
{

    protected BigDecimal totalLoanAmt;
    @XmlElement(nillable = true)
    protected List<ContractSearchDto> records;

    /**
     * Gets the value of the totalLoanAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalLoanAmt() {
        return totalLoanAmt;
    }

    /**
     * Sets the value of the totalLoanAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotalLoanAmt(BigDecimal value) {
        this.totalLoanAmt = value;
    }

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
     * {@link ContractSearchDto }
     * 
     * 
     */
    public List<ContractSearchDto> getRecords() {
        if (records == null) {
            records = new ArrayList<ContractSearchDto>();
        }
        return this.records;
    }

}
