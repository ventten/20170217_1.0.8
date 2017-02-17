
package com.ljwd.plms.web.wsdl.webservice.channelService;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for siteRegionMapDto complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="siteRegionMapDto">
 *   &lt;complexContent>
 *     &lt;extension base="{http://webservice.loan.mfbms.flinkmf.com/}baseVersionableCreatorAwareEntityDto">
 *       &lt;sequence>
 *       &lt;/sequence>
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="siteCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="regionId" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="remark" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="siteName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="regionName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="cby" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="ctime" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="uby" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="utime" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="rver" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="tseq" type="{http://www.w3.org/2001/XMLSchema}long" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "siteRegionMapDto")
public class SiteRegionMapDto
    extends BaseVersionableCreatorAwareEntityDto
{

    @XmlAttribute(name = "id")
    protected Long id;
    @XmlAttribute(name = "siteCode")
    protected String siteCode;
    @XmlAttribute(name = "regionId")
    protected Long regionId;
    @XmlAttribute(name = "remark")
    protected String remark;
    @XmlAttribute(name = "siteName")
    protected String siteName;
    @XmlAttribute(name = "regionName")
    protected String regionName;
    @XmlAttribute(name = "cby")
    protected String cby;
    @XmlAttribute(name = "ctime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar ctime;
    @XmlAttribute(name = "uby")
    protected String uby;
    @XmlAttribute(name = "utime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar utime;
    @XmlAttribute(name = "rver")
    protected Long rver;
    @XmlAttribute(name = "tseq")
    protected Long tseq;

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
     * Gets the value of the siteCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSiteCode() {
        return siteCode;
    }

    /**
     * Sets the value of the siteCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSiteCode(String value) {
        this.siteCode = value;
    }

    /**
     * Gets the value of the regionId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getRegionId() {
        return regionId;
    }

    /**
     * Sets the value of the regionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setRegionId(Long value) {
        this.regionId = value;
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
     * Gets the value of the siteName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSiteName() {
        return siteName;
    }

    /**
     * Sets the value of the siteName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSiteName(String value) {
        this.siteName = value;
    }

    /**
     * Gets the value of the regionName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegionName() {
        return regionName;
    }

    /**
     * Sets the value of the regionName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegionName(String value) {
        this.regionName = value;
    }

    /**
     * Gets the value of the cby property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCby() {
        return cby;
    }

    /**
     * Sets the value of the cby property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCby(String value) {
        this.cby = value;
    }

    /**
     * Gets the value of the ctime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCtime() {
        return ctime;
    }

    /**
     * Sets the value of the ctime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCtime(XMLGregorianCalendar value) {
        this.ctime = value;
    }

    /**
     * Gets the value of the uby property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUby() {
        return uby;
    }

    /**
     * Sets the value of the uby property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUby(String value) {
        this.uby = value;
    }

    /**
     * Gets the value of the utime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getUtime() {
        return utime;
    }

    /**
     * Sets the value of the utime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setUtime(XMLGregorianCalendar value) {
        this.utime = value;
    }

    /**
     * Gets the value of the rver property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getRver() {
        return rver;
    }

    /**
     * Sets the value of the rver property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setRver(Long value) {
        this.rver = value;
    }

    /**
     * Gets the value of the tseq property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTseq() {
        return tseq;
    }

    /**
     * Sets the value of the tseq property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTseq(Long value) {
        this.tseq = value;
    }

}
