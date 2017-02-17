
package com.ljwd.plms.web.wsdl.webservice.service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for simulateCalculateSummaryReceivableResultDto complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="simulateCalculateSummaryReceivableResultDto">
 *   &lt;complexContent>
 *     &lt;extension base="{http://webservice.loan.mfbms.flinkmf.com/}baseVersionableCreatorAwareEntityDto">
 *       &lt;sequence>
 *         &lt;element name="receivableDtos" type="{http://webservice.loan.mfbms.flinkmf.com/}receivableSearchResultDto" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="calculateClientInfoDto" type="{http://webservice.loan.mfbms.flinkmf.com/}calculateSummaryReceivableClientInfoDto" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="receivableSumaryAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       &lt;attribute name="overdueDays" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="remindPrincipal" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       &lt;attribute name="minReceivablePeriod" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="currentReceivablePeriod" type="{http://www.w3.org/2001/XMLSchema}int" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "simulateCalculateSummaryReceivableResultDto", propOrder = {
    "receivableDtos",
    "calculateClientInfoDto"
})
/**
 * 微贷返回的应收信息Dto
 * */
public class SimulateCalculateSummaryReceivableResultDto
    extends BaseVersionableCreatorAwareEntityDto
{

    @XmlElement(nillable = true)
    protected List<ReceivableSearchResultDto> receivableDtos;                   //每期应收记录
    protected CalculateSummaryReceivableClientInfoDto calculateClientInfoDto;
    @XmlAttribute(name = "receivableSumaryAmount")
    protected BigDecimal receivableSumaryAmount;                                //计算之后总的应收金额   应还总额合计
    @XmlAttribute(name = "overdueDays")
    protected Integer overdueDays;                                              //逾期天数
    @XmlAttribute(name = "remindPrincipal")
    protected BigDecimal remindPrincipal;                                      //剩余本金 保证金
    @XmlAttribute(name = "minReceivablePeriod")
    protected Integer minReceivablePeriod;                                      //最小逾期期数
    @XmlAttribute(name = "currentReceivablePeriod")
    protected Integer currentReceivablePeriod;                                  //当前所处期数
	/**
     * Gets the value of the receivableDtos property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the receivableDtos property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReceivableDtos().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ReceivableSearchResultDto }
     * 
     * 
     */
    public List<ReceivableSearchResultDto> getReceivableDtos() {
        if (receivableDtos == null) {
            receivableDtos = new ArrayList<ReceivableSearchResultDto>();
        }
        return this.receivableDtos;
    }

    /**
     * Gets the value of the calculateClientInfoDto property.
     * 
     * @return
     *     possible object is
     *     {@link CalculateSummaryReceivableClientInfoDto }
     *     
     */
    public CalculateSummaryReceivableClientInfoDto getCalculateClientInfoDto() {
        return calculateClientInfoDto;
    }

    /**
     * Sets the value of the calculateClientInfoDto property.
     * 
     * @param value
     *     allowed object is
     *     {@link CalculateSummaryReceivableClientInfoDto }
     *     
     */
    public void setCalculateClientInfoDto(CalculateSummaryReceivableClientInfoDto value) {
        this.calculateClientInfoDto = value;
    }

    /**
     * Gets the value of the receivableSumaryAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getReceivableSumaryAmount() {
        return receivableSumaryAmount;
    }

    /**
     * Sets the value of the receivableSumaryAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setReceivableSumaryAmount(BigDecimal value) {
        this.receivableSumaryAmount = value;
    }

    /**
     * Gets the value of the overdueDays property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getOverdueDays() {
        return overdueDays;
    }

    /**
     * Sets the value of the overdueDays property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setOverdueDays(Integer value) {
        this.overdueDays = value;
    }

    /**
     * Gets the value of the remindPrincipal property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRemindPrincipal() {
        return remindPrincipal;
    }

    /**
     * Sets the value of the remindPrincipal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRemindPrincipal(BigDecimal value) {
        this.remindPrincipal = value;
    }

    /**
     * Gets the value of the minReceivablePeriod property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMinReceivablePeriod() {
        return minReceivablePeriod;
    }

    /**
     * Sets the value of the minReceivablePeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMinReceivablePeriod(Integer value) {
        this.minReceivablePeriod = value;
    }

    /**
     * Gets the value of the currentReceivablePeriod property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCurrentReceivablePeriod() {
        return currentReceivablePeriod;
    }

    /**
     * Sets the value of the currentReceivablePeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCurrentReceivablePeriod(Integer value) {
        this.currentReceivablePeriod = value;
    }

}
