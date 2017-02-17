package com.ljwd.plms.web.controller.workorder_pool;

import java.util.List;

import javax.annotation.Resource;

import org.apache.shiro.authz.annotation.Logical;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ljwd.plms.web.model.workorder_pool.PlmsLAssignMethod;
import com.ljwd.plms.web.model.workorder_pool.PlmsLAssignRule;
import com.ljwd.plms.web.model.workorder_pool.PlmsLRiskLevel;
import com.ljwd.plms.web.security.PermissionSign;
import com.ljwd.plms.web.service.workorder_pool.inf.PlmsCircuRuleSetService;
import com.ljwd.plms.web.service.workorder_pool.inf.PlmsCollectionRuleSetService;
import com.ljwd.plms.web.service.workorder_pool.inf.PlmsLAssignMethodService;
import com.ljwd.plms.web.service.workorder_pool.inf.PlmsLAssignRuleService;
import com.ljwd.plms.web.service.workorder_pool.inf.PlmsLCircuRuleService;
import com.ljwd.plms.web.service.workorder_pool.inf.PlmsLProtectRuleService;
import com.ljwd.plms.web.service.workorder_pool.inf.PlmsLRiskLevelService;
import com.ljwd.plms.web.vo.workorder_pool.PlmsCircuRuleDto;
import com.ljwd.plms.web.vo.workorder_pool.PlmsCollectionRuleSetDto;
import com.ljwd.plms.web.vo.workorder_pool.PlmsProtectRuleDto;


@Controller
@RequestMapping("/workorderPool")
public class WorkOrderPoolController {
	
	@Resource
	private PlmsCircuRuleSetService plmsCircuRuleSetService;
	@Resource
	private PlmsLCircuRuleService plmsLCircuRuleService;
	@Resource
	private PlmsLRiskLevelService plmsLRiskLevelService;
	@Resource
	private PlmsLAssignRuleService plmsLAssignRuleService;	
	@Resource
	private PlmsLProtectRuleService plmsLProtectRuleService;
	@Resource
	private PlmsCollectionRuleSetService plmsCollectionRuleSetService;
	@Resource
	private PlmsLAssignMethodService plmsLAssignMethodService;

	
	@RequestMapping(value = "/view",method = RequestMethod.GET)
	@RequiresPermissions(value={PermissionSign.WORKORDERPOOL_SELECT,PermissionSign.CIRCURULE_SELECT,PermissionSign.ASSIGNRULE_SELECT,PermissionSign.PROTECTRULE_SELECT},logical=Logical.OR)
	public String getworkorderPool(Model model){
		List<PlmsCircuRuleDto> circuRulelist = plmsLCircuRuleService.selectListByExample();
		List<PlmsLRiskLevel> riskList = plmsLRiskLevelService.selectList();
		List<PlmsLAssignRule> assignRuleList = plmsLAssignRuleService.selectList();
		List<PlmsLAssignMethod> assignMethodList = plmsLAssignMethodService.selectList();
		model.addAttribute("circulist", circuRulelist);
		model.addAttribute("riskList", riskList);
		model.addAttribute("assignRuleList", assignRuleList);
		model.addAttribute("assignMethodList", assignMethodList);
		return "jsp/workorder_pool/workorderpool";
	}
}
