
package com.ljwd.plms.web.wsdl.webservice.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for changeApplyInfoSearchResultDto complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="changeApplyInfoSearchResultDto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *       &lt;/sequence>
 *       &lt;attribute name="applcode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="custname" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="idcardno" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="appldate" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="salesuser" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="loanstatus" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="applid" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="cntrctid" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="custid" type="{http://www.w3.org/2001/XMLSchema}long" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "changeApplyInfoSearchResultDto")
public class ChangeApplyInfoSearchResultDto {

    @XmlAttribute(name = "applcode")
    protected String applcode;
    @XmlAttribute(name = "custname")
    protected String custname;
    @XmlAttribute(name = "idcardno")
    protected String idcardno;
    @XmlAttribute(name = "appldate")
    protected String appldate;
    @XmlAttribute(name = "salesuser")
    protected String salesuser;
    @XmlAttribute(name = "loanstatus")
    protected String loanstatus;
    @XmlAttribute(name = "applid")
    protected Long applid;
    @XmlAttribute(name = "cntrctid")
    protected Long cntrctid;
    @XmlAttribute(name = "custid")
    protected Long custid;

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
     * Gets the value of the custname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustname() {
        return custname;
    }

    /**
     * Sets the value of the custname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustname(String value) {
        this.custname = value;
    }

    /**
     * Gets the value of the idcardno property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdcardno() {
        return idcardno;
    }

    /**
     * Sets the value of the idcardno property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdcardno(String value) {
        this.idcardno = value;
    }

    /**
     * Gets the value of the appldate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAppldate() {
        return appldate;
    }

    /**
     * Sets the value of the appldate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAppldate(String value) {
        this.appldate = value;
    }

    /**
     * Gets the value of the salesuser property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSalesuser() {
        return salesuser;
    }

    /**
     * Sets the value of the salesuser property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSalesuser(String value) {
        this.salesuser = value;
    }

    /**
     * Gets the value of the loanstatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLoanstatus() {
        return loanstatus;
    }

    /**
     * Sets the value of the loanstatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLoanstatus(String value) {
        this.loanstatus = value;
    }

    /**
     * Gets the value of the applid property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getApplid() {
        return applid;
    }

    /**
     * Sets the value of the applid property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setApplid(Long value) {
        this.applid = value;
    }

    /**
     * Gets the value of the cntrctid property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCntrctid() {
        return cntrctid;
    }

    /**
     * Sets the value of the cntrctid property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCntrctid(Long value) {
        this.cntrctid = value;
    }

    /**
     * Gets the value of the custid property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCustid() {
        return custid;
    }

    /**
     * Sets the value of the custid property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCustid(Long value) {
        this.custid = value;
    }

}
