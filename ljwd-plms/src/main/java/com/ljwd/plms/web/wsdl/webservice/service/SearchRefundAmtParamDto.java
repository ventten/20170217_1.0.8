
package com.ljwd.plms.web.wsdl.webservice.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for searchRefundAmtParamDto complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="searchRefundAmtParamDto">
 *   &lt;complexContent>
 *     &lt;extension base="{http://webservice.loan.mfbms.flinkmf.com/}baseEnquiryParamDto">
 *       &lt;sequence>
 *       &lt;/sequence>
 *       &lt;attribute name="refundtype" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="rpmntid" type="{http://www.w3.org/2001/XMLSchema}long" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "searchRefundAmtParamDto")
public class SearchRefundAmtParamDto
    extends BaseEnquiryParamDto
{

    @XmlAttribute(name = "refundtype")
    protected String refundtype;
    @XmlAttribute(name = "rpmntid")
    protected Long rpmntid;

    /**
     * Gets the value of the refundtype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRefundtype() {
        return refundtype;
    }

    /**
     * Sets the value of the refundtype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRefundtype(String value) {
        this.refundtype = value;
    }

    /**
     * Gets the value of the rpmntid property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getRpmntid() {
        return rpmntid;
    }

    /**
     * Sets the value of the rpmntid property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setRpmntid(Long value) {
        this.rpmntid = value;
    }

}
