
package com.ljwd.plms.web.wsdl.webservice.service;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for deleteApplicationOutsource complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="deleteApplicationOutsource">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="applicationOutsources" type="{http://webservice.loan.mfbms.flinkmf.com/}applicationOutsourceDto" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "deleteApplicationOutsource", propOrder = {
    "applicationOutsources"
})
public class DeleteApplicationOutsource {

    protected List<ApplicationOutsourceDto> applicationOutsources;

    /**
     * Gets the value of the applicationOutsources property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the applicationOutsources property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getApplicationOutsources().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ApplicationOutsourceDto }
     * 
     * 
     */
    public List<ApplicationOutsourceDto> getApplicationOutsources() {
        if (applicationOutsources == null) {
            applicationOutsources = new ArrayList<ApplicationOutsourceDto>();
        }
        return this.applicationOutsources;
    }

}
