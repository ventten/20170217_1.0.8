package com.ljwd.plms.web.controller.outVisit;


import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.apache.commons.beanutils.ConvertUtils;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ljwd.plms.core.entity.JSONResult;
import com.ljwd.plms.core.feature.orm.mybatis.Page;
import com.ljwd.plms.core.util.PageUtil;
import com.ljwd.plms.web.enums.OutVisitCustType;
import com.ljwd.plms.web.model.outVisit.PlmsOvmOutVisitArea;
import com.ljwd.plms.web.model.outVisit.PlmsOvmOutVisitAreaExample;
import com.ljwd.plms.web.model.outVisit.PlmsOvmOutVisitInfo;
import com.ljwd.plms.web.security.PermissionSign;
import com.ljwd.plms.web.security.SubjectUtil;
import com.ljwd.plms.web.service.outVisit.inf.PlmsOvmOutDelayService;
import com.ljwd.plms.web.service.outVisit.inf.PlmsOvmOutVisitAreaService;
import com.ljwd.plms.web.service.outVisit.inf.PlmsOvmOutVisitInfoService;
import com.ljwd.plms.web.vo.DataTableParam;
import com.ljwd.plms.web.vo.SessionMsg;
import com.ljwd.plms.web.vo.case_management.SysProduct;
import com.ljwd.plms.web.vo.outVisit.OutVisitAssignResult;
import com.ljwd.plms.web.vo.outVisit.OutVisitDelayDto;
import com.ljwd.plms.web.vo.outVisit.OutVisitDelayParamDto;
import com.ljwd.plms.web.vo.outVisit.OutVisitDelayResult;
import com.ljwd.plms.web.vo.outVisit.OutVisitStatusType;

@RequestMapping("outVisitDelay")
@Controller
public class OutVisitDelayController {

	@Resource
	private PlmsOvmOutDelayService plmsOvmOutDelayService;
	@Resource
	private PlmsOvmOutVisitAreaService plmsOvmOutVisitAreaService;
	@Resource
	private PlmsOvmOutVisitInfoService	plmsOvmOutVisitInfoService;
	
	@RequestMapping("/submitDelay")
	@ResponseBody
	@RequiresPermissions(PermissionSign.MYOUTVISIT_SUBMITDELAY)
	public JSONResult submitDelay(OutVisitDelayDto example,HttpServletRequest request){
		String infoStr = example.getInfoIdStrs();
		if(infoStr==null||infoStr.equals("")){
			return new JSONResult(false,"申请延期出现错误，请重新发送请求");
		}
		if(example.getDelayReason()==null){
			return new JSONResult(false,"请填写申请延期的原因");
		}
		String[] infoStrs = infoStr.split(",");
		Long[] infoIds = (Long[])ConvertUtils.convert(infoStrs, Long.class);
		if(infoIds==null||infoIds.length==0){
			return new JSONResult(false,"申请延期出现错误，请重新发送请求");
		}else{
			example.setInfoIds(infoIds);
		}
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("ids", Arrays.asList(infoIds));
		List<PlmsOvmOutVisitInfo> outVisitInfoList = plmsOvmOutVisitInfoService.searchInfoByMap(map);
		if(outVisitInfoList!=null&&outVisitInfoList.size()>0){
			for(PlmsOvmOutVisitInfo info:outVisitInfoList){
				if(info.getCaseType().equals("CASE_DELAYING")){
					return new JSONResult(false,"案件类型不为新增案件或延期案件！不可再提交申请");
				}
			}
		}
		SessionMsg loginUser = SubjectUtil.getSession(request);
	    if(loginUser==null){
			return new JSONResult(false,"登录信息已过期，请重新登录");
	    }
	    
	    plmsOvmOutDelayService.submitDelay(example, loginUser);
		return new JSONResult(false,"延期申请成功");
		
	}
	
	
	@RequestMapping(value="/view",method = RequestMethod.GET)
	@RequiresPermissions(PermissionSign.OUTVISITDELAY_SELECT)
	public String view(Model model){		
		//所属城市
		PlmsOvmOutVisitAreaExample example = new PlmsOvmOutVisitAreaExample();
		example.setIsActive("Y");
		List<PlmsOvmOutVisitArea> areaList = plmsOvmOutVisitAreaService.selectByExample(example);
		
		model.addAttribute("areaList", areaList);

		return "/jsp/outVisit/outVisitDelay";
		
	}
	
	@RequestMapping("/pageOutVisitDelayData")
	@ResponseBody
	@RequiresPermissions(PermissionSign.OUTVISITDELAY_SELECT)
	public String pageOutVisitDelayData(OutVisitDelayParamDto example){
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

        Page<OutVisitDelayResult> pageData = new Page<OutVisitDelayResult>(pageNo, pageSize);
        
        //设置排序
        example.setOrderByClause(dataTableParam);

        pageData = plmsOvmOutDelayService.selectDelayByExampleAndPage(pageData, example,dataTableParam);

        return PageUtil.getPageJson_dataFormat(sEcho, pageData);

	}
	
	@RequestMapping("/updateOutVisitDelayAuditedStatus")
	@ResponseBody
	@RequiresPermissions(PermissionSign.OUTVISITDELAY_AUDIT)
	public JSONResult updateOutVisitDelayAuditedStatus(OutVisitDelayDto example,HttpServletRequest request){
		String idsStr = example.getDelayIdsStr();
		String dtlIdsStr = example.getDelayDtlIdsStr();
		if(idsStr==null||idsStr.equals("")||dtlIdsStr==null||dtlIdsStr.equals("")){
			return new JSONResult(false,"申请延期出现错误，请重新发送请求");
		}
		String[] idsStrs = idsStr.split(",");
		String[] dtlIdsStrs = dtlIdsStr.split(",");
		Long[] ids = (Long[])ConvertUtils.convert(idsStrs, Long.class);
		Long[] dtlIds = (Long[])ConvertUtils.convert(dtlIdsStrs, Long.class);
 		if(ids==null||ids.length==0||dtlIds==null||dtlIds.length==0||example.getDelayAuditResult()==null){
			return new JSONResult(false,"申请延期出现错误，请重新发送请求");
		}else{
			example.setDelayIds(ids);
			example.setDelayDtlIds(dtlIds);
		}

		if(example.getDelayAuditResult().equals("REJECT")){
			if(example.getDelayAuditRefuse()==null){
				return new JSONResult(false,"请填写审批拒绝的原因！");
			}
		}
		SessionMsg loginUser = SubjectUtil.getSession(request);
		if(loginUser!=null){
			plmsOvmOutDelayService.updateOutVisitDelayAuditedStatus(example,loginUser);	
		}else{
			return new JSONResult(false,"登录信息已过期，请重新登录!");
		}
		return new JSONResult(true,"审批已完成！");
		
	}
}
