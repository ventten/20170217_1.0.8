package com.ljwd.plms.web.service.sys_management.inf;

import com.ljwd.plms.core.feature.orm.mybatis.Page;
import com.ljwd.plms.core.generic.GenericService;
import com.ljwd.plms.mapp.vo.egress.AppUserVo;
import com.ljwd.plms.web.model.sys_management.SysUser;
import com.ljwd.plms.web.model.sys_management.SysUserExample;
import com.ljwd.plms.web.vo.sys_management.SysUserExtention;
import com.ljwd.plms.web.vo.sys_management.UserEmpOrgDto;

import java.util.List;
import java.util.Map;

/**
 * 系统用户表,sys_user
 * */
public interface SysUserService extends GenericService<SysUser, String> {

    /**
     * 用户登录验证查询
     * @param user 登录用户
     * @return SysUser
     */
	SysUser authentication(SysUser user);

    /**
     * 根据用户名查询用户
     * @param userId 用户名
     * @return SysUser
     */
	SysUser selectByUserId(String userId);
	
	/**
	 * 条件查询
	 * @param example 查询条件
	 * @return 集合
	 */
	List<SysUser> selectByExample(SysUserExample example);

    /**
     * 分页条件查询
     * @param page Page信息
     * @param example 查询条件
     * @return Page数据
     */
	Page<SysUser> selectByExampleAndPage(Page<SysUser> page, SysUserExample example);

    /**
     * 根据用户ID查询用户分机
     * @param userId 用户ID
     * @return 实体
     * */
    SysUserExtention selectUserExtentionByUserId(String userId);

	/**
	 * 查询未离职
	 * @param map 查询条件
	 * @return 集合
	 */
    List<SysUser> selectByMap(Map<String,Object> map);

    /**
     * 查找催收人员机构信息
     * @param orgId 机构ID,可空
     * @param userId 用户ID,可空(当前登录用户为管理员时传null,查所有的催收人员机构信息;不为空时查当前登录用户同机构及下属机构的催收人员机构信息)
     * @return 实体集
     * */
    List<UserEmpOrgDto> selectUserEmpOrg(Long orgId,String userId);

    /**
     * 
    * @Description: 查找特定区间的催收员信息
    * @param orgId
    * @param status
    * @return
    * @return List<UserEmpOrgDto>
     */
	List<UserEmpOrgDto> selectUserEmpOrgByStatus(Long orgId, String status);

	/**
	 * 查询用户信息
	 * @param empNo  员工编号
	 * @param mobile 外访表绑定的手机号码
	 * @return 返回用户信息
	 */
	List<AppUserVo> selectUser(String empNo, String mobile);
}
