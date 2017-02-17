package com.ljwd.plms.web.model.report;


import com.ljwd.plms.web.model.ActiveModel;
/**外访业绩报表
 * <p>Title: PlmsLaOutvisiteIncome</p>
 * @author pangshanxing
 * @date 2017年2月16日上午9:30:45
 */
public class PlmsLaOutvisiteIncome extends ActiveModel{
   
	private Long rpmntId;

    private String outVisit;
    
    private Long outVisitId;	//外访信息的Id


    public Long getRpmntId() {
        return rpmntId;
    }

    public void setRpmntId(Long rpmntId) {
        this.rpmntId = rpmntId;
    }

    public String getOutVisit() {
        return outVisit;
    }

    public void setOutVisit(String outVisit) {
        this.outVisit = outVisit == null ? null : outVisit.trim();
    }

	public Long getOutVisitId() {
		return outVisitId;
	}

	public void setOutVisitId(Long outVisitId) {
		this.outVisitId = outVisitId;
	}
    
    
}