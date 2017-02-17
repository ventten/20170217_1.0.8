package com.ljwd.plms.web.service.outVisit.impl;


import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.commons.beanutils.ConvertUtils;
import org.springframework.stereotype.Service;

import com.ljwd.plms.core.feature.orm.mybatis.Page;
import com.ljwd.plms.core.generic.GenericDao;
import com.ljwd.plms.core.generic.GenericServiceImpl;
import com.ljwd.plms.core.util.ExportExcel;
import com.ljwd.plms.web.dao.case_collection.PlmsLaCollectionRecordMapper;
import com.ljwd.plms.web.dao.case_management.PlmsWorkOrderPoolMapper;
import com.ljwd.plms.web.dao.cust.PlmsClAddressInfoMapper;
import com.ljwd.plms.web.dao.outVisit.PlmsOvmOutDelayDtlMapper;
import com.ljwd.plms.web.dao.outVisit.PlmsOvmOutVisitInfoMapper;
import com.ljwd.plms.web.dao.outVisit.PlmsOvmOutVisitUserMapper;
import com.ljwd.plms.web.enums.OutVisitCustType;
import com.ljwd.plms.web.model.cust.PlmsClAddressInfo;
import com.ljwd.plms.web.model.outVisit.PlmsOvmOutDelay;
import com.ljwd.plms.web.model.outVisit.PlmsOvmOutDelayDtl;
import com.ljwd.plms.web.model.outVisit.PlmsOvmOutDelayDtlExample;
import com.ljwd.plms.web.model.outVisit.PlmsOvmOutDelayExample;
import com.ljwd.plms.web.model.outVisit.PlmsOvmOutVisitInfo;
import com.ljwd.plms.web.model.outVisit.PlmsOvmOutVisitInfoExample;
import com.ljwd.plms.web.model.outVisit.PlmsOvmOutVisitLog;
import com.ljwd.plms.web.model.outVisit.PlmsOvmOutVisitPlan;
import com.ljwd.plms.web.model.outVisit.PlmsOvmOutVisitUser;
import com.ljwd.plms.web.model.outVisit.PlmsOvmOutVisitUserExample;
import com.ljwd.plms.web.service.outVisit.inf.PlmsOvmOutDelayService;
import com.ljwd.plms.web.service.outVisit.inf.PlmsOvmOutVisitInfoService;
import com.ljwd.plms.web.service.outVisit.inf.PlmsOvmOutVisitLogService;
import com.ljwd.plms.web.service.outVisit.inf.PlmsOvmOutVisitPlanService;
import com.ljwd.plms.web.vo.DataTableParam;
import com.ljwd.plms.web.vo.SessionMsg;
import com.ljwd.plms.web.vo.case_collection.BreakCountDto;
import com.ljwd.plms.web.vo.case_management.PlmsWorkOrderPoolDto;
import com.ljwd.plms.web.vo.outVisit.AllOutVisitExportResult;
import com.ljwd.plms.web.vo.outVisit.AllOutVisitParamDto;
import com.ljwd.plms.web.vo.outVisit.AllOutVisitResult;
import com.ljwd.plms.web.vo.outVisit.MyOutVisitResult;
import com.ljwd.plms.web.vo.outVisit.OutVisitAssignParamDto;
import com.ljwd.plms.web.vo.outVisit.OutVisitAssignResult;
import com.ljwd.plms.web.vo.outVisit.OutVisitAuditParamDto;
import com.ljwd.plms.web.vo.outVisit.OutVisitAuditResult;
import com.ljwd.plms.web.vo.outVisit.OutVisitCaseType;
import com.ljwd.plms.web.vo.outVisit.OutVisitPlanDetailResult;
import com.ljwd.plms.web.vo.outVisit.OutVisitPlanStatusType;
import com.ljwd.plms.web.vo.outVisit.OutVisitStatusType;

@Service
public class PlmsOvmOutVisitInfoServiceImpl extends
		GenericServiceImpl<PlmsOvmOutVisitInfo, Long> implements PlmsOvmOutVisitInfoService {

	@Resource
	private PlmsOvmOutVisitInfoMapper plmsOvmOutVisitInfoMapper;
	@Resource
	private PlmsOvmOutVisitUserMapper plmsOvmOutVisitUserMapper;
	@Resource
	private PlmsLaCollectionRecordMapper plmsLaCollectionRecordMapper;
	@Resource
	private PlmsOvmOutVisitLogService plmsOvmOutVisitLogService;
	@Resource
	private PlmsWorkOrderPoolMapper plmsWorkOrderPoolMapper;
	@Resource
	private PlmsOvmOutVisitPlanService plmsOvmOutVisitPlanService;
	@Resource
	private PlmsOvmOutDelayService plmsOvmOutDelayService;
	@Resource
	private PlmsOvmOutDelayDtlMapper plmsOvmOutDelayDtlMapper;
	@Resource
	private PlmsClAddressInfoMapper plmsClAddressInfoMapper;
	
	@Override
	public GenericDao<PlmsOvmOutVisitInfo, Long> getDao() {
				
		return plmsOvmOutVisitInfoMapper;
	}

	/**
	 * 
	* @Description: 提交外访申请 
	* @param outVisitInfo
	* @return
	 */
	@Override
	public void addOutVisitInfo(PlmsOvmOutVisitInfoExample outVisitInfo,SessionMsg loginUser) {
			Long applId = outVisitInfo.getApplId();
			PlmsOvmOutVisitInfo outVisit = new PlmsOvmOutVisitInfo();
			setOutVisitInfoModel(outVisit,outVisitInfo,applId,loginUser);
			//申请成功
			int insertCount = plmsOvmOutVisitInfoMapper.insertSelective(outVisit);
			//插入外访记录日志
			PlmsOvmOutVisitLog outLog = insertOutLogModel(outVisit,loginUser,null);
			plmsOvmOutVisitLogService.insert(outLog);

			//判断是否满足自动审核的条件
			if(insertCount>0){
				//如满足则自动审核通过并进入【待分配】状态；如不满足，则进入【待审核】状态
				//a,该合同对应交单网点有外访人员
				List<PlmsOvmOutVisitUser> OutUserList = plmsOvmOutVisitUserMapper.searchOutVisitUserListByApplId(applId);
				if(OutUserList.size()>0){
					//b,【连续3次跳票（BP）且累计成功审核外访次数小于等于3次】或【客户为失联状态且累计成功审核外访次数小于等于3次】或【申请外访类型为贷前/贷后考查】
					//此案件的最早逾期期数
					Integer minPeriodNum = plmsOvmOutVisitInfoMapper.searchMinOverduePeriodByApplId(applId);
		            BreakCountDto breakCount = plmsLaCollectionRecordMapper.selectBreakCountByApplIdAndDuePeriod(applId, minPeriodNum);
		            Integer breakThisCount = 0;
		            if(breakCount!=null){
		            	//本期破坏承诺次数
		            	breakThisCount = breakCount.getBreakThisCount();           
					}
		            
					//累计成功审核外访次数
					Long auditedCount = plmsOvmOutVisitInfoMapper.checkIsAuditedOutVisitInfo(applId);
					//TODO(【申请外访类型为贷前/贷后考查】)未判断
					if((breakThisCount>=3&&auditedCount<=3)||(outVisit.getCustType().equals(OutVisitCustType.Lost.name())&&auditedCount<=3)){
						outVisit.setAuditBy("system");
						outVisit.setAuditDate(new Date());
						outVisit.setStatus(OutVisitStatusType.Audited);
						outVisit.setUpdatedBy("system");
						outVisit.setUpdateTime(new Date());
						//自动审核通过
						plmsOvmOutVisitInfoMapper.updateByPrimaryKeySelective(outVisit);
						//插入外访记录日志
						PlmsOvmOutVisitLog outLog_ = insertOutLogModel(outVisit,loginUser,"auto");
						plmsOvmOutVisitLogService.insert(outLog_);
					}
				}
			}
	}

	
	/**
	* @Description: 构造PlmsOvmOutVisitInfo
	* @param outVisit
	* @param outVisitInfo
	* @param long1
	* @return void
	 */
	private void setOutVisitInfoModel(PlmsOvmOutVisitInfo outVisit,
			PlmsOvmOutVisitInfoExample outVisitInfo, Long applId,SessionMsg loginUser) {
		outVisit.setApplId(applId);
		outVisit.setCustType(outVisitInfo.getCustType());
		outVisit.setSubmitBy(loginUser.getName());
		outVisit.setSubmitReason(outVisitInfo.getSubmitReason());
		outVisit.setSubmitDate(new Date());
		outVisit.setStatus(OutVisitStatusType.Submitted);
		outVisit.setVisitType("2");
		outVisit.setCreatedBy(loginUser.getName());
		outVisit.setCreateTime(new Date());
		outVisit.setUpdatedBy(loginUser.getName());
		outVisit.setUpdateTime(new Date());
		
	}

	/**
	 * 
	* @Description:  此案件已经存在已提交/已审核/已分配(即未结案)的外访记录，不能再提交 
	* @param applId
	* @return
	* @return
	 */
	@Override
	public List<PlmsOvmOutVisitInfo> checkIfExistOutVisitInfo(Map<String,Object> map) {
		return plmsOvmOutVisitInfoMapper.checkIfExistOutVisitInfo(map);
	}

	/**
	 * 
	* @Description: 外访审核分页
	* @param pagedata
	* @param example
	* @return
	* @return
	 */
	@Override
	public Page<OutVisitAuditResult> selectAuditByExampleAndPage(
			Page<OutVisitAuditResult> pagedata, OutVisitAuditParamDto example,DataTableParam dataTableParam) {
		 List<OutVisitAuditResult> outVisitList = plmsOvmOutVisitInfoMapper.selectAuditByExampleAndPage(pagedata, example);
		 if(outVisitList.size()>0){
			 for(OutVisitAuditResult info:outVisitList){
				 Long count = plmsOvmOutVisitInfoMapper.checkIsAuditedOutVisitInfo(info.getApplId());
				 info.setAuditedNum(count);
			 }
		 }
		 
		 //历史审核通过次数
		 if(outVisitList!=null&&outVisitList.size()>0){
			 
			 List<Integer> cols = dataTableParam.getiSortCols();
			 List<String> sorts = dataTableParam.getsSortDirs();
			 
			 if(cols!=null&&cols.size()>0&&sorts!=null&&sorts.size()>0){
				 Integer icoSort = cols.get(0);
				 if(icoSort !=null && icoSort.intValue()==14 ){
					 String  sort = sorts.get(0);
					 Comparator<OutVisitAuditResult> comparatoCollector = getComparaOfCase(sort);
					 Collections.sort(outVisitList, comparatoCollector);
				 } 
			 }
		 }
		 
		 	 
		 return pagedata;
	}

	/**
	 * 
	* @Description: 审核操作
	* @param applIds
	* @param handelResult
	* @param auditRefusedReason
	* @param auditedBy
	* @return
	 */
	@Override
	public void updateOutVisitAuditedStatus(PlmsOvmOutVisitInfoExample example,SessionMsg loginUser) {
		Long[] ids = example.getIds();
		String handelResult = example.getHandelResult();
		 //修改外访信息列表
		 List<PlmsOvmOutVisitInfo> updateInfoList = new ArrayList<PlmsOvmOutVisitInfo>();
		 //插入外访日志表
		 List<PlmsOvmOutVisitLog>  insertLogList = new ArrayList<PlmsOvmOutVisitLog>();
		for(int i=0;i<ids.length;i++){
			PlmsOvmOutVisitInfo info = plmsOvmOutVisitInfoMapper.selectByPrimaryKey(ids[i]);
			//审核通过
			if(handelResult.equals(OutVisitStatusType.Audited)){
				info.setAuditBy(loginUser.getName());
				info.setAuditDate(new Date());
				info.setStatus(OutVisitStatusType.Audited);
				info.setUpdatedBy(loginUser.getName());
				info.setUpdateTime(new Date());
			}//审核不通过
			else if(handelResult.equals(OutVisitStatusType.AuditRefused)){
				String auditRefusedReason = example.getAuditRefusedReason();
				info.setAuditBy(loginUser.getName());
				info.setAuditDate(new Date());
				info.setStatus(OutVisitStatusType.AuditRefused);
				info.setAuditRefuseReason(auditRefusedReason);
				info.setUpdatedBy(loginUser.getName());
				info.setUpdateTime(new Date());
			}
			updateInfoList.add(info);
			//插入外访记录日志 
			PlmsOvmOutVisitLog outLog = insertOutLogModel(info,loginUser,null);
			insertLogList.add(outLog);

		}
		plmsOvmOutVisitInfoMapper.updateBatch(updateInfoList);
		
		plmsOvmOutVisitLogService.insertBatch(insertLogList);

	}
	
	/**
	 * 
	* @Description: 插入外访记录日志 
	* @param outVisit
	* @return void
	 */
	private PlmsOvmOutVisitLog insertOutLogModel(
			PlmsOvmOutVisitInfo outVisit,SessionMsg loginUser,String auto) {
		PlmsOvmOutVisitLog outLog = new PlmsOvmOutVisitLog();
		outLog.setApplId(outVisit.getApplId());
		outLog.setCreateTime(new Date());
		outLog.setUpdateTime(new Date());
		//申请成功
		if(outVisit.getStatus().equals(OutVisitStatusType.Submitted)){
			outLog.setHandleBy(loginUser.getUserName());
			outLog.setContent("提交外访申请");
			outLog.setCreatedBy(outVisit.getSubmitBy());
			outLog.setUpdatedBy(outVisit.getSubmitBy());
			outLog.setStatus(OutVisitStatusType.Submitted);
		}//审核通过
		else if(outVisit.getStatus().equals(OutVisitStatusType.Audited)){
			outLog.setHandleBy(loginUser.getUserName());
			outLog.setCreatedBy(outVisit.getAuditBy());
			outLog.setUpdatedBy(outVisit.getAuditBy());
			outLog.setStatus(OutVisitStatusType.Audited);
			//系统自动审核通过
			if(auto!=null){
				outLog.setContent("系统自动审核通过");
			}//人工审核通过
			else{
				outLog.setContent("审核通过");
			}
			
		}//审核拒绝
		else if(outVisit.getStatus().equals(OutVisitStatusType.AuditRefused)){
			outLog.setHandleBy(loginUser.getUserName());
			outLog.setContent("审核拒绝,拒绝原因："+outVisit.getAuditRefuseReason());
			outLog.setCreatedBy(outVisit.getAuditBy());
			outLog.setUpdatedBy(outVisit.getAuditBy());
			outLog.setStatus(OutVisitStatusType.AuditRefused);

		}//分配完成
		else if(outVisit.getStatus().equals(OutVisitStatusType.Assigned)){
			outLog.setHandleBy(loginUser.getUserName());
			outLog.setContent("成功分配给"+outVisit.getVisitBy());
			outLog.setCreatedBy(outVisit.getAssignBy());
			outLog.setUpdatedBy(outVisit.getAssignBy());
			outLog.setStatus(OutVisitStatusType.Assigned);
		}//结案
		else if(outVisit.getStatus().equals(OutVisitStatusType.Closed)){
			outLog.setHandleBy(loginUser.getUserName());
			if(outVisit.getClosedType()!=null){
				if(outVisit.getClosedType().trim().equals("ErrorApply")){
					outLog.setContent("手动结案,结案类别：错误申请");
				}else{
					outLog.setContent("手动结案,结案类别：该区无外访人员");
				}				
			}else{
				outLog.setContent("手动结案");
			}
			outLog.setCreatedBy(outVisit.getUpdatedBy());
			outLog.setUpdatedBy(outVisit.getUpdatedBy());
			outLog.setStatus(OutVisitStatusType.Closed);
		}
		return outLog;
	}


	/**
	 * 
	* @Description: 外访分配分页
	* @param pagedata
	* @param example
	* @return
	 */
	@Override
	public Page<OutVisitAssignResult> selectAssignByExampleAndPage(
			Page<OutVisitAssignResult> pagedata, OutVisitAssignParamDto example) {
		List<OutVisitAssignResult> list = plmsOvmOutVisitInfoMapper.selectAssignByExampleAndPage(pagedata, example);
		if(list.size()>0){
			for(OutVisitAssignResult dto:list){
				if(dto.getOutVisitStatus().equals(OutVisitStatusType.Audited)){
					dto.setOutVisitStatusName("未分配");
				}else if(dto.getOutVisitStatus().equals(OutVisitStatusType.Assigned)){
					dto.setOutVisitStatusName("未计划");
				}else if(dto.getOutVisitStatus().equals(OutVisitStatusType.Planing)){
					dto.setOutVisitStatusName("计划中");
				}else if(dto.getOutVisitStatus().equals(OutVisitStatusType.Visited)){
					dto.setOutVisitStatusName("已外访");
				}else if(dto.getOutVisitStatus().equals(OutVisitStatusType.NoVisit)){
					dto.setOutVisitStatusName("已取消");
				}else if(dto.getOutVisitStatus().equals(OutVisitStatusType.Closed)){
					dto.setOutVisitStatusName("手工结案");
				}else if(dto.getOutVisitStatus().equals(OutVisitStatusType.Overdued)){
					dto.setOutVisitStatusName("已过期");
				}else if(dto.getOutVisitStatus().equals(OutVisitStatusType.Settle)){
					dto.setOutVisitStatusName("已结清");
				}else if(dto.getOutVisitStatus().equals(OutVisitStatusType.Outsourced)){
					dto.setOutVisitStatusName("已外包");
				}else if(dto.getOutVisitStatus().equals(OutVisitStatusType.Normal)){
					dto.setOutVisitStatusName("已正常");
				}
			}
		}
		return pagedata;
	}

//	/**
//	 * 
//	* @Description: 外访自动分配
//	* @param info
//	* @param assignBy
//	* @return
//	 */
//	@Override
//	public void outVisitAutoAssign(String[] info, SessionMsg loginUser) {
//		List<Long> araeIdList = plmsOvmOutVisitUserMapper.searchAreaIdForOutVisitUser();
//		Map<Long,List<Long>> map = new HashMap<Long,List<Long>>();
//		for(int i=0;i< info.length;i++){
//			String[] msg = info[i].split("\\|");
//			Long areaId = Long.parseLong(msg[2]);
//			for(Long aId:araeIdList){
//				if(areaId.longValue()==aId.longValue()){
//					if(map.containsKey(aId)){
//						List<Long> ids = map.get(aId);
//						ids.add(Long.parseLong(msg[0]));
//						map.put(aId,ids);
//					}else{
//						List<Long> ids = new ArrayList<Long>();
//						ids.add(Long.parseLong(msg[0]));
//						map.put(aId, ids);
//					}
//				}
//			}
//		}
//		//所属各个区域的案件组合
//		for (Long key : map.keySet()) {  
//			 List<Long> ids = map.get(key);
//			 if(ids==null||ids.size()==0){
//				 
//			 }else{
//				 Map<String,Object> mapTemp = new HashMap<String,Object>();
//				 mapTemp.put("ids", ids);
//				 //此区域的案件集合
//				 List<PlmsOvmOutVisitInfo> infoList = plmsOvmOutVisitInfoMapper.searchInfoByMap(mapTemp);
//				 Map<String,Object> mapTempUser = new HashMap<String,Object>();
//				 mapTempUser.put("areaId", key);
//				 //此区域外访员按总库存升序排序
//				 List<PlmsOvmOutVisitUser> ourUserList = plmsOvmOutVisitUserMapper.searchInfoByMap(mapTempUser);
//				 int userSize = ourUserList.size();
//				 //修改外访信息列表
//				 List<PlmsOvmOutVisitInfo> updateInfoList = new ArrayList<PlmsOvmOutVisitInfo>();
//				 //插入外访日志表
//				 List<PlmsOvmOutVisitLog>  insertLogList = new ArrayList<PlmsOvmOutVisitLog>();
//				 int index = 0;
//				 for(PlmsOvmOutVisitInfo dto:infoList){
//					 dto.setAssignBy(loginUser.getName());
//					 dto.setAssignDate(new Date());
//					 Calendar startDT = Calendar.getInstance();
//                     startDT.setTime(dto.getAssignDate());
//                     startDT.add(Calendar.DATE, 7);
//                     //预计结案时间
//                     dto.setExpectCloseTime(startDT.getTime());
//					 dto.setVisitBy(ourUserList.get(index).getUserId());
//					 ourUserList.get(index).setCaseCount(ourUserList.get(index).getCaseCount()==null?1:ourUserList.get(index).getCaseCount()+1);
//					 //此案件的被分配时的逾期天数和剩余本金
//					 Map<String,Object> mapApplId = new HashMap<String,Object>();
//					 mapApplId.put("applId", dto.getApplId());
//					 List<PlmsWorkOrderPoolDto>  caseTempList = plmsWorkOrderPoolMapper.searchReceiveOverdueByApplIds(mapApplId);
//					 if(caseTempList.size()>0){
//						 PlmsWorkOrderPoolDto pool =  caseTempList.get(0);
//						 dto.setRemainderPrincipal(pool.getRemainingPrincipal());
//						 dto.setOverdueDay(pool.getOverDays());
//						 ourUserList.get(index).setRemainderAmount( ourUserList.get(index).getRemainderAmount()==null?pool.getRemainingPrincipal():ourUserList.get(index).getRemainderAmount().add(pool.getRemainingPrincipal()));
//						 ourUserList.get(index).setUpdateTime(new Date());
//					 }else{
//						 throw new RuntimeException("自动分配出错");
//					 }
//					 dto.setStatus(OutVisitStatusType.Assigned);
//					 dto.setCaseType(OutVisitCaseType.CASE_ADD);
//					 dto.setUpdatedBy(loginUser.getName());
//					 dto.setUpdateTime(new Date());
//					 updateInfoList.add(dto);
//					 PlmsOvmOutVisitLog outLog = insertOutLogModel(dto,loginUser,null);
//					 insertLogList.add(outLog);
//					 index++;
//					 if(index>=userSize){
//						index=0; 
//					 }
//					 
//				 }
//				 	//修改外访信息表信息
//					this.updateBatch(updateInfoList);
//					//添加外访日志表信息
//					plmsOvmOutVisitLogMapper.insertBatch(insertLogList);
//					//修改外访用户当前户数和当前剩余本金	
//					plmsOvmOutVisitUserMapper.updateBatch(ourUserList);
//			 }
//		  
//		} 
//		
//		
//	}

	/**
	 * 
	* @Description:外访手工分配
	* @param checkedUserId
	* @param checkedIds
	* @param assignBy
	* @return
	 */
	@Override
	public void outVisitMaruAssign(String checkedUserId, String checkedIds,
			SessionMsg loginUser) {
		
		String[] outIds = checkedIds.split(",");
		String[] outUserIds = checkedUserId.split(",");
		//字符串数组转Long型
		Long[] lo = (Long[])ConvertUtils.convert(outIds, Long.class);
		List<Long> outInfoIds = Arrays.asList(lo);
		List<String> outUserListIds = Arrays.asList(outUserIds);
		
		for(Long id:outInfoIds){
			PlmsOvmOutVisitInfo info  = plmsOvmOutVisitInfoMapper.selectByPrimaryKey(id);
			if(info!=null&&(info.getStatus().equals(OutVisitStatusType.Audited)||info.getStatus().equals(OutVisitStatusType.Assigned))){
				//已经分配过的案件，要先将之前的外访用户信息进行调整，再重新分配
				if(info!=null&&info.getStatus().equals(OutVisitStatusType.Assigned)){
					String userId  = info.getVisitBy();
					PlmsOvmOutVisitUserExample example = new PlmsOvmOutVisitUserExample();
					example.setUserId(userId);
					PlmsOvmOutVisitUser user = plmsOvmOutVisitUserMapper.selectByExample(example).get(0);
					user.setCaseCount(user.getCaseCount()-1);
					user.setRemainderAmount(user.getRemainderAmount().subtract(info.getRemainderPrincipal()));
					plmsOvmOutVisitUserMapper.updateByPrimaryKeySelective(user);
				}
			}
		}
		int userSize = outUserListIds.size();
		//修改外访信息列表
		List<PlmsOvmOutVisitInfo> updateInfoList = new ArrayList<PlmsOvmOutVisitInfo>();
		 //插入外访日志表
		List<PlmsOvmOutVisitLog>  insertLogList = new ArrayList<PlmsOvmOutVisitLog>();		
		 //此区域外访员按总库存升序排序
		Map<String,Object> mapTempUser = new HashMap<String,Object>();
		mapTempUser.put("userIds", outUserListIds);
		List<PlmsOvmOutVisitUser> ourUserList = plmsOvmOutVisitUserMapper.searchInfoByMap(mapTempUser);
		int index = 0;	
		for(Long id:outInfoIds){
			PlmsOvmOutVisitInfo info  = plmsOvmOutVisitInfoMapper.selectByPrimaryKey(id);
			if(info!=null&&(info.getStatus().equals(OutVisitStatusType.Audited)||info.getStatus().equals(OutVisitStatusType.Assigned))){
				info.setAssignBy(loginUser.getName());
				info.setAssignDate(new Date());
				Calendar startDT = Calendar.getInstance();
                startDT.setTime(info.getAssignDate());
                startDT.add(Calendar.DATE, 7);
                 //预计结案时间
                info.setExpectCloseTime(startDT.getTime());
				info.setVisitBy(ourUserList.get(index).getUserId());
				ourUserList.get(index).setCaseCount(ourUserList.get(index).getCaseCount()==null?1:ourUserList.get(index).getCaseCount()+1);
				 //此案件的被分配时的逾期天数和剩余本金
				 Map<String,Object> mapApplId = new HashMap<String,Object>();
				 mapApplId.put("applId", info.getApplId());
				 List<PlmsWorkOrderPoolDto>  caseTempList = plmsWorkOrderPoolMapper.searchReceiveOverdueByApplIds(mapApplId);
				 if(caseTempList.size()>0){
					 PlmsWorkOrderPoolDto pool =  caseTempList.get(0);
					 info.setRemainderPrincipal(pool.getRemainingPrincipal());
					 info.setOverdueDay(pool.getOverDays());
					 ourUserList.get(index).setRemainderAmount( ourUserList.get(index).getRemainderAmount()==null?pool.getRemainingPrincipal():ourUserList.get(index).getRemainderAmount().add(pool.getRemainingPrincipal()));
					 ourUserList.get(index).setUpdateTime(new Date());
				 }else{
					 throw new RuntimeException("自动分配出错");
				 }
				 info.setStatus(OutVisitStatusType.Assigned);
				 info.setCaseType(OutVisitCaseType.CASE_ADD);
				 info.setUpdatedBy(loginUser.getName());
				 info.setUpdateTime(new Date());
				 updateInfoList.add(info);
				 PlmsOvmOutVisitLog outLog = insertOutLogModel(info,loginUser,null);
				 insertLogList.add(outLog);
				 index++;
				 if(index>=userSize){
					index=0; 
				 }	
			}
		}
		
		//修改外访信息表信息
		this.updateBatch(updateInfoList);
		//添加外访日志表信息
		plmsOvmOutVisitLogService.insertBatch(insertLogList);
		//修改外访用户当前户数和当前剩余本金	
		plmsOvmOutVisitUserMapper.updateBatch(ourUserList);
	}

	/**
	 * 
	* @Description: 结案操作
	* @param example
	* @param userId
	* @return
	 */
	@Override
	public void OutVisitClosed(PlmsOvmOutVisitInfoExample example, SessionMsg loginUser) {
		Long[] ids = example.getIds();
		Date closedDate = example.getClosedDate();
		String closedType = example.getClosedType();
		String closedReason  = example.getClosedReason();
		//修改外访信息列表
		List<PlmsOvmOutVisitInfo> updateInfoList = new ArrayList<PlmsOvmOutVisitInfo>();
		//插入外访日志表
		List<PlmsOvmOutVisitLog>  insertLogList = new ArrayList<PlmsOvmOutVisitLog>();		
		List<PlmsOvmOutVisitPlan> planListAll = new ArrayList<PlmsOvmOutVisitPlan>();
		for(int i=0;i<ids.length;i++){
			PlmsOvmOutVisitInfo info  = plmsOvmOutVisitInfoMapper.selectByPrimaryKey(ids[i]);
			//已经分配的，更新 指定结案的外访管理用户信息表库存信息（减掉用户的当前库存数）
			String visiter  = info.getVisitBy();
			if((visiter !=null)&&(!visiter.equals(""))){
				PlmsOvmOutVisitUserExample examp = new PlmsOvmOutVisitUserExample();
				examp.setUserId(visiter);
				PlmsOvmOutVisitUser user = plmsOvmOutVisitUserMapper.selectByExample(examp).get(0);
				user.setCaseCount(user.getCaseCount()-1);
				user.setRemainderAmount(user.getRemainderAmount().subtract(info.getRemainderPrincipal()));
				plmsOvmOutVisitUserMapper.updateByPrimaryKeySelective(user);
			}
			info.setStatus(OutVisitStatusType.Closed);
			info.setClosedDate(closedDate);
			info.setClosedType(closedType);
			info.setClosedReason(closedReason);
			info.setEndBy(loginUser.getName());
			info.setEndDate(new Date());
			info.setUpdatedBy(loginUser.getName());
			info.setUpdateTime(new Date());
			//延期案件的状态要变更
			if(info.getCaseType()!=null&&info.getCaseType().equals("CASE_DELAYING")){	
				PlmsOvmOutDelayExample examp = new PlmsOvmOutDelayExample();
				examp.setInfoId(info.getId());
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
							dtl.setDelayAuditRefuse("已手工结案");
							dtl.setDelayAuditBy(loginUser.getName());
							dtl.setUpdatedBy(loginUser.getName());
							dtl.setDelayAuditTime(new Date());
							dtl.setUpdateTime(new Date());
							plmsOvmOutDelayDtlMapper.updateByPrimaryKeySelective(dtl);
						}
					}
				}
				
				
				if(delayList!=null&&delayList.size()>0){
					Long delayTimes = delayList.get(0).getDelayTimes();
					if(delayTimes!=null&&delayTimes.longValue()>0L){
						info.setCaseType("CASE_DELAY");
					}else{
						info.setCaseType("CASE_ADD");
					}
				}
			}
			updateInfoList.add(info);
			PlmsOvmOutVisitLog outLog = insertOutLogModel(info,loginUser,null);
			insertLogList.add(outLog);
				
			//有外访计划的要将外访计划取消
			Map<String,Object> planMap = new HashMap<String,Object>();
			planMap.put("infoId", info.getId());
			planMap.put("planStatus", "Start");
			List<PlmsOvmOutVisitPlan> planList = plmsOvmOutVisitPlanService.searchByMap(planMap);
			if(planList!=null&&planList.size()>0){
				for(PlmsOvmOutVisitPlan plan:planList){
					plan.setPlanStatus(OutVisitPlanStatusType.Cancel);
					plan.setVisitCancelResion("手工结案");
					plan.setUpdatedBy("system");
					plan.setUpdateTime(new Date());
					planListAll.add(plan);
				}
			}
		}
		//修改外访信息表信息
		this.updateBatch(updateInfoList);
		//添加外访日志表信息
		if(insertLogList.size()>0){
			plmsOvmOutVisitLogService.insertBatch(insertLogList);
		}
		//将要结案的外访计划设置为取消
		plmsOvmOutVisitPlanService.updateBatch(planListAll);
	}

	/**
     * 
    * @Description: 根据查询条件查询外访列表
    * @param map
    * @return
    * @return List<PlmsOvmOutVisitInfo>
     */
	@Override
	public List<PlmsOvmOutVisitInfo> searchInfoByMap(Map<String, Object> map) {
		return plmsOvmOutVisitInfoMapper.searchInfoByMap(map);
	}

	@Override
    public void updateBatch(List<PlmsOvmOutVisitInfo> list) {
		if(list == null ||list.size()==0){
			return ;
		}
		int comm = 2000;
		int size = list.size()-1;
		if(size>=comm){
			List<PlmsOvmOutVisitInfo> newList = new ArrayList<PlmsOvmOutVisitInfo>();
			for(int i=0;i<=size;i++){
				if(i!=0&&i%comm==0||i==size){
					newList.add(list.get(i));
					plmsOvmOutVisitInfoMapper.updateBatch(newList);
					newList.clear();
				}else{
					newList.add(list.get(i));
				}
			}	
		}else{
			plmsOvmOutVisitInfoMapper.updateBatch(list);
		}

    }

	/**
	 * 
	* @Description: 我的外访分页
	* @param pageData
	* @param example
	* @return
	* @return
	 */
	@Override
	public Page<MyOutVisitResult> selectMyOutVisitByExampleAndPage(
			Page<MyOutVisitResult> pageData, OutVisitAssignParamDto example) {
		 List<MyOutVisitResult> resultList = plmsOvmOutVisitInfoMapper.selectMyOutVisitByExampleAndPage(pageData, example);
		 if(resultList!=null&&resultList.size()>0){
			 for(MyOutVisitResult result:resultList){
				 Long appl_id = result.getApplId();
				 Map<String, Object> map = new HashMap<String, Object>();
				 map.put("applId",appl_id);
				 List<PlmsClAddressInfo> addrList = plmsClAddressInfoMapper.selectMyOutVisitAddr(map);
				 if(addrList!=null&&addrList.size()>0){
					 for(PlmsClAddressInfo addr:addrList){
						 if(addr.getAddrType()!=null){
							 if(addr.getAddrType().equals("COMPANY")){
								 result.setCompanyAddr(addr.getAddr()); 
							 }else if(addr.getAddrType().equals("REGISTER")){
								 result.setRegisterAddr(addr.getAddr());
							 }else if(addr.getAddrType().equals("HOUSE")){
								 result.setHouseAddr(addr.getAddr());
							 } 
						 }
					 }
				 }
			 }
		 }
		 
		 return pageData;
	}

	/**
	 * 
	* @Description: 外访详情--客户信息 
	* @param map
	* @return
	* @return
	 */
	@Override
	public OutVisitPlanDetailResult selectOutVisitDetail(Map<String, Object> map) {
		OutVisitPlanDetailResult detail = plmsOvmOutVisitInfoMapper.selectOutVisitDetail(map);
		return detail;
	}

	/**
	 * 
	* @Description: 全部外访分页 
	* @param pageData
	* @param example
	* @return
	* @return
	 */
	@Override
	public Page<AllOutVisitResult> selectAllOutVisitByExampleAndPage(
			Page<AllOutVisitResult> pageData, AllOutVisitParamDto example) {
		plmsOvmOutVisitInfoMapper.selectAllOutVisitByExampleAndPage(pageData, example);
		return pageData;
	}

	/**
	 * 
	* @Description: 全部外访导出数据 
	* @param example
	* @return
	* @return
	 */
	@Override
	public List<AllOutVisitExportResult> selectByExampleForExport(
			AllOutVisitParamDto example) {
		
		return plmsOvmOutVisitInfoMapper.selectByExampleForExport(example);
	}

	/**
	 * 
	* @Description: excel导出 
	* @param imagesPath
	* @param docsPath
	* @param expotList
	* @return
	 */
	@Override
	public void exportToExcel(String imagesPath, String docsPath,
			List<AllOutVisitExportResult> expotList) {

		//系统分隔符
				String FILE_SEPARATOR = System.getProperties()
						.getProperty("file.separator");
				ExportExcel<AllOutVisitExportResult> ex = new ExportExcel<AllOutVisitExportResult>();
				String[] headers = { "序号","外访员", "申请编号", "分配日期", "预计结案时间" ,"外访类型","客户类型","案件状态","合同编号","主贷人","身份证号","贷款金额","剩余本金/保证金",
						"分配时逾期天数","当前逾期天数","计划外访次数","完成外访次数","历史外访次数","户籍地址外访次数","住宅地址外访次数","单位地址外访次数","提交人"
				};
				try {
					OutputStream out = new FileOutputStream(docsPath + FILE_SEPARATOR
							+ "allOutVisit.xls");
					ex.exportExcel(headers, expotList, out);
					out.close();
					//JOptionPane.showMessageDialog(null, "导出成功!");
					System.out.println("excel导出成功！");
				} catch (FileNotFoundException e) {
					e.printStackTrace();
				} catch (IOException e) {
					e.printStackTrace();
				}
	}

	/**
	 * 
	* @Description:  查询某些状态下的外访信息 
	* @param statusList
	* @return
	* @return
	 */
	@Override
	public List<PlmsOvmOutVisitInfo> selectPlmsOutVisitList(
			Map<String,Object> map) {

		return plmsOvmOutVisitInfoMapper.selectPlmsOutVisitList(map);
	}

	
	
	
	
	
	
	
	/**
	 * 
	* @Description: 外访自动分配
	* @param example
	* @param loginUser
	* @return
	 */
	@Override
	public void outVisitAutoAssign(OutVisitAssignParamDto example,
			SessionMsg loginUser) {
			List<Long> araeIdList = plmsOvmOutVisitUserMapper.searchAreaIdForOutVisitUser();
			//默认分配状态为未分配（已审核待分配）
			example.setAssignStatus("Audited");
			//需要自动分配的外访数据
			List<PlmsOvmOutVisitInfo> autoAssignList = this.selectAutoAssignList(example);
			if(autoAssignList!=null&&autoAssignList.size()>0){
				Map<Long,List<PlmsOvmOutVisitInfo>> map = new HashMap<Long,List<PlmsOvmOutVisitInfo>>();
				for(PlmsOvmOutVisitInfo outInfo:autoAssignList){
					Long areaId = outInfo.getAreaId();
					for(Long aId:araeIdList){
						if(areaId.longValue()==aId.longValue()){
							if(map.containsKey(aId)){
								List<PlmsOvmOutVisitInfo> autoList = map.get(aId);
								autoList.add(outInfo);
								map.put(aId,autoList);
							}else{
								List<PlmsOvmOutVisitInfo> autoList = new ArrayList<PlmsOvmOutVisitInfo>();
								autoList.add(outInfo);
								map.put(aId, autoList);
							}
						}
					}
				}
				
				//所属各个区域的案件组合
				for (Long key : map.keySet()) {  
					 List<PlmsOvmOutVisitInfo> autoAssignAreaList = map.get(key);
					 if(autoAssignAreaList==null||autoAssignAreaList.size()==0){
						 
					 }else{
						 //此区域的案件集合
						 Map<String,Object> mapTempUser = new HashMap<String,Object>();
						 mapTempUser.put("areaId", key);
						 //此区域外访员按总库存升序排序
						 List<PlmsOvmOutVisitUser> ourUserList = plmsOvmOutVisitUserMapper.searchInfoByMap(mapTempUser);
						 int userSize = ourUserList.size();
						 //修改外访信息列表
						 List<PlmsOvmOutVisitInfo> updateInfoList = new ArrayList<PlmsOvmOutVisitInfo>();
						 //插入外访日志表
						 List<PlmsOvmOutVisitLog>  insertLogList = new ArrayList<PlmsOvmOutVisitLog>();
						 int index = 0;
						 for(PlmsOvmOutVisitInfo dto:autoAssignAreaList){
							 dto.setAssignBy(loginUser.getName());
							 dto.setAssignDate(new Date());
							 Calendar startDT = Calendar.getInstance();
		                     startDT.setTime(dto.getAssignDate());
		                     startDT.add(Calendar.DATE, 7);
		                     //预计结案时间
		                     dto.setExpectCloseTime(startDT.getTime());
							 dto.setVisitBy(ourUserList.get(index).getUserId());
							 ourUserList.get(index).setCaseCount(ourUserList.get(index).getCaseCount()==null?1:ourUserList.get(index).getCaseCount()+1);
							 //此案件的被分配时的逾期天数和剩余本金
							 Map<String,Object> mapApplId = new HashMap<String,Object>();
							 mapApplId.put("applId", dto.getApplId());
							 List<PlmsWorkOrderPoolDto>  caseTempList = plmsWorkOrderPoolMapper.searchReceiveOverdueByApplIds(mapApplId);
							 if(caseTempList.size()>0){
								 PlmsWorkOrderPoolDto pool =  caseTempList.get(0);
								 dto.setRemainderPrincipal(pool.getRemainingPrincipal());
								 dto.setOverdueDay(pool.getOverDays());
								 ourUserList.get(index).setRemainderAmount( ourUserList.get(index).getRemainderAmount()==null?pool.getRemainingPrincipal():ourUserList.get(index).getRemainderAmount().add(pool.getRemainingPrincipal()));
								 ourUserList.get(index).setUpdateTime(new Date());
							 }else{
								 throw new RuntimeException("自动分配出错");
							 }
							 dto.setStatus(OutVisitStatusType.Assigned);
							 dto.setCaseType(OutVisitCaseType.CASE_ADD);
							 dto.setUpdatedBy(loginUser.getName());
							 dto.setUpdateTime(new Date());
							 updateInfoList.add(dto);
							 PlmsOvmOutVisitLog outLog = insertOutLogModel(dto,loginUser,null);
							 insertLogList.add(outLog);
							 index++;
							 if(index>=userSize){
								index=0; 
							 }
							 
						 }
						 	//修改外访信息表信息
							this.updateBatch(updateInfoList);
							//添加外访日志表信息
							plmsOvmOutVisitLogService.insertBatch(insertLogList);
							//修改外访用户当前户数和当前剩余本金	
							plmsOvmOutVisitUserMapper.updateBatch(ourUserList);
					 }
				  
				} 
	
			}
			
		
			
				
	}

	/**
	 * 
	* @Description: 根据查询条件查找需要自动分配的外访案件 
	* @param example
	* @return
	* @return
	 */
	@Override
	public List<PlmsOvmOutVisitInfo> selectAutoAssignList(
			OutVisitAssignParamDto example) {

		return plmsOvmOutVisitInfoMapper.selectAutoAssignList(example);
	}

	/**
	 * 
	* @Description: 根据applId查询最新的外访信息  
	* @param applId
	* @return
	* @return
	 */
	@Override
	public PlmsOvmOutVisitInfo getTheNewestOutVisitByApplId(Long applId) {

		return plmsOvmOutVisitInfoMapper.getTheNewestOutVisitByApplId(applId);
	}

	
	private Comparator<OutVisitAuditResult> getComparaOfCase(String order){
        Comparator<OutVisitAuditResult> comparato = null;
        //按剩余本金升序排序
        if(order.equals("asc")){
        	comparato = new Comparator<OutVisitAuditResult>() {
	            public int compare(OutVisitAuditResult s1, OutVisitAuditResult s2) {
	                if (s1.getAuditedNum()-(s2.getAuditedNum()) == 0) {
	                    return 0;
	                } else if (s1.getAuditedNum()-(s2.getAuditedNum()) > 0) {
	                    return 1;
	                } else {
	                    return -1;
	                }
	            }
	        }; 
        }else if(order.equals("desc")){
        	comparato = new Comparator<OutVisitAuditResult>() {
	            public int compare(OutVisitAuditResult s1, OutVisitAuditResult s2) {
	                if (s1.getAuditedNum()-(s2.getAuditedNum()) == 0) {
	                    return 0;
	                } else if (s1.getAuditedNum()-(s2.getAuditedNum()) < 0) {
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
	 * 
	* @Description: 查询特定日期结案的外访案件  
	* @param map
	* @return
	* @return
	 */
	@Override
	public List<PlmsOvmOutVisitInfo> selectOverOutVisitInfo(
			Map<String, Object> map) {
		
		return plmsOvmOutVisitInfoMapper.selectOverOutVisitInfo(map);
	}
 

}
