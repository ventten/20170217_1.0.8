package com.ljwd.plms.web.controller.workorder_pool;

import java.util.Date;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.ljwd.plms.core.util.JSONUtil;
import com.ljwd.plms.web.model.sys_management.PlmsPermission;
import com.ljwd.plms.web.model.sys_management.PlmsRole;
import com.ljwd.plms.web.model.workorder_pool.PlmsLAssignRule;
import com.ljwd.plms.web.security.PermissionSign;
import com.ljwd.plms.web.service.sys_management.inf.PlmsPermissionService;
import com.ljwd.plms.web.service.sys_management.inf.PlmsRoleService;
import com.ljwd.plms.web.service.workorder_pool.inf.PlmsLAssignRuleService;
import com.ljwd.plms.web.service.workorder_pool.inf.PlmsProtectRuleSetService;
import com.ljwd.plms.web.vo.SessionMsg;
import com.ljwd.plms.web.vo.workorder_pool.PlmsCircuRuleDto;

/**
 * 
 * @author pangshanxing
 *
 */
@Controller
@RequestMapping("/assignRule")
public class PlmsAssignRuleController {
	
	@Resource
	private PlmsLAssignRuleService plmsLAssignRuleService;	
	@Resource
    private PlmsPermissionService plmsPermissionService;
	@Resource
	private PlmsRoleService plmsRoleService;
	
	@RequestMapping(value="/view" ,method=RequestMethod.POST)
	@ResponseBody
	@RequiresPermissions(PermissionSign.ASSIGNRULE_SELECT)
	public String selectAll(HttpServletRequest request){
		List<PlmsLAssignRule> assignRuleList = plmsLAssignRuleService.selectList();
		return JSONUtil.toJSONString(assignRuleList);
	}

	
	@RequestMapping(value="/{code}/findOne" ,method=RequestMethod.GET)
	@ResponseBody
	public String findOne(@PathVariable("code") String code, Model model){
		PlmsLAssignRule  assignRule = plmsLAssignRuleService.selectById(code);
		return JSONUtil.toJSONString(assignRule);

	}
	
	@RequestMapping(value="/{code}/update" ,method=RequestMethod.GET)
	@ResponseBody
	public String showUpdate(@PathVariable("code") String code, Model model){
		PlmsLAssignRule  assignRule = plmsLAssignRuleService.selectById(code);
		return JSONUtil.toJSONString(assignRule);
		
	}
	
	@RequestMapping(value="/{code}/update" ,method=RequestMethod.POST)
	@ResponseBody
	@RequiresPermissions(PermissionSign.ASSIGNRULE_UPDATE)
	public String update(PlmsLAssignRule set,HttpServletRequest request){
		String result = "";
		Subject subject = SecurityUtils.getSubject();
	    String userId = (String) subject.getPrincipal();
	    set.setUpdatedBy(userId);
		set.setUpdateTime(new Date());
		set.setRecVer(set.getRecVer()+1);
		int  i = plmsLAssignRuleService.update(set);
		if(i==1){
			result = "ok";
		}
		return result;		
	}
	
}
