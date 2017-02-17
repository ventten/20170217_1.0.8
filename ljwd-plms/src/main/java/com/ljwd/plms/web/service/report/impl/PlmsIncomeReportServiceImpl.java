package com.ljwd.plms.web.service.report.impl;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.ljwd.plms.core.feature.orm.mybatis.Page;
import com.ljwd.plms.core.generic.GenericDao;
import com.ljwd.plms.core.generic.GenericServiceImpl;
import com.ljwd.plms.core.util.ExportExcel;
import com.ljwd.plms.web.dao.report.PlmsLaCollectorIncomeMapper;
import com.ljwd.plms.web.model.report.PlmsLaCollectorIncome;
import com.ljwd.plms.web.model.report.PlmsLaCollectorIncomeExample;
import com.ljwd.plms.web.service.report.inf.PlmsIncomeReportService;
import com.ljwd.plms.web.vo.report.PlmsLaCollectorIncomeExportResult;
import com.ljwd.plms.web.vo.report.PlmsLaCollectorIncomeResult;
import com.ljwd.plms.web.vo.report.PlmsLaCollectorPersonIncomeExportResult;
import com.ljwd.plms.web.vo.report.PlmsLaOutVisitPersonIncomeResult;

@Service
public class PlmsIncomeReportServiceImpl extends GenericServiceImpl<PlmsLaCollectorIncome, Long>
		implements PlmsIncomeReportService {

	@Resource
	private PlmsLaCollectorIncomeMapper plmsLaCollectorIncomeMapper;
	
	
	
	@Override
	public GenericDao<PlmsLaCollectorIncome, Long> getDao() {

		return plmsLaCollectorIncomeMapper;
	}


	/**
	 * 
	* @Description: 催收实收明细 
	* @param pageData
	* @param example
	* @return
	* @return
	 */
	@Override
	public Page<PlmsLaCollectorIncomeResult> pageAllIncomeData(
			Page<PlmsLaCollectorIncomeResult> pageData,
			PlmsLaCollectorIncomeExample example) {
		
		plmsLaCollectorIncomeMapper.pageAllIncomeData(pageData, example);
		
		return pageData;
	}


	/**
	 * 
	* @Description: 催收实收明细 导出
	* @param example
	* @return
	* @return
	 */
	@Override
	public List<PlmsLaCollectorIncomeExportResult> selectByExampleForExport(
			PlmsLaCollectorIncomeExample example) {
		
		return plmsLaCollectorIncomeMapper.selectByExampleForExport(example);
	}

	/**
	 * 
	* @Description: 催收个人实收明细导出列表 
	* @param example
	* @return
	* @return
	 */
	@Override
	public List<PlmsLaCollectorPersonIncomeExportResult> selectByExampleForPersonExport(
			PlmsLaCollectorIncomeExample example) {

		return plmsLaCollectorIncomeMapper.selectByExampleForPersonExport(example);
	}


	/**
	 * 
	* @Description: 外访个人实收明细导出列表 
	* @param example
	* @return
	* @return
	 */
	@Override
	public List<PlmsLaOutVisitPersonIncomeResult> selectByExampleForPersonOutVisitExport(
			PlmsLaCollectorIncomeExample example) {

		return plmsLaCollectorIncomeMapper.selectByExampleForPersonOutVisitExport(example);
	}
	

	/**
	 * 
	* @Description: 催收实收明细 导出
	* @param string
	* @param docsPath
	* @param expotList
	* @return
	 */
	@Override
	public void exportToExcelAll(String string, String docsPath,
			List<PlmsLaCollectorIncomeExportResult> expotList) {
				
				String title = "催收实收明细表";
				String[] headers = { "序号", "合同编号", "主贷人", "证件号码", "催收人员","代理催收员","外访人员","退款金额","回款金额","还款日期","操作入账时间","更新时间","状态","有效性"};
				createFile(title,docsPath,headers,expotList);
						
	}

	/**
	 * 
	* @Description: 生成Excel文件
	* @param docsPath
	* @param headers
	* @param expotList
	* @param removeList
	* @return void
	 */
	private void createFile(String title,String docsPath,String[] headers,List<PlmsLaCollectorIncomeExportResult> expotList){
		//系统分隔符
		String FILE_SEPARATOR = System.getProperties().getProperty("file.separator");
		ExportExcel<PlmsLaCollectorIncomeExportResult> ex = new ExportExcel<PlmsLaCollectorIncomeExportResult>();
		OutputStream out =null;
		try {
			 out = new FileOutputStream(docsPath + FILE_SEPARATOR+ "incomeReport.xls");
			 ex.cutDataAndToCreateExcel(title,headers, expotList, out,"yyyy-MM-dd HH:mm:ss");
			 out.close();
			 System.out.println("excel导出成功！");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally{
			try {
				out.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	/**
	 * 
	* @Description: 催收个人实收明细导出
	* @param string
	* @param docsPath
	* @param expotList
	* @return
	 */
	@Override
	public void exportToExcelPerson(String string, String docsPath,
			List<PlmsLaCollectorPersonIncomeExportResult> expotList) {
		String title = "催收个人实收明细表";
		String[] headers = { "序号", "合同编号", "主贷人", "证件号码", "催收人员","代理催收员","退款金额","回款金额","还款日期","操作入账时间","更新时间","状态","有效性"};
		createFilePerson(title,docsPath,headers,expotList);
	}

	


	/**
	 * 
	* @Description:  外访个人实收明细导出
	* @param string
	* @param docsPath
	* @param expotList
	* @return
	 */
	@Override
	public void exportToExcelOutvisitPerson(String string, String docsPath,
			List<PlmsLaOutVisitPersonIncomeResult> expotList) {
		String title = "外访个人实收明细表";
		String[] headers = { "序号", "合同编号", "主贷人", "证件号码", "外访人员","退款金额","回款金额","还款日期","操作入账时间","更新时间","状态","有效性"};
		createFileOutvisit(title,docsPath,headers,expotList);
			
		
	}


	/**
	 * 
	* @Description:生成个人Excel文件
	* @param title
	* @param docsPath
	* @param headers
	* @param expotList
	* @return void
	 */
	private void createFilePerson(String title, String docsPath,
			String[] headers,
			List<PlmsLaCollectorPersonIncomeExportResult> expotList) {
				//系统分隔符
				String FILE_SEPARATOR = System.getProperties().getProperty("file.separator");
				ExportExcel<PlmsLaCollectorPersonIncomeExportResult> ex = new ExportExcel<PlmsLaCollectorPersonIncomeExportResult>();
				OutputStream out =null;
				try {
					 out = new FileOutputStream(docsPath + FILE_SEPARATOR+ "incomeReportPerson.xls");
					 ex.cutDataAndToCreateExcel(title,headers, expotList, out,"yyyy-MM-dd HH:mm:ss");
					 out.close();
					 System.out.println("excel导出成功！");
				} catch (FileNotFoundException e) {
					e.printStackTrace();
				} catch (IOException e) {
					e.printStackTrace();
				}finally{
					try {
						out.close();
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
		
	}
	
	/**
	 * 
	* @Description: 生成外访个人Excel文件
	* @param title
	* @param docsPath
	* @param headers
	* @param expotList
	* @return void
	 */
	private void createFileOutvisit(String title, String docsPath,
			String[] headers, List<PlmsLaOutVisitPersonIncomeResult> expotList) {
		//系统分隔符
		String FILE_SEPARATOR = System.getProperties().getProperty("file.separator");
		ExportExcel<PlmsLaOutVisitPersonIncomeResult> ex = new ExportExcel<PlmsLaOutVisitPersonIncomeResult>();
		OutputStream out =null;
		try {
			 out = new FileOutputStream(docsPath + FILE_SEPARATOR+ "incomeReportOutvisitPerson.xls");
			 ex.cutDataAndToCreateExcel(title,headers, expotList, out,"yyyy-MM-dd HH:mm:ss");
			 out.close();
			 System.out.println("excel导出成功！");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally{
			try {
				out.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}


}
