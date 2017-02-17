package com.ljwd.plms.web.controller.sys_management;

import java.util.ArrayList;
import java.util.Arrays;
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
import com.ljwd.plms.web.model.case_management.PlmsEmpCollectSet;
import com.ljwd.plms.web.model.case_management.PlmsEmpCollectSetExample;
import com.ljwd.plms.web.model.sys_management.SysOrg;
import com.ljwd.plms.web.model.sys_management.SysOrgExample;
import com.ljwd.plms.web.model.sys_management.SysUser;
import com.ljwd.plms.web.model.sys_management.SysUserExample;
import com.ljwd.plms.web.model.workorder_pool.PlmsCollectionRuleSet;
import com.ljwd.plms.web.model.workorder_pool.PlmsCollectionRuleSetExample;
import com.ljwd.plms.web.security.PermissionSign;
import com.ljwd.plms.web.security.SubjectUtil;
import com.ljwd.plms.web.service.case_management.inf.PlmsEmpCollectSetService;
import com.ljwd.plms.web.service.sys_management.inf.SysOrgService;
import com.ljwd.plms.web.service.sys_management.inf.SysUserService;
import com.ljwd.plms.web.service.workorder_pool.inf.PlmsCollectionRuleSetService;
import com.ljwd.plms.web.vo.DataTableParam;
import com.ljwd.plms.web.vo.sys_management.PlmsEmpCollectorParam;
/**
 * 催收用户管理 
 * <p>Title: PlmsEmpCollectSetController</p>
 * @author pangshanxing
 * @date 2016年9月22日上午10:19:16
 */
@Component
@RequestMapping("plmsEmpCollectSet")
public class PlmsEmpCollectSetController {
	
	@Resource
	private PlmsEmpCollectSetService plmsEmpCollectSetService;
	@Resource
	private PlmsCollectionRuleSetService plmsCollectionRuleSetService;
	@Resource
	private SysOrgService sysOrgService;
	@Resource
	private SysUserService sysUserService;

	@RequestMapping(value="/view",method = RequestMethod.GET)
	@RequiresPermissions(PermissionSign.COLLECTOR_SELECT)
	public String view(Model model){
		//区间列表
		PlmsCollectionRuleSetExample example = new PlmsCollectionRuleSetExample();
		example.createCriteria().andIsActiveEqualTo("Y");
		List<PlmsCollectionRuleSet> scopeList = plmsCollectionRuleSetService.selectByExampleList(example);
		//机构列表
		SysOrgExample exampOrg = new SysOrgExample();
		List<SysOrg> orgList= sysOrgService.selectByExample(exampOrg);
		List<SysOrg> treeList = new ArrayList<SysOrg>();
		InitOrgToTreeList.InitOrganizationDropDown(treeList,orgList,0,0);
		//用户列表
		SysUserExample examUser = new SysUserExample();
		List<SysUser> userList = sysUserService.selectByExample(examUser);
		//机构
		model.addAttribute("orgList", treeList);
		model.addAttribute("scopeList", scopeList);
		model.addAttribute("userList", userList);

		return "/jsp/sys_management/empCollectSet";
	}
	
	
	/**
	 * 
	* @Description: 催收用户分页显示
	* @param example
	* @return
	* @return String
	 */
	@RequestMapping("/pageEmpCollectSetData")
	@ResponseBody
	@RequiresPermissions(PermissionSign.COLLECTOR_SELECT)
	public String pageOrgScopeData(PlmsEmpCollectorParam example){
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
	        Page<PlmsEmpCollectSet> pageData = new Page<PlmsEmpCollectSet>(pageNo, pageSize);

	        pageData = plmsEmpCollectSetService.selectByExampleAndPage(pageData, example);

	        return PageUtil.getPageJson(sEcho, pageData);

		
	}
	
	
	@RequestMapping("/addEmpCollectSet")
	@ResponseBody
	@RequiresPermissions(PermissionSign.COLLECTOR_INSERT)
	public JSONResult addEmpCollectSet(PlmsEmpCollectorParam set){
		if(set.getOrgId()==null){
			return new JSONResult(false,"所属机构不能为空！");

		}
		if(set.getUserId()==null){
			return new JSONResult(false,"催收员不能为空！");

		}
		if(set.getIsLeader()==null){
			return new JSONResult(false,"是否为组长不能为空！");

		}
		if(set.getScopeList().length==0){
			return new JSONResult(false,"所属区间不能为空！");

		}
		String userId = set.getUserId();
		PlmsEmpCollectSetExample example= new PlmsEmpCollectSetExample();
		example.createCriteria().andUserIdEqualTo(userId).andIsActiveEqualTo("Y");
		List<PlmsEmpCollectSet> empList = plmsEmpCollectSetService.selectByExampleList(example);
		if(empList.size()>0){
			return new JSONResult(false,"此用户已存在，不能重复添加！");	
		}
//		Long[] scopeArray = set.getScopeList();
//		List<Long> scopeList = Arrays.asList(scopeArray);
//		PlmsEmpCollectSetExample example= new PlmsEmpCollectSetExample();
//		example.createCriteria().andUserIdEqualTo(userId).andGroupIdIn(scopeList);
//		List<PlmsEmpCollectSet> empList = plmsEmpCollectSetService.selectByExampleList(example);
//		String scopeNames = "";
//		if(empList.size()>0){
//			PlmsCollectionRuleSetExample examp = new PlmsCollectionRuleSetExample();
//			examp.createCriteria().andIsActiveEqualTo("Y").andIsRunningEqualTo("Y");
//			List<PlmsCollectionRuleSet> collectionList = plmsCollectionRuleSetService.selectByExampleList(examp);
//			if(collectionList.size()>0){
//				for(PlmsCollectionRuleSet rset:collectionList){
//					for(PlmsEmpCollectSet cSet:empList){
//						if(cSet.getGroupId().longValue()==rset.getId().longValue()){
//							scopeNames+=rset.getName()+",";
//						}
//					}
//				}
//			}
//			return new JSONResult(false,"此用户已存在于"+scopeNames.substring(0, scopeNames.length()-1)+"区间,不能重复添加!");
//		}
		String createBy = SubjectUtil.getUserId();
		plmsEmpCollectSetService.insertEmpCollectSet(set, createBy);
		return new JSONResult(true,"添加成功！");
		
	}
	
	/**
	 * 
	* @Description: 更新催收人员信息
	* @param set
	* @return
	* @return JSONResult
	 */
	@RequestMapping("/updateEmpCollectSetData")
	@ResponseBody
	@RequiresPermissions(PermissionSign.COLLECTOR_UPDATE)
	public JSONResult updateEmpCollectSetData(PlmsEmpCollectorParam set){
		if(set.getOrgId()==null){
			return new JSONResult(false,"所属机构不能为空！");

		}
		if(set.getUserId()==null){
			return new JSONResult(false,"催收员不能为空！");

		}
		if(set.getIsLeader()==null){
			return new JSONResult(false,"是否为组长不能为空！");

		}
		if(set.getScopeList().length==0){
			return new JSONResult(false,"所属区间不能为空！");

		}
		PlmsEmpCollectSetExample example= new PlmsEmpCollectSetExample();
		example.createCriteria().andUserIdEqualTo(set.getUserId());
		List<PlmsEmpCollectSet> list = plmsEmpCollectSetService.selectByExampleList(example);
		if(list==null||list.size()==0){
			return new JSONResult(false,"修改失败！");

		}
		String updateBy = SubjectUtil.getUserId();
		plmsEmpCollectSetService.updateEmpCollectSet(set, updateBy); 	
		return new JSONResult(true,"更新成功！"); 
	    
	}
	
	
	
	/**
	 * 
	* @Description: 根据userId删除催收用户信息
	* @param userId
	* @return
	* @return JSONResult
	 */
	@RequestMapping("/deleteEmpCollectSetData")
	@ResponseBody
	@RequiresPermissions(PermissionSign.COLLECTOR_DELETE)
	public JSONResult deleteEmpCollectSetData(String userId){
		if(userId==null){
			return new JSONResult(false,"删除失败！");
		}
		int i = plmsEmpCollectSetService.deleteByUserId(userId);
		if(i>0){
			return new JSONResult(true,"删除成功！");
		}else{
			return new JSONResult(false,"删除失败！");

		}
	}
	
}
