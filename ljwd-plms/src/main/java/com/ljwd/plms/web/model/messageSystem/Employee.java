// default package
package com.ljwd.plms.web.model.messageSystem;


import java.util.Date;

/**
 * 
* @ClassName: Employee 
* @Description: TODO(移植微贷系统的雇员实体类) 
* @author zhengjizhao
* @date 2016年9月7日 下午3:33:52 
*
 */
public class Employee {

    /** 
	* @Fields serialVersionUID : TODO(用一句话描述这个变量表示什么) 
	*/ 
	private static final long serialVersionUID = 3060618860767871184L;

	private Long id;  //记录ID	

    private Long organization; //	所属部门	

    private String employeeNo; //	员工编号	

    private String employeeName; //	姓名	

    private String idCard;  //	身份证号	

    private String gender;  //性别.MALE, FEMALE

    private Date birthday;  //	出生日期	

    private String duties;  //	职务	

    private String telephone;  //		固话	

    private String mobile;  //	手机	

    private String homeTelephone;  //	家庭电话	

    private String officeTelephone;  //	办公电话	

    private String homeAddress;  //	家庭住址	

    private String post;  //	邮编	

    private String email;  //	E-mail	

    private Boolean isSalesMan;  //是否业务员. Y/N

    private Boolean isSuperviser;  //是否业务主管. Y/N

    private Date entryDate;  //入职日期

    private Boolean isQuit;  //离职状态，N否，Y是

    private Date quitDate;  //离职日期

    private Boolean isInLeave;  //是否休假，N否，Y是

    private String remark;  //    备注    

    private String position;  // 职务 

    private String callCenterNumber;  //call center 分机号

    private String quitType;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getOrganization() {
		return organization;
	}

	public void setOrganization(Long organization) {
		this.organization = organization;
	}

	public String getEmployeeNo() {
		return employeeNo;
	}

	public void setEmployeeNo(String employeeNo) {
		this.employeeNo = employeeNo;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public String getIdCard() {
		return idCard;
	}

	public void setIdCard(String idCard) {
		this.idCard = idCard;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public String getDuties() {
		return duties;
	}

	public void setDuties(String duties) {
		this.duties = duties;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getHomeTelephone() {
		return homeTelephone;
	}

	public void setHomeTelephone(String homeTelephone) {
		this.homeTelephone = homeTelephone;
	}

	public String getOfficeTelephone() {
		return officeTelephone;
	}

	public void setOfficeTelephone(String officeTelephone) {
		this.officeTelephone = officeTelephone;
	}

	public String getHomeAddress() {
		return homeAddress;
	}

	public void setHomeAddress(String homeAddress) {
		this.homeAddress = homeAddress;
	}

	public String getPost() {
		return post;
	}

	public void setPost(String post) {
		this.post = post;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Boolean getIsSalesMan() {
		return isSalesMan;
	}

	public void setIsSalesMan(Boolean isSalesMan) {
		this.isSalesMan = isSalesMan;
	}

	public Boolean getIsSuperviser() {
		return isSuperviser;
	}

	public void setIsSuperviser(Boolean isSuperviser) {
		this.isSuperviser = isSuperviser;
	}

	public Date getEntryDate() {
		return entryDate;
	}

	public void setEntryDate(Date entryDate) {
		this.entryDate = entryDate;
	}

	public Boolean getIsQuit() {
		return isQuit;
	}

	public void setIsQuit(Boolean isQuit) {
		this.isQuit = isQuit;
	}

	public Date getQuitDate() {
		return quitDate;
	}

	public void setQuitDate(Date quitDate) {
		this.quitDate = quitDate;
	}

	public Boolean getIsInLeave() {
		return isInLeave;
	}

	public void setIsInLeave(Boolean isInLeave) {
		this.isInLeave = isInLeave;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public String getCallCenterNumber() {
		return callCenterNumber;
	}

	public void setCallCenterNumber(String callCenterNumber) {
		this.callCenterNumber = callCenterNumber;
	}

	public String getQuitType() {
		return quitType;
	}

	public void setQuitType(String quitType) {
		this.quitType = quitType;
	}
    
    
   
}
