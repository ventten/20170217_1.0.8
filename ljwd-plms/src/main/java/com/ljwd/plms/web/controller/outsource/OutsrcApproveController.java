package com.ljwd.plms.web.controller.outsource;

import com.ljwd.plms.core.entity.JSONResult;
import com.ljwd.plms.web.constants.LoanStatus;
import com.ljwd.plms.web.model.case_management.PlmsEmpCollectSet;
import com.ljwd.plms.web.model.outsource.PlmsLaApplOutsrc;
import com.ljwd.plms.web.security.PermissionSign;
import com.ljwd.plms.web.security.SubjectUtil;
import com.ljwd.plms.web.service.case_management.inf.PlmsEmpCollectSetService;
import com.ljwd.plms.web.service.outsource.inf.PlmsLaApplOutsrcService;
import com.ljwd.plms.web.vo.SessionMsg;
import com.ljwd.plms.web.vo.outsource.OutsrcDto;
import com.ljwd.plms.web.vo.outsource.OutsrcExample;
import com.ljwd.plms.web.wsdl.webservice.LoanServiceWSDL;
import com.ljwd.plms.web.wsdl.webservice.service.CalculateSummaryReceivableParamDto;
import com.ljwd.plms.web.wsdl.webservice.service.SimulateCalculateSummaryReceivableResultDto;
import org.apache.shiro.authz.annotation.Logical;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

/**
 * Created by zhengzw
 * 委外申请控制器-审批
 */
@Controller
@RequestMapping(value = "/outsrcAppl")
public class OutsrcApproveController {
    @Resource
    private PlmsLaApplOutsrcService outsrcService;
    @Resource
    private PlmsEmpCollectSetService empCollectSetService;

    /**
     * 委外申请-审批
     * @param idsArr 选中的委外申请IDS
     * @param result 审批结果:1-审批通过,2-审批拒绝
     * @param request request
     */
    @RequestMapping("/approve")
    @ResponseBody
    @RequiresPermissions(value = {PermissionSign.OUT_SRC_APPROVE_PASS, PermissionSign.OUT_SRC_APPROVE_REJECT}, logical = Logical.OR)
    public JSONResult approve(Long[] idsArr,int result,HttpServletRequest request) {
        //选中的委外申请IDS
        if(idsArr == null || idsArr.length == 0){
            return new JSONResult(false,"请选择需审批的案件");
        }
        if(result != 1 && result != 2){
            return new JSONResult(false,"委外审批-未知的审批结果");
        }
        //选中的委外申请IDS
        List<Long> ids = new ArrayList<>();
        Collections.addAll(ids,idsArr);

        //根据委外申请IDS查找
        OutsrcExample example = new OutsrcExample().setIds(ids);
        List<OutsrcDto> outsrcList = outsrcService.selectOutsrcByExample(example);
        if(outsrcList != null && outsrcList.size() > 0){
            //校验
            String checkResult = this.checkApprove(outsrcList,result);
            if(checkResult != null){
                return new JSONResult(false,checkResult);
            }

            //session
            SessionMsg session = SubjectUtil.getSession(request);
            //委外区间的催收员
            PlmsEmpCollectSet empCollect = null;

            //如果审批通过,计算委外金额
            if(result == 1){
                //查找委外区间的催收员
                List<PlmsEmpCollectSet> empCollectList = empCollectSetService.selectCollectorByCircuRuleCode("OUTSOURC");
                if(empCollectList == null || empCollectList.isEmpty()) return new JSONResult(false,"请先配置可分配的催收员");
                empCollect = empCollectList.get(0);

                //微贷计算应收金额参数
                CalculateSummaryReceivableParamDto param = new CalculateSummaryReceivableParamDto();
                param.setIsInAdvanceRepayment(Boolean.TRUE);        //是以提前结清方式计算
                param.setIsRenewLoanRepayment(Boolean.FALSE);
                param.setRenewLoanPenaltyRate(null);

                //应收金额计算结果
                SimulateCalculateSummaryReceivableResultDto receivableResult = null;
                for(OutsrcDto dto : outsrcList){
                    //委外日期
                    Date startDate = dto.getStartDate();
                    Date today = new Date();
                    if (startDate == null || startDate.before(today)) {
                        startDate = today;
                        dto.setStartDate(startDate);
                    }
                    param.setContractNo(dto.getCntrctNo());
                    param.setRepaymentDate(startDate);
                    param.setIdCardNo(dto.getIdCardNo());
                    try {
                        receivableResult = LoanServiceWSDL.getService().calculateSummaryReceivable(param);
                    } catch (Exception e) {
                        e.printStackTrace();
                        return new JSONResult(false,"计算委外金额出错");
                    }
                    if(receivableResult == null || receivableResult.getReceivableSumaryAmount() == null){
                        return new JSONResult(false,"计算委外金额出错");
                    }

                    //计算的应收金额
                    BigDecimal recivAmt = receivableResult.getReceivableSumaryAmount();
                    dto.setRecivAmt(recivAmt);
                }
            }
            //保存审批结果
            outsrcService.saveApprove(result,outsrcList,session,empCollect);
        }else {
            return new JSONResult(false,"未找到委外申请");
        }

        return new JSONResult(true,"审批成功");
    }

    /**
     * 审批时校验数据
     * @param outsrcList 委外数据
     * @param result 审批结果:1-审批通过,2-审批拒绝
     * @return 校验结果:null时通过
     */
    private String checkApprove(List<OutsrcDto> outsrcList,int result){
        StringBuffer sb = new StringBuffer("只有[待审批]状态才能执行此操作.合同号：");
        boolean flag = false;
        for(OutsrcDto dto : outsrcList){
            //不是待审批状态
            if(!PlmsLaApplOutsrc.STATUS_SUBMITTED.equals(dto.getStatus())){
                sb.append("," + dto.getCntrctNo());
                flag = true;
            }
        }
        if(flag){
            return sb.toString().replaceFirst(",","");
        }

        //如果审批通过,校验是否还款中状态、是否有委外机构
        if(result == 1){
            sb = new StringBuffer("只有[还款中]的合同才能执行此操作.合同号：");
            for(OutsrcDto dto : outsrcList){
                //审批通过且不是还款中状态
                if(!LoanStatus.REPAYING.equals(dto.getWinfoStatus())){
                    sb.append("," + dto.getCntrctNo());
                    flag = true;
                }
            }
            if(flag){
                return sb.toString().replaceFirst(",","");
            }

            sb = new StringBuffer("请先分配外包公司.合同号：");
            for(OutsrcDto dto : outsrcList){
                //若没有外包公司
                if(dto.getComId() == null){
                    sb.append("," + dto.getCntrctNo());
                    flag = true;
                }
            }
            if(flag){
                return sb.toString().replaceFirst(",","");
            }

            sb = new StringBuffer("外包公司已停用.合同号：");
            for(OutsrcDto dto : outsrcList){
                //若外包公司无效
                if(!"Y".equals(dto.getComIsActive())){
                    sb.append("," + dto.getCntrctNo());
                    flag = true;
                }
            }
            if(flag){
                return sb.toString().replaceFirst(",","");
            }
        }

        return null;
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
