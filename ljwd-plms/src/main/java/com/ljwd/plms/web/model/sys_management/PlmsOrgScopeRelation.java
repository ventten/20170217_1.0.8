package com.ljwd.plms.web.model.sys_management;




import com.ljwd.plms.web.model.ActiveModel;
/**
 * <p>Title: PlmsOrgScopeRelation</p>
 * @author pangshanxing
 * @date 2016年8月30日上午10:17:58
 */
public class PlmsOrgScopeRelation extends ActiveModel {
    
	private Long id;	//id
	
    private Long orgId;	//机构Id

    private Long collectionRuleId; //区间Id

    //dto
    private String orgName;	//机构名称
    
    private String collectionRuleNames; //区间名称
    
    private String collectionruleIds; //区间Id集合
  
    private Long rowNo;  //行号
    
    

	public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getOrgId() {
        return orgId;
    }

    public void setOrgId(Long orgId) {
        this.orgId = orgId;
    }

    public Long getCollectionRuleId() {
        return collectionRuleId;
    }

    public void setCollectionRuleId(Long collectionRuleId) {
        this.collectionRuleId = collectionRuleId;
    }

	public String getOrgName() {
		return orgName;
	}

	public void setOrgName(String orgName) {
		this.orgName = orgName;
	}

	public String getCollectionRuleNames() {
		return collectionRuleNames;
	}

	public void setCollectionRuleNames(String collectionRuleNames) {
		this.collectionRuleNames = collectionRuleNames;
	}

	public String getCollectionruleIds() {
		return collectionruleIds;
	}

	public void setCollectionruleIds(String collectionruleIds) {
		this.collectionruleIds = collectionruleIds;
		//setCollectionRuleIdList(collectionruleIds);
	}

	public Long getRowNo() {
		return rowNo;
	}

	public void setRowNo(Long rowNo) {
		this.rowNo = rowNo;
	}

	

	/*public List<Long> getCollectionRuleIdList() {
		return collectionRuleIdList;
	}

	public void setCollectionRuleIdList(String collectionRuleIds) {
		if(collectionRuleIds!=null&&collectionRuleIds.equals("")){
			String[] scopeStrIds = collectionRuleIds.split(",");
			Long[] lo = (Long[])ConvertUtils.convert(scopeStrIds, Long.class);
			List<Long> scopeIds = Arrays.asList(lo);
			collectionRuleIdList.addAll(scopeIds);
		}
	}
*/
	
	
	

	
    
}