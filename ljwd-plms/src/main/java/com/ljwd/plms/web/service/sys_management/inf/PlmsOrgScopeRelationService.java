package com.ljwd.plms.web.service.sys_management.inf;

import java.util.List;

import com.ljwd.plms.core.feature.orm.mybatis.Page;
import com.ljwd.plms.core.generic.GenericService;
import com.ljwd.plms.web.model.sys_management.PlmsOrgScopeRelation;
import com.ljwd.plms.web.model.sys_management.PlmsOrgScopeRelationExample;
import com.ljwd.plms.web.vo.sys_management.OrgScopeParam;


public interface PlmsOrgScopeRelationService extends GenericService<PlmsOrgScopeRelation, Long>{

	/**
	 * 
	* @Description: 区间_机构设置分页显示 
	* @param page
	* @param example
	* @return
	* @return Page<PlmsOrgScopeRelation>
	 */
	Page<PlmsOrgScopeRelation> selectByExampleAndPage(Page<PlmsOrgScopeRelation> page, PlmsOrgScopeRelationExample example);
	
    List<PlmsOrgScopeRelation> selectByExample(PlmsOrgScopeRelationExample example);

    /**
     * 
    * @Description: 添加 区间_机构设置
    * @param orgId
    * @param collectionIds
    * @return
    * @return int
     */
    void addOrgScopeRelation(Long orgId,Long[] collectionIds,String userName);
    
    /**
     * 
    * @Description: 修改 区间_机构设置
    * @param orgId
    * @param collectionIds
    * @param userName
    * @return void
     */
    void updateOrgScopeRelation(OrgScopeParam param,String userName);
    
    /**
     * 
    * @Description:  删除区间_机构设置 
    * @param orgId
    * @return void
     */
    void deleteOrgScopeRelation(Long orgId);
}
