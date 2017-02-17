package com.ljwd.plms.web.controller.case_collection;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.*;

import javax.annotation.Resource;

import com.ljwd.plms.web.service.case_collection.inf.LnCntrctService;
import com.ljwd.plms.web.service.sys_management.inf.SystemService;
import com.ljwd.plms.web.vo.case_collection.CntrctAllocDto;
import com.ljwd.plms.web.vo.case_management.PlmsFeeWaiveApprovalResultDto;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ljwd.plms.core.entity.JSONResult;
import com.ljwd.plms.core.util.D;
import com.ljwd.plms.web.model.case_management.PlmsLaCollectAlloc;
import com.ljwd.plms.web.model.case_management.PlmsWorkOrderPool;
import com.ljwd.plms.web.model.case_management.PlmsWorkOrderPoolLog;
import com.ljwd.plms.web.model.outsource.PlmsLaApplOutsrc;
import com.ljwd.plms.web.model.outsource.PlmsLaApplOutsrcExample;
import com.ljwd.plms.web.security.PermissionSign;
import com.ljwd.plms.web.security.SubjectUtil;
import com.ljwd.plms.web.service.case_collection.inf.LnRpmntPlanService;
import com.ljwd.plms.web.service.case_collection.inf.PlmsLaCollectionRecordService;
import com.ljwd.plms.web.service.case_management.inf.PlmsLTransferAdvanceService;
import com.ljwd.plms.web.service.case_management.inf.PlmsLaCollectAllocService;
import com.ljwd.plms.web.service.case_management.inf.PlmsWorkOrderPoolLogService;
import com.ljwd.plms.web.service.case_management.inf.PlmsWorkOrderPoolService;
import com.ljwd.plms.web.service.outsource.inf.PlmsLaApplOutsrcService;
import com.ljwd.plms.web.service.workorder_pool.inf.PlmsCollectionRuleSetService;

/**
 * 案件催收-工单池日志-保留控制器
 */
@Controller
@RequestMapping(value="/caseCollection")
public class WorkOrderPoolLogController {

    @Resource
    private SystemService systemService;
    @Resource
    private PlmsWorkOrderPoolService poolService;
    @Resource
    private LnRpmntPlanService lnRpmntPlanService;
    @Resource
    private PlmsWorkOrderPoolLogService poolLogService;
    @Resource
    private PlmsLTransferAdvanceService transferAdvanceService;
    @Resource
    private PlmsLaCollectAllocService plmsLaCollectAllocService;
    @Resource
    private PlmsCollectionRuleSetService plmsCollectionRuleSetService;
    @Resource
    private PlmsLaCollectionRecordService plmsLaCollectionRecordService;
    @Resource
    private PlmsLaApplOutsrcService outsrcService;
    @Resource
    private LnCntrctService lnCntrctService;

    /**
     * 发起保留
     * @param workOrderPoolLog 工单日志
     * */
    @RequestMapping(value = "/saveKeep",method = RequestMethod.POST)
    @ResponseBody
    @RequiresPermissions(PermissionSign.COLLECT_REC_KEEP)
    public JSONResult saveKeep(PlmsWorkOrderPoolLog workOrderPoolLog){
        if(workOrderPoolLog == null || workOrderPoolLog.getApplId() == null){
            return new JSONResult(false,"发起保留-参数异常");
        }
        if(workOrderPoolLog.getProtectEndDate() == null){
            return new JSONResult(false,"请选择保留截止日期");
        }

        Long applId = workOrderPoolLog.getApplId();

        PlmsWorkOrderPool pool = poolService.selectByApplId(applId);
        if(pool == null){
            return new JSONResult(false,"案件不存在");
        }

        //保留截止日期
        Date nextWorkDay = null;
        //如果产品是月光神器或医美分期
        if("ML".equals(pool.getPrdNo()) || "YM".equals(pool.getPrdNo())){
            //查找合同信息
            CntrctAllocDto dto = lnCntrctService.selectCntrctAllocByCntrctNo(pool.getCntrctNo());
            if(dto == null){
                return new JSONResult(false,"系统错误，未找到合同信息");
            }
            nextWorkDay = systemService.getKeepDay(pool.getPrdNo(),dto.getOverDays());
            if(D.trunc(workOrderPoolLog.getProtectEndDate()).getTime() > nextWorkDay.getTime()){
                return new JSONResult(false,"保留日期不可超过案件逾期第16天当天");
            }
        }else {
            //查找下一个工作日
            nextWorkDay = systemService.selectNextWorkDay();
            if(D.trunc(workOrderPoolLog.getProtectEndDate()).getTime() > nextWorkDay.getTime()){
                return new JSONResult(false,"保留日期不可超过下一个工作日");
            }
        }

        //委外区间的案件不能申请保留
        String outSourStatus = plmsCollectionRuleSetService.selectStatusByCircuCode("OUTSOURC");
        if(pool.getStatus().equals(outSourStatus)){
            return new JSONResult(false,"当前案件已在委外区间");
        }

        //判断是否在委外流程
        boolean checkResult = outsrcService.selectCheckIsOut(applId);
        if(checkResult){
            return new JSONResult(false,"案件已在委外流程，不能申请保留");
        }

        //根据借款ID判断是否在提前移交流程
        checkResult = transferAdvanceService.selectCheckIsAdvance(applId);
        if(checkResult){
            return new JSONResult(false,"案件已申请提前移交");
        }

        //豁免要实时判断，要去查找微贷的状态
        checkResult = poolLogService.selectCheckIsWaive(applId);
        if(checkResult){
            return new JSONResult(false,"案件已提交豁免申请，不能申请保留");
        }

        //根据借款ID, 判断最新的日志
        int logResult = poolLogService.selectCheckMaxLog(applId);
        switch (logResult){
            case 1:
                return new JSONResult(false,"当前案件已申请保留");
            case 2:
                return new JSONResult(false,"当前案件在豁免保护中");
            case 4:
                return new JSONResult(false,"当前案件在离职保护中");
            case 5:
                return new JSONResult(false,"当前案件已申请委外保留");
        }

        //登录用户
        String loginUser = SubjectUtil.getUserId();

        workOrderPoolLog.setStatus(pool.getStatus());
        workOrderPoolLog.setDefendStatus(PlmsWorkOrderPoolLog.DEFEND_KEEP); //保留
        workOrderPoolLog.setCreatedBy(loginUser);
        workOrderPoolLog.setUpdatedBy(loginUser);

        poolLogService.insert(workOrderPoolLog);

        return new JSONResult(true,"申请保留成功");
    }

    /**
     * 发起委外保留
     * @param workOrderPoolLog 工单日志
     * */
    @RequestMapping(value = "/outsrcKeep",method = RequestMethod.POST)
    @ResponseBody
    @RequiresPermissions(PermissionSign.COLLECT_REC_OUTSRC_KEEP)
    public JSONResult outsrcKeep(PlmsWorkOrderPoolLog workOrderPoolLog){
        if(workOrderPoolLog == null || workOrderPoolLog.getApplId() == null){
            return new JSONResult(false,"发起委外保留-参数异常");
        }

        Long applId = workOrderPoolLog.getApplId();

        PlmsWorkOrderPool workOrderPool = poolService.selectByApplId(applId);
        if(workOrderPool == null){
            return new JSONResult(false,"案件不存在");
        }
        if(!"M2".equals(workOrderPool.getCircuRuleCode())){
            return new JSONResult(false,"只有在M2区间的案件才可以申请委外保留");
        }

        //判断是否在委外流程
        boolean checkResult = outsrcService.selectCheckIsOut(applId);
        if(checkResult){
            return new JSONResult(false,"案件已在委外流程，不能申请委外保留");
        }

        //根据借款ID判断是否在提前移交流程
        checkResult = transferAdvanceService.selectCheckIsAdvance(applId);
        if(checkResult){
            return new JSONResult(false,"案件已申请提前移交");
        }

        //豁免要实时判断，要去查找微贷的状态
        checkResult = poolLogService.selectCheckIsWaive(applId);
        if(checkResult){
            return new JSONResult(false,"案件已提交豁免申请，不能申请委外保留");
        }

        //根据借款ID, 判断最新的日志
        int logResult = poolLogService.selectCheckMaxLog(applId);
        switch (logResult){
            case 1:
                return new JSONResult(false,"案件已申请保留,不能申请委外保留");
            case 2:
                return new JSONResult(false,"案件在豁免保护中");
            case 4:
                return new JSONResult(false,"案件在离职保护中");
            case 5:
                return new JSONResult(false,"案件已申请委外保留");
        }

        //查找当前案件的催收员
        PlmsLaCollectAlloc alloc = plmsLaCollectAllocService.selectMaxAllocByApplId(applId);
        if(alloc == null){
            return new JSONResult(false,"未能找到当前案件的催收员");
        }

        //催收员催收期间成功入账的金额
        BigDecimal reportAmt = plmsLaCollectionRecordService.selectReportAmtByApplIdAndTime(applId,alloc.getAllocBeginDate());
        if(reportAmt.compareTo(BigDecimal.ZERO) > 0){
            //后每期期款
            BigDecimal secondAmt = lnRpmntPlanService.selectSecondAmtByApplId(applId);
            //还款金额小于期款的一半
            if(reportAmt.compareTo(secondAmt.divide(BigDecimal.valueOf(2))) < 0){
                return new JSONResult(false,"催收期间还款金额小于期款的一半,不能申请委外保留");
            }
        }else {
            return new JSONResult(false,"催收期间未有还款,不能申请委外保留");
        }

        //登录用户
        String loginUser = SubjectUtil.getUserId();

        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.DAY_OF_YEAR,7);
        workOrderPoolLog.setProtectEndDate(calendar.getTime());                     //保留截止日期
        workOrderPoolLog.setStatus(workOrderPool.getStatus());
        workOrderPoolLog.setDefendStatus(PlmsWorkOrderPoolLog.DEFEND_OUTSRC_KEEP);  //委外保留
        workOrderPoolLog.setCreatedBy(loginUser);
        workOrderPoolLog.setUpdatedBy(loginUser);

        poolLogService.insert(workOrderPoolLog);

        return new JSONResult(true,"申请委外保留成功");
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