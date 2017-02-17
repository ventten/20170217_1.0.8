
package com.ljwd.plms.web.wsdl.webservice.service;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for checkLoanManSearchResultDto complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="checkLoanManSearchResultDto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="clientNameCheckResults" type="{http://webservice.loan.mfbms.flinkmf.com/}checkLoanManResultDto" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="idCardCheckResults" type="{http://webservice.loan.mfbms.flinkmf.com/}checkLoanManResultDto" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="phoneCheckResults" type="{http://webservice.loan.mfbms.flinkmf.com/}checkLoanManResultDto" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="homeAddressCheckResults" type="{http://webservice.loan.mfbms.flinkmf.com/}checkLoanManResultDto" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="companyNameCheckResults" type="{http://webservice.loan.mfbms.flinkmf.com/}checkLoanManResultDto" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="companyAddressCheckResults" type="{http://webservice.loan.mfbms.flinkmf.com/}checkLoanManResultDto" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="spousePhoneCheckResults" type="{http://webservice.loan.mfbms.flinkmf.com/}checkLoanManResultDto" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="conactorPhoneCheckResults" type="{http://webservice.loan.mfbms.flinkmf.com/}checkLoanManResultDto" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="spouseIdCardInBlackCheckResults" type="{http://webservice.loan.mfbms.flinkmf.com/}checkLoanManResultDto" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="companyNameInBlackCheckResults" type="{http://webservice.loan.mfbms.flinkmf.com/}checkLoanManResultDto" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="idCardInBlackCheckResults" type="{http://webservice.loan.mfbms.flinkmf.com/}checkLoanManResultDto" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="carInfoPlateNoCheckResults" type="{http://webservice.loan.mfbms.flinkmf.com/}checkLoanManResultDto" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="carframeNoCheckResults" type="{http://webservice.loan.mfbms.flinkmf.com/}checkLoanManResultDto" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="clientNameCheckCount" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="idCardCheckCount" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="phoneCheckCount" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="spousePhoneCheckCount" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="conactorPhoneCheckCount" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="homeAddressCheckCount" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="companyNameCheckCount" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="companyAddressCheckCount" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="carInfoPlateNoCheckCount" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="carframeNoCheckCount" type="{http://www.w3.org/2001/XMLSchema}int" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "checkLoanManSearchResultDto", propOrder = {
    "clientNameCheckResults",
    "idCardCheckResults",
    "phoneCheckResults",
    "homeAddressCheckResults",
    "companyNameCheckResults",
    "companyAddressCheckResults",
    "spousePhoneCheckResults",
    "conactorPhoneCheckResults",
    "spouseIdCardInBlackCheckResults",
    "companyNameInBlackCheckResults",
    "idCardInBlackCheckResults",
    "carInfoPlateNoCheckResults",
    "carframeNoCheckResults"
})
public class CheckLoanManSearchResultDto {

    @XmlElement(nillable = true)
    protected List<CheckLoanManResultDto> clientNameCheckResults;
    @XmlElement(nillable = true)
    protected List<CheckLoanManResultDto> idCardCheckResults;
    @XmlElement(nillable = true)
    protected List<CheckLoanManResultDto> phoneCheckResults;
    @XmlElement(nillable = true)
    protected List<CheckLoanManResultDto> homeAddressCheckResults;
    @XmlElement(nillable = true)
    protected List<CheckLoanManResultDto> companyNameCheckResults;
    @XmlElement(nillable = true)
    protected List<CheckLoanManResultDto> companyAddressCheckResults;
    @XmlElement(nillable = true)
    protected List<CheckLoanManResultDto> spousePhoneCheckResults;
    @XmlElement(nillable = true)
    protected List<CheckLoanManResultDto> conactorPhoneCheckResults;
    @XmlElement(nillable = true)
    protected List<CheckLoanManResultDto> spouseIdCardInBlackCheckResults;
    @XmlElement(nillable = true)
    protected List<CheckLoanManResultDto> companyNameInBlackCheckResults;
    @XmlElement(nillable = true)
    protected List<CheckLoanManResultDto> idCardInBlackCheckResults;
    @XmlElement(nillable = true)
    protected List<CheckLoanManResultDto> carInfoPlateNoCheckResults;
    @XmlElement(nillable = true)
    protected List<CheckLoanManResultDto> carframeNoCheckResults;
    @XmlAttribute(name = "clientNameCheckCount")
    protected Integer clientNameCheckCount;
    @XmlAttribute(name = "idCardCheckCount")
    protected Integer idCardCheckCount;
    @XmlAttribute(name = "phoneCheckCount")
    protected Integer phoneCheckCount;
    @XmlAttribute(name = "spousePhoneCheckCount")
    protected Integer spousePhoneCheckCount;
    @XmlAttribute(name = "conactorPhoneCheckCount")
    protected Integer conactorPhoneCheckCount;
    @XmlAttribute(name = "homeAddressCheckCount")
    protected Integer homeAddressCheckCount;
    @XmlAttribute(name = "companyNameCheckCount")
    protected Integer companyNameCheckCount;
    @XmlAttribute(name = "companyAddressCheckCount")
    protected Integer companyAddressCheckCount;
    @XmlAttribute(name = "carInfoPlateNoCheckCount")
    protected Integer carInfoPlateNoCheckCount;
    @XmlAttribute(name = "carframeNoCheckCount")
    protected Integer carframeNoCheckCount;

    /**
     * Gets the value of the clientNameCheckResults property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the clientNameCheckResults property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getClientNameCheckResults().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CheckLoanManResultDto }
     * 
     * 
     */
    public List<CheckLoanManResultDto> getClientNameCheckResults() {
        if (clientNameCheckResults == null) {
            clientNameCheckResults = new ArrayList<CheckLoanManResultDto>();
        }
        return this.clientNameCheckResults;
    }

    /**
     * Gets the value of the idCardCheckResults property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the idCardCheckResults property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIdCardCheckResults().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CheckLoanManResultDto }
     * 
     * 
     */
    public List<CheckLoanManResultDto> getIdCardCheckResults() {
        if (idCardCheckResults == null) {
            idCardCheckResults = new ArrayList<CheckLoanManResultDto>();
        }
        return this.idCardCheckResults;
    }

    /**
     * Gets the value of the phoneCheckResults property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the phoneCheckResults property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPhoneCheckResults().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CheckLoanManResultDto }
     * 
     * 
     */
    public List<CheckLoanManResultDto> getPhoneCheckResults() {
        if (phoneCheckResults == null) {
            phoneCheckResults = new ArrayList<CheckLoanManResultDto>();
        }
        return this.phoneCheckResults;
    }

    /**
     * Gets the value of the homeAddressCheckResults property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the homeAddressCheckResults property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHomeAddressCheckResults().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CheckLoanManResultDto }
     * 
     * 
     */
    public List<CheckLoanManResultDto> getHomeAddressCheckResults() {
        if (homeAddressCheckResults == null) {
            homeAddressCheckResults = new ArrayList<CheckLoanManResultDto>();
        }
        return this.homeAddressCheckResults;
    }

    /**
     * Gets the value of the companyNameCheckResults property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the companyNameCheckResults property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCompanyNameCheckResults().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CheckLoanManResultDto }
     * 
     * 
     */
    public List<CheckLoanManResultDto> getCompanyNameCheckResults() {
        if (companyNameCheckResults == null) {
            companyNameCheckResults = new ArrayList<CheckLoanManResultDto>();
        }
        return this.companyNameCheckResults;
    }

    /**
     * Gets the value of the companyAddressCheckResults property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the companyAddressCheckResults property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCompanyAddressCheckResults().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CheckLoanManResultDto }
     * 
     * 
     */
    public List<CheckLoanManResultDto> getCompanyAddressCheckResults() {
        if (companyAddressCheckResults == null) {
            companyAddressCheckResults = new ArrayList<CheckLoanManResultDto>();
        }
        return this.companyAddressCheckResults;
    }

    /**
     * Gets the value of the spousePhoneCheckResults property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the spousePhoneCheckResults property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSpousePhoneCheckResults().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CheckLoanManResultDto }
     * 
     * 
     */
    public List<CheckLoanManResultDto> getSpousePhoneCheckResults() {
        if (spousePhoneCheckResults == null) {
            spousePhoneCheckResults = new ArrayList<CheckLoanManResultDto>();
        }
        return this.spousePhoneCheckResults;
    }

    /**
     * Gets the value of the conactorPhoneCheckResults property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the conactorPhoneCheckResults property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConactorPhoneCheckResults().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CheckLoanManResultDto }
     * 
     * 
     */
    public List<CheckLoanManResultDto> getConactorPhoneCheckResults() {
        if (conactorPhoneCheckResults == null) {
            conactorPhoneCheckResults = new ArrayList<CheckLoanManResultDto>();
        }
        return this.conactorPhoneCheckResults;
    }

    /**
     * Gets the value of the spouseIdCardInBlackCheckResults property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the spouseIdCardInBlackCheckResults property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSpouseIdCardInBlackCheckResults().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CheckLoanManResultDto }
     * 
     * 
     */
    public List<CheckLoanManResultDto> getSpouseIdCardInBlackCheckResults() {
        if (spouseIdCardInBlackCheckResults == null) {
            spouseIdCardInBlackCheckResults = new ArrayList<CheckLoanManResultDto>();
        }
        return this.spouseIdCardInBlackCheckResults;
    }

    /**
     * Gets the value of the companyNameInBlackCheckResults property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the companyNameInBlackCheckResults property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCompanyNameInBlackCheckResults().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CheckLoanManResultDto }
     * 
     * 
     */
    public List<CheckLoanManResultDto> getCompanyNameInBlackCheckResults() {
        if (companyNameInBlackCheckResults == null) {
            companyNameInBlackCheckResults = new ArrayList<CheckLoanManResultDto>();
        }
        return this.companyNameInBlackCheckResults;
    }

    /**
     * Gets the value of the idCardInBlackCheckResults property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the idCardInBlackCheckResults property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIdCardInBlackCheckResults().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CheckLoanManResultDto }
     * 
     * 
     */
    public List<CheckLoanManResultDto> getIdCardInBlackCheckResults() {
        if (idCardInBlackCheckResults == null) {
            idCardInBlackCheckResults = new ArrayList<CheckLoanManResultDto>();
        }
        return this.idCardInBlackCheckResults;
    }

    /**
     * Gets the value of the carInfoPlateNoCheckResults property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the carInfoPlateNoCheckResults property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCarInfoPlateNoCheckResults().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CheckLoanManResultDto }
     * 
     * 
     */
    public List<CheckLoanManResultDto> getCarInfoPlateNoCheckResults() {
        if (carInfoPlateNoCheckResults == null) {
            carInfoPlateNoCheckResults = new ArrayList<CheckLoanManResultDto>();
        }
        return this.carInfoPlateNoCheckResults;
    }

    /**
     * Gets the value of the carframeNoCheckResults property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the carframeNoCheckResults property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCarframeNoCheckResults().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CheckLoanManResultDto }
     * 
     * 
     */
    public List<CheckLoanManResultDto> getCarframeNoCheckResults() {
        if (carframeNoCheckResults == null) {
            carframeNoCheckResults = new ArrayList<CheckLoanManResultDto>();
        }
        return this.carframeNoCheckResults;
    }

    /**
     * Gets the value of the clientNameCheckCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getClientNameCheckCount() {
        return clientNameCheckCount;
    }

    /**
     * Sets the value of the clientNameCheckCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setClientNameCheckCount(Integer value) {
        this.clientNameCheckCount = value;
    }

    /**
     * Gets the value of the idCardCheckCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIdCardCheckCount() {
        return idCardCheckCount;
    }

    /**
     * Sets the value of the idCardCheckCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIdCardCheckCount(Integer value) {
        this.idCardCheckCount = value;
    }

    /**
     * Gets the value of the phoneCheckCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPhoneCheckCount() {
        return phoneCheckCount;
    }

    /**
     * Sets the value of the phoneCheckCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPhoneCheckCount(Integer value) {
        this.phoneCheckCount = value;
    }

    /**
     * Gets the value of the spousePhoneCheckCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSpousePhoneCheckCount() {
        return spousePhoneCheckCount;
    }

    /**
     * Sets the value of the spousePhoneCheckCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSpousePhoneCheckCount(Integer value) {
        this.spousePhoneCheckCount = value;
    }

    /**
     * Gets the value of the conactorPhoneCheckCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getConactorPhoneCheckCount() {
        return conactorPhoneCheckCount;
    }

    /**
     * Sets the value of the conactorPhoneCheckCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setConactorPhoneCheckCount(Integer value) {
        this.conactorPhoneCheckCount = value;
    }

    /**
     * Gets the value of the homeAddressCheckCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getHomeAddressCheckCount() {
        return homeAddressCheckCount;
    }

    /**
     * Sets the value of the homeAddressCheckCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setHomeAddressCheckCount(Integer value) {
        this.homeAddressCheckCount = value;
    }

    /**
     * Gets the value of the companyNameCheckCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCompanyNameCheckCount() {
        return companyNameCheckCount;
    }

    /**
     * Sets the value of the companyNameCheckCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCompanyNameCheckCount(Integer value) {
        this.companyNameCheckCount = value;
    }

    /**
     * Gets the value of the companyAddressCheckCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCompanyAddressCheckCount() {
        return companyAddressCheckCount;
    }

    /**
     * Sets the value of the companyAddressCheckCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCompanyAddressCheckCount(Integer value) {
        this.companyAddressCheckCount = value;
    }

    /**
     * Gets the value of the carInfoPlateNoCheckCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCarInfoPlateNoCheckCount() {
        return carInfoPlateNoCheckCount;
    }

    /**
     * Sets the value of the carInfoPlateNoCheckCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCarInfoPlateNoCheckCount(Integer value) {
        this.carInfoPlateNoCheckCount = value;
    }

    /**
     * Gets the value of the carframeNoCheckCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCarframeNoCheckCount() {
        return carframeNoCheckCount;
    }

    /**
     * Sets the value of the carframeNoCheckCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCarframeNoCheckCount(Integer value) {
        this.carframeNoCheckCount = value;
    }

}
