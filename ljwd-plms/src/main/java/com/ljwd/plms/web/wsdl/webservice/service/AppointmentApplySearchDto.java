
package com.ljwd.plms.web.wsdl.webservice.service;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for appointmentApplySearchDto complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="appointmentApplySearchDto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *       &lt;/sequence>
 *       &lt;attribute name="bookingid" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="bookingflowid" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="crmdodrid" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="crmname" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="crmcard" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="crmdodrtype" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="crmloantrpe" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="crmappointment" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="crmfilelist" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="crmdatalist" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="crmarea" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="crmheadname" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="status" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="acceptby" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="accepttime" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="acpyirby" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="acpyirtime" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="accpuirsite" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="inputby" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="inputtime" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="applcode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="cancelby" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="canceltime" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="remark" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="namelist">
 *         &lt;simpleType>
 *           &lt;list itemType="{http://www.w3.org/2001/XMLSchema}string" />
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="namelist2">
 *         &lt;simpleType>
 *           &lt;list itemType="{http://www.w3.org/2001/XMLSchema}string" />
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="fileNamelist">
 *         &lt;simpleType>
 *           &lt;list itemType="{http://www.w3.org/2001/XMLSchema}string" />
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="spouseName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="spouseCard" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="accSources" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "appointmentApplySearchDto")
public class AppointmentApplySearchDto {

    @XmlAttribute(name = "bookingid")
    protected Long bookingid;
    @XmlAttribute(name = "bookingflowid")
    protected Long bookingflowid;
    @XmlAttribute(name = "crmdodrid")
    protected Long crmdodrid;
    @XmlAttribute(name = "crmname")
    protected String crmname;
    @XmlAttribute(name = "crmcard")
    protected String crmcard;
    @XmlAttribute(name = "crmdodrtype")
    protected String crmdodrtype;
    @XmlAttribute(name = "crmloantrpe")
    protected String crmloantrpe;
    @XmlAttribute(name = "crmappointment")
    protected String crmappointment;
    @XmlAttribute(name = "crmfilelist")
    protected String crmfilelist;
    @XmlAttribute(name = "crmdatalist")
    protected String crmdatalist;
    @XmlAttribute(name = "crmarea")
    protected String crmarea;
    @XmlAttribute(name = "crmheadname")
    protected String crmheadname;
    @XmlAttribute(name = "status")
    protected String status;
    @XmlAttribute(name = "acceptby")
    protected String acceptby;
    @XmlAttribute(name = "accepttime")
    protected String accepttime;
    @XmlAttribute(name = "acpyirby")
    protected String acpyirby;
    @XmlAttribute(name = "acpyirtime")
    protected String acpyirtime;
    @XmlAttribute(name = "accpuirsite")
    protected String accpuirsite;
    @XmlAttribute(name = "inputby")
    protected String inputby;
    @XmlAttribute(name = "inputtime")
    protected String inputtime;
    @XmlAttribute(name = "applcode")
    protected String applcode;
    @XmlAttribute(name = "cancelby")
    protected String cancelby;
    @XmlAttribute(name = "canceltime")
    protected String canceltime;
    @XmlAttribute(name = "remark")
    protected String remark;
    @XmlAttribute(name = "namelist")
    protected List<String> namelist;
    @XmlAttribute(name = "namelist2")
    protected List<String> namelist2;
    @XmlAttribute(name = "fileNamelist")
    protected List<String> fileNamelist;
    @XmlAttribute(name = "spouseName")
    protected String spouseName;
    @XmlAttribute(name = "spouseCard")
    protected String spouseCard;
    @XmlAttribute(name = "accSources")
    protected String accSources;

    /**
     * Gets the value of the bookingid property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getBookingid() {
        return bookingid;
    }

    /**
     * Sets the value of the bookingid property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setBookingid(Long value) {
        this.bookingid = value;
    }

    /**
     * Gets the value of the bookingflowid property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getBookingflowid() {
        return bookingflowid;
    }

    /**
     * Sets the value of the bookingflowid property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setBookingflowid(Long value) {
        this.bookingflowid = value;
    }

    /**
     * Gets the value of the crmdodrid property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCrmdodrid() {
        return crmdodrid;
    }

    /**
     * Sets the value of the crmdodrid property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCrmdodrid(Long value) {
        this.crmdodrid = value;
    }

    /**
     * Gets the value of the crmname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCrmname() {
        return crmname;
    }

    /**
     * Sets the value of the crmname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCrmname(String value) {
        this.crmname = value;
    }

    /**
     * Gets the value of the crmcard property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCrmcard() {
        return crmcard;
    }

    /**
     * Sets the value of the crmcard property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCrmcard(String value) {
        this.crmcard = value;
    }

    /**
     * Gets the value of the crmdodrtype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCrmdodrtype() {
        return crmdodrtype;
    }

    /**
     * Sets the value of the crmdodrtype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCrmdodrtype(String value) {
        this.crmdodrtype = value;
    }

    /**
     * Gets the value of the crmloantrpe property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCrmloantrpe() {
        return crmloantrpe;
    }

    /**
     * Sets the value of the crmloantrpe property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCrmloantrpe(String value) {
        this.crmloantrpe = value;
    }

    /**
     * Gets the value of the crmappointment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCrmappointment() {
        return crmappointment;
    }

    /**
     * Sets the value of the crmappointment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCrmappointment(String value) {
        this.crmappointment = value;
    }

    /**
     * Gets the value of the crmfilelist property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCrmfilelist() {
        return crmfilelist;
    }

    /**
     * Sets the value of the crmfilelist property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCrmfilelist(String value) {
        this.crmfilelist = value;
    }

    /**
     * Gets the value of the crmdatalist property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCrmdatalist() {
        return crmdatalist;
    }

    /**
     * Sets the value of the crmdatalist property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCrmdatalist(String value) {
        this.crmdatalist = value;
    }

    /**
     * Gets the value of the crmarea property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCrmarea() {
        return crmarea;
    }

    /**
     * Sets the value of the crmarea property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCrmarea(String value) {
        this.crmarea = value;
    }

    /**
     * Gets the value of the crmheadname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCrmheadname() {
        return crmheadname;
    }

    /**
     * Sets the value of the crmheadname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCrmheadname(String value) {
        this.crmheadname = value;
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
     * Gets the value of the acceptby property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcceptby() {
        return acceptby;
    }

    /**
     * Sets the value of the acceptby property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcceptby(String value) {
        this.acceptby = value;
    }

    /**
     * Gets the value of the accepttime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccepttime() {
        return accepttime;
    }

    /**
     * Sets the value of the accepttime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccepttime(String value) {
        this.accepttime = value;
    }

    /**
     * Gets the value of the acpyirby property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcpyirby() {
        return acpyirby;
    }

    /**
     * Sets the value of the acpyirby property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcpyirby(String value) {
        this.acpyirby = value;
    }

    /**
     * Gets the value of the acpyirtime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcpyirtime() {
        return acpyirtime;
    }

    /**
     * Sets the value of the acpyirtime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcpyirtime(String value) {
        this.acpyirtime = value;
    }

    /**
     * Gets the value of the accpuirsite property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccpuirsite() {
        return accpuirsite;
    }

    /**
     * Sets the value of the accpuirsite property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccpuirsite(String value) {
        this.accpuirsite = value;
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
     * Gets the value of the applcode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApplcode() {
        return applcode;
    }

    /**
     * Sets the value of the applcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApplcode(String value) {
        this.applcode = value;
    }

    /**
     * Gets the value of the cancelby property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCancelby() {
        return cancelby;
    }

    /**
     * Sets the value of the cancelby property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCancelby(String value) {
        this.cancelby = value;
    }

    /**
     * Gets the value of the canceltime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCanceltime() {
        return canceltime;
    }

    /**
     * Sets the value of the canceltime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCanceltime(String value) {
        this.canceltime = value;
    }

    /**
     * Gets the value of the remark property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRemark() {
        return remark;
    }

    /**
     * Sets the value of the remark property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRemark(String value) {
        this.remark = value;
    }

    /**
     * Gets the value of the namelist property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the namelist property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNamelist().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getNamelist() {
        if (namelist == null) {
            namelist = new ArrayList<String>();
        }
        return this.namelist;
    }

    /**
     * Gets the value of the namelist2 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the namelist2 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNamelist2().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getNamelist2() {
        if (namelist2 == null) {
            namelist2 = new ArrayList<String>();
        }
        return this.namelist2;
    }

    /**
     * Gets the value of the fileNamelist property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fileNamelist property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFileNamelist().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getFileNamelist() {
        if (fileNamelist == null) {
            fileNamelist = new ArrayList<String>();
        }
        return this.fileNamelist;
    }

    /**
     * Gets the value of the spouseName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpouseName() {
        return spouseName;
    }

    /**
     * Sets the value of the spouseName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpouseName(String value) {
        this.spouseName = value;
    }

    /**
     * Gets the value of the spouseCard property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpouseCard() {
        return spouseCard;
    }

    /**
     * Sets the value of the spouseCard property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpouseCard(String value) {
        this.spouseCard = value;
    }

    /**
     * Gets the value of the accSources property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccSources() {
        return accSources;
    }

    /**
     * Sets the value of the accSources property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccSources(String value) {
        this.accSources = value;
    }

}
