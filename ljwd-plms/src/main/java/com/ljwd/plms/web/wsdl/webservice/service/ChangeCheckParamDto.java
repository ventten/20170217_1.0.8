
package com.ljwd.plms.web.wsdl.webservice.service;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for changeCheckParamDto complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="changeCheckParamDto">
 *   &lt;complexContent>
 *     &lt;extension base="{http://webservice.loan.mfbms.flinkmf.com/}baseDataControlDto">
 *       &lt;sequence>
 *       &lt;/sequence>
 *       &lt;attribute name="applinfoid" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="changereqid" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="changetable" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="newtypelist">
 *         &lt;simpleType>
 *           &lt;list itemType="{http://www.w3.org/2001/XMLSchema}string" />
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="newdatalist">
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
@XmlType(name = "changeCheckParamDto")
public class ChangeCheckParamDto
    extends BaseDataControlDto
{

    @XmlAttribute(name = "applinfoid")
    protected Long applinfoid;
    @XmlAttribute(name = "changereqid")
    protected Long changereqid;
    @XmlAttribute(name = "changetable")
    protected String changetable;
    @XmlAttribute(name = "newtypelist")
    protected List<String> newtypelist;
    @XmlAttribute(name = "newdatalist")
    protected List<String> newdatalist;

    /**
     * Gets the value of the applinfoid property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getApplinfoid() {
        return applinfoid;
    }

    /**
     * Sets the value of the applinfoid property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setApplinfoid(Long value) {
        this.applinfoid = value;
    }

    /**
     * Gets the value of the changereqid property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getChangereqid() {
        return changereqid;
    }

    /**
     * Sets the value of the changereqid property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setChangereqid(Long value) {
        this.changereqid = value;
    }

    /**
     * Gets the value of the changetable property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChangetable() {
        return changetable;
    }

    /**
     * Sets the value of the changetable property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChangetable(String value) {
        this.changetable = value;
    }

    /**
     * Gets the value of the newtypelist property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the newtypelist property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNewtypelist().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getNewtypelist() {
        if (newtypelist == null) {
            newtypelist = new ArrayList<String>();
        }
        return this.newtypelist;
    }

    /**
     * Gets the value of the newdatalist property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the newdatalist property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNewdatalist().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getNewdatalist() {
        if (newdatalist == null) {
            newdatalist = new ArrayList<String>();
        }
        return this.newdatalist;
    }

}
