
package com.ljwd.plms.web.wsdl.webservice.service;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for resendOfferAgreementGeneration complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="resendOfferAgreementGeneration">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dtos" type="{http://webservice.loan.mfbms.flinkmf.com/}offerAgreementDto" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "resendOfferAgreementGeneration", propOrder = {
    "dtos"
})
public class ResendOfferAgreementGeneration {

    protected List<OfferAgreementDto> dtos;

    /**
     * Gets the value of the dtos property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dtos property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDtos().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OfferAgreementDto }
     * 
     * 
     */
    public List<OfferAgreementDto> getDtos() {
        if (dtos == null) {
            dtos = new ArrayList<OfferAgreementDto>();
        }
        return this.dtos;
    }

}
