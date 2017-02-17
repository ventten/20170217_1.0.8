package com.ljwd.plms.web.service.job.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.ljwd.plms.web.dao.outVisit.PlmsOvmOutDelayDtlMapper;
import com.ljwd.plms.web.model.outVisit.PlmsOvmOutDelay;
import com.ljwd.plms.web.model.outVisit.PlmsOvmOutDelayDtl;
import com.ljwd.plms.web.model.outVisit.PlmsOvmOutDelayDtlExample;
import com.ljwd.plms.web.model.outVisit.PlmsOvmOutDelayExample;
import com.ljwd.plms.web.model.outVisit.PlmsOvmOutVisitInfo;
import com.ljwd.plms.web.model.outVisit.PlmsOvmOutVisitLog;
import com.ljwd.plms.web.model.outVisit.PlmsOvmOutVisitPlan;
import com.ljwd.plms.web.model.outVisit.PlmsOvmOutVisitUser;
import com.ljwd.plms.web.model.outVisit.PlmsOvmOutVisitUserExample;
import com.ljwd.plms.web.service.case_management.inf.PlmsWorkOrderPoolService;
import com.ljwd.plms.web.service.job.inf.PlmsOutVisitOverduedService;
import com.ljwd.plms.web.service.outVisit.inf.PlmsOvmOutDelayDtlService;
import com.ljwd.plms.web.service.outVisit.inf.PlmsOvmOutDelayService;
import com.ljwd.plms.web.service.outVisit.inf.PlmsOvmOutVisitInfoService;
import com.ljwd.plms.web.service.outVisit.inf.PlmsOvmOutVisitLogService;
import com.ljwd.plms.web.service.outVisit.inf.PlmsOvmOutVisitPlanService;
import com.ljwd.plms.web.service.outVisit.inf.PlmsOvmOutVisitUserService;
import com.ljwd.plms.web.service.workorder_pool.inf.PlmsCollectionRuleSetService;
import com.ljwd.plms.web.vo.outVisit.OutVisitPlanStatusType;
import com.ljwd.plms.web.vo.outVisit.OutVisitStatusType;
/**外访过期处理
 * 要在系统流转之后才能执行
 * <p>Title: PlmsOutVisitOverduedServiceImpl</p>
 * @author pangshanxing
 * @date 2016年11月9日下午2:08:15
 */
@Service
public class PlmsOutVisitOverduedServiceImpl implements
		PlmsOutVisitOverduedService {
	@Resource
	private PlmsOvmOutVisitInfoService plmsOvmOutVisitInfoService;
	@Resource
	private PlmsWorkOrderPoolService plmsWorkOrderPoolService;
	@Resource
	private PlmsCollectionRuleSetService plmsCollectionRuleSetService;
	@Resource
	private PlmsOvmOutVisitPlanService plmsOvmOutVisitPlanService;
	@Resource
	private PlmsOvmOutVisitUserService plmsOvmOutVisitUserService;
	@Resource
	private PlmsOvmOutVisitLogService plmsOvmOutVisitLogService;
	@Resource
	private PlmsOvmOutDelayService plmsOvmOutDelayService;
	@Resource
	private PlmsOvmOutDelayDtlService plmsOvmOutDelayDtlService;

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    /**
     * 当前案件进入委外区间时，此外访状态为已委外
	 * 当前日期大于外访预计结案日期时，此外访状态为已过期
	* @return void
	 */
	@Override
	public void updateOutVisitStatus() {
		
		//委外区间的状态值status
		String outSourStatus = plmsCollectionRuleSetService.selectStatusByCircuCode("OUTSOURC");
		logger.info("-----判断外访案件是否进入委外区间开始-----");
		/**
		 * 1，判断案件是否已经进入委屈区间
		 */
		Map<String,Object> map = new HashMap<String,Object>();
		List<String> outSrcParam1 = new ArrayList<String>();
		outSrcParam1.add(OutVisitStatusType.Submitted);
		outSrcParam1.add(OutVisitStatusType.Audited);
		outSrcParam1.add(OutVisitStatusType.Assigned);
		outSrcParam1.add(OutVisitStatusType.Planing);
		outSrcParam1.add(OutVisitStatusType.Visited);
		outSrcParam1.add(OutVisitStatusType.NoVisit);
		map.put("planStatus", outSrcParam1);
		map.put("poolStatus", outSourStatus);
		//查询在委外区间的外访信息:将外访状态置为已委外，外访计划置为已取消,外访人员当前案件数-1，当前在外访延期申请中的状态要直接拒绝
		List<PlmsOvmOutVisitInfo> outList1 = plmsOvmOutVisitInfoService.selectPlmsOutVisitList(map);
		if(outList1!=null&&outList1.size()>0){
			List<PlmsOvmOutVisitPlan> planListAll = new ArrayList<PlmsOvmOutVisitPlan>();
			List<PlmsOvmOutVisitUser> outUserList = new ArrayList<PlmsOvmOutVisitUser>();
			List<PlmsOvmOutVisitLog> outVisitLogList = new ArrayList<PlmsOvmOutVisitLog>();
			List<PlmsOvmOutDelayDtl>  delayAllList  = new ArrayList<PlmsOvmOutDelayDtl>();
			Map<String,PlmsOvmOutVisitUser> userMap = new HashMap<String,PlmsOvmOutVisitUser>();
			for(PlmsOvmOutVisitInfo outInfo:outList1){
				outInfo.setStatus(OutVisitStatusType.Outsourced);
				outInfo.setUpdatedBy("system");
				outInfo.setEndBy("system");
				outInfo.setEndDate(new Date());
				outInfo.setUpdateTime(new Date());
				Long infoId = outInfo.getId();
				//延期案件的状态要变更
				if(outInfo.getCaseType()!=null&&outInfo.getCaseType().equals("CASE_DELAYING")){	
					PlmsOvmOutDelayExample examp = new PlmsOvmOutDelayExample();
					examp.setInfoId(outInfo.getId());
					List<PlmsOvmOutDelay> delayList = plmsOvmOutDelayService.selectByExample(examp);
					//延期申请中的要将延期申请置直接拒绝 
					if(delayList!=null&&delayList.size()>0){
						PlmsOvmOutDelay delay = delayList.get(0);
						PlmsOvmOutDelayDtlExample examp2 = new PlmsOvmOutDelayDtlExample();
						examp2.setDelayId(delay.getId());
						examp2.setDelayAuditResult("NOT_APPROVED");
						List<PlmsOvmOutDelayDtl> delayDtlList = plmsOvmOutDelayService.selectDtlByExample(examp2);
						if(delayDtlList.size()>0){
							for(PlmsOvmOutDelayDtl dtl:delayDtlList){
								dtl.setDelayAuditResult("REJECT");
								dtl.setDelayAuditRefuse("案件已进入委外区间");
								dtl.setDelayAuditBy("system");
								dtl.setUpdatedBy("system");
								dtl.setDelayAuditTime(new Date());
								dtl.setUpdateTime(new Date());
								delayAllList.add(dtl);
							}
						}
					}
					
					
					if(delayList!=null&&delayList.size()>0){
						Long delayTimes = delayList.get(0).getDelayTimes();
						if(delayTimes!=null&&delayTimes.longValue()>0L){
							outInfo.setCaseType("CASE_DELAY");
						}else{
							outInfo.setCaseType("CASE_ADD");
						}
					}
				}
				//添加外访日志
				PlmsOvmOutVisitLog outVisitLog = new PlmsOvmOutVisitLog();
				outVisitLog = setOutLogModel(outInfo,outVisitLog);
				outVisitLogList.add(outVisitLog);
				//此外访案件对应的外访计划
				Map<String,Object> planMap = new HashMap<String,Object>();
				planMap.put("infoId", infoId);
				planMap.put("planStatus", "Start");
				List<PlmsOvmOutVisitPlan> planList = plmsOvmOutVisitPlanService.searchByMap(planMap);
				if(planList!=null&&planList.size()>0){
					for(PlmsOvmOutVisitPlan plan:planList){
						plan.setPlanStatus(OutVisitPlanStatusType.Cancel);
						plan.setVisitCancelResion("案件已进入委外区间");
						plan.setUpdatedBy("system");
						plan.setUpdateTime(new Date());
						planListAll.add(plan);
					}
				}
				//此外访案件对应的外访员
				String visitor = outInfo.getVisitBy();
				if(visitor!=null&&(!visitor.equals(""))){
					if(userMap.containsKey(visitor)){
						PlmsOvmOutVisitUser user = userMap.get(visitor);
						user.setCaseCount(user.getCaseCount()-1);
						user.setRemainderAmount(user.getRemainderAmount().subtract(outInfo.getRemainderPrincipal()));
						userMap.put(visitor, user);
					}else{
						PlmsOvmOutVisitUserExample examp = new PlmsOvmOutVisitUserExample();
						examp.setUserId(visitor);
						PlmsOvmOutVisitUser user = plmsOvmOutVisitUserService.selectByExample(examp).get(0);
						user.setCaseCount(user.getCaseCount()-1);
						user.setRemainderAmount(user.getRemainderAmount().subtract(outInfo.getRemainderPrincipal()));
						userMap.put(visitor, user);
					}
					
				}
			}
			//批量修改延期申请
			plmsOvmOutDelayDtlService.updateBatch(delayAllList);
			//修改外访信息
			plmsOvmOutVisitInfoService.updateBatch(outList1);
			
			//增加外访日志
			plmsOvmOutVisitLogService.insertBatch(outVisitLogList);
			
			//批量修改外访计划状态
			if(planListAll!=null&&planListAll.size()>0){
				plmsOvmOutVisitPlanService.updateBatch(planListAll);
			}
			if(userMap.size()>0){
				for(String key:userMap.keySet()){
					outUserList.add(userMap.get(key));
				}
				
				plmsOvmOutVisitUserService.updateBatch(outUserList);
			}
			
			logger.info("-----判断外访案件是否进入委外区间结束-----");
			int planSzie = planListAll==null?0:planListAll.size();
			logger.info("-----共有"+outList1.size()+"条外访案件进入委外区间，共有"+planSzie+"条外访计划被取消,共有"+delayAllList.size()+"条延期申请被拒绝-----");
		}else{
			logger.info("-----今日没有外访案件进入委外区间-----");
		}
			
		/**
		 * 2，判断案件是否已过期
		 */
		logger.info("-----判断外访案件是否过期开始-----");
		Map<String,Object> map2 = new HashMap<String,Object>();
		List<String> outSrcParam2 = new ArrayList<String>();
		outSrcParam2.add(OutVisitStatusType.Assigned);
		outSrcParam2.add(OutVisitStatusType.Planing);
		outSrcParam2.add(OutVisitStatusType.Visited);
		outSrcParam2.add(OutVisitStatusType.NoVisit);
		map2.put("planStatus", outSrcParam2);
		map2.put("overDue", true);
		List<PlmsOvmOutVisitInfo> outList2 = plmsOvmOutVisitInfoService.selectPlmsOutVisitList(map2);
		if(outList2!=null&&outList2.size()>0){
			List<PlmsOvmOutVisitUser> outUserList = new ArrayList<PlmsOvmOutVisitUser>();
			Map<String,PlmsOvmOutVisitUser> userMap = new HashMap<String,PlmsOvmOutVisitUser>();
			List<PlmsOvmOutVisitPlan> planListAll2 = new ArrayList<PlmsOvmOutVisitPlan>();
			List<PlmsOvmOutVisitLog> outVisitLogList2 = new ArrayList<PlmsOvmOutVisitLog>();
			List<PlmsOvmOutDelayDtl>  delayAllList2  = new ArrayList<PlmsOvmOutDelayDtl>();
			for(PlmsOvmOutVisitInfo outInfo:outList2){
				outInfo.setStatus(OutVisitStatusType.Overdued);
				outInfo.setUpdatedBy("system");
				outInfo.setEndBy("system");
				outInfo.setEndDate(new Date());
				outInfo.setUpdateTime(new Date());
				Long infoId = outInfo.getId();
				//延期案件的状态要变更
				if(outInfo.getCaseType()!=null&&outInfo.getCaseType().equals("CASE_DELAYING")){	
					PlmsOvmOutDelayExample examp = new PlmsOvmOutDelayExample();
					examp.setInfoId(outInfo.getId());
					List<PlmsOvmOutDelay> delayList = plmsOvmOutDelayService.selectByExample(examp);
					//延期申请中的要将延期申请置直接拒绝 
					if(delayList!=null&&delayList.size()>0){
						PlmsOvmOutDelay delay = delayList.get(0);
						PlmsOvmOutDelayDtlExample examp2 = new PlmsOvmOutDelayDtlExample();
						examp2.setDelayId(delay.getId());
						examp2.setDelayAuditResult("NOT_APPROVED");
						List<PlmsOvmOutDelayDtl> delayDtlList = plmsOvmOutDelayService.selectDtlByExample(examp2);
						if(delayDtlList.size()>0){
							for(PlmsOvmOutDelayDtl dtl:delayDtlList){
								dtl.setDelayAuditResult("REJECT");
								dtl.setDelayAuditRefuse("案件已过期");
								dtl.setDelayAuditBy("system");
								dtl.setUpdatedBy("system");
								dtl.setDelayAuditTime(new Date());
								dtl.setUpdateTime(new Date());
								delayAllList2.add(dtl);
							}
						}
					}

					if(delayList!=null&&delayList.size()>0){
						Long delayTimes = delayList.get(0).getDelayTimes();
						if(delayTimes!=null&&delayTimes.longValue()>0L){
							outInfo.setCaseType("CASE_DELAY");
						}else{
							outInfo.setCaseType("CASE_ADD");
						}
					}
				}
		
				//添加外访日志
				PlmsOvmOutVisitLog outVisitLog = new PlmsOvmOutVisitLog();
				outVisitLog = setOutLogModel(outInfo,outVisitLog);
				outVisitLogList2.add(outVisitLog);				
				//处理对应的外访计划
				Map<String,Object> planMap = new HashMap<String,Object>();
				planMap.put("infoId", infoId);
				planMap.put("planStatus", "Start");
				List<PlmsOvmOutVisitPlan> planList = plmsOvmOutVisitPlanService.searchByMap(planMap);
				if(planList!=null&&planList.size()>0){
					for(PlmsOvmOutVisitPlan plan:planList){
						plan.setPlanStatus(OutVisitPlanStatusType.Cancel);
						plan.setVisitCancelResion("案件已过期");
						plan.setUpdatedBy("system");
						plan.setUpdateTime(new Date());
						planListAll2.add(plan);
					}
				}
				//此外访案件对应的外访员
				String visitor = outInfo.getVisitBy();
				if(visitor!=null&&(!visitor.equals(""))){
					if(userMap.containsKey(visitor)){
						PlmsOvmOutVisitUser user = userMap.get(visitor);
						user.setCaseCount(user.getCaseCount()-1);
						user.setRemainderAmount(user.getRemainderAmount().subtract(outInfo.getRemainderPrincipal()));
						userMap.put(visitor, user);
					}else{
						PlmsOvmOutVisitUserExample examp = new PlmsOvmOutVisitUserExample();
						examp.setUserId(visitor);
						PlmsOvmOutVisitUser user = plmsOvmOutVisitUserService.selectByExample(examp).get(0);
						user.setCaseCount(user.getCaseCount()-1);
						user.setRemainderAmount(user.getRemainderAmount().subtract(outInfo.getRemainderPrincipal()));
						userMap.put(visitor, user);
					}
					
				}
				
			}
			
			//批量修改延期申请
			plmsOvmOutDelayDtlService.updateBatch(delayAllList2);
			
			//修改外访信息
			plmsOvmOutVisitInfoService.updateBatch(outList2);
			
			//增加外访日志
			plmsOvmOutVisitLogService.insertBatch(outVisitLogList2);
			
			//批量修改外访计划状态
			if(planListAll2!=null&&planListAll2.size()>0){
				plmsOvmOutVisitPlanService.updateBatch(planListAll2);
			}
			if(userMap.size()>0){
				for(String key:userMap.keySet()){
					outUserList.add(userMap.get(key));
				}
				
				plmsOvmOutVisitUserService.updateBatch(outUserList);
			}
			
			logger.info("-----判断外访案件是否过期结束-----");
			int planSzie = planListAll2==null?0:planListAll2.size();
			logger.info("-----共有"+outList2.size()+"条外访案件过期，共有"+planSzie+"条外访计划被取消-----");			
		}else{
			logger.info("-----今日没有外访案件过期-----");
		}
	
	}

	/**
	 * 
	* @Description: 外访日志model 
	* @param info
	* @param outVisitLog
	* @return
	* @return PlmsOvmOutVisitLog
	 */
	private PlmsOvmOutVisitLog setOutLogModel(PlmsOvmOutVisitInfo info,
			PlmsOvmOutVisitLog outVisitLog) {
		if(info.getStatus().equals(OutVisitStatusType.Outsourced)){
			outVisitLog.setContent("系统跑批，此案件已进入委外区间");
			outVisitLog.setStatus(OutVisitStatusType.Outsourced);

		}else if(info.getStatus().equals(OutVisitStatusType.Overdued)){
			outVisitLog.setContent("系统跑批，此案件已过期");
			outVisitLog.setStatus(OutVisitStatusType.Overdued);

		}
		outVisitLog.setHandleBy("system");
		outVisitLog.setApplId(info.getApplId());
		outVisitLog.setCreatedBy("system");
		outVisitLog.setCreateTime(new Date());
		outVisitLog.setUpdatedBy("system");
		outVisitLog.setUpdateTime(new Date());
		
		return outVisitLog;
	}
}
