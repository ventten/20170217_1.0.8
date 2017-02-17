
package com.ljwd.plms.web.wsdl.webservice.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for applicationPreSubmitCheckInfoDto complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="applicationPreSubmitCheckInfoDto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *       &lt;/sequence>
 *       &lt;attribute name="materialAcceptedCount" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="materialCheckedCount" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="annexCount" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="applyId" type="{http://www.w3.org/2001/XMLSchema}long" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "applicationPreSubmitCheckInfoDto")
public class ApplicationPreSubmitCheckInfoDto {

    @XmlAttribute(name = "materialAcceptedCount")
    protected Long materialAcceptedCount;
    @XmlAttribute(name = "materialCheckedCount")
    protected Long materialCheckedCount;
    @XmlAttribute(name = "annexCount")
    protected Long annexCount;
    @XmlAttribute(name = "applyId")
    protected Long applyId;

    /**
     * Gets the value of the materialAcceptedCount property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMaterialAcceptedCount() {
        return materialAcceptedCount;
    }

    /**
     * Sets the value of the materialAcceptedCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMaterialAcceptedCount(Long value) {
        this.materialAcceptedCount = value;
    }

    /**
     * Gets the value of the materialCheckedCount property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMaterialCheckedCount() {
        return materialCheckedCount;
    }

    /**
     * Sets the value of the materialCheckedCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMaterialCheckedCount(Long value) {
        this.materialCheckedCount = value;
    }

    /**
     * Gets the value of the annexCount property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getAnnexCount() {
        return annexCount;
    }

    /**
     * Sets the value of the annexCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setAnnexCount(Long value) {
        this.annexCount = value;
    }

    /**
     * Gets the value of the applyId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getApplyId() {
        return applyId;
    }

    /**
     * Sets the value of the applyId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setApplyId(Long value) {
        this.applyId = value;
    }

}
