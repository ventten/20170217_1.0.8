package com.ljwd.plms.web.model.messageSystem;

import java.math.BigDecimal;

/**
 * 
* @ClassName: ReceivableDetail 
* @Description: TODO(LF_RECIV_DTL) 
* @author A18ccms a18ccms_gmail_com 
* @date 2016年9月8日 下午2:19:23 
*
 */
public class ReceivableDetail  {

    private Long id;

    private String ledgerTypeCode;  //LEDGER_CODE

    private Long receivableId;  //RECIV_ID

    private BigDecimal receivableAmount ; // RECIV_AMT

    private BigDecimal actualAmount ;  //ACTUAL_AMT

    private BigDecimal waivedAmount ;  //WAIVED_AMT

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getLedgerTypeCode() {
		return ledgerTypeCode;
	}

	public void setLedgerTypeCode(String ledgerTypeCode) {
		this.ledgerTypeCode = ledgerTypeCode;
	}


	public Long getReceivableId() {
		return receivableId;
	}

	public void setReceivableId(Long receivableId) {
		this.receivableId = receivableId;
	}

	public BigDecimal getReceivableAmount() {
		return receivableAmount;
	}

	public void setReceivableAmount(BigDecimal receivableAmount) {
		this.receivableAmount = receivableAmount;
	}

	public BigDecimal getActualAmount() {
		return actualAmount;
	}

	public void setActualAmount(BigDecimal actualAmount) {
		this.actualAmount = actualAmount;
	}

	public BigDecimal getWaivedAmount() {
		return waivedAmount;
	}

	public void setWaivedAmount(BigDecimal waivedAmount) {
		this.waivedAmount = waivedAmount;
	}

    

}
