
package com.ljwd.plms.web.wsdl.webservice.service;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for addCollectAgent complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="addCollectAgent">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="agentParamDto" type="{http://webservice.loan.mfbms.flinkmf.com/}collectAgentParamDto" minOccurs="0"/>
 *         &lt;element name="overDueParams" type="{http://webservice.loan.mfbms.flinkmf.com/}searchReceiveOverdueParamDto" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "addCollectAgent", propOrder = {
    "agentParamDto",
    "overDueParams"
})
public class AddCollectAgent {

    protected CollectAgentParamDto agentParamDto;
    protected List<SearchReceiveOverdueParamDto> overDueParams;

    /**
     * Gets the value of the agentParamDto property.
     * 
     * @return
     *     possible object is
     *     {@link CollectAgentParamDto }
     *     
     */
    public CollectAgentParamDto getAgentParamDto() {
        return agentParamDto;
    }

    /**
     * Sets the value of the agentParamDto property.
     * 
     * @param value
     *     allowed object is
     *     {@link CollectAgentParamDto }
     *     
     */
    public void setAgentParamDto(CollectAgentParamDto value) {
        this.agentParamDto = value;
    }

    /**
     * Gets the value of the overDueParams property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the overDueParams property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOverDueParams().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchReceiveOverdueParamDto }
     * 
     * 
     */
    public List<SearchReceiveOverdueParamDto> getOverDueParams() {
        if (overDueParams == null) {
            overDueParams = new ArrayList<SearchReceiveOverdueParamDto>();
        }
        return this.overDueParams;
    }

}
