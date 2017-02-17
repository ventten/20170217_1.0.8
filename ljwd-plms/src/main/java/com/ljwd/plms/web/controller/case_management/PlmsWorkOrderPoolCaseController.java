package com.ljwd.plms.web.controller.case_management;




import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.beanutils.ConvertUtils;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authz.annotation.Logical;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.apache.shiro.subject.Subject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;


import com.ljwd.plms.core.entity.JSONResult;
import com.ljwd.plms.core.feature.orm.mybatis.Page;
import com.ljwd.plms.core.util.D;
import com.ljwd.plms.core.util.FileUtil;
import com.ljwd.plms.core.util.JSONUtil;
import com.ljwd.plms.core.util.PageUtil;
import com.ljwd.plms.web.model.case_management.PlmsEmpCollectSet;
import com.ljwd.plms.web.model.case_management.PlmsEmpCollectSetExample;
import com.ljwd.plms.web.model.case_management.PlmsLaCollectAlloc;
import com.ljwd.plms.web.model.case_management.PlmsLaCollectAllocExample;
import com.ljwd.plms.web.model.case_management.PlmsWorkOrderPool;
import com.ljwd.plms.web.model.case_management.PlmsWorkOrderPoolExample;
import com.ljwd.plms.web.model.sys_management.PlmsSysBranchManage;
import com.ljwd.plms.web.model.sys_management.PlmsSysBranchManageExample;
import com.ljwd.plms.web.model.sys_management.SysSite;
import com.ljwd.plms.web.model.sys_management.SysSiteExample;
import com.ljwd.plms.web.model.workorder_pool.PlmsCircuRuleSet;
import com.ljwd.plms.web.model.workorder_pool.PlmsCollectionRuleSet;
import com.ljwd.plms.web.model.workorder_pool.PlmsCollectionRuleSetExample;
import com.ljwd.plms.web.security.PermissionSign;
import com.ljwd.plms.web.security.RoleSign;
import com.ljwd.plms.web.security.SubjectUtil;
import com.ljwd.plms.web.service.case_management.inf.PlmsEmpCollectSetService;
import com.ljwd.plms.web.service.case_management.inf.PlmsLaCollectAgentService;
import com.ljwd.plms.web.service.case_management.inf.PlmsLaCollectAllocService;
import com.ljwd.plms.web.service.case_management.inf.PlmsWorkOrderPoolCaseService;
import com.ljwd.plms.web.service.case_management.inf.PlmsWorkOrderPoolService;
import com.ljwd.plms.web.service.sys_management.inf.PlmsBranchManageService;
import com.ljwd.plms.web.service.sys_management.inf.SysOrgService;
import com.ljwd.plms.web.service.sys_management.inf.SysSiteService;
import com.ljwd.plms.web.service.workorder_pool.inf.PlmsCircuRuleSetService;
import com.ljwd.plms.web.service.workorder_pool.inf.PlmsCollectionRuleSetService;
import com.ljwd.plms.web.vo.DataTableParam;
import com.ljwd.plms.web.vo.SessionMsg;
import com.ljwd.plms.web.vo.case_management.PlmsEmpCollectDetailDto;
import com.ljwd.plms.web.vo.case_management.PlmsWorkOrderPoolDetailDto;
import com.ljwd.plms.web.vo.case_management.PlmsWorkOrderPoolDto;
import com.ljwd.plms.web.vo.case_management.PlmsWorkOrderPoolExportDto;
import com.ljwd.plms.web.vo.case_management.PlmsWorkOrderPoolParam;
import com.ljwd.plms.web.vo.case_management.SysProduct;
import com.ljwd.plms.web.wsdl.webservice.LoanServiceWSDL;
import com.ljwd.plms.web.wsdl.webservice.service.CalculateSummaryReceivableParamDto;
import com.ljwd.plms.web.wsdl.webservice.service.SimulateCalculateSummaryReceivableResultDto;

@Controller
@RequestMapping(value="/caseManagement")
public class PlmsWorkOrderPoolCaseController {
	
	@Resource
	private PlmsCollectionRuleSetService plmsCollectionRuleSetService;
	@Resource
	private PlmsWorkOrderPoolService plmsWorkOrderPoolService;
	@Resource
	private PlmsWorkOrderPoolCaseService plmsWorkOrderPoolCaseService;
	@Resource
	private PlmsEmpCollectSetService plmsEmpCollectSetService;
	@Resource
	private PlmsLaCollectAllocService plmsLaCollectAllocService;
	@Resource
	private PlmsLaCollectAgentService plmsLaCollectAgentService;
	@Resource
	private SysSiteService sysSiteService;
	@Resource
	private PlmsCircuRuleSetService plmsCircuRuleSetService;
	@Resource
	private PlmsBranchManageService plmsBranchManageService;
	@Resource
	private SysOrgService sysOrgService;
	
	
	private static Logger logger = LoggerFactory.getLogger(PlmsWorkOrderPoolCaseController.class);


	@RequestMapping(value="/view", method=RequestMethod.GET)
	@RequiresPermissions(value={PermissionSign.CASEMANAGEMENT_SELECT,PermissionSign.CASEMANAGEMENT_BRANCHSELECT},logical=Logical.OR)
	public String SearchWorkOrderPoolCase(Model model,HttpServletRequest request){
        SessionMsg msg = SubjectUtil.getSession(request);
        if(msg==null){
        	return "登录信息已过期，请重新登录";
        }
        String userId = msg.getName();
        String userName = msg.getUserName();
        String statusChecked = request.getParameter("status");
        if(statusChecked!=null){
        	model.addAttribute("statusChecked", statusChecked);
        }
        //此用户所拥有的权限包含哪几个区间(催收区间根据数据权限机构选择)
        List<PlmsCollectionRuleSet> scopeList = new ArrayList<PlmsCollectionRuleSet>();
		PlmsCollectionRuleSetExample example = new PlmsCollectionRuleSetExample();
		boolean isLeader = true;
		boolean isAdmin = false; 
        
        if(SubjectUtil.hasRole(RoleSign.ADMIN)){
        	isAdmin = true;
        }
		if(isAdmin){
			example.createCriteria().andIsActiveEqualTo("Y");
			example.setOrderByClause("val");
			scopeList = plmsCollectionRuleSetService.selectByExampleList(example);
		}else{
			scopeList = plmsCollectionRuleSetService.selectScopeByUserId(userId);	
			PlmsEmpCollectSetExample examp = new PlmsEmpCollectSetExample();
			examp.createCriteria().andUserIdEqualTo(userId).andIsActiveEqualTo("Y");
			List<PlmsEmpCollectSet> empList = plmsEmpCollectSetService.selectByExampleList(examp);			
			if(empList!=null&&empList.size()>0){
				List<String> status = new ArrayList<String>(); 
				for(PlmsEmpCollectSet emp:empList){
					status.add(emp.getGroupId().toString());
					if(emp.getIsleader().equals("Y")){
					
					}else{
						isLeader = false;
					}
				}
				
			}
			
		}
		//网点列表
		List<SysSite> siteList = new ArrayList<SysSite>();
		//全部查询
		if(SubjectUtil.isPermitted(PermissionSign.CASEMANAGEMENT_SELECT)){
			SysSiteExample exam = new SysSiteExample();
			exam.setIsActive("Y");
			siteList= sysSiteService.selectByExample(exam);
			siteList.add(0, null);
		}//网点查询
		else if(SubjectUtil.isPermitted(PermissionSign.CASEMANAGEMENT_BRANCHSELECT)){
			PlmsSysBranchManageExample ex = new PlmsSysBranchManageExample();
			ex.setUserId(userId);
			List<PlmsSysBranchManage> branchList = plmsBranchManageService.selectByExample(ex);
			if(branchList!=null&&branchList.size()>0){
				List<String> siteCodesList = new ArrayList<String>();
				for(PlmsSysBranchManage br:branchList){
					siteCodesList.add(br.getSiteCode());
				}
				SysSiteExample exmpSiteExample = new SysSiteExample();
				exmpSiteExample.setSiteCodes(siteCodesList);
				siteList = sysSiteService.selectByExample(exmpSiteExample);
			}else{
				siteList = sysSiteService.selectSiteByOrgId(msg.getOrgId());
	
			}
		}
		model.addAttribute("siteList", siteList);
		model.addAttribute("isLeader", isLeader);
		model.addAttribute("userId", userId);
		model.addAttribute("userName", userName);
		//催收区间列表
		model.addAttribute("collectionList", scopeList);
		//商品类别
		List<SysProduct> productList = plmsWorkOrderPoolService.searchAllProducts();
		model.addAttribute("productList", productList);
		//提前移交和委外的区间值
		StringBuffer buffer = new StringBuffer();
		String statusTransfer = plmsCollectionRuleSetService.selectStatusByCircuCode("TRANINAD");
		String statusOutSrc = plmsCollectionRuleSetService.selectStatusByCircuCode("OUTSOURC");
		buffer.append(statusTransfer).append(",").append(statusOutSrc);
		model.addAttribute("transferOutsrcCode", buffer.toString());
		
		return "/jsp/case_management/caseManageIndex";	
	}
	
	/**
	* @Description: 案件管理分页查询 
	* @param example
	* @return
	* @return String
	 */
	@RequestMapping(value = "/pageCaseData",method = RequestMethod.POST)
	@RequiresPermissions(value={PermissionSign.CASEMANAGEMENT_SELECT,PermissionSign.CASEMANAGEMENT_BRANCHSELECT},logical=Logical.OR)
    @ResponseBody
    public String pageContactorData(PlmsWorkOrderPoolParam example){
        if(example.getParamData() == null || "".equals(example.getParamData())){
            return PageUtil.getPageJson(1, new Page<Object>()); //参数有误返回返回空数据
        }
        //催收区间为空，则显示空数据
        if(example.getStatus()==null||"".equals(example.getStatus())){
            return PageUtil.getPageJson(1, new Page<Object>()); //参数有误返回返回空数据
        }
        if(SubjectUtil.isPermitted(PermissionSign.CASEMANAGEMENT_SELECT)){
        	example.setQueryPerm("all");
        }else if(SubjectUtil.isPermitted(PermissionSign.CASEMANAGEMENT_BRANCHSELECT)){
        	example.setQueryPerm("branch");
        }
        //如果催收员不为空，但分配状态为未分配，则显示空数据
  		if(example.getCollectorName()!=null&&(!example.getCollectorName().equals(""))){
  			if(example.getIsAlloc()!=null&&example.getIsAlloc().equals("2")){
  				 return PageUtil.getPageJson(1, new Page<Object>()); //参数有误返回返回空数据
  			}
  		}
        DataTableParam dataTableParam = PageUtil.getDataTableParamByJsonParam(example.getParamData());
        //记录操作的次数
        int sEcho = dataTableParam.getsEcho();
        //每页记录数
        int pageSize = dataTableParam.getiDisplayLength();
        //页数
        int pageNo = dataTableParam.getiDisplayStart() / dataTableParam.getiDisplayLength() + 1;

        //设置排序
        example.setOrderByClause(dataTableParam);

        Page<PlmsWorkOrderPoolDto> pageData = new Page<PlmsWorkOrderPoolDto>(pageNo, pageSize);

        pageData = plmsWorkOrderPoolService.selectByExampleAndPage(pageData, example);

        return PageUtil.getPageJson(sEcho, pageData);

    } 
	
	
	/**
	 * 
	* @Description: 案件详情 
	* @param paymentId
	* @param model
	* @return
	* @return String
	 */
	@RequestMapping(value = "/caseDetail",method = RequestMethod.GET)
	@RequiresPermissions(PermissionSign.CASEMANAGEDETAIL_SELECT)
	public String getCaseDetail(Long paymentId,String status,Model model){
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("paymentId", paymentId);
		PlmsWorkOrderPoolDetailDto detail = plmsWorkOrderPoolService.searchCaseDetail(map);
		CalculateSummaryReceivableParamDto param = new CalculateSummaryReceivableParamDto();
        param.setContractNo(detail.getCntrctNo());
        param.setIdCardNo(detail.getDocno());
        //正常结清
        param.setIsInAdvanceRepayment(false);
        param.setIsRenewLoanRepayment(false);
        param.setRepaymentDate(new Date());
        SimulateCalculateSummaryReceivableResultDto result = null;
        try {
            result = LoanServiceWSDL.getService().calculateSummaryReceivable(param);
        } catch (Exception e) {
            e.printStackTrace();
            logger.error("计算应收金额：" + e.getMessage());
        }
        if(result!=null){
        	//应还金额
        	detail.setOverdueAmount(result.getReceivableSumaryAmount());
        	//逾期天数
        	detail.setOverDays(result.getOverdueDays()==null?null:result.getOverdueDays().intValue());
        	//剩余本金
        	detail.setRemainingPrincipal(result.getRemindPrincipal());
        	
        }
    
		model.addAttribute("caseDetail", detail);
		model.addAttribute("status", status);
		return "/jsp/case_management/caseManageDetail";
		
	}
	
	
        
        
        
       
	
	/**
	 * 
	* @Description: 获取指定区间的催收员信息 
	* @param status
	* @return
	* @return String
	 */
	@RequestMapping(value = "/getCollector",method = RequestMethod.POST)
	@ResponseBody
	public Map<String,Object> getAllCollector(String status,Long orgId,HttpServletRequest request){
		SessionMsg msg = SubjectUtil.getSession(request);
		String userId = msg.getName();
		List<Long> orgIdList = new ArrayList<Long>();
		if(SubjectUtil.isPermitted(PermissionSign.CASEMANAGEMENT_SELECT)){
			
        }else if(SubjectUtil.isPermitted(PermissionSign.CASEMANAGEMENT_BRANCHSELECT)){
        	PlmsSysBranchManageExample ex = new PlmsSysBranchManageExample();
			ex.setUserId(userId);
			List<PlmsSysBranchManage> branchList = plmsBranchManageService.selectByExample(ex);
			if(branchList!=null&&branchList.size()>0){
				List<String> siteCodesList = new ArrayList<String>();
				for(PlmsSysBranchManage br:branchList){
					siteCodesList.add(br.getSiteCode());
				}
				//根据所属网点查找作业部催收员所属机构 
				Map<String,Object> siteMap = new HashMap<String, Object>();
				siteMap.put("siteCodeList", siteCodesList);
				orgIdList = sysOrgService.selectOrgBySiteCode(siteMap);
			}else{
	        	Long orgIdA = SubjectUtil.getSession(request).getOrgId();
	        	orgIdList.add(orgIdA);
			}
        }
		Map<String,Object> map = new HashMap<String,Object>();
		//催收员数据列表
		List<PlmsEmpCollectDetailDto> collectorList = plmsWorkOrderPoolCaseService.getAllCollector(status,orgId,orgIdList);
		//催收员机构列表
		Map<Long,Object> orgMap = new HashMap<Long,Object>();
		if(collectorList.size()>0){
			for(PlmsEmpCollectDetailDto dto:collectorList){
				orgMap.put(dto.getOrgId(), dto.getOrgName());
			}
		}
		//所选区间的分配规则
		PlmsCollectionRuleSetExample example = new PlmsCollectionRuleSetExample();
		example.createCriteria().andStatusEqualTo(status);
		PlmsCollectionRuleSet collRule = plmsCollectionRuleSetService.selectByExampleList(example).get(0);
		map.put("assignRule", collRule.getAssignRuleCode());
		map.put("orgMap", orgMap);
		map.put("collectorList", collectorList);
		
		return map;
		
	}
	
	/**
	* @Description: 手工调整 
	* @return
	* @return String
	 * @throws
	 */
	@RequestMapping(value = "/caseAlloc",method = RequestMethod.POST)
	@ResponseBody
	@RequiresPermissions(value={PermissionSign.CASEMANAGEMENT_ALLOC,PermissionSign.CASEMANAGEMENT_AGENTALLOC},logical=Logical.OR)
	public JSONResult caseAlloc(String paymentIds,String collectors,String mode,HttpServletRequest request){
		 Subject subject = SecurityUtils.getSubject();
	     String userName = (String) subject.getPrincipal();
		if(paymentIds!=null&&paymentIds!=""&&collectors!=null&&collectors!=""){
			String[] pays = paymentIds.split(",");
			String[] collecs = collectors.split(",");
			//字符串数组转Long型
			Long[] lo = (Long[])ConvertUtils.convert(pays, Long.class);
			List<Long> payments = Arrays.asList(lo);
			List<String> collectorIds = Arrays.asList(collecs);
			if("maru".equals(mode)){
				String assignRule = request.getParameter("assignRule");
				String status = request.getParameter("status");
				plmsWorkOrderPoolCaseService.updatemaruAlloc(payments, collectorIds,userName,assignRule,status);
			}else if("agent".equals(mode)){
				String agentDateStart = request.getParameter("agentDateStart");
				String agentDateEnd = request.getParameter("agentDateEnd");
				Date agentStart = null;
				//代理开始日期为当天
				if(D.toDate(agentDateStart).compareTo(D.trunc(new Date()))==0){
					agentStart = new Date();
				}else{
					agentStart = D.toDate(agentDateStart+" 00:00:00",D.PATTERN_SECONDS);
				}
				Date agentEnd = D.toDate(agentDateEnd+" 23:59:59",D.PATTERN_SECONDS);
				plmsWorkOrderPoolCaseService.updateagentAlloc(payments, collectorIds,agentStart,agentEnd,userName);
			}
			return new JSONResult(true,"操作成功！");
		}else{
			return new JSONResult(false,"操作失败！");
		}
		
		
	}
	
	/**
	 * 
	* @Description: 手动批量分配 
	* @param param
	* @param request
	* @return
	* @return JSONResult
	 */
	@RequestMapping(value = "/caseBatchAlloc",method = RequestMethod.POST)
	@ResponseBody
	@RequiresPermissions(PermissionSign.CASEMANAGEMENT_BATCHALLOC)
	public JSONResult caseBatchAlloc(PlmsWorkOrderPoolParam param,String collectors){
		if(collectors!=null&&collectors!=""){
			Subject subject = SecurityUtils.getSubject();
		    String userName = (String) subject.getPrincipal();	
			plmsWorkOrderPoolCaseService.updateMaruBatchAlloc(param, collectors, userName);
			return new JSONResult(true,"操作成功！");
		}else{
			return new JSONResult(false,"操作失败！");	
		}
		
	}
	
	@RequestMapping("/exportExcel")
	@RequiresPermissions(PermissionSign.CASEMANAGEMENT_EXPORTEXCEL)
	public void exportExcel(PlmsWorkOrderPoolParam param,HttpServletRequest request, HttpServletResponse response){
		//系统分隔符
		String FILE_SEPARATOR = System.getProperties().getProperty("file.separator");
		List<PlmsWorkOrderPoolExportDto> expotList = plmsWorkOrderPoolService.selectByExampleForExport(param);
		String docsPath = request.getSession().getServletContext()
				.getRealPath("docs");
		if(FileUtil.createFile(docsPath)){
			plmsWorkOrderPoolService.exportToExcel("", docsPath, expotList);
			String fileName = "caseManagement.xls";
			String filePath = docsPath + FILE_SEPARATOR + fileName;
			FileUtil.downloadFile("案件管理.xls",filePath,request,response);
		}else{
			logger.info("------创建目录失败-----");
		}
	}

	/**
	 * 
	* @Description: 根据区间值查找逾期天数范围 
	* @param status
	* @return
	* @return String
	 */
	@RequestMapping("/searchOverDaysByStatus")
	@ResponseBody
	public String searchOverDaysByStatus(String status){
		PlmsCircuRuleSet circuSet = plmsCircuRuleSetService.searchOverDaysByStatus(status);
		return JSONUtil.toJSONString(circuSet);		
	}
	
	
	
	
	/**
	* @Description: 库存调整（目前先不做）
	* @param paymentId
	* @param model
	* @return String
	 */
	@RequestMapping(value="/caseAdjust",method=RequestMethod.GET)
	public String caseAdjust(Long paymentId,Model model){
		if(paymentId !=null){
			PlmsWorkOrderPoolExample examplePool= new PlmsWorkOrderPoolExample();
			examplePool.createCriteria().andPaymentIdEqualTo(paymentId).andIsActiveEqualTo("Y");
			List<PlmsWorkOrderPool> poolList = plmsWorkOrderPoolService.selectByExampleList(examplePool);
			//工单池数据
			PlmsWorkOrderPool pool = new PlmsWorkOrderPool();
			if(poolList!=null&&poolList.size()>0){
				pool = poolList.get(0);
			}
			//分配记录
			PlmsLaCollectAllocExample exampleAlloc= new PlmsLaCollectAllocExample();
			exampleAlloc.createCriteria().andIsActiveEqualTo("Y").andPaymentIdEqualTo(paymentId);
			List<PlmsLaCollectAlloc> allocList = plmsLaCollectAllocService.selectByExample(exampleAlloc);
			model.addAttribute("pool", pool);
			model.addAttribute("allocList",allocList);
		}
		return "/jsp/case_management/caseAdjust";
	}

}
