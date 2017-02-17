package com.ljwd.plms.web.dao.case_management;

import com.ljwd.plms.core.generic.GenericDao;
import com.ljwd.plms.web.model.case_management.PlmsWorkOrderPoolLog;
import com.ljwd.plms.web.model.case_management.PlmsWorkOrderPoolLogExample;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

/**
 * 工单日志表,PLMS_WORK_ORDER_POOL_LOG
 * */
public interface PlmsWorkOrderPoolLogMapper extends GenericDao<PlmsWorkOrderPoolLog, Long>{

    int countByExample(PlmsWorkOrderPoolLogExample example);

    int deleteByExample(PlmsWorkOrderPoolLogExample example);

    int deleteByPrimaryKey(Long id);

    int insert(PlmsWorkOrderPoolLog record);

    int insertSelective(PlmsWorkOrderPoolLog record);

    List<PlmsWorkOrderPoolLog> selectByExample(PlmsWorkOrderPoolLogExample example);

    PlmsWorkOrderPoolLog selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") PlmsWorkOrderPoolLog record, @Param("example") PlmsWorkOrderPoolLogExample example);

    int updateByExample(@Param("record") PlmsWorkOrderPoolLog record, @Param("example") PlmsWorkOrderPoolLogExample example);

    int updateByPrimaryKeySelective(PlmsWorkOrderPoolLog record);

    int updateByPrimaryKey(PlmsWorkOrderPoolLog record);

    /**
    * @Description: 查询案件最新的日志
    * @param map：applId-借款ID,defendStatus-保护规则对应状态
    * @return PlmsWorkOrderPoolLog
     */
    List<PlmsWorkOrderPoolLog> searchTheLogMaxDate(Map<String, Object> map);

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