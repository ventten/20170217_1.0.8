
package com.ljwd.plms.web.wsdl.webservice.annexService;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for bocUploadFilesParamDto complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="bocUploadFilesParamDto">
 *   &lt;complexContent>
 *     &lt;extension base="{http://webservice.annex.mfbms.flinkmf.com/}baseDataControlDto">
 *       &lt;sequence>
 *         &lt;element name="files" type="{http://webservice.annex.mfbms.flinkmf.com/}bocUploadFileItemDto" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="bocApplId" use="required" type="{http://www.w3.org/2001/XMLSchema}long" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "bocUploadFilesParamDto", propOrder = {
    "files"
})
public class BocUploadFilesParamDto
    extends BaseDataControlDto
{

    @XmlElement(nillable = true)
    protected List<BocUploadFileItemDto> files;
    @XmlAttribute(name = "bocApplId", required = true)
    protected long bocApplId;

    /**
     * Gets the value of the files property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the files property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFiles().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BocUploadFileItemDto }
     * 
     * 
     */
    public List<BocUploadFileItemDto> getFiles() {
        if (files == null) {
            files = new ArrayList<BocUploadFileItemDto>();
        }
        return this.files;
    }

    /**
     * Gets the value of the bocApplId property.
     * 
     */
    public long getBocApplId() {
        return bocApplId;
    }

    /**
     * Sets the value of the bocApplId property.
     * 
     */
    public void setBocApplId(long value) {
        this.bocApplId = value;
    }

}
