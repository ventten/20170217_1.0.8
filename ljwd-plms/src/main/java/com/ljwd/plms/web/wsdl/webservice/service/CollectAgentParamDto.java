
package com.ljwd.plms.web.wsdl.webservice.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for collectAgentParamDto complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="collectAgentParamDto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *       &lt;/sequence>
 *       &lt;attribute name="agent" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="agentStartDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="agentEndDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "collectAgentParamDto")
public class CollectAgentParamDto {

    @XmlAttribute(name = "agent")
    protected String agent;
    @XmlAttribute(name = "agentStartDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar agentStartDate;
    @XmlAttribute(name = "agentEndDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar agentEndDate;

    /**
     * Gets the value of the agent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgent() {
        return agent;
    }

    /**
     * Sets the value of the agent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgent(String value) {
        this.agent = value;
    }

    /**
     * Gets the value of the agentStartDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getAgentStartDate() {
        return agentStartDate;
    }

    /**
     * Sets the value of the agentStartDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setAgentStartDate(XMLGregorianCalendar value) {
        this.agentStartDate = value;
    }

    /**
     * Gets the value of the agentEndDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getAgentEndDate() {
        return agentEndDate;
    }

    /**
     * Sets the value of the agentEndDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setAgentEndDate(XMLGregorianCalendar value) {
        this.agentEndDate = value;
    }

}
