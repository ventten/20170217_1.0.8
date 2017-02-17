package com.ljwd.plms.web.service.sys_management.inf;

import com.ljwd.plms.core.generic.GenericService;
import com.ljwd.plms.web.model.sys_management.PlmsRolePermission;
import com.ljwd.plms.web.model.sys_management.PlmsRolePermissionExample;
import org.springframework.stereotype.Service;

/**
 * 角色权限表,plms_role_permission
 * */
public interface PlmsRolePermissionService extends GenericService<PlmsRolePermission, Long> {

    /**
     * 根据条件删除
     * @param example 条件
     * @return int 删除记录数
     * */
    int deleteByExample(PlmsRolePermissionExample example);

}
