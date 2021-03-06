
package com.ljwd.plms.web.wsdl.webservice.annexService;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for deleteAnnex complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="deleteAnnex">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="annexDto" type="{http://webservice.annex.mfbms.flinkmf.com/}annexDto" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "deleteAnnex", propOrder = {
    "annexDto"
})
public class DeleteAnnex {

    protected AnnexDto annexDto;

    /**
     * Gets the value of the annexDto property.
     * 
     * @return
     *     possible object is
     *     {@link AnnexDto }
     *     
     */
    public AnnexDto getAnnexDto() {
        return annexDto;
    }

    /**
     * Sets the value of the annexDto property.
     * 
     * @param value
     *     allowed object is
     *     {@link AnnexDto }
     *     
     */
    public void setAnnexDto(AnnexDto value) {
        this.annexDto = value;
    }

}
