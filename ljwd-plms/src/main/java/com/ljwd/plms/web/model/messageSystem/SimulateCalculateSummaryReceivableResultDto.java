/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ljwd.plms.web.model.messageSystem;

import java.math.BigDecimal;
import java.util.List;

/**
 *
 * @author czxu
 */
public class SimulateCalculateSummaryReceivableResultDto {
    
    private BigDecimal receivableSumaryAmount;
    private Integer overdueDays;
    private BigDecimal remindPrincipal;//剩余本金
    private Integer minReceivablePeriod;//应还未还最小期数
    private Integer currentReceivablePeriod;//计算所处的期数
    
    private List<ReceivableSearchResultDto> receivableDtos;
    
    private CalculateSummaryReceivableClientInfoDto calculateClientInfoDto;


    /**
     * @return the receivableDtos
     */
    public List<ReceivableSearchResultDto> getReceivableDtos() {
        return receivableDtos;
    }

    /**
     * @param receivableDtos the receivableDtos to set
     */
    public void setReceivableDtos(List<ReceivableSearchResultDto> receivableDtos) {
        this.receivableDtos = receivableDtos;
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
     * @return the calculateClientInfoDto
     */
    public CalculateSummaryReceivableClientInfoDto getCalculateClientInfoDto() {
        return calculateClientInfoDto;
    }

    /**
     * @param calculateClientInfoDto the calculateClientInfoDto to set
     */
    public void setCalculateClientInfoDto(CalculateSummaryReceivableClientInfoDto calculateClientInfoDto) {
        this.calculateClientInfoDto = calculateClientInfoDto;
    }

    /**
     * @return the remindPrincipal
     */
    public BigDecimal getRemindPrincipal() {
        return remindPrincipal;
    }

    /**
     * @param remindPrincipal the remindPrincipal to set
     */
    public void setRemindPrincipal(BigDecimal remindPrincipal) {
        this.remindPrincipal = remindPrincipal;
    }

    /**
     * @return the minReceivablePeriod
     */
    public Integer getMinReceivablePeriod() {
        return minReceivablePeriod;
    }

    /**
     * @param minReceivablePeriod the minReceivablePeriod to set
     */
    public void setMinReceivablePeriod(Integer minReceivablePeriod) {
        this.minReceivablePeriod = minReceivablePeriod;
    }

    /**
     * @return the currentReceivablePeriod
     */
    public Integer getCurrentReceivablePeriod() {
        return currentReceivablePeriod;
    }

    /**
     * @param currentReceivablePeriod the currentReceivablePeriod to set
     */
    public void setCurrentReceivablePeriod(Integer currentReceivablePeriod) {
        this.currentReceivablePeriod = currentReceivablePeriod;
    }

}
