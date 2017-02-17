package com.ljwd.plms.web.controller.sys_management;

import java.util.ArrayList;
import java.util.Date;
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
import com.ljwd.plms.core.util.PageUtil;
import com.ljwd.plms.web.model.sys_management.PlmsOrgScopeRelation;
import com.ljwd.plms.web.model.sys_management.PlmsOrgScopeRelationExample;
import com.ljwd.plms.web.model.sys_management.SysOrg;
import com.ljwd.plms.web.model.sys_management.SysOrgExample;
import com.ljwd.plms.web.model.workorder_pool.PlmsCollectionRuleSet;
import com.ljwd.plms.web.model.workorder_pool.PlmsCollectionRuleSetExample;
import com.ljwd.plms.web.security.PermissionSign;
import com.ljwd.plms.web.service.sys_management.inf.PlmsOrgScopeRelationService;
import com.ljwd.plms.web.service.sys_management.inf.SysOrgService;
import com.ljwd.plms.web.service.workorder_pool.inf.PlmsCollectionRuleSetService;
import com.ljwd.plms.web.vo.DataTableParam;
import com.ljwd.plms.web.vo.sys_management.OrgScopeParam;

/**
 * 机构_区间关系配置
 * <p>Title: OrgScopeRelationController</p>
 * @author pangshanxing
 * @date 2016年9月6日上午11:12:01
 */
@Component
@RequestMapping("/orgScopeRelation")
public class OrgScopeRelationController {

	@Resource
	private SysOrgService sysOrgService;
	@Resource
	private PlmsCollectionRuleSetService plmsCollectionRuleSetService;
	@Resource
	private PlmsOrgScopeRelationService PlmsOrgScopeRelationService;
	
	
	
	@RequestMapping(value="/view",method = RequestMethod.GET)
	@RequiresPermissions(PermissionSign.ORGSCOPE_SELECT)
	public String view(Model model){
		SysOrgExample exampOrg = new SysOrgExample();
		List<SysOrg> orgList= sysOrgService.selectByExample(exampOrg);
		List<SysOrg> treeList = new ArrayList<SysOrg>();
		InitOrgToTreeList.InitOrganizationDropDown(treeList,orgList,0,0);
		PlmsCollectionRuleSetExample  example= new PlmsCollectionRuleSetExample();
		example.createCriteria().andIsActiveEqualTo("Y");
		List<PlmsCollectionRuleSet> collectionList = plmsCollectionRuleSetService.selectByExampleList(example);
		//机构
		model.addAttribute("orgList", treeList);
		//区间
		model.addAttribute("collectionList", collectionList);
		return "/jsp/sys_management/orgScope";
		
	}
	/**
	 * 
	* @Description: 机构_区间设置分页显示 
	* @param example
	* @return
	* @return String
	 */
	@RequestMapping("/pageOrgScopeData")
	@ResponseBody
	@RequiresPermissions(PermissionSign.ORGSCOPE_SELECT)
	public String pageOrgScopeData(PlmsOrgScopeRelationExample example){
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
	        Page<PlmsOrgScopeRelation> pageData = new Page<PlmsOrgScopeRelation>(pageNo, pageSize);

	        pageData = PlmsOrgScopeRelationService.selectByExampleAndPage(pageData, example);

	        return PageUtil.getPageJson(sEcho, pageData);

		
	}
	
	/**
	 * 
	* @Description: 新增机构_区间对应关系
	* @param model
	* @return
	* @return JSONResult
	 */
	@RequestMapping("/addOrgScope")
	@ResponseBody
	@RequiresPermissions(PermissionSign.ORGSCOPE_INSERT)
	public JSONResult addOrgScope(Long orgId,Long[] scopeList){
		if(orgId==null){
			return new JSONResult(false,"请选择机构！");
		}
		if(scopeList.length==0){
			return new JSONResult(false,"请选择对应区间！");
		}
		 Subject subject = SecurityUtils.getSubject();
	     String userName = (String) subject.getPrincipal();
	     PlmsOrgScopeRelationExample example= new PlmsOrgScopeRelationExample();
	     example.setOrgId(orgId);
	     List<PlmsOrgScopeRelation> list = PlmsOrgScopeRelationService.selectByExample(example);
	     if(list.size()>0){
				return new JSONResult(false,"此机构已存在对应的区间！");
	     }else{
	    	 PlmsOrgScopeRelationService.addOrgScopeRelation(orgId, scopeList, userName);
	    	 return new JSONResult(true,"操作成功！"); 
	     }
	   	
	}
	
	/**
	 * 
	* @Description: 修改机构_区间对应关系 
	* @param model
	* @param scopeList
	* @return
	* @return JSONResult
	 */
	@RequestMapping("/updateOrgScopeRelation")
	@ResponseBody
	@RequiresPermissions(PermissionSign.ORGSCOPE_UPDATE)
	public JSONResult updateOrgScopeRelation(OrgScopeParam param){
		if(param==null){
			return new JSONResult(false,"修改出错！");
		}
		if(param.getOrgId()==null){
			return new JSONResult(false,"请选择机构！");
		}
		if(param.getScopeList()==null){
			return new JSONResult(false,"请选择对应区间！");

		}
		if(param.getScopeList().length==0){
			return new JSONResult(false,"请选择对应区间！");
		}
		Subject subject = SecurityUtils.getSubject();
	    String userName = (String) subject.getPrincipal();
	    PlmsOrgScopeRelationService.updateOrgScopeRelation(param, userName);
	    return new JSONResult(true,"修改成功！");
		
	}
	
	/**
	 * 
	* @Description: 验证机构唯一性 
	* @param orgId
	* @return
	* @return String
	 */
	@RequestMapping(value="/isExitOrgScopeRelation")
	@ResponseBody
	public String isExitOrgScopeRelation(Long orgId){
		String result = "N";
		PlmsOrgScopeRelationExample example = new PlmsOrgScopeRelationExample();
		example.setOrgId(orgId);
		List<PlmsOrgScopeRelation> list = PlmsOrgScopeRelationService.selectByExample(example);
		if(list.size()>0){
			result = "Y";
		}
		return result;
		
	}
	
	
	@RequestMapping("/deleteOrgScope")
	@ResponseBody
	@RequiresPermissions(PermissionSign.ORGSCOPE_DELETE)
	public JSONResult deleteOrgScope(Long orgId){
		if(orgId==null){
			return new JSONResult(false,"删除失败！");
		}
		if(orgId !=null){
			PlmsOrgScopeRelationExample example = new PlmsOrgScopeRelationExample();
			example.setOrgId(orgId);
			List<PlmsOrgScopeRelation> list = PlmsOrgScopeRelationService.selectByExample(example);
			if(list.size()==0){
				return new JSONResult(false,"删除失败！");
			}else{
				PlmsOrgScopeRelationService.deleteOrgScopeRelation(orgId);
			}
		}
		return new JSONResult(true,"删除成功！");
		
	}
}
