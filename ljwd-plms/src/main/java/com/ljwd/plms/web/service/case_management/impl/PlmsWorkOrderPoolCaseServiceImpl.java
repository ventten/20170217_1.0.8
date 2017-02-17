package com.ljwd.plms.web.service.case_management.impl;

import java.util.ArrayList;
import java.util.Arrays;
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

import com.itextpdf.text.pdf.PdfStructTreeController.returnType;
import com.ljwd.plms.core.util.D;
import com.ljwd.plms.core.util.StringUtil;
import com.ljwd.plms.web.service.outsource.inf.PlmsLaApplOutsrcService;
import com.ljwd.plms.web.vo.outsource.AddOutsrcApplDto;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.ljwd.plms.web.dao.case_management.PlmsEmpCollectSetMapper;
import com.ljwd.plms.web.dao.case_management.PlmsWorkOrderPoolMapper;
import com.ljwd.plms.web.model.case_collection.PlmsLaCollectionRecord;
import com.ljwd.plms.web.model.case_management.PlmsLaCollectAgent;
import com.ljwd.plms.web.model.case_management.PlmsLaCollectAlloc;
import com.ljwd.plms.web.model.case_management.PlmsLaCollectAllocExample;
import com.ljwd.plms.web.model.case_management.PlmsLaCollectRec;
import com.ljwd.plms.web.model.case_management.PlmsWorkOrderPool;
import com.ljwd.plms.web.model.case_management.PlmsWorkOrderPoolLog;
import com.ljwd.plms.web.model.sys_management.PlmsUserUpperLimit;
import com.ljwd.plms.web.model.sys_management.PlmsUserUpperLimitExample;
import com.ljwd.plms.web.model.workorder_pool.PlmsCollectionRuleSet;
import com.ljwd.plms.web.model.workorder_pool.PlmsCollectionRuleSetExample;
import com.ljwd.plms.web.service.case_collection.inf.PlmsLaCollectionRecordService;
import com.ljwd.plms.web.service.case_management.inf.PlmsEmpCollectSetService;
import com.ljwd.plms.web.service.case_management.inf.PlmsLaCollectAgentService;
import com.ljwd.plms.web.service.case_management.inf.PlmsLaCollectAllocService;
import com.ljwd.plms.web.service.case_management.inf.PlmsLaCollectRecService;
import com.ljwd.plms.web.service.case_management.inf.PlmsWorkOrderPoolCaseService;
import com.ljwd.plms.web.service.case_management.inf.PlmsWorkOrderPoolLogService;
import com.ljwd.plms.web.service.case_management.inf.PlmsWorkOrderPoolService;
import com.ljwd.plms.web.service.sys_management.inf.PlmsRoleService;
import com.ljwd.plms.web.service.sys_management.inf.PlmsUserUpperLimitService;
import com.ljwd.plms.web.service.workorder_pool.inf.PlmsCollectionRuleSetService;
import com.ljwd.plms.web.service.workorder_pool.inf.PlmsLAssignRuleService;
import com.ljwd.plms.web.vo.case_management.PlmsEmpCollectDetailDto;
import com.ljwd.plms.web.vo.case_management.PlmsEmpCollectDto;
import com.ljwd.plms.web.vo.case_management.PlmsLaCollectRecDto;
import com.ljwd.plms.web.vo.case_management.PlmsWorkOrderAssignDto;
import com.ljwd.plms.web.vo.case_management.PlmsWorkOrderPoolDto;
import com.ljwd.plms.web.vo.case_management.PlmsWorkOrderPoolParam;
import com.ljwd.plms.web.vo.workorder_pool.PlmsCollectionRuleSetDto;

@Service
public class PlmsWorkOrderPoolCaseServiceImpl implements PlmsWorkOrderPoolCaseService {
	@Resource
	private PlmsCollectionRuleSetService plmsCollectionRuleSetService;
	@Resource
	private PlmsEmpCollectSetMapper plmsEmpCollectSetMapper;
	@Resource
	private PlmsLaCollectAllocService plmsLaCollectAllocService;
	@Resource
	private PlmsLaCollectAgentService plmsLaCollectAgentService;
	@Resource
	private PlmsWorkOrderPoolService plmsWorkOrderPoolService;
	@Resource
	private PlmsLaCollectRecService plmsLaCollectRecService;
	@Resource
	private PlmsEmpCollectSetService plmsEmpCollectSetService;
	@Resource
	private PlmsWorkOrderPoolMapper plmsWorkOrderPoolMapper;
	@Resource
	private PlmsWorkOrderPoolLogService plmsWorkOrderPoolLogService;
	@Resource
	private PlmsUserUpperLimitService plmsUserUpperLimitService;
	@Resource
	private PlmsLaApplOutsrcService plmsLaApplOutsrcService;

	private static Logger logger = LoggerFactory.getLogger(PlmsWorkOrderPoolCaseServiceImpl.class);

	/**
	* @Description: 查询催收员信息
	* @param status
	* @return List<PlmsEmpCollectDetailDto>
	 */
	@Override
	public List<PlmsEmpCollectDetailDto> getAllCollector(String status,Long orgId,List<Long> orgIds) {
		List<PlmsEmpCollectDetailDto> collectorList = new ArrayList<PlmsEmpCollectDetailDto>();	
		if(status!=null&&status!=""){
			PlmsCollectionRuleSetExample example = new PlmsCollectionRuleSetExample();
			example.createCriteria().andStatusEqualTo(status).andIsActiveEqualTo("Y");
			List<PlmsCollectionRuleSet> crSet = plmsCollectionRuleSetService.selectByExampleList(example);
			if(crSet!=null&&crSet.size()>0){
				Map<String,Object> map = new HashMap<String,Object>();
				map.put("groupId", crSet.get(0).getId());
				map.put("status", status);
				if(orgId!=null){
					map.put("orgId", orgId);
				}
				if(orgIds!=null&&orgIds.size()>0){
					map.put("orgIds", orgIds);
				}
				String circuRuleCode = crSet.get(0).getCircuRuleCode();
				if(circuRuleCode.trim().equals("CUSTS")||circuRuleCode.trim().equals("OPERD")){
					collectorList = plmsEmpCollectSetMapper.getAllCollector02(map);
				}else{
					collectorList = plmsEmpCollectSetMapper.getAllCollector01(map);
				}
			}
		}
		return collectorList;
	}

	/**
	 * @Description: 手动批量分配
	 * @param param
	 * @param collectors
	 * @param userName
	 */
	@Override
	public void updateMaruBatchAlloc(PlmsWorkOrderPoolParam param,String collectors, String userName) {
		String status = param.getStatus();
		PlmsCollectionRuleSetExample example = new PlmsCollectionRuleSetExample();
		example.createCriteria().andStatusEqualTo(status).andIsActiveEqualTo("Y");
		List<PlmsCollectionRuleSet> setList= plmsCollectionRuleSetService.selectByExampleList(example);
		if(collectors!=null){
			String[] collecs = collectors.split(",");
			List<String> collectorTempIds = Arrays.asList(collecs);
			//不是原生的List会有很多方法不能用，所以要用原生list
			List<String> collectorIds = new ArrayList<String>();
			collectorIds.addAll(collectorTempIds);
			//待分配
			param.setIsAlloc("2");
			List<PlmsWorkOrderAssignDto> dtoList = plmsWorkOrderPoolMapper.selectByParam(param);
			if(setList!=null&&dtoList!=null&&setList.size()>0&&dtoList.size()>0){
				PlmsUserUpperLimitExample exampLimit = new PlmsUserUpperLimitExample();
				exampLimit.setIsActive("Y");
				//有分配上限的列表
				List<PlmsUserUpperLimit> limitList = plmsUserUpperLimitService.selectByExample(exampLimit);
				PlmsCollectionRuleSet set = setList.get(0);
				//记录有分配上限的催收员和分配到的案件数
				Map<String,Integer> userCountMap = new LinkedHashMap<String,Integer>();
				////记录有分配上限的催收员和上限数
				Map<String,Integer> upperLimitMap = new LinkedHashMap<String,Integer>();
				Map<String,Object> map = new HashMap<String,Object>();
				map.put("groupId", Long.parseLong(set.getStatus()));
				map.put("status", set.getStatus());
				map.put("circuRuleCode", set.getCircuRuleCode());
				map.put("collectors", collectorIds);
				List<PlmsEmpCollectDto> empCollectList =new ArrayList<PlmsEmpCollectDto>();
				if(set.getAssignRuleCode().equals("AVRG_DIST")){
					if(this.isFirstOfMonth()){
						//人员先按【月初库存个数】进行升序排序，再按【月初库存剩余本金】进行升序排序；
						empCollectList = plmsEmpCollectSetService.selectCollectorByExampleList(map);
					}else{
						//人员先按【月新增累计库存】升序排序，再按【月新增累计库存剩余本金】升序排序
						empCollectList = plmsEmpCollectSetService.selectDtoByExampleList(map);
					}
					List<String> collList = new ArrayList<String>();
					for(int i=0;i<empCollectList.size();i++){
						collList.add(i, empCollectList.get(i).getUserId());
					}
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
							this.addAllocUpperLimit_(dtoList, collList,upperLimitMap,userCountMap,userName);
						}else{
							this.addAllocNoUpper(dtoList, collList,userName);
						}

					}else{
						logger.info("----没有对应的催收人员----");
					}
				}else if(set.getAssignRuleCode().equals("WORK_MORE")){
					empCollectList = plmsEmpCollectSetService.selectDtoByExampleList(map);
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
							workMoreUpperLimit(dtoList,collectorIds,upperLimitMap,userCountMap,userName,status);
						}else{
							workMore(dtoList,collectorIds,userName,status);
						}

					}else{
						logger.info("----没有对应的催收人员----");
					}
				}if(set.getAssignRuleCode().equals("DOT_DIST")){

					//存储各网点的及其对应的案件
					Map<String,List<PlmsWorkOrderAssignDto>> mapCase = new HashMap<String,List<PlmsWorkOrderAssignDto>>();
					for(PlmsWorkOrderAssignDto dto:dtoList){
						String sideCode = dto.getSiteCode();
						if(sideCode.equals("881")||sideCode.equals("882")){
							sideCode = dto.getSignCode();
						}
						if(mapCase.containsKey(sideCode)){
							List<PlmsWorkOrderAssignDto> list =mapCase.get(sideCode);
							list.add(dto);
							mapCase.put(sideCode,list);
						}else{
							List<PlmsWorkOrderAssignDto> temp = new ArrayList<PlmsWorkOrderAssignDto>();
							temp.add(dto);
							mapCase.put(sideCode, temp);
						}
					}
					if(mapCase.size()>0){
						for(String key:mapCase.keySet()){
							List<PlmsWorkOrderAssignDto> oneList = mapCase.get(key);
							//此网点的案件先按业务类型排序，然后按剩余本金降序排
							Collections.sort(oneList, getComparaOfSiteCase());
							//此网点对应的催收员
							map.put("siteCode", key);
							if(this.isFirstOfMonth()){
								//人员先按【月初库存个数】进行升序排序，再按【月初库存剩余本金】进行升序排序；
								empCollectList = plmsEmpCollectSetService.selectCollectorByExampleList(map);
							}else{
								//人员先按【月新增累计库存】升序排序，再按【月新增累计库存剩余本金】升序排序
								empCollectList = plmsEmpCollectSetService.selectDtoByExampleList(map);
							}
							if(empCollectList.size()>0){
								List<String> collList = new ArrayList<String>();
								for(int i=0;i<empCollectList.size();i++){
									collList.add(i, empCollectList.get(i).getUserId());
								}
								this.addAllocNoUpper(oneList, collList,userName);
							}else{
								logger.info("网点"+key+"所对应的机构下没有催收员");
							}

						}
					}
				}
			}else{
				logger.info("---此区间没有需要分配的案件---");
			}
		}else{
			logger.info("----没有对应的催收人员----");
		}
	}

	/**
	* @Description: 手动调整
	* @param paymentIds
	* @param collectors
	* @param userName
	* @param assignRule
	* @param status
	 */
	@Override
	public void updatemaruAlloc(List<Long> paymentIds, List<String> collectors,String userName,String assignRule,String status) {
		//处理选中数据之前的催收分配状态(返回当天分配，当天调整的案件)
		Map<Long,Map<String, Object>> reMap = this.updateAllocData(paymentIds,userName);
		//处理选中数据之前的代理催收分配状态
		this.updateAgentData(paymentIds,userName,reMap);
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("payments", paymentIds);
		map.put("status", status);
		//案件按业务类型，剩余本金降序排序
		List<PlmsWorkOrderAssignDto> selectedCaseList = plmsWorkOrderPoolService.selectMaruAssignList(map);	
		if(selectedCaseList!=null&&selectedCaseList.size()!=0){
			//平均分配
			if(assignRule.equals("AVRG_DIST")){
				this.addAllocNoUpper_maru(selectedCaseList, collectors, userName,reMap);
			}//多劳多得
			else if(assignRule.equals("WORK_MORE")){
				workMore(selectedCaseList,collectors,userName,status);
			}
		}
	}

	/**
	 * 
	* @Description: 手工调整案件 
	* @param selectedCaseList
	* @param collectors
	* @param userName
	* @param reMap
	* @return void
	 */
	private void addAllocNoUpper_maru(
			List<PlmsWorkOrderAssignDto> dList,
			List<String> empCollectList, String userName,
			Map<Long, Map<String, Object>> reMap) {
		int index = 0;
		int collectorsSize = empCollectList.size();
		//分配列表
		List<PlmsLaCollectAlloc> allocAddList = new ArrayList<PlmsLaCollectAlloc>();
		for(PlmsWorkOrderAssignDto adto:dList){
			PlmsLaCollectAlloc addAlloc =  new PlmsLaCollectAlloc();
			String userId = empCollectList.get(index);
			addAlloc.setCollector(userId);
			if(reMap.containsKey(adto.getPaymentId())){
				Map<String,Object> map =  reMap.get(adto.getPaymentId());
				this.setAllocModel_maru(adto, addAlloc,userName,(Date)map.get("beginDate"));
			}else{
				this.setAllocModel(adto, addAlloc,userName);
			}
			allocAddList.add(addAlloc);
			index++;
			if(index>=collectorsSize){
				index=0;
			}
		}
		//添加催收分配
		if(allocAddList!=null&&allocAddList.size()>0){
			plmsLaCollectAllocService.insertBatch(allocAddList);
		}		
	}
	/**
	 * 
	* @Description: 构造alloc 
	* @param adto
	* @param addAlloc
	* @param userName
	* @param reMap
	* @return void
	 */
	private void setAllocModel_maru(PlmsWorkOrderAssignDto adto,
			PlmsLaCollectAlloc addAlloc, String userName,
			Date beginDate) {
		Date date = new Date();
		//创建新的分配记录
		addAlloc.setApplId(adto.getApplId());
		addAlloc.setPaymentId(adto.getPaymentId());
		addAlloc.setOverdueDays(adto.getOverdueDays());
		addAlloc.setRemainingPrincipal(adto.getRemainingPrincipal());
		addAlloc.setAssignTime(date);
		addAlloc.setAllocBeginDate(beginDate);
		addAlloc.setAllocType("MARU");
		addAlloc.setIsActive("Y");
		addAlloc.setCreatedBy(userName);
		addAlloc.setCreateTime(date);
		addAlloc.setUpdatedBy(userName);
		addAlloc.setUpdateTime(date);
		addAlloc.setTagSeq(1L);
		addAlloc.setRecVer(0L);
		
	}

	/**
	* @Description: 多劳多得具体流程
	* @param selectedCaseList
	* @param collectors
	* @return void
	*/
	public void workMore(List<PlmsWorkOrderAssignDto> selectedCaseList,List<String> collectors,String userName,String status) {
		Map<String,Object> tmap = new HashMap<String,Object>();
		tmap.put("status", status);
		tmap.put("time", "yesterday");
		tmap.put("collectors", collectors);
		List<PlmsLaCollectRec> recList = plmsLaCollectRecService.selectByTime(tmap);
		//1,昨天被选中催收员总共回收案件数不为0
		if(recList!=null&&recList.size()>0){
			//被选中催收员昨天总共回收案件数
			int scopeCount = recList.size();
			List<PlmsEmpCollectDto> empCollectList = this.selectCollectorCaseCount(status,"yesterday",collectors);
			if(selectedCaseList.size()<=empCollectList.size()){
				int index = 0;
				List<PlmsLaCollectAlloc> allocAddList = new ArrayList<PlmsLaCollectAlloc>();
				//催收记录列表
			//	List<PlmsLaCollectionRecord> recordList = new ArrayList<PlmsLaCollectionRecord>();
				
				for(PlmsWorkOrderAssignDto adto:selectedCaseList){
					PlmsLaCollectAlloc addAlloc =  new PlmsLaCollectAlloc();
				//	PlmsLaCollectionRecord record = new PlmsLaCollectionRecord();
					String userId = empCollectList.get(index).getUserId();
					addAlloc.setCollector(userId);
					this.setAllocModel(adto, addAlloc,userName);
					//this.setCollectionRecord(adto,record);
					allocAddList.add(addAlloc);
				//	recordList.add(record);
					index++;
				}
				//添加新的分配记录
				if(allocAddList!=null&&allocAddList.size()>0){
					plmsLaCollectAllocService.insertBatch(allocAddList);
				}
				//添加催收记录
//				if(recordList!=null&&recordList.size()>0){
//					plmsLaCollectionRecordService.insertBatch(recordList);
//				}
			}else{
				
				this.addAllocWorkMore(selectedCaseList, empCollectList,scopeCount,userName);				
			}
		}//2,昨天区间回收案件数为0
		else{
			Map<String,Object> tmap02 = new HashMap<String,Object>();
			tmap02.put("status", status);
			tmap02.put("time", "before");
			tmap02.put("collectors", collectors);
			//前两天区间回收案件数
			List<PlmsLaCollectRec> beforeList = plmsLaCollectRecService.selectByTime(tmap02);
			//当月个人累计回收案件数,催收员按回收案件数降序排列
			List<PlmsEmpCollectDto> empCollectList = this.selectCollectorCaseCount(status,"month",collectors);
			List<PlmsEmpCollectDto> empbeforeCollectList = this.selectCollectorCaseCount(status,"theBeforemonth",collectors);
			/**
			 * 昨天回收案件数为0，前天不为0
			 */
			List<String> orderedCollectors = new ArrayList<String>();
			if(beforeList!=null&&beforeList.size()>0){
				//所有催收员当月个人累计回收案件数都为0(最多案件数的为0则都为0)
				if(empCollectList.get(0).getMonthCaseCount()==0){
					//所有催收员上月个人累计回收案件数都为0(最多案件数的为0则都为0)
					if(empbeforeCollectList.get(0).getMonthCaseCount()==0){
						//人员不排序
						Collections.shuffle(collectors);//人员随机排序
						orderedCollectors.addAll(collectors);
					}else{
						//催收人员根据回收案件数不为0的做降序排列，为0的随机排序
						List<PlmsEmpCollectDto> empList = empOrder(empbeforeCollectList,"desc");
						for(int i=0;i<empList.size();i++){
							orderedCollectors.add(i, empList.get(i).getUserId());
						}	
					}
				}else{
					//按催收员回收案件数降序排列
					//已排好数据按照人员排序结果循环分配
					List<PlmsEmpCollectDto> empList = empOrder(empCollectList,"desc");
					for(int i=0;i<empList.size();i++){
						orderedCollectors.add(i, empList.get(i).getUserId());
					}
				}
				
			}/**连续两天区间回收案件数为0**/
			else{
				Collections.shuffle(collectors);//人员随机排序
				orderedCollectors.addAll(collectors);//人员不排序
			}
			/**
			 * 将已排好顺序的案件和催收员进行分配
			 */
			this.addAllocNoUpper(selectedCaseList, orderedCollectors,userName);
		}
	}

	/**
	 * @Description: 多劳多得具体流程 (组长有上限)
	 * @param selectedCaseList
	 * @param collectors
	 * @param upperLimitMap
	 * @param userCountMap
	 * @param userName
	 * @param status
	 */
	public void workMoreUpperLimit(List<PlmsWorkOrderAssignDto> selectedCaseList,List<String> collectors,Map<String,Integer> upperLimitMap,Map<String,Integer> userCountMap,String userName,String status) {
		Map<String,Object> tmap = new HashMap<String,Object>();
		tmap.put("status", status);
		tmap.put("time", "yesterday");
		tmap.put("collectors", collectors);
		List<PlmsLaCollectRec> recList = plmsLaCollectRecService.selectByTime(tmap);
		List<PlmsEmpCollectDto> empCollectRecList = this.selectCollectorCaseCount(status,"yesterday",collectors);
		//1,昨天被选中催收员总共回收案件数不为0
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
							userCountMap.remove(key);
						}
					}
				}
				//第一轮分配需确保每人都分得一个，若新增案件数小于催收员个数，则先分配给前几个催收员
				if(selectedCaseList.size()<=empCollectRecList.size()){
					int index = 0;
					List<PlmsLaCollectAlloc> allocAddList = new ArrayList<PlmsLaCollectAlloc>();
					//催收记录列表
					//List<PlmsLaCollectionRecord> recordList = new ArrayList<PlmsLaCollectionRecord>();

					for(PlmsWorkOrderAssignDto adto:selectedCaseList){
						PlmsLaCollectAlloc addAlloc =  new PlmsLaCollectAlloc();
						//PlmsLaCollectionRecord record = new PlmsLaCollectionRecord();
						String userId = empCollectRecList.get(index).getUserId();
						addAlloc.setCollector(userId);
						this.setAllocModel(adto, addAlloc,userName);
						//this.setCollectionRecord(adto,record);
						allocAddList.add(addAlloc);
						//recordList.add(record);
						index++;
					}
					//添加新的分配记录
					if(allocAddList!=null&&allocAddList.size()>0){
						plmsLaCollectAllocService.insertBatch(allocAddList);
					}
					//添加催收记录
//					if(recordList!=null&&recordList.size()>0){
//						plmsLaCollectionRecordService.insertBatch(recordList);
//					}

				}else{

					this.addAllocWorkMoreUpperLimit_(selectedCaseList, empCollectRecList,scopeCount,upperLimitMap,userCountMap,userName);
				}
			}else{

				logger.info("该区间没有相应的催收人员");
			}
		}//2,昨天区间回收案件数为0
		else{
			Map<String,Object> tmap02 = new HashMap<String,Object>();
			tmap02.put("status", status);
			tmap02.put("time", "before");
			tmap02.put("collectors", collectors);
			//前两天区间回收案件数
			List<PlmsLaCollectRec> beforeList = plmsLaCollectRecService.selectByTime(tmap02);
			//当月个人累计回收案件数,催收员按回收案件数降序排列
			List<PlmsEmpCollectDto> empCollectList = this.selectCollectorCaseCount(status,"month",collectors);
			List<PlmsEmpCollectDto> empbeforeCollectList = this.selectCollectorCaseCount(status,"theBeforemonth",collectors);
			/**
			 * 昨天回收案件数为0，前天不为0
			 */
			List<String> orderedCollectors = new ArrayList<String>();
			if(beforeList!=null&&beforeList.size()>0){
				//所有催收员当月个人累计回收案件数都为0(最多案件数的为0则都为0)
				if(empCollectList.get(0).getMonthCaseCount()==0){
					//所有催收员上月个人累计回收案件数都为0(最多案件数的为0则都为0)
					if(empbeforeCollectList.get(0).getMonthCaseCount()==0){
						//人员不排序
						Collections.shuffle(collectors);//人员随机排序
						orderedCollectors.addAll(collectors);
					}else{
						//催收人员根据回收案件数不为0的做降序排列，为0的随机排序
						List<PlmsEmpCollectDto> empList = empOrder(empbeforeCollectList,"desc");
						for(int i=0;i<empList.size();i++){
							orderedCollectors.add(i, empList.get(i).getUserId());
						}
					}
				}else{
					//按催收员回收案件数降序排列
					//已排好数据按照人员排序结果循环分配
					List<PlmsEmpCollectDto> empList = empOrder(empCollectList,"desc");
					for(int i=0;i<empList.size();i++){
						orderedCollectors.add(i, empList.get(i).getUserId());
					}
				}

			}/**连续两天区间回收案件数为0**/
			else{
				Collections.shuffle(collectors);//人员随机排序
				orderedCollectors.addAll(collectors);//人员不排序
			}
			/**
			 * 将已排好顺序的案件和催收员进行分配
			 */
			this.addAllocUpperLimit_(selectedCaseList, orderedCollectors,upperLimitMap,userCountMap,userName);
		}
	}

	/**
	* @Description: 代理分配
	* @param paymentIds
	* @param agents
	* @param agentStart
	* @param agentEnd
	* @return
	 */
	@Override
	public void updateagentAlloc(List<Long> paymentIds, List<String> agents,Date agentStart, Date agentEnd,String userName) {
		PlmsLaCollectAllocExample example = new PlmsLaCollectAllocExample();
		example.createCriteria().andIsActiveEqualTo("Y").andAllocEndDateIsNull().andPaymentIdIn(paymentIds);
		example.setOrderByClause("REMAINING_PRINCIPAL desc");
		List<PlmsLaCollectAlloc> allocList = plmsLaCollectAllocService.selectByExample(example);
		
		/*PlmsLaCollectAgentExample exam = new PlmsLaCollectAgentExample();
		exam.createCriteria().andIsActiveEqualTo("Y").andAllocBeginDateGreaterThanOrEqualTo(new Date()).andPaymentIdIn(paymentIds);*/
		Map<String,Object> map = new HashMap<String,Object>();
        map.put("payments", paymentIds);
        map.put("mode", 1);
        map.put("agentStart", agentStart);
        map.put("agentEnd", agentEnd);
		List<PlmsLaCollectAgent> updateAgentList = plmsLaCollectAgentService.selectByExample2(map);
		if(updateAgentList!=null&&updateAgentList.size()>0){
			for(PlmsLaCollectAgent agent:updateAgentList){
				agent.setIsActive("N");
				agent.setUpdatedBy(userName);
				agent.setUpdateTime(new Date());
			}
			plmsLaCollectAgentService.updateBatch(updateAgentList);
		}
		List<PlmsLaCollectAgent> agentList = new ArrayList<PlmsLaCollectAgent>();
		int index = 0;
		int agentCount = agents.size();
		if(allocList!=null&&allocList.size()>0){
			for(PlmsLaCollectAlloc alloc:allocList){
				PlmsLaCollectAgent agent = new PlmsLaCollectAgent();
				agent.setPaymentId(alloc.getPaymentId());
				agent.setApplId(alloc.getApplId());
				agent.setAgent(agents.get(index));
				index++;
				if(index>=agentCount){
					index = 0;
				}
				agent.setAssignTime(new Date());
				agent.setAllocBeginDate(agentStart);
				agent.setAllocEndDate(agentEnd);
				agent.setClient(alloc.getCollector());
				agent.setIsActive("Y");
				agent.setCreatedBy(userName);
				agent.setCreateTime(new Date());
				agent.setUpdatedBy(userName);
				agent.setUpdateTime(new Date());
				agent.setRecVer(0L);
				agent.setTagSeq(1L);
				agentList.add(agent);
			}
		}
		plmsLaCollectAgentService.insertBatch(agentList);
	}

	/**
	 * @Description: 手动调整需要修改的催收分配记录
	 * @param payments
	 * @return Map<Long,PlmsLaCollectAlloc>
	 */
	private Map<Long,Map<String, Object>> updateAllocData(List<Long> payments,String userName){
		Map<Long,Map<String, Object>> resultMap = new HashMap<Long,Map<String, Object>>();
		Date updateDate = new Date();
		PlmsLaCollectAllocExample exapAlloc = new PlmsLaCollectAllocExample();
		exapAlloc.createCriteria().andAllocEndDateIsNull().andPaymentIdIn(payments).andIsActiveEqualTo("Y");
		List<PlmsLaCollectAlloc> allocList = plmsLaCollectAllocService.selectByExample(exapAlloc);
		if(allocList!=null&&allocList.size()>0){
			for(PlmsLaCollectAlloc alloc : allocList){
				Date beginDate = alloc.getAllocBeginDate();
				if(D.trunc(beginDate).compareTo(D.trunc(new Date()))==0){
					alloc.setIsActive("N");
					Map<String, Object> mapT = new HashMap<String, Object>();
					mapT.put("beginDate", alloc.getAllocBeginDate());
					resultMap.put(alloc.getPaymentId(),mapT);
				}
				alloc.setAllocType("ADJUST");
				alloc.setAllocEndDate(updateDate);
				alloc.setUpdateTime(updateDate);
				alloc.setUpdatedBy(userName);
				alloc.setAdjustedBy(userName);
				alloc.setAdjustTime(updateDate);
			}
			plmsLaCollectAllocService.updateBatch(allocList);
		}
		return resultMap;
	}
		 
	 /**
	 * @Description: 手动调整需要修改的代理催收分配记录  
	 * @param payments
	 * @return Map<Long,PlmsLaCollectAgent>
	  */
	 private void updateAgentData(List<Long> payments,String userName,Map<Long,Map<String, Object>> reMap){
		 	Date updateDate = new Date();
		 	Map<String,Object> map = new HashMap<String,Object>();
	        map.put("payments", payments);
	        map.put("mode", 2);
			List<PlmsLaCollectAgent> agentList = plmsLaCollectAgentService.selectByExample2(map);
			if(agentList!=null&&agentList.size()>0){
				for(PlmsLaCollectAgent agent : agentList){
					if(reMap.containsKey(agent.getPaymentId())){
						agent.setIsActive("N");
					}else{
						if(agent.getAllocBeginDate().compareTo(updateDate)>0){
							agent.setIsActive("N");
						}else{
							agent.setAllocEndDate(updateDate);
						}
					}
					agent.setUpdatedBy(userName);
					agent.setUpdateTime(updateDate);
				}
				plmsLaCollectAgentService.updateBatch(agentList);
			}	
	 }

	/**
	 * @Description: 组长无上限的分配方式 (平均分配)
	 * @param dList
	 * @param empCollectList
	 * @return
	 * @return List<PlmsLaCollectAlloc>
	 */
	@Override
	public List<PlmsLaCollectAlloc> addAllocNoUpper(List<PlmsWorkOrderAssignDto> dList,List<String> empCollectList,String userName){
		int index = 0;
		int collectorsSize = empCollectList.size();
		//分配列表
		List<PlmsLaCollectAlloc> allocAddList = new ArrayList<PlmsLaCollectAlloc>();
		for(PlmsWorkOrderAssignDto adto:dList){
			PlmsLaCollectAlloc addAlloc =  new PlmsLaCollectAlloc();
			String userId = empCollectList.get(index);
			addAlloc.setCollector(userId);
			this.setAllocModel(adto, addAlloc,userName);
			allocAddList.add(addAlloc);
			index++;
			if(index>=collectorsSize){
				index=0;
			}
		}
		//添加催收分配
		if(allocAddList!=null&&allocAddList.size()>0){
			plmsLaCollectAllocService.insertBatch(allocAddList);
		}
		return allocAddList;
	}

	
	
	
	
	
	private void setAllocModel(PlmsWorkOrderAssignDto adto,PlmsLaCollectAlloc addAlloc,String userName){
		Date date = new Date();
		//创建新的分配记录
		addAlloc.setApplId(adto.getApplId());
		addAlloc.setPaymentId(adto.getPaymentId());
		addAlloc.setOverdueDays(adto.getOverdueDays());
		addAlloc.setRemainingPrincipal(adto.getRemainingPrincipal());
		addAlloc.setAssignTime(date);
		addAlloc.setAllocBeginDate(date);
		addAlloc.setAllocType("MARU");
		addAlloc.setIsActive("Y");
		addAlloc.setCreatedBy(userName);
		addAlloc.setCreateTime(date);
		addAlloc.setUpdatedBy(userName);
		addAlloc.setUpdateTime(date);
		addAlloc.setTagSeq(1L);
		addAlloc.setRecVer(0L);
	}


	/**
	 * @Description: 获取指定催收员的回收案件情况
	 * @param status
	 * @param time
	 * @param collectors
	 * @return List<PlmsEmpCollectDto>
	 */
	private List<PlmsEmpCollectDto> selectCollectorCaseCount(String status,String time,List<String> collectors){
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("status", status);
		map.put("time", time);
		map.put("collectors", collectors);
		List<PlmsEmpCollectDto> empList = plmsEmpCollectSetService.selectDtoByExampleList02(map);
		return empList;

	}

	/**
	 * @Description: 多劳多得分配公式一
	 * @param wordMoreList
	 * @param empCollectList
	 * @param scopeCount
	 * @param userName
	 * @return List<PlmsLaCollectAlloc>
	 */
	private List<PlmsLaCollectAlloc> addAllocWorkMore(List<PlmsWorkOrderAssignDto> wordMoreList,List<PlmsEmpCollectDto> empCollectList,int scopeCount,String userName){
		int index = 0;
		List<PlmsLaCollectAlloc> allocAddList = new ArrayList<PlmsLaCollectAlloc>();
		List<PlmsWorkOrderAssignDto> tempMoreWorkList = new ArrayList<PlmsWorkOrderAssignDto>();
		int caseCount = wordMoreList.size()-empCollectList.size();
		//第一轮分配需确保每人都分得一个
		for(PlmsWorkOrderAssignDto adto:wordMoreList){
			tempMoreWorkList.add(adto);
			PlmsLaCollectAlloc addAlloc =  new PlmsLaCollectAlloc();
			//PlmsLaCollectionRecord record = new PlmsLaCollectionRecord();
			String userId = empCollectList.get(index).getUserId();
			addAlloc.setCollector(userId);
			this.setAllocModel(adto, addAlloc,userName);
			//	this.setCollectionRecord(adto, record);
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
				map.put(empCollectList.get(i).getUserId(), map.get(empCollectList.get(i).getUserId())+1);
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
				map.put(empCollectList.get(i).getUserId(), map.get(empCollectList.get(i).getUserId())+1);
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
				this.setAllocModel(wordMoreList.get(j), addAlloc,userName);
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

		return allocAddList;
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
			List<PlmsEmpCollectDto> empCollectList,
			int scopeCount,
			Map<String, Integer> upperLimitMap,
			Map<String, Integer> userCountMap,String userName) {
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
				this.setAllocModel(adto, addAlloc,userName);
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
					this.setAllocModel(wordMoreList.get(j), addAlloc,userName);
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
		}else{
			addAllocWorkMore(wordMoreList,empCollectList, scopeCount,userName);
		}
	}

	/**
	 * @Description: 分两段进行排序 (不为0的按要求排序，为0 的随机排序)
	 * @param empCollectList
	 * @param order
	 * @return
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
	 * @Description: 催收员排序
	 * @param order
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
	 * 先流转,再自动分配被保护案件
	 * @param applIds 借款IDS
	 * @param userId 操作人ID
	 * @param userName 操作人姓名
	 */
	@Override
	public void updateAutoAllocProtectCase(List<Long> applIds, String userId,String userName) {
		//1,先流转
		//需要流转的案件列表
		Map<String,Object> mapA = new HashMap<String,Object>();
		mapA.put("applIds", applIds);
		List<PlmsWorkOrderPoolDto>  caseList = plmsWorkOrderPoolMapper.searchReceiveOverdueByApplIds(mapA);

		if(caseList!=null && caseList.size()>0){
			//1,先处理在保护期间结清的数据
			//已结清案件paymentId集合
			List<Long> clearPayments = new ArrayList<Long>();
			//未结清案件paymentId集合
			//List<Long> circuPayments = new ArrayList<Long>();
			//已结清案件集合
			List<PlmsWorkOrderPoolDto> clearDtoList = new ArrayList<PlmsWorkOrderPoolDto>();
			Iterator<PlmsWorkOrderPoolDto> iter = caseList.iterator();
			while(iter.hasNext()){
				PlmsWorkOrderPoolDto pdto = iter.next();
				if(pdto.getOverDays()==null||pdto.getOverDays().longValue()==0){
					clearPayments.add(pdto.getPaymentId());
					clearDtoList.add(pdto);
					iter.remove();
				}else{
					//circuPayments.add(pdto.getPaymentId());
					
				}
			}

			//对于已结清的案件的处理 a.插入结清表 b.处理催收员c.处理代理催收员 d.案件流转
			if(clearPayments!=null&&clearPayments.size()>0){
					//查找结清时真正的催收员
					List<PlmsLaCollectRecDto> recDtoList = plmsEmpCollectSetService.judgeCollector(clearPayments);
					if(recDtoList!=null&&recDtoList.size()>0){
						// a.插入结清表
						List<PlmsLaCollectRec> recList = new ArrayList<PlmsLaCollectRec>();
						for(PlmsLaCollectRecDto rdto:recDtoList){
							PlmsLaCollectRec rec = new PlmsLaCollectRec();
							setRecModel(rdto,rec,userId);
							recList.add(rec);
						}
						plmsLaCollectRecService.insertBatch(recList);
						//b.处理催收员
						UpdateProtectAllocData(clearPayments,userId);
						//c.处理代理催收员
						UpdateProtectAgentData(clearPayments,userId);
						//d.案件流转
						List<PlmsWorkOrderPool> clearPoolList = new ArrayList<PlmsWorkOrderPool>();
						List<PlmsWorkOrderPoolLog> clearLogList = new ArrayList<PlmsWorkOrderPoolLog>();
						for(PlmsWorkOrderPoolDto dto:clearDtoList){
							PlmsWorkOrderPool pool = new PlmsWorkOrderPool();
							PlmsWorkOrderPoolLog log = new PlmsWorkOrderPoolLog();
								/*工单池数据*/
							pool.setPaymentId(dto.getPaymentId());
							pool.setStatus("0");
							pool.setUpdateTime(new Date());
							pool.setUpdatedBy(userId);
							pool.setRecVer(dto.getRecVer());
							clearPoolList.add(pool);
								/*工单日志表数据*/
							log.setStatus("0");
							setLogModel(dto,log,userId);
							clearLogList.add(log);
						}
						//批量修改工单池中的数据
						/*修改工单池中已经不逾期的数据的状态*/
						plmsWorkOrderPoolService.updateBatch(clearPoolList);
						//批量插入工单日志表中的数据
						plmsWorkOrderPoolLogService.insertBatch(clearLogList);

					}
			}

			//未结清案件处理
			//对于未结清的案件的处理  a1,判断区间是否改变，若没变则不流转也不分配，否则（a.处理催收员b.处理代理催收员 c.案件流转d.分配）
			if(caseList != null && caseList.size() > 0){
				//c,案件流转
				//查询具有逾期天数的催收区间设定表
				List<PlmsCollectionRuleSetDto> poolRuleList = plmsCollectionRuleSetService.selectworkOrderPoolRulesList();
				List<PlmsWorkOrderPool> circuPoolList = new ArrayList<PlmsWorkOrderPool>();
				List<PlmsWorkOrderPoolLog> circuLogList = new ArrayList<PlmsWorkOrderPoolLog>();
				if(poolRuleList!=null && poolRuleList.size() > 0){
					//进入委外的案件集合
					List<AddOutsrcApplDto> addOutsrcApplList = new ArrayList<AddOutsrcApplDto>();
					Iterator<PlmsWorkOrderPoolDto> iterator = caseList.iterator();
					while(iterator.hasNext()){
						PlmsWorkOrderPoolDto cp = iterator.next();
						PlmsWorkOrderPool pool = new PlmsWorkOrderPool();
						PlmsWorkOrderPoolLog log = new PlmsWorkOrderPoolLog();
						setStatus(cp,pool,log,poolRuleList);
						if(pool.getStatus().equals(cp.getStatus())){
							iterator.remove();
						}else {
							/*工单池数据*/
							pool.setPaymentId(cp.getPaymentId());
							pool.setUpdateTime(new Date());
							pool.setRecVer(cp.getRecVer());
							pool.setUpdatedBy(userId);
							circuPoolList.add(pool);
							
						}
						/*工单日志数据*/
						setLogModel(cp,log,userId);
						circuLogList.add(log);

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
								outsrcApplDto.setCntrctNo(cp.getCntrctNo());
								Integer overduePeriod = cp.getOverduePeriod();
								if(overduePeriod != null){
									outsrcApplDto.setOverduePeriod(Long.valueOf(overduePeriod));
								}
								outsrcApplDto.setIdCardNo(cp.getDocno());
								outsrcApplDto.setOverDays(cp.getOverDays());
								outsrcApplDto.setRegionId(cp.getRegionId());
								addOutsrcApplList.add(outsrcApplDto);
							}
						}
					}

					//如果有流转进委外区间的,新增委外申请并预分配
					plmsLaApplOutsrcService.saveAutoAppl(addOutsrcApplList,"保护案件分配进入委外区间",userId,userName);
				}
				
				
				//批量修改工单池中的数据
				plmsWorkOrderPoolService.updateBatch(circuPoolList);
				//批量插入工单日志表中的数据
				plmsWorkOrderPoolLogService.insertBatch(circuLogList);
				
				//更换区间后才会重新分配
				if(caseList != null && caseList.size() > 0){
					List<Long> circuPayments = new ArrayList<Long>();
					for(PlmsWorkOrderPoolDto c:caseList){
						circuPayments.add(c.getPaymentId());
					}
					//b.处理催收员
					UpdateProtectAllocData(circuPayments,userId);
					//c.处理代理催收员
					UpdateProtectAgentData(circuPayments,userId);
				}
				//d.按各区间的分配规则进行分配
				if(circuPoolList!=null&&circuPoolList.size()>0){
					for(PlmsCollectionRuleSetDto c:poolRuleList){
						if(c.getAssignRuleCode()!=null){
							List<Long> paymentIds = new ArrayList<Long>();
							for(PlmsWorkOrderPool pool:circuPoolList){
								if(pool.getStatus().equals(c.getStatus())){
									paymentIds.add(pool.getPaymentId());
								}
							}
							if(paymentIds!=null&&paymentIds.size()>0){
								Map<String,Object> mapT = new HashMap<String,Object>();
								mapT.put("payments", paymentIds);
								mapT.put("status", c.getStatus());
								//案件按业务类型，剩余本金降序排序
								List<PlmsWorkOrderAssignDto> dtoList = plmsWorkOrderPoolService.selectMaruAssignList(mapT);
								if(dtoList!=null&&dtoList.size()>0){
									PlmsUserUpperLimitExample exampLimit = new PlmsUserUpperLimitExample();
									exampLimit.setIsActive("Y");
									//有分配上限的列表
									List<PlmsUserUpperLimit> limitList = plmsUserUpperLimitService.selectByExample(exampLimit);
									//记录有分配上限的催收员和分配到的案件数
									Map<String,Integer> userCountMap = new LinkedHashMap<String,Integer>();
									////记录有分配上限的催收员和上限数
									Map<String,Integer> upperLimitMap = new LinkedHashMap<String,Integer>();
									//人员先按【月新增累计库存】升序排序，再按【月新增累计库存剩余本金】升序排序
									Map<String,Object> map = new HashMap<String,Object>();
									map.put("groupId", Long.parseLong(c.getStatus()));
									map.put("status", c.getStatus());
									map.put("circuRuleCode", c.getCircuRuleCode());
									List<PlmsEmpCollectDto>	empCollectList = new ArrayList<PlmsEmpCollectDto>();
									if(c.getAssignRuleCode().equals("AVRG_DIST")){
										empCollectList = plmsEmpCollectSetService.selectDtoByExampleList(map);
										if(empCollectList!=null&&empCollectList.size()>0){
											List<String> collectors = new ArrayList<String>();
											for(int i=0;i<empCollectList.size();i++){
												collectors.add(i, empCollectList.get(i).getUserId());
											}
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
												this.addAllocUpperLimit_(dtoList, collectors,upperLimitMap,userCountMap,userId);
											}else{
												this.addAllocNoUpper(dtoList, collectors,userId);
											}
										}else{
											logger.info("--------此区间没有催收员------");
										}
									}else if(c.getAssignRuleCode().equals("WORK_MORE")){
										empCollectList = plmsEmpCollectSetService.selectDtoByExampleList(map);
										if(empCollectList!=null&&empCollectList.size()>0){
											List<String> collectors = new ArrayList<String>();
											for(int i=0;i<empCollectList.size();i++){
												collectors.add(i, empCollectList.get(i).getUserId());
											}
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
												workMoreUpperLimit(dtoList,collectors,upperLimitMap,userCountMap,userId,c.getStatus());
											}else{
												workMore(dtoList,collectors,userId,c.getStatus());
											}
										}else{
											logger.info("--------此区间没有催收员------");
										}
									}else if(c.getAssignRuleCode().equals("DOT_DIST")){
										//存储各网点的及其对应的案件
										Map<String,List<PlmsWorkOrderAssignDto>> mapCase = new HashMap<String,List<PlmsWorkOrderAssignDto>>();
										for(PlmsWorkOrderAssignDto dto:dtoList){
											String sideCode = dto.getSiteCode();
											if(sideCode.equals("881")||sideCode.equals("882")){
												sideCode = dto.getSignCode();
											}
											if(mapCase.containsKey(sideCode)){
												List<PlmsWorkOrderAssignDto> list =mapCase.get(sideCode);
												list.add(dto);
												mapCase.put(sideCode,list);
											}else{
												List<PlmsWorkOrderAssignDto> temp = new ArrayList<PlmsWorkOrderAssignDto>();
												temp.add(dto);
												mapCase.put(sideCode, temp);
											}
										}
										if(mapCase.size()>0){
											for(String key:mapCase.keySet()){
												List<PlmsWorkOrderAssignDto> oneList = mapCase.get(key);
												//此网点的案件先按业务类型排序，然后按剩余本金降序排
												Collections.sort(oneList, getComparaOfSiteCase());
												//此网点对应的催收员
												map.put("siteCode", key);
												//人员先按【月新增累计库存】升序排序，再按【月新增累计库存剩余本金】升序排序
												empCollectList = plmsEmpCollectSetService.selectDtoByExampleList(map);
												if(empCollectList.size()>0){
													List<String> collList = new ArrayList<String>();
													for(int i=0;i<empCollectList.size();i++){
														collList.add(i, empCollectList.get(i).getUserId());
													}
													this.addAllocNoUpper(oneList, collList,userId);
												}else{
													logger.info("网点"+key+"所对应的机构下没有催收员");
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
	}

	private void setRecModel(PlmsLaCollectRecDto rdto, PlmsLaCollectRec rec,String userName) {
		rec.setRecDate(new Date());
		rec.setApplId(rdto.getApplId());
		rec.setPaymentId(rdto.getPaymentId());
		rec.setCollector(rdto.getCollector());
		rec.setStatus(rdto.getStatus());
		rec.setIsActive("Y");
		rec.setCreatedBy(userName);
		rec.setCreateTime(new Date());
		rec.setUpdatedBy(userName);
		rec.setUpdateTime(new Date());
		rec.setRecVer(0L);
		rec.setTagSeq(1L);
	}

	private void setLogModel(PlmsWorkOrderPoolDto p,PlmsWorkOrderPoolLog log,String userName){
		log.setApplId(p.getApplId());
		log.setPaymentId(p.getPaymentId());
		log.setOverdueDays(p.getOverDays()==null?0:p.getOverDays());
		log.setRemainingPrincipal(p.getRemainingPrincipal());
		log.setOverduePeriod(p.getOverduePeriod()==null?0:p.getOverduePeriod());
		log.setHandleDate(new Date());
		log.setActionType("update");
		log.setAction("update");
		log.setActionDate(new Date());
		log.setCreatedBy(userName);
		log.setCreateTime(new Date());
		log.setUpdatedBy(userName);
		log.setUpdateTime(new Date());
		log.setTagSeq(1L);
		log.setRecVer(0L);
	}

	/**
	 * @Description: 需要修改的催收分配记录
	 * @param payments
	 * @return
	 * @return Map<Long,PlmsLaCollectAlloc>
	 */
	private void UpdateProtectAllocData(List<Long> payments,String userName){
		PlmsLaCollectAllocExample exapAlloc = new PlmsLaCollectAllocExample();
		Date updateDate = new Date();
		exapAlloc.createCriteria().andAllocEndDateIsNull().andPaymentIdIn(payments).andIsActiveEqualTo("Y");
		List<PlmsLaCollectAlloc> allocList = plmsLaCollectAllocService.selectByExample(exapAlloc);
		if(allocList!=null&&allocList.size()>0){
			for(PlmsLaCollectAlloc alloc : allocList){
				alloc.setAllocEndDate(updateDate);
				alloc.setUpdateTime(updateDate);
				alloc.setUpdatedBy(userName);
				alloc.setAdjustedBy(userName);
				alloc.setAdjustTime(updateDate);
				alloc.setAllocType("MARU");
			}
			plmsLaCollectAllocService.updateBatch(allocList);

		}
	}

	/**
	 * @Description: 需要修改的代理催收分配记录
	 * @param payments
	 * @return
	 * @return Map<Long,PlmsLaCollectAgent>
	 */
	private void UpdateProtectAgentData(List<Long> payments,String userName){
		Date updateDate = new Date();
					/*PlmsLaCollectAgentExample examAgent = new PlmsLaCollectAgentExample();
		            examAgent.createCriteria().andAllocEndDateGreaterThanOrEqualTo(new Date()).andPaymentIdIn(payments).andIsActiveEqualTo("Y");*/
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("payments", payments);
		map.put("mode", 2);
		// map.put("agentEnd", new Date());
		List<PlmsLaCollectAgent> agentList = plmsLaCollectAgentService.selectByExample2(map);
		if(agentList!=null&&agentList.size()>0){
			for(PlmsLaCollectAgent agent : agentList){
				if(agent.getAllocBeginDate().compareTo(updateDate)>0){
					agent.setIsActive("N");
				}else{
					agent.setAllocEndDate(updateDate);
				}

				agent.setUpdateTime(updateDate);
				agent.setUpdatedBy(userName);
			}
			plmsLaCollectAgentService.updateBatch(agentList);
		}
	}

	/**
	 * @Description: 判断案件流转状态
	 * @param p
	 * @param model
	 * @param log
	 * @param poolRuleList
	 */
	private void setStatus(PlmsWorkOrderPoolDto p,PlmsWorkOrderPool model,PlmsWorkOrderPoolLog log,List<PlmsCollectionRuleSetDto> poolRuleList) {
		for(PlmsCollectionRuleSetDto c : poolRuleList){
			Long overduedaysFrom = c.getOverduedaysFrom();
			Long overduedaysTo = c.getOverduedaysTo();
			if(overduedaysFrom!=null&&overduedaysTo==null){
				if(p.getOverDays()>=overduedaysFrom){
					model.setStatus(c.getStatus());
					model.setCircuRuleCode(c.getCircuRuleCode());
					log.setStatus(c.getStatus());
				}
			}else{
				if(overduedaysFrom<=p.getOverDays()&&overduedaysTo>=p.getOverDays()){
					model.setStatus(c.getStatus());
					model.setCircuRuleCode(c.getCircuRuleCode());
					log.setStatus(c.getStatus());
				}
			}
		}
	}

//	/**
//	 * @Description: 组长有上限的分配方式 （平均分配）
//	 * @param dList
//	 * @param empCollectList
//	 * @param upperTime
//	 * @param leaderCount
//	 * @return Map<String,Object>
//	 */
//	private Map<String,Object> addAllocUpperLimit(List<PlmsWorkOrderAssignDto> dList,List<PlmsEmpCollectDetailDto> empCollectList,int upperTime,int leaderCount,String userName){
//		Map<String,Object> map = new HashMap<String,Object>();
//		int index = 0;
//		String leaderId = null;
//		int leaderIndex = -1;
//		for(int i=0;i<empCollectList.size();i++){
//			if(empCollectList.get(i).getGroupLeaderId()==null){
//				leaderId = empCollectList.get(i).getCollector();
//				leaderIndex = i;
//			}
//		}
//		//如果组长实际分配以大于等于上限值，则直接从催收员列表中移除
//		if(upperTime<=leaderCount){
//			empCollectList.remove(leaderIndex);
//			leaderIndex = -1;
//		}
//
//		int collectorsSize = empCollectList.size();
//		List<PlmsLaCollectAlloc> allocAddList = new ArrayList<PlmsLaCollectAlloc>();
//
//		for(PlmsWorkOrderAssignDto adto:dList){
//			PlmsLaCollectAlloc addAlloc =  new PlmsLaCollectAlloc();
//			PlmsLaCollectionRecord record  = new PlmsLaCollectionRecord();
//			String userId = empCollectList.get(index).getCollector();
//			if(userId.trim().equals(leaderId)){
//				leaderCount++;
//			}
//			addAlloc.setCollector(userId);
//			this.setAllocModel(adto, addAlloc,userName);
//			allocAddList.add(addAlloc);
//			index++;
//			if(index>=collectorsSize){
//				index=0;
//			}
//			//组长超过上限时从催收员列表中移除
//			if(leaderCount>=upperTime&&leaderIndex!=-1){
//				empCollectList.remove(leaderIndex);
//				collectorsSize--;
//				//已经移除催收组长，则将组长序列置为-1
//				leaderIndex = -1;
//				//移除后要将序列回退
//				if(index>0){
//					index--;
//				}
//			}
//		}
//		//添加催收分配表
//		if(allocAddList!=null&&allocAddList.size()>0){
//			plmsLaCollectAllocService.insertBatch(allocAddList);
//		}
//		map.put("leaderCount", leaderCount);
//		return map;
//	}

//	/**
//	 * @Description: 组长有上限的分配方式 （平均分配）
//	 * @param dList
//	 * @param empCollectList
//	 * @param upperTime
//	 * @return Map<String,Object>
//	 */
//	private Map<String,Integer> addAllocUpperLimit(List<PlmsWorkOrderAssignDto> dList,List<String> empCollectList,int upperTime,Map<String,Integer> leaderMap,String userName){
//		//存放组长以及分配得案件数
//		Map<String,Integer> mapT = new LinkedHashMap<String,Integer> ();
//
//		//如果组长实际分配已大于等于上限值，则直接从催收员列表中移除
//		if(leaderMap.size()!=0){
//			for (String key : leaderMap.keySet()) {
//				if(upperTime<=leaderMap.get(key)){
//					Iterator <String> it = empCollectList.iterator();
//					while(it.hasNext()){
//						String userId = it.next();
//						if(userId.equals(key)){
//							mapT.put(key, leaderMap.get(key));
//							it.remove();
//						}
//					}
//				}
//			}
//			if(mapT.size()>0){
//				for (String key : mapT.keySet()) {
//					if(leaderMap.containsKey(key)){
//						leaderMap.remove(key);
//					}
//				}
//
//			}
//		}
//
//		int index = 0;
//
//		//分配列表
//		List<PlmsLaCollectAlloc> allocAddList = new ArrayList<PlmsLaCollectAlloc>();
//
//		for(PlmsWorkOrderAssignDto adto:dList){
//			PlmsLaCollectAlloc addAlloc =  new PlmsLaCollectAlloc();
//			String userId = empCollectList.get(index);
//			if(leaderMap.size()>0&&leaderMap.containsKey(userId)){
//				leaderMap.put(userId, leaderMap.get(userId)+1);
//			}
//			addAlloc.setCollector(userId);
//			this.setAllocModel(adto, addAlloc,userName);
//			allocAddList.add(addAlloc);
//			index++;
//			if(index>=empCollectList.size()){
//				index=0;
//			}
//			//组长超过上限时从催收员列表中移除
//			if(leaderMap.size()!=0){
//				for (String key : leaderMap.keySet()) {
//					if(upperTime<=leaderMap.get(key)){
//						Iterator <String> it = empCollectList.iterator();
//						while(it.hasNext()){
//							String userID = it.next();
//							if(userID.equals(key)){
//								mapT.put(key, leaderMap.get(key));
//								it.remove();
//								if(index>0){
//									index--;
//								}
//							}
//						}
//					}
//				}
//				if(mapT.size()>0){
//					for (String key : mapT.keySet()) {
//						if(leaderMap.containsKey(key)){
//							leaderMap.remove(key);
//						}
//					}
//
//				}
//			}
//		}
//		//添加催收分配表
//		if(allocAddList!=null&&allocAddList.size()>0){
//			plmsLaCollectAllocService.insertBatch(allocAddList);
//		}
//		return mapT;
//	}

	/**
	 * @Description: 催收员有分配上限的平均分配
	 * @param dList
	 * @param empCollectList
	 * @param upperLimitMap(此区间有上限的催收员和上限数)
	 * @param userCountMap(此区间有上限的催收员和现在已有的案件数)
	 * @return Map<String,Integer>
	 */
	private void addAllocUpperLimit_(List<PlmsWorkOrderAssignDto> dList,List<String> empCollectList,Map<String,Integer> upperLimitMap,Map<String,Integer> userCountMap,String userName){
		if(userCountMap.size()>0){
			//记录满足上限需要移除的催收员
			Map<String,Integer> mapT = new HashMap<String,Integer>();
			//如果实际分配已大于等于上限值，则直接从催收员列表中移除
			for (String key : userCountMap.keySet()) {
				if(upperLimitMap.get(key).intValue()<=userCountMap.get(key).intValue()){
					mapT.put(key, userCountMap.get(key));
					Iterator <String> it = empCollectList.iterator();
					while(it.hasNext()){
						String userId = it.next();
						if(userId.equals(key)){
							it.remove();
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

			int index = 0;
			//分配列表
			List<PlmsLaCollectAlloc> allocAddList = new ArrayList<PlmsLaCollectAlloc>();

			for(PlmsWorkOrderAssignDto adto:dList){
				PlmsLaCollectAlloc addAlloc =  new PlmsLaCollectAlloc();
				String userId = empCollectList.get(index);
				if(userCountMap.containsKey(userId)){
					userCountMap.put(userId, userCountMap.get(userId)+1);
				}
				addAlloc.setCollector(userId);
				this.setAllocModel(adto, addAlloc,userName);
				allocAddList.add(addAlloc);
				index++;
				if(index>=empCollectList.size()){
					index=0;
				}
				//超过上限时从催收员列表中移除
				if(userCountMap.size()!=0){
					for (String key : userCountMap.keySet()) {
						if(upperLimitMap.get(key)<=userCountMap.get(key)){
							mapT.put(key, userCountMap.get(key));
							Iterator <String> it = empCollectList.iterator();
							while(it.hasNext()){
								String userId_Remove = it.next();
								if(userId_Remove.equals(key)){
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
		}else{
			this.addAllocNoUpper(dList, empCollectList,userName);
		}
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

	/**
	 * @Description: 判断是否为月初
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
	 * @Description: 撤销保留操作
	 * @param logId
	 */
	@Override
	public void recallRetains(Long logId,String userId) {
		PlmsWorkOrderPoolLog poolLog = plmsWorkOrderPoolLogService.selectById(logId);
		if(poolLog!=null){
			PlmsWorkOrderPoolLog poolLogAdd = new PlmsWorkOrderPoolLog();
			poolLogAdd.setApplId(poolLog.getApplId());
			poolLogAdd.setPaymentId(poolLog.getPaymentId());
			poolLogAdd.setOverdueDays(poolLog.getOverdueDays());
			poolLogAdd.setRemainingPrincipal(poolLog.getRemainingPrincipal());
			poolLogAdd.setOverduePeriod(poolLog.getOverduePeriod());
			poolLogAdd.setStatus(poolLog.getStatus());
			poolLogAdd.setCreatedBy(userId);
			poolLogAdd.setUpdatedBy(userId);
			poolLogAdd.setCreateTime(new Date());
			poolLogAdd.setUpdateTime(new Date());
			plmsWorkOrderPoolLogService.insert(poolLogAdd);
		}
	}

}
