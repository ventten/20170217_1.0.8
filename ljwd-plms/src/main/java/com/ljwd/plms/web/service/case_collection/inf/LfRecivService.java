package com.ljwd.plms.web.service.case_collection.inf;

import com.ljwd.plms.web.model.case_collection.LfReciv;
import com.ljwd.plms.web.model.case_collection.LfRecivExample;
import com.ljwd.plms.web.vo.case_collection.LfRecivDto;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 * 应收款项表,LF_RECIV
 * */
public interface LfRecivService {

    /**
     * 根据条件查询
     * @param example 查询条件
     * @return  实体集
     * */
    List<LfReciv> selectByExample(LfRecivExample example);

    /**
     * 根据借款ID查询最小的逾期期数
     * @param applId 借款申请ID
     * @return 最小的逾期期数
     * */
    Integer selectMinOverduePeriodByApplId(Long applId);

    /**
     * 根据借款ID查询应收记录明细
     * @param applId 借款申请ID
     * @return 实体集
     * */
    List<LfRecivDto> selectReceivableByApplId(Long applId);

    /**
     * 根据借款ID和还款日期反算出外包费用(能找到外包催收费用的费率说明需要计算外包催收费）
     * @param applId 借款申请ID
     * @param repaymentDate 还款日期
     * */
    BigDecimal selectApplOutsourceFeeRate(Long applId,Date repaymentDate);

    /**
     * 计算应收金额
     * @param applId 借款申请ID
     * @param payType 还款方式:RENEW-正常还款、INADVANCE-提前结清
     * @param repaymentDate 还款日期
     * */
    BigDecimal selectRepaymentAmount(Long applId,String payType,Date repaymentDate);

}
