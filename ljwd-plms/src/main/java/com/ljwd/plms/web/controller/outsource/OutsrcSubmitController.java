package com.ljwd.plms.web.controller.outsource;

import com.ljwd.plms.core.entity.JSONResult;
import com.ljwd.plms.web.constants.LoanStatus;
import com.ljwd.plms.web.model.outsource.PlmsLaApplOutsrc;
import com.ljwd.plms.web.security.PermissionSign;
import com.ljwd.plms.web.security.SubjectUtil;
import com.ljwd.plms.web.service.outsource.inf.PlmsLaApplOutsrcService;
import com.ljwd.plms.web.vo.SessionMsg;
import com.ljwd.plms.web.vo.outsource.*;
import com.ljwd.plms.web.wsdl.webservice.LoanServiceWSDL;
import com.ljwd.plms.web.wsdl.webservice.service.*;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.math.BigDecimal;
import java.util.*;

/**
 * Created by zhengzw
 * 委外申请控制器-提交
 */
@Controller
@RequestMapping(value = "/outsrcAppl")
public class OutsrcSubmitController {
    @Resource
    private PlmsLaApplOutsrcService outsrcService;

    /**
     * 委外申请-提交
     * @param idsArr 选中的委外申请IDS
     * @param request request
     */
    @RequestMapping("/submit")
    @ResponseBody
    @RequiresPermissions(PermissionSign.OUT_SRC_SUBMIT)
    public JSONResult submit(Long[] idsArr,HttpServletRequest request) {
        //选中的委外申请IDS
        if(idsArr == null || idsArr.length == 0){
            return new JSONResult(false,"请选择需提交的案件");
        }
        //选中的委外申请IDS
        List<Long> ids = new ArrayList<>();
        Collections.addAll(ids,idsArr);

        //根据委外申请IDS查找
        OutsrcExample example = new OutsrcExample().setIds(ids);
        example.setOrderByClause("SITE.AREA_ID DESC,OUTSRC.ID DESC");
        List<OutsrcDto> outsrcList = outsrcService.selectOutsrcByExample(example);
        if(outsrcList != null && outsrcList.size() > 0){
            //校验
            String checkResult = this.checkSubmit(outsrcList);
            if(checkResult != null){
                return new JSONResult(false,checkResult);
            }

            //session
            SessionMsg session = SubjectUtil.getSession(request);

            //微贷计算应收金额参数
            CalculateSummaryReceivableParamDto param = new CalculateSummaryReceivableParamDto();
            param.setIsInAdvanceRepayment(Boolean.TRUE);        //是以提前结清方式计算
            param.setIsRenewLoanRepayment(Boolean.FALSE);
            param.setRenewLoanPenaltyRate(null);

            //应收金额计算结果
            SimulateCalculateSummaryReceivableResultDto result = null;
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
                    result = LoanServiceWSDL.getService().calculateSummaryReceivable(param);
                } catch (Exception e) {
                    e.printStackTrace();
                    return new JSONResult(false,"计算委外金额出错");
                }
                if(result == null || result.getReceivableSumaryAmount() == null){
                    return new JSONResult(false,"计算委外金额出错");
                }

                //计算的应收金额
                BigDecimal recivAmt = result.getReceivableSumaryAmount();
                dto.setRecivAmt(recivAmt);
            }
            //保存提交
            outsrcService.saveSubmit(outsrcList, session);
        }else {
            return new JSONResult(false,"未找到委外申请");
        }

        return new JSONResult(true,"提交成功");
    }

    /**
     * 提交时校验
     * @param outsrcList 委外信息
     * @return 校验结果:null时通过
     */
    private String checkSubmit(List<OutsrcDto> outsrcList){
        StringBuffer sb = new StringBuffer("此些委外申请不是待提交状态.合同号：");
        boolean flag = false;
        for(OutsrcDto dto : outsrcList){
            //不是待提交状态
            if(!PlmsLaApplOutsrc.STATUS_DRAFT.equals(dto.getStatus())){
                sb.append("," + dto.getCntrctNo());
                flag = true;
            }
        }
        if(flag){
            return sb.toString().replaceFirst(",","");
        }

        sb = new StringBuffer("不是还款中的合同不能提交委外.合同号：");
        for(OutsrcDto dto : outsrcList){
            //不是还款中状态
            if(!LoanStatus.REPAYING.equals(dto.getWinfoStatus())){
                sb.append("," + dto.getCntrctNo());
                flag = true;
            }
        }
        if(flag){
            return sb.toString().replaceFirst(",","");
        }

        return null;
    }

//    /**
//     * 字符串转日期类型参数
//     * */
//    @InitBinder
//    public void initBinder(WebDataBinder webDataBinder) {
//        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
//        dateFormat.setLenient(false);
//        webDataBinder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, true));
//    }

}
