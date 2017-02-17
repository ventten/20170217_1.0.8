package com.ljwd.plms.web.controller.case_collection;

import com.ljwd.plms.core.entity.JSONResult;
import com.ljwd.plms.core.feature.orm.mybatis.Page;
import com.ljwd.plms.core.util.PageUtil;
import com.ljwd.plms.core.util.StringUtil;
import com.ljwd.plms.web.model.case_collection.LfRecivDtl;
import com.ljwd.plms.web.model.case_collection.LfRecivDtlEntery;
import com.ljwd.plms.web.model.messageSystem.CalculateSummaryReceivableParamMyDto;
import com.ljwd.plms.web.model.sys_management.SysSite;
import com.ljwd.plms.web.model.sys_management.SysSiteExample;
import com.ljwd.plms.web.security.PermissionSign;
import com.ljwd.plms.web.service.case_collection.inf.LfRecivDtlService;
import com.ljwd.plms.web.service.correspondence.inf.CorrespondenceService;
import com.ljwd.plms.web.service.sys_management.inf.SysSiteService;
import com.ljwd.plms.web.vo.DataTableParam;
import com.ljwd.plms.web.vo.case_collection.CustRecivDetailExample;
import com.ljwd.plms.web.vo.case_collection.RecivPageDto;
import com.ljwd.plms.web.vo.correspondence.PlmsCollectorInfo;
import com.ljwd.plms.web.vo.sys_management.SysPaymentTypeDto;
import com.ljwd.plms.web.wsdl.webservice.LoanServiceWSDL;
import com.ljwd.plms.web.wsdl.webservice.service.*;

import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * 案件催收-应收控制器
 * */
@Controller
@RequestMapping(value="/caseCollection")
public class RecivController {

    private Logger logger = LoggerFactory.getLogger(this.getClass());
    @Resource
    private LfRecivDtlService lfRecivDtlService;
    @Resource
    private SysSiteService sysSiteService;
    @Resource
    private CorrespondenceService correspondenceService;
    /**
     * 客户应收明细页
     * */
    @RequestMapping(value="/recivDtlIndex")
    @RequiresPermissions(PermissionSign.COLLECT_REC_RECIV_DTL)
    public String recivDtlIndex(String cntrctNo,Model model){
    	//所属网点
    	SysSiteExample exam = new SysSiteExample();
		exam.setIsActive("Y");
		List<SysSite> siteList= sysSiteService.selectByExample(exam);
		//放款类别
		List<SysPaymentTypeDto> paymentList = lfRecivDtlService.selectAllPaymentType();
			
    	model.addAttribute("cntrctNo", cntrctNo);
    	model.addAttribute("siteList", siteList);
    	model.addAttribute("paymentTypeList", paymentList);
        return "/jsp/case_collection/recivDtlIndex";
    }

    /**
     * 客户应收明细数据
     * */
    @RequestMapping(value = "/pageRecivDtlData",method = RequestMethod.POST)
    @ResponseBody
    @RequiresPermissions(PermissionSign.COLLECT_REC_RECIV_DTL)
    public String pageRecivDtlData(CustRecivDetailExample example){
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

        Page<RecivPageDto> pageData = new Page<RecivPageDto>(pageNo, pageSize);
        
        pageData = lfRecivDtlService.searchReceivableAndPage(pageData, example);

        return PageUtil.getPageJson_dataFormat(sEcho, pageData);
    }

    /**
     * 计算应收金额
     * @param cntrctNo 合同编号
     * @param idCardNo 身份证号
     * @param payType 还款方式:RENEW-正常还款、INADVANCE-提前结清
     * @param repaymentDate 还款日期,如果空默认为当天
     * */
    @RequestMapping(value = "/getRepaymentAmount",method = RequestMethod.POST)
    @ResponseBody
    public JSONResult getRepaymentAmount(String cntrctNo, String idCardNo, String payType, Date repaymentDate, HttpServletRequest request){
        if(StringUtil.isEmpty(cntrctNo)){
            return new JSONResult(false,"计算应收金额-参数异常[cntrctNo]");
        }
        if(StringUtil.isEmpty(idCardNo)){
            return new JSONResult(false,"计算应收金额-参数异常[idCardNo]");
        }
        if(StringUtil.isEmpty(payType)){
            return new JSONResult(false,"计算应收金额-参数异常[payType]");
        }

        repaymentDate = repaymentDate == null ? new Date() : repaymentDate;

        CalculateSummaryReceivableParamDto param = new CalculateSummaryReceivableParamDto();

        //提前结清
        if ("ADV_CLEAR".equals(payType)){
            param.setIsInAdvanceRepayment(true);
            param.setIsRenewLoanRepayment(false);
        }
        //正常还款
        else{
            param.setIsInAdvanceRepayment(false);
            param.setIsRenewLoanRepayment(false);
        }
        param.setRepaymentDate(repaymentDate);
        param.setContractNo(cntrctNo);
        param.setIdCardNo(idCardNo);

        SimulateCalculateSummaryReceivableResultDto result = null;
        try {
            result = LoanServiceWSDL.getService().calculateSummaryReceivable(param);
        } catch (Exception e) {
            e.printStackTrace();
            logger.error("计算应收金额：" + e.getMessage());
        }

        return new JSONResult(result);
    }

    /**
     * 计算应收金额
     * @param cntrctNo 合同编号
     * @param idCardNo 身份证号
     * @param payType 还款方式:RENEW-正常还款、INADVANCE-提前结清
     * @param repaymentDate 还款日期,如果空默认为当天
     * @author zhengjizhao
     * @date 2016年11月26日下午3:09:48
     * */
    @RequestMapping(value = "/getRepaymentAmountAll",method = RequestMethod.POST)
    @ResponseBody
    public LfRecivDtlEntery getRepaymentAmountAll(String cntrctNo,String idCardNo,String payType,Date repaymentDate,HttpServletRequest request){
        if(StringUtil.isEmpty(cntrctNo)){
            throw new RuntimeException("计算应收金额-参数异常[cntrctNo]");
        }
        if(StringUtil.isEmpty(idCardNo)){
            throw new RuntimeException("计算应收金额-参数异常[idCardNo]");
        }
        if(StringUtil.isEmpty(payType)){
            throw new RuntimeException("计算应收金额-参数异常[payType]");
        }

        repaymentDate = repaymentDate == null ? new Date() : repaymentDate;

        CalculateSummaryReceivableParamDto param = new CalculateSummaryReceivableParamDto();

        //提前结清
        if ("ADV_CLEAR".equals(payType)){
            param.setIsInAdvanceRepayment(true);
            param.setIsRenewLoanRepayment(false);
        }
        //正常还款
        else{
            param.setIsInAdvanceRepayment(false);
            param.setIsRenewLoanRepayment(false);
        }
        param.setRepaymentDate(repaymentDate);
        param.setContractNo(cntrctNo);
        param.setIdCardNo(idCardNo);
        LfRecivDtlEntery para = new LfRecivDtlEntery();
        SimulateCalculateSummaryReceivableResultDto result = null;
        try {
            result = LoanServiceWSDL.getService().calculateSummaryReceivable(param);
            //计算金额开始
             BigDecimal principal = BigDecimal.ZERO; 			//本金/保证金
        	 BigDecimal interest = BigDecimal.ZERO;  			//利息
        	 BigDecimal brokerFee = BigDecimal.ZERO; 			//居间费
        	 BigDecimal handlingFee = BigDecimal.ZERO; 		    //服务费
        	 BigDecimal penalty = BigDecimal.ZERO;				//违约金
        	 BigDecimal overdueInterest = BigDecimal.ZERO;		//逾期利息
        	 BigDecimal failCollectFee = BigDecimal.ZERO;		//代扣费
        	 BigDecimal extendFee = BigDecimal.ZERO;			//展期费
        	 BigDecimal collectCost = BigDecimal.ZERO;			//催收费
        	 BigDecimal delayFee = BigDecimal.ZERO;			    //延期费
        	 BigDecimal houseQueryFee = BigDecimal.ZERO;		//房产查询费用
        	 BigDecimal surveyFee = BigDecimal.ZERO;			//实地考察费用
        	 BigDecimal ttlFee = BigDecimal.ZERO;				//总费用(含月利率)（趸交业务模式用）
        	 BigDecimal creditQueryFee = BigDecimal.ZERO;		//征信查询用/划扣手续费
        	 BigDecimal advanceFee = BigDecimal.ZERO;			//预交费用/预付款
        	 BigDecimal houseSurveyFee = BigDecimal.ZERO;		//房产调查费
        	 BigDecimal agencyHandlingFee = BigDecimal.ZERO;	//贷款手续费
        	 BigDecimal gpsCost = BigDecimal.ZERO;				//GPS费用
        	 BigDecimal returnGpsCost = BigDecimal.ZERO;		//退还GPS费用
        	 BigDecimal riskDeposit = BigDecimal.ZERO;			//风险保证金
        	 BigDecimal estimationFee = BigDecimal.ZERO;		//检测评估费
        	 BigDecimal mortgageFee = BigDecimal.ZERO;			//抵押登记费
        	 BigDecimal vehicleChadangFee = BigDecimal.ZERO;	//车辆查档费
        	 BigDecimal otherFee = BigDecimal.ZERO;			    //其它
        	 BigDecimal parkingFee = BigDecimal.ZERO;			//停车费
        	 BigDecimal towingFee = BigDecimal.ZERO;			//拖车费
        	
        	 //BigDecimal clearAmt = BigDecimal.ZERO;			//应还金额
            //计算每一期累计下来的费用
            for(ReceivableSearchResultDto receivable:result.getReceivableDtos()){
            	for(ReceivableDetailDto detail:receivable.getReceivableDetails()){
            		//本金/保证金
                    if((LfRecivDtl.PRINCIPAL).equals(detail.getLedgerTypeCode())){
                    	if(detail.getRepaymentPostAmount() != null && !(BigDecimal.ZERO).equals(detail.getRepaymentPostAmount())){
                    		principal = principal.add(detail.getRepaymentPostAmount());
                    	}
                    //利息
                    }else if((LfRecivDtl.INTEREST).equals(detail.getLedgerTypeCode())){
                    	if(detail.getRepaymentPostAmount() != null && !(BigDecimal.ZERO).equals(detail.getRepaymentPostAmount())){
                    		interest = interest.add(detail.getRepaymentPostAmount());
                    	}
                    }
                    //居间费
                    else if((LfRecivDtl.BROKER_FEE).equals(detail.getLedgerTypeCode())){
                    	if(detail.getRepaymentPostAmount() != null && !(BigDecimal.ZERO).equals(detail.getRepaymentPostAmount())){
                    		brokerFee = brokerFee.add(detail.getRepaymentPostAmount());
                    	}
                    }
                    //服务费
                    else if((LfRecivDtl.HANDLING_FEE).equals(detail.getLedgerTypeCode())){
                    	if(detail.getRepaymentPostAmount() != null && !(BigDecimal.ZERO).equals(detail.getRepaymentPostAmount())){
                    		handlingFee = handlingFee.add(detail.getRepaymentPostAmount());
                    	}
                    }
                    //违约金
                    else if((LfRecivDtl.PENALTY).equals(detail.getLedgerTypeCode())){
                    	if(detail.getRepaymentPostAmount() != null && !(BigDecimal.ZERO).equals(detail.getRepaymentPostAmount())){
                    		penalty = penalty.add(detail.getRepaymentPostAmount());
                    	}
                    }
                    //逾期利息
                    else if((LfRecivDtl.OVERDUE_INTEREST).equals(detail.getLedgerTypeCode())){
                    	if(detail.getRepaymentPostAmount() != null && !(BigDecimal.ZERO).equals(detail.getRepaymentPostAmount())){
                    		overdueInterest = overdueInterest.add(detail.getRepaymentPostAmount());
                    	}
                    }
                    //代扣费
                    else if((LfRecivDtl.FAIL_COLLECT_FEE).equals(detail.getLedgerTypeCode())){
                    	if(detail.getRepaymentPostAmount() != null && !(BigDecimal.ZERO).equals(detail.getRepaymentPostAmount())){
                    		failCollectFee = failCollectFee.add(detail.getRepaymentPostAmount());
                    	}
                    }
                    //展期费
                    else if((LfRecivDtl.EXTEND_FEE).equals(detail.getLedgerTypeCode())){
                    	if(detail.getRepaymentPostAmount() != null && !(BigDecimal.ZERO).equals(detail.getRepaymentPostAmount())){
                    		extendFee = extendFee.add(detail.getRepaymentPostAmount());
                    	}
                    }
                    //催收费
                    else if((LfRecivDtl.COLLECT_COST).equals(detail.getLedgerTypeCode())){
                    	if(detail.getRepaymentPostAmount() != null && !(BigDecimal.ZERO).equals(detail.getRepaymentPostAmount())){
                    		collectCost = collectCost.add(detail.getRepaymentPostAmount());
                    	}
                    }
                    //延期费
                    else if((LfRecivDtl.DELAY_FEE).equals(detail.getLedgerTypeCode())){
                    	if(detail.getRepaymentPostAmount() != null && !(BigDecimal.ZERO).equals(detail.getRepaymentPostAmount())){
                    		delayFee = delayFee.add(detail.getRepaymentPostAmount());
                    	}
                    }
                    //房产查询费用
                    else if((LfRecivDtl.HOUSE_QUERY_FEE).equals(detail.getLedgerTypeCode())){
                    	if(detail.getRepaymentPostAmount() != null && !(BigDecimal.ZERO).equals(detail.getRepaymentPostAmount())){
                    		houseQueryFee = houseQueryFee.add(detail.getRepaymentPostAmount());
                    	}
                    }
                    //实地考察费用
                    else if((LfRecivDtl.SURVEY_FEE).equals(detail.getLedgerTypeCode())){
                    	if(detail.getRepaymentPostAmount() != null && !(BigDecimal.ZERO).equals(detail.getRepaymentPostAmount())){
                    		surveyFee = surveyFee.add(detail.getRepaymentPostAmount());
                    	}
                    }
                    //总费用(含月利率)（趸交业务模式用）
                    else if((LfRecivDtl.TTL_FEE).equals(detail.getLedgerTypeCode())){
                    	if(detail.getRepaymentPostAmount() != null && !(BigDecimal.ZERO).equals(detail.getRepaymentPostAmount())){
                    		ttlFee = ttlFee.add(detail.getRepaymentPostAmount());
                    	}
                    }
                    //征信查询用/划扣手续费
                    else if((LfRecivDtl.CREDIT_QUERY_FEE).equals(detail.getLedgerTypeCode())){
                    	if(detail.getRepaymentPostAmount() != null && !(BigDecimal.ZERO).equals(detail.getRepaymentPostAmount())){
                    		creditQueryFee = creditQueryFee.add(detail.getRepaymentPostAmount());
                    	}
                    }
                    //预交费用/预付款
                    else if((LfRecivDtl.ADVANCE_FEE).equals(detail.getLedgerTypeCode())){
                    	if(detail.getRepaymentPostAmount() != null && !(BigDecimal.ZERO).equals(detail.getRepaymentPostAmount())){
                    		advanceFee = advanceFee.add(detail.getRepaymentPostAmount());
                    	}
                    }
                    //房产调查费
                    else if((LfRecivDtl.HOUSE_SURVEY_FEE).equals(detail.getLedgerTypeCode())){
                    	if(detail.getRepaymentPostAmount() != null && !(BigDecimal.ZERO).equals(detail.getRepaymentPostAmount())){
                    		houseSurveyFee = houseSurveyFee.add(detail.getRepaymentPostAmount());
                    	}
                    }
                    //贷款手续费
                    else if((LfRecivDtl.AGENCY_HANDLING_FEE).equals(detail.getLedgerTypeCode())){
                    	if(detail.getRepaymentPostAmount() != null && !(BigDecimal.ZERO).equals(detail.getRepaymentPostAmount())){
                    		agencyHandlingFee = agencyHandlingFee.add(detail.getRepaymentPostAmount());
                    	}
                    }
                    //GPS费用
                    else if((LfRecivDtl.GPS_COST).equals(detail.getLedgerTypeCode())){
                    	if(detail.getRepaymentPostAmount() != null && !(BigDecimal.ZERO).equals(detail.getRepaymentPostAmount())){
                    		gpsCost = gpsCost.add(detail.getRepaymentPostAmount());
                    	}
                    }
                    //退还GPS费用
                    else if((LfRecivDtl.RETURN_GPS_COST).equals(detail.getLedgerTypeCode())){
                    	if(detail.getRepaymentPostAmount() != null && !(BigDecimal.ZERO).equals(detail.getRepaymentPostAmount())){
                    		returnGpsCost = returnGpsCost.add(detail.getRepaymentPostAmount());
                    	}
                    }
                    //风险保证金
                    else if((LfRecivDtl.RISK_DEPOSIT).equals(detail.getLedgerTypeCode())){
                    	if(detail.getRepaymentPostAmount() != null && !(BigDecimal.ZERO).equals(detail.getRepaymentPostAmount())){
                    		riskDeposit = riskDeposit.add(detail.getRepaymentPostAmount());
                    	}
                    }
                    //检测评估费
                    else if((LfRecivDtl.ESTIMATION_FEE).equals(detail.getLedgerTypeCode())){
                    	if(detail.getRepaymentPostAmount() != null && !(BigDecimal.ZERO).equals(detail.getRepaymentPostAmount())){
                    		estimationFee = estimationFee.add(detail.getRepaymentPostAmount());
                    	}
                    }
                    //抵押登记费
                    else if((LfRecivDtl.MORTGAGE_FEE).equals(detail.getLedgerTypeCode())){
                    	if(detail.getRepaymentPostAmount() != null && !(BigDecimal.ZERO).equals(detail.getRepaymentPostAmount())){
                    		mortgageFee = mortgageFee.add(detail.getRepaymentPostAmount());
                    	}
                    }
                    //车辆查档费
                    else if((LfRecivDtl.VEHICLE_CHADANG_FEE).equals(detail.getLedgerTypeCode())){
                    	if(detail.getRepaymentPostAmount() != null && !(BigDecimal.ZERO).equals(detail.getRepaymentPostAmount())){
                    		vehicleChadangFee = vehicleChadangFee.add(detail.getRepaymentPostAmount());
                    	}
                    }
                    //其它
                    else if((LfRecivDtl.OTHER_FEE).equals(detail.getLedgerTypeCode())){
                    	if(detail.getRepaymentPostAmount() != null && !(BigDecimal.ZERO).equals(detail.getRepaymentPostAmount())){
                    		otherFee = otherFee.add(detail.getRepaymentPostAmount());
                    	}
                    }
                    //停车费
                    else if((LfRecivDtl.PARKING_FEE).equals(detail.getLedgerTypeCode())){
                    	if(detail.getRepaymentPostAmount() != null && !(BigDecimal.ZERO).equals(detail.getRepaymentPostAmount())){
                    		parkingFee = parkingFee.add(detail.getRepaymentPostAmount());
                    	}
                    }
                    //拖车费
                    else if((LfRecivDtl.TOWING_FEE).equals(detail.getLedgerTypeCode())){
                    	if(detail.getRepaymentPostAmount() != null && !(BigDecimal.ZERO).equals(detail.getRepaymentPostAmount())){
                    		towingFee = towingFee.add(detail.getRepaymentPostAmount());
                    	}
                    }
            	}
            }
            para.setPrincipal(principal);
            para.setInterest(interest);
            para.setBrokerFee(brokerFee);
            para.setHandlingFee(handlingFee);
            para.setPenalty(penalty);
            para.setOverdueInterest(overdueInterest);
            para.setFailCollectFee(failCollectFee);
            para.setExtendFee(extendFee);
            para.setCollectCost(collectCost);
            para.setDelayFee(delayFee);
            para.setHouseQueryFee(houseQueryFee);
            para.setSurveyFee(surveyFee);
            para.setTtlFee(ttlFee);
            para.setCreditQueryFee(creditQueryFee);
            para.setAdvanceFee(advanceFee);
            para.setHouseSurveyFee(houseSurveyFee);
            para.setAgencyHandlingFee(agencyHandlingFee);
            para.setGpsCost(gpsCost);
            para.setReturnGpsCost(returnGpsCost);
            para.setRiskDeposit(riskDeposit);
            para.setEstimationFee(estimationFee);
            para.setMortgageFee(mortgageFee);
            para.setVehicleChadangFee(vehicleChadangFee);
            para.setOtherFee(otherFee);
            para.setParkingFee(parkingFee);
            para.setTowingFee(towingFee);
            para.setClearAmt(result.getCalculateClientInfoDto().getReceivableSumaryAmount());//应还金额，所有金额的综合
        } catch (Exception e) {
            e.printStackTrace();
            logger.error("催记页面-其他-计算应收金额：" + e.getMessage());
        }

        return para;
    }
    /**
     * 还款查询
     * */
    @RequestMapping(value="/repaymentSearch")
    public String repaymentSearch(Model model){
        return "/jsp/case_collection/repaymentSearch";
    }
    /**
     * 还款查询 数据list
     * */
    @RequestMapping(value = "/pageRepaymentExemptData",method = RequestMethod.POST)
    @ResponseBody
    @RequiresPermissions(PermissionSign.REPAY_SELECT)
    public JSONResult pageRepaymentExemptData(CalculateSummaryReceivableParamMyDto example, HttpServletRequest request){
        if(example.getIdCardNo() == null || "".equals(example.getIdCardNo())){
            return null; //身份证号必填
        }
        CalculateSummaryReceivableParamDto paramDto = new CalculateSummaryReceivableParamDto();
        if ("INADVANCE".equals(example.getRepaymentWay()))//提前结清
        {
        	paramDto.setIsInAdvanceRepayment(true);
        	paramDto.setIsRenewLoanRepayment(false);
        }
        else if ("RENEW".equals(example.getRepaymentWay()))//正常还款
        {
        	paramDto.setIsInAdvanceRepayment(false);
        	paramDto.setIsRenewLoanRepayment(false);
        }
        if("".equals(example.getContractNo())){
        	paramDto.setContractNo(null);
        }else{
        	paramDto.setContractNo(example.getContractNo());
        }
        if("".equals(example.getCustomerName())){
        	paramDto.setCustomerName(null);
        }else{
        	paramDto.setCustomerName(example.getCustomerName());
        }
        if("".equals(example.getIdCardNo())){
        	paramDto.setCustomerName(null);
        }else{
        	paramDto.setIdCardNo(example.getIdCardNo());
        }
        paramDto.setRepaymentDate(example.getRepaymentDate());
        SimulateCalculateSummaryReceivableResultDto result = null;
        try {
        	//放款类别
    		List<SysPaymentTypeDto> paymentList = lfRecivDtlService.selectAllPaymentType();
        	result = LoanServiceWSDL.getService().calculateSummaryReceivable(paramDto);
        	if(result == null){
        		return null;
        	}
        	//放款类别code替换成name
        	String paymentType = result.getCalculateClientInfoDto().getPaymentType();
        	for(int i=0;i<paymentList.size();i++){
        		if(paymentType.equals(paymentList.get(i).getCode())){
        			result.getCalculateClientInfoDto().setPaymentType(paymentList.get(i).getTypeName());
        			break;
        		}
        	}
        	 //查找合同信息(获取催收人员姓名)
        	PlmsCollectorInfo dto = correspondenceService.selectCollectorInfo(result.getCalculateClientInfoDto().getContractNo());
        	if(dto != null){
        		result.getCalculateClientInfoDto().setCollector(dto.getCollectorName());
        	}
        	 //费用项替换中文名
            for(ReceivableSearchResultDto receivable:result.getReceivableDtos()){
            	
            	for(ReceivableDetailDto detail:receivable.getReceivableDetails()){
            		//本金/保证金
                    if((LfRecivDtl.PRINCIPAL).equals(detail.getLedgerTypeCode())){
                    	detail.setLedgerTypeCode("本金/保证金");
                    //利息
                    }else if((LfRecivDtl.INTEREST).equals(detail.getLedgerTypeCode())){
                    	detail.setLedgerTypeCode("利息");
                    }
                    //居间费
                    else if((LfRecivDtl.BROKER_FEE).equals(detail.getLedgerTypeCode())){
                    	detail.setLedgerTypeCode("居间费");
                    }
                    //服务费
                    else if((LfRecivDtl.HANDLING_FEE).equals(detail.getLedgerTypeCode())){
                    	detail.setLedgerTypeCode("服务费");
                    }
                    //违约金
                    else if((LfRecivDtl.PENALTY).equals(detail.getLedgerTypeCode())){
                    	detail.setLedgerTypeCode("违约金");
                    }
                    //逾期利息
                    else if((LfRecivDtl.OVERDUE_INTEREST).equals(detail.getLedgerTypeCode())){
                    	detail.setLedgerTypeCode("逾期利息");
                    }
                    //代扣费
                    else if((LfRecivDtl.FAIL_COLLECT_FEE).equals(detail.getLedgerTypeCode())){
                    	detail.setLedgerTypeCode("代扣费");
                    }
                    //展期费
                    else if((LfRecivDtl.EXTEND_FEE).equals(detail.getLedgerTypeCode())){
                    	detail.setLedgerTypeCode("展期费");
                    }
                    //催收费
                    else if((LfRecivDtl.COLLECT_COST).equals(detail.getLedgerTypeCode())){
                    	detail.setLedgerTypeCode("催收费");
                    }
                    //延期费
                    else if((LfRecivDtl.DELAY_FEE).equals(detail.getLedgerTypeCode())){
                    	detail.setLedgerTypeCode("延期费");
                    }
                    //房产查询费用
                    else if((LfRecivDtl.HOUSE_QUERY_FEE).equals(detail.getLedgerTypeCode())){
                    	detail.setLedgerTypeCode("房产查询费用");
                    }
                    //实地考察费用
                    else if((LfRecivDtl.SURVEY_FEE).equals(detail.getLedgerTypeCode())){
                    	detail.setLedgerTypeCode("实地考察费用");
                    }
                    //总费用(含月利率)（趸交业务模式用）
                    else if((LfRecivDtl.TTL_FEE).equals(detail.getLedgerTypeCode())){
                    	detail.setLedgerTypeCode("总费用(含月利率)");
                    }
                    //征信查询用/划扣手续费
                    else if((LfRecivDtl.CREDIT_QUERY_FEE).equals(detail.getLedgerTypeCode())){
                    	detail.setLedgerTypeCode("征信查询用/划扣手续费");
                    }
                    //预交费用/预付款
                    else if((LfRecivDtl.ADVANCE_FEE).equals(detail.getLedgerTypeCode())){
                    	detail.setLedgerTypeCode("预交费用/预付款");
                    }
                    //房产调查费
                    else if((LfRecivDtl.HOUSE_SURVEY_FEE).equals(detail.getLedgerTypeCode())){
                    	detail.setLedgerTypeCode("房产调查费");
                    }
                    //贷款手续费
                    else if((LfRecivDtl.AGENCY_HANDLING_FEE).equals(detail.getLedgerTypeCode())){
                    	detail.setLedgerTypeCode("贷款手续费");
                    }
                    //GPS费用
                    else if((LfRecivDtl.GPS_COST).equals(detail.getLedgerTypeCode())){
                    	detail.setLedgerTypeCode("GPS费用");
                    }
                    //退还GPS费用
                    else if((LfRecivDtl.RETURN_GPS_COST).equals(detail.getLedgerTypeCode())){
                    	detail.setLedgerTypeCode("退还GPS费用");
                    }
                    //风险保证金
                    else if((LfRecivDtl.RISK_DEPOSIT).equals(detail.getLedgerTypeCode())){
                    	detail.setLedgerTypeCode("风险保证金");
                    }
                    //检测评估费
                    else if((LfRecivDtl.ESTIMATION_FEE).equals(detail.getLedgerTypeCode())){
                    	detail.setLedgerTypeCode("检测评估费");
                    }
                    //抵押登记费
                    else if((LfRecivDtl.MORTGAGE_FEE).equals(detail.getLedgerTypeCode())){
                    	detail.setLedgerTypeCode("抵押登记费");
                    }
                    //车辆查档费
                    else if((LfRecivDtl.VEHICLE_CHADANG_FEE).equals(detail.getLedgerTypeCode())){
                    	detail.setLedgerTypeCode("车辆查档费");
                    }
                    //其它
                    else if((LfRecivDtl.OTHER_FEE).equals(detail.getLedgerTypeCode())){
                    	detail.setLedgerTypeCode("其它");
                    }
                    //停车费
                    else if((LfRecivDtl.PARKING_FEE).equals(detail.getLedgerTypeCode())){
                    	detail.setLedgerTypeCode("停车费");
                    }
                    //拖车费
                    else if((LfRecivDtl.TOWING_FEE).equals(detail.getLedgerTypeCode())){
                    	detail.setLedgerTypeCode("拖车费");
                    }
            	}
            }
        }catch(Exception e){
        	String msg = null;
        	if (e.getClass() != ErrorInfoException_Exception.class) {
        		Throwable throwable = e;
        		while ((throwable = throwable.getCause()) != null) {
        			if (throwable.getClass() != ErrorInfoException_Exception.class) 
        			{ 
        				continue; 
        			}
        			msg = throwable.getLocalizedMessage();
        		}
        	} else {
        		msg = e.getLocalizedMessage();
        	}
        	if (msg != null && "MFBMS_LAP_00028".equals(msg)){
        		return new JSONResult("所选择的客户在系统中存在多笔贷款信息，请输入合同号重新查询");
        	}else{
        		e.printStackTrace();
        	}
        	
        }
        return new JSONResult(result);
    }
    /**
     * 字符串转日期类型参数
     * */
    @InitBinder
    public void initBinder(WebDataBinder webDataBinder) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        dateFormat.setLenient(false);
        webDataBinder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, true));
    }

}
