
package com.ljwd.plms.web.wsdl.webservice.annexService;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for bocUploadFileItemDto complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="bocUploadFileItemDto">
 *   &lt;complexContent>
 *     &lt;extension base="{http://webservice.annex.mfbms.flinkmf.com/}baseDataControlDto">
 *       &lt;sequence>
 *         &lt;element name="annexContent" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="fileName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "bocUploadFileItemDto", propOrder = {
    "annexContent"
})
public class BocUploadFileItemDto
    extends BaseDataControlDto
{

    protected byte[] annexContent;
    @XmlAttribute(name = "fileName")
    protected String fileName;

    /**
     * Gets the value of the annexContent property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getAnnexContent() {
        return annexContent;
    }

    /**
     * Sets the value of the annexContent property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setAnnexContent(byte[] value) {
        this.annexContent = value;
    }

    /**
     * Gets the value of the fileName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFileName() {
        return fileName;
    }

    /**
     * Sets the value of the fileName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFileName(String value) {
        this.fileName = value;
    }

}
