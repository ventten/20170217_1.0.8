
package com.ljwd.plms.web.wsdl.webservice.channelService;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for bookingDto complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="bookingDto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *       &lt;/sequence>
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="crmAccId" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="crmDodrId" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="crmAccName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="crmAccCard" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="crmDodrArea" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="crmDodrType" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="crmDodrLoanType" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="crmAppointment" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="crmFileList" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="crmDodrDataList" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="crmUserName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="crmPushTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="crmSpouseName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="crmSpouseCard" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="crmAccSources" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "bookingDto")
public class BookingDto {

    @XmlAttribute(name = "id")
    protected Long id;
    @XmlAttribute(name = "crmAccId")
    protected Long crmAccId;
    @XmlAttribute(name = "crmDodrId")
    protected Long crmDodrId;
    @XmlAttribute(name = "crmAccName")
    protected String crmAccName;
    @XmlAttribute(name = "crmAccCard")
    protected String crmAccCard;
    @XmlAttribute(name = "crmDodrArea")
    protected String crmDodrArea;
    @XmlAttribute(name = "crmDodrType")
    protected String crmDodrType;
    @XmlAttribute(name = "crmDodrLoanType")
    protected String crmDodrLoanType;
    @XmlAttribute(name = "crmAppointment")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar crmAppointment;
    @XmlAttribute(name = "crmFileList")
    protected String crmFileList;
    @XmlAttribute(name = "crmDodrDataList")
    protected String crmDodrDataList;
    @XmlAttribute(name = "crmUserName")
    protected String crmUserName;
    @XmlAttribute(name = "crmPushTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar crmPushTime;
    @XmlAttribute(name = "crmSpouseName")
    protected String crmSpouseName;
    @XmlAttribute(name = "crmSpouseCard")
    protected String crmSpouseCard;
    @XmlAttribute(name = "crmAccSources")
    protected String crmAccSources;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setId(Long value) {
        this.id = value;
    }

    /**
     * Gets the value of the crmAccId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCrmAccId() {
        return crmAccId;
    }

    /**
     * Sets the value of the crmAccId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCrmAccId(Long value) {
        this.crmAccId = value;
    }

    /**
     * Gets the value of the crmDodrId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCrmDodrId() {
        return crmDodrId;
    }

    /**
     * Sets the value of the crmDodrId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCrmDodrId(Long value) {
        this.crmDodrId = value;
    }

    /**
     * Gets the value of the crmAccName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCrmAccName() {
        return crmAccName;
    }

    /**
     * Sets the value of the crmAccName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCrmAccName(String value) {
        this.crmAccName = value;
    }

    /**
     * Gets the value of the crmAccCard property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCrmAccCard() {
        return crmAccCard;
    }

    /**
     * Sets the value of the crmAccCard property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCrmAccCard(String value) {
        this.crmAccCard = value;
    }

    /**
     * Gets the value of the crmDodrArea property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCrmDodrArea() {
        return crmDodrArea;
    }

    /**
     * Sets the value of the crmDodrArea property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCrmDodrArea(String value) {
        this.crmDodrArea = value;
    }

    /**
     * Gets the value of the crmDodrType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCrmDodrType() {
        return crmDodrType;
    }

    /**
     * Sets the value of the crmDodrType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCrmDodrType(String value) {
        this.crmDodrType = value;
    }

    /**
     * Gets the value of the crmDodrLoanType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCrmDodrLoanType() {
        return crmDodrLoanType;
    }

    /**
     * Sets the value of the crmDodrLoanType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCrmDodrLoanType(String value) {
        this.crmDodrLoanType = value;
    }

    /**
     * Gets the value of the crmAppointment property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCrmAppointment() {
        return crmAppointment;
    }

    /**
     * Sets the value of the crmAppointment property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCrmAppointment(XMLGregorianCalendar value) {
        this.crmAppointment = value;
    }

    /**
     * Gets the value of the crmFileList property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCrmFileList() {
        return crmFileList;
    }

    /**
     * Sets the value of the crmFileList property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCrmFileList(String value) {
        this.crmFileList = value;
    }

    /**
     * Gets the value of the crmDodrDataList property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCrmDodrDataList() {
        return crmDodrDataList;
    }

    /**
     * Sets the value of the crmDodrDataList property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCrmDodrDataList(String value) {
        this.crmDodrDataList = value;
    }

    /**
     * Gets the value of the crmUserName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCrmUserName() {
        return crmUserName;
    }

    /**
     * Sets the value of the crmUserName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCrmUserName(String value) {
        this.crmUserName = value;
    }

    /**
     * Gets the value of the crmPushTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCrmPushTime() {
        return crmPushTime;
    }

    /**
     * Sets the value of the crmPushTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCrmPushTime(XMLGregorianCalendar value) {
        this.crmPushTime = value;
    }

    /**
     * Gets the value of the crmSpouseName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCrmSpouseName() {
        return crmSpouseName;
    }

    /**
     * Sets the value of the crmSpouseName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCrmSpouseName(String value) {
        this.crmSpouseName = value;
    }

    /**
     * Gets the value of the crmSpouseCard property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCrmSpouseCard() {
        return crmSpouseCard;
    }

    /**
     * Sets the value of the crmSpouseCard property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCrmSpouseCard(String value) {
        this.crmSpouseCard = value;
    }

    /**
     * Gets the value of the crmAccSources property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCrmAccSources() {
        return crmAccSources;
    }

    /**
     * Sets the value of the crmAccSources property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCrmAccSources(String value) {
        this.crmAccSources = value;
    }

}
