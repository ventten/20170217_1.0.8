
package com.ljwd.plms.web.wsdl.webservice.service;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for updateApplyAssign complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="updateApplyAssign">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="applyAssignList" type="{http://webservice.loan.mfbms.flinkmf.com/}applicationInfoAssignDto" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "updateApplyAssign", propOrder = {
    "applyAssignList"
})
public class UpdateApplyAssign {

    protected List<ApplicationInfoAssignDto> applyAssignList;

    /**
     * Gets the value of the applyAssignList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the applyAssignList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getApplyAssignList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ApplicationInfoAssignDto }
     * 
     * 
     */
    public List<ApplicationInfoAssignDto> getApplyAssignList() {
        if (applyAssignList == null) {
            applyAssignList = new ArrayList<ApplicationInfoAssignDto>();
        }
        return this.applyAssignList;
    }

}
