
package com.ljwd.plms.web.wsdl.webservice.service;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for vehicleInfoSearchDto complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="vehicleInfoSearchDto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *       &lt;/sequence>
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="applicationInfoId" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="licenseNo" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="frameNo" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="model" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="productionDate" type="{http://www.w3.org/2001/XMLSchema}date" />
 *       &lt;attribute name="price" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       &lt;attribute name="mortgageState" type="{http://webservice.loan.mfbms.flinkmf.com/}vehicleMortgageState" />
 *       &lt;attribute name="brand" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="mileage" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       &lt;attribute name="engineNo" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="registryDate" type="{http://www.w3.org/2001/XMLSchema}date" />
 *       &lt;attribute name="trafficCompulsoryInsurance" type="{http://webservice.loan.mfbms.flinkmf.com/}insurancePurchaseStatus" />
 *       &lt;attribute name="tciMaturityDate" type="{http://www.w3.org/2001/XMLSchema}date" />
 *       &lt;attribute name="commercialInsurance" type="{http://webservice.loan.mfbms.flinkmf.com/}insurancePurchaseStatus" />
 *       &lt;attribute name="miMaturityDate" type="{http://www.w3.org/2001/XMLSchema}date" />
 *       &lt;attribute name="ownerType" type="{http://webservice.loan.mfbms.flinkmf.com/}vehicleOwnerType" />
 *       &lt;attribute name="purposeType" type="{http://webservice.loan.mfbms.flinkmf.com/}vehiclePurposeType" />
 *       &lt;attribute name="estimationAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       &lt;attribute name="loanRatio" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       &lt;attribute name="totalAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       &lt;attribute name="suggestAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       &lt;attribute name="remark" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="agencyAcNno" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="agencyAcName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="agencyAcBank" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="transferTimes" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="agencyAcBankNo" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "vehicleInfoSearchDto")
public class VehicleInfoSearchDto {

    @XmlAttribute(name = "id")
    protected Long id;
    @XmlAttribute(name = "applicationInfoId")
    protected Long applicationInfoId;
    @XmlAttribute(name = "licenseNo")
    protected String licenseNo;
    @XmlAttribute(name = "frameNo")
    protected String frameNo;
    @XmlAttribute(name = "model")
    protected String model;
    @XmlAttribute(name = "productionDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar productionDate;
    @XmlAttribute(name = "price")
    protected BigDecimal price;
    @XmlAttribute(name = "mortgageState")
    protected VehicleMortgageState mortgageState;
    @XmlAttribute(name = "brand")
    protected String brand;
    @XmlAttribute(name = "mileage")
    protected BigDecimal mileage;
    @XmlAttribute(name = "engineNo")
    protected String engineNo;
    @XmlAttribute(name = "registryDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar registryDate;
    @XmlAttribute(name = "trafficCompulsoryInsurance")
    protected InsurancePurchaseStatus trafficCompulsoryInsurance;
    @XmlAttribute(name = "tciMaturityDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar tciMaturityDate;
    @XmlAttribute(name = "commercialInsurance")
    protected InsurancePurchaseStatus commercialInsurance;
    @XmlAttribute(name = "miMaturityDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar miMaturityDate;
    @XmlAttribute(name = "ownerType")
    protected VehicleOwnerType ownerType;
    @XmlAttribute(name = "purposeType")
    protected VehiclePurposeType purposeType;
    @XmlAttribute(name = "estimationAmount")
    protected BigDecimal estimationAmount;
    @XmlAttribute(name = "loanRatio")
    protected BigDecimal loanRatio;
    @XmlAttribute(name = "totalAmount")
    protected BigDecimal totalAmount;
    @XmlAttribute(name = "suggestAmount")
    protected BigDecimal suggestAmount;
    @XmlAttribute(name = "remark")
    protected String remark;
    @XmlAttribute(name = "agencyAcNno")
    protected String agencyAcNno;
    @XmlAttribute(name = "agencyAcName")
    protected String agencyAcName;
    @XmlAttribute(name = "agencyAcBank")
    protected String agencyAcBank;
    @XmlAttribute(name = "transferTimes")
    protected Integer transferTimes;
    @XmlAttribute(name = "agencyAcBankNo")
    protected String agencyAcBankNo;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setId(Long value) {
        this.id = value;
    }

    /**
     * Gets the value of the applicationInfoId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getApplicationInfoId() {
        return applicationInfoId;
    }

    /**
     * Sets the value of the applicationInfoId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setApplicationInfoId(Long value) {
        this.applicationInfoId = value;
    }

    /**
     * Gets the value of the licenseNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLicenseNo() {
        return licenseNo;
    }

    /**
     * Sets the value of the licenseNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLicenseNo(String value) {
        this.licenseNo = value;
    }

    /**
     * Gets the value of the frameNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFrameNo() {
        return frameNo;
    }

    /**
     * Sets the value of the frameNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFrameNo(String value) {
        this.frameNo = value;
    }

    /**
     * Gets the value of the model property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModel() {
        return model;
    }

    /**
     * Sets the value of the model property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModel(String value) {
        this.model = value;
    }

    /**
     * Gets the value of the productionDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getProductionDate() {
        return productionDate;
    }

    /**
     * Sets the value of the productionDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setProductionDate(XMLGregorianCalendar value) {
        this.productionDate = value;
    }

    /**
     * Gets the value of the price property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPrice() {
        return price;
    }

    /**
     * Sets the value of the price property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPrice(BigDecimal value) {
        this.price = value;
    }

    /**
     * Gets the value of the mortgageState property.
     * 
     * @return
     *     possible object is
     *     {@link VehicleMortgageState }
     *     
     */
    public VehicleMortgageState getMortgageState() {
        return mortgageState;
    }

    /**
     * Sets the value of the mortgageState property.
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleMortgageState }
     *     
     */
    public void setMortgageState(VehicleMortgageState value) {
        this.mortgageState = value;
    }

    /**
     * Gets the value of the brand property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBrand() {
        return brand;
    }

    /**
     * Sets the value of the brand property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBrand(String value) {
        this.brand = value;
    }

    /**
     * Gets the value of the mileage property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMileage() {
        return mileage;
    }

    /**
     * Sets the value of the mileage property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMileage(BigDecimal value) {
        this.mileage = value;
    }

    /**
     * Gets the value of the engineNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEngineNo() {
        return engineNo;
    }

    /**
     * Sets the value of the engineNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEngineNo(String value) {
        this.engineNo = value;
    }

    /**
     * Gets the value of the registryDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRegistryDate() {
        return registryDate;
    }

    /**
     * Sets the value of the registryDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRegistryDate(XMLGregorianCalendar value) {
        this.registryDate = value;
    }

    /**
     * Gets the value of the trafficCompulsoryInsurance property.
     * 
     * @return
     *     possible object is
     *     {@link InsurancePurchaseStatus }
     *     
     */
    public InsurancePurchaseStatus getTrafficCompulsoryInsurance() {
        return trafficCompulsoryInsurance;
    }

    /**
     * Sets the value of the trafficCompulsoryInsurance property.
     * 
     * @param value
     *     allowed object is
     *     {@link InsurancePurchaseStatus }
     *     
     */
    public void setTrafficCompulsoryInsurance(InsurancePurchaseStatus value) {
        this.trafficCompulsoryInsurance = value;
    }

    /**
     * Gets the value of the tciMaturityDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTciMaturityDate() {
        return tciMaturityDate;
    }

    /**
     * Sets the value of the tciMaturityDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTciMaturityDate(XMLGregorianCalendar value) {
        this.tciMaturityDate = value;
    }

    /**
     * Gets the value of the commercialInsurance property.
     * 
     * @return
     *     possible object is
     *     {@link InsurancePurchaseStatus }
     *     
     */
    public InsurancePurchaseStatus getCommercialInsurance() {
        return commercialInsurance;
    }

    /**
     * Sets the value of the commercialInsurance property.
     * 
     * @param value
     *     allowed object is
     *     {@link InsurancePurchaseStatus }
     *     
     */
    public void setCommercialInsurance(InsurancePurchaseStatus value) {
        this.commercialInsurance = value;
    }

    /**
     * Gets the value of the miMaturityDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getMiMaturityDate() {
        return miMaturityDate;
    }

    /**
     * Sets the value of the miMaturityDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setMiMaturityDate(XMLGregorianCalendar value) {
        this.miMaturityDate = value;
    }

    /**
     * Gets the value of the ownerType property.
     * 
     * @return
     *     possible object is
     *     {@link VehicleOwnerType }
     *     
     */
    public VehicleOwnerType getOwnerType() {
        return ownerType;
    }

    /**
     * Sets the value of the ownerType property.
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleOwnerType }
     *     
     */
    public void setOwnerType(VehicleOwnerType value) {
        this.ownerType = value;
    }

    /**
     * Gets the value of the purposeType property.
     * 
     * @return
     *     possible object is
     *     {@link VehiclePurposeType }
     *     
     */
    public VehiclePurposeType getPurposeType() {
        return purposeType;
    }

    /**
     * Sets the value of the purposeType property.
     * 
     * @param value
     *     allowed object is
     *     {@link VehiclePurposeType }
     *     
     */
    public void setPurposeType(VehiclePurposeType value) {
        this.purposeType = value;
    }

    /**
     * Gets the value of the estimationAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getEstimationAmount() {
        return estimationAmount;
    }

    /**
     * Sets the value of the estimationAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setEstimationAmount(BigDecimal value) {
        this.estimationAmount = value;
    }

    /**
     * Gets the value of the loanRatio property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getLoanRatio() {
        return loanRatio;
    }

    /**
     * Sets the value of the loanRatio property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setLoanRatio(BigDecimal value) {
        this.loanRatio = value;
    }

    /**
     * Gets the value of the totalAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalAmount() {
        return totalAmount;
    }

    /**
     * Sets the value of the totalAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotalAmount(BigDecimal value) {
        this.totalAmount = value;
    }

    /**
     * Gets the value of the suggestAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSuggestAmount() {
        return suggestAmount;
    }

    /**
     * Sets the value of the suggestAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSuggestAmount(BigDecimal value) {
        this.suggestAmount = value;
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
     * Gets the value of the agencyAcNno property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgencyAcNno() {
        return agencyAcNno;
    }

    /**
     * Sets the value of the agencyAcNno property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgencyAcNno(String value) {
        this.agencyAcNno = value;
    }

    /**
     * Gets the value of the agencyAcName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgencyAcName() {
        return agencyAcName;
    }

    /**
     * Sets the value of the agencyAcName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgencyAcName(String value) {
        this.agencyAcName = value;
    }

    /**
     * Gets the value of the agencyAcBank property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgencyAcBank() {
        return agencyAcBank;
    }

    /**
     * Sets the value of the agencyAcBank property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgencyAcBank(String value) {
        this.agencyAcBank = value;
    }

    /**
     * Gets the value of the transferTimes property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTransferTimes() {
        return transferTimes;
    }

    /**
     * Sets the value of the transferTimes property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTransferTimes(Integer value) {
        this.transferTimes = value;
    }

    /**
     * Gets the value of the agencyAcBankNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgencyAcBankNo() {
        return agencyAcBankNo;
    }

    /**
     * Sets the value of the agencyAcBankNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgencyAcBankNo(String value) {
        this.agencyAcBankNo = value;
    }

}
