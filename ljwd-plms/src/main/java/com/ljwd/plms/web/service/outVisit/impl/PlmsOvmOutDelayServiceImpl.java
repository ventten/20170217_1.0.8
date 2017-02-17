package com.ljwd.plms.web.service.outVisit.impl;

import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.joda.time.DateTime;
import org.springframework.stereotype.Service;

import com.ljwd.plms.core.feature.orm.mybatis.Page;
import com.ljwd.plms.core.generic.GenericDao;
import com.ljwd.plms.core.generic.GenericServiceImpl;
import com.ljwd.plms.web.dao.case_collection.PlmsLaCollectionRecordMapper;
import com.ljwd.plms.web.dao.outVisit.PlmsOvmOutDelayDtlMapper;
import com.ljwd.plms.web.dao.outVisit.PlmsOvmOutDelayMapper;
import com.ljwd.plms.web.dao.outVisit.PlmsOvmOutVisitInfoMapper;
import com.ljwd.plms.web.model.case_collection.PlmsLaCollectionRecord;
import com.ljwd.plms.web.model.case_collection.PlmsLaCollectionRecordExample;
import com.ljwd.plms.web.model.outVisit.PlmsOvmOutDelay;
import com.ljwd.plms.web.model.outVisit.PlmsOvmOutDelayDtl;
import com.ljwd.plms.web.model.outVisit.PlmsOvmOutDelayDtlExample;
import com.ljwd.plms.web.model.outVisit.PlmsOvmOutDelayExample;
import com.ljwd.plms.web.model.outVisit.PlmsOvmOutVisitInfo;
import com.ljwd.plms.web.model.outVisit.PlmsOvmOutVisitInfoExample;
import com.ljwd.plms.web.model.outVisit.PlmsOvmOutVisitLog;
import com.ljwd.plms.web.service.outVisit.inf.PlmsOvmOutDelayService;
import com.ljwd.plms.web.service.outVisit.inf.PlmsOvmOutVisitLogService;
import com.ljwd.plms.web.vo.DataTableParam;
import com.ljwd.plms.web.vo.SessionMsg;
import com.ljwd.plms.web.vo.outVisit.OutVisitAuditResult;
import com.ljwd.plms.web.vo.outVisit.OutVisitDelayDto;
import com.ljwd.plms.web.vo.outVisit.OutVisitDelayParamDto;
import com.ljwd.plms.web.vo.outVisit.OutVisitDelayResult;
import com.ljwd.plms.web.vo.outVisit.OutVisitStatusType;

@Service
public class PlmsOvmOutDelayServiceImpl extends GenericServiceImpl<PlmsOvmOutDelay, Long>
		implements PlmsOvmOutDelayService {
	@Resource
	private PlmsOvmOutDelayMapper plmsOvmOutDelayMapper;
	@Resource
	private PlmsOvmOutVisitInfoMapper plmsOvmOutVisitInfoMapper;
	@Resource
	private PlmsLaCollectionRecordMapper plmsLaCollectionRecordMapper;
	@Resource
	private PlmsOvmOutDelayDtlMapper plmsOvmOutDelayDtlMapper;
	@Resource
	private PlmsOvmOutVisitLogService plmsOvmOutVisitLogService;

	@Override
	public GenericDao<PlmsOvmOutDelay, Long> getDao() {
		return plmsOvmOutDelayMapper;
	}

	/**
	 * 
	* @Description: 提交延期申请 
	* @param example
	* @param loginUser
	* @return
	 */
	@Override
	public void submitDelay(OutVisitDelayDto example, SessionMsg loginUser) {
		Long[] infoIds = example.getInfoIds();
		String delayDuration = example.getDelayDuration();
		String delayReason = example.getDelayReason();
		for(int i=0;i<infoIds.length;i++){
			Long infoId = infoIds[i];
			//1，判断PLMS_OVM_OUT_DELAY中是否有此infoId的记录，有则修改，无则添加
			PlmsOvmOutDelayExample  exam = new PlmsOvmOutDelayExample();
			exam.setInfoId(infoId);
			List<PlmsOvmOutDelay> delayList = plmsOvmOutDelayMapper.selectByExample(exam);
			PlmsOvmOutVisitInfo info = plmsOvmOutVisitInfoMapper.selectByPrimaryKey(infoId);
			if(info==null){
	            throw new RuntimeException("延期申请失败,此案件不在外访列表中");
			}
		//	List<PlmsLaCollectionRecord> recordList = plmsLaCollectionRecordMapper.selectByExample(ex);
			if(delayList==null||delayList.size()==0){
				PlmsOvmOutDelay delay = new PlmsOvmOutDelay();
				delay.setInfoId(infoId);
				delay.setOvFinishTimes(info.getVisitOverNum());
				delay.setDelayTimes(0L);
				/*if(recordList!=null&&recordList.size()>0){
					delay.setLastFollowTime(recordList.get(0).getCollectTime());
				}*/
				delay.setCreatedBy(loginUser.getName());
				delay.setCreateTime(new Date());
				delay.setUpdatedBy(loginUser.getName());
				delay.setUpdateTime(new Date());
				plmsOvmOutDelayMapper.insertSelective(delay);
			}else{
				PlmsOvmOutDelay delay = delayList.get(0);
				/*if(recordList!=null&&recordList.size()>0){
					delay.setLastFollowTime(recordList.get(0).getCollectTime());
				}*/
				delay.setOvFinishTimes(info.getVisitOverNum());
				plmsOvmOutDelayMapper.updateByPrimaryKeySelective(delay);
			}
			//2,在PLMS_OVM_OUT_DELAY_dtl中添加记录
			Map<String,Object> mapA = new HashMap<String,Object>();
			mapA.put("infoId", infoId);
			List<PlmsOvmOutDelay> delayList_ = plmsOvmOutDelayMapper.searchDelayByInfoId(mapA);
			if(delayList_!=null&&delayList_.size()>0){
				PlmsOvmOutDelay delay = delayList_.get(0);
				PlmsOvmOutDelayDtl dtl = new PlmsOvmOutDelayDtl();
				dtl.setDelayDuration(delayDuration);
				dtl.setDelayReason(delayReason);
				setModelDelayDtl(delay,dtl,loginUser.getName());
				plmsOvmOutDelayDtlMapper.insertSelective(dtl);
				
				//3,修改PLMS_OVM_OUT_VISIT_INFO中的案件性质（CASE_TYPE）
				info.setCaseType("CASE_DELAYING");
				info.setUpdatedBy(loginUser.getName());
				info.setUpdateTime(new Date());
				plmsOvmOutVisitInfoMapper.updateByPrimaryKeySelective(info);
				//添加外访日志
				PlmsOvmOutVisitLog outLog = insertOutLogModel(info,dtl,loginUser,"submitDelay");
				plmsOvmOutVisitLogService.insert(outLog); 
				
				
				
			}else{
	            throw new RuntimeException("延期申请失败，延期子表添加失败");
			}
			
		}
		
	}

	

	/**
	 * 
	* @Description: 外访延期分页 
	* @param pageData
	* @param example
	* @return
	* @return
	 */
	@Override
	public Page<OutVisitDelayResult> selectDelayByExampleAndPage(
			Page<OutVisitDelayResult> pageData, OutVisitDelayParamDto example,DataTableParam dataTableParam) {
		List<OutVisitDelayResult> delayList = plmsOvmOutDelayMapper.selectDelayByExampleAndPage(pageData, example);
		if(delayList!=null&&delayList.size()>0){
			for(OutVisitDelayResult delay:delayList){
				PlmsLaCollectionRecordExample examp = new PlmsLaCollectionRecordExample();
				examp.setApplId(delay.getApplId());
				examp.setOrderByClause("T.COLLECT_TIME desc");
				List<PlmsLaCollectionRecord> recordList = plmsLaCollectionRecordMapper.selectByExample(examp);
				if(recordList!=null&&recordList.size()>0){
					delay.setLastFollowTime(recordList.get(0).getCollectTime());
				}
			}
		}
		
		if(delayList!=null&&delayList.size()>0){
			 List<Integer> cols = dataTableParam.getiSortCols();
			 List<String> sorts = dataTableParam.getsSortDirs();
			 
			 if(cols!=null&&cols.size()>0&&sorts!=null&&sorts.size()>0){
				 Integer icoSort = cols.get(0);
				 if(icoSort !=null && icoSort.intValue()==12 ){
					 String  sort = sorts.get(0);
					 Comparator<OutVisitDelayResult> comparatoCollector = getComparaOfCase(sort);
					 Collections.sort(delayList, comparatoCollector);
				 } 
			 }
		}
		return pageData;
	}

	/**
	 * 
	* @Description: 按最后一次跟进时间排序
	* @param sort
	* @return
	* @return Comparator<OutVisitDelayResult>
	 */
	private Comparator<OutVisitDelayResult> getComparaOfCase(String order) {
		  Comparator<OutVisitDelayResult> comparato = null;
	        //按剩余本金升序排序
	        if(order.equals("asc")){
	        	comparato = new Comparator<OutVisitDelayResult>() {
		            public int compare(OutVisitDelayResult s1, OutVisitDelayResult s2) {
		                if ((s1.getLastFollowTime()==null?new Date():s1.getLastFollowTime()).compareTo(s2.getLastFollowTime()==null?new Date():s2.getLastFollowTime()) == 0) {
		                    return 0;
		                } else if ((s1.getLastFollowTime()==null?new Date():s1.getLastFollowTime()).compareTo(s2.getLastFollowTime()==null?new Date():s2.getLastFollowTime())  > 0) {
		                    return 1;
		                } else {
		                    return -1;
		                }
		            }
		        }; 
	        }else if(order.equals("desc")){
	        	comparato = new Comparator<OutVisitDelayResult>() {
		            public int compare(OutVisitDelayResult s1, OutVisitDelayResult s2) {
		                if ((s1.getLastFollowTime()==null?new Date():s1.getLastFollowTime()).compareTo(s2.getLastFollowTime()==null?new Date():s2.getLastFollowTime()) == 0) {
		                    return 0;
		                } else if ((s1.getLastFollowTime()==null?new Date():s1.getLastFollowTime()).compareTo(s2.getLastFollowTime()==null?new Date():s2.getLastFollowTime()) < 0) {
		                    return 1;
		                } else {
		                    return -1;
		                }
		            }
		        }; 
	        }
	        
	        return comparato;
	}

	private void setModelDelayDtl(PlmsOvmOutDelay delay,
			PlmsOvmOutDelayDtl dtl, String loginUser) {
		Date date = new Date();
		dtl.setDelayId(delay.getId());
		dtl.setExpectCloseTime(delay.getExpectCloseTime());
		dtl.setDelayAuditResult("NOT_APPROVED");
		dtl.setDelaySubmitBy(loginUser);
		dtl.setDelaySubmitTime(date);
		dtl.setCreatedBy(loginUser);
		dtl.setCreateTime(date);
		dtl.setUpdatedBy(loginUser);
		dtl.setUpdateTime(date);
		
	}

	/**
	 * 
	* @Description: 外访延期的审批
	* @param example
	* @param loginUser
	* @return
	 */
	@Override
	public void updateOutVisitDelayAuditedStatus(OutVisitDelayDto example,
			SessionMsg loginUser) {
		Long[] ids = example.getDelayIds();
		Long[] dtlIds = example.getDelayDtlIds();
		String auditResult = example.getDelayAuditResult();
		if(auditResult.equals("PASS")){
			Date date = new Date();
			for(int i=0;i<ids.length;i++){
				Long delayId = ids[i];
				//1,修改PLMS_OVM_OUT_DELAY中的值
				PlmsOvmOutDelay delay = plmsOvmOutDelayMapper.selectByPrimaryKey(delayId);
				//外访信息表中的id
				Long infoId = delay.getInfoId();
				delay.setDelayTimes(delay.getDelayTimes()==null?1:delay.getDelayTimes()+1);
				delay.setUpdatedBy(loginUser.getName());
				delay.setUpdateTime(date);
				plmsOvmOutDelayMapper.updateByPrimaryKeySelective(delay);
				//2,修改PLMS_OVM_OUT_DELAY_dtl中的记录
				Long delayDtlId = dtlIds[i];
				PlmsOvmOutDelayDtl delayDtl = plmsOvmOutDelayDtlMapper.selectByPrimaryKey(delayDtlId);
				delayDtl.setDelayAuditResult(auditResult);
				delayDtl.setDelayAuditTime(date);
				delayDtl.setDelayAuditBy(loginUser.getName());
				delayDtl.setUpdatedBy(loginUser.getName());
				delayDtl.setUpdateTime(date);
				plmsOvmOutDelayDtlMapper.updateByPrimaryKeySelective(delayDtl);
				//3,修改PLMS_OVM_OUT_VISIT_INFO中的案件性质（CASE_TYPE）
				PlmsOvmOutVisitInfo info = plmsOvmOutVisitInfoMapper.selectByPrimaryKey(infoId);
				info.setCaseType("CASE_DELAY");
				DateTime dateTime = new DateTime(info.getExpectCloseTime());
				if(delayDtl.getDelayDuration().equals("weekend")){
					DateTime temp = dateTime.plusDays(7);
					Date date2 = temp.toDate();  
					info.setExpectCloseTime(date2);
				}
				info.setUpdatedBy(loginUser.getName());
				info.setUpdateTime(date);
				plmsOvmOutVisitInfoMapper.updateByPrimaryKeySelective(info);
				//4,外访日志
				PlmsOvmOutVisitLog outLog = insertOutLogModel(info,delayDtl,loginUser,"delayPass");
				plmsOvmOutVisitLogService.insert(outLog);
			}
			
		}else if(auditResult.equals("REJECT")){
			String reason = example.getDelayAuditRefuse();
			Date date = new Date();
			for(int i=0;i<ids.length;i++){
				//1,修改PLMS_OVM_OUT_DELAY_dtl中的记录
				Long delayDtlId = dtlIds[i];
				PlmsOvmOutDelayDtl delayDtl = plmsOvmOutDelayDtlMapper.selectByPrimaryKey(delayDtlId);
				delayDtl.setDelayAuditResult(auditResult);
				delayDtl.setDelayAuditTime(date);
				delayDtl.setDelayAuditBy(loginUser.getName());
				delayDtl.setDelayAuditRefuse(reason);
				delayDtl.setUpdatedBy(loginUser.getName());
				delayDtl.setUpdateTime(date);
				plmsOvmOutDelayDtlMapper.updateByPrimaryKeySelective(delayDtl);
				//2,修改PLMS_OVM_OUT_VISIT_INFO中的案件性质（CASE_TYPE）
				Long delayId = ids[i];
				PlmsOvmOutDelay delay = plmsOvmOutDelayMapper.selectByPrimaryKey(delayId);
				//外访信息表中的id
				Long infoId = delay.getInfoId();
				PlmsOvmOutVisitInfo info = plmsOvmOutVisitInfoMapper.selectByPrimaryKey(infoId);
				if(delay.getDelayTimes()>0){
					info.setCaseType("CASE_DELAY");	
				}else{
					info.setCaseType("CASE_ADD");	
				}
				info.setUpdatedBy(loginUser.getName());
				info.setUpdateTime(date);
				plmsOvmOutVisitInfoMapper.updateByPrimaryKeySelective(info);
				//4,外访日志
				PlmsOvmOutVisitLog outLog = insertOutLogModel(info,delayDtl,loginUser,"delayReject");
				plmsOvmOutVisitLogService.insert(outLog);
			}
			
		}
		
 	}
	
	
	/**
	 * 
	* @Description: 插入外访记录日志 
	* @param outVisit
	* @return void
	 */
	private PlmsOvmOutVisitLog insertOutLogModel(
			PlmsOvmOutVisitInfo outVisit,PlmsOvmOutDelayDtl dtl,SessionMsg loginUser,String auto) {
		PlmsOvmOutVisitLog outLog = new PlmsOvmOutVisitLog();
		//根据applId查询合同编号
		String cntrctNo = plmsOvmOutVisitInfoMapper.getCntrctNoByApplId(outVisit.getApplId());
		outLog.setApplId(outVisit.getApplId());
		outLog.setCreateTime(new Date());
		outLog.setUpdateTime(new Date());
		//申请延期
		if(auto.equals("submitDelay")){
			outLog.setHandleBy(loginUser.getUserName());
			outLog.setContent("提交合同编号为"+cntrctNo+"的外访延期申请");
			outLog.setCreatedBy(dtl.getDelaySubmitBy());
			outLog.setUpdatedBy(dtl.getDelaySubmitBy());
			outLog.setStatus(outVisit.getStatus());
		}//审核通过
		else if(auto.equals("delayPass")){
			outLog.setHandleBy(loginUser.getUserName());
			outLog.setCreatedBy(dtl.getDelayAuditBy());
			outLog.setUpdatedBy(dtl.getDelayAuditBy());
			outLog.setStatus(outVisit.getStatus());
			outLog.setContent("合同编号为"+cntrctNo+"的外访延期审批通过");
			
		}//审核拒绝
		else if(auto.equals("delayReject")){
			outLog.setHandleBy(loginUser.getUserName());
			outLog.setContent("合同编号为"+cntrctNo+"的外访延期审核拒绝,拒绝原因："+dtl.getDelayAuditRefuse());
			outLog.setCreatedBy(dtl.getDelayAuditBy());
			outLog.setUpdatedBy(dtl.getDelayAuditBy());
			outLog.setStatus(outVisit.getStatus());
		}
		
		return outLog;
	}
	/**
	 * 
	* @Description: 查找延期案件
	* @param example
	* @return
	* @return
	 */
	@Override
	public List<PlmsOvmOutDelay> selectByExample(PlmsOvmOutDelayExample example) {
		
		return plmsOvmOutDelayMapper.selectByExample(example);
	}

	/**
	 * 
	* @Description: 查找正在审批中的延期案件明细
	* @param example
	* @return
	* @return
	 */
	@Override
	public List<PlmsOvmOutDelayDtl> selectDtlByExample(
			PlmsOvmOutDelayDtlExample example) {
		
		return plmsOvmOutDelayDtlMapper.selectByExample(example);
	}


	

}
