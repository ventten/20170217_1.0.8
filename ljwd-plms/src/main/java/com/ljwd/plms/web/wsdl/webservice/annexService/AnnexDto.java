
package com.ljwd.plms.web.wsdl.webservice.annexService;

import javax.activation.DataHandler;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlMimeType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for annexDto complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="annexDto">
 *   &lt;complexContent>
 *     &lt;extension base="{http://webservice.annex.mfbms.flinkmf.com/}baseVersionableCreatorAwareEntityDto">
 *       &lt;sequence>
 *         &lt;element name="annexContent" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
 *         &lt;element name="annexHandler" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="topic" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="originalName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="fileName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="annexType" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="annexStyle" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="remark" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="uploadBy" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="uploadName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="uploadTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="fileSize" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="fileOwner" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="applicationId" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="path" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "annexDto", propOrder = {
    "annexContent",
    "annexHandler"
})
public class AnnexDto
    extends BaseVersionableCreatorAwareEntityDto
{

    protected byte[] annexContent;
    @XmlMimeType("application/octet-stream")
    protected DataHandler annexHandler;
    @XmlAttribute(name = "id")
    protected Long id;
    @XmlAttribute(name = "topic")
    protected String topic;
    @XmlAttribute(name = "originalName")
    protected String originalName;
    @XmlAttribute(name = "fileName")
    protected String fileName;
    @XmlAttribute(name = "annexType")
    protected String annexType;
    @XmlAttribute(name = "annexStyle")
    protected String annexStyle;
    @XmlAttribute(name = "remark")
    protected String remark;
    @XmlAttribute(name = "uploadBy")
    protected String uploadBy;
    @XmlAttribute(name = "uploadName")
    protected String uploadName;
    @XmlAttribute(name = "uploadTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar uploadTime;
    @XmlAttribute(name = "fileSize")
    protected Long fileSize;
    @XmlAttribute(name = "fileOwner")
    protected String fileOwner;
    @XmlAttribute(name = "applicationId")
    protected Long applicationId;
    @XmlAttribute(name = "path")
    protected String path;

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
     * Gets the value of the annexHandler property.
     * 
     * @return
     *     possible object is
     *     {@link javax.activation.DataHandler }
     *     
     */
    public DataHandler getAnnexHandler() {
        return annexHandler;
    }

    /**
     * Sets the value of the annexHandler property.
     * 
     * @param value
     *     allowed object is
     *     {@link javax.activation.DataHandler }
     *     
     */
    public void setAnnexHandler(DataHandler value) {
        this.annexHandler = value;
    }

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
     * Gets the value of the topic property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTopic() {
        return topic;
    }

    /**
     * Sets the value of the topic property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTopic(String value) {
        this.topic = value;
    }

    /**
     * Gets the value of the originalName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOriginalName() {
        return originalName;
    }

    /**
     * Sets the value of the originalName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOriginalName(String value) {
        this.originalName = value;
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

    /**
     * Gets the value of the annexType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAnnexType() {
        return annexType;
    }

    /**
     * Sets the value of the annexType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAnnexType(String value) {
        this.annexType = value;
    }

    /**
     * Gets the value of the annexStyle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAnnexStyle() {
        return annexStyle;
    }

    /**
     * Sets the value of the annexStyle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAnnexStyle(String value) {
        this.annexStyle = value;
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
     * Gets the value of the uploadBy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUploadBy() {
        return uploadBy;
    }

    /**
     * Sets the value of the uploadBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUploadBy(String value) {
        this.uploadBy = value;
    }

    /**
     * Gets the value of the uploadName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUploadName() {
        return uploadName;
    }

    /**
     * Sets the value of the uploadName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUploadName(String value) {
        this.uploadName = value;
    }

    /**
     * Gets the value of the uploadTime property.
     * 
     * @return
     *     possible object is
     *     {@link javax.xml.datatype.XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getUploadTime() {
        return uploadTime;
    }

    /**
     * Sets the value of the uploadTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link javax.xml.datatype.XMLGregorianCalendar }
     *     
     */
    public void setUploadTime(XMLGregorianCalendar value) {
        this.uploadTime = value;
    }

    /**
     * Gets the value of the fileSize property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getFileSize() {
        return fileSize;
    }

    /**
     * Sets the value of the fileSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setFileSize(Long value) {
        this.fileSize = value;
    }

    /**
     * Gets the value of the fileOwner property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFileOwner() {
        return fileOwner;
    }

    /**
     * Sets the value of the fileOwner property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFileOwner(String value) {
        this.fileOwner = value;
    }

    /**
     * Gets the value of the applicationId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getApplicationId() {
        return applicationId;
    }

    /**
     * Sets the value of the applicationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setApplicationId(Long value) {
        this.applicationId = value;
    }

    /**
     * Gets the value of the path property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPath() {
        return path;
    }

    /**
     * Sets the value of the path property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPath(String value) {
        this.path = value;
    }

}
