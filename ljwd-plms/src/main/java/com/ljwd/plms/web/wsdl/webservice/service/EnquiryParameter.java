
package com.ljwd.plms.web.wsdl.webservice.service;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for enquiryParameter complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="enquiryParameter">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="matchCase" type="{http://webservice.loan.mfbms.flinkmf.com/}matchCase" minOccurs="0"/>
 *         &lt;element name="matchStyle" type="{http://webservice.loan.mfbms.flinkmf.com/}matchStyle" minOccurs="0"/>
 *         &lt;element name="resultSize" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="sortFields" type="{http://webservice.loan.mfbms.flinkmf.com/}sortField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="startFrom" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "enquiryParameter", propOrder = {
    "matchCase",
    "matchStyle",
    "resultSize",
    "sortFields",
    "startFrom"
})
@XmlSeeAlso({
    SearchCustomerWeChatParamDto.class
})
public class EnquiryParameter {

    protected MatchCase matchCase;
    protected MatchStyle matchStyle;
    protected int resultSize;
    @XmlElement(nillable = true)
    protected List<SortField> sortFields;
    protected int startFrom;

    /**
     * Gets the value of the matchCase property.
     * 
     * @return
     *     possible object is
     *     {@link MatchCase }
     *     
     */
    public MatchCase getMatchCase() {
        return matchCase;
    }

    /**
     * Sets the value of the matchCase property.
     * 
     * @param value
     *     allowed object is
     *     {@link MatchCase }
     *     
     */
    public void setMatchCase(MatchCase value) {
        this.matchCase = value;
    }

    /**
     * Gets the value of the matchStyle property.
     * 
     * @return
     *     possible object is
     *     {@link MatchStyle }
     *     
     */
    public MatchStyle getMatchStyle() {
        return matchStyle;
    }

    /**
     * Sets the value of the matchStyle property.
     * 
     * @param value
     *     allowed object is
     *     {@link MatchStyle }
     *     
     */
    public void setMatchStyle(MatchStyle value) {
        this.matchStyle = value;
    }

    /**
     * Gets the value of the resultSize property.
     * 
     */
    public int getResultSize() {
        return resultSize;
    }

    /**
     * Sets the value of the resultSize property.
     * 
     */
    public void setResultSize(int value) {
        this.resultSize = value;
    }

    /**
     * Gets the value of the sortFields property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sortFields property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSortFields().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SortField }
     * 
     * 
     */
    public List<SortField> getSortFields() {
        if (sortFields == null) {
            sortFields = new ArrayList<SortField>();
        }
        return this.sortFields;
    }

    /**
     * Gets the value of the startFrom property.
     * 
     */
    public int getStartFrom() {
        return startFrom;
    }

    /**
     * Sets the value of the startFrom property.
     * 
     */
    public void setStartFrom(int value) {
        this.startFrom = value;
    }

}
