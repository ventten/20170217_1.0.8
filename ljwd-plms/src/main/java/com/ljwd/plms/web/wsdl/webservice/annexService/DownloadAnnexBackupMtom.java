
package com.ljwd.plms.web.wsdl.webservice.annexService;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for downloadAnnexBackupMtom complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="downloadAnnexBackupMtom">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="annexId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "downloadAnnexBackupMtom", propOrder = {
    "annexId"
})
public class DownloadAnnexBackupMtom {

    protected long annexId;

    /**
     * Gets the value of the annexId property.
     * 
     */
    public long getAnnexId() {
        return annexId;
    }

    /**
     * Sets the value of the annexId property.
     * 
     */
    public void setAnnexId(long value) {
        this.annexId = value;
    }

}
