package com.ljwd.plms.web.model.cust;

import com.ljwd.plms.web.model.BaseExample;

/**
 * Created by zhengzw on 2016/6/14 0014.
 * 客户地址信息查询条件
 */
public class PlmsClAddressInfoExample extends BaseExample {

    private Long clCustId;          //客户基本信息表ID
    private Long applId;            //贷款申请ID
    private String srcCode;         //来源：微贷、聚信立、网络、外部机构、客户来电
    private Long applIdOrNull;      //查找此借款ID等于此值或借款ID为null的数据
    private String rltnshp;         //与主贷人关系:配偶、朋友、公司、同事、亲戚
    private String addrType;        //地址类型：公司、住宅（即现居住地）、户籍、其他
    private String addr;            //由省市区详细地址拼接的总地址
    private String name;            //联系人姓名
    private Long noThisId;          //排除此记录ID
    private Long clCustIdByApplId;  //根据借款ID查询此客户ID下的数据
    private String isActive; 		//是否有效
    

    public Long getClCustIdByApplId() {
        return clCustIdByApplId;
    }

    public PlmsClAddressInfoExample setClCustIdByApplId(Long clCustIdByApplId) {
        this.clCustIdByApplId = clCustIdByApplId;
        return this;
    }

    public Long getNoThisId() {
        return noThisId;
    }

    public PlmsClAddressInfoExample setNoThisId(Long noThisId) {
        this.noThisId = noThisId;
        return this;
    }

    public String getAddrType() {
        return addrType;
    }

    public PlmsClAddressInfoExample setAddrType(String addrType) {
        this.addrType = addrType;
        return this;
    }

    public String getAddr() {
        return addr;
    }

    public PlmsClAddressInfoExample setAddr(String addr) {
        this.addr = addr;
        return this;
    }

    public String getName() {
        return name;
    }

    public PlmsClAddressInfoExample setName(String name) {
        this.name = name;
        return this;
    }

    public Long getClCustId() {
        return clCustId;
    }

    public PlmsClAddressInfoExample setClCustId(Long clCustId) {
        this.clCustId = clCustId;
        return this;
    }

    public Long getApplId() {
        return applId;
    }

    public void setApplId(Long applId) {
        this.applId = applId;
    }

    public String getSrcCode() {
        return srcCode;
    }

    public void setSrcCode(String srcCode) {
        this.srcCode = (srcCode == null || "".equals(srcCode) || "".equals(srcCode.trim())) ? null : srcCode.trim();
    }

    public Long getApplIdOrNull() {
        return applIdOrNull;
    }

    public void setApplIdOrNull(Long applIdOrNull) {
        this.applIdOrNull = applIdOrNull;
    }

	public String getRltnshp() {
		return rltnshp;
	}

	public void setRltnshp(String rltnshp) {
		this.rltnshp = rltnshp;
	}

	public String getIsActive() {
		return isActive;
	}

	public void setIsActive(String isActive) {
		this.isActive = isActive;
	}
	

}
