package com.ljwd.plms.web.controller.workorder_pool;

import java.util.Date;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authz.annotation.Logical;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ljwd.plms.core.entity.JSONResult;
import com.ljwd.plms.core.util.JSONUtil;
import com.ljwd.plms.web.model.workorder_pool.PlmsCollectionRuleSet;
import com.ljwd.plms.web.model.workorder_pool.PlmsCollectionRuleSetExample;
import com.ljwd.plms.web.security.PermissionSign;
import com.ljwd.plms.web.service.workorder_pool.inf.PlmsCollectionRuleSetService;
import com.ljwd.plms.web.vo.SessionMsg;
import com.ljwd.plms.web.vo.workorder_pool.PlmsCollectionRuleSetDto;

/**
 * 
 * @author pangshanxing
 *
 */
@Controller
@RequestMapping("/collectionRule")
public class PlmsCollectionRuleController {
		
	@Resource
	private PlmsCollectionRuleSetService plmsCollectionRuleSetService;
	
	
	@RequestMapping(value="/view" ,method=RequestMethod.POST)
	@ResponseBody
	@RequiresPermissions(PermissionSign.WORKORDERPOOL_SELECT)
	public String selectAll(){
		List<PlmsCollectionRuleSetDto> collectionRuleList = plmsCollectionRuleSetService.selectDtoList();
		return JSONUtil.toJSONString(collectionRuleList);
 
	}
	
	@RequestMapping(value="/insert",method=RequestMethod.POST)
	@ResponseBody
	@RequiresPermissions(PermissionSign.WORKORDERPOOL_INSERT)
	public JSONResult addCollectionRule(PlmsCollectionRuleSet set,HttpServletRequest request){
		String circuCode = set.getAssignRuleCode();
		PlmsCollectionRuleSetExample examp = new PlmsCollectionRuleSetExample();
		examp.createCriteria().andIsRunningEqualTo("Y").andIsActiveEqualTo("Y").andCircuRuleCodeEqualTo(circuCode);
		List<PlmsCollectionRuleSet> exitList = plmsCollectionRuleSetService.selectByExampleList(examp);
		if(exitList.size()>0){
			return new JSONResult(false,"此流转规则已存在！");
		}
		SessionMsg sessionMsg = (SessionMsg) request.getSession().getAttribute("session");
		set.setCreatedBy(sessionMsg.getName());
		set.setUpdatedBy(sessionMsg.getName());
		int  i = plmsCollectionRuleSetService.updateCheckExit(set);
		if(i>0){
			return new JSONResult(true,"操作成功！");
		}else{
			return new JSONResult(false,"操作失败！");

		}
	}
	
	@RequestMapping(value="/{id}/update" ,method=RequestMethod.GET)
	@ResponseBody
	@RequiresPermissions(PermissionSign.WORKORDERPOOL_UPDATE)
	public String showUpdate(@PathVariable("id") Long id){
		PlmsCollectionRuleSet set = plmsCollectionRuleSetService.selectById(id);
		return JSONUtil.toJSONString(set);
		
	}
	
	@RequestMapping(value="/{id}/update" ,method=RequestMethod.POST)
	@ResponseBody
	@RequiresPermissions(value={PermissionSign.WORKORDERPOOL_UPDATE,PermissionSign.WORKORDERPOOL_STOP},logical=Logical.OR)
	public String update(PlmsCollectionRuleSet set,HttpServletRequest request){
		String result = "";
		Subject subject = SecurityUtils.getSubject();
	    String userId = (String) subject.getPrincipal();
		set.setUpdatedBy(userId);
		set.setUpdateTime(new Date());
		set.setRecVer(set.getRecVer()+1);
		int i = plmsCollectionRuleSetService.update(set);
		if(i==1){
			result = "ok";
		}
		return result;
	
	}
	
	@RequestMapping(value="/checkcircuRule" ,method=RequestMethod.POST)
	@ResponseBody
	public String checkcircuRule(String circuRuleval){
		
		String result = plmsCollectionRuleSetService.checkcircuRule(circuRuleval);
		return result;
		
	}
	
}
