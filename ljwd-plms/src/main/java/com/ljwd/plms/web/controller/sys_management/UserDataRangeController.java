package com.ljwd.plms.web.controller.sys_management;

import java.util.ArrayList;
import java.util.List;

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
import com.ljwd.plms.core.util.JSONUtil;
import com.ljwd.plms.core.util.PageUtil;
import com.ljwd.plms.web.model.sys_management.PlmsOrgScopeRelation;
import com.ljwd.plms.web.model.sys_management.PlmsOrgScopeRelationExample;
import com.ljwd.plms.web.model.sys_management.PlmsSysUserDataRange;
import com.ljwd.plms.web.model.sys_management.PlmsSysUserDataRangeExample;
import com.ljwd.plms.web.model.sys_management.SysOrg;
import com.ljwd.plms.web.model.sys_management.SysOrgExample;
import com.ljwd.plms.web.security.PermissionSign;
import com.ljwd.plms.web.service.sys_management.inf.PlmsSysUserDataRangeService;
import com.ljwd.plms.web.service.sys_management.inf.SysOrgService;
import com.ljwd.plms.web.vo.DataTableParam;
import com.ljwd.plms.web.vo.sys_management.TreeModel;
import com.ljwd.plms.web.vo.sys_management.UserEmpOrgDto;
/**
 * 用户数据权限管理
 * <p>Title: UserDataRangeController</p>
 * @author pangshanxing
 * @date 2016年9月6日上午11:14:00
 */
@Component
@RequestMapping("/userDataRange")
public class UserDataRangeController {

	@Resource
	private SysOrgService sysOrgService;
	@Resource
	private PlmsSysUserDataRangeService plmsSysUserDataRangeService;
	
	@RequestMapping(value="/view",method = RequestMethod.GET)
	@RequiresPermissions(PermissionSign.USERDATARANGE_SELECT)
	public String view(Model model){
		SysOrgExample exampOrg = new SysOrgExample();
		List<SysOrg> orgList= sysOrgService.selectByExample(exampOrg);
		List<SysOrg> treeList = new ArrayList<SysOrg>();
		InitOrgToTreeList.InitOrganizationDropDown(treeList,orgList,0,0);
		//机构
		model.addAttribute("orgList", treeList);
		return "/jsp/sys_management/userDataRange";
		
	}
	
	/**
	 * 
	* @Description: 分页显示
	* @param example
	* @return
	* @return String
	 */
	@RequestMapping("/pageUserDataRangeData")
	@ResponseBody
	@RequiresPermissions(PermissionSign.USERDATARANGE_SELECT)
	public String pageUserDataRangeData(PlmsSysUserDataRangeExample example){
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
	        Page<PlmsSysUserDataRange> pageData = new Page<PlmsSysUserDataRange>(pageNo, pageSize);

	        pageData = plmsSysUserDataRangeService.selectByExampleAndPage(pageData, example);

	        return PageUtil.getPageJson(sEcho, pageData);

		
	}
	/**
	 * 
	* @Description: 跳转到新增页面 
	* @param model
	* @return
	* @return String
	 */
	@RequestMapping(value="/toAddUserDataRange",method = RequestMethod.GET)
	@RequiresPermissions(PermissionSign.USERDATARANGE_INSERT)
	public String toAddUserDataRange(Model model){
		SysOrgExample exampOrg = new SysOrgExample();
		List<SysOrg> orgList= sysOrgService.selectByExample(exampOrg);
		List<SysOrg> orgList_temp = sysOrgService.selectByExample(exampOrg);
		//权限机构
		model.addAttribute("orgList_temp", orgList_temp);
		List<SysOrg> treeList = new ArrayList<SysOrg>();
		InitOrgToTreeList.InitOrganizationDropDown(treeList,orgList,0,0);
		//机构
		model.addAttribute("orgList", treeList);
		
		return "/jsp/sys_management/toAddUserDataRange";
		
	}
	
	/**
	 * 
	* @Description: 新增用户数据权限
	* @param model
	* @return
	* @return JSONResult
	 */
	@RequestMapping("/addUserDataRange")
	@ResponseBody
	@RequiresPermissions(PermissionSign.USERDATARANGE_INSERT)
	public JSONResult addUserDataRange(PlmsSysUserDataRange model,Long[] orgIdList){
		String userId = model.getUserId();
		if(userId == null){
			return new JSONResult(false,"请选择用户！");
		}else{
			PlmsSysUserDataRangeExample example= new PlmsSysUserDataRangeExample();
			example.setUserId(userId);
			List<PlmsSysUserDataRange> list = plmsSysUserDataRangeService.selectByExample(example);
			if(list.size()>0){
				return new JSONResult(false,"此用户已经存在机构权限");
			}
		}
		
		if(orgIdList.length==0){
			return new JSONResult(false,"请选择机构权限！");
		}
		 Subject subject = SecurityUtils.getSubject();
	     String userName = (String) subject.getPrincipal();
	     plmsSysUserDataRangeService.addUserDataRange(userId, orgIdList, userName);
		 return new JSONResult(true,"添加成功！");

	}
	 
	/**
	 * 
	* @Description: 跳转至修改用户数据权限页面
	* @return
	* @return String
	 */
	@RequestMapping(value="/toUpdateUserDataRange",method=RequestMethod.GET)
	@RequiresPermissions(PermissionSign.USERDATARANGE_UPDATE)
	public String toUpdateUserDataRange(String  userId,Model model){
		SysOrgExample exampOrg = new SysOrgExample();
		List<SysOrg> orgList= sysOrgService.selectByExample(exampOrg);
		List<SysOrg> orgList_temp = sysOrgService.selectByExample(exampOrg);
		model.addAttribute("orgList_temp", orgList_temp);
		List<SysOrg> treeList = new ArrayList<SysOrg>();
		InitOrgToTreeList.InitOrganizationDropDown(treeList,orgList,0,0);
		List<UserEmpOrgDto> userList = plmsSysUserDataRangeService.selectByUserId(userId,null);
		if(userList.size()>0){
			model.addAttribute("user", userList.get(0));
		}
		List<Long> orgCheckedList = plmsSysUserDataRangeService.selectOrgListByUserId(userId);
		String orgChecked = "";
		if(orgCheckedList.size()>0){
			for(Long orgId:orgCheckedList){
				orgChecked+=orgId+",";
			}
			
		}
		model.addAttribute("orgChecked", orgChecked);
		//权限机构树形
		model.addAttribute("orgList", treeList);

		
		return "/jsp/sys_management/toUpdateUserDataRange";
		
	}
	/**
	 * 
	* @Description: 修改用户数据权限
	* @param model
	* @param orgIdList
	* @return
	* @return JSONResult
	 */
	@RequestMapping("/updateUserDataRange")
	@ResponseBody
	@RequiresPermissions(PermissionSign.USERDATARANGE_UPDATE)
	public JSONResult updateUserDataRange(String  userId,Long[] orgIdList){
		if(orgIdList.length==0){
			return new JSONResult(false,"请选择机构权限！");
		}
		 Subject subject = SecurityUtils.getSubject();
	     String userName = (String) subject.getPrincipal();
	     plmsSysUserDataRangeService.updateUserDataRange(userId, orgIdList, userName);
		 return new JSONResult(true,"修改成功！");
		
	}
	
	@RequestMapping("/selectUserByOrgId")
	@ResponseBody
	public String selectUserByOrgId(String orgId,String userId){
		
		List<UserEmpOrgDto> userList = plmsSysUserDataRangeService.selectByUserId(userId,orgId);

		return JSONUtil.toJSONString(userList);
		
	}
	
	@RequestMapping(value="/getOrgList",method = RequestMethod.GET)
	@ResponseBody
	public String getOrgList(String userId){
		List<Long> orgCheckedList = new ArrayList<Long>();
		if(userId !=null){
			 orgCheckedList = plmsSysUserDataRangeService.selectOrgListByUserId(userId);	
		}
		SysOrgExample exampOrg = new SysOrgExample();
		List<SysOrg> orgList_temp = sysOrgService.selectByExample(exampOrg);
		List<TreeModel> list = new ArrayList<TreeModel>();
		for(SysOrg org:orgList_temp){
			TreeModel tree = new TreeModel();
			tree.setChecked(false);
			if(orgCheckedList.size()>0){
				tree.setOpen(true);
				for(Long orgId:orgCheckedList){
					if(orgId.longValue()==org.getId().longValue()){
						tree.setChecked(true);
					}
				}
			}else{
				tree.setOpen(false);
			}
			tree.setId(org.getId());
			tree.setpId(org.getPid());
			tree.setName(org.getOrgName());			
			list.add(tree);
		}
		return JSONUtil.toJSONString(list);
		
	}
	
	@RequestMapping("/deleteUserDataRange")
	@ResponseBody
	@RequiresPermissions(PermissionSign.USERDATARANGE_DELETE)
	public JSONResult deleteUserDataRange(String userId){
		
		if(userId==null){
			return new JSONResult(false,"删除失败！");
		}
		if(userId !=null){
			PlmsSysUserDataRangeExample example= new PlmsSysUserDataRangeExample();
			example.setUserId(userId);
			List<PlmsSysUserDataRange> list = plmsSysUserDataRangeService.selectByExample(example);
			if(list.size()==0){
				return new JSONResult(false,"无此用户的数据！");
			}else{
				plmsSysUserDataRangeService.deleteUserDataRange(userId);
			}
		}
		return new JSONResult(true,"删除成功！");
		
	}
}
