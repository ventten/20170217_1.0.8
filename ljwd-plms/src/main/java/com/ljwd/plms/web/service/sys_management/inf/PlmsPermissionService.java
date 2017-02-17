package com.ljwd.plms.web.service.sys_management.inf;

import java.util.List;

import com.ljwd.plms.core.generic.GenericService;
import com.ljwd.plms.web.model.sys_management.PlmsPermission;
import com.ljwd.plms.web.model.sys_management.PlmsPermissionExample;

/**
 * 系统权限表,plms_permission
 * */
public interface PlmsPermissionService extends GenericService<PlmsPermission, Long> {

    /**
     * 通过查询条件查询
     * @param example 查询条件
     * @return 实体集
     */
    List<PlmsPermission> selectByExample(PlmsPermissionExample example);

    /**
     * 通过角色id 查询角色 拥有的权限
     * @param roleId 角色id
     * @return 实体集
     */
    List<PlmsPermission> selectPermissionsByRoleId(Long roleId);

    /**
     * 通过角色ID集合查找权限
     * @param roleIds 角色ID集合
     * @return 实体集
     */
    List<PlmsPermission> selectPermissionsByRoleIds(List<Long> roleIds);
    
}
