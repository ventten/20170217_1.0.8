
package com.ljwd.plms.web.wsdl.webservice.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for changeContentSearchResultDto complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="changeContentSearchResultDto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *       &lt;/sequence>
 *       &lt;attribute name="c1" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="c2" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="c3" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="c4" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="c5" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "changeContentSearchResultDto")
public class ChangeContentSearchResultDto {

    @XmlAttribute(name = "c1")
    protected String c1;
    @XmlAttribute(name = "c2")
    protected String c2;
    @XmlAttribute(name = "c3")
    protected String c3;
    @XmlAttribute(name = "c4")
    protected String c4;
    @XmlAttribute(name = "c5")
    protected String c5;

    /**
     * Gets the value of the c1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getC1() {
        return c1;
    }

    /**
     * Sets the value of the c1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setC1(String value) {
        this.c1 = value;
    }

    /**
     * Gets the value of the c2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getC2() {
        return c2;
    }

    /**
     * Sets the value of the c2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setC2(String value) {
        this.c2 = value;
    }

    /**
     * Gets the value of the c3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getC3() {
        return c3;
    }

    /**
     * Sets the value of the c3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setC3(String value) {
        this.c3 = value;
    }

    /**
     * Gets the value of the c4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getC4() {
        return c4;
    }

    /**
     * Sets the value of the c4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setC4(String value) {
        this.c4 = value;
    }

    /**
     * Gets the value of the c5 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getC5() {
        return c5;
    }

    /**
     * Sets the value of the c5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setC5(String value) {
        this.c5 = value;
    }

}
