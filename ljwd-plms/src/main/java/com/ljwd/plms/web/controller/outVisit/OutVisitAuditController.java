package com.ljwd.plms.web.controller.outVisit;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

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
import com.ljwd.plms.web.enums.OutVisitCustType;
import com.ljwd.plms.web.model.outVisit.PlmsOvmOutVisitInfoExample;
import com.ljwd.plms.web.model.sys_management.SysOrg;
import com.ljwd.plms.web.model.sys_management.SysOrgExample;
import com.ljwd.plms.web.security.PermissionSign;
import com.ljwd.plms.web.security.SubjectUtil;
import com.ljwd.plms.web.service.outVisit.inf.PlmsOvmOutVisitInfoService;
import com.ljwd.plms.web.service.sys_management.inf.SysOrgService;
import com.ljwd.plms.web.vo.DataTableParam;
import com.ljwd.plms.web.vo.SessionMsg;
import com.ljwd.plms.web.vo.case_management.PlmsWorkOrderPoolDto;
import com.ljwd.plms.web.vo.outVisit.OutVisitAuditParamDto;
import com.ljwd.plms.web.vo.outVisit.OutVisitAuditResult;
import com.ljwd.plms.web.vo.outVisit.OutVisitStatusType;

@Component
@RequestMapping("outVisitAudit")
public class OutVisitAuditController {
	
	@Resource
	private PlmsOvmOutVisitInfoService plmsOvmOutVisitInfoService;
	@Resource
	private SysOrgService sysOrgService;


	@RequestMapping(value="/view",method = RequestMethod.GET)
	@RequiresPermissions(PermissionSign.OUTVISITAUDIT_SELECT)
	public String view(Model model){
		Map<String, Object> custTypeMap = OutVisitCustType.getOutVisitCustType();
		model.addAttribute("custTypeList", custTypeMap);
		//所属机构
        /*Map<String,Object> map = new HashMap<String,Object>();
		List<SysOrg> outVisitOrgList= sysOrgService.selectOutVisitOrgByExample(map);*/
		SysOrgExample exampOrg = new SysOrgExample();
		List<SysOrg> orgList= sysOrgService.selectByExample(exampOrg);
		List<SysOrg> treeList = new ArrayList<SysOrg>();
		InitOrgToTreeList.InitOrganizationDropDown(treeList,orgList,0,0);
        model.addAttribute("outVisitOrgList", treeList);
		return "/jsp/outVisit/outVisitAudit";
		
	}
	/**
	 * 
	* @Description: 外访审核分页 
	* @param example
	* @return
	* @return String
	 */
	@RequestMapping(value = "/pageOutVisitAuditData",method = RequestMethod.POST)
	@ResponseBody
	@RequiresPermissions(PermissionSign.OUTVISITAUDIT_SELECT)
	public String pageOutVisitAuditData(OutVisitAuditParamDto example){
		
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
	        
	    
	        Page<OutVisitAuditResult> pageData = new Page<OutVisitAuditResult>(pageNo, pageSize);

	        pageData = plmsOvmOutVisitInfoService.selectAuditByExampleAndPage(pageData, example,dataTableParam);

	        return PageUtil.getPageJson_dataFormat(sEcho, pageData);

		
	}
	
	@RequestMapping("/updateOutVisitAuditedStatus")
	@ResponseBody
	@RequiresPermissions(PermissionSign.OUTVISITAUDIT_AUDIT)
	public JSONResult updateOutVisitAuditedStatus(PlmsOvmOutVisitInfoExample example,HttpServletRequest request){
		if(example.getIds()==null){
			return new JSONResult(false,"请选择待审核的案件！");
		}
		String handelResult = example.getHandelResult();
		if(example.getHandelResult().equals(OutVisitStatusType.AuditRefused)){
			if(example.getAuditRefusedReason()==null){
				return new JSONResult(false,"请填写审核拒绝的原因！");
			}
		}
		SessionMsg loginUser = SubjectUtil.getSession(request);
		if(loginUser!=null){
			plmsOvmOutVisitInfoService.updateOutVisitAuditedStatus(example,loginUser);	
		}else{
			return new JSONResult(false,"登录信息已过期，请重新登录!");
		}
		String msg = "";
		if(handelResult.equals(OutVisitStatusType.Audited)){
			msg = "审核已通过！";
		}
		if(handelResult.equals(OutVisitStatusType.AuditRefused)){
			msg = "审核已被拒绝！";
		}
		return new JSONResult(false,msg);

	}

}
