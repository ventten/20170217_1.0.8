package com.ljwd.plms.web.controller.sys_management;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ljwd.plms.core.entity.JSONResult;
import com.ljwd.plms.core.feature.orm.mybatis.Page;
import com.ljwd.plms.core.util.InitOrgToTreeList;
import com.ljwd.plms.core.util.PageUtil;
import com.ljwd.plms.web.model.outVisit.PlmsOvmOutVisitArea;
import com.ljwd.plms.web.model.outVisit.PlmsOvmOutVisitAreaExample;
import com.ljwd.plms.web.model.outVisit.PlmsOvmOutVisitUser;
import com.ljwd.plms.web.model.outVisit.PlmsOvmOutVisitUserExample;
import com.ljwd.plms.web.model.sys_management.SysOrg;
import com.ljwd.plms.web.model.sys_management.SysOrgExample;
import com.ljwd.plms.web.model.sys_management.SysUser;
import com.ljwd.plms.web.model.sys_management.SysUserExample;
import com.ljwd.plms.web.security.PermissionSign;
import com.ljwd.plms.web.security.SubjectUtil;
import com.ljwd.plms.web.service.outVisit.inf.PlmsOvmOutVisitAreaService;
import com.ljwd.plms.web.service.outVisit.inf.PlmsOvmOutVisitUserService;
import com.ljwd.plms.web.service.sys_management.inf.SysOrgService;
import com.ljwd.plms.web.service.sys_management.inf.SysUserService;
import com.ljwd.plms.web.vo.DataTableParam;
import com.ljwd.plms.web.vo.sys_management.PlmsEmpCollectorParam;

/**
 * 外访用户管理
 * <p>Title: PlmsOutVisitUserController</p>
 * @author pangshanxing
 * @date 2016年9月22日上午10:19:45
 */
@Component
@RequestMapping("plmsOutVisitUser")
public class PlmsOutVisitUserController {

	@Resource
	private SysOrgService sysOrgService;
	@Resource
	private SysUserService sysUserService;
	@Resource
	private PlmsOvmOutVisitUserService plmsOvmOutVisitUserService;
	@Resource
	private PlmsOvmOutVisitAreaService plmsOvmOutVisitAreaService;
	
	@RequestMapping(value="/view",method = RequestMethod.GET)
	@RequiresPermissions(PermissionSign.OUTVISITUSER_SELECT)
	public String view(Model model){
		SysOrgExample exampOrg = new SysOrgExample();
		List<SysOrg> orgList= sysOrgService.selectByExample(exampOrg);
		List<SysOrg> treeList = new ArrayList<SysOrg>();
		InitOrgToTreeList.InitOrganizationDropDown(treeList,orgList,0,0);
		PlmsOvmOutVisitAreaExample example= new PlmsOvmOutVisitAreaExample();
		example.setIsActive("Y");
		List<PlmsOvmOutVisitArea> areaList = plmsOvmOutVisitAreaService.selectByExample(example);
		SysUserExample examUser = new SysUserExample();
		List<SysUser> userList = sysUserService.selectByExample(examUser);
		//机构
		model.addAttribute("orgList", treeList);
		//区域
		model.addAttribute("areaList", areaList);
		//用户列表
		model.addAttribute("userList", userList);
		return "/jsp/sys_management/outVisiter";
		
	}
	
	@RequestMapping("/pageOutVisitUserData")
	@ResponseBody
	@RequiresPermissions(PermissionSign.OUTVISITUSER_SELECT)
	public String pageOutVisitUserData(PlmsEmpCollectorParam example){
		
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
	        Page<PlmsOvmOutVisitUser> pageData = new Page<PlmsOvmOutVisitUser>(pageNo, pageSize);

	        pageData = plmsOvmOutVisitUserService.selectByExampleAndPage(pageData, example);

	        return PageUtil.getPageJson(sEcho, pageData);

		
	}
	
	
	
	@RequestMapping("/addOutVisitUser")
	@ResponseBody
	@RequiresPermissions(PermissionSign.OUTVISITUSER_INSERT)
	public JSONResult addOutVisitUser(PlmsEmpCollectorParam outVisiter){
		if(outVisiter.getOrgId()==null){
			return new JSONResult(false,"所属机构不能为空！");

		}
		if(outVisiter.getUserId()==null){
			return new JSONResult(false,"外访员不能为空！");

		}
		if(outVisiter.getAreaId()==null){
			return new JSONResult(false,"所属区域不能为空！");

		}
		PlmsOvmOutVisitUserExample example = new PlmsOvmOutVisitUserExample();
		example.setUserId(outVisiter.getUserId());
		example.setIsActive("Y");
		List<PlmsOvmOutVisitUser>  userList = plmsOvmOutVisitUserService.selectByExample(example);
		if(userList.size()>0){
			return new JSONResult(false,"此外访人员已经存在!");
		}
		String createBy = SubjectUtil.getUserId();
		plmsOvmOutVisitUserService.insertOutVisitUser(outVisiter, createBy);
		return new JSONResult(true,"添加成功！");
		
	}
	
	@RequestMapping(value ="/updateOutVisitUser",method = RequestMethod.POST)
	@ResponseBody
	@RequiresPermissions(PermissionSign.OUTVISITUSER_UPDATE)
	public JSONResult updateOutVisitUser(PlmsEmpCollectorParam outVisiter){
		if(outVisiter.getOrgId()==null){
			return new JSONResult(false,"所属机构不能为空！");

		}
		if(outVisiter.getUserId()==null){
			return new JSONResult(false,"外访员不能为空！");

		}
		if(outVisiter.getAreaId()==null){
			return new JSONResult(false,"所属区域不能为空！");

		}
		String createBy = SubjectUtil.getUserId();
		plmsOvmOutVisitUserService.updatetOutVisitUser(outVisiter, createBy);
		return new JSONResult(true,"修改成功！");	
	}
	
	@RequestMapping(value ="/deleteOutVisitUser")
	@ResponseBody
	@RequiresPermissions(PermissionSign.OUTVISITUSER_DELETE)
	public JSONResult deleteOutVisitUser(Long id){
		if(id==null){
			return new JSONResult(false,"删除失败！");

		}
		String createBy = SubjectUtil.getUserId();
		plmsOvmOutVisitUserService.delete(id);
		return new JSONResult(true,"删除成功！");	
	}
}
