package com.ljwd.plms.web.service.outVisit.inf;

import java.util.List;

import com.ljwd.plms.core.feature.orm.mybatis.Page;
import com.ljwd.plms.core.generic.GenericService;
import com.ljwd.plms.web.model.outVisit.PlmsOvmOutDelay;
import com.ljwd.plms.web.model.outVisit.PlmsOvmOutDelayDtl;
import com.ljwd.plms.web.model.outVisit.PlmsOvmOutDelayDtlExample;
import com.ljwd.plms.web.model.outVisit.PlmsOvmOutDelayExample;
import com.ljwd.plms.web.vo.DataTableParam;
import com.ljwd.plms.web.vo.SessionMsg;
import com.ljwd.plms.web.vo.outVisit.OutVisitDelayDto;
import com.ljwd.plms.web.vo.outVisit.OutVisitDelayParamDto;
import com.ljwd.plms.web.vo.outVisit.OutVisitDelayResult;

public interface PlmsOvmOutDelayService extends GenericService<PlmsOvmOutDelay, Long> {
	/**
	 * 
	* @Description: 提交延期申请 
	* @param example
	* @param loginUser
	* @return void
	 */
	void submitDelay(OutVisitDelayDto example,SessionMsg loginUser);

	/**
	 * 
	* @Description: 外访延期分页 
	* @param pageData
	* @param example
	* @return
	* @return Page<OutVisitDelayResult>
	 */
	Page<OutVisitDelayResult> selectDelayByExampleAndPage(
			Page<OutVisitDelayResult> pageData, OutVisitDelayParamDto example,DataTableParam dataTableParam);

	/**
	 * 
	* @Description: 审批外访延期 
	* @param example
	* @param loginUser
	* @return void
	 */
	void updateOutVisitDelayAuditedStatus(OutVisitDelayDto example,
			SessionMsg loginUser);
	
	/**
	 * 
	* @Description: 查找延期案件 
	* @param example
	* @return
	* @return List<PlmsOvmOutDelay>
	 */
	List<PlmsOvmOutDelay> selectByExample(PlmsOvmOutDelayExample example);
	/**
	 * 
	* @Description: 查找正在审批中的延期案件明细
	* @param example
	* @return
	* @return
	 */
	public List<PlmsOvmOutDelayDtl> selectDtlByExample(PlmsOvmOutDelayDtlExample example);

}
