package com.ljwd.plms.web.dao.report;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.ljwd.plms.core.feature.orm.mybatis.Page;
import com.ljwd.plms.core.generic.GenericDao;
import com.ljwd.plms.web.model.report.PlmsLaCollectorIncome;
import com.ljwd.plms.web.model.report.PlmsLaCollectorIncomeExample;
import com.ljwd.plms.web.vo.report.PlmsLaCollectorIncomeDto;
import com.ljwd.plms.web.vo.report.PlmsLaCollectorIncomeExportResult;
import com.ljwd.plms.web.vo.report.PlmsLaCollectorIncomeResult;
import com.ljwd.plms.web.vo.report.PlmsLaCollectorPersonIncomeExportResult;
import com.ljwd.plms.web.vo.report.PlmsLaOutVisitPersonIncomeResult;

public interface PlmsLaCollectorIncomeMapper extends GenericDao<PlmsLaCollectorIncome,Long>{
    int countByExample(PlmsLaCollectorIncomeExample example);

    int deleteByExample(PlmsLaCollectorIncomeExample example);

    int deleteByPrimaryKey(Long rpmntId);

    int insert(PlmsLaCollectorIncome record);

    int insertSelective(PlmsLaCollectorIncome record);

    List<PlmsLaCollectorIncome> selectByExample(PlmsLaCollectorIncomeExample example);

    PlmsLaCollectorIncome selectByPrimaryKey(Long rpmntId);

    int updateByExampleSelective(@Param("record") PlmsLaCollectorIncome record, @Param("example") PlmsLaCollectorIncomeExample example);

    int updateByExample(@Param("record") PlmsLaCollectorIncome record, @Param("example") PlmsLaCollectorIncomeExample example);

    int updateByPrimaryKeySelective(PlmsLaCollectorIncome record);

    int updateByPrimaryKey(PlmsLaCollectorIncome record);
    
    /**
     * 
    * @Description: 查询昨天的实收情况
    * @param map
    * @return
    * @return List<PlmsLaCollectorIncome>
     */
    List<PlmsLaCollectorIncomeDto> searchYesterdayLfRpmnt(Map<String, Object> map);
    
    
    /**
     * 
    * @Description: 查询昨天的实收情况(微信还款)
    * @param map
    * @return
    * @return List<PlmsLaCollectorIncome>
     */
    List<PlmsLaCollectorIncomeDto> searchYesterdayLfRpmnt_weixin(Map<String, Object> map);

    /**
     * 
    * @Description: 删除昨天的实收统计
    * @return
    * @return int
     */
	int deletePlmsLaCollectorIncome(Map<String, Object> map);
	
	
	/**
	 * 
	* @Description: 催收实收明细分页 
	* @param pageData
	* @param example
	* @return
	* @return List<PlmsLaCollectorIncomeResult>
	 */
	List<PlmsLaCollectorIncomeResult> pageAllIncomeData(Page<PlmsLaCollectorIncomeResult> pageData,PlmsLaCollectorIncomeExample example);
	
	/**
	 * 
	* @Description: 催收实收明细导出
	* @param example
	* @return
	* @return List<PlmsLaCollectorIncomeExportResult>
	 */
	List<PlmsLaCollectorIncomeExportResult> selectByExampleForExport(PlmsLaCollectorIncomeExample example);
	
	
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
	* @Description: 根据条件查询 
	* @param map
	* @return
	* @return List<PlmsLaCollectorIncome>
	 */
    List<PlmsLaCollectorIncome> selectByMap(Map<String,Object> map);

	

}