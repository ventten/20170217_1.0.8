package com.ljwd.plms.web.service.case_collection.inf;

import com.ljwd.plms.core.generic.GenericService;
import com.ljwd.plms.web.model.case_collection.PlmsLnCollectCustInfo;

/**
 * 催收记录自定义信息,PLMS_LN_COLLECT_CUST_INFO
 * */
public interface PlmsLnCollectCustInfoService extends GenericService<PlmsLnCollectCustInfo,Long> {

    /**
     * 根据借款ID查找
     * @param applId 借款ID
     * @return LnCollectCustInfo实体
     * */
    PlmsLnCollectCustInfo selectByApplId(Long applId);

//    /**
//     * 根据借款ID、逾期期数、催收员查找
//     * @param applId 借款ID
//     * @param periodNum 逾期期数
//     * @param collector 催收员
//     * @return LnCollectCustInfo实体
//     * */
//    PlmsLnCollectCustInfo selectByApplId(Long applId,Integer periodNum,String collector);

    /**
     * 保存自定义信息
     * @param custInfo 自定义信息
     * @param loginUser 登录用户
     * */
    void saveInfo(PlmsLnCollectCustInfo custInfo,String loginUser);

}
