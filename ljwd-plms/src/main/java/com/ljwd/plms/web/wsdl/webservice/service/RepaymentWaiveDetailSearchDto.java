
package com.ljwd.plms.web.wsdl.webservice.service;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for repaymentWaiveDetailSearchDto complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="repaymentWaiveDetailSearchDto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="details" type="{http://webservice.loan.mfbms.flinkmf.com/}repaymentWaiveDetailDto" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="receivableDto" type="{http://webservice.loan.mfbms.flinkmf.com/}receivableDto" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "repaymentWaiveDetailSearchDto", propOrder = {
    "details",
    "receivableDto"
})
public class RepaymentWaiveDetailSearchDto {

    @XmlElement(nillable = true)
    protected List<RepaymentWaiveDetailDto> details;
    protected ReceivableDto receivableDto;

    /**
     * Gets the value of the details property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the details property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RepaymentWaiveDetailDto }
     * 
     * 
     */
    public List<RepaymentWaiveDetailDto> getDetails() {
        if (details == null) {
            details = new ArrayList<RepaymentWaiveDetailDto>();
        }
        return this.details;
    }

    /**
     * Gets the value of the receivableDto property.
     * 
     * @return
     *     possible object is
     *     {@link ReceivableDto }
     *     
     */
    public ReceivableDto getReceivableDto() {
        return receivableDto;
    }

    /**
     * Sets the value of the receivableDto property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReceivableDto }
     *     
     */
    public void setReceivableDto(ReceivableDto value) {
        this.receivableDto = value;
    }

}
