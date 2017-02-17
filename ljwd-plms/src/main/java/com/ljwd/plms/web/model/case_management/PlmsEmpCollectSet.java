package com.ljwd.plms.web.model.case_management;


import com.ljwd.plms.web.model.ActiveModel;

public class PlmsEmpCollectSet extends ActiveModel{
  
	private Long id;

    private String userId; //用户id

    private Long groupId; //区间Id

    private String remark; //备注

    private String messageName; //催收姓氏

    private String isleader; //是否是组长
    
    private String isAlloc;	//是否分配 
    
  //dto
    private String userName;//催收员姓名
        
    private String officeTel; //电话号码
        
    private String orgName;//所属机构名称
    
    private String groupIds; //区间id集
    
    private String groupNames;//区间名称集
    
    private Long orgId;	//所属机构Id
    
    private Long rowNo;  //行号

    private String isAllocText;	//是否分配 
    
    
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

    public Long getGroupId() {
        return groupId;
    }

    public void setGroupId(Long groupId) {
        this.groupId = groupId;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }


    public String getMessageName() {
    	if(messageName==null){
    		return "";
    	}else{
            return messageName;
    	}
    }

    public void setMessageName(String messageName) {
        this.messageName = messageName == null ? null : messageName.trim();
    }

    public Long getOrgId() {
        return orgId;
    }

    public void setOrgId(Long orgId) {
        this.orgId = orgId;
    }

    public String getIsleader() {
        return isleader;
    }

    public void setIsleader(String isleader) {
        this.isleader = isleader == null ? null : isleader.trim();
    }

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getOfficeTel() {
		return officeTel;
	}

	public void setOfficeTel(String officeTel) {
		this.officeTel = officeTel;
	}

	public String getOrgName() {
		return orgName;
	}

	public void setOrgName(String orgName) {
		this.orgName = orgName;
	}

	public String getGroupIds() {
		return groupIds;
	}

	public void setGroupIds(String groupIds) {
		this.groupIds = groupIds;
	}

	public String getGroupNames() {
		return groupNames;
	}

	public void setGroupNames(String groupNames) {
		this.groupNames = groupNames;
	}

	public Long getRowNo() {
		return rowNo;
	}

	public void setRowNo(Long rowNo) {
		this.rowNo = rowNo;
	}

	public String getIsAlloc() {
		return isAlloc;
	}

	public void setIsAlloc(String isAlloc) {
		this.isAlloc = isAlloc;
	}

	public String getIsAllocText() {
        switch (this.isAlloc){
            case "Y":
                return "是";
            default:
                return "否";
        }
    }

    
    
}