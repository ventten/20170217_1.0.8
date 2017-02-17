package com.ljwd.plms.web.vo.case_management;

public class PlmsLaCollectRecDto {

	 private Long paymentId;

	 private Long applId;

	 private String collector;//回收时的对应催收员
	 
	 private String status;//被回收时所在的区间值

	public Long getPaymentId() {
		return paymentId;
	}

	public void setPaymentId(Long paymentId) {
		this.paymentId = paymentId;
	}

	public Long getApplId() {
		return applId;
	}

	public void setApplId(Long applId) {
		this.applId = applId;
	}

	public String getCollector() {
		return collector;
	}

	public void setCollector(String collector) {
		this.collector = collector;
	}

	
	
	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public PlmsLaCollectRecDto() {
		super();
	}

	public PlmsLaCollectRecDto(Long paymentId, Long applId, String collector,
			String status) {
		super();
		this.paymentId = paymentId;
		this.applId = applId;
		this.collector = collector;
		this.status = status;
	}

	
	 
	 
	 
}
