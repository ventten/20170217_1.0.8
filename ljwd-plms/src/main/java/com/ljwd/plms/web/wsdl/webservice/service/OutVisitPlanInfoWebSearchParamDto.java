
package com.ljwd.plms.web.wsdl.webservice.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for outVisitPlanInfoWebSearchParamDto complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="outVisitPlanInfoWebSearchParamDto">
 *   &lt;complexContent>
 *     &lt;extension base="{http://webservice.loan.mfbms.flinkmf.com/}baseDataControlDto">
 *       &lt;sequence>
 *       &lt;/sequence>
 *       &lt;attribute name="userId" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="startTtime" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="applyId" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="searchOrSign" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="dtlId" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "outVisitPlanInfoWebSearchParamDto")
public class OutVisitPlanInfoWebSearchParamDto
    extends BaseDataControlDto
{

    @XmlAttribute(name = "userId")
    protected String userId;
    @XmlAttribute(name = "startTtime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar startTtime;
    @XmlAttribute(name = "applyId")
    protected String applyId;
    @XmlAttribute(name = "searchOrSign")
    protected String searchOrSign;
    @XmlAttribute(name = "dtlId")
    protected String dtlId;

    /**
     * Gets the value of the userId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserId() {
        return userId;
    }

    /**
     * Sets the value of the userId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserId(String value) {
        this.userId = value;
    }

    /**
     * Gets the value of the startTtime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStartTtime() {
        return startTtime;
    }

    /**
     * Sets the value of the startTtime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStartTtime(XMLGregorianCalendar value) {
        this.startTtime = value;
    }

    /**
     * Gets the value of the applyId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApplyId() {
        return applyId;
    }

    /**
     * Sets the value of the applyId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApplyId(String value) {
        this.applyId = value;
    }

    /**
     * Gets the value of the searchOrSign property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSearchOrSign() {
        return searchOrSign;
    }

    /**
     * Sets the value of the searchOrSign property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSearchOrSign(String value) {
        this.searchOrSign = value;
    }

    /**
     * Gets the value of the dtlId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDtlId() {
        return dtlId;
    }

    /**
     * Sets the value of the dtlId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDtlId(String value) {
        this.dtlId = value;
    }

}
