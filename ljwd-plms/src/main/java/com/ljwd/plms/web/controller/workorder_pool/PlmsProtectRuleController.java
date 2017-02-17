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
import com.ljwd.plms.web.model.sys_management.SysUser;
import com.ljwd.plms.web.model.workorder_pool.PlmsCircuRuleSet;
import com.ljwd.plms.web.model.workorder_pool.PlmsLAssignMethod;
import com.ljwd.plms.web.model.workorder_pool.PlmsLAssignRule;
import com.ljwd.plms.web.model.workorder_pool.PlmsLRiskLevel;
import com.ljwd.plms.web.model.workorder_pool.PlmsProtectRuleSet;
import com.ljwd.plms.web.security.PermissionSign;
import com.ljwd.plms.web.service.workorder_pool.inf.PlmsCircuRuleSetService;
import com.ljwd.plms.web.service.workorder_pool.inf.PlmsLAssignMethodService;
import com.ljwd.plms.web.service.workorder_pool.inf.PlmsLCircuRuleService;
import com.ljwd.plms.web.service.workorder_pool.inf.PlmsLProtectRuleService;
import com.ljwd.plms.web.service.workorder_pool.inf.PlmsLRiskLevelService;
import com.ljwd.plms.web.service.workorder_pool.inf.PlmsProtectRuleSetService;
import com.ljwd.plms.web.vo.SessionMsg;
import com.ljwd.plms.web.vo.workorder_pool.PlmsCircuRuleDto;
import com.ljwd.plms.web.vo.workorder_pool.PlmsProtectRuleDto;

/**
 * 
 * @author pangshanxing
 *
 */
@Controller
@RequestMapping("/protectRule")
public class PlmsProtectRuleController {
	@Resource
	private PlmsLProtectRuleService plmsLProtectRuleService;
	
	@Resource
	private PlmsProtectRuleSetService plmsProtectRuleSetService;
	
	@Resource
	private PlmsLAssignMethodService plmsLAssignMethodService;
	
	
	@RequestMapping(value="/view" ,method=RequestMethod.POST)
	@ResponseBody
	@RequiresPermissions(PermissionSign.PROTECTRULE_SELECT)
	public String selectAll(){
		List<PlmsProtectRuleDto> protectRuleList = plmsLProtectRuleService.selectDtoList();
		return JSONUtil.toJSONString(protectRuleList);
	}

	
	@RequestMapping(value="/{id}/update" ,method=RequestMethod.GET)
	@ResponseBody
	public String showUpdate(@PathVariable("id") Long id){
		PlmsProtectRuleDto  protectRule = plmsLProtectRuleService.selectDtoById(id);
		return JSONUtil.toJSONString(protectRule);

	}
	
	@RequestMapping(value="/{id}/update" ,method=RequestMethod.POST)
	@ResponseBody
	@RequiresPermissions(PermissionSign.PROTECTRULE_UPDATE)
	public String update(PlmsProtectRuleSet set,HttpServletRequest request){
		String result = "";
		Subject subject = SecurityUtils.getSubject();
	    String userId = (String) subject.getPrincipal();
	    set.setUpdatedBy(userId);
		set.setUpdateTime(new Date());
		set.setRecVer(set.getRecVer()+1);
		int i = plmsProtectRuleSetService.update(set);
		if(i==1){
			result = "ok";
		}
		return result;
		
	}
	
}
