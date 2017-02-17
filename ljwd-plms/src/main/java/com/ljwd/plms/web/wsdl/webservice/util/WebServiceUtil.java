package com.ljwd.plms.web.wsdl.webservice.util;

import java.util.List;

import javax.annotation.Resource;
import javax.xml.datatype.XMLGregorianCalendar;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ljwd.plms.web.wsdl.webservice.service.CalculateSummaryReceivableParamDto;
import com.ljwd.plms.web.wsdl.webservice.service.Contact;
import com.ljwd.plms.web.wsdl.webservice.service.ErrorInfoException_Exception;
import com.ljwd.plms.web.wsdl.webservice.service.LoanService;
import com.ljwd.plms.web.wsdl.webservice.service.MicroLoanInterface;
import com.ljwd.plms.web.wsdl.webservice.service.SearchCustomerWeChatParamDto;
import com.ljwd.plms.web.wsdl.webservice.service.SearchCustomerWeChatResultDto;
import com.ljwd.plms.web.wsdl.webservice.service.SimulateCalculateSummaryReceivableResultDto;
/**
 * 
* @ClassName: WebServiceUtil 
* @Description: TODO(接口工具类) 
* @author zhengjizhao 
* @date 2016年9月18日 下午4:44:41 
*
 */
public class WebServiceUtil {
	/**
	 * 
	* @Title: findPoly 
	* @Description: TODO(聚信立查询通过的接口) 
	* @param @param lg
	* @param @return    设定文件 
	* @return List<Contact>    返回类型 
	* @throws
	 */
	public List<Contact> findPoly(Long lg){
		List<Contact> list = null;
		try{
			@SuppressWarnings("resource")
			BeanFactory factory = new ClassPathXmlApplicationContext("webservice-beans.xml");
			MicroLoanInterface mif = (MicroLoanInterface)factory.getBean("cxfClient");
			//list = mif.queryContact10((long)123882);
			list = mif.queryContact10(lg);
		}catch(Exception e){
			e.printStackTrace();
		}
		return list;
	}
	
	/**
	 * 
	* @Title: findReturnAmount 
	* @Description: TODO(查询应还金额，返回实体信息) 
	* @param @param sccp
	* @param @return    设定文件 
	* @return SearchCustomerWeChatResultDto    返回类型 
	* @throws
	 */
	/*public SimulateCalculateSummaryReceivableResultDto findReturnAmount(CalculateSummaryReceivableParamDto paramDto){
		@SuppressWarnings("resource")
		BeanFactory factory = new ClassPathXmlApplicationContext("webservice-beans.xml");
		SimulateCalculateSummaryReceivableResultDto scc = null;
        try {
            LoanService ls = (LoanService) factory.getBean("cxfClientLoanService");
            scc = ls.calculateSummaryReceivable(paramDto);
		} catch (ErrorInfoException_Exception e) {
			e.printStackTrace();
		}
		return scc;
	}*/
	/**
	 * 
	* @Title: findMessage 
	* @Description: TODO(生成短信的接口) 
	* @param @param applyId 贷款申请ID
	* @param @param contact 联系人--------
	* @param @param contactTel  联系电话-----------
	* @param @param contractNo  合同号
	* @param @param date 催收日期----------
	* @param @param group 模板组别------------
	* @param @param payType 还款方式----------
	* @param @param paymentType  放款类别（渠道）方式
	* @param @param redeem UNPAID, REPAID, REDEEMED 赎回
	* @param @param type  模板类型------------
	* @param @return    设定文件 
	* @return String    返回类型 
	* @throws
	 */
	 /*public String findMessage(long applyId,String contact,String contactTel,String contractNo,XMLGregorianCalendar date,String group,String payType, String paymentType,String redeem,String type){
		 @SuppressWarnings("resource")
		BeanFactory factory = new ClassPathXmlApplicationContext("webservice-beans.xml");
		 LoanService ls = (LoanService) factory.getBean("cxfClientLoanService");
		 String mess = null;
		try {
			mess = ls.getMessageContent(applyId,contact,contactTel,contractNo,date,group,payType,paymentType,redeem,type);
		} catch (ErrorInfoException_Exception e) {
			e.printStackTrace();
		}
		 return mess;
	 }*/
}
