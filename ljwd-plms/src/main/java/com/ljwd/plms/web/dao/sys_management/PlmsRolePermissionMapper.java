package com.ljwd.plms.web.dao.sys_management;

import java.util.List;

import com.ljwd.plms.web.model.sys_management.PlmsRolePermissionExample;
import org.apache.ibatis.annotations.Param;

import com.ljwd.plms.core.generic.GenericDao;
import com.ljwd.plms.web.model.sys_management.PlmsRolePermission;

/**
 * 角色权限表,plms_role_permission
 * */
public interface PlmsRolePermissionMapper extends GenericDao<PlmsRolePermission, Long> {

    int countByExample(PlmsRolePermissionExample example);

    int deleteByExample(PlmsRolePermissionExample example);

    int deleteByPrimaryKey(Long id);

    int insert(PlmsRolePermission record);

    int insertSelective(PlmsRolePermission record);

    List<PlmsRolePermission> selectByExample(PlmsRolePermissionExample example);

    PlmsRolePermission selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") PlmsRolePermission record, @Param("example") PlmsRolePermissionExample example);

    int updateByExample(@Param("record") PlmsRolePermission record, @Param("example") PlmsRolePermissionExample example);

    int updateByPrimaryKeySelective(PlmsRolePermission record);

    int updateByPrimaryKey(PlmsRolePermission record);

}