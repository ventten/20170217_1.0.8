package com.ljwd.plms.web.service.case_collection.inf;


import com.ljwd.plms.web.vo.case_collection.ReceivableCalculateContext;
import com.ljwd.plms.web.vo.case_collection.ReceivableCalculateResult;

/**
 *
 * @author czxu
 */
public interface ReceivableCalculateCalculator  {
    /**
     * calculate fee. interest.
     *
     * @param ctx
     * @param ledgerCode
     * @return result of ReceivableCalculateResult
     */
    ReceivableCalculateResult calculateFee(ReceivableCalculateContext ctx, String ledgerCode);
}
