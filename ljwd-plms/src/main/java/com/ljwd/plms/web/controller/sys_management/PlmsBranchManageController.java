package com.ljwd.plms.web.controller.sys_management;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ljwd.plms.core.entity.JSONResult;
import com.ljwd.plms.core.feature.orm.mybatis.Page;
import com.ljwd.plms.core.util.InitOrgToTreeList;
import com.ljwd.plms.core.util.PageUtil;
import com.ljwd.plms.web.model.case_management.PlmsEmpCollectSet;
import com.ljwd.plms.web.model.case_management.PlmsEmpCollectSetExample;
import com.ljwd.plms.web.model.sys_management.PlmsSysBranchManageExample;
import com.ljwd.plms.web.model.sys_management.SysOrg;
import com.ljwd.plms.web.model.sys_management.SysOrgExample;
import com.ljwd.plms.web.model.sys_management.SysSite;
import com.ljwd.plms.web.model.sys_management.SysSiteExample;
import com.ljwd.plms.web.model.sys_management.SysUser;
import com.ljwd.plms.web.model.sys_management.SysUserExample;
import com.ljwd.plms.web.security.PermissionSign;
import com.ljwd.plms.web.security.SubjectUtil;
import com.ljwd.plms.web.service.sys_management.inf.PlmsBranchManageService;
import com.ljwd.plms.web.service.sys_management.inf.SysOrgService;
import com.ljwd.plms.web.service.sys_management.inf.SysSiteService;
import com.ljwd.plms.web.service.sys_management.inf.SysUserService;
import com.ljwd.plms.web.vo.DataTableParam;
import com.ljwd.plms.web.vo.sys_management.BranchManageResult;
import com.ljwd.plms.web.vo.sys_management.PlmsEmpCollectorParam;


@Controller
@RequestMapping("plmsBranchManage")
public class PlmsBranchManageController {
	
	@Resource
	private SysOrgService sysOrgService;
	@Resource
	private SysSiteService sysSiteService;
	@Resource
	private PlmsBranchManageService plmsBranchManageService;
	@Resource
	private SysUserService sysUserService;
	
	
	
	
	@RequestMapping(value="/view",method = RequestMethod.GET)
	@RequiresPermissions(PermissionSign.BRANCHMANAGE_SELECT)
	public String view(Model model){
		SysOrgExample exampOrg = new SysOrgExample();
		List<SysOrg> orgList= sysOrgService.selectByExample(exampOrg);
		List<SysOrg> treeList = new ArrayList<SysOrg>();
		InitOrgToTreeList.InitOrganizationDropDown(treeList,orgList,0,0);
		//网点列表
		List<SysSite> siteList = new ArrayList<SysSite>();
		SysSiteExample exam = new SysSiteExample();
		exam.setIsActive("Y");
		siteList= sysSiteService.selectByExample(exam);
		//用户列表
		SysUserExample examUser = new SysUserExample();
		List<SysUser> userList = sysUserService.selectByExample(examUser);
		//机构
		model.addAttribute("orgList", treeList);
		model.addAttribute("siteList", siteList);
		model.addAttribute("userList", userList);
		return "/jsp/sys_management/branchManage";
		
	}
	
	/**
	 * 
	* @Description: 分页查询
	* @param example
	* @return
	* @return String
	 */
	@RequestMapping("/pageBranchManageData")
	@ResponseBody
	@RequiresPermissions(PermissionSign.BRANCHMANAGE_SELECT)
	public String  pageBranchManageData(PlmsEmpCollectorParam example){
		 	if(example.getParamData() == null || "".equals(example.getParamData())){
	            return PageUtil.getPageJson(1, new Page<Object>()); //参数有误返回返回空数据
	        }

	        //分页条件
	        DataTableParam dataTableParam = PageUtil.getDataTableParamByJsonParamNoSort(example.getParamData());
	        //记录操作的次数
	        int sEcho = dataTableParam.getsEcho();
	        //每页记录数
	        int pageSize = dataTableParam.getiDisplayLength();
	        //页数
	        int pageNo = dataTableParam.getiDisplayStart() / dataTableParam.getiDisplayLength() + 1;

	        Page<BranchManageResult> pageData = new Page<BranchManageResult>(pageNo, pageSize);

	        pageData = plmsBranchManageService.selectByExampleAndPage(pageData, example);

	        return PageUtil.getPageJson(sEcho, pageData);
		
	}
	
	
	
	@RequestMapping("/addBranch")
	@ResponseBody
	@RequiresPermissions(PermissionSign.BRANCHMANAGE_INSERT)
	public JSONResult addBranch(PlmsSysBranchManageExample example){
		if(example.getOrgId()==null){
			return new JSONResult(false,"所属机构不能为空！");

		}
		if(example.getUserId()==null){
			return new JSONResult(false,"用户姓名不能为空！");

		}
		if(example.getSiteCode()==null&&example.getSiteCode().length>0){
			return new JSONResult(false,"监管的网点不能为空！");

		}
		String userId = example.getUserId();
		PlmsSysBranchManageExample manageExample = new PlmsSysBranchManageExample();
		manageExample.setUserId(userId);
		int count = plmsBranchManageService.countByExample(manageExample);
		if(count>0){
			return new JSONResult(false,"此用户已存在，不能重复添加！");	
		}
		String createBy = SubjectUtil.getUserId();
		plmsBranchManageService.insertBranchManage(example, createBy);
		return new JSONResult(true,"添加成功！");		
	}
	
	
	@RequestMapping("/updateBranchManage")
	@ResponseBody
	@RequiresPermissions(PermissionSign.BRANCHMANAGE_UPDATE)
	public JSONResult updateBranchManage(PlmsSysBranchManageExample example){
		if(example.getOrgId()==null){
			return new JSONResult(false,"所属机构不能为空！");

		}
		if(example.getUserId()==null){
			return new JSONResult(false,"催收员不能为空！");

		}
		if(example.getSiteCode()==null&&example.getSiteCode().length>0){
			return new JSONResult(false,"监管的网点不能为空！");

		}
		String userId = example.getUserId();
		PlmsSysBranchManageExample manageExample = new PlmsSysBranchManageExample();
		manageExample.setUserId(userId);
		int count = plmsBranchManageService.countByExample(manageExample);
		if(count==0){
			return new JSONResult(false,"修改失败！");
		}
		
		String updateBy = SubjectUtil.getUserId();
		plmsBranchManageService.updateBranchManage(example, updateBy); 	
		return new JSONResult(true,"更新成功！"); 
	    
	}
	
	
	@RequestMapping("/deleteBranchManage")
	@ResponseBody
	@RequiresPermissions(PermissionSign.BRANCHMANAGE_DELETE)
	public JSONResult deleteBranchManage(String userId){
		if(userId==null){
			return new JSONResult(false,"删除失败！");
		}
		int i = plmsBranchManageService.deleteByUserId(userId);
		if(i>0){
			return new JSONResult(true,"删除成功！");
		}else{
			return new JSONResult(false,"删除失败！");

		}
	}
}
