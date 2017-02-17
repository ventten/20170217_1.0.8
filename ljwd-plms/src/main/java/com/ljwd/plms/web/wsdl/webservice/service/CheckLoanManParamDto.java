
package com.ljwd.plms.web.wsdl.webservice.service;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for checkLoanManParamDto complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="checkLoanManParamDto">
 *   &lt;complexContent>
 *     &lt;extension base="{http://webservice.loan.mfbms.flinkmf.com/}baseEnquiryParamDto">
 *       &lt;sequence>
 *       &lt;/sequence>
 *       &lt;attribute name="checkType" type="{http://webservice.loan.mfbms.flinkmf.com/}checkLoanManType" />
 *       &lt;attribute name="applyId" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="clientName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="idCard" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="spouseIdCard" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="phones">
 *         &lt;simpleType>
 *           &lt;list itemType="{http://www.w3.org/2001/XMLSchema}string" />
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="spousePhones">
 *         &lt;simpleType>
 *           &lt;list itemType="{http://www.w3.org/2001/XMLSchema}string" />
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="conactorPhones">
 *         &lt;simpleType>
 *           &lt;list itemType="{http://www.w3.org/2001/XMLSchema}string" />
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="homeAddress">
 *         &lt;simpleType>
 *           &lt;list itemType="{http://www.w3.org/2001/XMLSchema}string" />
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="companyNames">
 *         &lt;simpleType>
 *           &lt;list itemType="{http://www.w3.org/2001/XMLSchema}string" />
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="companyAddresss">
 *         &lt;simpleType>
 *           &lt;list itemType="{http://www.w3.org/2001/XMLSchema}string" />
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="carPlateNos">
 *         &lt;simpleType>
 *           &lt;list itemType="{http://www.w3.org/2001/XMLSchema}string" />
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="carframeNos">
 *         &lt;simpleType>
 *           &lt;list itemType="{http://www.w3.org/2001/XMLSchema}string" />
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "checkLoanManParamDto")
public class CheckLoanManParamDto
    extends BaseEnquiryParamDto
{

    @XmlAttribute(name = "checkType")
    protected CheckLoanManType checkType;
    @XmlAttribute(name = "applyId")
    protected Long applyId;
    @XmlAttribute(name = "clientName")
    protected String clientName;
    @XmlAttribute(name = "idCard")
    protected String idCard;
    @XmlAttribute(name = "spouseIdCard")
    protected String spouseIdCard;
    @XmlAttribute(name = "phones")
    protected List<String> phones;
    @XmlAttribute(name = "spousePhones")
    protected List<String> spousePhones;
    @XmlAttribute(name = "conactorPhones")
    protected List<String> conactorPhones;
    @XmlAttribute(name = "homeAddress")
    protected List<String> homeAddress;
    @XmlAttribute(name = "companyNames")
    protected List<String> companyNames;
    @XmlAttribute(name = "companyAddresss")
    protected List<String> companyAddresss;
    @XmlAttribute(name = "carPlateNos")
    protected List<String> carPlateNos;
    @XmlAttribute(name = "carframeNos")
    protected List<String> carframeNos;

    /**
     * Gets the value of the checkType property.
     * 
     * @return
     *     possible object is
     *     {@link CheckLoanManType }
     *     
     */
    public CheckLoanManType getCheckType() {
        return checkType;
    }

    /**
     * Sets the value of the checkType property.
     * 
     * @param value
     *     allowed object is
     *     {@link CheckLoanManType }
     *     
     */
    public void setCheckType(CheckLoanManType value) {
        this.checkType = value;
    }

    /**
     * Gets the value of the applyId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getApplyId() {
        return applyId;
    }

    /**
     * Sets the value of the applyId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setApplyId(Long value) {
        this.applyId = value;
    }

    /**
     * Gets the value of the clientName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClientName() {
        return clientName;
    }

    /**
     * Sets the value of the clientName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClientName(String value) {
        this.clientName = value;
    }

    /**
     * Gets the value of the idCard property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdCard() {
        return idCard;
    }

    /**
     * Sets the value of the idCard property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdCard(String value) {
        this.idCard = value;
    }

    /**
     * Gets the value of the spouseIdCard property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpouseIdCard() {
        return spouseIdCard;
    }

    /**
     * Sets the value of the spouseIdCard property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpouseIdCard(String value) {
        this.spouseIdCard = value;
    }

    /**
     * Gets the value of the phones property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the phones property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPhones().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getPhones() {
        if (phones == null) {
            phones = new ArrayList<String>();
        }
        return this.phones;
    }

    /**
     * Gets the value of the spousePhones property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the spousePhones property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSpousePhones().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getSpousePhones() {
        if (spousePhones == null) {
            spousePhones = new ArrayList<String>();
        }
        return this.spousePhones;
    }

    /**
     * Gets the value of the conactorPhones property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the conactorPhones property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConactorPhones().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getConactorPhones() {
        if (conactorPhones == null) {
            conactorPhones = new ArrayList<String>();
        }
        return this.conactorPhones;
    }

    /**
     * Gets the value of the homeAddress property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the homeAddress property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHomeAddress().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getHomeAddress() {
        if (homeAddress == null) {
            homeAddress = new ArrayList<String>();
        }
        return this.homeAddress;
    }

    /**
     * Gets the value of the companyNames property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the companyNames property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCompanyNames().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getCompanyNames() {
        if (companyNames == null) {
            companyNames = new ArrayList<String>();
        }
        return this.companyNames;
    }

    /**
     * Gets the value of the companyAddresss property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the companyAddresss property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCompanyAddresss().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getCompanyAddresss() {
        if (companyAddresss == null) {
            companyAddresss = new ArrayList<String>();
        }
        return this.companyAddresss;
    }

    /**
     * Gets the value of the carPlateNos property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the carPlateNos property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCarPlateNos().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getCarPlateNos() {
        if (carPlateNos == null) {
            carPlateNos = new ArrayList<String>();
        }
        return this.carPlateNos;
    }

    /**
     * Gets the value of the carframeNos property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the carframeNos property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCarframeNos().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getCarframeNos() {
        if (carframeNos == null) {
            carframeNos = new ArrayList<String>();
        }
        return this.carframeNos;
    }

}
