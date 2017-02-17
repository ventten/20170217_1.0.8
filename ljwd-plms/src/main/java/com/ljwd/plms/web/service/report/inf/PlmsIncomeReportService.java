package com.ljwd.plms.web.service.report.inf;

import java.util.List;

import com.ljwd.plms.core.feature.orm.mybatis.Page;
import com.ljwd.plms.core.generic.GenericService;
import com.ljwd.plms.web.model.report.PlmsLaCollectorIncome;
import com.ljwd.plms.web.model.report.PlmsLaCollectorIncomeExample;
import com.ljwd.plms.web.vo.report.PlmsLaCollectorIncomeExportResult;
import com.ljwd.plms.web.vo.report.PlmsLaCollectorIncomeResult;
import com.ljwd.plms.web.vo.report.PlmsLaCollectorPersonIncomeExportResult;
import com.ljwd.plms.web.vo.report.PlmsLaOutVisitPersonIncomeResult;

public interface PlmsIncomeReportService extends GenericService<PlmsLaCollectorIncome, Long>{

	/**
	 * 
	* @Description: 催收实收明细分页 
	* @param pageData
	* @param example
	* @return
	* @return Page<PlmsLaCollectorIncomeResult>
	 */
	Page<PlmsLaCollectorIncomeResult> pageAllIncomeData(Page<PlmsLaCollectorIncomeResult> pageData,PlmsLaCollectorIncomeExample example);

	/**
	 * 
	* @Description: 催收实收明细导出列表
	* @param example
	* @return
	* @return List<PlmsLaCollectorIncomeExportResult>
	 */
	List<PlmsLaCollectorIncomeExportResult> selectByExampleForExport(
			PlmsLaCollectorIncomeExample example);
	
	
	/**
	 * 
	* @Description: 催收个人实收明细导出列表
	* @param example
	* @return
	* @return List<PlmsLaCollectorPersonIncomeExportResult>
	 */
	List<PlmsLaCollectorPersonIncomeExportResult> selectByExampleForPersonExport(
			PlmsLaCollectorIncomeExample example);
	
	
	/**
	 * 
	* @Description: 外访个人实收明细导出列表
	* @param example
	* @return
	* @return List<PlmsLaOutVisitPersonIncomeResult>
	 */
	List<PlmsLaOutVisitPersonIncomeResult> selectByExampleForPersonOutVisitExport(
			PlmsLaCollectorIncomeExample example);
	
	/**
	 * 
	* @Description: 催收实收明细导出 
	* @param string
	* @param docsPath
	* @param expotList
	* @return void
	 */
	void exportToExcelAll(String string, String docsPath,
			List<PlmsLaCollectorIncomeExportResult> expotList);
	/**
	 * 
	* @Description: 催收个人实收明细导出
	* @param string
	* @param docsPath
	* @param expotList
	* @return void
	 */
	void exportToExcelPerson(String string, String docsPath,
			List<PlmsLaCollectorPersonIncomeExportResult> expotList);
	/**
	 * 
	* @Description:  外访个人实收明细导出
	* @param string
	* @param docsPath
	* @param expotList
	* @return void
	 */
	void exportToExcelOutvisitPerson(String string, String docsPath,
			List<PlmsLaOutVisitPersonIncomeResult> expotList);
}
