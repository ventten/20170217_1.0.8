
package com.ljwd.plms.web.wsdl.webservice.service;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for searchOutVisitRecordListParamDto complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="searchOutVisitRecordListParamDto">
 *   &lt;complexContent>
 *     &lt;extension base="{http://webservice.loan.mfbms.flinkmf.com/}baseDataControlDto">
 *       &lt;sequence>
 *       &lt;/sequence>
 *       &lt;attribute name="custname" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="idcardno" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="cntrctno" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="visitby" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="mobile" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="paystatus" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="custtype" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="status">
 *         &lt;simpleType>
 *           &lt;list itemType="{http://www.w3.org/2001/XMLSchema}string" />
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="overduedaysfrom" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="overduedaysto" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="visitplandayfrom" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="visitplandayto" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="isofferreplyfail" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="addrs" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "searchOutVisitRecordListParamDto")
public class SearchOutVisitRecordListParamDto
    extends BaseDataControlDto
{

    @XmlAttribute(name = "custname")
    protected String custname;
    @XmlAttribute(name = "idcardno")
    protected String idcardno;
    @XmlAttribute(name = "cntrctno")
    protected String cntrctno;
    @XmlAttribute(name = "visitby")
    protected String visitby;
    @XmlAttribute(name = "mobile")
    protected String mobile;
    @XmlAttribute(name = "paystatus")
    protected String paystatus;
    @XmlAttribute(name = "custtype")
    protected String custtype;
    @XmlAttribute(name = "status")
    protected List<String> status;
    @XmlAttribute(name = "overduedaysfrom")
    protected String overduedaysfrom;
    @XmlAttribute(name = "overduedaysto")
    protected String overduedaysto;
    @XmlAttribute(name = "visitplandayfrom")
    protected String visitplandayfrom;
    @XmlAttribute(name = "visitplandayto")
    protected String visitplandayto;
    @XmlAttribute(name = "isofferreplyfail")
    protected Boolean isofferreplyfail;
    @XmlAttribute(name = "addrs")
    protected String addrs;

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
     * Gets the value of the cntrctno property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCntrctno() {
        return cntrctno;
    }

    /**
     * Sets the value of the cntrctno property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCntrctno(String value) {
        this.cntrctno = value;
    }

    /**
     * Gets the value of the visitby property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVisitby() {
        return visitby;
    }

    /**
     * Sets the value of the visitby property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVisitby(String value) {
        this.visitby = value;
    }

    /**
     * Gets the value of the mobile property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMobile() {
        return mobile;
    }

    /**
     * Sets the value of the mobile property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMobile(String value) {
        this.mobile = value;
    }

    /**
     * Gets the value of the paystatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaystatus() {
        return paystatus;
    }

    /**
     * Sets the value of the paystatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaystatus(String value) {
        this.paystatus = value;
    }

    /**
     * Gets the value of the custtype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCusttype() {
        return custtype;
    }

    /**
     * Sets the value of the custtype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCusttype(String value) {
        this.custtype = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the status property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStatus().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getStatus() {
        if (status == null) {
            status = new ArrayList<String>();
        }
        return this.status;
    }

    /**
     * Gets the value of the overduedaysfrom property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOverduedaysfrom() {
        return overduedaysfrom;
    }

    /**
     * Sets the value of the overduedaysfrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOverduedaysfrom(String value) {
        this.overduedaysfrom = value;
    }

    /**
     * Gets the value of the overduedaysto property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOverduedaysto() {
        return overduedaysto;
    }

    /**
     * Sets the value of the overduedaysto property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOverduedaysto(String value) {
        this.overduedaysto = value;
    }

    /**
     * Gets the value of the visitplandayfrom property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVisitplandayfrom() {
        return visitplandayfrom;
    }

    /**
     * Sets the value of the visitplandayfrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVisitplandayfrom(String value) {
        this.visitplandayfrom = value;
    }

    /**
     * Gets the value of the visitplandayto property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVisitplandayto() {
        return visitplandayto;
    }

    /**
     * Sets the value of the visitplandayto property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVisitplandayto(String value) {
        this.visitplandayto = value;
    }

    /**
     * Gets the value of the isofferreplyfail property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsofferreplyfail() {
        return isofferreplyfail;
    }

    /**
     * Sets the value of the isofferreplyfail property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsofferreplyfail(Boolean value) {
        this.isofferreplyfail = value;
    }

    /**
     * Gets the value of the addrs property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddrs() {
        return addrs;
    }

    /**
     * Sets the value of the addrs property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddrs(String value) {
        this.addrs = value;
    }

}
