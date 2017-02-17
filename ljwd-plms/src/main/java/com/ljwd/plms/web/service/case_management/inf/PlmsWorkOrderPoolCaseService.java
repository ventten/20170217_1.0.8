package com.ljwd.plms.web.service.case_management.inf;

import java.util.Date;
import java.util.List;

import com.ljwd.plms.web.model.case_management.PlmsLaCollectAlloc;
import com.ljwd.plms.web.vo.case_management.PlmsEmpCollectDetailDto;
import com.ljwd.plms.web.vo.case_management.PlmsWorkOrderAssignDto;
import com.ljwd.plms.web.vo.case_management.PlmsWorkOrderPoolParam;

public interface PlmsWorkOrderPoolCaseService {

	/**
	* @Description: 获取指定区间的催收员信息 
	* @param status
	* @return List<PlmsEmpCollectDetailDto>
	*/
	List<PlmsEmpCollectDetailDto> getAllCollector(String status,Long orgId,List<Long> orgIds);

	/**
	* @Description: 手动调整
	* @param paymentIds
	* @param collectors
	*/
	void updatemaruAlloc(List<Long> paymentIds,List<String> collectors,String userName,String assignRule,String status);
	
	/**
	* @Description: 代理分配
	* @param paymentIds
	* @param collectors
	*/
	void updateagentAlloc(List<Long> paymentIds,List<String> collectors,Date agentStart,Date agentEnd,String userName);

	/**
    * @Description: 手动批量分配
    * @param param
     */
    void updateMaruBatchAlloc(PlmsWorkOrderPoolParam param,String collectors,String userName);
    
	/**
	 * 先流转,再自动分配被保护案件
	 * @param applIds 借款IDS
	 * @param userId 操作人ID
	 * @param userName 操作人姓名
	 */
    void updateAutoAllocProtectCase(List<Long> applIds,String userId,String userName);
    
    /**
    * 平均分配组长无上限
    * @Description: TODO 
    * @param dList
    * @param empCollectList
    * @param userName
    * @return List<PlmsLaCollectAlloc>
    */
    List<PlmsLaCollectAlloc> addAllocNoUpper(List<PlmsWorkOrderAssignDto> dList,List<String> empCollectList,String userName);
    
    /**
    * @Description: 多劳多得分配
    * @param selectedCaseList
    * @param collectors
    * @param userName
    * @param status
    */
    void workMore(List<PlmsWorkOrderAssignDto> selectedCaseList,List<String> collectors,String userName,String status);

	/**
	* @Description: 撤回保留操作
	* @param logId
	* @return void
	*/
    void recallRetains(Long logId,String userId);

}
