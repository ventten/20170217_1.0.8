package com.ljwd.plms.web.dao.case_management;

import java.util.List;
import java.util.Map;

import com.ljwd.plms.web.vo.case_collection.CaseCollectionDto;
import com.ljwd.plms.web.vo.case_collection.CaseCollectionExample;
import com.ljwd.plms.web.vo.case_management.*;

import org.apache.ibatis.annotations.Param;

import com.ljwd.plms.core.feature.orm.mybatis.Page;
import com.ljwd.plms.core.generic.GenericDao;
import com.ljwd.plms.web.model.case_management.PlmsWorkOrderPool;
import com.ljwd.plms.web.model.case_management.PlmsWorkOrderPoolExample;

public interface PlmsWorkOrderPoolMapper extends GenericDao<PlmsWorkOrderPool, Long>{

    int countByExample(PlmsWorkOrderPoolExample example);

    int deleteByExample(PlmsWorkOrderPoolExample example);

    int deleteByPrimaryKey(Long id);

    int insert(PlmsWorkOrderPool record);

    int insertSelective(PlmsWorkOrderPool record);

    List<PlmsWorkOrderPool> selectByExample(PlmsWorkOrderPoolExample example);

    /**
     * 根据借款ID查询
     * @param applId 借款ID
     * @return 实体
     */
    PlmsWorkOrderPool selectByApplId(Long applId);

    PlmsWorkOrderPool selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") PlmsWorkOrderPool record, @Param("example") PlmsWorkOrderPoolExample example);

    int updateByExample(@Param("record") PlmsWorkOrderPool record, @Param("example") PlmsWorkOrderPoolExample example);

    int updateByPrimaryKeySelective(PlmsWorkOrderPool record);

    int updateByPrimaryKey(PlmsWorkOrderPool record);
    
    /**
	* @Description:  查询微贷系统中新的逾期数据
	* @param map
	* @return List<PlmsWorkOrderPoolDto>
	 */
    List<PlmsWorkOrderPoolDto> searchReceiveOverdue(Map<String,Object> map);
    
    /**
	* @Description:查询贷后已有的数据的逾期新状态
	* @param map
	* @return List<PlmsWorkOrderPoolDto>
	 */
    List<PlmsWorkOrderPoolDto> selectExitsReceiveOverdueCircu(Map<String,Object> map);
    /**
     * 
    * @Description:查询贷后已有的数据的结清和当期已还的情况  
    * @param map
    * @return
    * @return List<PlmsWorkOrderPoolDto>
     */
    List<PlmsWorkOrderPoolDto> selectExitsReceiveOverdueClear(Map<String,Object> map);


    
    /**
	* @Description: 查询自动分配的区间的新数据 
	* @param status
	* @return List<PlmsWorkOrderAssignDto>
	 */
    List<PlmsWorkOrderAssignDto> selectNewCircuNotAssignList(@Param("status") String status);    
    
    /**
	* @Description: 查询自动分配区间的库存数据 
	* @param status
	* @return List<PlmsWorkOrderAssignDto>
	 */
    List<PlmsWorkOrderAssignDto> selectOldCircuAssignedList(@Param("status") String status);    

    /**
     * @Description: 查找全部的产品 
     * @return List<SysProduct>
      */
    List<SysProduct> searchAllProducts();
    
    /**
	* @Description: 工单池数据分页
	* @param pagedata
	* @param example
	* @return
	 */
    List<PlmsWorkOrderPoolDto> selectByExampleAndPage(Page<PlmsWorkOrderPoolDto> page, PlmsWorkOrderPoolParam example);
    
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
    List<PlmsWorkOrderAssignDto> selectMaruAssignList(Map<String, Object> map);

    /**
     * 我的案件、全部案件分页查询
     * @param page    Page信息
     * @param example 查询条件
     * @return Page数据
     */
    List<CaseCollectionDto> selectCaseCollectionAndPage(Page<CaseCollectionDto> page, CaseCollectionExample example);

    /**
     * 全部案件导出查询
     * @param example 查询条件
     * @return List<CaseCollectionDto>
     */
    List<CaseCollectionDto> selectCaseCollectionAndPage(CaseCollectionExample example);

    /**
     * 
     * 
    * @Description: 保护案件分页查询 
    * @param pagedata
    * @param example
    * @return
    * @return List<PlmsProtectCaseResultDto>
     */
    List<PlmsProtectCaseResultDto> selectProtectCaseAndPage(Page<PlmsProtectCaseResultDto> pagedata,PlmsProtectCaseParam example);
    
    /**
     * 
    * @Description: 根据查询条件查询案件 
    * @param param
    * @return
    * @return List<PlmsWorkOrderPool>
     */
    List<PlmsWorkOrderAssignDto> selectByParam(PlmsWorkOrderPoolParam param);

    /**
    * @Description:  查询指定appl_id最新的情况
    * @param map
    * @return
    * @return List<PlmsWorkOrderPoolDto>
     */
    List<PlmsWorkOrderPoolDto> searchReceiveOverdueByApplIds(Map<String,Object> map);
    
    /**
     * 
    * @Description: 查询案件导出数据 
    * @param example
    * @return
    * @return List<PlmsWorkOrderPoolDto>
     */
    List<PlmsWorkOrderPoolExportDto> selectByExampleExport(PlmsWorkOrderPoolParam example);

    /**
    * @Description: 查找提前移交区间没有被分配的案件
    * @param map map
    * @return List<PlmsWorkOrderPoolDto>
     */
    List<PlmsWorkOrderPool> selectTansferNotAssign(Map<String,Object> map);
    
    /**
    * @Description: 根据豁免状态和借款ID查询豁免信息
    * @return List<PlmsFeeWaiveApprovalResultDto>
     */
    List<PlmsFeeWaiveApprovalResultDto> searchFeeWaiveApproval(Map<String,Object> map);

 }
