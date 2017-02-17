package com.ljwd.plms.web.service.messageSystem.impl;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import com.ljwd.plms.web.model.messageSystem.ApplicationInfo;
import com.ljwd.plms.web.model.messageSystem.CalculateSummaryReceivableParamMyDto;
import com.ljwd.plms.web.model.messageSystem.Customer;
import com.ljwd.plms.web.model.messageSystem.Employee;
import com.ljwd.plms.web.model.messageSystem.SimulateCalculateSummaryReceivableResultDto;
import com.ljwd.plms.web.model.messageSystem.UserSearchResultDto;
import com.ljwd.plms.web.model.messageSystem.UserSearchResultItemDto;
import com.ljwd.plms.web.security.SubjectUtil;
import com.ljwd.plms.web.service.case_collection.inf.PlmsLaCollectionRecordService;
import com.ljwd.plms.web.service.messageSystem.inf.ApplicationInfoService;
import com.ljwd.plms.web.service.messageSystem.inf.MessageTemplate2Service;
import com.ljwd.plms.web.wsdl.webservice.channelService.CustomerDto;

public class MessageTemplateService2Impl implements MessageTemplate2Service{


	@Resource
    private ApplicationInfoService applicationInfoService;
	@Resource
    private SubjectUtil subjectUtil;
	@Resource
    private PlmsLaCollectionRecordService collectionRecordService;
	@Override
	public String GetMessageContent(String group, String type, String contact,
			String contactTel, Date date1, long applyId, String payType,
			String contractNo, String paymentType, String redeem) {
		{
	        String name="";
	        String date="";
	        String surnames="";
	        BigDecimal money;
	        String tel="";
	        String result="";
	        String idCard="";
	        //贷款申请信息
	        ApplicationInfo applicationInfoModel = this.applicationInfoService.getApplicationInfoById(applyId);
	        //客户信息
	        CustomerDto cust = this.applicationInfoService.getCustomerDtoByapplId(applyId);
	        if (!"配".equals(type.subSequence(0, 1))) {
	        	//判断性别
	            if (cust != null) {
	                if ("MALE".equals(cust.getGender())) {
	                    name = (cust.getCustomerName()) + "先生";
	                } else if ("FEMALE".equals(cust.getGender())) {
	                    name = (cust.getCustomerName()) + "女士";
	                } else{
	                    name = cust.getCustomerName();
	                }
	            }
	        } else if ("配".equals(type.subSequence(0, 1))) {
	            if (cust != null) {
	                if ("MALE".equals(cust.getGender())) {
	                    if ("null".equals(cust.getSpouseName())) {
	                        name = "女士";
	                    } else {
	                        name = (cust.getSpouseName()) + "女士";
	                    }
	                } else if ("FEMALE".equals(cust.getGender())) {
	                    if ("null".equals(cust.getSpouseName())) {
	                        name = "先生";
	                    } else {
	                        name = (cust.getSpouseName()) + "先生";
	                    }
	                } else{
	                    name = cust.getCustomerName();
	                }
	            }
	        }
	        //身份证号
	        idCard = cust.getIdCardNo().substring(0, 7);
	        for(int i = 1;i <= cust.getIdCardNo().length() - 10;i++)
	        {
	            idCard += "*";
	        }
	        idCard += cust.getIdCardNo().substring(cust.getIdCardNo().length() -3);
	        String userId = subjectUtil.getUserId();
	        List<UserSearchResultItemDto> records=collectionRecordService.selectListUserSearchResultItemDto(userId);
	        for(UserSearchResultItemDto user:records){
	            if(userId.equals(user.getUserId())){
	                Employee emp = collectionRecordService.findEmployeeOne(user.getEmployeeId());
	                if(emp.getOfficeTelephone() != null){
	                    tel = emp.getOfficeTelephone();
	                 }
	               if(emp.getRemark()!=null){
	                   surnames = emp.getRemark();
	               }
	            }
	        }
	        
	       if(date1!=null){
	        SimpleDateFormat sdf =   new SimpleDateFormat( " yyyy年MM月dd日 " );
	        date = sdf.format(date1);
	        }   
	       
	        CalculateSummaryReceivableParamMyDto paramDto=new CalculateSummaryReceivableParamMyDto();
	        paramDto.setContractNo(contractNo);
	        paramDto.setIdCardNo(cust.getIdCardNo());
	        paramDto.setRepaymentDate(date1);
	        if("INADVANCE".equals(payType)){
	        paramDto.setIsInAdvanceRepayment(Boolean.TRUE);
	        paramDto.setIsRenewLoanRepayment(Boolean.FALSE);
	        //paramDto.setRenewLoanPenaltyRate(money);
	        }else{
	        paramDto.setIsInAdvanceRepayment(Boolean.FALSE);
	        paramDto.setIsRenewLoanRepayment(Boolean.FALSE);
	        }
	        SimulateCalculateSummaryReceivableResultDto   resultDto = collectionRecordService.simulateCalculateSummaryReceivable(paramDto , true);
	        money = resultDto.getReceivableSumaryAmount();
	        try{        
	        //result = messageTemplateRepo.GetMessageContent(group,type);
	        }catch(Exception e){/*
	            try {
	                throw new Exception("有相同的模板类型");
	            } catch (Exception ex) {
	                Logger.getLogger(MessageTemplateService2Impl.class.getName()).log(Level.SEVERE, null, ex);
	            }

	        */}
	          
	        if(result.contains("[name]")){
	            result=result.replace("[name]", name);
	        }
	        if(result.contains("[idCard]")){
	            result=result.replace("[idCard]", idCard);
	        }
	        if(result.contains("[money]")){
	            result=result.replace("[money]", money.toString());
	        }
	        if(result.contains("[date]")){
	            result=result.replace("[date]", date.toString());
	        }
	        if(result.contains("[surnames]")){
	            result=result.replace("[surnames]", surnames);
	        }
	        if(result.contains("[tel]")){
	            result=result.replace("[tel]", tel);
	        }
	        if(result.contains("[day]")){
	            result=result.replace("[day]", resultDto.getCalculateClientInfoDto().getOverdueDays().toString());
	            
	        }
	         if(result.contains("[companyName]")){/*
	             String accountName = "";
	       
	           if("14".equals(paymentType)&&!"REDEEMED".equals(redeem))
	               {
	                 SystemParameter systemPara = param.findOne("COMPANYNAME1");
	                if(systemPara!=null){
	                     accountName = systemPara.getParameterValue();
	                     
	                }
	               
	            }else{
	                 SystemParameter systemPara2 = param.findOne("COMPANYNAME2");
	                if(systemPara2!=null){
	                     accountName=systemPara2.getParameterValue();
	                     
	                }     
	            }
	            result=result.replace("[companyName]", accountName);
	            
	        */}
	         if(result.contains("[bankAcount]")){/*
	             
	            
	            String accountValue = "";
	            if("14".equals(paymentType)&&!"REDEEMED".equals(redeem))
	               {
	                 SystemParameter systemPara = param.findOne("BANKACOUNT1");
	                if(systemPara!=null){
	                     
	                     accountValue=systemPara.getParameterValue();
	                }
	               
	            }else{
	                 SystemParameter systemPara2 = param.findOne("BANKACOUNT2");
	                if(systemPara2!=null){
	                 
	                     accountValue=systemPara2.getParameterValue();
	                }     
	            }
	             
	            
	            
	            result=result.replace("[bankAcount]", accountValue);
	            
	        */}
	        if(result.contains("[openBank]")){/*
	        String parameterDescription = "";
	            if("14".equals(paymentType)&&!"REDEEMED".equals(redeem))
	               {
	                 SystemParameter systemPara = param.findOne("OPENBANK1");
	                if(systemPara!=null){
	                     
	                     parameterDescription=systemPara.getParameterValue();
	                }
	               
	            }else{
	                 SystemParameter systemPara2 = param.findOne("OPENBANK2");
	                if(systemPara2!=null){
	                 
	                     parameterDescription=systemPara2.getParameterValue();
	                }     
	            }
	             result=result.replace("[openBank]", parameterDescription);
	        */}
	       
	        
	        
	        
	        return result;
	}
	}

}
