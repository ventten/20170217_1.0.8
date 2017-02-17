
package com.ljwd.plms.web.wsdl.webservice.annexService;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for uploadStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="uploadStatus">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="UNUPLOADED"/>
 *     &lt;enumeration value="LOCAL_UPLOADED"/>
 *     &lt;enumeration value="REMOTE_UPLOADED"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "uploadStatus")
@XmlEnum
public enum UploadStatus {

    UNUPLOADED,
    LOCAL_UPLOADED,
    REMOTE_UPLOADED;

    public String value() {
        return name();
    }

    public static UploadStatus fromValue(String v) {
        return valueOf(v);
    }

}
