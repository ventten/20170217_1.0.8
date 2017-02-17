package com.ljwd.plms.web.controller.case_management;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import com.ljwd.plms.web.vo.SessionMsg;
import org.apache.commons.beanutils.ConvertUtils;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ljwd.plms.core.entity.JSONResult;
import com.ljwd.plms.core.feature.orm.mybatis.Page;
import com.ljwd.plms.core.util.PageUtil;
import com.ljwd.plms.web.security.PermissionSign;
import com.ljwd.plms.web.security.SubjectUtil;
import com.ljwd.plms.web.service.case_management.inf.PlmsWorkOrderPoolCaseService;
import com.ljwd.plms.web.service.case_management.inf.PlmsWorkOrderPoolService;
import com.ljwd.plms.web.service.workorder_pool.inf.PlmsCollectionRuleSetService;
import com.ljwd.plms.web.service.workorder_pool.inf.PlmsLProtectRuleService;
import com.ljwd.plms.web.vo.DataTableParam;
import com.ljwd.plms.web.vo.case_management.PlmsProtectCaseParam;
import com.ljwd.plms.web.vo.case_management.PlmsProtectCaseResultDto;
import com.ljwd.plms.web.vo.workorder_pool.PlmsCollectionRuleSetDto;

@Controller
@RequestMapping("/protectCase")
public class PlmsProtectCaseController {
	
	@Resource
	private PlmsCollectionRuleSetService plmsCollectionRuleSetService;
	@Resource
	private PlmsLProtectRuleService plmsLProtectRuleService;
	@Resource
	private PlmsWorkOrderPoolService plmsWorkOrderPoolService;
	@Resource
	private PlmsWorkOrderPoolCaseService plmsWorkOrderPoolCaseService;
	
	

	@RequestMapping(value="/view", method=RequestMethod.GET)
	@RequiresPermissions(PermissionSign.PROTECTCASE_SELECT)
	public String SearchWorkOrderPoolCase(Model model){
		List<PlmsCollectionRuleSetDto> scopeList = plmsCollectionRuleSetService.hasOverduedaysScope();
		model.addAttribute("scope", scopeList);
		return "/jsp/case_management/protectCase";
	}
	
	
	@RequestMapping(value = "/pageProtectCaseData",method = RequestMethod.POST)
    @ResponseBody
	@RequiresPermissions(PermissionSign.PROTECTCASE_SELECT)
    public String pageContactorData(PlmsProtectCaseParam example){
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

        Page<PlmsProtectCaseResultDto> pageData = new Page<PlmsProtectCaseResultDto>(pageNo, pageSize);

        pageData = plmsWorkOrderPoolService.selectProtectCaseAndPage(pageData, example);

        return PageUtil.getPageJson(sEcho, pageData);

    } 
	
	/**
	 * 
	* @Description: 分配保护案件 
	* @param applIds
	* @return
	* @return JSONResult
	 */
	@RequestMapping(value = "/protectCaseAlloc",method = RequestMethod.POST)
    @ResponseBody
	@RequiresPermissions(PermissionSign.PROTECTCASE_ALLOC)
	public JSONResult protectCaseAlloc(String applIds,HttpServletRequest request){
		if(applIds != null && !"".equals(applIds)){
			SessionMsg session = SubjectUtil.getSession(request);
			String[] applIdArray = applIds.split(",");
			//字符串数组转Long型
			Long[] lo = (Long[])ConvertUtils.convert(applIdArray, Long.class);
			List<Long> applIdTempList = Arrays.asList(lo);
			List<Long> applIdList = new ArrayList<Long>();
			applIdList.addAll(applIdTempList);
			plmsWorkOrderPoolCaseService.updateAutoAllocProtectCase(applIdList,session.getName(),session.getUserName());
			return new JSONResult(true,"操作成功！");
		}else{
			return new JSONResult(false,"操作失败！");
		}
				
	}
	
	/**
	* @Description: 撤回保留 
	* @param logId
	* @return
	* @return JSONResult
	 */
	@RequestMapping("/recallRetains")
	@ResponseBody
	public JSONResult recallRetains(Long logId){
		if(logId==null){
			return new JSONResult(false,"撤回失败！");	
		}else{
			String userId = SubjectUtil.getUserId();
			if(userId!=null){
				plmsWorkOrderPoolCaseService.recallRetains(logId,userId);
			}else{
				return new JSONResult(false,"登录信息已失效，请重新登录！");	
			}
		}
		return new JSONResult(true,"撤回成功！");	
		
	}
}
