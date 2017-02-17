package com.ljwd.plms.web.controller.case_collection;

import com.ljwd.plms.core.entity.JSONResult;
import com.ljwd.plms.web.enums.TransferStatusType;
import com.ljwd.plms.web.model.case_management.PlmsLTransferAdvance;
import com.ljwd.plms.web.model.case_management.PlmsLaCollectAlloc;
import com.ljwd.plms.web.model.case_management.PlmsLaCollectAllocExample;
import com.ljwd.plms.web.model.case_management.PlmsWorkOrderPool;
import com.ljwd.plms.web.security.PermissionSign;
import com.ljwd.plms.web.security.SubjectUtil;
import com.ljwd.plms.web.service.case_management.inf.PlmsLTransferAdvanceService;
import com.ljwd.plms.web.service.case_management.inf.PlmsLaCollectAllocService;
import com.ljwd.plms.web.service.case_management.inf.PlmsWorkOrderPoolLogService;
import com.ljwd.plms.web.service.case_management.inf.PlmsWorkOrderPoolService;
import com.ljwd.plms.web.service.outsource.inf.PlmsLaApplOutsrcService;
import com.ljwd.plms.web.service.workorder_pool.inf.PlmsCollectionRuleSetService;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

import java.util.List;

/**
 * 案件催收-发起提前移交控制器
 */
@Controller
@RequestMapping(value="/caseCollection")
public class TransferAdvanceController {

    @Resource
    private PlmsWorkOrderPoolService poolService;
    @Resource
    private PlmsWorkOrderPoolLogService poolLogService;
    @Resource
    private PlmsLTransferAdvanceService transferAdvanceService;
    @Resource
    private PlmsLaCollectAllocService plmsLaCollectAllocService;
    @Resource
    private PlmsCollectionRuleSetService plmsCollectionRuleSetService;
    @Resource
    private PlmsLaApplOutsrcService outsrcService;

    /**
     * 发起提前移交
     * */
    @RequestMapping(value = "/initiateTransferAdvance",method = RequestMethod.POST)
    @ResponseBody
    @RequiresPermissions(PermissionSign.COLLECT_REC_TRANSFER)
    public JSONResult initiateTransferAdvance(PlmsLTransferAdvance transferAdvance){
        if(transferAdvance == null || transferAdvance.getApplId() == null){
            return new JSONResult(false,"发起提前移交-参数异常");
        }

        Long applId = transferAdvance.getApplId();

        //查找案件
        PlmsWorkOrderPool workOrderPool = poolService.selectByApplId(applId);
        if(workOrderPool == null){
            return new JSONResult(false,"案件不存在");
        }

        //客服和作业的状态值status
        String custStatus = plmsCollectionRuleSetService.selectStatusByCircuCode("CUSTS");
        String operdStatus = plmsCollectionRuleSetService.selectStatusByCircuCode("OPERD");
        if(!(workOrderPool.getStatus().equals(custStatus)||workOrderPool.getStatus().equals(operdStatus))){
            return new JSONResult(false,"只有客服或作业区间的案件才能申请提前移交");
        }
        
        //根据借款ID判断是否在提前移交流程
        boolean checkResult = transferAdvanceService.selectCheckIsAdvance(applId);
        if(checkResult){
            return new JSONResult(false,"案件已申请提前移交");
        }

        //判断是否在委外流程
        checkResult = outsrcService.selectCheckIsOut(applId);
        if(checkResult){
            return new JSONResult(false,"案件已在委外流程，不能申请提前移交");
        }

        //豁免要实时判断，要去查找微贷的状态
        checkResult = poolLogService.selectCheckIsWaive(applId);
		if(checkResult){
            return new JSONResult(false,"案件已提交豁免申请，不能申请提前移交");
        }

        //根据借款ID, 判断最新的日志
        int logResult = poolLogService.selectCheckMaxLog(applId);
        switch (logResult){
            case 1:
                return new JSONResult(false,"当前案件已申请保留");
            case 2:
                return new JSONResult(false,"当前案件在豁免中");
            case 4:
                return new JSONResult(false,"当前案件在离职保护中");
            case 5:
                return new JSONResult(false,"当前案件已申请委外保留");
        }

        //登录用户
        String loginUser = SubjectUtil.getUserId();
        transferAdvance.setStatus(TransferStatusType.NOT_AUDITED.name());
        transferAdvance.setCircustatus(workOrderPool.getStatus());
        transferAdvance.setApplicant(loginUser);
        transferAdvance.setCreatedBy(loginUser);
        transferAdvance.setUpdatedBy(loginUser);

        //查找此案件的原催收员
        PlmsLaCollectAllocExample example = new PlmsLaCollectAllocExample();
        example.createCriteria().andApplIdEqualTo(applId).andIsActiveEqualTo("Y").andAllocEndDateIsNull();
        List<PlmsLaCollectAlloc> allocList = plmsLaCollectAllocService.selectByExample(example);
        if(allocList.size() > 0){
            String collector = allocList.get(0).getCollector();
            transferAdvance.setCollector(collector);
        }else{
            return new JSONResult(false,"当前案件没有催收员");
        }

        transferAdvanceService.insert(transferAdvance);

        return new JSONResult(true,"操作成功");
    }

}
