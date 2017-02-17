package com.ljwd.plms.web.service.outVisit.impl;


import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.ljwd.plms.core.entity.JSONResult;
import com.ljwd.plms.core.feature.orm.mybatis.Page;
import com.ljwd.plms.core.generic.GenericDao;
import com.ljwd.plms.core.generic.GenericServiceImpl;
import com.ljwd.plms.web.dao.outVisit.PlmsOvmOutVisitUserMapper;
import com.ljwd.plms.web.model.outVisit.PlmsOvmOutVisitArea;
import com.ljwd.plms.web.model.outVisit.PlmsOvmOutVisitPlan;
import com.ljwd.plms.web.model.outVisit.PlmsOvmOutVisitUser;
import com.ljwd.plms.web.model.outVisit.PlmsOvmOutVisitUserExample;
import com.ljwd.plms.web.service.outVisit.inf.PlmsOvmOutVisitUserService;
import com.ljwd.plms.web.vo.outVisit.PlmsOvmOutVisitDto;
import com.ljwd.plms.web.vo.sys_management.PlmsEmpCollectorParam;

@Service
public class PlmsOvmOutVisitUserServiceImpl extends
		GenericServiceImpl<PlmsOvmOutVisitUser, Long> implements PlmsOvmOutVisitUserService {

	@Resource
	private PlmsOvmOutVisitUserMapper plmsOvmOutVisitUserMapper;
	
	@Override
	public GenericDao<PlmsOvmOutVisitUser, Long> getDao() {
		return plmsOvmOutVisitUserMapper;
	}

	/**
	 * 
	* @Description:根据applId查找此案件的交单网点所属的外访区域是否有外访人员
	* @param applId
	* @return
	* @return
	 */
	@Override
	public List<PlmsOvmOutVisitUser> searchOutVisitUserListByApplId(Long applId) {
		
		return plmsOvmOutVisitUserMapper.searchOutVisitUserListByApplId(applId);
	}


	/**
	 * 
	* @Description: 根据applId查询合同编号 
	* @param applId
	* @return
	* @return
	 */
	@Override
	public String searchCntrctNoByapplId(Long applId) {
		return plmsOvmOutVisitUserMapper.searchCntrctNoByapplId(applId);
	}

	/**
	 * 
	* @Description: 添加外访员 
	* @param outVisiter
	* @param createBy
	* @return
	 */
	@Override
	public void insertOutVisitUser(PlmsEmpCollectorParam outVisiter,
			String createBy) {
			PlmsOvmOutVisitUser user = new PlmsOvmOutVisitUser();
			user.setOrgId(outVisiter.getOrgId());
			user.setUserId(outVisiter.getUserId());
			user.setAreaId(outVisiter.getAreaId());
			user.setTel(outVisiter.getTel());
			user.setIsActive("Y");
			user.setCreatedBy(createBy);
			user.setCreateTime(new Date());
			user.setUpdatedBy(createBy);
			user.setUpdateTime(new Date());
			plmsOvmOutVisitUserMapper.insertSelective(user);
		
		
	}

	@Override
	public List<PlmsOvmOutVisitUser> selectByExample(
			PlmsOvmOutVisitUserExample example) {
		return plmsOvmOutVisitUserMapper.selectByExample(example);
	}

	/**
	 * 
	* @Description:外访员分页查找 
	* @param pageData
	* @param example
	* @return
	* @return
	 */
	@Override
	public Page<PlmsOvmOutVisitUser> selectByExampleAndPage(
			Page<PlmsOvmOutVisitUser> pageData, PlmsEmpCollectorParam example) {
		plmsOvmOutVisitUserMapper.selectByExampleAndPage(pageData, example);
		return pageData;
	}

	@Override
	public void updatetOutVisitUser(PlmsEmpCollectorParam outVisiter,
			String createBy) {
		PlmsOvmOutVisitUserExample example = new PlmsOvmOutVisitUserExample();
		example.setUserId(outVisiter.getUserId());
		List<PlmsOvmOutVisitUser>  userList = this.selectByExample(example);
		if(userList==null||userList.size()==0){
			throw new RuntimeException("此用户不存在,修改出错！");	
		}else{
			PlmsOvmOutVisitUser user = userList.get(0);
			user.setAreaId(outVisiter.getAreaId());
			user.setTel(outVisiter.getTel());
			user.setUpdatedBy(createBy);
			user.setUpdateTime(new Date());
			plmsOvmOutVisitUserMapper.updateByPrimaryKeySelective(user);
		}
	
	}

	@Override
	public List<PlmsOvmOutVisitUser> searchInfoByMap(Map<String, Object> map) {
		return plmsOvmOutVisitUserMapper.searchInfoByMap(map);
	}

	/**
	 * 
	* @Description: 批量修改 
	* @param list
	* @return
	 */
	@Override
	public void updateBatch(List<PlmsOvmOutVisitUser> list) {
		 if(list == null || list.isEmpty()){
	            return;
	        }
			int comm = 2000;
			int size = list.size()-1;
			if(size>=comm){
				List<PlmsOvmOutVisitUser> newList = new ArrayList<PlmsOvmOutVisitUser>();
				for(int i=0;i<=size;i++){
					if(i!=0&&i%comm==0||i==size){
						newList.add(list.get(i));
						plmsOvmOutVisitUserMapper.updateBatch(newList);
						newList.clear();
					}else{
						newList.add(list.get(i));
					}
				}	
			}else{
				plmsOvmOutVisitUserMapper.updateBatch(list);
			}
	}

	@Override
	public List<PlmsOvmOutVisitDto> searchOutVisitArea() {
		return plmsOvmOutVisitUserMapper.searchOutVisitArea();
	}



	
	
}
