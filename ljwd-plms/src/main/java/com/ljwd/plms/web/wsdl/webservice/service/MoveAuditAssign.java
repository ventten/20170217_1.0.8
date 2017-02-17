
package com.ljwd.plms.web.wsdl.webservice.service;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for moveAuditAssign complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="moveAuditAssign">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="auditAssigns" type="{http://webservice.loan.mfbms.flinkmf.com/}auditAssignDto" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "moveAuditAssign", propOrder = {
    "auditAssigns"
})
public class MoveAuditAssign {

    protected List<AuditAssignDto> auditAssigns;

    /**
     * Gets the value of the auditAssigns property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the auditAssigns property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAuditAssigns().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AuditAssignDto }
     * 
     * 
     */
    public List<AuditAssignDto> getAuditAssigns() {
        if (auditAssigns == null) {
            auditAssigns = new ArrayList<AuditAssignDto>();
        }
        return this.auditAssigns;
    }

}
