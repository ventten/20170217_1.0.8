package com.ljwd.plms.web.service.sys_management.inf;

import java.util.List;

import com.ljwd.plms.core.feature.orm.mybatis.Page;
import com.ljwd.plms.core.generic.GenericService;
import com.ljwd.plms.web.model.sys_management.PlmsSysUserDataRange;
import com.ljwd.plms.web.model.sys_management.PlmsSysUserDataRangeExample;
import com.ljwd.plms.web.model.workorder_pool.PlmsCollectionRuleSet;
import com.ljwd.plms.web.vo.sys_management.UserEmpOrgDto;

public interface PlmsSysUserDataRangeService extends GenericService<PlmsSysUserDataRange, Long> {
	
	 /**
     * 分页条件查询
     * @param page Page信息
     * @param example 查询条件
     * @return Page数据
     */
	Page<PlmsSysUserDataRange> selectByExampleAndPage(Page<PlmsSysUserDataRange> page, PlmsSysUserDataRangeExample example);


    List<PlmsSysUserDataRange> selectByExample(PlmsSysUserDataRangeExample example);
    /**
     * 
    * @Description: 新增用户数据权限
    * @param userId
    * @param orgIds
    * @param userName
    * @return void
     */
    void addUserDataRange (String userId,Long[] orgIds,String userName);
    
    /**
     * 
    * @Description: 根据用户Id查找用户姓名和所属机构 
    * @param userId
    * @return
    * @return List<PlmsSysUserDataRange>
     */
    List<UserEmpOrgDto> selectByUserId(String userId,String orgId);
    
    
    /**
     * 
    * @Description: 根据用户Id查找权限机构列表 
    * @param userId
    * @return
    * @return List<Long>
     */
    List<Long> selectOrgListByUserId(String userId);


    /**
     * 
    * @Description: 修改用户数据权限
    * @param userId
    * @param orgIdList
    * @param userName
    * @return void
     */
	void updateUserDataRange(String userId, Long[] orgIdList, String userName);

	/***
	 * 
	* @Description: 删除用户数据权限
	* @param userId
	* @return void
	 */
	void deleteUserDataRange(String userId);
}
