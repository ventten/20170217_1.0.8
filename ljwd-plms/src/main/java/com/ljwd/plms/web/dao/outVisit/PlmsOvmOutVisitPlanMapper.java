package com.ljwd.plms.web.dao.outVisit;

import com.ljwd.plms.core.feature.orm.mybatis.Page;
import com.ljwd.plms.core.generic.GenericDao;
import com.ljwd.plms.mapp.vo.egress.AppOutVisitPlanResultVo;
import com.ljwd.plms.web.model.outVisit.PlmsOvmOutVisitPlan;
import com.ljwd.plms.web.model.outVisit.PlmsOvmOutVisitPlanExample;
import com.ljwd.plms.web.vo.outVisit.AllOutVisitDetailInfoResult;
import com.ljwd.plms.web.vo.outVisit.AllOutVisitPlanDetailCustResult;
import com.ljwd.plms.web.vo.outVisit.AllOutVisitPlanParamDto;
import com.ljwd.plms.web.vo.outVisit.AllOutVisitPlanResult;
import com.ljwd.plms.web.vo.outVisit.OutVisitRouteParamDto;
import com.ljwd.plms.web.vo.outVisit.OutVisitRouteResult;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

import java.util.List;
import java.util.Map;

public interface PlmsOvmOutVisitPlanMapper extends GenericDao<PlmsOvmOutVisitPlan, Long> {
    int countByExample(PlmsOvmOutVisitPlanExample example);

    int deleteByExample(PlmsOvmOutVisitPlanExample example);

    int deleteByPrimaryKey(Long id);

    int insert(PlmsOvmOutVisitPlan record);

    int insertSelective(PlmsOvmOutVisitPlan record);

    List<PlmsOvmOutVisitPlan> selectByExample(PlmsOvmOutVisitPlanExample example);

    PlmsOvmOutVisitPlan selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") PlmsOvmOutVisitPlan record, @Param("example") PlmsOvmOutVisitPlanExample example);

    int updateByExample(@Param("record") PlmsOvmOutVisitPlan record, @Param("example") PlmsOvmOutVisitPlanExample example);

    int updateByPrimaryKeySelective(PlmsOvmOutVisitPlan record);

    int updateByPrimaryKey(PlmsOvmOutVisitPlan record);

    List<PlmsOvmOutVisitPlan> searchByMap(Map<String, Object> map);

    /**
     * APP外访计划数据查询
     * @param pageData 分页参数
     * @param param    查询条件
     *                 {
     *                 visitStartDate : 外访查询起始时间,
     *                 visitEndDate   : 外访查询结束时间,
     *                 visitType      : 外访类型,
     *                 visitUser      : 外访人员,
     *                 planStatus     : 外访计划状态
     *                 }
     * @return 返回查询结果
     */
    List<AppOutVisitPlanResultVo> selectWithApp(@Param("pageData") RowBounds pageData, @Param("param") Map<String, Object> param);

	/**
	 * APP外访计划数据查询
	 * @param pageData 分页参数
	 * @param param    查询条件
	 *                 {
	 *                 visitStartDate : 外访查询起始时间,
	 *                 visitEndDate   : 外访查询结束时间,
	 *                 visitUser      : 外访人员
	 *                 }
	 * @return 返回查询结果
	 */
    List<AppOutVisitPlanResultVo> selecthistory(@Param("pageData") RowBounds pageData, @Param("param") Map<String, Object> param);

    /**
	 *
	* @Description: 外访计划分页查询
	* @param pageData
	* @param example
	* @return
	* @return Page<AllOutVisitPlanResult>
	 */
	List<AllOutVisitPlanResult> selectAllOutVisitPlanByExampleAndPage(Page<AllOutVisitPlanResult> pageData,
			AllOutVisitPlanParamDto example);

	/**
	 *
	* @Description: 外访计划详情  客户信息
	* @param map
	* @return
	* @return List<AllOutVisitPlanDetailResult>
	 */
	AllOutVisitPlanDetailCustResult selectAllOutPlanCustDetail(Map<String,Object> map);

	/**
	 *
	* @Description: 外访计划详情  外访信息
	* @param map
	* @return
	* @return AllOutVisitDetailInfoResult
	 */
	AllOutVisitDetailInfoResult selectAllOutPlanInfoDetail(Map<String,Object> map);

	/**
	 *
	* @Description: 判断此计划是否是此外访案件最新的计划
	* @param infoId
	* @param planId
	* @return
	* @return PlmsOvmOutVisitPlan
	 */
	PlmsOvmOutVisitPlan isTheMaxDatePlan(@Param("infoId")Long infoId);

	/**
	 *
	* @Description: 外访路线分页
	* @param pageData
	* @param example
	* @return
	* @return Page<OutVisitRouteResult>
	 */
	List<OutVisitRouteResult> selectPageOutVisitRouteData(
			Page<OutVisitRouteResult> pageData, OutVisitRouteParamDto example);

	/**
	 * 
	* @Description: 查询有效的外访计划条数 
	* @param map
	* @return
	* @return int
	 */
	int countByOutVisitUser(Map<String, Object> map); 
	
	
	/**
	 * 
	* @Description: 查询某次外访最早的有效外访计划 
	* @param map
	* @return
	* @return PlmsOvmOutVisitPlan
	 */
	PlmsOvmOutVisitPlan selectMinTimeIsActivePlan(Map<String, Object> map);
}
