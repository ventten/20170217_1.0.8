package com.ljwd.plms.web.service.messageSystem.inf;

import com.ljwd.plms.web.model.messageSystem.ApplicationInfo;
import com.ljwd.plms.web.wsdl.webservice.channelService.CustomerDto;
/**
 * 
* @ClassName: ApplicationInfoService 
* @Description: TODO(短信发送功能) 
* @author zhengjizhao 
* @date 2016年9月1日 下午2:42:43 
*
 */
public interface ApplicationInfoService {
	/**
	 * 
	* @Title: getApplicationInfoById 
	* @Description: TODO(贷款申请信息) 
	* @param @param applInfoId
	* @param @return    设定文件 
	* @return ApplicationInfo    返回类型 
	* @throws
	 */
	public abstract ApplicationInfo getApplicationInfoById(long applInfoId);
	/**
	 * 
	* @Title: getCustomerDtoByapplId 
	* @Description: TODO(通过贷款申请ID 查询贷款人信息) 
	* @param @param applId
	* @param @return    设定文件 
	* @return CustomerDto    返回类型 
	* @throws
	 */
	public abstract CustomerDto getCustomerDtoByapplId(long applId);
}
