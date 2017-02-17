package com.ljwd.plms.web.dao.sys_management;

import java.util.List;

import com.ljwd.plms.core.feature.orm.mybatis.Page;
import com.ljwd.plms.web.model.sys_management.PlmsRoleExample;
import org.apache.ibatis.annotations.Param;

import com.ljwd.plms.core.generic.GenericDao;
import com.ljwd.plms.web.model.sys_management.PlmsRole;

/**
 * 系统角色表,plms_role
 * */
public interface PlmsRoleMapper extends GenericDao<PlmsRole, Long>{

    int countByExample(PlmsRoleExample example);

    int deleteByExample(PlmsRoleExample example);

    int deleteByPrimaryKey(Long id);

    int insert(PlmsRole record);

    int insertSelective(PlmsRole record);

    List<PlmsRole> selectByExample(PlmsRoleExample example);

    PlmsRole selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") PlmsRole record, @Param("example") PlmsRoleExample example);

    int updateByExample(@Param("record") PlmsRole record, @Param("example") PlmsRoleExample example);

    int updateByPrimaryKeySelective(PlmsRole record);

    int updateByPrimaryKey(PlmsRole record);
    
    /**
     * 通过用户id 查询用户 拥有的角色
     * @param userId 用户id
     * @return 实体集
     */
    List<PlmsRole> selectRolesByUserId(String userId);

    /**
     * 分页条件查询
     * @param page Page信息
     * @param example 查询条件
     * @return Page数据
     */
    List<PlmsRole> selectByExampleAndPage(Page<PlmsRole> page, PlmsRoleExample example);

}