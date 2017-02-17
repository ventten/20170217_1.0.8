package com.ljwd.plms.web.service.job.impl;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import com.ljwd.plms.core.util.StringUtil;
import com.ljwd.plms.web.service.outsource.inf.PlmsLaApplOutsrcService;
import com.ljwd.plms.web.vo.outsource.AddOutsrcApplDto;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.stereotype.Service;
import org.springframework.transaction.TransactionDefinition;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.DefaultTransactionDefinition;

import com.ljwd.plms.core.util.AppContext;
import com.ljwd.plms.web.dao.case_management.PlmsEmpCollectSetMapper;
import com.ljwd.plms.web.dao.workorder_pool.PlmsCircuRuleSetMapper;
import com.ljwd.plms.web.enums.TransferStatusType;
import com.ljwd.plms.web.model.case_management.PlmsEmpCollectSet;
import com.ljwd.plms.web.model.case_management.PlmsEmpCollectSetExample;
import com.ljwd.plms.web.model.case_management.PlmsLTransferAdvance;
import com.ljwd.plms.web.model.case_management.PlmsLTransferAdvanceExample;
import com.ljwd.plms.web.model.case_management.PlmsLaCollectAgent;
import com.ljwd.plms.web.model.case_management.PlmsLaCollectAlloc;
import com.ljwd.plms.web.model.case_management.PlmsLaCollectAllocExample;
import com.ljwd.plms.web.model.case_management.PlmsLaCollectRec;
import com.ljwd.plms.web.model.case_management.PlmsWorkOrderPool;
import com.ljwd.plms.web.model.case_management.PlmsWorkOrderPoolExample;
import com.ljwd.plms.web.model.case_management.PlmsWorkOrderPoolLog;
import com.ljwd.plms.web.model.outVisit.PlmsOvmOutDelay;
import com.ljwd.plms.web.model.outVisit.PlmsOvmOutDelayDtl;
import com.ljwd.plms.web.model.outVisit.PlmsOvmOutDelayDtlExample;
import com.ljwd.plms.web.model.outVisit.PlmsOvmOutDelayExample;
import com.ljwd.plms.web.model.outVisit.PlmsOvmOutVisitInfo;
import com.ljwd.plms.web.model.outVisit.PlmsOvmOutVisitLog;
import com.ljwd.plms.web.model.outVisit.PlmsOvmOutVisitPlan;
import com.ljwd.plms.web.model.outVisit.PlmsOvmOutVisitUser;
import com.ljwd.plms.web.model.outVisit.PlmsOvmOutVisitUserExample;
import com.ljwd.plms.web.model.sys_management.PlmsUserUpperLimit;
import com.ljwd.plms.web.model.sys_management.PlmsUserUpperLimitExample;
import com.ljwd.plms.web.model.workorder_pool.PlmsCircuRuleSet;
import com.ljwd.plms.web.model.workorder_pool.PlmsCircuRuleSetExample;
import com.ljwd.plms.web.model.workorder_pool.PlmsCollectionRuleSet;
import com.ljwd.plms.web.model.workorder_pool.PlmsCollectionRuleSetExample;
import com.ljwd.plms.web.service.case_collection.inf.PlmsLaCollectionRecordService;
import com.ljwd.plms.web.service.case_management.inf.PlmsEmpCollectSetService;
import com.ljwd.plms.web.service.case_management.inf.PlmsLTransferAdvanceService;
import com.ljwd.plms.web.service.case_management.inf.PlmsLaCollectAgentService;
import com.ljwd.plms.web.service.case_management.inf.PlmsLaCollectAllocService;
import com.ljwd.plms.web.service.case_management.inf.PlmsLaCollectRecService;
import com.ljwd.plms.web.service.case_management.inf.PlmsWorkOrderPoolLogService;
import com.ljwd.plms.web.service.case_management.inf.PlmsWorkOrderPoolService;
import com.ljwd.plms.web.service.job.inf.PlmsDoOverdueDataService;
import com.ljwd.plms.web.service.outVisit.inf.PlmsOvmOutDelayDtlService;
import com.ljwd.plms.web.service.outVisit.inf.PlmsOvmOutDelayService;
import com.ljwd.plms.web.service.outVisit.inf.PlmsOvmOutVisitInfoService;
import com.ljwd.plms.web.service.outVisit.inf.PlmsOvmOutVisitLogService;
import com.ljwd.plms.web.service.outVisit.inf.PlmsOvmOutVisitPlanService;
import com.ljwd.plms.web.service.outVisit.inf.PlmsOvmOutVisitUserService;
import com.ljwd.plms.web.service.sys_management.inf.PlmsUserUpperLimitService;
import com.ljwd.plms.web.service.workorder_pool.inf.PlmsCollectionRuleSetService;
import com.ljwd.plms.web.service.workorder_pool.inf.PlmsLAssignRuleService;
import com.ljwd.plms.web.vo.case_management.PlmsEmpCollectDto;
import com.ljwd.plms.web.vo.case_management.PlmsFeeWaiveApprovalResultDto;
import com.ljwd.plms.web.vo.case_management.PlmsLaCollectRecDto;
import com.ljwd.plms.web.vo.case_management.PlmsWorkOrderAssignDto;
import com.ljwd.plms.web.vo.case_management.PlmsWorkOrderPoolDto;
import com.ljwd.plms.web.vo.outVisit.OutVisitPlanStatusType;
import com.ljwd.plms.web.vo.outVisit.OutVisitStatusType;
import com.ljwd.plms.web.vo.workorder_pool.CollectionCircuDto;
import com.ljwd.plms.web.vo.workorder_pool.PlmsCollectionRuleSetDto;

@Service
public class PlmsDoOverdueDataServiceImpl implements PlmsDoOverdueDataService {
	@Resource
	private PlmsWorkOrderPoolService plmsWorkOrderPoolService;
	@Resource
	private PlmsCollectionRuleSetService plmsCollectionRuleSetService;
	@Resource
	private PlmsWorkOrderPoolLogService plmsWorkOrderPoolLogService;
	@Resource
	private PlmsEmpCollectSetService plmsEmpCollectSetService;
	@Resource
	private PlmsLaCollectAllocService plmsLaCollectAllocService;
	@Resource
	private PlmsLaCollectAgentService plmsLaCollectAgentService;
	@Resource
	private PlmsLAssignRuleService plmsLAssignRuleService;
	@Resource
	private PlmsLaCollectRecService plmsLaCollectRecService;
	@Resource
	private PlmsEmpCollectSetMapper plmsEmpCollectSetMapper;
	@Resource
	private PlmsCircuRuleSetMapper plmsCircuRuleSetMapper;
	@Resource
	private PlmsLTransferAdvanceService plmsLTransferAdvanceService;
	@Resource
	private PlmsLaCollectionRecordService plmsLaCollectionRecordService;
	@Resource
	private PlmsUserUpperLimitService plmsUserUpperLimitService;
	@Resource
	private PlmsOvmOutVisitInfoService plmsOvmOutVisitInfoService;
	@Resource
	private PlmsLaApplOutsrcService plmsLaApplOutsrcService;
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
	
	private static Logger logger = LoggerFactory.getLogger(PlmsDoOverdueDataServiceImpl.class);
	private static final Boolean synchronizedObject = true;

	@Override
	public void doUpdateOverdueDatas() {
		doUpdateAutoCircu();
		updateAutoAlloc();
	}

	/**
	* @Description: 自动流转
	*/
	@Override
	public void doUpdateAutoCircu() {
		synchronized (synchronizedObject){

			/* 查询具有逾期天数的催收区间设定表 */
			List<PlmsCollectionRuleSetDto> poolRuleList = plmsCollectionRuleSetService.selectworkOrderPoolRulesList();

			// 1,流转一般情况（没结清，非保护）下数据的状态
			updatecircuNormalData(poolRuleList);

			// 2.查找已经结清的数据，并修改其在贷后中的状态
			updatecircuClearData(poolRuleList);

			// 从微贷系统中导入新的逾期数据
			AddNewData(poolRuleList);

		}
	}

	/**
	* @Description: 自动分配
	*/
	@Override
	public void updateAutoAlloc() {
		logger.info("----系统跑批：自动分配催收员开始----");
		
		//Map<String,Integer> countMap = new LinkedHashMap<String,Integer>();
		//int upperLimit = 0;
		
		PlmsUserUpperLimitExample exampLimit = new PlmsUserUpperLimitExample();
		exampLimit.setIsActive("Y");
		//有分配上限的列表
		List<PlmsUserUpperLimit> limitList = plmsUserUpperLimitService.selectByExample(exampLimit);
		/**
		 * 月初数据的处理
		 */
		if(this.isFirstOfMonth()){
			/**
			 * 1.不管是否是自动分配，贷后管理部(m1m2)在月初分配新数据前，需将上月库存打乱重新分配
			 */
			logger.info("----系统跑批：月初m1m2区间重新打乱库存重新分配开始----");
			PlmsCollectionRuleSetExample example= new PlmsCollectionRuleSetExample();
			List<String> values = new ArrayList<String>();
			values.add("M1");
			values.add("M2");
			example.createCriteria().andCircuRuleCodeIn(values).andIsActiveEqualTo("Y");
			List<PlmsCollectionRuleSet> mList= plmsCollectionRuleSetService.selectByExampleList(example);
			//流转规则为M1M2的区间，月初要将库存重新分配
			if(mList!=null&&mList.size()>0){
				for(PlmsCollectionRuleSet rset:mList){
					//库存数据按逾期天数 升序排序
					List<PlmsWorkOrderAssignDto> oldList = plmsWorkOrderPoolService.selectOldCircuAssignedList(rset.getStatus());
					if(oldList!=null&&oldList.size()>0){
						logger.info("----区间"+rset.getName()+"共有"+oldList.size()+"条库存记录需要重新分配----");
						List<Long> payments = new ArrayList<Long>();
						List<Long> payments2 = new ArrayList<Long>();
						for(PlmsWorkOrderAssignDto dto : oldList){
							payments.add(dto.getPaymentId());
							payments2.add(dto.getPaymentId());
						}
						//a,处理库存数据的催收分配状态
						this.searchToUpdateAllocData(payments);
						//b,处理库存数据的代理催收分配状态
						this.searchToUpdateAgentData(payments2);
						
						Map<String,Object> map = new HashMap<String,Object>();
						map.put("groupId", Integer.parseInt(rset.getStatus()));
						map.put("status", rset.getStatus());
						map.put("circuRuleCode", rset.getCircuRuleCode());
						//对应区间催收员列表
						List<PlmsEmpCollectDto> empCollectList = plmsEmpCollectSetService.selectDtoByExampleList(map);
						//记录有分配上限的催收员和分配到的案件数
						Map<String,Integer> userCountMap = new LinkedHashMap<String,Integer>();
						////记录有分配上限的催收员和上限数
						Map<String,Integer> upperLimitMap = new LinkedHashMap<String,Integer>();
						
						if(empCollectList!=null&&empCollectList.size()>0){
							if(limitList!=null&&limitList.size()>0){
								for(PlmsEmpCollectDto d:empCollectList){
									if(d.getRoleIds()!=null&&d.getOrgId()!=null){
									for(PlmsUserUpperLimit limit :limitList){
											if(limit.getOrgId().longValue()==d.getOrgId().longValue()&&d.getRoleIds().contains(Long.toString(limit.getRoleId()))){
												userCountMap.put(d.getUserId(), d.getMonthCaseCount());
												upperLimitMap.put(d.getUserId(), limit.getUpperLimit());
											}
										}
									}
								}
							}
							//重新添加新的分配记录
							//人员随机排序
							Collections.shuffle(empCollectList);
							if(userCountMap.size()>0){
								this.addAllocUpperLimit_(oldList, empCollectList,upperLimitMap,userCountMap);	
							}else{
								this.addAllocNoUpper(oldList, empCollectList);
							}
						}else{
							logger.info("----区间"+rset.getName()+"没有对应的催收人员----");
						}					
					}else{
						logger.info("----区间"+rset.getName()+"原有库存量为0----");
					}
				}
			}
		}
		
		//需要自动分配的区间
		List<PlmsCollectionRuleSet> autoAssigndList = this.getAutoAssignSet();
		if(autoAssigndList!=null&&autoAssigndList.size()>0){			
			for(PlmsCollectionRuleSet p:autoAssigndList){								
				List<PlmsWorkOrderAssignDto> dList = plmsWorkOrderPoolService.selectNewCircuNotAssignList(p.getStatus());
				if(dList==null||dList.size()==0){
					logger.info("-------------区间："+p.getName()+"今日没有新增案件--------");
				}else{
					if(p.getAssignRuleCode().equals("AVRG_DIST")){
						
						Map<String,Object> map = new HashMap<String,Object>();
						map.put("groupId", p.getId());
						map.put("status", p.getStatus());
						map.put("circuRuleCode", p.getCircuRuleCode());
						
						List<PlmsEmpCollectDto> empCollectList =new ArrayList<PlmsEmpCollectDto>();
						if(this.isFirstOfMonth()){
							//人员先按【月初库存个数】进行升序排序，再按【月初库存剩余本金】进行升序排序；
							empCollectList = plmsEmpCollectSetService.selectCollectorByExampleList(map);
						}else{
							//人员先按【月新增累计库存】升序排序，再按【月新增累计库存剩余本金】升序排序
							empCollectList = plmsEmpCollectSetService.selectDtoByExampleList(map);
						}
						//记录有分配上限的催收员和分配到的案件数
						Map<String,Integer> userCountMap = new LinkedHashMap<String,Integer>();
						////记录有分配上限的催收员和上限数
						Map<String,Integer> upperLimitMap = new LinkedHashMap<String,Integer>();
						if(empCollectList!=null&&empCollectList.size()>0){
							if(limitList!=null&&limitList.size()>0){
								for(PlmsEmpCollectDto d:empCollectList){
									if(d.getRoleIds()!=null&&d.getOrgId()!=null){
									for(PlmsUserUpperLimit limit :limitList){
											if(limit.getOrgId().longValue()==d.getOrgId().longValue()&&d.getRoleIds().contains(Long.toString(limit.getRoleId()))){
												userCountMap.put(d.getUserId(), d.getMonthCaseCount());
												upperLimitMap.put(d.getUserId(), limit.getUpperLimit());
											}
										}
									}
								}
							}
							//重新添加新的分配记录
							if(userCountMap.size()>0){
								this.addAllocUpperLimit_(dList, empCollectList,upperLimitMap,userCountMap);	
							}else{
								this.addAllocNoUpper(dList, empCollectList);
							}
						}else{
							logger.info("----区间"+p.getName()+"没有对应的催收人员----");
						}					
					}else if(p.getAssignRuleCode().equals("WORK_MORE")){
												
							Map<String,Object> tmap = new HashMap<String,Object>();
							tmap.put("status", p.getStatus());
							tmap.put("time", "yesterday");
							List<PlmsLaCollectRec> recList = plmsLaCollectRecService.selectByTime(tmap);
							//催收员按前一天个人回收案件数降序排序
							List<PlmsEmpCollectDto> empCollectRecList = this.selectCollectorCaseCount(p.getStatus(),"yesterday");
							//记录有分配上限的催收员和分配到的案件数
							Map<String,Integer> userCountMap = new LinkedHashMap<String,Integer>();
							////记录有分配上限的催收员和上限数
							Map<String,Integer> upperLimitMap = new LinkedHashMap<String,Integer>();
							if(limitList!=null&&limitList.size()>0){
								for(PlmsEmpCollectDto d:empCollectRecList){
									if(d.getRoleIds()!=null&&d.getOrgId()!=null){
									for(PlmsUserUpperLimit limit :limitList){
											if(limit.getOrgId().longValue()==d.getOrgId().longValue()&&d.getRoleIds().contains(Long.toString(limit.getRoleId()))){
												userCountMap.put(d.getUserId(), d.getMonthCaseCount());
												upperLimitMap.put(d.getUserId(), limit.getUpperLimit());
											}
										}
									}
								}
							}
							//1,前一天区间回收案件数不为0,按公式一
							if(recList!=null&&recList.size()>0){
								//昨天区间总共回收案件数
								int scopeCount = recList.size();
								if(empCollectRecList.size()>0){
									//记录满足上限需要移除的催收员
									Map<String,Integer> mapT = new HashMap<String,Integer>();
									if(userCountMap.size()>0){
										 for (String key : userCountMap.keySet()) {
											 if(upperLimitMap.get(key).intValue()<=userCountMap.get(key).intValue()){
												 mapT.put(key, userCountMap.get(key));
												 Iterator <PlmsEmpCollectDto> it = empCollectRecList.iterator(); 
												 while(it.hasNext()){
													 PlmsEmpCollectDto dto = it.next();
													 if(dto.getUserId().equals(key)){
														 it.remove();
													 }
												 }
											 }
										 }
									}
									if(mapT.size()>0){
										 for (String key : mapT.keySet()) {
											 if(userCountMap.containsKey(key)){
												 upperLimitMap.remove(key);
												 userCountMap.remove(key);					 }
										 }

									 }
									
									//第一轮分配需确保每人都分得一个，若新增案件数小于催收员个数，则先分配给前几个催收员
									if(dList.size()<=empCollectRecList.size()){
										int index = 0;
										List<PlmsLaCollectAlloc> allocAddList = new ArrayList<PlmsLaCollectAlloc>();
										//催收记录列表
										//List<PlmsLaCollectionRecord> recordList = new ArrayList<PlmsLaCollectionRecord>();
										
										for(PlmsWorkOrderAssignDto adto:dList){
											PlmsLaCollectAlloc addAlloc =  new PlmsLaCollectAlloc();
											//PlmsLaCollectionRecord record = new PlmsLaCollectionRecord();
											String userId = empCollectRecList.get(index).getUserId();
											addAlloc.setCollector(userId);
											this.setAllocModel(adto, addAlloc);
											//this.setCollectionRecord(adto,record);
											allocAddList.add(addAlloc);
											//recordList.add(record);
											index++;
										}
										//添加新的催收记录
										if(allocAddList!=null&&allocAddList.size()>0){
											plmsLaCollectAllocService.insertBatch(allocAddList);
										}
										//添加催收记录
//										if(recordList!=null&&recordList.size()>0){
//											plmsLaCollectionRecordService.insertBatch(recordList);
//										}
										
									}else{
										
										this.addAllocWorkMoreUpperLimit_(dList, empCollectRecList,scopeCount,upperLimitMap,userCountMap);								
									}
									//记录本区间本日的催收人员排序方式到PLMS_COLLECTION_RULE_SET（降序）desc
									this.setEmpOrderType(p.getId(),"desc");
								}else{
									
									logger.info("区间"+p.getName()+"没有相应的催收人员");
								}									
							}//2,前一天区间回收案件数为0
							else{
								Map<String,Object> tmap02 = new HashMap<String,Object>();
								tmap02.put("status", p.getStatus());
								tmap02.put("time", "before");
								//前两天区间回收案件数
								List<PlmsLaCollectRec> beforeList = plmsLaCollectRecService.selectByTime(tmap02);
								//当月个人累计回收案件数,催收员按回收案件数降序排列
								List<PlmsEmpCollectDto> empMonthCollectList = this.selectCollectorCaseCount(p.getStatus(),"month");
								List<PlmsEmpCollectDto> empbeforeCollectList = this.selectCollectorCaseCount(p.getStatus(),"theBeforemonth");
								/**
								 * 昨天回收案件数为0，前天不为0
								 */
								if(beforeList!=null&&beforeList.size()>0){
									//所有催收员当月个人累计回收案件数都为0(最多案件数的为0则都为0)
									if(empMonthCollectList.get(0).getMonthCaseCount()==0){
										//所有催收员上月个人累计回收案件数都为0(最多案件数的为0则都为0)
										if(empbeforeCollectList.get(0).getMonthCaseCount()==0){

											Collections.shuffle(empbeforeCollectList);//人员随机排序
											this.addAllocUpperLimit_(dList, empbeforeCollectList,upperLimitMap,userCountMap);

											//记录本区间本日的催收人员排序方式到PLMS_COLLECTION_RULE_SET （随机）
											this.setEmpOrderType(p.getId(),"random");
										}else{
											//进队催收人员根据回收案件数不为0的做降序排列，为0的随机排序
											List<PlmsEmpCollectDto> empList = empOrder(empbeforeCollectList,"desc");
											//this.addAllocNoUpper(dList, empList);
											this.addAllocUpperLimit_(dList, empList,upperLimitMap,userCountMap);
											//记录本区间本日的催收人员排序方式到PLMS_COLLECTION_RULE_SET （升序）
											this.setEmpOrderType(p.getId(),"desc");

										}
									}else{
										//按催收员回收案件数降序排列
										//已排好数据按照人员排序结果循环分配
										List<PlmsEmpCollectDto> empList = empOrder(empMonthCollectList,"desc");
										//this.addAllocNoUpper(dList, empList);
										this.addAllocUpperLimit_(dList, empList,upperLimitMap,userCountMap);
										this.setEmpOrderType(p.getId(),"desc");
									}	
								}/**连续两天区间回收案件数为0*/
								else{
									String orderType = p.getOrderType();
									//若前一天催收人员排序方法为降序
									if("desc".equals(orderType)){
										if(empMonthCollectList.get(0).getMonthCaseCount()==0){
											if(empbeforeCollectList.get(0).getMonthCaseCount()==0){
												Collections.shuffle(empbeforeCollectList);//人员随机排序
												//this.addAllocNoUpper(dList, empbeforeCollectList);
												this.addAllocUpperLimit_(dList, empbeforeCollectList,upperLimitMap,userCountMap);
												//记录本区间本日的催收人员排序方式到PLMS_COLLECTION_RULE_SET （随机）
												this.setEmpOrderType(p.getId(),"random");

											}else{
												//进队催收人员根据回收案件数不为0的做降序排列，为0的随机排序
												List<PlmsEmpCollectDto> empList = empOrder(empbeforeCollectList,"asc");
												//this.addAllocNoUpper(dList, empList);
												this.addAllocUpperLimit_(dList, empList,upperLimitMap,userCountMap);
												//记录本区间本日的催收人员排序方式到PLMS_COLLECTION_RULE_SET （升序）
												this.setEmpOrderType(p.getId(),"asc");
											}
										}else{
											List<PlmsEmpCollectDto> empList = empOrder(empMonthCollectList,"asc");
											//this.addAllocNoUpper(dList, empList);
											this.addAllocUpperLimit_(dList, empList,upperLimitMap,userCountMap);
											this.setEmpOrderType(p.getId(),"asc");
										}
									}else{
										if(empMonthCollectList.get(0).getMonthCaseCount()==0){
											if(empbeforeCollectList.get(0).getMonthCaseCount()==0){
												Collections.shuffle(empbeforeCollectList);//人员随机排序
												//this.addAllocNoUpper(dList, empbeforeCollectList);
												this.addAllocUpperLimit_(dList, empbeforeCollectList,upperLimitMap,userCountMap);
												//记录本区间本日的催收人员排序方式到PLMS_COLLECTION_RULE_SET （随机）
												this.setEmpOrderType(p.getId(),"random");
											}else{
												//催收人员根据回收案件数做降序排列，故此处不需要再操作
												List<PlmsEmpCollectDto> empList = empOrder(empbeforeCollectList,"desc");
												//this.addAllocNoUpper(dList, empList);
												this.addAllocUpperLimit_(dList, empList,upperLimitMap,userCountMap);
												//记录本区间本日的催收人员排序方式到PLMS_COLLECTION_RULE_SET （降序）
												this.setEmpOrderType(p.getId(),"desc");
											}
										}else{
											List<PlmsEmpCollectDto> empList = empOrder(empMonthCollectList,"desc");
											//this.addAllocNoUpper(dList, empList);
											this.addAllocUpperLimit_(dList, empList,upperLimitMap,userCountMap);
											this.setEmpOrderType(p.getId(),"desc");
										}	
									}
									
								}
							}
						
					}//网点分配
					else if(p.getAssignRuleCode().equals("DOT_DIST")){
						//存储各网点的及其对应的案件
						Map<String,List<PlmsWorkOrderAssignDto>> map = new HashMap<String,List<PlmsWorkOrderAssignDto>>();
						for(PlmsWorkOrderAssignDto dto:dList){
							String sideCode = dto.getSiteCode();
							if(sideCode.equals("881")||sideCode.equals("882")){
								sideCode = dto.getSignCode();
							}
							if(map.containsKey(sideCode)){
								List<PlmsWorkOrderAssignDto> list =map.get(sideCode);
								list.add(dto);
								map.put(sideCode,list);
							}else{
								List<PlmsWorkOrderAssignDto> temp = new ArrayList<PlmsWorkOrderAssignDto>();
								temp.add(dto);
								map.put(sideCode, temp);
							}	
						}
						if(map.size()>0){
							for(String key:map.keySet()){
								List<PlmsWorkOrderAssignDto> oneList = map.get(key);
								//此网点的案件先按业务类型排序，然后按剩余本金降序排
								Collections.sort(oneList, getComparaOfSiteCase());
								//此网点对应的催收员
								Map<String,Object> mapCo = new HashMap<String,Object>();
								mapCo.put("groupId", p.getId());
								mapCo.put("status", p.getStatus());
								mapCo.put("circuRuleCode", p.getCircuRuleCode());
								mapCo.put("siteCode", key);
								List<PlmsEmpCollectDto> empCollectList =new ArrayList<PlmsEmpCollectDto>();
								if(this.isFirstOfMonth()){
									//人员先按【月初库存个数】进行升序排序，再按【月初库存剩余本金】进行升序排序；
									empCollectList = plmsEmpCollectSetService.selectCollectorByExampleList(mapCo);
								}else{
									//人员先按【月新增累计库存】升序排序，再按【月新增累计库存剩余本金】升序排序
									empCollectList = plmsEmpCollectSetService.selectDtoByExampleList(mapCo);
								}
								if(empCollectList.size()>0){
									this.addAllocNoUpper(oneList, empCollectList);
								}else{
									logger.info("网点"+key+"所对应的机构下没有催收员");
								}

							}
						}
					}
				}
	
			}
			
		}
		
		logger.info("----系统跑批：自动分配催收员结束----");
	}

	/**
	* @Description: 分两段进行排序
	* @param empCollectList
	* @param order
	* @return List<PlmsEmpCollectDto>
	*/
	private List<PlmsEmpCollectDto> empOrder(List<PlmsEmpCollectDto> empCollectList,String order){
		List<PlmsEmpCollectDto> equalZoreList = new ArrayList<PlmsEmpCollectDto>();
		List<PlmsEmpCollectDto> notEqualZoreList = new ArrayList<PlmsEmpCollectDto>();		
		List<PlmsEmpCollectDto> empList = new ArrayList<PlmsEmpCollectDto>();
		for(PlmsEmpCollectDto cdto:empCollectList){
			if(cdto.getMonthCaseCount()==0){
				equalZoreList.add(cdto);
			}else{
				notEqualZoreList.add(cdto);
			}
		}
		Comparator<PlmsEmpCollectDto> comparatoCollector = getComparaOfCollector("WORK_MORE",order);
		Collections.sort(notEqualZoreList, comparatoCollector);
		Collections.shuffle(equalZoreList);
		empList.addAll(0, notEqualZoreList);
		empList.addAll(1, equalZoreList);
		return empList;
		
	}

	/**
	* @Description: 一般数据流转
	* @param poolRuleList
	*/
	private void updatecircuNormalData(List<PlmsCollectionRuleSetDto>	poolRuleList){
		logger.info("----系统跑批：已存在且未结清的数据进行流转开始----");
		Map<String,Object> nmap = new HashMap<String,Object>();
		nmap.put("statu", "circu");
		//从贷后系统中查询的(有逾期天数限制的,提前移交的)需要流转的数据
		List<PlmsWorkOrderPoolDto> circuListAll = plmsWorkOrderPoolService.selectExitsReceiveOverdue(nmap);
		
		//豁免中处于提交状态的案件
		Map<String,Object> waiveMap = new HashMap<String,Object>();
		waiveMap.put("status", "SUBMITTED");
		List<PlmsFeeWaiveApprovalResultDto> feeWaiveList = plmsWorkOrderPoolService.searchFeeWaiveApproval(waiveMap);
		//保护规则之一：员工离职，此员工负责催收的案件进入保护队列，不再进行区间的流转
		List<PlmsEmpCollectSet> quitList = plmsEmpCollectSetService.searchIsquitCollector();
		//提前移交区间的状态值
		String tansferStatus = plmsCollectionRuleSetService.selectStatusByCircuCode("TRANINAD");

		
		 //获取事务管理器
        DataSourceTransactionManager transactionManager = (DataSourceTransactionManager)AppContext.getBean("transactionManager");
		if(circuListAll != null && circuListAll.size() > 0){
			int sizeAll = circuListAll.size();
			List<PlmsWorkOrderPoolDto> circuList = new ArrayList<PlmsWorkOrderPoolDto>();
			List<PlmsWorkOrderPoolDto> circuList_copy = new ArrayList<PlmsWorkOrderPoolDto>();
			while(circuListAll.isEmpty()==false){
				
           	 	 int countT = 2000;
				 for(PlmsWorkOrderPoolDto poolDto:circuListAll){
		            	if(countT==0) break;
		            	else{
		            		circuList.add(poolDto);
		            		circuList_copy.add(poolDto);
		            		countT--;
		            	}
		         }
			
				 if(circuList!=null&&circuList.size()>0){
					 
					 List<PlmsWorkOrderPoolLog> circuLogList = new ArrayList<PlmsWorkOrderPoolLog>();

					 DefaultTransactionDefinition def = new DefaultTransactionDefinition();
                     def.setPropagationBehavior(TransactionDefinition.PROPAGATION_REQUIRES_NEW);          // 事物隔离级别,开启新事务
                     TransactionStatus status = transactionManager.getTransaction(def);                   // 获得事务状态
               	
	                 try{ 	  
	         			//月初直接流转，不过滤
	                	 if(this.isFirstOfMonth()){
	                		 
	                		 
	                	 }else{
	                		//员工离职A情况:微贷系统已离职，贷后系统还是有效状态
	 	         			if(quitList!=null&&quitList.size()>0){
	 	         				//a,将此员工在贷后中的状态设为无效
	 	         				//b,此催收员所负责的案件不流转
	 	         				for(PlmsEmpCollectSet cset:quitList){
//	 	         					cset.setIsActive("N");
//	 	         					cset.setUpdatedBy("system");
//	 	         					cset.setUpdateTime(new Date());
//	 	         					plmsEmpCollectSetService.update(cset);
	 	         					PlmsLaCollectAllocExample allocExample = new PlmsLaCollectAllocExample();
	 	         					allocExample.createCriteria().andCollectorEqualTo(cset.getUserId()).andAllocEndDateIsNull().andIsActiveEqualTo("Y");
	 	         					//此催收员所负责的案件
	 	         					List<PlmsLaCollectAlloc> allocList = plmsLaCollectAllocService.selectByExample(allocExample);
	 	         					if(allocList!=null&&allocList.size()!=0){
	 	         						Iterator<PlmsWorkOrderPoolDto> iter=circuList.iterator();
	 	         						while(iter.hasNext()){
	 	         							PlmsWorkOrderPoolDto poolDto =  iter.next();
	 	         							for(PlmsLaCollectAlloc alloc:allocList){
	 	         								if(poolDto.getPaymentId().longValue() == alloc.getPaymentId().longValue()){
	 	         									PlmsWorkOrderPoolLog log = new PlmsWorkOrderPoolLog();
	 	         									PlmsWorkOrderPoolExample paymentIdExample = new PlmsWorkOrderPoolExample();
	 	         									paymentIdExample.createCriteria().andPaymentIdEqualTo(alloc.getPaymentId());
	 	         									PlmsWorkOrderPool pool = plmsWorkOrderPoolService.selectByExampleList(paymentIdExample).get(0);
	 	         									//1:离职
	 	         									log.setDefendStatus("4");
	 	         									log.setStatus(pool.getStatus());
	 	         									setLogModel(poolDto,log,"update");
	 	         									circuLogList.add(log);	
	 	         									iter.remove();
	 	         								}
	 	         							}
	 	         							
	 	         						}
	 	         					}
	 	         					
	 	         				}
	 	         				
	 	         			}//员工离职B情况:微贷系统已离职，贷后系统无效状态
	 	         			else{
	 	         				//直接不流转
	 	         				PlmsEmpCollectSetExample noActiveExample = new PlmsEmpCollectSetExample();
	 	         				noActiveExample.createCriteria().andIsActiveEqualTo("N");
	 	         				List<PlmsEmpCollectSet> noActiveList = plmsEmpCollectSetService.selectByExampleList(noActiveExample);
	 	         				List<String> userIdList = new ArrayList<String>();
	 	         				if(noActiveList!=null&&noActiveList.size()>0){
	 	         					for(PlmsEmpCollectSet cset:noActiveList){
	 	         						userIdList.add(cset.getUserId());
	 	         					}
	 	         					if(userIdList.size()>0){
	 	         						PlmsLaCollectAllocExample allocExample = new PlmsLaCollectAllocExample();
	 	         						allocExample.createCriteria().andCollectorIn(userIdList).andAllocEndDateIsNull().andIsActiveEqualTo("Y");
	 	         						List<PlmsLaCollectAlloc> allocList = plmsLaCollectAllocService.selectByExample(allocExample);
	 	         						if(allocList!=null&&allocList.size()!=0){
	 	         							Iterator<PlmsWorkOrderPoolDto> iter=circuList.iterator();
	 	         							while(iter.hasNext()){
	 	         								PlmsWorkOrderPoolDto poolDto =  iter.next();
	 	         								for(PlmsLaCollectAlloc alloc:allocList){
	 	         									if(poolDto.getPaymentId().longValue() == alloc.getPaymentId().longValue()){
	 	         										iter.remove();
	 	         									}
	 	         								}
	 	         								
	 	         							}
	 	         						}
	 	         					}
	 	         					
	 	         				}
	 	         			} 
	                		 
	                	 }
	                	 
	                	 
	         			//保护规则之二：降期 除了每月一号m2区间的数据重新流转，否则M2区间的数据只能顺流到委外区间，其余情况一直在m2区间，降期的数据进入保护队列
	         			if(this.isFirstOfMonth()){
	         				//1号正常流转
	         			}else{
	         				//M2区间的数据只能顺流到委外区间，其余情况一直在m2区间，降期的数据进入保护队列
	         				PlmsCollectionRuleSet ruleSet = plmsCollectionRuleSetService.selectByCircuCode("M2");
	         				String m2Status = ruleSet.getStatus();
	         				PlmsCircuRuleSetExample circuExample = new PlmsCircuRuleSetExample();
	         				circuExample.createCriteria().andCodeEqualTo("M2").andIsActiveEqualTo("Y");
	         				PlmsCircuRuleSet circuRule = plmsCircuRuleSetMapper.selectByExample(circuExample).get(0);
	         				Long overduedaysTo = circuRule.getOverduedaysTo();
	         				Long overduedaysFrom = circuRule.getOverduedaysFrom();
	         				
	         				Iterator<PlmsWorkOrderPoolDto> iter=circuList.iterator();
	         				while(iter.hasNext()){
	         					PlmsWorkOrderPoolDto poolDto = iter.next();
	         						if(poolDto.getStatus().equals(m2Status)){
	         							if(poolDto.getOverDays()>overduedaysTo){
	         								//自动流入下个区间
	         							}else{
//	         								//其他情况不流转
//	         								Map<String,Object> map = new HashMap<String,Object>();
//	         								map.put("applId", pool.getApplId());
//	         								//此案件最新的日志记录
//	         								PlmsWorkOrderPoolLog poollog = plmsWorkOrderPoolLogService.searchTheLogMaxDate(map).get(0);
//	         								if(poollog.getDefendStatus()!=null&&poollog.equals("3")){
//	         									//直接不流转
//	         									iter.remove();
//	         								}else{
//	         									PlmsWorkOrderPoolLog log = new PlmsWorkOrderPoolLog();
//	         									//如逾期天数减小则说明降期
//	         									if(poolDto.getOverDays()<overduedaysFrom){
//	         										//3:降期
//	         										log.setDefendStatus("3");
//	         										log.setStatus(m2Status);
//	         										setLogModel(poolDto,log,"update");
//	         										circuLogList.add(log);
//	         										iter.remove();
//	         									}
//	         								}
	         								//如逾期天数减小则说明降期
	         								if(poolDto.getOverDays()<overduedaysFrom){
	         									PlmsWorkOrderPoolLog log = new PlmsWorkOrderPoolLog();
	         									//3:降期
	         									log.setDefendStatus("3");
	         									log.setStatus(m2Status);
	         									setLogModel(poolDto,log,"update");
	         									circuLogList.add(log);
	         									iter.remove();
	         								}
	         							}
	         					}
	         				}
	         			}
	         			
	         			//保护规则之三：豁免
	         			//查询已在豁免保护队列中的案件，根据微贷查询结果判断是否进入 豁免--待流转 状态，案件不流转
	         			if(circuList!=null&&circuList.size()>0){
	         				List<Long> applIdList = new ArrayList<Long>();
	         				List<Long> applIdListTemp = new ArrayList<Long>();
	         				for(PlmsWorkOrderPoolDto poolDto:circuList){
	         					applIdList.add(poolDto.getApplId());
	         				}
	         				//sql in语句 最多处理1000条，此处每次处理500条
	         				while(applIdList.isEmpty()==false){
		         				 int count = 500;
		         				 for(Long applId:applIdList){
		         		            	if(count==0) break;
		         		            	else{
		         		            		applIdListTemp.add(applId);
		         		            		count--;
		         		            	}
		         				 }
		         				 
		         				Map<String,Object> mapLog = new HashMap<String,Object>();
		         				mapLog.put("applIds", applIdListTemp);
		         				mapLog.put("defendStatus", "2");
		         				//已在豁免保护队列中的案件
		         				List<PlmsWorkOrderPoolLog> logList =  plmsWorkOrderPoolLogService.searchTheLogMaxDate(mapLog);
		         				if(logList!=null&&logList.size()>0){
		         					Iterator<PlmsWorkOrderPoolDto> iter=circuList.iterator();
			         				 while(iter.hasNext()){
			         						PlmsWorkOrderPoolDto poolDto = iter.next();
			         						//当保留数据中有重复的applId时，只去除一遍，否则会报错
			         						Map<Long,Object> mapT = new HashMap<Long,Object>();
			         						for(PlmsWorkOrderPoolLog wavielog:logList){
			         							if(poolDto.getApplId().longValue()==wavielog.getApplId().longValue()){
			         								//不流转
			         								if(!mapT.containsKey(poolDto.getApplId().longValue())){
			         									PlmsWorkOrderPoolLog log = new PlmsWorkOrderPoolLog();
			         									//2:豁免
			         									log.setDefendStatus("2");
			         									log.setStatus(poolDto.getStatus());
			         									if(feeWaiveList!=null&&feeWaiveList.size()>0){
			         										boolean exits = true;
			         										Iterator<PlmsFeeWaiveApprovalResultDto> feeWaiveIter = feeWaiveList.iterator();
			         										while(feeWaiveIter.hasNext()){
			         											PlmsFeeWaiveApprovalResultDto feeWaive =  feeWaiveIter.next();
			         											if(feeWaive.getApplId().longValue()==wavielog.getApplId().longValue()){
			         												feeWaiveIter.remove();
			         												exits = false;
			         												break;
			         											}
			         											
			         										}
			         										if(exits){
			         											log.setWaivdeStatus("2");//豁免待流转
			         										}else{
			         											log.setWaivdeStatus("1");//豁免保护中
			         										}
			         									}else{
				         									log.setWaivdeStatus("2");//豁免待流转
			         									}
			         									setLogModel(poolDto,log,"update");
			         									circuLogList.add(log);
			         									iter.remove();
			         								}
			         								mapT.put(poolDto.getApplId().longValue(), true);
			         								
			         							}
			         						}
			         				 }
		         				}
		         				
			         				applIdList.removeAll(applIdListTemp);
			         				applIdListTemp.clear();
		         				}
	         				
	         				}
	         				
	         				
	         			//处在已提交状态的豁免案件，进入 豁免--保护中 状态，案件不流转	
	         			if(feeWaiveList!=null&&feeWaiveList.size()>0){
	         				Iterator<PlmsWorkOrderPoolDto> iter=circuList.iterator();
	         				 while(iter.hasNext()){
	         						PlmsWorkOrderPoolDto poolDto = iter.next();
	         						//当保留数据中有重复的applId时，只去除一遍，否则会报错
	         						Map<Long,Object> mapT = new HashMap<Long,Object>();
	         						for(PlmsFeeWaiveApprovalResultDto feeWaive:feeWaiveList){
	         							if(poolDto.getApplId().longValue()==feeWaive.getApplId().longValue()){
	         								//不流转
	         								if(!mapT.containsKey(poolDto.getApplId().longValue())){
	         									PlmsWorkOrderPoolLog log = new PlmsWorkOrderPoolLog();
	         									//2:豁免
	         									log.setDefendStatus("2");
	         									log.setStatus(poolDto.getStatus());
	         									log.setWaivdeStatus("1");//豁免保护中
	         									setLogModel(poolDto,log,"update");
	         									circuLogList.add(log);
	         									iter.remove();
	         								}
	         								mapT.put(poolDto.getApplId().longValue(), true);
	         								
	         							}
	         						}
	         				 }
	         			}
	         			
	         			//保护规则之四：保留
	         			 Map<String,Object> remap = new HashMap<String,Object>();
	         			 remap.put("defendStatus", "1");
	         			 List<PlmsWorkOrderPoolLog> retainsList = plmsWorkOrderPoolLogService.searchTheLogMaxDate(remap);
	         			 if(retainsList!=null&&retainsList.size()>0){
	         				 Iterator<PlmsWorkOrderPoolDto> iter=circuList.iterator();
	         				 while(iter.hasNext()){
	         						PlmsWorkOrderPoolDto poolDto = iter.next();
	         						//当保留数据中有重复的applId时，只去除一遍，否则会报错
	         						Map<Long,Object> mapT = new HashMap<Long,Object>();
	         						for(PlmsWorkOrderPoolLog log:retainsList){
	         							if(poolDto.getApplId().longValue()==log.getApplId().longValue()){
	         								//不流转
	         								if(!mapT.containsKey(poolDto.getApplId().longValue())){
	         									iter.remove();
	         								}
	         								mapT.put(poolDto.getApplId().longValue(), true);
	         							}
	         						}
	         				 }
	         			 }

	         			//委外保留中的案件不流转
	                     //查询在委外保留流程中的借款ID集合(已去重)
	                     List<Long> outsrcKeepApplIdList = plmsWorkOrderPoolLogService.selectOutsrcKeepApplId();
	         			if(outsrcKeepApplIdList != null && outsrcKeepApplIdList.size()>0) {
	                         Iterator<PlmsWorkOrderPoolDto> iterator = circuList.iterator();
	         				 while(iterator.hasNext()){
	                              PlmsWorkOrderPoolDto poolDto = iterator.next();
	                              for(Long applId : outsrcKeepApplIdList){
	                                  //如果案件在委外保留中
	                                  if(applId - poolDto.getApplId() == 0){
	                                      //不流转
	                                      iterator.remove();
	                                  }
	                              }
	         				 }
	         				 
	         			}
	         			 
	         			//提前移交
	         			 PlmsLTransferAdvanceExample transferExample = new PlmsLTransferAdvanceExample();
	         			 List<String> statusT = new ArrayList<String>();
	         		     TransferStatusType[] values = TransferStatusType.values();
	         		     for(TransferStatusType val:values){
	                          if(val.name().contains("NOT_")){
	                              statusT.add(val.name());
	                          }
	         		     }
	         			 transferExample.createCriteria().andStatusIn(statusT);
	         			 List<PlmsLTransferAdvance>  transferList = plmsLTransferAdvanceService.selectByExample(transferExample);
	         			 if(transferList!=null&&transferList.size()>0){
	         				 Iterator<PlmsWorkOrderPoolDto> iter=circuList.iterator();
	         				 while(iter.hasNext()){
	         					 PlmsWorkOrderPoolDto poolDto = iter.next();
	         					//当提前移交数据中有重复的applId时，只去除一遍，否则会报错
	         					 Map<Long,Object> mapT = new HashMap<Long,Object>();
	         					 for(PlmsLTransferAdvance transfer:transferList){
	                                  if(poolDto.getApplId().longValue()==transfer.getApplId().longValue()){
	                                      //不流转
	                                      if(!mapT.containsKey(poolDto.getApplId().longValue())){
	                                          iter.remove();
	                                      }
	                                      mapT.put(poolDto.getApplId().longValue(), true);
	                                  }
	                              }
	         				 }
	         			 }
	         			 
	         			List<PlmsWorkOrderPool> circuPoolList = new ArrayList<PlmsWorkOrderPool>();
	                     //流入委外区间的案件信息集合
	         			List<AddOutsrcApplDto> addOutsrcApplList = new ArrayList<AddOutsrcApplDto>();

	         			if(poolRuleList != null && poolRuleList.size() > 0){
	         				for(PlmsWorkOrderPoolDto cp : circuList){
	         					PlmsWorkOrderPool pool = new PlmsWorkOrderPool();
	         					PlmsWorkOrderPoolLog log = new PlmsWorkOrderPoolLog();
	         					if(cp.getStatus()!=null){
	         						if(cp.getStatus().equals(tansferStatus)){
	         							//提前移交区间的流转
	         							setStatusTransfer(cp,pool,log);
	         						}else{
	    	         					//有逾期天数限制的区间流转
	         							setStatus(cp,pool,log,poolRuleList);
	         						}
	         					}
	         					if(cp.getStatus()==null||pool.getStatus()==null){
	         						logger.info("------此案件不属于任何区间，合同编号为："+cp.getCntrctNo()+"-------");
	         					}else if(cp.getStatus().equals(pool.getStatus())){
	         						
	         					}else{
	         						//更换了区间的案件集合
	         						/*工单池数据*/
		         					pool.setPaymentId(cp.getPaymentId());
		         					pool.setUpdateTime(new Date());
		         					pool.setRecVer(cp.getRecVer());
		         					circuPoolList.add(pool);
		         					/*工单日志数据*/
		         					setLogModel(cp,log,"update");
		         					circuLogList.add(log);		
	         					}

	                             //判断需要修改的案件集合,如果流转进委外区间的,新增委外申请并预分配
	                             String circuRuleCode = pool.getCircuRuleCode();
	                             if(!StringUtil.isEmpty(circuRuleCode) && "OUTSOURC".equals(circuRuleCode)){
									 //根据借款ID和委外日期校验案件是否在委外流程
									 boolean check = plmsLaApplOutsrcService.selectCheck(cp.getApplId(),new Date());
									 if(!check){
										 AddOutsrcApplDto outsrcApplDto = new AddOutsrcApplDto();
										 outsrcApplDto.setApplId(cp.getApplId());
										 outsrcApplDto.setPaymentId(cp.getPaymentId());
										 outsrcApplDto.setCntrctId(cp.getCntrctId());

										 Integer overduePeriod = cp.getOverduePeriod();
										 if(overduePeriod != null){
											 outsrcApplDto.setOverduePeriod(Long.valueOf(overduePeriod));
										 }

										 outsrcApplDto.setRegionId(cp.getRegionId());
										 outsrcApplDto.setIdCardNo(cp.getDocno());
										 outsrcApplDto.setOverDays(cp.getOverDays());
										 outsrcApplDto.setCntrctNo(cp.getCntrctNo());
										 outsrcApplDto.setPoolStatus(cp.getStatus());
										 outsrcApplDto.setAllot(cp.getCollector());
										 addOutsrcApplList.add(outsrcApplDto);
									 }
	                             }
	         				}
	         			}

	                     //如果有流转进委外区间的,新增委外申请并预分配
	                    plmsLaApplOutsrcService.saveAutoAppl(addOutsrcApplList,"自动流转进入委外区间","system","系统用户");

	         			//批量修改工单池中的数据
	         			plmsWorkOrderPoolService.updateBatch(circuPoolList);

	         			//批量插入工单日志表中的数据
	         			plmsWorkOrderPoolLogService.insertBatch(circuLogList);

	         			//改变了催收区间的案件集合
	         			List<Long> changeStatusList = new ArrayList<Long>();
	         			List<Long> changeStatusList2 = new ArrayList<Long>();

	         			if(circuPoolList !=null && circuPoolList.size()>0){
	         				for(PlmsWorkOrderPool p:circuPoolList){	
		         				changeStatusList.add(p.getPaymentId());
		         				changeStatusList2.add(p.getPaymentId());
		         			}
	         			}
	         			
	         			//List<Long> changeStatusTempList = new ArrayList<Long>();
	         			/*Calendar cal = Calendar.getInstance();
	         			cal.add(Calendar.DATE,-1);
	         		    Date endDate = cal.getTime();*/
	         			//Date endDate = new Date();
	         		   //修改已经更换区间案件的催收员和代理催收员的记录
	         		   /* while(changeStatusList.isEmpty()==false){
	         				 int count = 500;
	         				 for(Long paymentId:changeStatusList){
	         		            	if(count==0) break;
	         		            	else{
	         		            		changeStatusTempList.add(paymentId);
	         		            		count--;
	         		            	}
	         		         }
	         				//1.修改催收表
	         				 PlmsLaCollectAllocExample exapAlloc = new PlmsLaCollectAllocExample();
	         				 exapAlloc.createCriteria().andAllocEndDateIsNull().andPaymentIdIn(changeStatusTempList).andIsActiveEqualTo("Y");
	         				 List<PlmsLaCollectAlloc> allocList = plmsLaCollectAllocService.selectByExample(exapAlloc);
	         				 if(allocList!=null&&allocList.size()>0){
	         					 for(PlmsLaCollectAlloc alloc:allocList){
	         						 alloc.setAllocEndDate(endDate);
	         						 alloc.setAllocType("AUTO");
	         						 alloc.setUpdatedBy("system");
	         						 alloc.setUpdateTime(endDate);
	         					 }
	         				     plmsLaCollectAllocService.updateBatch(allocList);
	         				 }	
	         				 
	         				 //2.修改催收代理表
	         				 searchToUpdateAgentData(changeStatusTempList);
	         				 Map<String,Object> mapA = new HashMap<String,Object>();
	         			     mapA.put("payments", changeStatusTempList);
	         			     mapA.put("mode", 2);
	         			     mapA.put("agentEnd", new Date());
	         				 List<PlmsLaCollectAgent> agentList = plmsLaCollectAgentService.selectByExample2(mapA);
	         				 if(agentList!=null&&agentList.size()>0){
	         					 for(PlmsLaCollectAgent agent:agentList){
	         						 agent.setAllocEndDate(endDate);
	         						 agent.setUpdateTime(new Date());
	         						 if(agent.getAllocBeginDate().compareTo(endDate)>0){
	         							 agent.setAllocBeginDate(endDate);
	         						 }
	         					 }
	         					 plmsLaCollectAgentService.updateBatch(agentList);
	         				 }
	         				 changeStatusList.removeAll(changeStatusTempList);
	         				 changeStatusTempList.clear(); 
	         			}	*/
	         			//1.修改催收表
	         			this.searchToUpdateAllocData(changeStatusList);
	         			//2.修改催收代理表
	         			this.searchToUpdateAgentData(changeStatusList2);
	         		    transactionManager.commit(status);                          //提交事务

	                    logger.info("成功将" + circuList_copy.size() + "条未结清的案件流转");
	                 }catch (Exception e){
		                    e.printStackTrace();
		                    transactionManager.rollback(status);                        //发生异常,事务回滚
		                    logger.error("未结清的数据进行流转出现异常:" + e.getMessage());
		             } 
						 
				 }
				 	 
				 circuListAll.removeAll(circuList_copy);
				 circuList.clear();
				 circuList_copy.clear();
			}
			
			logger.info("------共处理未结清数据流转"+sizeAll+"条-------");
			
		}else{
			logger.info("---------------------今日没有新流转数据");
		}
		//将已离职人员在催收员用户表中的状态置为无效
		if(quitList!=null&&quitList.size()>0){
			for(PlmsEmpCollectSet cset:quitList){
				cset.setIsActive("N");
				cset.setUpdatedBy("system");
				cset.setUpdateTime(new Date());
				plmsEmpCollectSetService.update(cset);
			}
		}

		logger.info("----系统跑批：已存在且未结清的数据进行流转完成----");
	}
	
	/**
	 * 
	* @Description: 提前移交流转规则
	* @param cp
	* @param pool
	* @param log
	* @param poolRuleList
	* @return void
	 */
	private void setStatusTransfer(PlmsWorkOrderPoolDto cp,
			PlmsWorkOrderPool pool, PlmsWorkOrderPoolLog log) {
		//提前移交区间的数据逾期天数超委外逾期天数时，流入委外区间
		Map<String,Object> map  = new HashMap<String, Object>();
		map.put("circuCode", "OUTSOURC");
		List<CollectionCircuDto> poolRuleList = plmsCollectionRuleSetService.selectCollectionCircu(map);
		if(poolRuleList!=null&&poolRuleList.size()>0){
			CollectionCircuDto outSourceCircuDto = poolRuleList.get(0);
			Long overduedaysFrom = outSourceCircuDto.getOverduedaysFrom();
			if(cp.getOverDays()!=null&&cp.getOverDays().longValue()>=overduedaysFrom.longValue()){
				pool.setCircuRuleCode(outSourceCircuDto.getCircuRuleCode());
				pool.setStatus(outSourceCircuDto.getStatus());
				log.setStatus(outSourceCircuDto.getStatus());
			}else{
				pool.setStatus(cp.getStatus());
				pool.setCircuRuleCode("TRANINAD");
				log.setStatus(cp.getStatus());
			}
		}
		
	}

	/**
	 * @Description:已结清的数据流转
	 * @param poolRuleList 流转规则集合
	 */
	private void updatecircuClearData(List<PlmsCollectionRuleSetDto> poolRuleList){
		logger.info("----系统跑批：已存在并已结清的数据进行流转开始----");
		/*工单池中已经不逾期的数据*/
		Map<String,Object> cmap = new HashMap<String,Object>();
		cmap.put("statu", "clear");
		//2）工单池表中单，查当天有还款，并且当结清的，更新状态为正常（0）
		List<PlmsWorkOrderPoolDto> clearListAll = plmsWorkOrderPoolService.selectExitsReceiveOverdue(cmap);
		if(clearListAll!=null&&clearListAll.size()>0){
			//获取事务管理器
			DataSourceTransactionManager transactionManager = (DataSourceTransactionManager)AppContext.getBean("transactionManager");
			//委外区间
			PlmsCollectionRuleSet ruleSet = plmsCollectionRuleSetService.selectByCircuCode("OUTSOURC");
			int sizeAll = clearListAll.size();
			List<PlmsWorkOrderPoolDto> clearList = new ArrayList<PlmsWorkOrderPoolDto>();
			List<PlmsWorkOrderPoolDto> clearList_copy = new ArrayList<PlmsWorkOrderPoolDto>();
			while(!clearListAll.isEmpty()){
				//每2000条一个事务
				int countT = 2000;
				for(PlmsWorkOrderPoolDto poolDto:clearListAll){
					if(countT==0) break;
					else{
						clearList.add(poolDto);
						clearList_copy.add(poolDto);
						countT--;
					}
				}

				if(clearList != null && clearList.size() > 0){

					DefaultTransactionDefinition def = new DefaultTransactionDefinition();
					def.setPropagationBehavior(TransactionDefinition.PROPAGATION_REQUIRES_NEW);          // 事物隔离级别,开启新事务
					TransactionStatus status = transactionManager.getTransaction(def);                   // 获得事务状态

					try{
						//此事务内需处理的放款IDS
						List<Long> payments = new ArrayList<Long>();
						//此事务内在委外区间的放款IDS
						List<Long> outsrcPayments = new ArrayList<Long>();
						for(PlmsWorkOrderPoolDto poolDto : clearList){
							payments.add(poolDto.getPaymentId());
							if(ruleSet != null && ruleSet.getStatus().equals(poolDto.getStatus())){
								outsrcPayments.add(poolDto.getPaymentId());
							}
						}

						/*
						 * 1,插入结清表PLMS_LA_COLLECT_REC
						 * 2,查看已结清的数据是否有催收员和代理催收员（a.修改催收表 b.修改催收代理表）
						 * 每次操作500条
						 */
						//用来处理真正的催收员
						List<Long> tempPayments = new ArrayList<Long>();
						//用来处理提前移交
						List<Long> transferPayments = new ArrayList<Long>();
						//不在委外的放款IDS,用来处理催收表和代理催收表
						List<Long> noOutsrcPayments = new ArrayList<Long>();
						while(!payments.isEmpty()){
							int count = 500;
							for(Long paymentId : payments){
								if(count==0) break;
								else{
									tempPayments.add(paymentId);
									transferPayments.add(paymentId);
									//如果不在委外区间
									if(!outsrcPayments.contains(paymentId)){
										noOutsrcPayments.add(paymentId);
									}
									count--;
								}
							}
							//a,插入结清表PLMS_LA_COLLECT_REC
							List<PlmsLaCollectRec> recList = new ArrayList<PlmsLaCollectRec>();
							//查找结清数据的真正催收员
							List<PlmsLaCollectRecDto> recDtoList = plmsEmpCollectSetService.judgeCollector(tempPayments);
							/*
							Calendar cal = Calendar.getInstance();
							cal.add(Calendar.DATE,-1);
							Date endDate = cal.getTime();
							*/
							Date endDate = new Date();
							for(PlmsLaCollectRecDto rdto:recDtoList){
								PlmsLaCollectRec rec = new PlmsLaCollectRec();
								rec.setRecDate(endDate);
								setRecModel(rdto,rec);
								recList.add(rec);
							}
							//插入结清表数据
							plmsLaCollectRecService.insertBatch(recList);

							//若结清或不逾期数据在提前移交队列中，则将提前移交中的状态设为END;
							for(Long paymentId : transferPayments){
								Map<String,Object> mapT = new HashMap<String,Object>();
								mapT.put("paymentId", paymentId);
								PlmsLTransferAdvance transfer = plmsLTransferAdvanceService.selectMaxDateTransferAdvanceByPaymentId(mapT);
								if(transfer != null){
									transfer.setStatus("END");
									transfer.setUpdatedBy("system");
									transfer.setUpdateTime(new Date());
									plmsLTransferAdvanceService.update(transfer);
								}
							}

							if(!noOutsrcPayments.isEmpty()){
								//b.修改催收表
								PlmsLaCollectAllocExample exapAlloc = new PlmsLaCollectAllocExample();
								exapAlloc.createCriteria().andAllocEndDateIsNull().andPaymentIdIn(noOutsrcPayments).andIsActiveEqualTo("Y");
								List<PlmsLaCollectAlloc> allocList = plmsLaCollectAllocService.selectByExample(exapAlloc);
								if(allocList!=null&&allocList.size()>0){
									for(PlmsLaCollectAlloc alloc:allocList){
										alloc.setAllocEndDate(endDate);
										alloc.setUpdateTime(new Date());
										alloc.setAllocType("AUTO");
										alloc.setUpdatedBy("system");
									}
									plmsLaCollectAllocService.updateBatch(allocList);
								}

								//c.修改催收代理表
								Map<String,Object> map = new HashMap<String,Object>();
								map.put("payments", noOutsrcPayments);
								map.put("mode", 2);
								List<PlmsLaCollectAgent> agentList = plmsLaCollectAgentService.selectByExample2(map);
								if(agentList!=null&&agentList.size()>0){
									for(PlmsLaCollectAgent agent:agentList){
										if(agent.getAllocBeginDate().compareTo(endDate)>0){
											agent.setIsActive("N");
										}else{
											agent.setAllocEndDate(endDate);
										}
										agent.setUpdateTime(new Date());
										agent.setUpdatedBy("system");
									}
									plmsLaCollectAgentService.updateBatch(agentList);
								}
							}

							payments.removeAll(transferPayments);
							tempPayments.clear();
							transferPayments.clear();
							noOutsrcPayments.clear();
						}

						/*
						 * 3,修改工单池和工单日志
						 */
						List<PlmsWorkOrderPool> clearPoolList = new ArrayList<PlmsWorkOrderPool>();
						List<PlmsWorkOrderPoolLog> clearLogList = new ArrayList<PlmsWorkOrderPoolLog>();
						//若结清和不逾期数据在外访中，结清则将外访状态变更为Settle(已结清)，不逾期则变更为Normal(已正常)
						List<PlmsOvmOutVisitInfo> outVisitList  = new ArrayList<PlmsOvmOutVisitInfo>();
						List<PlmsOvmOutVisitPlan> outVisitPlanList = new ArrayList<PlmsOvmOutVisitPlan>();
						List<PlmsOvmOutVisitUser> outUserList = new ArrayList<PlmsOvmOutVisitUser>();
						List<PlmsOvmOutVisitLog>  outVisitLogList = new ArrayList<PlmsOvmOutVisitLog>();
						List<PlmsOvmOutDelayDtl>  delayAllList  = new ArrayList<PlmsOvmOutDelayDtl>();
						Map<String,PlmsOvmOutVisitUser> userMap = new HashMap<String,PlmsOvmOutVisitUser>();
						//委外区间的数据，当结清时状态为0，不逾期未结清时仍然留在委外区间
						for(PlmsWorkOrderPoolDto dto:clearList){
							PlmsWorkOrderPool pool = new PlmsWorkOrderPool();
							PlmsWorkOrderPoolLog log = new PlmsWorkOrderPoolLog();
         					/*工单池数据*/
							pool.setPaymentId(dto.getPaymentId());
							pool.setUpdateTime(new Date());
							pool.setRecVer(dto.getRecVer());
							boolean flag = true;
							if(dto.getStatus().equals(ruleSet.getStatus())){
								if(dto.getClearStatus()!=null&&dto.getClearStatus().equals("CLEAR")){
									pool.setStatus("0");
									log.setStatus("0");
								}else{
									//不逾期但没结清的仍然留在委外区间
									flag = false;
								}
							}else{
								pool.setStatus("0");
								log.setStatus("0");
							}
							if(flag){
								clearPoolList.add(pool);
             					/*工单日志表数据*/
								setLogModel(dto,log,"update");
								clearLogList.add(log);
							}

							//外访处理
							Map<String,Object> outMap = new HashMap<String,Object>();
							outMap.put("applId",dto.getApplId());
							List<PlmsOvmOutVisitInfo> outInfoList = plmsOvmOutVisitInfoService.searchInfoByMap(outMap);
							if(outInfoList.size()>0){
								PlmsOvmOutVisitInfo outInfo = outInfoList.get(0);
								if(dto.getClearStatus()!=null&&dto.getClearStatus().equals("CLEAR")){
									outInfo.setStatus(OutVisitStatusType.Settle);//已结清
								}else{
									outInfo.setStatus(OutVisitStatusType.Normal);//已正常
								}
								outInfo.setUpdatedBy("system");
								outInfo.setUpdateTime(new Date());
								outInfo.setEndBy("system");
								outInfo.setEndDate(new Date());
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
												if(dto.getClearStatus()!=null&&dto.getClearStatus().equals("CLEAR")){
													dtl.setDelayAuditRefuse("此案件已结清");
												}else{
													dtl.setDelayAuditRefuse("此案件已正常");
												}
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
										if(delayTimes != null && delayTimes > 0L){
											outInfo.setCaseType("CASE_DELAY");
										}else{
											outInfo.setCaseType("CASE_ADD");
										}
									}
								}
								outVisitList.add(outInfo);
								Map<String,Object> planMap = new HashMap<String,Object>();
								planMap.put("infoId", outInfo.getId());
								planMap.put("planStatus", "Start");
								List<PlmsOvmOutVisitPlan> planList = plmsOvmOutVisitPlanService.searchByMap(planMap);
								if(planList!=null&&planList.size()>0){
									for(PlmsOvmOutVisitPlan plan:planList){
										plan.setPlanStatus(OutVisitPlanStatusType.Cancel);
										if(dto.getClearStatus()!=null&&dto.getClearStatus().equals("CLEAR")){
											plan.setVisitCancelResion("此案件已结清");
										}else{
											plan.setVisitCancelResion("此案件已正常");
										}
										plan.setUpdatedBy("system");
										plan.setUpdateTime(new Date());
										outVisitPlanList.add(plan);
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
								//外访日志
								PlmsOvmOutVisitLog outVisitLog = new PlmsOvmOutVisitLog();
								outVisitLog = setOutLogModel(outInfo,outVisitLog);
								outVisitLogList.add(outVisitLog);
							}
						}
						//批量修改工单池中的数据
         				/*修改工单池中已经不逾期的数据的状态*/
						plmsWorkOrderPoolService.updateBatch(clearPoolList);
						//批量插入工单日志表中的数据
						plmsWorkOrderPoolLogService.insertBatch(clearLogList);
						//批量修改外访状态
						plmsOvmOutVisitInfoService.updateBatch(outVisitList);
						//批量修改延期申请
						plmsOvmOutDelayDtlService.updateBatch(delayAllList);
						//修改外访计划状态
						plmsOvmOutVisitPlanService.updateBatch(outVisitPlanList);
						//修改外访员数据
						if(userMap.size()>0){
							for(String key:userMap.keySet()){
								outUserList.add(userMap.get(key));
							}
							plmsOvmOutVisitUserService.updateBatch(outUserList);
						}
						//添加外访日志
						plmsOvmOutVisitLogService.insertBatch(outVisitLogList);

						transactionManager.commit(status);                          //提交事务

						logger.info("成功将" + clearList_copy.size() + "条结清数据导入贷后系统");
					}catch (Exception e){
						e.printStackTrace();
						transactionManager.rollback(status);                        //发生异常,事务回滚
						logger.error("已结清的数据进行流转出现异常:" + e.getMessage());
					}
				}

				clearListAll.removeAll(clearList_copy);
				clearList.clear();
				clearList_copy.clear();
			}
			logger.info("------共处理已结清数据流转" + sizeAll + "条-------");
		}else{
			logger.info("----------------今日没有新结清数据");
		}
		logger.info("----系统跑批：已存在并已结清的数据进行流转完成----");
	}
	
	/**
	* @Description: 外访日志model
	* @param info
	* @param outVisitLog
	* @return
	* @return PlmsOvmOutVisitLog
	 */
	private PlmsOvmOutVisitLog setOutLogModel(PlmsOvmOutVisitInfo info,
			PlmsOvmOutVisitLog outVisitLog) {
		if(info.getStatus().equals(OutVisitStatusType.Settle)){
			outVisitLog.setContent("系统跑批，此案件已结清");
			outVisitLog.setStatus(OutVisitStatusType.Settle);

		}else if(info.getStatus().equals(OutVisitStatusType.Normal)){
			outVisitLog.setContent("系统跑批，此案件已正常");
			outVisitLog.setStatus(OutVisitStatusType.Normal);

		}
		outVisitLog.setHandleBy("system");
		outVisitLog.setApplId(info.getApplId());
		outVisitLog.setCreatedBy("system");
		outVisitLog.setCreateTime(new Date());
		outVisitLog.setUpdatedBy("system");
		outVisitLog.setUpdateTime(new Date());
		
		return outVisitLog;
	}

	/**
	* @Description:
	* @param rdto
	* @param rec
	* @return void
	 */
	private void setRecModel(PlmsLaCollectRecDto rdto, PlmsLaCollectRec rec) {
		rec.setApplId(rdto.getApplId());
		rec.setPaymentId(rdto.getPaymentId());
		rec.setCollector(rdto.getCollector());
		rec.setStatus(rdto.getStatus());
		rec.setIsActive("Y");
		rec.setCreatedBy("system");
		rec.setCreateTime(new Date());
		rec.setUpdatedBy("system");
		rec.setUpdateTime(new Date());
		rec.setRecVer(0L);
		rec.setTagSeq(1L);
	}

	/**
	* @Description: 从微贷系统中导入新的逾期数据
	* @param poolRuleList
	* @return void
	 */
	private void  AddNewData(List<PlmsCollectionRuleSetDto>	poolRuleList){
		logger.info("----系统跑批：最新产生的逾期数据导入工单池开始----");
		Map<String,Object> map = new HashMap<String,Object>();
	//	map.put("outsourceState", "N");
		List<PlmsWorkOrderPoolDto> exportlistAll = plmsWorkOrderPoolService.searchReceiveOverdue(map);
		
		if(poolRuleList != null && poolRuleList.size( )> 0){
			if(exportlistAll != null && exportlistAll.size() > 0){
				int sizeAll = exportlistAll.size();
				 //获取事务管理器
	            DataSourceTransactionManager transactionManager = (DataSourceTransactionManager)AppContext.getBean("transactionManager");
				List<PlmsWorkOrderPoolDto> exportlist = new ArrayList<PlmsWorkOrderPoolDto>();
				List<PlmsWorkOrderPoolDto> exportlist_copy = new ArrayList<PlmsWorkOrderPoolDto>();

	            while(exportlistAll.isEmpty()==false){

	            	 int count = 2000;
					 for(PlmsWorkOrderPoolDto poolDto:exportlistAll){
			            	if(count==0) break;
			            	else{
			            		exportlist.add(poolDto);
			            		exportlist_copy.add(poolDto);
			            		count--;
			            	}
			         }
	                Date time = new Date();
	              
	                if(exportlist!=null&&exportlist.size()>0){
	                	  
	                	  DefaultTransactionDefinition def = new DefaultTransactionDefinition();
	                      def.setPropagationBehavior(TransactionDefinition.PROPAGATION_REQUIRES_NEW);          // 事物隔离级别,开启新事务
	                      TransactionStatus status = transactionManager.getTransaction(def);                   // 获得事务状态
	                	
	                      /*工单池数据*/
	      				List<PlmsWorkOrderPool> modelList = new ArrayList<PlmsWorkOrderPool>();
	      				/*工单日志表数据*/
	      				List<PlmsWorkOrderPoolLog>  logList = new ArrayList<PlmsWorkOrderPoolLog>();
	      		        //流入委外区间的案件信息集合
	      		        List<AddOutsrcApplDto> addOutsrcApplList = new ArrayList<AddOutsrcApplDto>();
	      		        
	                  try{ 
	                	  
	                	for(PlmsWorkOrderPoolDto p : exportlist){
	    					PlmsWorkOrderPool model = new PlmsWorkOrderPool();
	    					PlmsWorkOrderPoolLog log = new PlmsWorkOrderPoolLog();
	    					/* 根据逾期天数设置对应催收期间 */
	    					setStatus(p,model,log,poolRuleList);
	    					/* 工单池数据 */
	    					model.setApplId(p.getApplId());
	    					model.setPaymentId(p.getPaymentId());
	    					model.setCntrctNo(p.getCntrctNo());
	    					model.setCustName(p.getCustName());
	    					model.setDocno(p.getDocno());
	    					model.setLoanAmt(p.getLoanAmt());
	    					model.setBizCategory(p.getBizCategory());
	    					model.setSiteCode(p.getSiteCode());
	    					model.setPrdNo(p.getPrdNo());
	    					model.setIsActive("Y");
	    					model.setCreatedBy("system");
	    					model.setCreateTime(new Date());
	    					model.setUpdatedBy("system");
	    					model.setUpdateTime(new Date());
	    					modelList.add(model);
	    					/*工单日志表数据*/
	    					setLogModel(p,log,"insert");
	    					logList.add(log);
	
	                        //判断需要修改的案件集合,如果流转进委外区间的,新增委外申请并预分配
	                        String circuRuleCode = model.getCircuRuleCode();
	                        if(!StringUtil.isEmpty(circuRuleCode) && "OUTSOURC".equals(circuRuleCode)){
	                            //根据借款ID和委外日期校验案件是否在委外流程
	                            boolean check = plmsLaApplOutsrcService.selectCheck(p.getApplId(),time);
	                            if(!check){
	                                AddOutsrcApplDto outsrcApplDto = new AddOutsrcApplDto();
	                                outsrcApplDto.setApplId(p.getApplId());
	                                outsrcApplDto.setPaymentId(p.getPaymentId());
	                                outsrcApplDto.setCntrctId(p.getCntrctId());
	
	                                Integer overduePeriod = p.getOverduePeriod();
	                                if(overduePeriod != null){
	                                    outsrcApplDto.setOverduePeriod(Long.valueOf(overduePeriod));
	                                }
	
	                                outsrcApplDto.setRegionId(p.getRegionId());
	                                outsrcApplDto.setIdCardNo(p.getDocno());
	                                outsrcApplDto.setOverDays(p.getOverDays());
	                                outsrcApplDto.setCntrctNo(p.getCntrctNo());
	                                outsrcApplDto.setPoolStatus(null);
	                                outsrcApplDto.setAllot(null);
	                                addOutsrcApplList.add(outsrcApplDto);
	                            }
	                        }
	    				}
	
	                    /* 如果有流转进委外区间的,新增委外申请并预分配 */
	                    plmsLaApplOutsrcService.saveAutoAppl(addOutsrcApplList,"从微贷导入进入委外区间","system","系统用户");
	
	    				/* 批量插入逾期数据到工单池表 */
	                    plmsWorkOrderPoolService.insertBatch(modelList);
	
	    				/* 批量插入逾期数据到工单池日志表 */
	                    plmsWorkOrderPoolLogService.insertBatch(logList);
	                	
	                    transactionManager.commit(status);                          //提交事务

	                    logger.info("成功从微贷系统将" + exportlist_copy.size() + "条新的逾期案件");

	                }catch (Exception e){
	                    e.printStackTrace();
	                    transactionManager.rollback(status);                        //发生异常,事务回滚
	                    logger.error("导入新增逾期案件异常,跑批结束:" + e.getMessage());
	                }
	               }
	                exportlistAll.removeAll(exportlist_copy);
	                exportlist_copy.clear();
	                exportlist.clear();
		           }
				logger.info("共从微贷系统将" + sizeAll + "条新的逾期案件");
	            
			}else{
				logger.info("-------------------------没有新数据产生-------------------------");
			}
		}
		
		logger.info("----系统跑批：最新产生的逾期数据导入工单池完成----");
	}

	/**
	* @Description: 根据逾期天数设置对应催收期间
	* @param p
	* @param model
	* @param log
	* @param poolRuleList
	* @return void
	*/
	private void setStatus(PlmsWorkOrderPoolDto p,PlmsWorkOrderPool model,PlmsWorkOrderPoolLog log,List<PlmsCollectionRuleSetDto> poolRuleList) {
	
		for(PlmsCollectionRuleSetDto c : poolRuleList){
			Long overduedaysFrom = c.getOverduedaysFrom();
			Long overduedaysTo = c.getOverduedaysTo();
			if(overduedaysFrom != null && overduedaysTo == null){
				if(p.getOverDays() >= overduedaysFrom){
					model.setStatus(c.getStatus());
                    model.setCircuRuleCode(c.getCircuRuleCode());
					log.setStatus(c.getStatus());
				}
			}else{
				if(overduedaysFrom <= p.getOverDays() && overduedaysTo >= p.getOverDays()){
					model.setStatus(c.getStatus());
                    model.setCircuRuleCode(c.getCircuRuleCode());
					log.setStatus(c.getStatus());
				}
			}
		}
	}

	/**
	* @Description: 工单日志表model构建
	* @param p
	* @param log
	* @param action
	* @return void
	*/
	private void setLogModel(PlmsWorkOrderPoolDto p,PlmsWorkOrderPoolLog log,String action){
		log.setApplId(p.getApplId());
		log.setPaymentId(p.getPaymentId());
		log.setOverdueDays(p.getOverDays());
		log.setRemainingPrincipal(p.getRemainingPrincipal());
		log.setOverduePeriod(p.getOverduePeriod());
		log.setHandleDate(new Date());
		if(action.equals("insert")){
			log.setActionType("create");
			log.setAction("insert");
		}else if(action.equals("update")){
			log.setActionType("update");
			log.setAction("update");
		}
		log.setActionDate(new Date());
		log.setCreatedBy("system");
		log.setCreateTime(new Date());
		log.setUpdatedBy("system");
		log.setUpdateTime(new Date());
	
	}
		/**
		* @Description: 案件排序
		* @param order
		* @return
		* @return Comparator<PlmsWorkOrderAssignDto>
		 */
	 private Comparator<PlmsWorkOrderAssignDto> getComparaOfCase(String order){
	        Comparator<PlmsWorkOrderAssignDto> comparato = null;
	        //按剩余本金升序排序
	        if(order.equals("asc")){
	        	comparato = new Comparator<PlmsWorkOrderAssignDto>() {
		            public int compare(PlmsWorkOrderAssignDto s1, PlmsWorkOrderAssignDto s2) {
		                if (s1.getRemainingPrincipal().compareTo(s2.getRemainingPrincipal()) == 0) {
		                    return 0;
		                } else if (s1.getRemainingPrincipal().compareTo(s2.getRemainingPrincipal()) > 0) {
		                    return 1;
		                } else {
		                    return -1;
		                }
		            }
		        }; 
	        }else if(order.equals("desc")){
	        	comparato = new Comparator<PlmsWorkOrderAssignDto>() {
		            public int compare(PlmsWorkOrderAssignDto s1, PlmsWorkOrderAssignDto s2) {
		                if (s1.getRemainingPrincipal().compareTo(s2.getRemainingPrincipal()) == 0) {
		                    return 0;
		                } else if (s1.getRemainingPrincipal().compareTo(s2.getRemainingPrincipal()) < 0) {
		                    return 1;
		                } else {
		                    return -1;
		                }
		            }
		        }; 
	        }
	        
	        return comparato;
	    }
	 
	 /**
	 * @Description: 催收员排序 
	 * @return Comparator<PlmsEmpCollectDto>
	  */
	 private Comparator<PlmsEmpCollectDto> getComparaOfCollector(String assignRuleCode,String orderType){
		 
	        Comparator<PlmsEmpCollectDto> comparato = null;
	        if(assignRuleCode.equals("AVRG_DIST")){
	        	comparato = new Comparator<PlmsEmpCollectDto>() {
					@Override
					public int compare(PlmsEmpCollectDto o1, PlmsEmpCollectDto o2) {
						if(o1.getMonthCaseCount().compareTo(o2.getMonthCaseCount())==0){
							if(o1.getMonthRemainingPrincipal().compareTo(o2.getMonthRemainingPrincipal())==0){
								return 0;
							}else if(o1.getMonthRemainingPrincipal().compareTo(o2.getMonthRemainingPrincipal())>0){
								return 1;
							}else{
								return -1;
							}
						}else if(o1.getMonthCaseCount().compareTo(o2.getMonthCaseCount())>0){
							return 1;
						}else{
							return -1;
						}
					}
		        } ;
	        }else if(assignRuleCode.equals("WORK_MORE")){
	        	if(orderType.equals("desc")){
	        		comparato = new Comparator<PlmsEmpCollectDto>() {
						@Override
						public int compare(PlmsEmpCollectDto o1, PlmsEmpCollectDto o2) {
							if(o1.getMonthCaseCount().compareTo(o2.getMonthCaseCount())==0){
								return 0;
							}else if(o1.getMonthCaseCount().compareTo(o2.getMonthCaseCount())>0){
								return -1;
							}else{
								return 1;
							}
						}
			        } ;
	        		
	        	}else if(orderType.equals("asc")){
	        		comparato = new Comparator<PlmsEmpCollectDto>() {
						@Override
						public int compare(PlmsEmpCollectDto o1, PlmsEmpCollectDto o2) {
							if(o1.getMonthCaseCount().compareTo(o2.getMonthCaseCount())==0){
								return 0;
							}else if(o1.getMonthCaseCount().compareTo(o2.getMonthCaseCount())>0){
								return 1;
							}else{
								return -1;
							}
						}
			        } ;
	        		
	        	}
	        	
	        }
	        	
			return comparato;
	 }
	 
	 /**
	 * @Description: 需要自动分配的区间列表
	 * @return
	 * @return List<PlmsCollectionRuleSet>
	  */
	 private List<PlmsCollectionRuleSet> getAutoAssignSet(){
			PlmsCollectionRuleSetExample example = new PlmsCollectionRuleSetExample();
			example.createCriteria().andIsActiveEqualTo("Y").andIsRunningEqualTo("Y").andAssignMethodCodeEqualTo("AUTO_ASSIGNED");
			example.setOrderByClause("val");
			return plmsCollectionRuleSetService.selectByExampleList(example);
	 }
	 
	 /**
	 * @Description: 判断是否为月初 
	 * @return
	 * @return boolean
	  */
	 private boolean isFirstOfMonth(){
		 	boolean isFirstOfMonth = false;
			Calendar cal = Calendar.getInstance();
			int today = cal.get(cal.DAY_OF_MONTH);
			if(today==1){
				isFirstOfMonth = true;
			}
			return isFirstOfMonth;
	 }
	 
	 /**
	 * @Description: 需要修改的催收分配记录 
	 * @param payments
	 * @return
	 * @return Map<Long,PlmsLaCollectAlloc>
	  */
	 private void searchToUpdateAllocData(List<Long> payments){
		 	PlmsLaCollectAllocExample exapAlloc = new PlmsLaCollectAllocExample();
			List<Long> tempPayments = new ArrayList<Long>();
			Date updateDate = new Date();
			/*Calendar cal = Calendar.getInstance();
	        cal.add(Calendar.DATE,-1);
	        Date endDate = cal.getTime();*/
	        
			while(payments.isEmpty()==false){
		            int count = 500;
		            for(Long paymentId:payments){
		            	if(count==0) break;
		            	else{
		            		tempPayments.add(paymentId);
		            		count--;
		            	}
		            }
		            exapAlloc.createCriteria().andAllocEndDateIsNull().andPaymentIdIn(tempPayments).andIsActiveEqualTo("Y");
					List<PlmsLaCollectAlloc> allocList = plmsLaCollectAllocService.selectByExample(exapAlloc);
					if(allocList!=null&&allocList.size()>0){
						for(PlmsLaCollectAlloc alloc : allocList){
							alloc.setAllocEndDate(updateDate);
							alloc.setUpdateTime(updateDate);
							alloc.setUpdatedBy("system");
							alloc.setAdjustedBy("system");
							alloc.setAdjustTime(updateDate);
							alloc.setAllocType("AUTO");
						}
						//每查询500条则进行一次修改操作
						plmsLaCollectAllocService.updateBatch(allocList);
					}
					
					payments.removeAll(tempPayments);
					tempPayments.clear();
			}
	 }
	 
	 /**
	 * @Description: 需要修改的代理催收分配记录  
	 * @param payments
	 * @return
	 * @return Map<Long,PlmsLaCollectAgent>
	  */
	 private void searchToUpdateAgentData(List<Long> payments){
		 	Date updateDate = new Date();
			/*Calendar cal = Calendar.getInstance();
	        cal.add(Calendar.DATE,-1);
	        Date endDate = cal.getTime();*/
			List<Long> tempPayments = new ArrayList<Long>();
			while(payments.isEmpty()==false){
	            int count = 500;
	            for(Long paymentId:payments){
	            	if(count==0) break;
	            	else{
	            		tempPayments.add(paymentId);
	            		count--;
	            	}
	            }
	        	Map<String,Object> map = new HashMap<String,Object>();
		        map.put("payments", tempPayments);
		        map.put("mode", 2);
		      //  map.put("agentEnd", new Date());
				List<PlmsLaCollectAgent> agentList = plmsLaCollectAgentService.selectByExample2(map);
				if(agentList!=null&&agentList.size()>0){
					for(PlmsLaCollectAgent agent : agentList){
						 if(agent.getAllocBeginDate().compareTo(updateDate)>0){
			                	agent.setIsActive("N");
			                }else{
			                	agent.setAllocEndDate(updateDate);
			                }
						
						agent.setUpdateTime(updateDate);
						agent.setUpdatedBy("system");
					}
					//每查询500条则进行一次修改操作
					plmsLaCollectAgentService.updateBatch(agentList);
				}	
				payments.removeAll(tempPayments);
				tempPayments.clear();
	 }

	 }
	 
	
	 /**
	  * 
	 * @Description: 催收员有分配上限的平均分配 
	 * @param dList
	 * @param empCollectList
	 * @param upperLimitMap(此区间有上限的催收员和上限数)
	 * @param userCountMap(此区间有上限的催收员和现在已有的案件数)
	 * @return
	 * @return Map<String,Integer>
	  */
	 private void addAllocUpperLimit_(List<PlmsWorkOrderAssignDto> dList,List<PlmsEmpCollectDto> empCollectList,Map<String,Integer> upperLimitMap,Map<String,Integer> userCountMap){		 
		 if(userCountMap.size()>0){
			 //记录满足上限需要移除的催收员
			 Map<String,Integer> mapT = new HashMap<String,Integer>();
			 //如果实际分配已大于等于上限值，则直接从催收员列表中移除
			 for (String key : userCountMap.keySet()) {
				 if(upperLimitMap.get(key).intValue()<=userCountMap.get(key).intValue()){
					 mapT.put(key, userCountMap.get(key));
					 Iterator <PlmsEmpCollectDto> it = empCollectList.iterator(); 
					 while(it.hasNext()){
						 PlmsEmpCollectDto dto = it.next();
						 if(dto.getUserId().equals(key)){
							 it.remove();
						 }
					 }
				 }
			 }
			 
			 if(mapT.size()>0){
				 for (String key : mapT.keySet()) {
					 if(userCountMap.containsKey(key)){
						 upperLimitMap.remove(key);
						 userCountMap.remove(key);					 }
				 }

			 }

			 int index = 0;
			 //分配列表
			 List<PlmsLaCollectAlloc> allocAddList = new ArrayList<PlmsLaCollectAlloc>();
			//催收记录列表
			// List<PlmsLaCollectionRecord> recordList = new ArrayList<PlmsLaCollectionRecord>();
			 
			 for(PlmsWorkOrderAssignDto adto:dList){						
					PlmsLaCollectAlloc addAlloc =  new PlmsLaCollectAlloc();
			//		PlmsLaCollectionRecord record  = new PlmsLaCollectionRecord();
					String userId = empCollectList.get(index).getUserId();
					if(userCountMap.containsKey(userId)){
						userCountMap.put(userId, userCountMap.get(userId)+1);
					}
					addAlloc.setCollector(userId);
					this.setAllocModel(adto, addAlloc);
			//		this.setCollectionRecord(adto,record);
					allocAddList.add(addAlloc);
			//		recordList.add(record);
					index++;
					if(index>=empCollectList.size()){
						index=0;
					}
					//超过上限时从催收员列表中移除
					 if(userCountMap.size()!=0){
						 for (String key : userCountMap.keySet()) {
							 if(upperLimitMap.get(key)<=userCountMap.get(key)){
								 mapT.put(key, userCountMap.get(key));
								 Iterator <PlmsEmpCollectDto> it = empCollectList.iterator(); 
								 while(it.hasNext()){
									 PlmsEmpCollectDto dto = it.next();
									 if(dto.getUserId().equals(key)){
										 it.remove();
										 if(index>0){
											 index--; 
										 }
									 }
								 }
							 }
						 }
					 }
					 if(mapT.size()>0){
						 for (String key : mapT.keySet()) {
							 if(userCountMap.containsKey(key)){
								 upperLimitMap.remove(key);
								 userCountMap.remove(key);					 
							 }
						 }

					 }
				} 
			 
			
			//添加催收分配表
			if(allocAddList!=null&&allocAddList.size()>0){
				plmsLaCollectAllocService.insertBatch(allocAddList);
			}
			//添加催收记录
//			if(recordList!=null&&recordList.size()>0){
//				plmsLaCollectionRecordService.insertBatch(recordList);
//			}
		 }else{
				this.addAllocNoUpper(dList, empCollectList);
		 }
		 
	 }
	 
	 /**
	 * @Description: 构造催收记录model
	 * @param adto
	 * @param record
	 */
//	 private void setCollectionRecord(PlmsWorkOrderAssignDto adto, PlmsLaCollectionRecord record) {
//		 Date date = new Date();
//		 record.setApplId(adto.getApplId());
//		 record.setPeriodNum(adto.getOverduePeriod());
//		 record.setCollectTime(date);
//		 record.setInputTime(date);
//		 record.setCollectMthd("NEW");
//		 record.setStatus("NEW");
//		 record.setControlStatus("NEW");
//		 record.setContent("新增案件");
//		 record.setResult("NEW");
//		 record.setCreatedBy("system");
//		 record.setCreateTime(date);
//		 record.setUpdatedBy("system");
//		 record.setUpdateTime(date);
//		 record.setRecVer(0L);
//		 record.setTagSeq(1L);
//	}

	/**
	 * @Description: 组长无上限的分配方式 (平均分配)
	 * @param dList
	 * @param empCollectList
	 * @return List<PlmsLaCollectAlloc>
	 */
	 private List<PlmsLaCollectAlloc> addAllocNoUpper(List<PlmsWorkOrderAssignDto> dList,List<PlmsEmpCollectDto> empCollectList){
		 int index = 0; 
		 int collectorsSize = empCollectList.size();
		 //分配
		 List<PlmsLaCollectAlloc> allocAddList = new ArrayList<PlmsLaCollectAlloc>();
		//催收记录列表
		// List<PlmsLaCollectionRecord> recordList = new ArrayList<PlmsLaCollectionRecord>();
		 
		 for(PlmsWorkOrderAssignDto adto:dList){						
				PlmsLaCollectAlloc addAlloc =  new PlmsLaCollectAlloc();
			//	PlmsLaCollectionRecord record = new PlmsLaCollectionRecord();
				String userId = empCollectList.get(index).getUserId();
				addAlloc.setCollector(userId);
				this.setAllocModel(adto, addAlloc);
			//	this.setCollectionRecord(adto, record);
				allocAddList.add(addAlloc);
			//	recordList.add(record);
				index++;
				if(index>=collectorsSize){
					index=0;
				}
			}
		 	//添加催收分配
			if(allocAddList!=null&&allocAddList.size()>0){
				plmsLaCollectAllocService.insertBatch(allocAddList);
			}
			//添加催收记录
//			if(recordList!=null&&recordList.size()>0){
//				plmsLaCollectionRecordService.insertBatch(recordList);
//			}
			
		return allocAddList;
		 
	 }

	 
	 private void setAllocModel(PlmsWorkOrderAssignDto adto,PlmsLaCollectAlloc addAlloc){
		 	Date date = new Date();
			//创建新的分配记录
			addAlloc.setApplId(adto.getApplId());
			addAlloc.setPaymentId(adto.getPaymentId());
			addAlloc.setOverdueDays(adto.getOverdueDays());
			addAlloc.setRemainingPrincipal(adto.getRemainingPrincipal());
			addAlloc.setAssignTime(date);
			addAlloc.setAllocBeginDate(date);
			addAlloc.setAllocType("AUTO");
			addAlloc.setIsActive("Y");
			addAlloc.setCreatedBy("system");
			addAlloc.setCreateTime(date);
			addAlloc.setUpdatedBy("system");
			addAlloc.setUpdateTime(date);
			addAlloc.setTagSeq(1L);
			addAlloc.setRecVer(0L);
	 }
	 
	 
	 private List<PlmsEmpCollectDto> selectCollectorCaseCount(String status,String time){
		 Map<String,Object> map = new HashMap<String,Object>();
		 map.put("status", status);
		 map.put("time", time);
		 List<PlmsEmpCollectDto> empList = plmsEmpCollectSetService.selectDtoByExampleList02(map);
		 return empList;
		 
	 }
	 
	 /**
	 * @Description: 组长有上限的多劳多得公式
	 * @param wordMoreList
	 * @param empCollectList
	 * @param scopeCount
	 * @param upperLimitMap(此区间有上限的催收员和上限数)
	 * @param userCountMap(此区间有上限的催收员和现在已有的案件数)
	 * @return void
	 */
	 private void addAllocWorkMoreUpperLimit_(
				List<PlmsWorkOrderAssignDto> wordMoreList,
				List<PlmsEmpCollectDto> empCollectList, int scopeCount,
				Map<String, Integer> upperLimitMap,
				Map<String, Integer> userCountMap) {	
		 if(userCountMap.size()>0){
			 int index = 0;
				List<PlmsLaCollectAlloc> allocAddList = new ArrayList<PlmsLaCollectAlloc>();
				//催收记录列表
				//List<PlmsLaCollectionRecord> recordList = new ArrayList<PlmsLaCollectionRecord>();			
				List<PlmsWorkOrderAssignDto> tempMoreWorkList = new ArrayList<PlmsWorkOrderAssignDto>();
				//新增案件数-催收员人数
				int caseCount = wordMoreList.size()-empCollectList.size();
				//第一轮分配需确保每人都分得一个
				for(PlmsWorkOrderAssignDto adto:wordMoreList){
					tempMoreWorkList.add(adto);
					PlmsLaCollectAlloc addAlloc =  new PlmsLaCollectAlloc();
				//	PlmsLaCollectionRecord record = new PlmsLaCollectionRecord();
					String userId = empCollectList.get(index).getUserId();
					if(userCountMap.size()>0&&userCountMap.containsKey(userId)){
						userCountMap.put(userId, userCountMap.get(userId)+1);
					}
					addAlloc.setCollector(userId);
					this.setAllocModel(adto, addAlloc);
				//	this.setCollectionRecord(adto,record);
					allocAddList.add(addAlloc);
				//	recordList.add(record);
					index++;
					if(index>=empCollectList.size()){
						index = 0;
						break;
					}
				}
				wordMoreList.removeAll(tempMoreWorkList);
				
				
				//剩余需分配的案件数
				Map<String,Integer> map = new HashMap<String,Integer>();
				int newAddCount = 0;
				for(int i=0;i<empCollectList.size();i++){
					String userId =  empCollectList.get(i).getUserId();
					if(userCountMap.containsKey(userId)){
						//此催收员剩余的可分配数量
						int remainCount = upperLimitMap.get(userId) - userCountMap.get(userId);
						float perCount = empCollectList.get(i).getClearMonthCaseCount();
						//个人应分得的数量  四舍五入
						int perDain = (int) Math.round(perCount/scopeCount*caseCount);
						if(remainCount<perDain){
							newAddCount+=remainCount;
							map.put(empCollectList.get(i).getUserId(), remainCount);
						}else{
							newAddCount+=perDain;
							map.put(empCollectList.get(i).getUserId(), perDain);
						}
					}else{
						float perCount = empCollectList.get(i).getClearMonthCaseCount();
						//四舍五入
						int perDain = (int) Math.round(perCount/scopeCount*caseCount);
						newAddCount+=perDain;
						map.put(empCollectList.get(i).getUserId(), perDain);	
					}
					
					
				}	
				//正好可以分完
				if(newAddCount==caseCount){
					
				}else if(newAddCount>caseCount){
					int tempCount = 0;
					for(int i=0;i<empCollectList.size();i++){
						float perCount = empCollectList.get(i).getClearMonthCaseCount();
						//向下取整
						int perDain = (int) Math.floor(perCount/scopeCount*caseCount);
						tempCount+=perDain;
						map.put(empCollectList.get(i).getUserId(), perDain);
					}
					int margin = caseCount-tempCount;
					for(int i=0;i<=margin-1;i++){

						map.put(empCollectList.get(i).getUserId(), map.get(empCollectList.get(i).getUserId())+1);
					}
				}else{
					
					int margin = caseCount-newAddCount;
					int indexT = 0;
					int countTemp = 0;
					while(countTemp<margin){
						String userId = empCollectList.get(indexT).getUserId();
						if(userCountMap.size()>0&&userCountMap.containsKey(userId)){
							int remainCount = upperLimitMap.get(userId) - userCountMap.get(userId);
							if(remainCount>=map.get(userId)+1){
								map.put(userId, map.get(userId)+1);
								countTemp++;
							}
						}else{
							map.put(userId, map.get(userId)+1);
							countTemp++;
						}
						indexT++;
						if(indexT>=empCollectList.size()){
							indexT=0;
						}
					}
				}	
				
				for(int i=0;i<empCollectList.size();i++){
					int perSize = map.get(empCollectList.get(i).getUserId());
					List<PlmsWorkOrderAssignDto> tempList = new ArrayList<PlmsWorkOrderAssignDto>();
						for(int j=0;j<perSize;j++){
						PlmsLaCollectAlloc addAlloc =  new PlmsLaCollectAlloc();
					//	PlmsLaCollectionRecord record = new PlmsLaCollectionRecord();
						addAlloc.setCollector(empCollectList.get(i).getUserId());
						tempList.add(wordMoreList.get(j));
						this.setAllocModel(wordMoreList.get(j), addAlloc);
					//	this.setCollectionRecord(wordMoreList.get(j), record);
						allocAddList.add(addAlloc);
					//	recordList.add(record);
					}
					wordMoreList.removeAll(tempList);
				}

				//添加催收分配
				if(allocAddList!=null&&allocAddList.size()>0){
					plmsLaCollectAllocService.insertBatch(allocAddList);
				}
				//添加催收记录
//				if(recordList!=null&&recordList.size()>0){
//					plmsLaCollectionRecordService.insertBatch(recordList);
//				}  
		 }else{
			 
			 addAllocWorkMore(wordMoreList,empCollectList, scopeCount);
		 }
			
		}
	 
	 
	 /**
	  * 
	 * @Description: 多劳多得公式一 
	 * @param wordMoreList
	 * @param empCollectList
	 * @return
	 * @return List<PlmsLaCollectAlloc>
	  */
	 private void addAllocWorkMore(List<PlmsWorkOrderAssignDto> wordMoreList,List<PlmsEmpCollectDto> empCollectList,
			 int scopeCount){
		int index = 0;
		List<PlmsLaCollectAlloc> allocAddList = new ArrayList<PlmsLaCollectAlloc>();
		//催收记录列表
		//List<PlmsLaCollectionRecord> recordList = new ArrayList<PlmsLaCollectionRecord>();
		
		List<PlmsWorkOrderAssignDto> tempMoreWorkList = new ArrayList<PlmsWorkOrderAssignDto>();
		int caseCount = wordMoreList.size()-empCollectList.size();
		//第一轮分配需确保每人都分得一个
		for(PlmsWorkOrderAssignDto adto:wordMoreList){
			tempMoreWorkList.add(adto);
			PlmsLaCollectAlloc addAlloc =  new PlmsLaCollectAlloc();
			//PlmsLaCollectionRecord record = new PlmsLaCollectionRecord();
			String userId = empCollectList.get(index).getUserId();
			addAlloc.setCollector(userId);
			this.setAllocModel(adto, addAlloc);
			//this.setCollectionRecord(adto,record);
			allocAddList.add(addAlloc);
			//recordList.add(record);
			index++;
			if(index>=empCollectList.size()){
				index = 0;
				break;
			}
		}
		wordMoreList.removeAll(tempMoreWorkList);
		
		//剩余需分配的案件数
		Map<String,Integer> map = new HashMap<String,Integer>();
		int newAddCount = 0;
		for(int i=0;i<empCollectList.size();i++){
			float perCount = empCollectList.get(i).getClearMonthCaseCount();
			//四舍五入
			int perDain = (int) Math.round(perCount/scopeCount*caseCount);
			newAddCount+=perDain;
			map.put(empCollectList.get(i).getUserId(), perDain);
		}	
		//正好可以分完
		if(newAddCount==caseCount){
			
		}else if(newAddCount>caseCount){
			int tempCount = 0;
			for(int i=0;i<empCollectList.size();i++){
				float perCount = empCollectList.get(i).getClearMonthCaseCount();
				//向下取整
				int perDain = (int) Math.floor(perCount/scopeCount*caseCount);
				tempCount+=perDain;
				map.put(empCollectList.get(i).getUserId(), perDain);
			}
			int margin = caseCount-tempCount;
			for(int i=0;i<=margin-1;i++){
				int indexT = i%empCollectList.size();
				map.put(empCollectList.get(indexT).getUserId(), map.get(empCollectList.get(indexT).getUserId())+1);
			}
		}else{
			int tempCount = 0;
			for(int i=0;i<empCollectList.size();i++){
				float perCount = empCollectList.get(i).getClearMonthCaseCount();
				//四舍五入
				int perDain = (int) Math.round(perCount/scopeCount*caseCount);
				tempCount+=perDain;
				map.put(empCollectList.get(i).getUserId(), perDain);
			}
			int margin = caseCount-tempCount;
			for(int i=0;i<=margin-1;i++){
					int indexT = i%empCollectList.size();
					map.put(empCollectList.get(indexT).getUserId(), map.get(empCollectList.get(indexT).getUserId())+1);		
				}
			}
			
		
		for(int i=0;i<empCollectList.size();i++){
			int perSize = map.get(empCollectList.get(i).getUserId());
			List<PlmsWorkOrderAssignDto> tempList = new ArrayList<PlmsWorkOrderAssignDto>();
				for(int j=0;j<perSize;j++){
				PlmsLaCollectAlloc addAlloc =  new PlmsLaCollectAlloc();
				//PlmsLaCollectionRecord record = new PlmsLaCollectionRecord();
				addAlloc.setCollector(empCollectList.get(i).getUserId());
				tempList.add(wordMoreList.get(j));
				this.setAllocModel(wordMoreList.get(j), addAlloc);
				//this.setCollectionRecord(wordMoreList.get(j), record);
				allocAddList.add(addAlloc);
				//recordList.add(record);
			}
			wordMoreList.removeAll(tempList);
		}

		//添加催收分配
		if(allocAddList!=null&&allocAddList.size()>0){
			plmsLaCollectAllocService.insertBatch(allocAddList);
		}
		//添加催收记录
//		if(recordList!=null&&recordList.size()>0){
//			plmsLaCollectionRecordService.insertBatch(recordList);
//		}

	 }

	 private void setEmpOrderType(Long id, String orderType){
		 	PlmsCollectionRuleSet rset = new PlmsCollectionRuleSet();
			rset.setId(id);
			rset.setOrderType(orderType);
			plmsCollectionRuleSetService.update(rset);
	 }

    /**
     * @Description: 网点案件排序
     * @return Comparator<PlmsEmpCollectDto>
     */
    private Comparator<PlmsWorkOrderAssignDto> getComparaOfSiteCase(){

        Comparator<PlmsWorkOrderAssignDto> comparato = null;

        comparato = new Comparator<PlmsWorkOrderAssignDto>() {
            @Override
            public int compare(PlmsWorkOrderAssignDto o1, PlmsWorkOrderAssignDto o2) {
                if(o1.getBizCategory().compareTo(o2.getBizCategory())==0){
                    if(o1.getRemainingPrincipal().compareTo(o2.getRemainingPrincipal())==0){
                        return 0;
                    }else if(o1.getRemainingPrincipal().compareTo(o2.getRemainingPrincipal())>0){
                        return 1;
                    }else{
                        return -1;
                    }
                }else if(o1.getBizCategory().compareTo(o2.getBizCategory())>0){
                    return 1;
                }else{
                    return -1;
                }
            }
        } ;

        return comparato;
    }

}
