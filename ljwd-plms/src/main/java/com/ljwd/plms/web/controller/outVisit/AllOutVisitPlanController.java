package com.ljwd.plms.web.controller.outVisit;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.apache.shiro.authz.annotation.Logical;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ljwd.plms.core.feature.orm.mybatis.Page;
import com.ljwd.plms.core.util.PageUtil;
import com.ljwd.plms.web.model.cust.PlmsLnAnnex;
import com.ljwd.plms.web.model.cust.PlmsLnAnnexExample;
import com.ljwd.plms.web.model.outVisit.PlmsOvmOutVisitArea;
import com.ljwd.plms.web.model.outVisit.PlmsOvmOutVisitAreaExample;
import com.ljwd.plms.web.model.outVisit.PlmsOvmOutVisitUser;
import com.ljwd.plms.web.model.outVisit.PlmsOvmOutVisitUserExample;
import com.ljwd.plms.web.security.PermissionSign;
import com.ljwd.plms.web.security.SubjectUtil;
import com.ljwd.plms.web.service.cust.inf.PlmsLnAnnexService;
import com.ljwd.plms.web.service.outVisit.inf.PlmsOvmOutVisitAreaService;
import com.ljwd.plms.web.service.outVisit.inf.PlmsOvmOutVisitPlanService;
import com.ljwd.plms.web.service.outVisit.inf.PlmsOvmOutVisitUserService;
import com.ljwd.plms.web.vo.DataTableParam;
import com.ljwd.plms.web.vo.SessionMsg;
import com.ljwd.plms.web.vo.outVisit.AllOutVisitDetailInfoResult;
import com.ljwd.plms.web.vo.outVisit.AllOutVisitPlanDetailCustResult;
import com.ljwd.plms.web.vo.outVisit.AllOutVisitPlanParamDto;
import com.ljwd.plms.web.vo.outVisit.AllOutVisitPlanResult;
import com.ljwd.plms.web.wsdl.webservice.LoanServiceWSDL;
import com.ljwd.plms.web.wsdl.webservice.service.CalculateSummaryReceivableParamDto;
import com.ljwd.plms.web.wsdl.webservice.service.SimulateCalculateSummaryReceivableResultDto;
/**
 * 全部外访计划
 * <p>Title: AllOutVisitPlanController</p>
 * @author pangshanxing
 * @date 2016年11月7日下午3:46:36
 */
@RequestMapping("allOutVisitPlan")
@Controller
public class AllOutVisitPlanController {

	
	@Resource
	private PlmsOvmOutVisitAreaService plmsOvmOutVisitAreaService;
	@Resource
	private PlmsOvmOutVisitPlanService plmsOvmOutVisitPlanService;
	@Resource
	private PlmsOvmOutVisitUserService plmsOvmOutVisitUserService;
	@Resource
    private PlmsLnAnnexService annexService;
	
    private Logger logger = LoggerFactory.getLogger(this.getClass());


	
	@RequestMapping(value="/view",method = RequestMethod.GET)
	@RequiresPermissions(value={PermissionSign.OUTVISITPLAN_SELECT,PermissionSign.OUTVISITPLAN_SELECTALL},logical=Logical.OR)
	public String view(Model model,HttpServletRequest request){
		SessionMsg msg = SubjectUtil.getSession(request);
        if(msg==null){
        	return "登录信息已过期，请重新登录";
        }
       /* String userId = msg.getName();
        Map<String,Object> map = new HashMap<String,Object>();
		List<PlmsOvmOutVisitUser> outVisitUserList = plmsOvmOutVisitUserService.searchInfoByMap(map);
        if(outVisitUserList!=null&&outVisitUserList.size()>0){
        	for(PlmsOvmOutVisitUser outUser:outVisitUserList){
        		if(outUser.getUserId().equals(userId)){
        			model.addAttribute("outUser", outUser);
        			break;
        		}
        	}
        }*/
        if(SubjectUtil.isPermitted(PermissionSign.OUTVISITPLAN_SELECT)&&(!SubjectUtil.isPermitted(PermissionSign.OUTVISITPLAN_SELECTALL))){
        	model.addAttribute("userName", msg.getUserName());
        }
		//所属城市
		PlmsOvmOutVisitAreaExample example = new PlmsOvmOutVisitAreaExample();
		example.setIsActive("Y");
		List<PlmsOvmOutVisitArea> areaList = plmsOvmOutVisitAreaService.selectByExample(example);
		
		

		model.addAttribute("areaList", areaList);

		return "/jsp/outVisit/allOutVisitPlan";
		
	}
	
	
	@RequestMapping("/pageAllOIutVisitPlanData")
	@ResponseBody
	@RequiresPermissions(value={PermissionSign.OUTVISITPLAN_SELECT,PermissionSign.OUTVISITPLAN_SELECTALL},logical=Logical.OR)
	public String pageAllOIutVisitPlanData(AllOutVisitPlanParamDto example){
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

        Page<AllOutVisitPlanResult> pageData = new Page<AllOutVisitPlanResult>(pageNo, pageSize);
        
        //设置排序
        example.setOrderByClause(dataTableParam);

        pageData = plmsOvmOutVisitPlanService.selectAllOutVisitPlanByExampleAndPage(pageData, example);

        return PageUtil.getPageJson_dataFormat(sEcho, pageData);

	}

	@RequestMapping("/outVisitPlanDetail")
	@RequiresPermissions(PermissionSign.OUTVISITPLAN_SELECTDETAIL)
	public String outVisitPlanDetail(Long planId,Long applId,Long infoId,Model model){
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("infoId", infoId);
		map.put("planId", planId);
		 //客户信息
		AllOutVisitPlanDetailCustResult custDetail = plmsOvmOutVisitPlanService.selectAllOutPlanCustDetail(map);
			//调用微贷接口
			CalculateSummaryReceivableParamDto param = new CalculateSummaryReceivableParamDto();
	        param.setContractNo(custDetail.getCntrctNo());
	        param.setIdCardNo(custDetail.getIdCardNo());
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
	    		//逾期应还金额
	        	custDetail.setOverdueAmount(result.getReceivableSumaryAmount());
	    		//已还期数
	        	custDetail.setPaidPeriod(result.getCalculateClientInfoDto().getPaidPeriodNumber());
	        	//当前逾期天数
	        	custDetail.setOverdueDayNow(result.getOverdueDays()==null?null:result.getOverdueDays().longValue());
	        	//贷款期数
	        	custDetail.setPeriodNum(result.getCalculateClientInfoDto().getLoanPeriod());
	        	//货款金额
	        	custDetail.setLoanAmt(result.getCalculateClientInfoDto().getLoanAmount());
	        }

	        
	        CalculateSummaryReceivableParamDto param2 = new CalculateSummaryReceivableParamDto();
	        param2.setContractNo(custDetail.getCntrctNo());
	        param2.setIdCardNo(custDetail.getIdCardNo());
	        //提前结清
	        param2.setIsInAdvanceRepayment(true);
            param2.setIsRenewLoanRepayment(false);
	        param2.setRepaymentDate(new Date());
	        SimulateCalculateSummaryReceivableResultDto result2 = null;
	        try {
	            result2 = LoanServiceWSDL.getService().calculateSummaryReceivable(param2);
	        } catch (Exception e) {
	            e.printStackTrace();
	            logger.error("计算应收金额：" + e.getMessage());
	        }

	        if(result2!=null){
	    		//逾期应还金额
	        	custDetail.setClearAmount(result2.getReceivableSumaryAmount());
	        }
	        //外访信息
	        AllOutVisitDetailInfoResult outplanDetail = plmsOvmOutVisitPlanService.selectAllOutPlanInfoDetail(map);
	        
	        PlmsLnAnnexExample annexExample = new PlmsLnAnnexExample();
	        annexExample.setOutVisitPlanId(planId);
	        annexExample.setApplId(applId);
	        annexExample.setIsDeleted("N");
	        List<PlmsLnAnnex> annexList = annexService.selectByExample(annexExample);
	        
	        //客户信息
			model.addAttribute("applDetail", custDetail);
			//外访信息
			model.addAttribute("outplanDetail", outplanDetail);
		    //附件信息
			model.addAttribute("annexList", annexList);
		return "/jsp/outVisit/outVisitPlanDetail";
		
	}
}
