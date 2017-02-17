package com.ljwd.plms.web.service.sys_management.inf;

import com.ljwd.plms.core.generic.GenericService;
import com.ljwd.plms.web.model.sys_management.PlmsRole;
import com.ljwd.plms.web.model.sys_management.PlmsUserRole;
import com.ljwd.plms.web.model.sys_management.PlmsUserRoleExample;

import java.util.List;

/**
 * 用户角色表,plms_user_role
 * */
public interface PlmsUserRoleService extends GenericService<PlmsUserRole, Long> {

    /**
     * 根据条件删除
     * @param example 条件
     * @return int 删除记录数
     * */
    int deleteByExample(PlmsUserRoleExample example);

    /**
     * 分配权限
     * @param userId 用户ID
     * @param roleIds 角色ID数组
     * @param loginUser 操作员
     * */
    void doAllotRole(String userId,Long[] roleIds,String loginUser);

    /**
     * 根据条件查询
     * @param example 条件
     * @return 实体集
     * */
    List<PlmsUserRole> selectByExample(PlmsUserRoleExample example);

}
