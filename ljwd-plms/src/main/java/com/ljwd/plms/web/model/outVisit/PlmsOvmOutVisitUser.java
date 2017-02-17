package com.ljwd.plms.web.model.outVisit;

import java.math.BigDecimal;

import com.ljwd.plms.web.model.ActiveModel;

public class PlmsOvmOutVisitUser extends ActiveModel{
  
	private Long id;

    private String userId;  //用户id

    private String siteCode; //网点(分行)代码，对应SYS_SITE中SITE_CODE

    private Long cityCode; //城市代码,预留

    private Long areaId;  // 区域代码ID，对应plms_OVM_OUT_VISIT_AREA表中ID

    private Long orgId;  //区域代码ID，对应plms_OVM_OUT_VISIT_AREA表中ID

    private String tel; //电话号码

    private Long caseCount; //当前库存（户数）：外访催收员当前在库案件合计户数。

    private BigDecimal remainderAmount; //当前剩余本金：外访催收员当前在库案件合计剩余本金。

    
    //dto
    private String userName; //用户名称
    
    private String areaName; //所属区域名称
    
  /*  private String areaNames;  //所属区域集合
    
    private String areaIds;  //所属区域集合
*/    
    private String orgName; //所属机构名称
    
    private Long rowNo; 
    

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    public String getSiteCode() {
        return siteCode;
    }

    public void setSiteCode(String siteCode) {
        this.siteCode = siteCode == null ? null : siteCode.trim();
    }

    public Long getCityCode() {
        return cityCode;
    }

    public void setCityCode(Long cityCode) {
        this.cityCode = cityCode;
    }

    public Long getAreaId() {
        return areaId;
    }

    public void setAreaId(Long areaId) {
        this.areaId = areaId;
    }

    public Long getOrgId() {
        return orgId;
    }

    public void setOrgId(Long orgId) {
        this.orgId = orgId;
    }

    public Long getCaseCount() {
        return caseCount;
    }

    public void setCaseCount(Long caseCount) {
        this.caseCount = caseCount;
    }

	public BigDecimal getRemainderAmount() {
		return remainderAmount;
	}

	public void setRemainderAmount(BigDecimal remainderAmount) {
		this.remainderAmount = remainderAmount;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	

	public String getOrgName() {
		return orgName;
	}

	public void setOrgName(String orgName) {
		this.orgName = orgName;
	}

	public Long getRowNo() {
		return rowNo;
	}

	public void setRowNo(Long rowNo) {
		this.rowNo = rowNo;
	}

	public String getAreaName() {
		return areaName;
	}

	public void setAreaName(String areaName) {
		this.areaName = areaName;
	}

	public String getTel() {
		return tel==null?"":tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	
	

}