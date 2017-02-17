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

import com.ljwd.plms.core.util.D;
import com.ljwd.plms.web.dao.report.LfRpmntMapper;
import com.ljwd.plms.web.model.case_collection.PlmsLaCollectionRecord;
import com.ljwd.plms.web.model.outVisit.PlmsOvmOutVisitInfo;
import com.ljwd.plms.web.model.outVisit.PlmsOvmOutVisitPlan;
import com.ljwd.plms.web.model.report.LfRpmnt;
import com.ljwd.plms.web.model.report.PlmsLaCollectorIncome;
import com.ljwd.plms.web.model.report.PlmsLaCollectorIncomeExample;
import com.ljwd.plms.web.model.report.PlmsLaOutvisiteIncome;
import com.ljwd.plms.web.service.case_collection.inf.PlmsLaCollectionRecordService;
import com.ljwd.plms.web.service.case_management.inf.PlmsLaCollectAllocService;
import com.ljwd.plms.web.service.job.inf.PlmsDayIncomeService;
import com.ljwd.plms.web.service.outVisit.inf.PlmsOvmOutVisitInfoService;
import com.ljwd.plms.web.service.outVisit.inf.PlmsOvmOutVisitPlanService;
import com.ljwd.plms.web.service.report.inf.PlmsLaCollectorIncomeService;
import com.ljwd.plms.web.service.report.inf.PlmsLaOutvisiteIncomeService;
import com.ljwd.plms.web.vo.report.PlmsLaCollectorIncomeDto;

@Service
public class PlmsDayIncomeServiceImpl implements PlmsDayIncomeService{
	
	
	@Resource
	private PlmsLaCollectorIncomeService   plmsLaCollectorIncomeService;
	@Resource
	private PlmsLaCollectAllocService plmsLaCollectAllocService;
	@Resource
	private PlmsLaCollectionRecordService plmsLaCollectionRecordService;
	@Resource
	private PlmsOvmOutVisitPlanService plmsOvmOutVisitPlanService;
	@Resource
	private PlmsOvmOutVisitInfoService plmsOvmOutVisitInfoService;
	@Resource
	private LfRpmntMapper lfRpmntMapper;
	@Resource
	private PlmsLaOutvisiteIncomeService plmsLaOutvisiteIncomeService;
	
	 
    private Logger logger = LoggerFactory.getLogger(this.getClass());

	/**
	 * 
	* @Description: 每天统计催收员的实收
	* @return
	* @return
	 */
	@Override
	public void updatePlmsLaIncome_yesterday() {
		logger.info("----------每日统计催收员外访员业绩跑批开始：-----------");
		logger.info("-----先删除昨天所有要存入催收实收表的记录，避免已经存入的数据再次存入导致存入失败-----");
		Map<String, Object> mapDelete = new HashMap<String, Object>();
		mapDelete.put("type", "yesterday");
		int deleteCount = plmsLaCollectorIncomeService.deletePlmsLaCollectorIncome(mapDelete);
		logger.info("已删除昨天生成的数据"+deleteCount+"条");
		//rpmntType 1:非微信 2：微信
		//1.统计昨天实收,非微信还款
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("rpmntType", "1");
		map.put("type", "yesterday");
		List<PlmsLaCollectorIncomeDto> laCollectorIncomesList = plmsLaCollectorIncomeService.searchYesterdayLfRpmnt(map);
		if(laCollectorIncomesList!=null&&laCollectorIncomesList.size()>0){
			//选出有效的外访
			//getIsActiveOutVisit(laCollectorIncomesList);
			//如果操作入账时间早于或等于委外审批通过时间，则该笔实收计入催收员/外访员。	如操作入账时间晚于委外审批通过时间，则不计。
			//getIsActiveUserRemoveOutsrc(laCollectorIncomesList);
			//dto-->model
			List<PlmsLaCollectorIncome> modelList  = setPlmsLaCollectorIncomeModel(laCollectorIncomesList,"system");
			//批量插入到PLMS_LA_COLLECTOR_INCOME
			plmsLaCollectorIncomeService.insertBatch(modelList);
		}
		logger.info("----------非微信还款方式共统计"+laCollectorIncomesList.size()+"笔---------");
		//2.统计昨天实收,微信还款
		Map<String,Object> map2 = new HashMap<String,Object>();
		map2.put("rpmntType", "2");
		map2.put("type", "yesterday");
		List<PlmsLaCollectorIncomeDto> laCollectorIncomesList2 = plmsLaCollectorIncomeService.searchYesterdayLfRpmnt(map2);
		if(laCollectorIncomesList2!=null&&laCollectorIncomesList2.size()>0){
			//选出有效的外访
		//	getIsActiveOutVisit(laCollectorIncomesList2);
			//如果操作入账时间早于或等于委外审批通过时间，则该笔实收计入催收员/外访员。	如操作入账时间晚于委外审批通过时间，则不计。
			//getIsActiveUserRemoveOutsrc(laCollectorIncomesList2);
			//dto-->model
			List<PlmsLaCollectorIncome> modelList2  = setPlmsLaCollectorIncomeModel_weixin(laCollectorIncomesList2,"system");
			//批量插入到PLMS_LA_COLLECTOR_INCOME
			plmsLaCollectorIncomeService.insertBatch(modelList2);
		}
		logger.info("----------微信还款方式共统计"+laCollectorIncomesList2.size()+"笔---------");
		logger.info("----------每日统计催收员业绩跑批结束：-----------");

	}

	/**
	 * 
	* @Description: 如果操作入账时间早于或等于委外审批通过时间，则该笔实收计入催收员/外访员。	如操作入账时间晚于委外审批通过时间，则不计。
	* @param laCollectorIncomesList
	* @return List<PlmsLaCollectorIncomeDto>
	 */
	/*private List<PlmsLaCollectorIncomeDto> getIsActiveUserRemoveOutsrc(
			List<PlmsLaCollectorIncomeDto> laCollectorIncomesList) {
		if(laCollectorIncomesList!=null&&laCollectorIncomesList.size()>0){
			Iterator<PlmsLaCollectorIncomeDto> Iterable = laCollectorIncomesList.iterator();
			while(Iterable.hasNext()){
				PlmsLaCollectorIncomeDto incomeDto = Iterable.next();
				if(incomeDto.getApproveTime()!=null){
					if(incomeDto.getApproveTime().getTime()<incomeDto.getInputTime().getTime()){
						//incomeDto.setOutVisit(null);	
						incomeDto.setCollectorAgent(null);
						incomeDto.setCollectorAgent2(null);
						incomeDto.setCollectUser(null);
						incomeDto.setCollectUser2(null);
					}
				}
			}
			
		}
		
			
		return laCollectorIncomesList;
		
	}
*/

	/**
	 * 
	* @Description: 选择有效的外访员业绩 
	* @param laCollectorIncomesList
	* @return
	* @return List<PlmsLaCollectorIncomeDto>
	 */
	/*private  List<PlmsLaCollectorIncomeDto> getIsActiveOutVisit(List<PlmsLaCollectorIncomeDto> laCollectorIncomesList){
		if(laCollectorIncomesList!=null&&laCollectorIncomesList.size()>0){
			for(PlmsLaCollectorIncomeDto lr:laCollectorIncomesList){
				if(lr.getOutVisit()!=null&&(!lr.getOutVisit().equals(""))){
					PlmsLaCollectionRecordExample example = new PlmsLaCollectionRecordExample();
					example.setApplId(lr.getApplId());
					List<String> typeList= new ArrayList<String>();
					typeList.add("PHONE");typeList.add("NEWPHONE");typeList.add("SEARCH");
					example.setCollectMthd(typeList);
					example.setCreateTime(lr.getInputTime());
					example.setFollowedBy(lr.getOutVisit());
					//有创建催收类型为电话/新增电话/查找
					int count1 = plmsLaCollectionRecordService.selectCountByExample(example);
					if(count1>0){
						
					}else{
						//有提交外访结果的计划
						Map<String, Object> map2 =  new HashMap<String, Object>();
						map2.put("infoId", lr.getOutinfoId());
						map2.put("planStatus", "End");
						map2.put("inputTime", lr.getInputTime());
						int count2 = plmsOvmOutVisitPlanService.selectCountByExample(map2);
						if(count2>0){
							
						}else{
							lr.setOutVisit(null);
						}
					}
				}
			}		
		}
		
			return laCollectorIncomesList;
		
	}*/
	
	/**
	 * 
	* @Description: 非微信 dto-->model
	* @param laCollectorIncomesList
	* @return
	* @return List<PlmsLaCollectorIncome>
	 */
	private  List<PlmsLaCollectorIncome> setPlmsLaCollectorIncomeModel(List<PlmsLaCollectorIncomeDto> laCollectorIncomesList,String userId){
		List<PlmsLaCollectorIncome> modelList = new ArrayList<PlmsLaCollectorIncome>(); 
		for(PlmsLaCollectorIncomeDto incomeDto:laCollectorIncomesList){
			PlmsLaCollectorIncome income = new PlmsLaCollectorIncome();
			income.setRpmntId(incomeDto.getRpmntId());
			income.setCollector(incomeDto.getCollectUser());
			income.setCollectorAgent(incomeDto.getCollectorAgent());
			//income.setOutVisit(incomeDto.getOutVisit());
			income.setIsActive("Y");
			income.setCreateTime(new Date());
			income.setCreatedBy(userId);
			income.setUpdatedBy(userId);
			income.setUpdateTime(new Date());
			modelList.add(income);
		}
		return modelList;
		
	}

	/**
	 * 
	* @Description: 微信 dto-->model
	* @param laCollectorIncomesList
	* @return
	* @return List<PlmsLaCollectorIncome>
	 */
	private List<PlmsLaCollectorIncome> setPlmsLaCollectorIncomeModel_weixin(List<PlmsLaCollectorIncomeDto> laCollectorIncomesList,String userId){
		List<PlmsLaCollectorIncome> modelList = new ArrayList<PlmsLaCollectorIncome>(); 
		for(PlmsLaCollectorIncomeDto dto:laCollectorIncomesList){
			PlmsLaCollectorIncome income = new PlmsLaCollectorIncome();
			income.setRpmntId(dto.getRpmntId());
			//income.setOutVisit(dto.getOutVisit());
			if(dto.getCollectorAgent()!=null&&(!dto.getCollectorAgent().equals(""))){
				income.setCollectorAgent(dto.getCollectorAgent());
			}else if(dto.getCollectUser()!=null&&(!dto.getCollectUser().equals(""))){
				income.setCollector(dto.getCollectUser());
			}else if(dto.getCollectorAgent2()!=null&&(!dto.getCollectorAgent2().equals(""))){
				income.setCollectorAgent(dto.getCollectorAgent2());
			}else{
				income.setCollector(dto.getCollectUser2());
			}
			income.setIsActive("Y");
			income.setCreateTime(new Date());
			income.setCreatedBy(userId);
			income.setUpdatedBy(userId);
			income.setUpdateTime(new Date());
			modelList.add(income);
		}
		return modelList;
		
	}

	/**
	 * 
	* @Description: 手动生成指定日期实收统计 
	* @return
	 */
	@Override
	public void updatePlmsLaIncome_today(PlmsLaCollectorIncomeExample example,String userId) {
		logger.info("----------每日统计催收员业绩跑批开始：-----------");
		logger.info("-----先删除今天所有要存入催收实收表的记录，避免已经存入的数据再次存入导致存入失败-----");
		Map<String, Object> mapDelete = new HashMap<String, Object>();
		mapDelete.put("type", "today");
		mapDelete.put("createDataDate", example.getCreateDataDate());
		int deleteCount = plmsLaCollectorIncomeService.deletePlmsLaCollectorIncome(mapDelete);
		logger.info("已删除今天生成的数据"+deleteCount+"条");
		//rpmntType 1:非微信 2：微信
		//1.统计非微信还款
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("rpmntType", "1");
		map.put("type", "today");
		map.put("createDataDate", example.getCreateDataDate());
		List<PlmsLaCollectorIncomeDto> laCollectorIncomesList = plmsLaCollectorIncomeService.searchYesterdayLfRpmnt(map);
		if(laCollectorIncomesList!=null&&laCollectorIncomesList.size()>0){
			//选出有效的外访
			//getIsActiveOutVisit(laCollectorIncomesList);
			//如果操作入账时间早于或等于委外审批通过时间，则该笔实收计入催收员/外访员。	如操作入账时间晚于委外审批通过时间，则不计。
			//getIsActiveUserRemoveOutsrc(laCollectorIncomesList);
			//dto-->model
			List<PlmsLaCollectorIncome> modelList  = setPlmsLaCollectorIncomeModel(laCollectorIncomesList,userId);
			//批量插入到PLMS_LA_COLLECTOR_INCOME
			plmsLaCollectorIncomeService.insertBatch(modelList);
		}
		logger.info("----------非微信还款方式共统计"+laCollectorIncomesList.size()+"笔---------");
		//2.统计微信还款
		Map<String,Object> map2 = new HashMap<String,Object>();
		map2.put("rpmntType", "2");
		map2.put("type", "today");
		map2.put("createDataDate", example.getCreateDataDate());
		List<PlmsLaCollectorIncomeDto> laCollectorIncomesList2 = plmsLaCollectorIncomeService.searchYesterdayLfRpmnt(map2);
		if(laCollectorIncomesList2!=null&&laCollectorIncomesList2.size()>0){
			//选出有效的外访
			//getIsActiveOutVisit(laCollectorIncomesList2);
			//如果操作入账时间早于或等于委外审批通过时间，则该笔实收计入催收员/外访员。	如操作入账时间晚于委外审批通过时间，则不计。
			//getIsActiveUserRemoveOutsrc(laCollectorIncomesList2);
			//dto-->model
			List<PlmsLaCollectorIncome> modelList2  = setPlmsLaCollectorIncomeModel_weixin(laCollectorIncomesList2,userId);
			//批量插入到PLMS_LA_COLLECTOR_INCOME
			plmsLaCollectorIncomeService.insertBatch(modelList2);
		}
		logger.info("----------微信还款方式共统计"+laCollectorIncomesList2.size()+"笔---------");
		logger.info("----------每日统计催收员业绩跑批结束：-----------");

		
	}

	
	/**
	 * 
	* @Description: 每天跑批生成昨天外访员的实收  
	* @return
	 */
	@Override
	public void updatePlmsLaIncomeOutVisitUser() {
		logger.info("----------每日统计外访员业绩跑批开始：-----------");
		logger.info("-----先删除昨天所有要存入外访实收表的记录，避免已经存入的数据再次存入导致存入失败-----");
		Map<String, Object> mapDelete = new HashMap<String, Object>();
		mapDelete.put("type", "yesterday");
		int deleteCount = plmsLaOutvisiteIncomeService.deletePlmsLaOutVisitIncome(mapDelete);
		logger.info("已删除昨天生成的数据"+deleteCount+"条");
		//需要修改的实收记录
		//List<PlmsLaCollectorIncome> updateIncomeAllList = new ArrayList<PlmsLaCollectorIncome>();
		//需要添加的实收记录
		List<PlmsLaOutvisiteIncome> addIncomeAllList = new ArrayList<PlmsLaOutvisiteIncome>();
		//查询昨天结案的外访案件
		Map<String, Object> mapA = new HashMap<String, Object>();
		mapA.put("type", "yesterday");
		List<PlmsOvmOutVisitInfo> overOutVisitList = plmsOvmOutVisitInfoService.selectOverOutVisitInfo(mapA);
		if(overOutVisitList!=null&&overOutVisitList.size()>0){
			for(PlmsOvmOutVisitInfo outVisitInfo:overOutVisitList){
				//是否是有效的外访
				boolean isActive = true;
				//外访员 开始时间，截止时间
				Date startTime = outVisitInfo.getAssignDate();
				Date endTime = outVisitInfo.getEndDate().compareTo(outVisitInfo.getExpectCloseTime())>=0?D.toDate(outVisitInfo.getExpectCloseTimeStr()+" 23:59:59", D.PATTERN_SECONDS):outVisitInfo.getEndDate();
				//第一条催记
				Map<String, Object> mapB = new HashMap<String, Object>();
				mapB.put("applId", outVisitInfo.getApplId());
				mapB.put("followedBy", outVisitInfo.getVisitByName());
				mapB.put("startTime", startTime);
				mapB.put("endTime", endTime);
				//查找创建时间最早的的催收类型为电话/新增电话/查找的催记
				 PlmsLaCollectionRecord record = plmsLaCollectionRecordService.selectMinTimeOutVisitRecord(mapB);
				 Date recordDate = null;
				 Date planDate = null;
				 if(record !=null){
					 recordDate = record.getCreateTime();
				 }
				//第一条有效的外访计划
				Map<String, Object> mapC = new HashMap<String, Object>();
				mapC.put("infoId",outVisitInfo.getId());
				PlmsOvmOutVisitPlan plan = plmsOvmOutVisitPlanService.selectMinTimeIsActivePlan(mapC);
				if(plan!=null){
					planDate = plan.getCreateTime();
				}
				//计算此次外访的有效开始时间
				if(planDate!=null&&recordDate!=null){
					startTime = planDate.compareTo(recordDate)>=0?recordDate:planDate;
				}else if(planDate==null&&recordDate==null){
					isActive = false;
				}else{
					startTime = planDate==null?recordDate:planDate;
				}
				//如果是有效外访则计算其绩效，否则不做处理
				if(isActive){
					Map<String, Object> mapD = new HashMap<String, Object>();
					mapD.put("applId", outVisitInfo.getApplId());
					mapD.put("startTime", startTime);
					mapD.put("endTime", endTime);
					List<LfRpmnt> lrList = lfRpmntMapper.selectByMap(mapD);
					//如果有对应外访人员的实收，则修改PLMS_LA_COLLECTOR_INCOME中的记录
					if(lrList!=null&&lrList.size()>0){
							for(LfRpmnt lo:lrList){
								PlmsLaOutvisiteIncome addDto = new PlmsLaOutvisiteIncome();
								Date date = new Date();
								addDto.setRpmntId(lo.getId());
								addDto.setOutVisit(outVisitInfo.getVisitByName());
								addDto.setOutVisitId(outVisitInfo.getId());
								addDto.setCreateTime(date);
								addDto.setIsActive("Y");
								addDto.setCreatedBy("system");
								addDto.setUpdatedBy("system");
								addDto.setUpdateTime(date);
								addIncomeAllList.add(addDto);
							}
					}

						/*
						//需要修改的实收记录
						List<Long> updateRpmntIdList = new ArrayList<Long>();
						//需要新增的实收记录
						List<Long> addRpmntIdList  = new ArrayList<Long>();
						//此次外访的所有实收
						List<Long> lrRpmntIdList = new ArrayList<Long>();
						for(LfRpmnt lr:lrList){
							lrRpmntIdList.add(lr.getId());
						}
						Map<String, Object> mapE = new HashMap<String, Object>();
						mapD.put("rpmntIds",lrRpmntIdList );
						List<PlmsLaCollectorIncome> updateIncomeList = plmsLaCollectorIncomeService.selectByMap(mapE);
						if(updateIncomeList!=null&&updateIncomeList.size()>0){ 
							 for(PlmsLaCollectorIncome income:updateIncomeList){
								 updateRpmntIdList.add(income.getRpmntId());
							 }
							  addRpmntIdList =  getDiffrent(lrRpmntIdList,updateRpmntIdList);
						 }else{
							 for(LfRpmnt lr:lrList){
								 addRpmntIdList.add(lr.getId());
							 }
						 }
						if(updateIncomeList!=null&&updateIncomeList.size()>0){
							for(PlmsLaCollectorIncome inc:updateIncomeList){
								PlmsLaCollectorIncome updateDto = new PlmsLaCollectorIncome();
								updateDto.setRecVer(inc.getRecVer());
								updateDto.setRpmntId(inc.getRpmntId());
								updateDto.setUpdateTime(new Date());
								updateDto.setOutVisit(outVisitInfo.getVisitByName());
								updateIncomeAllList.add(updateDto);
							}
						}
						if(addRpmntIdList != null &&addRpmntIdList.size()>0){
							for(Long lo:addRpmntIdList){
								PlmsLaCollectorIncome addDto = new PlmsLaCollectorIncome();
								Date date = new Date();
								addDto.setRpmntId(lo);
								addDto.setOutVisit(outVisitInfo.getVisitByName());
								addDto.setCreateTime(date);
								addDto.setCreatedBy("system");
								addDto.setUpdatedBy("system");
								addDto.setUpdateTime(date);
								addIncomeAllList.add(addDto);
							}
						}
						
					*/}
					
				}
			}
		/*//批量修改的实收记录集合
		if(updateIncomeAllList !=null&&updateIncomeAllList.size()>0){
			plmsLaCollectorIncomeService.updateBatch(updateIncomeAllList);
		}*/
		//批量插入的实收记录集合
		if(addIncomeAllList != null && addIncomeAllList.size()>0){
			plmsLaOutvisiteIncomeService.insertBatch(addIncomeAllList);
		}
		logger.info("----------每日统计外访员业绩跑批结束：-----------");

	}
	/**
	 * 
	* @Description: 手动生成指定日期外访人员实收统计   
	* @param example
	* @param userId
	* @return
	 */
	@Override
	public void updatePlmsLaIncomeOutVisitUser_today(
			PlmsLaCollectorIncomeExample example, String userId) {
		logger.info("----------每日统计外访员业绩跑批开始：-----------");
		logger.info("-----先删除今天所有要存入外访实收表的记录，避免已经存入的数据再次存入导致存入失败-----");
		Map<String, Object> mapDelete = new HashMap<String, Object>();
		mapDelete.put("type", "everyday");
		mapDelete.put("createDataDate", example.getCreateDataDate());
		int deleteCount = plmsLaOutvisiteIncomeService.deletePlmsLaOutVisitIncome(mapDelete);
		logger.info("已删除生成的数据"+deleteCount+"条");
		List<PlmsLaOutvisiteIncome> addIncomeAllList = new ArrayList<PlmsLaOutvisiteIncome>();
		//查询昨天结案的外访案件
		Map<String, Object> mapA = new HashMap<String, Object>();
		mapA.put("type", "everyday");
		mapA.put("createDataDate", example.getCreateDataDate());
		List<PlmsOvmOutVisitInfo> overOutVisitList = plmsOvmOutVisitInfoService.selectOverOutVisitInfo(mapA);
		if(overOutVisitList!=null&&overOutVisitList.size()>0){
			for(PlmsOvmOutVisitInfo outVisitInfo:overOutVisitList){
				//是否是有效的外访
				boolean isActive = true;
				//外访员 开始时间，截止时间
				Date startTime = outVisitInfo.getAssignDate();
				Date endTime = outVisitInfo.getEndDate().compareTo(outVisitInfo.getExpectCloseTime())>=0?D.toDate(outVisitInfo.getExpectCloseTimeStr()+" 23:59:59", D.PATTERN_SECONDS):outVisitInfo.getEndDate();
				//第一条催记
				Map<String, Object> mapB = new HashMap<String, Object>();
				mapB.put("applId", outVisitInfo.getApplId());
				mapB.put("followedBy", outVisitInfo.getVisitByName());
				mapB.put("startTime", startTime);
				mapB.put("endTime", endTime);
				//查找创建时间最早的的催收类型为电话/新增电话/查找的催记
				 PlmsLaCollectionRecord record = plmsLaCollectionRecordService.selectMinTimeOutVisitRecord(mapB);
				 Date recordDate = null;
				 Date planDate = null;
				 if(record !=null){
					 recordDate = record.getCreateTime();
				 }
				//第一条有效的外访计划
				Map<String, Object> mapC = new HashMap<String, Object>();
				mapC.put("infoId",outVisitInfo.getId());
				PlmsOvmOutVisitPlan plan = plmsOvmOutVisitPlanService.selectMinTimeIsActivePlan(mapC);
				if(plan!=null){
					planDate = plan.getCreateTime();
				}
				//计算此次外访的有效开始时间
				if(planDate!=null&&recordDate!=null){
					startTime = planDate.compareTo(recordDate)>=0?recordDate:planDate;
				}else if(planDate==null&&recordDate==null){
					isActive = false;
				}else{
					startTime = planDate==null?recordDate:planDate;
				}
				//如果是有效外访则计算其绩效，否则不做处理
				if(isActive){
					Map<String, Object> mapD = new HashMap<String, Object>();
					mapD.put("applId", outVisitInfo.getApplId());
					mapD.put("startTime", startTime);
					mapD.put("endTime", endTime);
					List<LfRpmnt> lrList = lfRpmntMapper.selectByMap(mapD);
					//如果有对应外访人员的实收，则修改PLMS_LA_COLLECTOR_INCOME中的记录
					if(lrList!=null&&lrList.size()>0){
							for(LfRpmnt lo:lrList){
								PlmsLaOutvisiteIncome addDto = new PlmsLaOutvisiteIncome();
								Date date = new Date();
								addDto.setRpmntId(lo.getId());
								addDto.setOutVisit(outVisitInfo.getVisitByName());
								addDto.setOutVisitId(outVisitInfo.getId());
								addDto.setCreateTime(date);
								addDto.setIsActive("Y");
								addDto.setCreatedBy("system");
								addDto.setUpdatedBy("system");
								addDto.setUpdateTime(date);
								addIncomeAllList.add(addDto);
							}
					}
						
				}
					
				}
			}
		//批量插入的实收记录集合
		if(addIncomeAllList != null && addIncomeAllList.size()>0){
			plmsLaOutvisiteIncomeService.insertBatch(addIncomeAllList);
		}
		logger.info("----------每日统计外访员业绩跑批结束：-----------");

	}
	
	
	/**
	 * 
	* @Description: 取出连个集合的差集 
	* @param list1
	* @param list2
	* @return
	* @return List<Long>
	 */
	/*private  List<Long> getDiffrent(List<Long> list1, List<Long> list2) {
         List<Long> diff = new ArrayList<Long>();
         List<Long> maxList = list1;
         List<Long> minList = list2;
         if(list2.size()>list1.size())
         {
             maxList = list2;
             minList = list1;
         }
         Map<Long,Integer> map = new HashMap<Long,Integer>(maxList.size());
         for (Long l : maxList) {
             map.put(l, 1);
         }
         for (Long l2 : minList) {
             if(map.get(l2)!=null)
             {
                 map.put(l2, 2);
                 continue;
             }
             diff.add(l2);
         }
         for(Map.Entry<Long, Integer> entry:map.entrySet())
         {
             if(entry.getValue()==1)
             {
                 diff.add(entry.getKey());
             }
         }

         return diff;
    }*/
}
