
package com.ljwd.plms.web.wsdl.webservice.service;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for collectAssignParamDto complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="collectAssignParamDto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="overDueReceivables" type="{http://webservice.loan.mfbms.flinkmf.com/}searchReceiveOverdueParamDto" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="collectors" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="assignMethod" type="{http://webservice.loan.mfbms.flinkmf.com/}collectAssignMethod" />
 *       &lt;attribute name="collector" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "collectAssignParamDto", propOrder = {
    "overDueReceivables",
    "collectors"
})
public class CollectAssignParamDto {

    @XmlElement(nillable = true)
    protected List<SearchReceiveOverdueParamDto> overDueReceivables;
    @XmlElement(nillable = true)
    protected List<String> collectors;
    @XmlAttribute(name = "assignMethod")
    protected CollectAssignMethod assignMethod;
    @XmlAttribute(name = "collector")
    protected String collector;

    /**
     * Gets the value of the overDueReceivables property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the overDueReceivables property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOverDueReceivables().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchReceiveOverdueParamDto }
     * 
     * 
     */
    public List<SearchReceiveOverdueParamDto> getOverDueReceivables() {
        if (overDueReceivables == null) {
            overDueReceivables = new ArrayList<SearchReceiveOverdueParamDto>();
        }
        return this.overDueReceivables;
    }

    /**
     * Gets the value of the collectors property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the collectors property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCollectors().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getCollectors() {
        if (collectors == null) {
            collectors = new ArrayList<String>();
        }
        return this.collectors;
    }

    /**
     * Gets the value of the assignMethod property.
     * 
     * @return
     *     possible object is
     *     {@link CollectAssignMethod }
     *     
     */
    public CollectAssignMethod getAssignMethod() {
        return assignMethod;
    }

    /**
     * Sets the value of the assignMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link CollectAssignMethod }
     *     
     */
    public void setAssignMethod(CollectAssignMethod value) {
        this.assignMethod = value;
    }

    /**
     * Gets the value of the collector property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCollector() {
        return collector;
    }

    /**
     * Sets the value of the collector property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCollector(String value) {
        this.collector = value;
    }

}
