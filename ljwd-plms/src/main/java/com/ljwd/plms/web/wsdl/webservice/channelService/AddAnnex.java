
package com.ljwd.plms.web.wsdl.webservice.channelService;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for addAnnex complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="addAnnex">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="annexDto" type="{http://webservice.loan.mfbms.flinkmf.com/}chAnnexDto" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "addAnnex", propOrder = {
    "annexDto"
})
public class AddAnnex {

    protected ChAnnexDto annexDto;

    /**
     * Gets the value of the annexDto property.
     * 
     * @return
     *     possible object is
     *     {@link ChAnnexDto }
     *     
     */
    public ChAnnexDto getAnnexDto() {
        return annexDto;
    }

    /**
     * Sets the value of the annexDto property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChAnnexDto }
     *     
     */
    public void setAnnexDto(ChAnnexDto value) {
        this.annexDto = value;
    }

}
