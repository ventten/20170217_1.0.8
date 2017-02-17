package com.ljwd.plms.web.controller.workorder_pool;

import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ljwd.plms.core.util.JSONUtil;
import com.ljwd.plms.web.model.workorder_pool.PlmsCircuRuleSet;
import com.ljwd.plms.web.model.workorder_pool.PlmsLCircuRule;
import com.ljwd.plms.web.security.PermissionSign;
import com.ljwd.plms.web.security.SubjectUtil;
import com.ljwd.plms.web.service.workorder_pool.inf.PlmsCircuRuleSetService;
import com.ljwd.plms.web.service.workorder_pool.inf.PlmsLCircuRuleService;
import com.ljwd.plms.web.service.workorder_pool.inf.PlmsLRiskLevelService;
import com.ljwd.plms.web.vo.workorder_pool.PlmsCircuRuleDto;

/**
 * 
 * @author pangshanxing
 *
 */
@Controller
@RequestMapping("/circuRule")
public class PlmsLCircuRuleController {
	
	@Resource
	private PlmsCircuRuleSetService plmsCircuRuleSetService;
	@Resource
	private PlmsLCircuRuleService plmsLCircuRuleService;
	
	@Resource
	private PlmsLRiskLevelService plmsLRiskLevelService;
	
	@RequestMapping(value="/view" ,method=RequestMethod.POST)
	@ResponseBody
	@RequiresPermissions(PermissionSign.CIRCURULE_SELECT)
	public String selectAll(){
		List<PlmsCircuRuleDto> circuRulelist = plmsLCircuRuleService.selectListByExample();
		return JSONUtil.toJSONString(circuRulelist);
	}
	
	
	@RequestMapping(value="/update" ,method=RequestMethod.POST)
	@ResponseBody
	@RequiresPermissions(PermissionSign.CIRCURULE_UPDATE)
	public String update(PlmsCircuRuleSet set){
		String result ="";
		String userId = SubjectUtil.getUserId();
		PlmsLCircuRule rule = plmsLCircuRuleService.selectByCode(set.getCode());
		rule.setVal(set.getName());
		rule.setUpdatedBy(userId);
		rule.setUpdateTime(new Date());
		plmsLCircuRuleService.update(rule);
		PlmsCircuRuleSet setNew = plmsCircuRuleSetService.selectById(set.getId());
	    setNew.setUpdatedBy(userId);
	    setNew.setUpdateTime(new Date());
	    setNew.setOverduedaysFrom(set.getOverduedaysFrom());
	    setNew.setOverduedaysTo(set.getOverduedaysTo());
	    setNew.setRiskLevelCode(set.getRiskLevelCode());
	    int i = plmsCircuRuleSetService.update(setNew);
		if(i==1){
			result = "ok";
		}
		return result;
		
	}
	
}
