
package com.ljwd.plms.web.wsdl.webservice.service;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for collectSettingDto complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="collectSettingDto">
 *   &lt;complexContent>
 *     &lt;extension base="{http://webservice.loan.mfbms.flinkmf.com/}baseVersionableCreatorAwareEntityDto">
 *       &lt;sequence>
 *       &lt;/sequence>
 *       &lt;attribute name="userId" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="weight" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="lastAssignTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="amountWeight" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="allTaskCount" type="{http://www.w3.org/2001/XMLSchema}double" />
 *       &lt;attribute name="remainderAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       &lt;attribute name="assignedClientCount" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="currentAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       &lt;attribute name="currentClientCount" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="randomValue" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="tempRemainDerAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       &lt;attribute name="tempClientCount" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="officeTel" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="userName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="orgname" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="messageName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "collectSettingDto")
public class CollectSettingDto
    extends BaseVersionableCreatorAwareEntityDto
{

    @XmlAttribute(name = "userId")
    protected String userId;
    @XmlAttribute(name = "weight")
    protected Integer weight;
    @XmlAttribute(name = "lastAssignTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastAssignTime;
    @XmlAttribute(name = "amountWeight")
    protected Integer amountWeight;
    @XmlAttribute(name = "allTaskCount")
    protected Double allTaskCount;
    @XmlAttribute(name = "remainderAmount")
    protected BigDecimal remainderAmount;
    @XmlAttribute(name = "assignedClientCount")
    protected Integer assignedClientCount;
    @XmlAttribute(name = "currentAmount")
    protected BigDecimal currentAmount;
    @XmlAttribute(name = "currentClientCount")
    protected Integer currentClientCount;
    @XmlAttribute(name = "randomValue")
    protected Integer randomValue;
    @XmlAttribute(name = "tempRemainDerAmount")
    protected BigDecimal tempRemainDerAmount;
    @XmlAttribute(name = "tempClientCount")
    protected Integer tempClientCount;
    @XmlAttribute(name = "officeTel")
    protected String officeTel;
    @XmlAttribute(name = "userName")
    protected String userName;
    @XmlAttribute(name = "orgname")
    protected String orgname;
    @XmlAttribute(name = "messageName")
    protected String messageName;

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
     * Gets the value of the weight property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getWeight() {
        return weight;
    }

    /**
     * Sets the value of the weight property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setWeight(Integer value) {
        this.weight = value;
    }

    /**
     * Gets the value of the lastAssignTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastAssignTime() {
        return lastAssignTime;
    }

    /**
     * Sets the value of the lastAssignTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastAssignTime(XMLGregorianCalendar value) {
        this.lastAssignTime = value;
    }

    /**
     * Gets the value of the amountWeight property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAmountWeight() {
        return amountWeight;
    }

    /**
     * Sets the value of the amountWeight property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAmountWeight(Integer value) {
        this.amountWeight = value;
    }

    /**
     * Gets the value of the allTaskCount property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getAllTaskCount() {
        return allTaskCount;
    }

    /**
     * Sets the value of the allTaskCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setAllTaskCount(Double value) {
        this.allTaskCount = value;
    }

    /**
     * Gets the value of the remainderAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRemainderAmount() {
        return remainderAmount;
    }

    /**
     * Sets the value of the remainderAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRemainderAmount(BigDecimal value) {
        this.remainderAmount = value;
    }

    /**
     * Gets the value of the assignedClientCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAssignedClientCount() {
        return assignedClientCount;
    }

    /**
     * Sets the value of the assignedClientCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAssignedClientCount(Integer value) {
        this.assignedClientCount = value;
    }

    /**
     * Gets the value of the currentAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCurrentAmount() {
        return currentAmount;
    }

    /**
     * Sets the value of the currentAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCurrentAmount(BigDecimal value) {
        this.currentAmount = value;
    }

    /**
     * Gets the value of the currentClientCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCurrentClientCount() {
        return currentClientCount;
    }

    /**
     * Sets the value of the currentClientCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCurrentClientCount(Integer value) {
        this.currentClientCount = value;
    }

    /**
     * Gets the value of the randomValue property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRandomValue() {
        return randomValue;
    }

    /**
     * Sets the value of the randomValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRandomValue(Integer value) {
        this.randomValue = value;
    }

    /**
     * Gets the value of the tempRemainDerAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTempRemainDerAmount() {
        return tempRemainDerAmount;
    }

    /**
     * Sets the value of the tempRemainDerAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTempRemainDerAmount(BigDecimal value) {
        this.tempRemainDerAmount = value;
    }

    /**
     * Gets the value of the tempClientCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTempClientCount() {
        return tempClientCount;
    }

    /**
     * Sets the value of the tempClientCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTempClientCount(Integer value) {
        this.tempClientCount = value;
    }

    /**
     * Gets the value of the officeTel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOfficeTel() {
        return officeTel;
    }

    /**
     * Sets the value of the officeTel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOfficeTel(String value) {
        this.officeTel = value;
    }

    /**
     * Gets the value of the userName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserName() {
        return userName;
    }

    /**
     * Sets the value of the userName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserName(String value) {
        this.userName = value;
    }

    /**
     * Gets the value of the orgname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrgname() {
        return orgname;
    }

    /**
     * Sets the value of the orgname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrgname(String value) {
        this.orgname = value;
    }

    /**
     * Gets the value of the messageName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessageName() {
        return messageName;
    }

    /**
     * Sets the value of the messageName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessageName(String value) {
        this.messageName = value;
    }

}
