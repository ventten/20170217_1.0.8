
package com.ljwd.plms.web.wsdl.webservice.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for contact complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="contact">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="callCnt" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="callLen" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="contactor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="phone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="phoneLoc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="relation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "contact", propOrder = {
    "callCnt",
    "callLen",
    "contactor",
    "phone",
    "phoneLoc",
    "relation"
})
public class Contact {

    protected int callCnt;          //拨打次数
    protected int callLen;          //拨打时长
    protected String contactor;     //联系人姓名
    protected String phone;         //号码
    protected String phoneLoc;      //号码归属地
    protected String relation;      //联系人关系

    /**
     * Gets the value of the callCnt property.
     * 
     */
    public int getCallCnt() {
        return callCnt;
    }

    /**
     * Sets the value of the callCnt property.
     * 
     */
    public void setCallCnt(int value) {
        this.callCnt = value;
    }

    /**
     * Gets the value of the callLen property.
     * 
     */
    public int getCallLen() {
        return callLen;
    }

    /**
     * Sets the value of the callLen property.
     * 
     */
    public void setCallLen(int value) {
        this.callLen = value;
    }

    /**
     * Gets the value of the contactor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactor() {
        return contactor;
    }

    /**
     * Sets the value of the contactor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactor(String value) {
        this.contactor = value;
    }

    /**
     * Gets the value of the phone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhone() {
        return phone;
    }

    /**
     * Sets the value of the phone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhone(String value) {
        this.phone = value;
    }

    /**
     * Gets the value of the phoneLoc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhoneLoc() {
        return phoneLoc;
    }

    /**
     * Sets the value of the phoneLoc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhoneLoc(String value) {
        this.phoneLoc = value;
    }

    /**
     * Gets the value of the relation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRelation() {
        return relation;
    }

    /**
     * Sets the value of the relation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRelation(String value) {
        this.relation = value;
    }

}
