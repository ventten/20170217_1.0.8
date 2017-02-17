package com.ljwd.plms.web.controller.outVisit;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ljwd.plms.core.entity.JSONResult;
import com.ljwd.plms.web.model.case_management.PlmsWorkOrderPool;
import com.ljwd.plms.web.model.case_management.PlmsWorkOrderPoolExample;
import com.ljwd.plms.web.model.outVisit.PlmsOvmOutVisitInfo;
import com.ljwd.plms.web.model.outVisit.PlmsOvmOutVisitInfoExample;
import com.ljwd.plms.web.model.outVisit.PlmsOvmOutVisitUser;
import com.ljwd.plms.web.model.outsource.PlmsLaApplOutsrc;
import com.ljwd.plms.web.model.outsource.PlmsLaApplOutsrcExample;
import com.ljwd.plms.web.security.PermissionSign;
import com.ljwd.plms.web.security.SubjectUtil;
import com.ljwd.plms.web.service.case_management.inf.PlmsLTransferAdvanceService;
import com.ljwd.plms.web.service.case_management.inf.PlmsWorkOrderPoolLogService;
import com.ljwd.plms.web.service.case_management.inf.PlmsWorkOrderPoolService;
import com.ljwd.plms.web.service.outVisit.inf.PlmsOvmOutVisitInfoService;
import com.ljwd.plms.web.service.outVisit.inf.PlmsOvmOutVisitUserService;
import com.ljwd.plms.web.service.outsource.inf.PlmsLaApplOutsrcService;
import com.ljwd.plms.web.service.workorder_pool.inf.PlmsCollectionRuleSetService;
import com.ljwd.plms.web.vo.SessionMsg;

@RequestMapping("outVisit")
@Component
public class OutVisitInfoController {
	
	@Resource
	private PlmsOvmOutVisitInfoService plmsOvmOutVisitInfoService;
	@Resource
	private PlmsOvmOutVisitUserService plmsOvmOutVisitUserService;
	@Resource
    private PlmsLTransferAdvanceService transferAdvanceService;
    @Resource
	private PlmsWorkOrderPoolLogService poolLogService;
    @Resource
    private PlmsWorkOrderPoolService poolService;
    @Resource
    private PlmsLaApplOutsrcService outsrcService;
    @Resource
    private PlmsCollectionRuleSetService plmsCollectionRuleSetService;

	/**
	* @Description: 提交外访申请
	* @param outVisitInfo
	* @return String
	 */
	@RequestMapping("/submitOutVisit")
	@ResponseBody
    @RequiresPermissions(PermissionSign.CASE_MY_OUT_VISIT_ADD)
	public JSONResult addOutVisitInfo(PlmsOvmOutVisitInfoExample outVisitInfo,HttpServletRequest request){
		//Long [] applIds = outVisitInfo.getCheckedCase();
		Long applId = outVisitInfo.getApplId();
		SessionMsg loginUser = SubjectUtil.getSession(request);
		if(loginUser==null){
			return new JSONResult(false,"登录信息已过期，请重新登录!");
		}
		if(outVisitInfo.getCustType()==null){
			return new JSONResult(false,"请选择要申请外访的客户类型");
		}
		if(outVisitInfo.getSubmitReason()==null){
			return new JSONResult(false,"请填写申请外访的原因");
		}
		if(applId==null){
			return new JSONResult(false,"请选择要申请外访的案件");
		}else{
			Map<String,Object> map = new HashMap<String,Object>();
			map.put("applId", applId);
			//判断是否已在外访流程中
			List<PlmsOvmOutVisitInfo>   exitList = plmsOvmOutVisitInfoService.checkIfExistOutVisitInfo(map);
			if(exitList.size()>0){
				PlmsOvmOutVisitInfo dto = exitList.get(0);
				return new JSONResult(false,"已存在已提交/已审核/已分配/已委外的外访记录，不能再提交");
			}

			//案件所属区域内无外访人员时，不可提交外访申请
			List<PlmsOvmOutVisitUser> outUserList = plmsOvmOutVisitUserService.searchOutVisitUserListByApplId(applId);
			if(outUserList.size()==0){
				//String cntrctNo = plmsOvmOutVisitUserService.searchCntrctNoByapplId(applId);
				return new JSONResult(false,"此案件所属区域没有外访人员，不能提交外访申请");
			}

			//判断是否在委外流程中
			List<String> statusS = new ArrayList<String>();
			statusS.add(PlmsLaApplOutsrc.STATUS_AUDIT);         //状态:待审核
			statusS.add(PlmsLaApplOutsrc.STATUS_DRAFT);         //状态:待提交
			statusS.add(PlmsLaApplOutsrc.STATUS_SUBMITTED);     //状态:待审批(已提交)
			statusS.add(PlmsLaApplOutsrc.STATUS_APPROVED);      //状态:已审批
			PlmsLaApplOutsrcExample example = new PlmsLaApplOutsrcExample();
			example.setStatusS(statusS).setApplIds(Arrays.asList(applId));
			int count = outsrcService.countByExample(example);
			if(count > 0){
				return new JSONResult(false,"所选案件已在委外流程中，不能提交外访申请");
			}

			//委外区间的案件不能申请外访
			String outSourStatus = plmsCollectionRuleSetService.selectStatusByCircuCode("OUTSOURC");
			PlmsWorkOrderPoolExample exam = new PlmsWorkOrderPoolExample();
			exam.createCriteria().andApplIdEqualTo(applId).andStatusEqualTo(outSourStatus);
			List<PlmsWorkOrderPool> workOrderPoolList = poolService.selectByExampleList(exam);
			if(workOrderPoolList!=null&&workOrderPoolList.size()>0){
				return new JSONResult(false,"所选案件已在委外区间中，不能提交外访申请");
			}

			/*
			//根据借款ID判断是否在提前移交流程
			boolean checkResult = transferAdvanceService.selectCheckIsAdvance(applId);
			if(checkResult){
				return new JSONResult(false,"当前案件已申请提前移交");
			}

			//豁免要实时判断，要去查找微贷的状态
			checkResult = poolLogService.selectCheckIsWaive(applId);
			if(checkResult){
				return new JSONResult(false,"案件已提交豁免申请，不能提交外访申请");
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
			*/

			//提交外访申请
			plmsOvmOutVisitInfoService.addOutVisitInfo(outVisitInfo,loginUser);
			return new JSONResult(true,"外访申请成功");
		}
	}

}
