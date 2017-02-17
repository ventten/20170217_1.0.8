package com.ljwd.plms.web.service.sys_management.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.ljwd.plms.core.feature.orm.mybatis.Page;
import com.ljwd.plms.core.generic.GenericDao;
import com.ljwd.plms.core.generic.GenericServiceImpl;
import com.ljwd.plms.web.dao.sys_management.PlmsOrgScopeRelationMapper;
import com.ljwd.plms.web.model.sys_management.PlmsOrgScopeRelation;
import com.ljwd.plms.web.model.sys_management.PlmsOrgScopeRelationExample;
import com.ljwd.plms.web.service.sys_management.inf.PlmsOrgScopeRelationService;
import com.ljwd.plms.web.vo.sys_management.OrgScopeParam;
@Service
public class PlmsOrgScopeRelationServiceImpl extends
		GenericServiceImpl<PlmsOrgScopeRelation, Long> implements PlmsOrgScopeRelationService {

	@Resource
	private PlmsOrgScopeRelationMapper plmsOrgScopeRelationMapper;
	
	@Override
	public GenericDao<PlmsOrgScopeRelation, Long> getDao() {
		return plmsOrgScopeRelationMapper;
	}
	
	/**
	 * 
	* @Description: 区间_机构设置分页显示 
	* @param page
	* @param example
	* @return
	* @return
	 */
	@Override
	public Page<PlmsOrgScopeRelation> selectByExampleAndPage(
			Page<PlmsOrgScopeRelation> page, PlmsOrgScopeRelationExample example) {
		plmsOrgScopeRelationMapper.selectByExampleAndPage(page, example);
		return page;
	}


	@Override
	public List<PlmsOrgScopeRelation> selectByExample(
			PlmsOrgScopeRelationExample example) {
		return plmsOrgScopeRelationMapper.selectByExample(example);
	}

	/**
	 * 
	* @Description: 添加 区间_机构设置 
	* @param orgId
	* @param collectionIds
	* @return
	* @return
	 */
	@Override
	public void addOrgScopeRelation(Long orgId, Long[] collectionIds,String userName) {
		List<PlmsOrgScopeRelation> relationList = new ArrayList<PlmsOrgScopeRelation>();
		for(int i=0;i<collectionIds.length;i++){
			PlmsOrgScopeRelation relation = new PlmsOrgScopeRelation();
			relation.setOrgId(orgId);
			relation.setCollectionRuleId(collectionIds[i]);
			relation.setIsActive("Y");
			relation.setCreatedBy(userName);
			relation.setCreateTime(new Date());
			relation.setUpdatedBy(userName);
			relation.setUpdateTime(new Date());
			relation.setTagSeq(1L);
			relation.setRecVer(0L);
			relationList.add(relation);
		}
		plmsOrgScopeRelationMapper.insertBatch(relationList);
	}

	/**
	 * 
	* @Description: 修改 区间_机构设置
	* @param orgId
	* @param collectionIds
	* @param userName
	* @return
	 */
	@Override
	public void updateOrgScopeRelation(OrgScopeParam param,
			String userName) {
		Long orgId = param.getOrgId();
		Long[] scopeList = param.getScopeList();
		//1,先删除此机构已经存在的对应区间
		PlmsOrgScopeRelationExample example= new PlmsOrgScopeRelationExample();
		example.setOrgId(orgId);
		plmsOrgScopeRelationMapper.deleteByExample(example)	;
		//2,添加新的对应关系
		if(scopeList.length>0){
			List<PlmsOrgScopeRelation> relationList = new ArrayList<PlmsOrgScopeRelation>();
			for(int i=0;i<param.getScopeList().length;i++){
				PlmsOrgScopeRelation relation = new PlmsOrgScopeRelation();
				relation.setOrgId(orgId);
				relation.setCollectionRuleId(scopeList[i]);
				relation.setIsActive(param.getIsActive());
				relation.setCreatedBy(userName);
				relation.setCreateTime(new Date());
				relation.setUpdatedBy(userName);
				relation.setUpdateTime(new Date());
				relation.setTagSeq(1L);
				relation.setRecVer(0L);
				relationList.add(relation);
			}
			plmsOrgScopeRelationMapper.insertBatch(relationList);
		}
		
	}

	/**
	 * 
	* @Description:  删除区间_机构设置 
	* @param orgId
	* @return
	 */
	@Override
	public void deleteOrgScopeRelation(Long orgId) {
		
		PlmsOrgScopeRelationExample example= new PlmsOrgScopeRelationExample();
		example.setOrgId(orgId);
		plmsOrgScopeRelationMapper.deleteByExample(example)	;
		
	}

	

}
