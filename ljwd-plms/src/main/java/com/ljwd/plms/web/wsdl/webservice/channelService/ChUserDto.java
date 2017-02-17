
package com.ljwd.plms.web.wsdl.webservice.channelService;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for chUserDto complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="chUserDto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="position" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dataRange" type="{http://webservice.loan.mfbms.flinkmf.com/}dataRangeType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="userId" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="employeeNo" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="userName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="isSalesMan" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="isSuperviser" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="isQuit" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="isInLeave" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="orgId" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="quitDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "chUserDto", propOrder = {
    "position",
    "dataRange"
})
public class ChUserDto {

    protected String position;
    protected DataRangeType dataRange;
    @XmlAttribute(name = "userId")
    protected String userId;
    @XmlAttribute(name = "employeeNo")
    protected String employeeNo;
    @XmlAttribute(name = "userName")
    protected String userName;
    @XmlAttribute(name = "isSalesMan")
    protected Boolean isSalesMan;
    @XmlAttribute(name = "isSuperviser")
    protected Boolean isSuperviser;
    @XmlAttribute(name = "isQuit")
    protected Boolean isQuit;
    @XmlAttribute(name = "isInLeave")
    protected Boolean isInLeave;
    @XmlAttribute(name = "orgId")
    protected Long orgId;
    @XmlAttribute(name = "quitDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar quitDate;

    /**
     * Gets the value of the position property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPosition() {
        return position;
    }

    /**
     * Sets the value of the position property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPosition(String value) {
        this.position = value;
    }

    /**
     * Gets the value of the dataRange property.
     * 
     * @return
     *     possible object is
     *     {@link DataRangeType }
     *     
     */
    public DataRangeType getDataRange() {
        return dataRange;
    }

    /**
     * Sets the value of the dataRange property.
     * 
     * @param value
     *     allowed object is
     *     {@link DataRangeType }
     *     
     */
    public void setDataRange(DataRangeType value) {
        this.dataRange = value;
    }

    /**
     * Gets the value of the userId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserId() {
        return userId;
    }

    /**
     * Sets the value of the userId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserId(String value) {
        this.userId = value;
    }

    /**
     * Gets the value of the employeeNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmployeeNo() {
        return employeeNo;
    }

    /**
     * Sets the value of the employeeNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmployeeNo(String value) {
        this.employeeNo = value;
    }

    /**
     * Gets the value of the userName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserName() {
        return userName;
    }

    /**
     * Sets the value of the userName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserName(String value) {
        this.userName = value;
    }

    /**
     * Gets the value of the isSalesMan property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsSalesMan() {
        return isSalesMan;
    }

    /**
     * Sets the value of the isSalesMan property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsSalesMan(Boolean value) {
        this.isSalesMan = value;
    }

    /**
     * Gets the value of the isSuperviser property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsSuperviser() {
        return isSuperviser;
    }

    /**
     * Sets the value of the isSuperviser property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsSuperviser(Boolean value) {
        this.isSuperviser = value;
    }

    /**
     * Gets the value of the isQuit property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsQuit() {
        return isQuit;
    }

    /**
     * Sets the value of the isQuit property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsQuit(Boolean value) {
        this.isQuit = value;
    }

    /**
     * Gets the value of the isInLeave property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsInLeave() {
        return isInLeave;
    }

    /**
     * Sets the value of the isInLeave property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsInLeave(Boolean value) {
        this.isInLeave = value;
    }

    /**
     * Gets the value of the orgId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getOrgId() {
        return orgId;
    }

    /**
     * Sets the value of the orgId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setOrgId(Long value) {
        this.orgId = value;
    }

    /**
     * Gets the value of the quitDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getQuitDate() {
        return quitDate;
    }

    /**
     * Sets the value of the quitDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setQuitDate(XMLGregorianCalendar value) {
        this.quitDate = value;
    }

}
