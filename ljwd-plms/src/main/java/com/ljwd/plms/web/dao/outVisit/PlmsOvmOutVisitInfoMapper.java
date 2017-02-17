package com.ljwd.plms.web.dao.outVisit;

import com.ljwd.plms.core.feature.orm.mybatis.Page;
import com.ljwd.plms.core.generic.GenericDao;
import com.ljwd.plms.web.model.outVisit.PlmsOvmOutVisitInfo;
import com.ljwd.plms.web.model.outVisit.PlmsOvmOutVisitInfoExample;
import com.ljwd.plms.web.vo.outVisit.AllOutVisitExportResult;
import com.ljwd.plms.web.vo.outVisit.AllOutVisitParamDto;
import com.ljwd.plms.web.vo.outVisit.AllOutVisitResult;
import com.ljwd.plms.web.vo.outVisit.MyOutVisitResult;
import com.ljwd.plms.web.vo.outVisit.OutVisitAssignParamDto;
import com.ljwd.plms.web.vo.outVisit.OutVisitAssignResult;
import com.ljwd.plms.web.vo.outVisit.OutVisitAuditParamDto;
import com.ljwd.plms.web.vo.outVisit.OutVisitAuditResult;
import com.ljwd.plms.web.vo.outVisit.OutVisitPlanDetailResult;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface PlmsOvmOutVisitInfoMapper extends GenericDao<PlmsOvmOutVisitInfo,Long>{
	
    int countByExample(PlmsOvmOutVisitInfoExample example);

    int deleteByExample(PlmsOvmOutVisitInfoExample example);

    int deleteByPrimaryKey(Long id);

    int insert(PlmsOvmOutVisitInfo record);

    int insertSelective(PlmsOvmOutVisitInfo record);

    List<PlmsOvmOutVisitInfo> selectByExample(PlmsOvmOutVisitInfoExample example);

    PlmsOvmOutVisitInfo selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") PlmsOvmOutVisitInfo record, @Param("example") PlmsOvmOutVisitInfoExample example);

    int updateByExample(@Param("record") PlmsOvmOutVisitInfo record, @Param("example") PlmsOvmOutVisitInfoExample example);

    int updateByPrimaryKeySelective(PlmsOvmOutVisitInfo record);

    int updateByPrimaryKey(PlmsOvmOutVisitInfo record);
    
    /**
	 * 
	* @Description: 此案件已经存在已提交/已审核/已分配的外访记录，不能再提交(未结案的)
	* @param applId
	* @return
	* @return int
	 */
	List<PlmsOvmOutVisitInfo> checkIfExistOutVisitInfo(Map<String,Object> map);
	
	/**
	 * 
	* @Description: 此案件历史审核通过次数 
	* @param applId
	* @return
	* @return List<PlmsOvmOutVisitInfo>
	 */
   Long checkIsAuditedOutVisitInfo(@Param("applId")Long applId);

	/**
	 * 
	* @Description: 外访审核分页
	* @param pagedata
	* @param example
	* @return
	* @return Page<OutVisitAuditResult>
	 */
    List<OutVisitAuditResult> selectAuditByExampleAndPage(Page<OutVisitAuditResult> pagedata, OutVisitAuditParamDto example);
    /**
     * 
    * @Description:      最早逾期期数 
    * @param applId
    * @return
    * @return Integer
     */
    Integer  searchMinOverduePeriodByApplId(@Param("applId")Long applId);
    /**
     * 
    * @Description: 外访分配分页
    * @param pagedata
    * @param example
    * @return
    * @return List<OutVisitAssignResult>
     */
    List<OutVisitAssignResult> selectAssignByExampleAndPage(Page<OutVisitAssignResult> pagedata, OutVisitAssignParamDto example);
    
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
	List<MyOutVisitResult> selectMyOutVisitByExampleAndPage(
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
	List<AllOutVisitResult> selectAllOutVisitByExampleAndPage(
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
    public PlmsOvmOutVisitInfo getTheNewestOutVisitByApplId(@Param("applId")Long applId);
	/**
	 * 
	* @Description: 根据applId查询合同编号 
	* @param applId
	* @return
	* @return String
	 */
    public String getCntrctNoByApplId(@Param("applId")Long applId);
	
    /**
     * 
    * @Description: 查询特定日期结案的外访案件 
    * @param map
    * @return
    * @return List<PlmsOvmOutVisitInfo>
     */
    public List<PlmsOvmOutVisitInfo> selectOverOutVisitInfo(Map<String,Object> map);

}