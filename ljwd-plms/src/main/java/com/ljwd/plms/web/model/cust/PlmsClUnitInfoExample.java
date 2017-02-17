package com.ljwd.plms.web.model.cust;

import com.ljwd.plms.web.model.BaseExample;

/**
 * Created by zhengzw on 2016/6/14
 * 客户单位信息查询条件
 */
public class PlmsClUnitInfoExample extends BaseExample {

    private Long clCustId;          //客户基本信息表ID
    private Long applId;            //贷款申请ID
    private String srcCode;         //来源：微贷、聚信立、网络、外部机构、客户来电
    private String unitName;        //单位名称
    private String unitAddr;        //单位地址
    private String name;            //姓名
    private Long noThisId;          //排除此记录ID
    private Long clCustIdByApplId;  //根据借款ID查询此客户ID下的数据
    private String isActive; 		//是否有效
    
    public Long getApplId() {
		return applId;
	}

	public void setApplId(Long applId) {
		this.applId = applId;
	}

	public Long getClCustIdByApplId() {
		return clCustIdByApplId;
	}

	public void setClCustIdByApplId(Long clCustIdByApplId) {
		this.clCustIdByApplId = clCustIdByApplId;
	}

	public String getIsActive() {
		return isActive;
	}

	public void setIsActive(String isActive) {
		this.isActive = isActive;
	}

	public String getUnitAddr() {
        return unitAddr;
    }

    public PlmsClUnitInfoExample setUnitAddr(String unitAddr) {
        this.unitAddr = unitAddr;
        return this;
    }

    public Long getNoThisId() {
        return noThisId;
    }

    public PlmsClUnitInfoExample setNoThisId(Long noThisId) {
        this.noThisId = noThisId;
        return this;
    }

    public Long getClCustId() {
        return clCustId;
    }

    public PlmsClUnitInfoExample setClCustId(Long clCustId) {
        this.clCustId = clCustId;
        return this;
    }

    public String getSrcCode() {
        return srcCode;
    }

    public PlmsClUnitInfoExample setSrcCode(String srcCode) {
        this.srcCode = (srcCode == null || "".equals(srcCode) || "".equals(srcCode.trim())) ? null : srcCode.trim();
        return this;
    }

    public String getUnitName() {
        return unitName;
    }

    public PlmsClUnitInfoExample setUnitName(String unitName) {
        this.unitName = (unitName == null || "".equals(unitName) || "".equals(unitName.trim())) ? null : unitName.trim();
        return this;
    }

    public String getName() {
        return name;
    }

    public PlmsClUnitInfoExample setName(String name) {
        this.name = (name == null || "".equals(name) || "".equals(name.trim())) ? null : name.trim();
        return this;
    }

}
