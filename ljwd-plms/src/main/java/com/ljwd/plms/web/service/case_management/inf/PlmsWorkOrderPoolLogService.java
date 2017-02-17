package com.ljwd.plms.web.service.case_management.inf;

import java.util.List;
import java.util.Map;

import com.ljwd.plms.core.generic.GenericService;
import com.ljwd.plms.web.model.case_management.PlmsWorkOrderPool;
import com.ljwd.plms.web.model.case_management.PlmsWorkOrderPoolLog;
import com.ljwd.plms.web.model.case_management.PlmsWorkOrderPoolLogExample;

/**
 * 工单日志表,PLMS_WORK_ORDER_POOL_LOG
 * */
public interface PlmsWorkOrderPoolLogService extends GenericService<PlmsWorkOrderPoolLog, Long> {

    /**
     * @Description: 批量插入从微贷系统导出的新的逾期数据到工单日志表
     * @param list
     * @return void
     */
    void insertBatch(List<PlmsWorkOrderPoolLog> list);

    /**
     * @Description: 查询案件最新的日志
     * @param map map
     * @return PlmsWorkOrderPoolLog
     */
    List<PlmsWorkOrderPoolLog> searchTheLogMaxDate(Map<String,Object> map);

    /**
     * @Description: 根据借款ID,判断最新的日志
     * @param applId 借款ID
     * @return 0-正常 1-保留 2-豁免 3-降期 4-离职 5-委外保留
     */
    int selectCheckMaxLog(Long applId);

    /**
     * 根据借款ID,判断微贷是否发起豁免申请
     * @param applId 借款ID
     * @return true-是
     */
    boolean selectCheckIsWaive(Long applId);

    /**
     * 根据查询条件查询
     * @param example 条件查询
     * @return 实体集
     * */
    List<PlmsWorkOrderPoolLog> selectByExample(PlmsWorkOrderPoolLogExample example);

    /**
     * @Description: 根据借款IDS查询案件最新的日志
     * @param applIds 借款IDS
     * @return 实体集
     */
    List<PlmsWorkOrderPoolLog> selectMaxLogByApplIds(List<Long> applIds);

    /**
     * 根据借款ID判断案件是否在委外保留中
     * @param applId 借款ID
     * @return 数量
     */
    int countOutsrcKeepByApplId(Long applId);

    /**
     * 查询在委外保留流程中的借款ID(已去重)
     * @return 借款ID集合
     */
    List<Long> selectOutsrcKeepApplId();

}