package com.ljwd.plms.web.service.case_management.inf;

import java.util.List;
import java.util.Map;

import com.ljwd.plms.core.feature.orm.mybatis.Page;
import com.ljwd.plms.core.generic.GenericService;
import com.ljwd.plms.web.model.case_management.PlmsLTransferAdvance;
import com.ljwd.plms.web.model.case_management.PlmsLTransferAdvanceExample;
import com.ljwd.plms.web.vo.case_management.PlmsLTransferAdvanceParam;
import com.ljwd.plms.web.vo.case_management.PlmsLTransferAdvanceResult;
import com.ljwd.plms.web.vo.case_management.PlmsProtectCaseParam;
import com.ljwd.plms.web.vo.case_management.PlmsProtectCaseResultDto;

/**
 * 提前移交案件表,PLMS_L_TRANSFER_ADVANCE
 * */
public interface PlmsLTransferAdvanceService extends GenericService<PlmsLTransferAdvance, Long>{

    /**
     * 根据条件统计数量
     * @param example 查询条件
     * @return 数量
     */
    int countByExample(PlmsLTransferAdvanceExample example);

    /**
     * 根据借款ID判断是否在提前移交流程
     * @param applId 借款ID
     * @return boolean true-是
     */
    boolean selectCheckIsAdvance(Long applId);

    /**
     * 根据条件查询
     * @param example 查询条件
     * @return 实体集
     */
    List<PlmsLTransferAdvance> selectByExample(PlmsLTransferAdvanceExample example);

    /**
     * @Description: 提前移交案件分页数据
     * @param pageData 分页数据
     * @param example 查询条件
     * @return Page<PlmsLTransferAdvance>
     */
    Page<PlmsLTransferAdvanceResult> selectTransferAdvanceAndPage(Page<PlmsLTransferAdvanceResult> pageData, PlmsLTransferAdvanceParam example);

    /**
     * @Description: 处理提前移交案件的各种状态
     * @param payments
     * @param handelResult
     * @param userName
     */
    void updateTransferCaseHandel(List<Long> payments,String handelResult,String refusalReason,String userName);

    /**
     * @Description: 分配提前移交案件
     * @param idsList
     * @param colleocterList
     * @param userName
     */
    String updateTransferCaseAlloc(List<Long> idsList,List<String> colleocterList, String userName);

    /**
     * @Description: 根据paymentId查询
     * @param map
     * @return List<PlmsLTransferAdvance>
     */
    PlmsLTransferAdvance selectMaxDateTransferAdvanceByPaymentId(Map<String,Object> map);

    /**
     * @Title: 根据借款IDS和状态查找
     * @Description: TODO(根据借款IDS和状态查找)
     * @param applIds 借款IDS
     * @param statusS 状态
     * @return 实体集
     */
    List<PlmsLTransferAdvance> selectByApplIdsAndStatusS(List<Long> applIds, List<String> statusS);

}