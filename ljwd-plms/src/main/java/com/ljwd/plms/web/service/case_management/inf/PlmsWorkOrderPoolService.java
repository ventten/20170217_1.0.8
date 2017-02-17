package com.ljwd.plms.web.service.case_management.inf;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.List;
import java.util.Map;

import javax.swing.JOptionPane;

import com.ljwd.plms.core.feature.orm.mybatis.Page;
import com.ljwd.plms.core.generic.GenericService;
import com.ljwd.plms.core.util.ExportExcel;
import com.ljwd.plms.web.model.case_management.PlmsWorkOrderPool;
import com.ljwd.plms.web.vo.case_collection.CaseCollectionDto;
import com.ljwd.plms.web.vo.case_collection.CaseCollectionExample;
import com.ljwd.plms.web.vo.case_collection.CaseCollectionExportDto;
import com.ljwd.plms.web.vo.case_management.*;

/**
 * 工单池/案件
 * */
public interface PlmsWorkOrderPoolService extends GenericService<PlmsWorkOrderPool, Long> {

    /**
     * 根据借款申请ID查找
     * @param applId 借款申请ID
     * @return 实体
     * */
    PlmsWorkOrderPool selectByApplId(Long applId);

	/**
	* @Description:  查询微贷系统中新的逾期数据
	* @param map
	* @return List<PlmsWorkOrderPoolDto>
	 */
	List<PlmsWorkOrderPoolDto> searchReceiveOverdue(Map<String,Object> map);

	/**
	* @Description: 批量插入从微贷系统导出的新的逾期数据
	* @param list
	 */
	void insertBatch(List<PlmsWorkOrderPool> list);
	
	/**
	* @Description: 查询贷后中已存在逾期数据的最新状态
	* @param map
	* @return List<PlmsWorkOrderPoolDto>
	 */
	List<PlmsWorkOrderPoolDto> selectExitsReceiveOverdue(Map<String,Object> map);

	/**
	* @Description: 批量修改工单状态 
	* @param list
	 */
	void updateBatch(List<PlmsWorkOrderPool> list);

	List<PlmsWorkOrderPool> selectByExampleList(com.ljwd.plms.web.model.case_management.PlmsWorkOrderPoolExample example);
	
	/**
	* @Description: 查询自动分配的区间的新数据 
	* @param status
	* @return List<PlmsWorkOrderAssignDto>
	 */
	List<PlmsWorkOrderAssignDto> selectNewCircuNotAssignList(String status);
	
	/**
	* @Description: 查询自动分配区间的库存数据 
	* @param status
	* @return List<PlmsWorkOrderAssignDto>
	 */
	List<PlmsWorkOrderAssignDto> selectOldCircuAssignedList(String status);

    /**
    * @Description: 查找全部的产品 
    * @return List<SysProduct>
     */
    List<SysProduct> searchAllProducts();

    /**
    * @Description: 案件管理数据分页
    * @param pagedata
    * @param example
    * @return List<PlmsWorkOrderPoolDto>
     */
    Page<PlmsWorkOrderPoolDto> selectByExampleAndPage(Page<PlmsWorkOrderPoolDto> pagedata, PlmsWorkOrderPoolParam example);
    
    /**
    * @Description: 查看案件详情
    * @param map
    * @return PlmsWorkOrderPoolDetailDto
     */
    PlmsWorkOrderPoolDetailDto  searchCaseDetail(Map<String,Object> map);
    
    /**
    * @Description: 前台手动分配选中的案件 
    * @param map
    * @return List<PlmsWorkOrderAssignDto>
     */
	List<PlmsWorkOrderAssignDto> selectMaruAssignList(Map<String,Object> map);

    /**
     * 我的案件、全部案件分页查询
     * @param page    Page信息
     * @param example 查询条件
     * @return Page数据
     */
    Page<CaseCollectionDto> selectCaseCollectionAndPage(Page<CaseCollectionDto> page,CaseCollectionExample example);

    /**
     * 全部案件导出查询
     * @param example 查询条件
     * @return List<CaseCollectionDto>
     */
	List<CaseCollectionDto> selectCaseCollectionByExampleForExcel(CaseCollectionExample example);

	/**
	 * excel操作,在服务器生成Excel文件
	 * @param title 生产文件名
	 * @param fileName 生成后临时保存到服务器的文件名称(带文件格式)
	 * @param path 文件保存路径
	 * @param exportList List数据
	 */
	void exportCaseCollectionToExcel(String title,String fileName, String path,List<CaseCollectionExportDto> exportList);

    /**
     * 
    * @Description: 保护案件分页数据 
    * @param pagedata
    * @param example
    * @return
    * @return Page<PlmsProtectCaseResultDto>
     */
    Page<PlmsProtectCaseResultDto> selectProtectCaseAndPage(Page<PlmsProtectCaseResultDto> pagedata, PlmsProtectCaseParam example);
    
    /**
     * 
    * @Description: 根据查询条件查询案件 
    * @param param
    * @return
    * @return List<PlmsWorkOrderPool>
     */
    List<PlmsWorkOrderAssignDto> selectByParam(PlmsWorkOrderPoolParam param);
    
   /**
    * 
   * @Description: 根据条件查询需要导出的案件 
   * @param pagedata
   * @param example
   * @return
   * @return Page<PlmsWorkOrderPoolDto>
    */
    List<PlmsWorkOrderPoolExportDto> selectByExampleForExport( PlmsWorkOrderPoolParam example);

    /**
     * 
    * @Description: excel操作 
    * @param imagesPath
    * @param docsPath
    * @param expotList
    * @return void
     */
    public void exportToExcel(String imagesPath, String docsPath,List<PlmsWorkOrderPoolExportDto> expotList);

    /**
    * @Description: 查找提前移交区间没有被分配的案件
    * @param status
    * @return List<PlmsWorkOrderAssignDto>
     */
	List<PlmsWorkOrderPool> selectTansferNotAssign(Map<String,Object> map);
	
	/**
    * @Description: 根据豁免状态和借款ID查询豁免信息
    * @return List<PlmsFeeWaiveApprovalResultDto>
     */
    List<PlmsFeeWaiveApprovalResultDto> searchFeeWaiveApproval(Map<String,Object> map);

 }
