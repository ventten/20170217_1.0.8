package com.ljwd.plms.web.vo.sys_management;

import java.util.HashMap;
import java.util.Map;

import com.ljwd.plms.web.model.BaseExample;
import com.ljwd.plms.web.vo.DataTableParam;

public class PlmsEmpCollectorParam extends BaseExample {
	
	private Long orgId; //所属机构Id
	
	private String userId; //用户Id
	
	private String messageName; //(催收)催收姓氏
	
	private String isLeader; //(催收)是否是组长

    private Long[] scopeList;//(催收)所选区间集和     
    
    private Long  areaId; //(外访)所属区域集合
    
    private String isActive;  //(外访)状态
    
    private String userName; //(外访员)
    
    private String tel; //电话号码

    private String isAlloc;	//是否分配
    private static Map<String,String> sortMap = new HashMap<String,String>();
    static {
    	sortMap.put("userId","userId ");
        sortMap.put("orgName","orgName ");
        sortMap.put("userName","userName ");
        sortMap.put("groupNames","groupNames ");
        sortMap.put("messageName","messageName ");
        sortMap.put("officeTel","officetel ");
        sortMap.put("areaName","areaName ");
        sortMap.put("isActiveText","isactive ");
        sortMap.put("updatedUserName","updatedUserName ");
        sortMap.put("updateTime","updateTime ");
    }

    public void setOrderByClause(DataTableParam param){
        super.setOrderByClause(param,sortMap);
    }
	public Long getOrgId() {
		return orgId;
	}

	public void setOrgId(Long orgId) {
		this.orgId = orgId;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getMessageName() {
		return messageName;
	}

	public void setMessageName(String messageName) {
		this.messageName = messageName;
	}

	public String getIsLeader() {
		return isLeader;
	}

	public void setIsLeader(String isLeader) {
		this.isLeader = isLeader;
	}

	public Long[] getScopeList() {
		return scopeList;
	}

	public void setScopeList(Long[] scopeList) {
		this.scopeList = scopeList;
	}

	
	public Long getAreaId() {
		return areaId;
	}

	public void setAreaId(Long areaId) {
		this.areaId = areaId;
	}

	public String getIsActive() {
		return isActive;
	}

	public void setIsActive(String isActive) {
		this.isActive = isActive;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getIsAlloc() {
		return isAlloc;
	}
	public void setIsAlloc(String isAlloc) {
		this.isAlloc = isAlloc;
	}
	
	

	
	
}
