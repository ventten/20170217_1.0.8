package com.ljwd.plms.web.dao.sys_management;

import com.ljwd.plms.core.feature.orm.mybatis.Page;
import com.ljwd.plms.core.generic.GenericDao;
import com.ljwd.plms.web.model.sys_management.PlmsOrgScopeRelation;
import com.ljwd.plms.web.model.sys_management.PlmsOrgScopeRelationExample;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface PlmsOrgScopeRelationMapper extends GenericDao<PlmsOrgScopeRelation,Long>{
    int countByExample(PlmsOrgScopeRelationExample example);

    int deleteByExample(PlmsOrgScopeRelationExample example);

    int deleteByPrimaryKey(Long id);

    int insert(PlmsOrgScopeRelation record);

    int insertSelective(PlmsOrgScopeRelation record);

    List<PlmsOrgScopeRelation> selectByExample(PlmsOrgScopeRelationExample example);

    PlmsOrgScopeRelation selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") PlmsOrgScopeRelation record, @Param("example") PlmsOrgScopeRelationExample example);

    int updateByExample(@Param("record") PlmsOrgScopeRelation record, @Param("example") PlmsOrgScopeRelationExample example);

    int updateByPrimaryKeySelective(PlmsOrgScopeRelation record);

    int updateByPrimaryKey(PlmsOrgScopeRelation record);
    
    /**
	 * 
	* @Description: 区间_机构设置分页显示 
	* @param page
	* @param example
	* @return
	* @return Page<PlmsOrgScopeRelation>
	 */
	List<PlmsOrgScopeRelation> selectByExampleAndPage(Page<PlmsOrgScopeRelation> page, PlmsOrgScopeRelationExample example);

}