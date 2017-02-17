package com.ljwd.plms.web.service.case_collection.impl;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.List;

import javax.annotation.Resource;

import org.apache.commons.collections.ListUtils;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.ljwd.plms.web.dao.case_collection.PlmsLaCollectionRecordMapper;
import com.ljwd.plms.web.model.case_collection.LnCntrct;
import com.ljwd.plms.web.model.case_collection.SysChargeSchema;
import com.ljwd.plms.web.model.messageSystem.LedgerTypeCode;
import com.ljwd.plms.web.model.messageSystem.ProductFee;
import com.ljwd.plms.web.model.messageSystem.ProductFeeCalculateDto;
import com.ljwd.plms.web.service.case_collection.inf.ReceivableCalculateCalculator;
import com.ljwd.plms.web.vo.case_collection.ReceivableCalculateContext;
import com.ljwd.plms.web.vo.case_collection.ReceivableCalculateResult;

/**
 * @author czxu
 */
@Service
public class ReceivableCalculateCommonCalculator implements ReceivableCalculateCalculator {

	@Resource
    private PlmsLaCollectionRecordMapper plmsLaCollectionRecordMapper;
    @Override
    public ReceivableCalculateResult calculateFee(ReceivableCalculateContext ctx, String ledgerCode) {/*
        BigDecimal feeRate = null;
        BigDecimal feeAmount = null;
        
        if(LedgerTypeCode.OVERDUE_INTEREST.equals(ledgerCode)){
            //计算逾期利息
            feeAmount = BigDecimal.ZERO;
            ProductFeeCalculateDto feeDto = this.getFeeRate(ctx.getReceivableCtx().getChargeSchema(), ctx.getReceivableCtx().getContract(),ctx.getPeriodNumber(), ledgerCode);
            feeRate = feeDto.getValue();
            if (feeDto.getValueType() == ValueType.PERCENTAGE) {
                if(feeDto.getCalMethod() == CalcMethod.OVERDUE_INTEREST_BASE_REMIND_PRINCIPAL){
                    feeAmount = ctx.getRemainderAmount().multiply(new BigDecimal(ctx.getOverdueDay())).multiply(feeRate).setScale(0, RoundingMode.UP);
                }else if(feeDto.getCalMethod() == CalcMethod.OVERDUE_INTEREST_BASE_LOAN_AMT){
                    feeAmount = ctx.getReceivableCtx().getContract().getLoanAmount().multiply(new BigDecimal(ctx.getOverdueDay())).multiply(feeRate).setScale(0, RoundingMode.UP);
                }
            } else if (feeDto.getValueType() == ValueType.FIXED) {
                feeAmount = feeRate.multiply(new BigDecimal(ctx.getOverdueDay())).setScale(0, RoundingMode.UP);
            }
            
        }else if(LedgerTypeCode.PENALTY.equals(ledgerCode)){
            //计算违约金 -->违约金 = 贷款金额 * 违约金比率（已还期数小于6 则为 2% ，大于等于6则为3%）
            feeAmount = BigDecimal.ZERO;
            feeRate = BigDecimal.ZERO;
            if (ctx.getReceivableCtx().isIsRenewLoanOperate() && ctx.getReceivableCtx().getRenewLoanPenaltyRate() != null) {
                //计算违约金--续贷
                feeRate = ctx.getReceivableCtx().getRenewLoanPenaltyRate();
                feeAmount = ctx.getReceivableCtx().getPayment().getPayAmount().multiply(feeRate);
            } else {
                //2014-1-10 ，核销用户的违约金要改成跟提交结清一致
                //            if(ctx.getPayment().getIsWriteOff()){
                //                panaltyRate = BigDecimal.ZERO;
                 //            }

                //提前结清-违约金
                ValueType valueType = null;
                if (ctx.getReceivableCtx().getContract().getLoanPeriod().compareTo(ctx.getFirstNonePaidRec().getPeriodNumber()) == 0
                        || ctx.getReceivableCtx().getRepaymentDate().compareTo(ctx.getReceivableCtx().getPayment().getEndDate()) > 0) {
                    //<1>.如果客户是在最后一期提前还款的，提前还款违约金应该是0,
                    //例如客户A贷款总期数为12期，当前已还期数为11期时，该客户提前结清，这种情况下，不收违约金的。
                    //<2>.#178,还款日期大于贷款的结束日期时提前结清操作，是不算违约金
                    feeRate = BigDecimal.ZERO;
                    valueType = ValueType.PERCENTAGE;
                } else {
                    //用当前应还期数来获取违约金费率 而不是第一期未还清的期数
                    ProductFeeCalculateDto feeDto = this.getFeeRate(ctx.getReceivableCtx().getChargeSchema(), ctx.getReceivableCtx().getContract(), ctx.getPeriodNumber(), ledgerCode);
                    feeRate = feeDto.getValue();
                    valueType = feeDto.getValueType();
                }
                if (valueType == ValueType.PERCENTAGE) {
                    feeAmount = ctx.getReceivableCtx().getPayment().getPayAmount().multiply(feeRate);
                } else if (valueType == ValueType.FIXED) {
                    feeAmount = feeRate;
                }
            }
        }else if(LedgerTypeCode.FAIL_COLLECT_FEE.equals(ledgerCode)){
            feeAmount = BigDecimal.ZERO;
            ProductFeeCalculateDto feeDto = this.getFeeRate(ctx.getReceivableCtx().getChargeSchema(), ctx.getReceivableCtx().getContract(), ctx.getPeriodNumber(), ledgerCode);
            if(feeDto != null && feeDto.getValue().signum() > 0){
                feeAmount = feeDto.getValue();
            }
        }
        
        return new ReceivableCalculateResult(feeAmount, feeRate);
    */
    return null;	
    }
    
    public ProductFee getProductFee(SysChargeSchema product, String ledgerCode) {
    	/*List<ProductFee> productFees = plmsLaCollectionRecordMapper.findListProductFeeBySchemaId(product.getId());
        ProductFee productFee = ListUtils.findOne(productFees, new evaluate<ProductFee>() {
            public boolean evaluate(ProductFee obj) {
                return obj.getLedgerTypeCode().equals(ledgerCode);
            }
        });
        return productFee;*/
    	return null;
    }
    public ProductFeeCalculateDto getFeeRate(SysChargeSchema product, LnCntrct contract, int currentPeriod, final String ledgerCode) {/*
        ProductFee productFee = this.getProductFee(product,ledgerCode);
        if (productFee == null) {
            String errMsg = "can't not find the product feed of ledgeTypeCode is :" + ledgerCode + ", and product id is :" + product.getId();
            logger.error(errMsg);
            throw new SystemErrorException(ErrorCode.SYS_ERR, errMsg);
        }
        BigDecimal value = null;
        long baseValue = -1L;
        if (productFee.getBaseValue() == CalcBaseValue.AMT) {
            baseValue = contract.getLoanAmount().longValue();
        } else if (productFee.getBaseValue() == CalcBaseValue.PERIOD) {
            baseValue = contract.getLoanPeriod();
        } else if (productFee.getBaseValue() == CalcBaseValue.REPAID_PERIOD) {
            baseValue = currentPeriod - 1;
        } else if (productFee.getBaseValue() == CalcBaseValue.REMAIN_PERIOD) {
            baseValue = contract.getLoanPeriod() - currentPeriod + 1;
        }
        for (ProductFeeDetail detail : productFee.getProductFeeDetails()) {
            if (baseValue == -1L) { //only one record.
                value = detail.getValue();
                break;
            } else {
                if (baseValue > detail.getFromValue() && baseValue <= detail.getToValue()) {
                    value = detail.getValue();
                    break;
                }
            }
        }
        if (value == null) {
            throw new SystemErrorException(ErrorCode.SYS_ERR, ledgerCode + " is not found or it is defined in product " + product.getSchemaCode());
        }

        ProductFeeCalculateDto dto = new ProductFeeCalculateDto();
        dto.setValueType(productFee.getValueType());
        dto.setValue(value);
        dto.setCalMethod(productFee.getCalcMethod());
        return dto;
    */
    	return null;
    			}

  
}
