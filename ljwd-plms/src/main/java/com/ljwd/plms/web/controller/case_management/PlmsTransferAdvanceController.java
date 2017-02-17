package com.ljwd.plms.web.controller.case_management;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.commons.beanutils.ConvertUtils;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authz.annotation.Logical;
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
import com.ljwd.plms.web.enums.TransferStatusType;
import com.ljwd.plms.web.model.case_management.PlmsLTransferType;
import com.ljwd.plms.web.model.case_management.PlmsLTransferTypeExample;
import com.ljwd.plms.web.model.workorder_pool.PlmsCollectionRuleSet;
import com.ljwd.plms.web.security.PermissionSign;
import com.ljwd.plms.web.security.SubjectUtil;
import com.ljwd.plms.web.service.case_management.inf.PlmsLTransferAdvanceService;
import com.ljwd.plms.web.service.case_management.inf.PlmsLTransferTypeService;
import com.ljwd.plms.web.service.case_management.inf.PlmsWorkOrderPoolCaseService;
import com.ljwd.plms.web.service.workorder_pool.inf.PlmsCollectionRuleSetService;
import com.ljwd.plms.web.vo.DataTableParam;
import com.ljwd.plms.web.vo.case_management.PlmsEmpCollectDetailDto;
import com.ljwd.plms.web.vo.case_management.PlmsLTransferAdvanceParam;
import com.ljwd.plms.web.vo.case_management.PlmsLTransferAdvanceResult;
/**
 * <p>Title: PlmsTransferAdvanceController</p>
 * @author pangshanxing
 * @date 2016年8月12日上午11:13:34
 */
@Controller
@RequestMapping("/transferAdvance")
public class PlmsTransferAdvanceController {

	@Resource
	private PlmsLTransferTypeService plmsLTransferTypeService;
	@Resource
	private PlmsLTransferAdvanceService plmsLTransferAdvanceService;
	@Resource
	private PlmsWorkOrderPoolCaseService plmsWorkOrderPoolCaseService;
	@Resource
	private PlmsCollectionRuleSetService plmsCollectionRuleSetService;
	
	@RequestMapping(value="/view", method=RequestMethod.GET)
	@RequiresPermissions(PermissionSign.TRANSFERADVANCECASE_SELECT)
	public String SearchWorkOrderPoolCase(Model model){
		//TODO 权限控制
		PlmsLTransferTypeExample example = new PlmsLTransferTypeExample();
		example.createCriteria().andIsActiveEqualTo("Y");
		List<PlmsLTransferType> typeList = plmsLTransferTypeService.selectByExample(example);
		Map<String,Object> statusMap  = TransferStatusType.getStatusType();
		PlmsCollectionRuleSet rset = plmsCollectionRuleSetService.selectByCircuCode("TRANINAD");
		List<PlmsEmpCollectDetailDto> collectors = plmsWorkOrderPoolCaseService.getAllCollector(rset.getStatus(),null,null);
		model.addAttribute("collectors", collectors);
		model.addAttribute("typeList", typeList);
		model.addAttribute("statusMap", statusMap);
		return "/jsp/case_management/transferAdvanceCase";
		
	}
	
	/**
	 * 
	* @Description: 提前移交分页 
	* @param example
	* @return
	* @return String
	 */
	@RequestMapping(value="/pageTransferCaseData",method = RequestMethod.POST)
	@ResponseBody
	@RequiresPermissions(PermissionSign.TRANSFERADVANCECASE_SELECT)
	public String pageTransferCaseData(PlmsLTransferAdvanceParam example){
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

	        Page<PlmsLTransferAdvanceResult> pageData = new Page<PlmsLTransferAdvanceResult>(pageNo, pageSize);
	    	String userId = SubjectUtil.getUserId();
			List<PlmsCollectionRuleSet> scopeList = plmsCollectionRuleSetService.selectScopeByUserId(userId);
			List<String> circustatusList = new ArrayList<String>(); 
			if(scopeList.size()>0){
				for(PlmsCollectionRuleSet set:scopeList){
					circustatusList.add(set.getStatus());
				}	
				example.setScopeList(circustatusList);
		        pageData = plmsLTransferAdvanceService.selectTransferAdvanceAndPage(pageData, example);
			}

	        return PageUtil.getPageJson(sEcho, pageData);
	        
		
	}
	
	/**
	 * 
	* @Description: 处理提前移交
	* @param ids
	* @param handelResult
	* @return
	* @return JSONResult
	 */
	@RequestMapping(value="/transferCaseHandel",method = RequestMethod.POST)
	@ResponseBody
	@RequiresPermissions(value={PermissionSign.TRANSFERADVANCECASE_AUDIT,PermissionSign.TRANSFERADVANCECASE_APPROVED},logical=Logical.OR)
	public JSONResult transferCaseHandel(String ids,String handelResult,String refusalReason){
		if(ids!=null&&ids!=""){
			Subject subject = SecurityUtils.getSubject();
		    String userName = (String) subject.getPrincipal();
			String[] idArray = ids.split(",");
			//字符串数组转Long型
			Long[] lo = (Long[])ConvertUtils.convert(idArray, Long.class);
			List<Long> idsTempList = Arrays.asList(lo);
			List<Long> idsList = new ArrayList<Long>();
			idsList.addAll(idsTempList);
			plmsLTransferAdvanceService.updateTransferCaseHandel(idsList, handelResult, refusalReason,userName);
			
			return new JSONResult(true,"操作成功！");

		}else{
			
			return new JSONResult(false,"操作失败！");
		}		
		
	}
	
	/**
	 * 
	* @Description: 分配提前移交案件 
	* @param ids
	* @param checkedCollector
	* @return
	* @return JSONResult
	 */
	@RequestMapping(value="/transferCaseAlloc",method=RequestMethod.POST)
	@ResponseBody
	@RequiresPermissions(PermissionSign.TRANSFERADVANCECASE_ALLOC)
	public JSONResult transferCaseAlloc(String ids,String checkedCollector){
		
		if(ids!=null&&ids!=""){
			Subject subject = SecurityUtils.getSubject();
		    String userName = (String) subject.getPrincipal();
			String[] idArray = ids.split(",");
			//字符串数组转Long型
			Long[] lo = (Long[])ConvertUtils.convert(idArray, Long.class);
			List<Long> idsTempList = Arrays.asList(lo);
			List<Long> idsList = new ArrayList<Long>();
			idsList.addAll(idsTempList);
			String[] collectrArray = checkedCollector.split(",");
			List<String> colleocterList = Arrays.asList(collectrArray);

			String result = plmsLTransferAdvanceService.updateTransferCaseAlloc(idsList, colleocterList, userName);
			
			if(result.equals("OK")){
				return new JSONResult(true,"操作成功！");
			}else if(result.equals("no_over")){
				return new JSONResult(true,"所选案件有不逾期案件，请重新选择！");
			}else{
				return new JSONResult(false,"操作失败！");
			}
			

		}else{
			
			return new JSONResult(false,"操作失败！");
		}	
		
	}

}
