
package com.ljwd.plms.web.wsdl.webservice.service;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for refundApplySaveDto complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="refundApplySaveDto">
 *   &lt;complexContent>
 *     &lt;extension base="{http://webservice.loan.mfbms.flinkmf.com/}baseDataControlDto">
 *       &lt;sequence>
 *       &lt;/sequence>
 *       &lt;attribute name="rpmntId" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="receid" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="custBankId" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="refundBankCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="cntrctNo" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="refundAmt" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       &lt;attribute name="remark" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="refundType" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "refundApplySaveDto")
public class RefundApplySaveDto
    extends BaseDataControlDto
{

    @XmlAttribute(name = "rpmntId")
    protected Long rpmntId;
    @XmlAttribute(name = "receid")
    protected String receid;
    @XmlAttribute(name = "custBankId")
    protected Long custBankId;
    @XmlAttribute(name = "refundBankCode")
    protected String refundBankCode;
    @XmlAttribute(name = "cntrctNo")
    protected String cntrctNo;
    @XmlAttribute(name = "refundAmt")
    protected BigDecimal refundAmt;
    @XmlAttribute(name = "remark")
    protected String remark;
    @XmlAttribute(name = "refundType")
    protected String refundType;

    /**
     * Gets the value of the rpmntId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getRpmntId() {
        return rpmntId;
    }

    /**
     * Sets the value of the rpmntId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setRpmntId(Long value) {
        this.rpmntId = value;
    }

    /**
     * Gets the value of the receid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReceid() {
        return receid;
    }

    /**
     * Sets the value of the receid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReceid(String value) {
        this.receid = value;
    }

    /**
     * Gets the value of the custBankId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCustBankId() {
        return custBankId;
    }

    /**
     * Sets the value of the custBankId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCustBankId(Long value) {
        this.custBankId = value;
    }

    /**
     * Gets the value of the refundBankCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRefundBankCode() {
        return refundBankCode;
    }

    /**
     * Sets the value of the refundBankCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRefundBankCode(String value) {
        this.refundBankCode = value;
    }

    /**
     * Gets the value of the cntrctNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCntrctNo() {
        return cntrctNo;
    }

    /**
     * Sets the value of the cntrctNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCntrctNo(String value) {
        this.cntrctNo = value;
    }

    /**
     * Gets the value of the refundAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRefundAmt() {
        return refundAmt;
    }

    /**
     * Sets the value of the refundAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRefundAmt(BigDecimal value) {
        this.refundAmt = value;
    }

    /**
     * Gets the value of the remark property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRemark() {
        return remark;
    }

    /**
     * Sets the value of the remark property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRemark(String value) {
        this.remark = value;
    }

    /**
     * Gets the value of the refundType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRefundType() {
        return refundType;
    }

    /**
     * Sets the value of the refundType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRefundType(String value) {
        this.refundType = value;
    }

}
