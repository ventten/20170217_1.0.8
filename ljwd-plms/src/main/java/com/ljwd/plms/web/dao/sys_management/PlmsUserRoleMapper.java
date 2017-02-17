package com.ljwd.plms.web.dao.sys_management;

import java.util.List;

import com.ljwd.plms.web.model.sys_management.PlmsUserRoleExample;
import org.apache.ibatis.annotations.Param;

import com.ljwd.plms.core.generic.GenericDao;
import com.ljwd.plms.web.model.sys_management.PlmsUserRole;

/**
 * 用户角色表,plms_user_role
 * */
public interface PlmsUserRoleMapper extends GenericDao<PlmsUserRole, Long> {

    int countByExample(PlmsUserRoleExample example);

    int deleteByExample(PlmsUserRoleExample example);

    int deleteByPrimaryKey(Long id);

    int insert(PlmsUserRole record);

    int insertSelective(PlmsUserRole record);

    List<PlmsUserRole> selectByExample(PlmsUserRoleExample example);

    PlmsUserRole selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") PlmsUserRole record, @Param("example") PlmsUserRoleExample example);

    int updateByExample(@Param("record") PlmsUserRole record, @Param("example") PlmsUserRoleExample example);

    int updateByPrimaryKeySelective(PlmsUserRole record);

    int updateByPrimaryKey(PlmsUserRole record);

}