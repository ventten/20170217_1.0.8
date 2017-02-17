package com.ljwd.plms.web.controller.sys_management;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ljwd.plms.core.entity.JSONResult;
import com.ljwd.plms.core.feature.orm.mybatis.Page;
import com.ljwd.plms.core.util.InitOrgToTreeList;
import com.ljwd.plms.core.util.PageUtil;
import com.ljwd.plms.web.model.sys_management.PlmsRole;
import com.ljwd.plms.web.model.sys_management.PlmsRoleExample;
import com.ljwd.plms.web.model.sys_management.PlmsUserUpperLimit;
import com.ljwd.plms.web.model.sys_management.PlmsUserUpperLimitExample;
import com.ljwd.plms.web.model.sys_management.SysOrg;
import com.ljwd.plms.web.model.sys_management.SysOrgExample;
import com.ljwd.plms.web.model.sys_management.SysUser;
import com.ljwd.plms.web.security.PermissionSign;
import com.ljwd.plms.web.service.sys_management.inf.PlmsRoleService;
import com.ljwd.plms.web.service.sys_management.inf.PlmsUserUpperLimitService;
import com.ljwd.plms.web.service.sys_management.inf.SysOrgService;
import com.ljwd.plms.web.service.sys_management.inf.SysUserService;
import com.ljwd.plms.web.vo.DataTableParam;
/**
 * 月分配案件数管理
 * <p>Title: InstallUpperLimitController</p>
 * @author pangshanxing
 * @date 2016年9月6日上午11:09:10
 */
@Component
@RequestMapping("/allocInstall")
public class InstallUpperLimitController {
	
	@Resource
	private SysOrgService sysOrgService;
	@Resource
	private PlmsRoleService plmsRoleService;
	@Resource
	private SysUserService sysUserService;
	@Resource
	private PlmsUserUpperLimitService plmsUserUpperLimitService;
	
	@RequestMapping("/view")
	@RequiresPermissions(PermissionSign.MONTHALLOCUPPER_SELECT)
	public String view(Model model){
		SysOrgExample exampOrg = new SysOrgExample();
		List<SysOrg> orgList= sysOrgService.selectByExample(exampOrg);
		List<SysOrg> treeList = new ArrayList<SysOrg>();
		InitOrgToTreeList.InitOrganizationDropDown(treeList,orgList,0,0);
		PlmsRoleExample exampRole = new PlmsRoleExample();
		exampRole.setIsActive("Y");
		List<PlmsRole> roleList = plmsRoleService.selectByExample(exampRole);
		Map<String,Object> map = new HashMap<String,Object>();
		List<SysUser> userList = sysUserService.selectByMap(map);
		model.addAttribute("orgList", treeList);
		model.addAttribute("roleList", roleList);
		model.addAttribute("userList", userList);
		return "/jsp/sys_management/installAllocCount";
		
	}
	
	
	/**
	 * 
	* @Description: 月上限设置分页显示 
	* @param example
	* @return
	* @return String
	 */
	@RequestMapping(value="/pageUpperLimitData", method=RequestMethod.POST)
	@ResponseBody
	@RequiresPermissions(PermissionSign.MONTHALLOCUPPER_SELECT)
	public String pageUpperLimitData(PlmsUserUpperLimitExample example){
		 if(example.getParamData() == null || "".equals(example.getParamData())){
	            return PageUtil.getPageJson(1, new Page<Object>()); //参数有误返回返回空数据
	        }

	        //分页条件
	        DataTableParam dataTableParam = PageUtil.getDataTableParamByJsonParam(example.getParamData());
	        //记录操作的次数
	        int sEcho = dataTableParam.getsEcho();
	        //每页记录数
	        int pageSize = dataTableParam.getiDisplayLength();
	        //页数
	        int pageNo = dataTableParam.getiDisplayStart() / dataTableParam.getiDisplayLength() + 1;
	        //设置排序
	        example.setOrderByClause(dataTableParam);
	        Page<PlmsUserUpperLimit> pageData = new Page<PlmsUserUpperLimit>(pageNo, pageSize);

	        pageData = plmsUserUpperLimitService.selectByExampleAndPage(pageData, example);

	        return PageUtil.getPageJson(sEcho, pageData);

		
	}
	
	/**
	 * 
	* @Description: 新增月上限设置 
	* @param model
	* @return
	* @return JSONResult
	 */
	@RequestMapping(value="/addUpperLimit",method=RequestMethod.POST)
	@RequiresPermissions(PermissionSign.MONTHALLOCUPPER_INSERT)
	@ResponseBody
	public JSONResult addUpperLimit(PlmsUserUpperLimit model){
		 Subject subject = SecurityUtils.getSubject();
	     String userName = (String) subject.getPrincipal();
	     model.setCreatedBy(userName);
	     model.setCreateTime(new Date());
	     model.setUpdatedBy(userName);
	     model.setUpdateTime(new Date());
	     model.setRecVer(0L);
	     model.setTagSeq(1L);
	     model.setIsActive("Y");
	     int i = plmsUserUpperLimitService.insert(model);
	     if(i>0){
				return new JSONResult(true,"操作成功！"); 
	     }else{
				return new JSONResult(false,"操作失败！");

	     }
		
	}
	
	@RequestMapping(value="/updateUpperLimit",method=RequestMethod.POST)
	@ResponseBody
	@RequiresPermissions(PermissionSign.MONTHALLOCUPPER_UPDATE)
	public JSONResult updateUpperLimit(PlmsUserUpperLimit model){
		 Subject subject = SecurityUtils.getSubject();
	     String userName = (String) subject.getPrincipal();
	     model.setUpdatedBy(userName);
	     model.setUpdateTime(new Date());
	     int i = plmsUserUpperLimitService.update(model);
	     if(i>0){
				return new JSONResult(true,"操作成功！"); 
	     }else{
				return new JSONResult(false,"操作失败！");

	     }
		
	}
	
	
}
