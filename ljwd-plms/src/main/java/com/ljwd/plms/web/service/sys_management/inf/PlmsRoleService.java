package com.ljwd.plms.web.service.sys_management.inf;

import java.util.List;

import com.ljwd.plms.core.feature.orm.mybatis.Page;
import com.ljwd.plms.core.generic.GenericService;
import com.ljwd.plms.web.model.sys_management.PlmsRole;
import com.ljwd.plms.web.model.sys_management.PlmsRoleExample;

/**
 * 系统角色表,plms_role
 * */
public interface PlmsRoleService extends GenericService<PlmsRole, Long> {

    /**
     * 通过用户id 查询用户 拥有的角色
     * @param userId 用户id
     * @return 实体集
     */
    List<PlmsRole> selectRolesByUserId(String userId);

    /**
     * 条件查询
     * @param example 查询条件
     * @return 实体集
     */
    List<PlmsRole> selectByExample(PlmsRoleExample example);

    /**
     * 分页条件查询
     * @param page Page信息
     * @param example 查询条件
     * @return Page数据
     */
    Page<PlmsRole> selectByExampleAndPage(Page<PlmsRole> page, PlmsRoleExample example);

    /**
     * 添加角色
     * @param role 角色
     * @param permIds 权限ID数组
     * @param loginUser 操作员
     * */
    void addRole(PlmsRole role,Long[] permIds,String loginUser);

    /**
     * 修改角色
     * @param role 角色
     * @param permIds 权限ID数组
     * @param loginUser 操作员
     * */
    void updateRole(PlmsRole role,Long[] permIds,String loginUser);

    /**
     * 根据条件删除
     * @param example 删除条件
     * @return 删除记录数
     */
    int deleteByExample(PlmsRoleExample example);
    
}
