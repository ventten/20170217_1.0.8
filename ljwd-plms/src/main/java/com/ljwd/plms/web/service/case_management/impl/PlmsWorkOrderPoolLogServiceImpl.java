package com.ljwd.plms.web.service.case_management.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import com.ljwd.plms.core.util.D;
import com.ljwd.plms.web.model.case_management.PlmsWorkOrderPoolLogExample;
import com.ljwd.plms.web.service.case_management.inf.PlmsWorkOrderPoolService;
import com.ljwd.plms.web.vo.case_management.PlmsFeeWaiveApprovalResultDto;
import org.springframework.stereotype.Service;

import com.ljwd.plms.core.generic.GenericDao;
import com.ljwd.plms.core.generic.GenericServiceImpl;
import com.ljwd.plms.web.dao.case_management.PlmsWorkOrderPoolLogMapper;
import com.ljwd.plms.web.model.case_management.PlmsWorkOrderPoolLog;
import com.ljwd.plms.web.service.case_management.inf.PlmsWorkOrderPoolLogService;

/**
 * 工单日志表,PLMS_WORK_ORDER_POOL_LOG
 * */
@Service
public class PlmsWorkOrderPoolLogServiceImpl extends GenericServiceImpl<PlmsWorkOrderPoolLog, Long> implements PlmsWorkOrderPoolLogService {

    @Resource
    private PlmsWorkOrderPoolLogMapper plmsWorkOrderPoolLogMapper;
    @Resource
    private PlmsWorkOrderPoolService plmsWorkOrderPoolService;

    /**
     * 插入对象
     * @param workOrderPoolLog 对象
     */
    @Override
    public int insert(PlmsWorkOrderPoolLog workOrderPoolLog) {
        return plmsWorkOrderPoolLogMapper.insert(workOrderPoolLog);
    }

    /**
     * @description 批量插入工单日志表
     * @param list list
     */
    @Override
    public void insertBatch(List<PlmsWorkOrderPoolLog> list) {
        if(list == null || list.isEmpty()){
            return;
        }
        int comm = 2000;
        List<PlmsWorkOrderPoolLog> newList = new ArrayList<PlmsWorkOrderPoolLog>();
        int size = list.size()-1;
        for(int i=0;i<=size;i++){
            if(i!=0&&i%comm==0||i==size){
                newList.add(list.get(i));
                plmsWorkOrderPoolLogMapper.insertBatch(newList);
                newList.clear();
                System.out.println("------------------插入条数："+(i+1));
            }else{
                newList.add(list.get(i));
            }
        }
    }

    @Override
    public GenericDao<PlmsWorkOrderPoolLog, Long> getDao() {
        return plmsWorkOrderPoolLogMapper;
    }

    /**
     * @Description: 查询案件最新的日志
     * @param map map
     * @return 实体集
     */
    @Override
    public List<PlmsWorkOrderPoolLog> searchTheLogMaxDate(Map<String, Object> map) {
        return plmsWorkOrderPoolLogMapper.searchTheLogMaxDate(map);
    }

    /**
     * @Description: 根据借款ID, 判断最新的日志
     * @param applId 借款ID
     * @return 0-正常 1-保留 2-豁免 3-降期 4-离职 5-委外保留
     */
    @Override
    public int selectCheckMaxLog(Long applId) {
        Map<String,Object> map = new HashMap<>();
        map.put("applId",applId);
        List<PlmsWorkOrderPoolLog> poolLogList = this.searchTheLogMaxDate(map);
        if(poolLogList != null && poolLogList.size() > 0){

            PlmsWorkOrderPoolLog log = poolLogList.get(0);
            if(log.getDefendStatus() != null){
                if(PlmsWorkOrderPoolLog.DEFEND_KEEP.equals(log.getDefendStatus())){
                    return 1;
                }else if(PlmsWorkOrderPoolLog.DEFEND_DEPARTURE.equals(log.getDefendStatus())){
                    return 4;
                }else if(PlmsWorkOrderPoolLog.DEFEND_IMMUNITY.equals(log.getDefendStatus())){
                    return 2;
                }else if(PlmsWorkOrderPoolLog.DEFEND_OUTSRC_KEEP.equals(log.getDefendStatus()) && D.trunc(log.getProtectEndDate()).getTime() >= D.getSystemCalendar().getTime().getTime()){
                    return 5;
                }
            }

            //判断是否在委外保留
            int count = this.countOutsrcKeepByApplId(applId);
            if(count > 0){
                return 5;
            }

        }

        return 0;
    }

    /**
     * 根据借款ID,判断微贷是否发起豁免申请
     * @param applId 借款ID
     * @return true-是
     */
    @Override
    public boolean selectCheckIsWaive(Long applId) {
        //豁免要实时判断，要去查找微贷的状态
        Map<String,Object> waiveMap = new HashMap<String,Object>();
        waiveMap.put("status", PlmsFeeWaiveApprovalResultDto.STATUS_SUBMITTED);
        waiveMap.put("applId", applId);
        List<PlmsFeeWaiveApprovalResultDto> waiveList = plmsWorkOrderPoolService.searchFeeWaiveApproval(waiveMap);

        return (waiveList == null ? 0 : waiveList.size()) > 0;
    }

    /**
     * 根据查询条件查询
     * @param example 条件查询
     * @return 实体集
     */
    @Override
    public List<PlmsWorkOrderPoolLog> selectByExample(PlmsWorkOrderPoolLogExample example) {
        return plmsWorkOrderPoolLogMapper.selectByExample(example);
    }

    /**
     * @Description: 根据借款IDS查询案件最新的日志
     * @param applIds 借款IDS
     * @return 实体集
     */
    @Override
    public List<PlmsWorkOrderPoolLog> selectMaxLogByApplIds(List<Long> applIds) {
        if(applIds == null || applIds.isEmpty()){
            return null;
        }
        return plmsWorkOrderPoolLogMapper.selectMaxLogByApplIds(applIds);
    }

    /**
     * 根据借款ID判断案件是否在委外保留中
     * @param applId 借款ID
     * @return 数量
     */
    @Override
    public int countOutsrcKeepByApplId(Long applId) {
        return plmsWorkOrderPoolLogMapper.countOutsrcKeepByApplId(applId);
    }

    /**
     * 查询在委外保留流程中的借款ID(已去重)
     * @return 借款ID集合
     */
    @Override
    public List<Long> selectOutsrcKeepApplId() {
        return plmsWorkOrderPoolLogMapper.selectOutsrcKeepApplId();
    }

}
