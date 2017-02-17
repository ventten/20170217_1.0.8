
package com.ljwd.plms.web.wsdl.webservice.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for outVisitSignSearchParamDto complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="outVisitSignSearchParamDto">
 *   &lt;complexContent>
 *     &lt;extension base="{http://webservice.loan.mfbms.flinkmf.com/}baseDataControlDto">
 *       &lt;sequence>
 *       &lt;/sequence>
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="planDtlId" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="signBy" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "outVisitSignSearchParamDto")
public class OutVisitSignSearchParamDto
    extends BaseDataControlDto
{

    @XmlAttribute(name = "id")
    protected Long id;
    @XmlAttribute(name = "planDtlId")
    protected Long planDtlId;
    @XmlAttribute(name = "signBy")
    protected String signBy;

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
     * Gets the value of the planDtlId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPlanDtlId() {
        return planDtlId;
    }

    /**
     * Sets the value of the planDtlId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPlanDtlId(Long value) {
        this.planDtlId = value;
    }

    /**
     * Gets the value of the signBy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSignBy() {
        return signBy;
    }

    /**
     * Sets the value of the signBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSignBy(String value) {
        this.signBy = value;
    }

}
