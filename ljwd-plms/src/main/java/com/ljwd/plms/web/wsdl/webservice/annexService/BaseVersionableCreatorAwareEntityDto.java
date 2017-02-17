
package com.ljwd.plms.web.wsdl.webservice.annexService;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for baseVersionableCreatorAwareEntityDto complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="baseVersionableCreatorAwareEntityDto">
 *   &lt;complexContent>
 *     &lt;extension base="{http://webservice.annex.mfbms.flinkmf.com/}baseCreatorAwareEntityDto">
 *       &lt;sequence>
 *       &lt;/sequence>
 *       &lt;attribute name="recordVersion" type="{http://www.w3.org/2001/XMLSchema}long" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "baseVersionableCreatorAwareEntityDto")
@XmlSeeAlso({
    AnnexDto.class,
    AnnexBackupDto.class
})
public abstract class BaseVersionableCreatorAwareEntityDto
    extends BaseCreatorAwareEntityDto
{

    @XmlAttribute(name = "recordVersion")
    protected Long recordVersion;

    /**
     * Gets the value of the recordVersion property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getRecordVersion() {
        return recordVersion;
    }

    /**
     * Sets the value of the recordVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setRecordVersion(Long value) {
        this.recordVersion = value;
    }

}
