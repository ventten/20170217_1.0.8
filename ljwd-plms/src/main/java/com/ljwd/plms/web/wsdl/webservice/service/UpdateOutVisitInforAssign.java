
package com.ljwd.plms.web.wsdl.webservice.service;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for updateOutVisitInforAssign complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="updateOutVisitInforAssign">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="param1" type="{http://webservice.loan.mfbms.flinkmf.com/}outVisitInfoDto" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="param2" type="{http://webservice.loan.mfbms.flinkmf.com/}outVisitSettingParamDto" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="mode" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "updateOutVisitInforAssign", propOrder = {
    "param1",
    "param2",
    "mode"
})
public class UpdateOutVisitInforAssign {

    protected List<OutVisitInfoDto> param1;
    protected List<OutVisitSettingParamDto> param2;
    protected Long mode;

    /**
     * Gets the value of the param1 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the param1 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getParam1().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OutVisitInfoDto }
     * 
     * 
     */
    public List<OutVisitInfoDto> getParam1() {
        if (param1 == null) {
            param1 = new ArrayList<OutVisitInfoDto>();
        }
        return this.param1;
    }

    /**
     * Gets the value of the param2 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the param2 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getParam2().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OutVisitSettingParamDto }
     * 
     * 
     */
    public List<OutVisitSettingParamDto> getParam2() {
        if (param2 == null) {
            param2 = new ArrayList<OutVisitSettingParamDto>();
        }
        return this.param2;
    }

    /**
     * Gets the value of the mode property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMode() {
        return mode;
    }

    /**
     * Sets the value of the mode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMode(Long value) {
        this.mode = value;
    }

}
