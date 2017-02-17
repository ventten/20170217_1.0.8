package com.ljwd.plms.web.vo.outVisit;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import com.ljwd.plms.web.model.BaseExample;

public class OutVisitMapDisplayParamDto extends BaseExample{

	@DateTimeFormat( pattern = "yyyy-MM-dd" )
	private Date outVisitDate; //外访时间
	private String outVisiterName; //外访员
	private String outVisiter; //外访员
	private String outVisitDateStr;
	
	
	public String getOutVisitDateStr() {
		return outVisitDateStr;
	}
	public void setOutVisitDateStr(String outVisitDateStr) {	
			this.outVisitDateStr = outVisitDateStr;
	}
	public Date getOutVisitDate() {
		Date date = null;
		if(outVisitDateStr!=null&&(!outVisitDateStr.equals(""))){
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			try {
				date = sdf.parse(outVisitDateStr);
			} catch (ParseException e) {
				e.printStackTrace();
			}
		}
		
		
		return date;
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
