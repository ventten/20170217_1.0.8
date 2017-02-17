
package com.ljwd.plms.web.wsdl.webservice.service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for searchDebtTransferResultDto complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="searchDebtTransferResultDto">
 *   &lt;complexContent>
 *     &lt;extension base="{http://webservice.loan.mfbms.flinkmf.com/}baseEnquiryResultDto">
 *       &lt;sequence>
 *         &lt;element name="totalDebtAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="totalTransferAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="records" type="{http://webservice.loan.mfbms.flinkmf.com/}searchDebtTransferItemDto" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "searchDebtTransferResultDto", propOrder = {
    "totalDebtAmount",
    "totalTransferAmount",
    "records"
})
public class SearchDebtTransferResultDto
    extends BaseEnquiryResultDto
{

    protected BigDecimal totalDebtAmount;
    protected BigDecimal totalTransferAmount;
    @XmlElement(nillable = true)
    protected List<SearchDebtTransferItemDto> records;

    /**
     * Gets the value of the totalDebtAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalDebtAmount() {
        return totalDebtAmount;
    }

    /**
     * Sets the value of the totalDebtAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotalDebtAmount(BigDecimal value) {
        this.totalDebtAmount = value;
    }

    /**
     * Gets the value of the totalTransferAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalTransferAmount() {
        return totalTransferAmount;
    }

    /**
     * Sets the value of the totalTransferAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotalTransferAmount(BigDecimal value) {
        this.totalTransferAmount = value;
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
     * {@link SearchDebtTransferItemDto }
     * 
     * 
     */
    public List<SearchDebtTransferItemDto> getRecords() {
        if (records == null) {
            records = new ArrayList<SearchDebtTransferItemDto>();
        }
        return this.records;
    }

}
