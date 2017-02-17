
package com.ljwd.plms.web.wsdl.webservice.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for investigateStatisticsParamDto complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="investigateStatisticsParamDto">
 *   &lt;complexContent>
 *     &lt;extension base="{http://webservice.loan.mfbms.flinkmf.com/}baseDataControlDto">
 *       &lt;sequence>
 *       &lt;/sequence>
 *       &lt;attribute name="handleByUser" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "investigateStatisticsParamDto")
public class InvestigateStatisticsParamDto
    extends BaseDataControlDto
{

    @XmlAttribute(name = "handleByUser")
    protected String handleByUser;

    /**
     * Gets the value of the handleByUser property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHandleByUser() {
        return handleByUser;
    }

    /**
     * Sets the value of the handleByUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHandleByUser(String value) {
        this.handleByUser = value;
    }

}
