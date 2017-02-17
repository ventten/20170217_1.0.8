
package com.ljwd.plms.web.wsdl.webservice.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for searchOutVisitRecordAddressListParamDto complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="searchOutVisitRecordAddressListParamDto">
 *   &lt;complexContent>
 *     &lt;extension base="{http://webservice.loan.mfbms.flinkmf.com/}baseDataControlDto">
 *       &lt;sequence>
 *       &lt;/sequence>
 *       &lt;attribute name="applid" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="infoid" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="custtype" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "searchOutVisitRecordAddressListParamDto")
public class SearchOutVisitRecordAddressListParamDto
    extends BaseDataControlDto
{

    @XmlAttribute(name = "applid")
    protected Long applid;
    @XmlAttribute(name = "infoid")
    protected Long infoid;
    @XmlAttribute(name = "custtype")
    protected String custtype;

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

}
