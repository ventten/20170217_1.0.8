
package com.ljwd.plms.web.wsdl.webservice.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for superAgingResultDto complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="superAgingResultDto">
 *   &lt;complexContent>
 *     &lt;extension base="{http://webservice.loan.mfbms.flinkmf.com/}baseVersionableCreatorAwareEntityDto">
 *       &lt;sequence>
 *       &lt;/sequence>
 *       &lt;attribute name="superaging" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "superAgingResultDto")
public class SuperAgingResultDto
    extends BaseVersionableCreatorAwareEntityDto
{

    @XmlAttribute(name = "superaging")
    protected String superaging;

    /**
     * Gets the value of the superaging property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSuperaging() {
        return superaging;
    }

    /**
     * Sets the value of the superaging property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSuperaging(String value) {
        this.superaging = value;
    }

}
