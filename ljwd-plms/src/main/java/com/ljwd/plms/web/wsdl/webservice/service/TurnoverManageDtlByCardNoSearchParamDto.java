
package com.ljwd.plms.web.wsdl.webservice.service;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for turnoverManageDtlByCardNoSearchParamDto complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="turnoverManageDtlByCardNoSearchParamDto">
 *   &lt;complexContent>
 *     &lt;extension base="{http://webservice.loan.mfbms.flinkmf.com/}baseDataControlDto">
 *       &lt;sequence>
 *       &lt;/sequence>
 *       &lt;attribute name="applId" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="applyCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="turnoverCardno" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="delMode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="delAbstract">
 *         &lt;simpleType>
 *           &lt;list itemType="{http://www.w3.org/2001/XMLSchema}string" />
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "turnoverManageDtlByCardNoSearchParamDto")
public class TurnoverManageDtlByCardNoSearchParamDto
    extends BaseDataControlDto
{

    @XmlAttribute(name = "applId")
    protected Long applId;
    @XmlAttribute(name = "applyCode")
    protected String applyCode;
    @XmlAttribute(name = "turnoverCardno")
    protected String turnoverCardno;
    @XmlAttribute(name = "delMode")
    protected String delMode;
    @XmlAttribute(name = "delAbstract")
    protected List<String> delAbstract;

    /**
     * Gets the value of the applId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getApplId() {
        return applId;
    }

    /**
     * Sets the value of the applId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setApplId(Long value) {
        this.applId = value;
    }

    /**
     * Gets the value of the applyCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApplyCode() {
        return applyCode;
    }

    /**
     * Sets the value of the applyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApplyCode(String value) {
        this.applyCode = value;
    }

    /**
     * Gets the value of the turnoverCardno property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTurnoverCardno() {
        return turnoverCardno;
    }

    /**
     * Sets the value of the turnoverCardno property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTurnoverCardno(String value) {
        this.turnoverCardno = value;
    }

    /**
     * Gets the value of the delMode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDelMode() {
        return delMode;
    }

    /**
     * Sets the value of the delMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDelMode(String value) {
        this.delMode = value;
    }

    /**
     * Gets the value of the delAbstract property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the delAbstract property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDelAbstract().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getDelAbstract() {
        if (delAbstract == null) {
            delAbstract = new ArrayList<String>();
        }
        return this.delAbstract;
    }

}
