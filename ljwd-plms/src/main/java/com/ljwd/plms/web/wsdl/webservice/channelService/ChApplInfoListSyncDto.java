
package com.ljwd.plms.web.wsdl.webservice.channelService;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for chApplInfoListSyncDto complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="chApplInfoListSyncDto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="newApplInfoList" type="{http://webservice.loan.mfbms.flinkmf.com/}chApplInfoSyncDto" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="applStatusList" type="{http://webservice.loan.mfbms.flinkmf.com/}chApplInfoStatusSyncDto" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="applOtherInfoList" type="{http://webservice.loan.mfbms.flinkmf.com/}chApplInfoOtherSyncDto" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="returnApplInfoList" type="{http://webservice.loan.mfbms.flinkmf.com/}chReturnApplInfoSyncDto" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="retrieveTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "chApplInfoListSyncDto", propOrder = {
    "newApplInfoList",
    "applStatusList",
    "applOtherInfoList",
    "returnApplInfoList"
})
public class ChApplInfoListSyncDto {

    @XmlElement(nillable = true)
    protected List<ChApplInfoSyncDto> newApplInfoList;
    @XmlElement(nillable = true)
    protected List<ChApplInfoStatusSyncDto> applStatusList;
    @XmlElement(nillable = true)
    protected List<ChApplInfoOtherSyncDto> applOtherInfoList;
    @XmlElement(nillable = true)
    protected List<ChReturnApplInfoSyncDto> returnApplInfoList;
    @XmlAttribute(name = "retrieveTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar retrieveTime;

    /**
     * Gets the value of the newApplInfoList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the newApplInfoList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNewApplInfoList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ChApplInfoSyncDto }
     * 
     * 
     */
    public List<ChApplInfoSyncDto> getNewApplInfoList() {
        if (newApplInfoList == null) {
            newApplInfoList = new ArrayList<ChApplInfoSyncDto>();
        }
        return this.newApplInfoList;
    }

    /**
     * Gets the value of the applStatusList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the applStatusList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getApplStatusList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ChApplInfoStatusSyncDto }
     * 
     * 
     */
    public List<ChApplInfoStatusSyncDto> getApplStatusList() {
        if (applStatusList == null) {
            applStatusList = new ArrayList<ChApplInfoStatusSyncDto>();
        }
        return this.applStatusList;
    }

    /**
     * Gets the value of the applOtherInfoList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the applOtherInfoList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getApplOtherInfoList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ChApplInfoOtherSyncDto }
     * 
     * 
     */
    public List<ChApplInfoOtherSyncDto> getApplOtherInfoList() {
        if (applOtherInfoList == null) {
            applOtherInfoList = new ArrayList<ChApplInfoOtherSyncDto>();
        }
        return this.applOtherInfoList;
    }

    /**
     * Gets the value of the returnApplInfoList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the returnApplInfoList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReturnApplInfoList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ChReturnApplInfoSyncDto }
     * 
     * 
     */
    public List<ChReturnApplInfoSyncDto> getReturnApplInfoList() {
        if (returnApplInfoList == null) {
            returnApplInfoList = new ArrayList<ChReturnApplInfoSyncDto>();
        }
        return this.returnApplInfoList;
    }

    /**
     * Gets the value of the retrieveTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRetrieveTime() {
        return retrieveTime;
    }

    /**
     * Sets the value of the retrieveTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRetrieveTime(XMLGregorianCalendar value) {
        this.retrieveTime = value;
    }

}
