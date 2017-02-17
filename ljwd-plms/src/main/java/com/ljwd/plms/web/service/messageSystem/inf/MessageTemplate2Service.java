package com.ljwd.plms.web.service.messageSystem.inf;

import java.util.Date;
/**
 * 
* @ClassName: MessageTemplate2Service 
* @Description: TODO(短信发送service接口) 
* @author zhengjizhao
* @date 2016年9月1日 上午10:05:52 
*
 */
public interface MessageTemplate2Service {
	/**
	 * 
	* @Title: GetMessageContent 
	* @Description: TODO(生成短信) 
	* @param @param group 模板组别
	* @param @param type 模板类型
	* @param @param contact 联系人
	* @param @param contactTel 联系人电话
	* @param @param date 催收日期
	* @param @param applyId 贷后管理ID
	* @param @param payType 支付方式
	* @param @param contractNo 联系人身份证号码
	* @param @param paymentType 
	* @param @param redeem
	* @param @return    设定文件 
	* @return String    返回类型 
	* @throws
	 */
	String GetMessageContent(String group,String type,String contact,String contactTel,Date date,long applyId,String payType,String contractNo,String paymentType,String redeem);
}
