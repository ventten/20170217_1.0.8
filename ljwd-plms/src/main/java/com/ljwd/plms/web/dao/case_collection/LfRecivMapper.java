package com.ljwd.plms.web.dao.case_collection;

import com.ljwd.plms.web.model.case_collection.LfReciv;
import com.ljwd.plms.web.model.case_collection.LfRecivExample;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import com.ljwd.plms.web.vo.case_collection.LfRecivDto;
import org.apache.ibatis.annotations.Param;

/**
 * 应收款项表,LF_RECIV
 * */
public interface LfRecivMapper {

    int countByExample(LfRecivExample example);

    List<LfReciv> selectByExample(LfRecivExample example);

    LfReciv selectByPrimaryKey(Long id);

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
     * @return 外包催收费
     * */
    BigDecimal selectApplOutsourceFeeRate(@Param("applId")Long applId,@Param("repaymentDate")Date repaymentDate);

}