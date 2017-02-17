
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
 * <p>Java class for chOrganizationListSyncDto complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="chOrganizationListSyncDto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="list" type="{http://webservice.loan.mfbms.flinkmf.com/}chOrganizationDto" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "chOrganizationListSyncDto", propOrder = {
    "list"
})
public class ChOrganizationListSyncDto {

    @XmlElement(nillable = true)
    protected List<ChOrganizationDto> list;
    @XmlAttribute(name = "retrieveTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar retrieveTime;

    /**
     * Gets the value of the list property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the list property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ChOrganizationDto }
     * 
     * 
     */
    public List<ChOrganizationDto> getList() {
        if (list == null) {
            list = new ArrayList<ChOrganizationDto>();
        }
        return this.list;
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
