package com.ljwd.plms.web.dao.sys_management;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.ljwd.plms.core.feature.orm.mybatis.Page;
import com.ljwd.plms.core.generic.GenericDao;
import com.ljwd.plms.web.model.sys_management.PlmsSysUserDataRange;
import com.ljwd.plms.web.model.sys_management.PlmsSysUserDataRangeExample;
import com.ljwd.plms.web.vo.sys_management.UserEmpOrgDto;

public interface PlmsSysUserDataRangeMapper extends GenericDao<PlmsSysUserDataRange, Long> {
    int countByExample(PlmsSysUserDataRangeExample example);

    int deleteByExample(PlmsSysUserDataRangeExample example);

    int deleteByPrimaryKey(Long id);

    int insert(PlmsSysUserDataRange record);

    int insertSelective(PlmsSysUserDataRange record);

    List<PlmsSysUserDataRange> selectByExample(PlmsSysUserDataRangeExample example);

    PlmsSysUserDataRange selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") PlmsSysUserDataRange record, @Param("example") PlmsSysUserDataRangeExample example);

    int updateByExample(@Param("record") PlmsSysUserDataRange record, @Param("example") PlmsSysUserDataRangeExample example);

    int updateByPrimaryKeySelective(PlmsSysUserDataRange record);

    int updateByPrimaryKey(PlmsSysUserDataRange record);
    /**
     * 
    * @Description: 分页查询
    * @param page
    * @param example
    * @return
    * @return List<PlmsSysUserDataRange>
     */
	List<PlmsSysUserDataRange> selectByExampleAndPage(Page<PlmsSysUserDataRange> page, PlmsSysUserDataRangeExample example);

	 /**
     * 
    * @Description: 根据用户Id查找用户姓名和所属机构 
    * @param userId
    * @return
    * @return List<PlmsSysUserDataRange>
     */
	List<UserEmpOrgDto> selectByUserId(@Param("userId")String userId,@Param("orgId")String orgId);
    
    
    /**
     * 
    * @Description: 根据用户Id查找权限机构列表 
    * @param userId
    * @return
    * @return List<Long>
     */
    List<Long> selectOrgListByUserId(@Param("userId")String userId);
}