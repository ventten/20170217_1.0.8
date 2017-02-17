package com.ljwd.plms.web.vo.outVisit;


import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.springframework.format.annotation.DateTimeFormat;

import com.ljwd.plms.web.model.BaseExample;
import com.ljwd.plms.web.vo.DataTableParam;

public class OutVisitRouteParamDto extends BaseExample{

	@DateTimeFormat( pattern = "yyyy-MM-dd" )
	private Date outVisitDate; //外访时间
	private String outVisiterName; //外访员
	private String outVisiter; //外访员
	private String outVisitDateStr;
	
	
	 /**
     * 外访路线排序
     */
    private static Map<String,String> sortMap1 = new HashMap<String,String>();
    static {
        sortMap1.put("outVisitDate"," outVisitDate ");
        sortMap1.put("outVisiterName"," outVisiterName ");
    }
    
    public void setOrderByClause(DataTableParam param){
    		super.setOrderByClause(param,sortMap1);
    	 
    }
    
	
	
	public String getOutVisitDateStr() {
		if(outVisitDate!=null&&(!outVisitDate.equals(""))){
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			return  sdf.format(outVisitDate);
		}
		return outVisitDateStr;
	}
	public void setOutVisitDateStr(String outVisitDateStr) {
			this.outVisitDateStr = outVisitDateStr;	
	}
	
	
	public Date getOutVisitDate() {
		return outVisitDate;
	}
	public void setOutVisitDate(Date outVisitDate) {
		this.outVisitDate = outVisitDate;
	}
	public String getOutVisiterName() {
		return outVisiterName;
	}
	public void setOutVisiterName(String outVisiterName) {
        this.outVisiterName = (outVisiterName == null || "".equals(outVisiterName) || "".equals(outVisiterName.trim())) ? null : outVisiterName.trim();
	}
	public String getOutVisiter() {
		return outVisiter;
	}
	public void setOutVisiter(String outVisiter) {
		this.outVisiter = outVisiter;
	}
	
	
}
