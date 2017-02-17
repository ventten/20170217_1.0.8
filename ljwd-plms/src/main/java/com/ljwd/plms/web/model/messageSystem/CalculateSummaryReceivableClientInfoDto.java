package com.ljwd.plms.web.model.messageSystem;

import java.math.BigDecimal;
import java.util.Date;

/**
 *
 * @author czxu
 */
public class CalculateSummaryReceivableClientInfoDto{
    private Long applicationId;
    private Long paymentId;
    private String contractNo;
    private BigDecimal loanAmount;
    private Integer loanPeriod;
    private Date payDate;
    private Integer paidPeriodNumber;
    private BigDecimal firstPeriodReceivable;
    private BigDecimal secondPeriodReceivable;
    private BigDecimal remainingPrincipal;
    private String collectBank;
    private String collectBankNo;
    private String collectBank2;
    private String collectBankNo2;
    private String collectBank3;
    private String collectBankNo3;
    private Integer seqNum;
    private String outsourceCompany;
    private Date outSourceDate;
    private BigDecimal receivableSumaryAmount;
    private Integer overdueDays;
    private String paymentType;
    private String collector;

    public String getCollector() {
        return collector;
    }

    public void setCollector(String collector) {
        this.collector = collector;
    }

    /**
     * @return the applicationId
     */
    public Long getApplicationId() {
        return applicationId;
    }

    /**
     * @param applicationId the applicationId to set
     */
    public void setApplicationId(Long applicationId) {
        this.applicationId = applicationId;
    }

    /**
     * @return the paymentId
     */
    public Long getPaymentId() {
        return paymentId;
    }

    /**
     * @param paymentId the paymentId to set
     */
    public void setPaymentId(Long paymentId) {
        this.paymentId = paymentId;
    }

    /**
     * @return the contractNo
     */
    public String getContractNo() {
        return contractNo;
    }

    /**
     * @param contractNo the contractNo to set
     */
    public void setContractNo(String contractNo) {
        this.contractNo = contractNo;
    }

    /**
     * @return the loanAmount
     */
    public BigDecimal getLoanAmount() {
        return loanAmount;
    }

    /**
     * @param loanAmount the loanAmount to set
     */
    public void setLoanAmount(BigDecimal loanAmount) {
        this.loanAmount = loanAmount;
    }

    /**
     * @return the loanPeriod
     */
    public Integer getLoanPeriod() {
        return loanPeriod;
    }

    /**
     * @param loanPeriod the loanPeriod to set
     */
    public void setLoanPeriod(Integer loanPeriod) {
        this.loanPeriod = loanPeriod;
    }

    /**
     * @return the payDate
     */
    public Date getPayDate() {
        return payDate;
    }

    /**
     * @param payDate the payDate to set
     */
    public void setPayDate(Date payDate) {
        this.payDate = payDate;
    }

    /**
     * @return the paidPeriodNumber
     */
    public Integer getPaidPeriodNumber() {
        return paidPeriodNumber;
    }

    /**
     * @param paidPeriodNumber the paidPeriodNumber to set
     */
    public void setPaidPeriodNumber(Integer paidPeriodNumber) {
        this.paidPeriodNumber = paidPeriodNumber;
    }

    /**
     * @return the firstPeriodReceivable
     */
    public BigDecimal getFirstPeriodReceivable() {
        return firstPeriodReceivable;
    }

    /**
     * @param firstPeriodReceivable the firstPeriodReceivable to set
     */
    public void setFirstPeriodReceivable(BigDecimal firstPeriodReceivable) {
        this.firstPeriodReceivable = firstPeriodReceivable;
    }

    /**
     * @return the secondPeriodReceivable
     */
    public BigDecimal getSecondPeriodReceivable() {
        return secondPeriodReceivable;
    }

    /**
     * @param secondPeriodReceivable the secondPeriodReceivable to set
     */
    public void setSecondPeriodReceivable(BigDecimal secondPeriodReceivable) {
        this.secondPeriodReceivable = secondPeriodReceivable;
    }

    /**
     * @return the remainingPrincipal
     */
    public BigDecimal getRemainingPrincipal() {
        return remainingPrincipal;
    }

    /**
     * @param remainingPrincipal the remainingPrincipal to set
     */
    public void setRemainingPrincipal(BigDecimal remainingPrincipal) {
        this.remainingPrincipal = remainingPrincipal;
    }

    /**
     * @return the collectBank
     */
    public String getCollectBank() {
        return collectBank;
    }

    /**
     * @param collectBank the collectBank to set
     */
    public void setCollectBank(String collectBank) {
        this.collectBank = collectBank;
    }    
    
    /**
     * @return the collectBankNo
     */
    public String getCollectBankNo() {
        return collectBankNo;
    }

    /**
     * @param collectBankNo the collectBankNo to set
     */
    public void setCollectBankNo(String collectBankNo) {
        this.collectBankNo = collectBankNo;
    }

    public String getCollectBank2() {
        return collectBank2;
    }

    public void setCollectBank2(String collectBank2) {
        this.collectBank2 = collectBank2;
    }

    public String getCollectBankNo2() {
        return collectBankNo2;
    }

    public void setCollectBankNo2(String collectBankNo2) {
        this.collectBankNo2 = collectBankNo2;
    }

    public String getCollectBank3() {
        return collectBank3;
    }

    public void setCollectBank3(String collectBank3) {
        this.collectBank3 = collectBank3;
    }

    public String getCollectBankNo3() {
        return collectBankNo3;
    }

    public void setCollectBankNo3(String collectBankNo3) {
        this.collectBankNo3 = collectBankNo3;
    }

    public Integer getSeqNum() {
        return seqNum;
    }

    public void setSeqNum(Integer seqNum) {
        this.seqNum = seqNum;
    }
    
    /**
     * @return the outsourceCompany
     */
    public String getOutsourceCompany() {
        return outsourceCompany;
    }

    /**
     * @param outsourceCompany the outsourceCompany to set
     */
    public void setOutsourceCompany(String outsourceCompany) {
        this.outsourceCompany = outsourceCompany;
    }

    /**
     * @return the outSourceDate
     */
    public Date getOutSourceDate() {
        return outSourceDate;
    }

    /**
     * @param outSourceDate the outSourceDate to set
     */
    public void setOutSourceDate(Date outSourceDate) {
        this.outSourceDate = outSourceDate;
    }

    /**
     * @return the receivableSumaryAmount
     */
    public BigDecimal getReceivableSumaryAmount() {
        return receivableSumaryAmount;
    }

    /**
     * @param receivableSumaryAmount the receivableSumaryAmount to set
     */
    public void setReceivableSumaryAmount(BigDecimal receivableSumaryAmount) {
        this.receivableSumaryAmount = receivableSumaryAmount;
    }

    /**
     * @return the overdueDays
     */
    public Integer getOverdueDays() {
        return overdueDays;
    }

    /**
     * @param overdueDays the overdueDays to set
     */
    public void setOverdueDays(Integer overdueDays) {
        this.overdueDays = overdueDays;
    }

    /**
     * @return the paymentType
     */
    public String getPaymentType() {
        return paymentType;
    }

    /**
     * @param paymentType the paymentType to set
     */
    public void setPaymentType(String paymentType) {
        this.paymentType = paymentType;
    }
    
    
  
}
