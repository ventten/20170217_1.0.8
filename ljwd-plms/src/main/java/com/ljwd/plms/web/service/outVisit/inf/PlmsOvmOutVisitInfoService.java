package com.ljwd.plms.web.service.outVisit.inf;

import java.util.List;
import java.util.Map;

import com.ljwd.plms.core.feature.orm.mybatis.Page;
import com.ljwd.plms.core.generic.GenericService;
import com.ljwd.plms.web.model.outVisit.PlmsOvmOutVisitInfo;
import com.ljwd.plms.web.model.outVisit.PlmsOvmOutVisitInfoExample;
import com.ljwd.plms.web.vo.DataTableParam;
import com.ljwd.plms.web.vo.SessionMsg;
import com.ljwd.plms.web.vo.case_management.PlmsWorkOrderPoolExportDto;
import com.ljwd.plms.web.vo.outVisit.AllOutVisitExportResult;
import com.ljwd.plms.web.vo.outVisit.AllOutVisitParamDto;
import com.ljwd.plms.web.vo.outVisit.AllOutVisitPlanParamDto;
import com.ljwd.plms.web.vo.outVisit.AllOutVisitPlanResult;
import com.ljwd.plms.web.vo.outVisit.AllOutVisitResult;
import com.ljwd.plms.web.vo.outVisit.MyOutVisitResult;
import com.ljwd.plms.web.vo.outVisit.OutVisitAssignParamDto;
import com.ljwd.plms.web.vo.outVisit.OutVisitAssignResult;
import com.ljwd.plms.web.vo.outVisit.OutVisitAuditParamDto;
import com.ljwd.plms.web.vo.outVisit.OutVisitAuditResult;
import com.ljwd.plms.web.vo.outVisit.OutVisitPlanDetailResult;

public interface PlmsOvmOutVisitInfoService extends GenericService<PlmsOvmOutVisitInfo, Long> {

	/**
	 * 
	* @Description: 提交外访申请
	* @param outVisitInfo
	* @return void
	 */
	void addOutVisitInfo (PlmsOvmOutVisitInfoExample outVisitInfo,SessionMsg loginUser);
	
	/**
	 * 
	* @Description: 此案件已经存在已提交/已审核/已分配的外访记录，不能再提交
	* @param applId
	* @return
	* @return int
	 */
	List<PlmsOvmOutVisitInfo> checkIfExistOutVisitInfo(Map<String,Object> map);
	

	/**
	 * 
	* @Description: 外访审核分页
	* @param pagedata
	* @param example
	* @return
	* @return Page<PlmsWorkOrderPoolDto>
	 */
    Page<OutVisitAuditResult> selectAuditByExampleAndPage(Page<OutVisitAuditResult> pagedata, OutVisitAuditParamDto example,DataTableParam dataTableParam);
    /**
     * 
    * @Description: 审核操作 
    * @param applIds
    * @param handelResult
    * @param auditRefusedReason
    * @param auditedBy
    * @return void
     */
    void updateOutVisitAuditedStatus(PlmsOvmOutVisitInfoExample example,SessionMsg loginUser);

    /**
	 * 
	* @Description: 外访分配分页
	* @param pagedata
	* @param example
	* @return
	* @return Page<PlmsWorkOrderPoolDto>
	 */
    Page<OutVisitAssignResult> selectAssignByExampleAndPage(Page<OutVisitAssignResult> pagedata, OutVisitAssignParamDto example);

    /**
     * 
    * @Description: 外访自动分配 
    * @param info
    * @return void
     */
	void outVisitAutoAssign(OutVisitAssignParamDto example,SessionMsg loginUser);

	/**
	 * 
	* @Description:外访手工分配 
	* @param checkedUserId
	* @param checkedIds
	* @param assignBy
	* @return void
	 */
	void outVisitMaruAssign(String checkedUserId, String checkedIds,
			SessionMsg loginUser);

	/**
	 * 
	* @Description: 结案操作 
	* @param example
	* @param userId
	* @return void
	 */
	void OutVisitClosed(PlmsOvmOutVisitInfoExample example, SessionMsg loginUser);
	
	 /**
     * 
    * @Description: 根据查询条件查询外访列表
    * @param map
    * @return
    * @return List<PlmsOvmOutVisitInfo>
     */
    List<PlmsOvmOutVisitInfo> searchInfoByMap(Map<String,Object> map);

    /**
     * 
    * @Description: 我的外访分页
    * @param pageData
    * @param example
    * @return
    * @return Page<MyOutVisitResult>
     */
	Page<MyOutVisitResult> selectMyOutVisitByExampleAndPage(
			Page<MyOutVisitResult> pageData, OutVisitAssignParamDto example);
	
	/**
	 * 
	* @Description: 外访详情--客户信息 
	* @param map
	* @return
	* @return List<OutVisitPlanDetailResult>
	 */
	OutVisitPlanDetailResult selectOutVisitDetail(Map<String,Object> map);

	/**
	 * 
	* @Description: 全部外访分页 
	* @param pageData
	* @param example
	* @return
	* @return Page<AllOutVisitResult>
	 */
	Page<AllOutVisitResult> selectAllOutVisitByExampleAndPage(
			Page<AllOutVisitResult> pageData, AllOutVisitParamDto example);
	
	/**
	 * 
	* @Description: 全部外访导出数据
	* @param example
	* @return
	* @return List<AllOutVisitResult>
	 */
	List<AllOutVisitExportResult> selectByExampleForExport(AllOutVisitParamDto example);

	 /**
     * 
    * @Description: excel操作 
    * @param imagesPath
    * @param docsPath
    * @param expotList
    * @return void
     */
    public void exportToExcel(String imagesPath, String docsPath,List<AllOutVisitExportResult> expotList);


    /**
     * 
    * @Description: 查询某些状态下的外访信息
    * @return
    * @return List<PlmsOvmOutVisitInfo>
     */
    public List<PlmsOvmOutVisitInfo> selectPlmsOutVisitList(Map<String,Object> map);
    
    /**
     * 
    * @Description: 根据查询条件查找需要自动分配的数据
    * @param example
    * @return
    * @return List<PlmsOvmOutVisitInfo>
     */
    public List<PlmsOvmOutVisitInfo> selectAutoAssignList(OutVisitAssignParamDto example);

    /**
     * 
    * @Description: 根据applId查询最新的外访信息 
    * @param applId
    * @return
    * @return PlmsOvmOutVisitInfo
     */
	PlmsOvmOutVisitInfo getTheNewestOutVisitByApplId(Long applId);
	
	/**
     * 
    * @Description: 查询特定日期结案的外访案件 
    * @param map
    * @return
    * @return List<PlmsOvmOutVisitInfo>
     */
    public List<PlmsOvmOutVisitInfo> selectOverOutVisitInfo(Map<String,Object> map);
}

