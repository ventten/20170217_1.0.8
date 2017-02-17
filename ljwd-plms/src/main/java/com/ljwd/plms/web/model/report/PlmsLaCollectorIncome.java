package com.ljwd.plms.web.model.report;


import com.ljwd.plms.web.model.BaseModel;

public class PlmsLaCollectorIncome extends BaseModel{
	
	private Long rpmntId; //实收Id	

    private String collector; //催收员

    private String collectorAgent;	//代理催收员

    private String outVisit;	//外访员

    private String isActive;	//Y/N

    
    public Long getRpmntId() {
        return rpmntId;
    }

    public void setRpmntId(Long rpmntId) {
        this.rpmntId = rpmntId;
    }
    public String getCollector() {
        return collector;
    }

    public void setCollector(String collector) {
        this.collector = collector == null ? null : collector.trim();
    }

    public String getCollectorAgent() {
        return collectorAgent;
    }

    public void setCollectorAgent(String collectorAgent) {
        this.collectorAgent = collectorAgent == null ? null : collectorAgent.trim();
    }

    public String getOutVisit() {
        return outVisit;
    }

    public void setOutVisit(String outVisit) {
        this.outVisit = outVisit == null ? null : outVisit.trim();
    }

    public String getIsActive() {
        return isActive;
    }

    public void setIsActive(String isActive) {
        this.isActive = isActive == null ? null : isActive.trim();
    }

    
}