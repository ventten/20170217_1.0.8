package com.ljwd.plms.web.service.outVisit.inf;

import com.ljwd.plms.core.feature.orm.mybatis.Page;
import com.ljwd.plms.core.generic.GenericService;
import com.ljwd.plms.mapp.vo.egress.AppOutVisitPlanResultVo;
import com.ljwd.plms.web.model.outVisit.PlmsOvmCancelType;
import com.ljwd.plms.web.model.outVisit.PlmsOvmOutVisitPlan;
import com.ljwd.plms.web.model.outVisit.PlmsOvmOutVisitPlanExample;
import com.ljwd.plms.web.model.outVisit.PlmsOvmOutVisitSign;
import com.ljwd.plms.web.model.outVisit.PlmsOvmResultType;
import com.ljwd.plms.web.vo.SessionMsg;
import com.ljwd.plms.web.vo.outVisit.AllOutVisitDetailInfoResult;
import com.ljwd.plms.web.vo.outVisit.AllOutVisitPlanDetailCustResult;
import com.ljwd.plms.web.vo.outVisit.AllOutVisitPlanParamDto;
import com.ljwd.plms.web.vo.outVisit.AllOutVisitPlanResult;
import com.ljwd.plms.web.vo.outVisit.OutVisitPlanDto;
import com.ljwd.plms.web.vo.outVisit.OutVisitRouteParamDto;
import com.ljwd.plms.web.vo.outVisit.OutVisitRouteResult;

import org.apache.ibatis.session.RowBounds;

import java.util.List;
import java.util.Map;

public interface PlmsOvmOutVisitPlanService extends GenericService<PlmsOvmOutVisitPlan, Long> {
	
	List<PlmsOvmOutVisitPlan> searchByMap(Map<String,Object> map);
	/**
	 * 
	* @Description: 新增外访计划 
	* @param planDto
	* @return
	* @return int
	 */
	int addOutVisitPlan(OutVisitPlanDto planDto,SessionMsg loginUser);
	/**
	 * 
	* @Description: 查找外访计划取消的取消类型 
	* @return
	* @return List<PlmsOvmCancelType>
	 */
	List<PlmsOvmCancelType> searchOutVisitPlanCancelType();
	/**
	 * 
	* @Description: 取消外访计划
	* @param planDto
	* @param loginUser
	* @return
	* @return int
	 */
	int cancelOutVisitPlan(PlmsOvmOutVisitPlan planDto,SessionMsg loginUser);
	/**
	 * 
	* @Description: 根据分组查询跟进结果的列表选项 
	* @param groupId
	* @return
	* @return List<PlmsOvmResultType>
	 */
	List<PlmsOvmResultType> searchOvmResultTypeByGroupId(Integer groupId);
	/**
	 * 
	* @Description: 保存外访结果 
	* @param planDto
	* @param loginUser
	* @return void
	 */
	void saveOutVisitPlanResult(OutVisitPlanDto planDto, SessionMsg loginUser);

	
	/**
	 * 
	* @Description: 外访计划分页查询 
	* @param pageData
	* @param example
	* @return
	* @return Page<AllOutVisitPlanResult>
	 */
	Page<AllOutVisitPlanResult> selectAllOutVisitPlanByExampleAndPage(Page<AllOutVisitPlanResult> pageData,
			AllOutVisitPlanParamDto example);
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
	List<AppOutVisitPlanResultVo> selectWithApp(RowBounds pageData, Map<String, Object> param);

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
	List<AppOutVisitPlanResultVo> selecthistory(RowBounds pageData, Map<String, Object> param);

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
	 * 联金催收外访结果提交
	 * @param visitPlan     外访计划
	 * @param visitSign     签到信息
	 */
	void submitResult(PlmsOvmOutVisitPlan visitPlan, PlmsOvmOutVisitSign visitSign);
	
	/**
	 * 
	* @Description: 外访路线分页 
	* @param pageData
	* @param example
	* @return
	* @return Page<OutVisitRouteResult>
	 */
	Page<OutVisitRouteResult> selectPageOutVisitRouteData(
			Page<OutVisitRouteResult> pageData, OutVisitRouteParamDto example);
	
	
	/**
	 * 
	* @Description: 根据查询条件 条数
	* @param example
	* @return
	* @return int
	 */
	int selectCountByExample(Map<String, Object> map);

	/**
	 * 
	* @Description: 查询某次外访最早的有效外访计划 
	* @param map
	* @return
	* @return PlmsOvmOutVisitPlan
	 */
	PlmsOvmOutVisitPlan selectMinTimeIsActivePlan(Map<String, Object> map);
}
