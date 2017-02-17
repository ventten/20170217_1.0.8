package com.ljwd.plms.web.model.messageSystem;

import java.math.BigDecimal;
import java.util.Date;

/**
 * 
* @ClassName: Customer 
* @Description: TODO(贷款申请人基本信息表 CL_CUST) 
* @author A18ccms a18ccms_gmail_com 
* @date 2016年9月1日 上午11:36:07 
*
 */
public class Customer {

	private Long id;
	private Long applId;//贷款申请ID
	private String customerName; //姓名
	private Integer age;
	private String gender; //性别
	private String marriage; //婚姻状况.未婚，已婚，离婚,分居,丧偶，其它
	private String idTypeCode; //证件类型(DocTYPE)
	private String idCardNo; //证件号码(docno)
	private String idCardIssuedBy; //发证机关
	private Date idCardEndDate;  //证件到期日
	private String socialSecurity;  //社保卡号
	private String tempIdNo;  //居住证号(tempdocno)
	private Date birthday;  //出生日期
	private String birthPlace;  //籍贯
	private String household;  //户口所在地
	private String education;  //教育程度
	private String mobile;  //移动电话
	private String mobile2;  //移动号码2
	private String mobile3;  //移动号码3
	private String mailAddress;  //Email
	private String mailType;  //邮箱地址类型. (HOUSE, UNIT) (OLD, 1.住宅, 2.单位)
	private String qqNo;  //QQ号码
	private String liveTime;  //起始居住时间
	private String zipCode;  //邮政编码
	private Boolean isKnown;  //家庭知悉此贷款;Y是, N否
	private Boolean childrenInSz;  //小孩是否在深圳
	private String spouseName;  //配偶姓名
	private String spouseIdCardNo;  //配偶身份证号码
	private Integer spouseAge;  //配偶年龄
	private String spouseTelephone;  //配偶电话1
	private String spouseTelephone2;  //配偶电话2
	private String spouseTelephone3;  //配偶电话3
	private String spouseUnit;  //配偶单位
	private String spouseUnitPosition;  //配偶职位(old.SPOUSEDUTIES)
	private String spouseUnitAddress;  //配偶单位地址(old:spouseaddr)
	private String spouseUnitDepartment;  //配偶所在部门
	private String spouseUnitTelephone;  //配偶单位电话
	private BigDecimal spouseMonthlyIncome;  //配偶月收入(SPOUSE_SALARY)
	private String estatePurchaseMode;  //购买方式. ONE_STOP_BUY, MORTGAGE. (old: 1 一次性支付；2 按揭购买 ):ESTATE_BUY_MODE)
	private BigDecimal estateLoanAmount;  //总额(ESTATEPRICE)
	private BigDecimal estateMonthlyRepayment;  //月付贷款
	private String carPurchaseMethod;  //车辆购买方式. ONE_STOP_BUY, MORTGAGE. old: 1一次性 2按揭 CAR_BUY_MODE
	private BigDecimal carLoanAmount;  //车辆购买贷款总额(CARPRICE)
	private BigDecimal carMonthlyRepayment;  //车辆月付贷款
	private Integer creditCardTotalNumber;  //信用卡张数
	private BigDecimal creditCardTotalLimit;  //信用卡总信用额度
	private String creditCardOneBank;  //其中一张信用卡的银行名称ONEBANKNAME
	private String creditCardNo;  //信用卡卡号
	private BigDecimal creditCardOneLimit;  //其中一张银行信用卡额度ONEBANKMAXAMT
	private String investment;  //投资项目INVESTMENTPRO
	private String remark;  //remarkt
	private String customerType;  //客户类型. SELF_EMPLOYED(自雇), SALARIED(受薪)
	private String houseInfoType;  //房产信息.有房有按揭、有房无按揭、无房、抵押担保公司或个人. LOV table :L_HOUSE_INFO_TYPE
	private Integer houseNumer;  //房产 数目
	private BigDecimal houseEstimateAmount;  //评估金额
	private BigDecimal houseLoanAmount;  //贷款金额
	private BigDecimal houseRepayAmount;  //月供金额
	private Date houseMortgageDate;  //抵押时间
	private String houseMortgageBank;  //抵押银行
	private String houseCertNo;  //房产证号
	private Long idAddressProvinceId;  //户口所在地地址所在省
	private Long idAddressCityId;
	private Long idAddressAreaId;
	private String idAddressDetails;
    private Long spouseIdAddrProvinceId;
    private Long spouseIdAddrCityId;
    private Long spouseIdAddrAreaId;
    private String spouseIdAddrDetails;
    private String spouseIdAddr;
    private Long spouseUnitAddrProvinceId;
    private Long spouseUnitAddrCityId;
    private Long spouseUnitAddrAreaId;
    private String spouseUnitAddrDetails;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getApplId() {
		return applId;
	}
	public void setApplId(Long applId) {
		this.applId = applId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getMarriage() {
		return marriage;
	}
	public void setMarriage(String marriage) {
		this.marriage = marriage;
	}
	public String getIdTypeCode() {
		return idTypeCode;
	}
	public void setIdTypeCode(String idTypeCode) {
		this.idTypeCode = idTypeCode;
	}
	public String getIdCardNo() {
		return idCardNo;
	}
	public void setIdCardNo(String idCardNo) {
		this.idCardNo = idCardNo;
	}
	public String getIdCardIssuedBy() {
		return idCardIssuedBy;
	}
	public void setIdCardIssuedBy(String idCardIssuedBy) {
		this.idCardIssuedBy = idCardIssuedBy;
	}
	public Date getIdCardEndDate() {
		return idCardEndDate;
	}
	public void setIdCardEndDate(Date idCardEndDate) {
		this.idCardEndDate = idCardEndDate;
	}
	public String getSocialSecurity() {
		return socialSecurity;
	}
	public void setSocialSecurity(String socialSecurity) {
		this.socialSecurity = socialSecurity;
	}
	public String getTempIdNo() {
		return tempIdNo;
	}
	public void setTempIdNo(String tempIdNo) {
		this.tempIdNo = tempIdNo;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	public String getBirthPlace() {
		return birthPlace;
	}
	public void setBirthPlace(String birthPlace) {
		this.birthPlace = birthPlace;
	}
	public String getHousehold() {
		return household;
	}
	public void setHousehold(String household) {
		this.household = household;
	}
	public String getEducation() {
		return education;
	}
	public void setEducation(String education) {
		this.education = education;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getMobile2() {
		return mobile2;
	}
	public void setMobile2(String mobile2) {
		this.mobile2 = mobile2;
	}
	public String getMobile3() {
		return mobile3;
	}
	public void setMobile3(String mobile3) {
		this.mobile3 = mobile3;
	}
	public String getMailAddress() {
		return mailAddress;
	}
	public void setMailAddress(String mailAddress) {
		this.mailAddress = mailAddress;
	}
	public String getMailType() {
		return mailType;
	}
	public void setMailType(String mailType) {
		this.mailType = mailType;
	}
	public String getQqNo() {
		return qqNo;
	}
	public void setQqNo(String qqNo) {
		this.qqNo = qqNo;
	}
	public String getLiveTime() {
		return liveTime;
	}
	public void setLiveTime(String liveTime) {
		this.liveTime = liveTime;
	}
	public String getZipCode() {
		return zipCode;
	}
	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}
	public Boolean getIsKnown() {
		return isKnown;
	}
	public void setIsKnown(Boolean isKnown) {
		this.isKnown = isKnown;
	}
	public Boolean getChildrenInSz() {
		return childrenInSz;
	}
	public void setChildrenInSz(Boolean childrenInSz) {
		this.childrenInSz = childrenInSz;
	}
	public String getSpouseName() {
		return spouseName;
	}
	public void setSpouseName(String spouseName) {
		this.spouseName = spouseName;
	}
	public String getSpouseIdCardNo() {
		return spouseIdCardNo;
	}
	public void setSpouseIdCardNo(String spouseIdCardNo) {
		this.spouseIdCardNo = spouseIdCardNo;
	}
	public Integer getSpouseAge() {
		return spouseAge;
	}
	public void setSpouseAge(Integer spouseAge) {
		this.spouseAge = spouseAge;
	}
	public String getSpouseTelephone() {
		return spouseTelephone;
	}
	public void setSpouseTelephone(String spouseTelephone) {
		this.spouseTelephone = spouseTelephone;
	}
	public String getSpouseTelephone2() {
		return spouseTelephone2;
	}
	public void setSpouseTelephone2(String spouseTelephone2) {
		this.spouseTelephone2 = spouseTelephone2;
	}
	public String getSpouseTelephone3() {
		return spouseTelephone3;
	}
	public void setSpouseTelephone3(String spouseTelephone3) {
		this.spouseTelephone3 = spouseTelephone3;
	}
	public String getSpouseUnit() {
		return spouseUnit;
	}
	public void setSpouseUnit(String spouseUnit) {
		this.spouseUnit = spouseUnit;
	}
	public String getSpouseUnitPosition() {
		return spouseUnitPosition;
	}
	public void setSpouseUnitPosition(String spouseUnitPosition) {
		this.spouseUnitPosition = spouseUnitPosition;
	}
	public String getSpouseUnitAddress() {
		return spouseUnitAddress;
	}
	public void setSpouseUnitAddress(String spouseUnitAddress) {
		this.spouseUnitAddress = spouseUnitAddress;
	}
	public String getSpouseUnitDepartment() {
		return spouseUnitDepartment;
	}
	public void setSpouseUnitDepartment(String spouseUnitDepartment) {
		this.spouseUnitDepartment = spouseUnitDepartment;
	}
	public String getSpouseUnitTelephone() {
		return spouseUnitTelephone;
	}
	public void setSpouseUnitTelephone(String spouseUnitTelephone) {
		this.spouseUnitTelephone = spouseUnitTelephone;
	}
	public BigDecimal getSpouseMonthlyIncome() {
		return spouseMonthlyIncome;
	}
	public void setSpouseMonthlyIncome(BigDecimal spouseMonthlyIncome) {
		this.spouseMonthlyIncome = spouseMonthlyIncome;
	}
	public String getEstatePurchaseMode() {
		return estatePurchaseMode;
	}
	public void setEstatePurchaseMode(String estatePurchaseMode) {
		this.estatePurchaseMode = estatePurchaseMode;
	}
	public BigDecimal getEstateLoanAmount() {
		return estateLoanAmount;
	}
	public void setEstateLoanAmount(BigDecimal estateLoanAmount) {
		this.estateLoanAmount = estateLoanAmount;
	}
	public BigDecimal getEstateMonthlyRepayment() {
		return estateMonthlyRepayment;
	}
	public void setEstateMonthlyRepayment(BigDecimal estateMonthlyRepayment) {
		this.estateMonthlyRepayment = estateMonthlyRepayment;
	}
	public String getCarPurchaseMethod() {
		return carPurchaseMethod;
	}
	public void setCarPurchaseMethod(String carPurchaseMethod) {
		this.carPurchaseMethod = carPurchaseMethod;
	}
	public BigDecimal getCarLoanAmount() {
		return carLoanAmount;
	}
	public void setCarLoanAmount(BigDecimal carLoanAmount) {
		this.carLoanAmount = carLoanAmount;
	}
	public BigDecimal getCarMonthlyRepayment() {
		return carMonthlyRepayment;
	}
	public void setCarMonthlyRepayment(BigDecimal carMonthlyRepayment) {
		this.carMonthlyRepayment = carMonthlyRepayment;
	}
	public Integer getCreditCardTotalNumber() {
		return creditCardTotalNumber;
	}
	public void setCreditCardTotalNumber(Integer creditCardTotalNumber) {
		this.creditCardTotalNumber = creditCardTotalNumber;
	}
	public BigDecimal getCreditCardTotalLimit() {
		return creditCardTotalLimit;
	}
	public void setCreditCardTotalLimit(BigDecimal creditCardTotalLimit) {
		this.creditCardTotalLimit = creditCardTotalLimit;
	}
	public String getCreditCardOneBank() {
		return creditCardOneBank;
	}
	public void setCreditCardOneBank(String creditCardOneBank) {
		this.creditCardOneBank = creditCardOneBank;
	}
	public String getCreditCardNo() {
		return creditCardNo;
	}
	public void setCreditCardNo(String creditCardNo) {
		this.creditCardNo = creditCardNo;
	}
	public BigDecimal getCreditCardOneLimit() {
		return creditCardOneLimit;
	}
	public void setCreditCardOneLimit(BigDecimal creditCardOneLimit) {
		this.creditCardOneLimit = creditCardOneLimit;
	}
	public String getInvestment() {
		return investment;
	}
	public void setInvestment(String investment) {
		this.investment = investment;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public String getCustomerType() {
		return customerType;
	}
	public void setCustomerType(String customerType) {
		this.customerType = customerType;
	}
	public String getHouseInfoType() {
		return houseInfoType;
	}
	public void setHouseInfoType(String houseInfoType) {
		this.houseInfoType = houseInfoType;
	}
	public Integer getHouseNumer() {
		return houseNumer;
	}
	public void setHouseNumer(Integer houseNumer) {
		this.houseNumer = houseNumer;
	}
	public BigDecimal getHouseEstimateAmount() {
		return houseEstimateAmount;
	}
	public void setHouseEstimateAmount(BigDecimal houseEstimateAmount) {
		this.houseEstimateAmount = houseEstimateAmount;
	}
	public BigDecimal getHouseLoanAmount() {
		return houseLoanAmount;
	}
	public void setHouseLoanAmount(BigDecimal houseLoanAmount) {
		this.houseLoanAmount = houseLoanAmount;
	}
	public BigDecimal getHouseRepayAmount() {
		return houseRepayAmount;
	}
	public void setHouseRepayAmount(BigDecimal houseRepayAmount) {
		this.houseRepayAmount = houseRepayAmount;
	}
	public Date getHouseMortgageDate() {
		return houseMortgageDate;
	}
	public void setHouseMortgageDate(Date houseMortgageDate) {
		this.houseMortgageDate = houseMortgageDate;
	}
	public String getHouseMortgageBank() {
		return houseMortgageBank;
	}
	public void setHouseMortgageBank(String houseMortgageBank) {
		this.houseMortgageBank = houseMortgageBank;
	}
	public String getHouseCertNo() {
		return houseCertNo;
	}
	public void setHouseCertNo(String houseCertNo) {
		this.houseCertNo = houseCertNo;
	}
	public Long getIdAddressProvinceId() {
		return idAddressProvinceId;
	}
	public void setIdAddressProvinceId(Long idAddressProvinceId) {
		this.idAddressProvinceId = idAddressProvinceId;
	}
	public Long getIdAddressCityId() {
		return idAddressCityId;
	}
	public void setIdAddressCityId(Long idAddressCityId) {
		this.idAddressCityId = idAddressCityId;
	}
	public Long getIdAddressAreaId() {
		return idAddressAreaId;
	}
	public void setIdAddressAreaId(Long idAddressAreaId) {
		this.idAddressAreaId = idAddressAreaId;
	}
	public String getIdAddressDetails() {
		return idAddressDetails;
	}
	public void setIdAddressDetails(String idAddressDetails) {
		this.idAddressDetails = idAddressDetails;
	}
	public Long getSpouseIdAddrProvinceId() {
		return spouseIdAddrProvinceId;
	}
	public void setSpouseIdAddrProvinceId(Long spouseIdAddrProvinceId) {
		this.spouseIdAddrProvinceId = spouseIdAddrProvinceId;
	}
	public Long getSpouseIdAddrCityId() {
		return spouseIdAddrCityId;
	}
	public void setSpouseIdAddrCityId(Long spouseIdAddrCityId) {
		this.spouseIdAddrCityId = spouseIdAddrCityId;
	}
	public Long getSpouseIdAddrAreaId() {
		return spouseIdAddrAreaId;
	}
	public void setSpouseIdAddrAreaId(Long spouseIdAddrAreaId) {
		this.spouseIdAddrAreaId = spouseIdAddrAreaId;
	}
	public String getSpouseIdAddrDetails() {
		return spouseIdAddrDetails;
	}
	public void setSpouseIdAddrDetails(String spouseIdAddrDetails) {
		this.spouseIdAddrDetails = spouseIdAddrDetails;
	}
	public String getSpouseIdAddr() {
		return spouseIdAddr;
	}
	public void setSpouseIdAddr(String spouseIdAddr) {
		this.spouseIdAddr = spouseIdAddr;
	}
	public Long getSpouseUnitAddrProvinceId() {
		return spouseUnitAddrProvinceId;
	}
	public void setSpouseUnitAddrProvinceId(Long spouseUnitAddrProvinceId) {
		this.spouseUnitAddrProvinceId = spouseUnitAddrProvinceId;
	}
	public Long getSpouseUnitAddrCityId() {
		return spouseUnitAddrCityId;
	}
	public void setSpouseUnitAddrCityId(Long spouseUnitAddrCityId) {
		this.spouseUnitAddrCityId = spouseUnitAddrCityId;
	}
	public Long getSpouseUnitAddrAreaId() {
		return spouseUnitAddrAreaId;
	}
	public void setSpouseUnitAddrAreaId(Long spouseUnitAddrAreaId) {
		this.spouseUnitAddrAreaId = spouseUnitAddrAreaId;
	}
	public String getSpouseUnitAddrDetails() {
		return spouseUnitAddrDetails;
	}
	public void setSpouseUnitAddrDetails(String spouseUnitAddrDetails) {
		this.spouseUnitAddrDetails = spouseUnitAddrDetails;
	}
    
}
