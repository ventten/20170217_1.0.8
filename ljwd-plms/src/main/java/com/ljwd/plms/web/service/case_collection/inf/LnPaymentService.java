package com.ljwd.plms.web.service.case_collection.inf;

import com.ljwd.plms.web.model.case_collection.LnPayment;
import com.ljwd.plms.web.model.case_collection.LnPaymentExample;

import java.util.List;

/**
 * 付款申请单信息,用于记录付款申请单信息,LN_PAYMENT
 * */
public interface LnPaymentService {

    /**
     * 根据ID查询
     * @param id 记录ID
     * @return 实体
     */
    LnPayment selectByPrimaryKey(Long id);

    /**
     * 根据条件查询
     * @param example 查询条件
     * @return 实体集
     */
    List<LnPayment> selectByExample(LnPaymentExample example);

    /**
     * 根据借款申请ID查询
     * @param applId 借款申请ID
     * @return 实体
     */
    LnPayment selectByApplId(Long applId);

}
