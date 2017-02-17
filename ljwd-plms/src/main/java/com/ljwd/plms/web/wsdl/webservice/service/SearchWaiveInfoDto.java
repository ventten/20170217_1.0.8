
package com.ljwd.plms.web.wsdl.webservice.service;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for searchWaiveInfoDto complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="searchWaiveInfoDto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="rpmntid" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="cntrctno" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="custname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="idcardno" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="loanamt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="inputby" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="inputtime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="waiveInfoDtls" type="{http://webservice.loan.mfbms.flinkmf.com/}searchWaiveInfoDtlDto" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "searchWaiveInfoDto", propOrder = {
    "rpmntid",
    "cntrctno",
    "custname",
    "idcardno",
    "loanamt",
    "inputby",
    "inputtime",
    "waiveInfoDtls"
})
public class SearchWaiveInfoDto {

    protected Long rpmntid;
    protected String cntrctno;
    protected String custname;
    protected String idcardno;
    protected String loanamt;
    protected String inputby;
    protected String inputtime;
    @XmlElement(nillable = true)
    protected List<SearchWaiveInfoDtlDto> waiveInfoDtls;

    /**
     * Gets the value of the rpmntid property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getRpmntid() {
        return rpmntid;
    }

    /**
     * Sets the value of the rpmntid property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setRpmntid(Long value) {
        this.rpmntid = value;
    }

    /**
     * Gets the value of the cntrctno property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCntrctno() {
        return cntrctno;
    }

    /**
     * Sets the value of the cntrctno property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCntrctno(String value) {
        this.cntrctno = value;
    }

    /**
     * Gets the value of the custname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustname() {
        return custname;
    }

    /**
     * Sets the value of the custname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustname(String value) {
        this.custname = value;
    }

    /**
     * Gets the value of the idcardno property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdcardno() {
        return idcardno;
    }

    /**
     * Sets the value of the idcardno property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdcardno(String value) {
        this.idcardno = value;
    }

    /**
     * Gets the value of the loanamt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLoanamt() {
        return loanamt;
    }

    /**
     * Sets the value of the loanamt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLoanamt(String value) {
        this.loanamt = value;
    }

    /**
     * Gets the value of the inputby property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInputby() {
        return inputby;
    }

    /**
     * Sets the value of the inputby property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInputby(String value) {
        this.inputby = value;
    }

    /**
     * Gets the value of the inputtime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInputtime() {
        return inputtime;
    }

    /**
     * Sets the value of the inputtime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInputtime(String value) {
        this.inputtime = value;
    }

    /**
     * Gets the value of the waiveInfoDtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the waiveInfoDtls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWaiveInfoDtls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchWaiveInfoDtlDto }
     * 
     * 
     */
    public List<SearchWaiveInfoDtlDto> getWaiveInfoDtls() {
        if (waiveInfoDtls == null) {
            waiveInfoDtls = new ArrayList<SearchWaiveInfoDtlDto>();
        }
        return this.waiveInfoDtls;
    }

}
