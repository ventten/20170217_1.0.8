package com.ljwd.plms.web.model.cust;

import java.util.Date;

import com.ljwd.plms.web.wsdl.webservice.service.Contact;

/**
* @ClassName: ContactNew
* @Description: TODO(聚信立数据显示实体) 
* @author A18ccms a18ccms_gmail_com 
* @date 2016年8月24日 下午4:51:31 
 */
public class ContactNew extends Contact {

	private boolean phoneRepet;      //与通讯信息是否重复
	private Date recentlyDialDate;   //最近拨打时间
	private Date recentlyCallDate;   //最近通话时间

    public boolean isPhoneRepet() {
        return phoneRepet;
    }

    public void setPhoneRepet(boolean phoneRepet) {
        this.phoneRepet = phoneRepet;
    }

    public Date getRecentlyDialDate() {
        return recentlyDialDate;
    }

    public void setRecentlyDialDate(Date recentlyDialDate) {
        this.recentlyDialDate = recentlyDialDate;
    }

    public Date getRecentlyCallDate() {
        return recentlyCallDate;
    }

    public void setRecentlyCallDate(Date recentlyCallDate) {
        this.recentlyCallDate = recentlyCallDate;
    }

}
