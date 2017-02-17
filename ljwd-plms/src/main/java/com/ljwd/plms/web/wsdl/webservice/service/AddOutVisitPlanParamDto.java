
package com.ljwd.plms.web.wsdl.webservice.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for addOutVisitPlanParamDto complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="addOutVisitPlanParamDto">
 *   &lt;complexContent>
 *     &lt;extension base="{http://webservice.loan.mfbms.flinkmf.com/}baseDataControlDto">
 *       &lt;sequence>
 *       &lt;/sequence>
 *       &lt;attribute name="planid" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="planname" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="planstatus" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="planstarttime" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="infoid" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="status" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="signstatus" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="address" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="addresstype" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="tel" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="sequence" type="{http://www.w3.org/2001/XMLSchema}int" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "addOutVisitPlanParamDto")
public class AddOutVisitPlanParamDto
    extends BaseDataControlDto
{

    @XmlAttribute(name = "planid")
    protected Long planid;
    @XmlAttribute(name = "planname")
    protected String planname;
    @XmlAttribute(name = "planstatus")
    protected String planstatus;
    @XmlAttribute(name = "planstarttime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar planstarttime;
    @XmlAttribute(name = "infoid")
    protected Long infoid;
    @XmlAttribute(name = "status")
    protected String status;
    @XmlAttribute(name = "signstatus")
    protected String signstatus;
    @XmlAttribute(name = "address")
    protected String address;
    @XmlAttribute(name = "addresstype")
    protected String addresstype;
    @XmlAttribute(name = "tel")
    protected String tel;
    @XmlAttribute(name = "sequence")
    protected Integer sequence;

    /**
     * Gets the value of the planid property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPlanid() {
        return planid;
    }

    /**
     * Sets the value of the planid property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPlanid(Long value) {
        this.planid = value;
    }

    /**
     * Gets the value of the planname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlanname() {
        return planname;
    }

    /**
     * Sets the value of the planname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlanname(String value) {
        this.planname = value;
    }

    /**
     * Gets the value of the planstatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlanstatus() {
        return planstatus;
    }

    /**
     * Sets the value of the planstatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlanstatus(String value) {
        this.planstatus = value;
    }

    /**
     * Gets the value of the planstarttime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPlanstarttime() {
        return planstarttime;
    }

    /**
     * Sets the value of the planstarttime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPlanstarttime(XMLGregorianCalendar value) {
        this.planstarttime = value;
    }

    /**
     * Gets the value of the infoid property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getInfoid() {
        return infoid;
    }

    /**
     * Sets the value of the infoid property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setInfoid(Long value) {
        this.infoid = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

    /**
     * Gets the value of the signstatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSignstatus() {
        return signstatus;
    }

    /**
     * Sets the value of the signstatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSignstatus(String value) {
        this.signstatus = value;
    }

    /**
     * Gets the value of the address property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddress() {
        return address;
    }

    /**
     * Sets the value of the address property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddress(String value) {
        this.address = value;
    }

    /**
     * Gets the value of the addresstype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddresstype() {
        return addresstype;
    }

    /**
     * Sets the value of the addresstype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddresstype(String value) {
        this.addresstype = value;
    }

    /**
     * Gets the value of the tel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTel() {
        return tel;
    }

    /**
     * Sets the value of the tel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTel(String value) {
        this.tel = value;
    }

    /**
     * Gets the value of the sequence property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSequence() {
        return sequence;
    }

    /**
     * Sets the value of the sequence property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSequence(Integer value) {
        this.sequence = value;
    }

}
