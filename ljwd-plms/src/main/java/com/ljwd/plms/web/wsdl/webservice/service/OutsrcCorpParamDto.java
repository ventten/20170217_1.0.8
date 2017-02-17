
package com.ljwd.plms.web.wsdl.webservice.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for outsrcCorpParamDto complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="outsrcCorpParamDto">
 *   &lt;complexContent>
 *     &lt;extension base="{http://webservice.loan.mfbms.flinkmf.com/}baseDataControlDto">
 *       &lt;sequence>
 *       &lt;/sequence>
 *       &lt;attribute name="corpname" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="isvalid" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="corpid" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="addr" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="corptel1" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="corptel2" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="weightfirst" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="weihtsecond" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="remark" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "outsrcCorpParamDto")
public class OutsrcCorpParamDto
    extends BaseDataControlDto
{

    @XmlAttribute(name = "corpname")
    protected String corpname;
    @XmlAttribute(name = "isvalid")
    protected String isvalid;
    @XmlAttribute(name = "corpid")
    protected Long corpid;
    @XmlAttribute(name = "addr")
    protected String addr;
    @XmlAttribute(name = "corptel1")
    protected String corptel1;
    @XmlAttribute(name = "corptel2")
    protected String corptel2;
    @XmlAttribute(name = "weightfirst")
    protected Long weightfirst;
    @XmlAttribute(name = "weihtsecond")
    protected Long weihtsecond;
    @XmlAttribute(name = "remark")
    protected String remark;

    /**
     * Gets the value of the corpname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCorpname() {
        return corpname;
    }

    /**
     * Sets the value of the corpname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCorpname(String value) {
        this.corpname = value;
    }

    /**
     * Gets the value of the isvalid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsvalid() {
        return isvalid;
    }

    /**
     * Sets the value of the isvalid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsvalid(String value) {
        this.isvalid = value;
    }

    /**
     * Gets the value of the corpid property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCorpid() {
        return corpid;
    }

    /**
     * Sets the value of the corpid property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCorpid(Long value) {
        this.corpid = value;
    }

    /**
     * Gets the value of the addr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddr() {
        return addr;
    }

    /**
     * Sets the value of the addr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddr(String value) {
        this.addr = value;
    }

    /**
     * Gets the value of the corptel1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCorptel1() {
        return corptel1;
    }

    /**
     * Sets the value of the corptel1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCorptel1(String value) {
        this.corptel1 = value;
    }

    /**
     * Gets the value of the corptel2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCorptel2() {
        return corptel2;
    }

    /**
     * Sets the value of the corptel2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCorptel2(String value) {
        this.corptel2 = value;
    }

    /**
     * Gets the value of the weightfirst property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getWeightfirst() {
        return weightfirst;
    }

    /**
     * Sets the value of the weightfirst property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setWeightfirst(Long value) {
        this.weightfirst = value;
    }

    /**
     * Gets the value of the weihtsecond property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getWeihtsecond() {
        return weihtsecond;
    }

    /**
     * Sets the value of the weihtsecond property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setWeihtsecond(Long value) {
        this.weihtsecond = value;
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

}
