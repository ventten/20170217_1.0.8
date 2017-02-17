package com.ljwd.plms.mapp.vo.customer;

/**
 * MAPP所需客户基本信息
 */
public class APPCustInfoVo {

    private Long   id;         // 客户主键
    private String custName;   // 姓名
    private String idCardNo;   // 证件号码
    private String mobile;     // 手机号
    private String houseTel;   // 住宅电话
    private String education;  // 教育程度/学历
    private String unitName;   // 公司名称
    private String position;   // 职位
    private String unitTel;    // 公司电话
    private Boolean marriage;  // 婚姻状况.true:已婚,false:未婚
    private String spouseName; // 配偶姓名
    private String spouseTel;  // 配偶手机号

    public Long getId() {
        return id;
    }

    public APPCustInfoVo setId(Long id) {
        this.id = id;
        return this;
    }

    public String getCustName() {
        return custName;
    }

    public APPCustInfoVo setCustName(String custName) {
        this.custName = custName;
        return this;
    }

    public String getIdCardNo() {
        return idCardNo;
    }

    public APPCustInfoVo setIdCardNo(String idCardNo) {
        this.idCardNo = idCardNo;
        return this;
    }

    public String getMobile() {
        return mobile;
    }

    public APPCustInfoVo setMobile(String mobile) {
        this.mobile = mobile;
        return this;
    }

    public String getHouseTel() {
        return houseTel;
    }

    public APPCustInfoVo setHouseTel(String houseTel) {
        this.houseTel = houseTel;
        return this;
    }

    public String getEducation() {
        return education;
    }

    public APPCustInfoVo setEducation(String education) {
        this.education = education;
        return this;
    }

    public String getUnitName() {
        return unitName;
    }

    public APPCustInfoVo setUnitName(String unitName) {
        this.unitName = unitName;
        return this;
    }

    public String getPosition() {
        return position;
    }

    public APPCustInfoVo setPosition(String position) {
        this.position = position;
        return this;
    }

    public String getUnitTel() {
        return unitTel;
    }

    public APPCustInfoVo setUnitTel(String unitTel) {
        this.unitTel = unitTel;
        return this;
    }

    public Boolean getMarriage() {
        return marriage;
    }

    public APPCustInfoVo setMarriage(Boolean marriage) {
        this.marriage = marriage;
        return this;
    }

    public String getSpouseName() {
        return spouseName;
    }

    public APPCustInfoVo setSpouseName(String spouseName) {
        this.spouseName = spouseName;
        return this;
    }

    public String getSpouseTel() {
        return spouseTel;
    }

    public APPCustInfoVo setSpouseTel(String spouseTel) {
        this.spouseTel = spouseTel;
        return this;
    }
}