package com.ljwd.plms.web.model.messageSystem;

import java.math.BigDecimal;

/**
 *
 * @author Administrator
 */
public class ReceivableDetailDto {

    private Long id;
    private String ledgerTypeCode;
    private Long receivableId;
    private BigDecimal receivableAmount;
    private BigDecimal actualAmount;
    private BigDecimal waivedAmount;
    private BigDecimal repaymentPostAmount;

    /**
     * @return the id
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * @return the ledgerTypeCode
     */
    public String getLedgerTypeCode() {
        return ledgerTypeCode;
    }

    /**
     * @param ledgerTypeCode the ledgerTypeCode to set
     */
    public void setLedgerTypeCode(String ledgerTypeCode) {
        this.ledgerTypeCode = ledgerTypeCode;
    }

    /**
     * @return the receivableId
     */
    public Long getReceivableId() {
        return receivableId;
    }

    /**
     * @param receivableId the receivableId to set
     */
    public void setReceivableId(Long receivableId) {
        this.receivableId = receivableId;
    }

    /**
     * @return the receivableAmount
     */
    public BigDecimal getReceivableAmount() {
        return receivableAmount;
    }

    /**
     * @param receivableAmount the receivableAmount to set
     */
    public void setReceivableAmount(BigDecimal receivableAmount) {
        this.receivableAmount = receivableAmount;
    }

    /**
     * @return the actualAmount
     */
    public BigDecimal getActualAmount() {
        return actualAmount;
    }

    /**
     * @param actualAmount the actualAmount to set
     */
    public void setActualAmount(BigDecimal actualAmount) {
        this.actualAmount = actualAmount;
    }

    /**
     * @return the waivedAmount
     */
    public BigDecimal getWaivedAmount() {
        return waivedAmount;
    }

    /**
     * @param waivedAmount the waivedAmount to set
     */
    public void setWaivedAmount(BigDecimal waivedAmount) {
        this.waivedAmount = waivedAmount;
    }

	public BigDecimal getRepaymentPostAmount() {
		return repaymentPostAmount;
	}

	public void setRepaymentPostAmount(BigDecimal repaymentPostAmount) {
		this.repaymentPostAmount = repaymentPostAmount;
	}
    
    
}
