package com.ljwd.plms.web.dao.case_collection;

import com.ljwd.plms.core.generic.GenericDao;
import com.ljwd.plms.web.model.case_collection.LnPayment;
import com.ljwd.plms.web.model.case_collection.LnPaymentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 * 付款申请单信息,用于记录付款申请单信息,LN_PAYMENT
 * */
public interface LnPaymentMapper {

    int countByExample(LnPaymentExample example);

    List<LnPayment> selectByExample(LnPaymentExample example);

    LnPayment selectByPrimaryKey(Long id);

}