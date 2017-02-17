
package com.ljwd.plms.web.wsdl.webservice.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for searchSubmitFinanceApplidResultDto complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="searchSubmitFinanceApplidResultDto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *       &lt;/sequence>
 *       &lt;attribute name="financeapplid" type="{http://www.w3.org/2001/XMLSchema}long" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "searchSubmitFinanceApplidResultDto")
public class SearchSubmitFinanceApplidResultDto {

    @XmlAttribute(name = "financeapplid")
    protected Long financeapplid;

    /**
     * Gets the value of the financeapplid property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getFinanceapplid() {
        return financeapplid;
    }

    /**
     * Sets the value of the financeapplid property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setFinanceapplid(Long value) {
        this.financeapplid = value;
    }

}
