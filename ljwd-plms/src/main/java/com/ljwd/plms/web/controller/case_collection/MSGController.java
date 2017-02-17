package com.ljwd.plms.web.controller.case_collection;

import com.ljwd.plms.core.entity.JSONResult;
import com.ljwd.plms.web.model.case_collection.LRltnshpDto;
import com.ljwd.plms.web.model.case_collection.PlmsLaCollectionRecord;
import com.ljwd.plms.web.model.messageSystem.MesContact;
import com.ljwd.plms.web.model.messageSystem.MessageContent;
import com.ljwd.plms.web.model.messageSystem.SysMessageTempLate;
import com.ljwd.plms.web.model.type.LRltnshp;
import com.ljwd.plms.web.security.PermissionSign;
import com.ljwd.plms.web.security.SubjectUtil;
import com.ljwd.plms.web.service.case_collection.inf.PlmsLaCollectionRecordService;
import com.ljwd.plms.web.vo.SessionMsg;
import com.ljwd.plms.web.wsdl.webservice.service.ErrorInfoException_Exception;
import com.ljwd.plms.web.wsdl.webservice.LoanServiceWSDL;

import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

/**
 * 短信控制器
 * */
@Controller
@RequestMapping(value="/caseCollection")
public class MSGController {

    private Logger logger = LoggerFactory.getLogger(this.getClass());
    @Resource
    private PlmsLaCollectionRecordService collectionRecordService;

    /**
     * @Title: 短信发送模块查询模板类型
     * @Description: TODO(短信发送模块查询模板类型)
     * @return List<SysMessageTempLate> 返回类型
     */
    @RequestMapping(value="/findSuiTableTypeBySuiTableGroup",method = RequestMethod.POST)
    @ResponseBody
    @RequiresPermissions(PermissionSign.COLLECT_REC_SMS)
    public List<SysMessageTempLate> findSuiTableTypeBySuiTableGroup(HttpServletRequest request){
        List<SysMessageTempLate> list = collectionRecordService.selectSuiTableTypeBySuiTableGroup(request.getParameter("mesGroup")+"区间");
        return list;
    }
    /**
     * @Title: 联系人下拉信息查询
     * @param idCard 身份证号
     * @param rltnshp 与主贷人的关系标识符
     * @return List<SysMessageTempLate> 返回类型
     */
    @RequestMapping(value="/findContactsMes",method = RequestMethod.POST)
    @ResponseBody
    @RequiresPermissions(PermissionSign.COLLECT_REC_SMS)
    public List<MesContact> findContactsMes(String idCard,String rltnshp){
        List<MesContact> list = collectionRecordService.selectContactsMes(idCard,rltnshp);
        return list;
    }
    
    /**
     * @Title: 短信发送模块查询关系
     * @Description: 短信发送模块查询关系
     * @return List<LRltnshp> 返回类型
     */
    @RequestMapping(value="/findRelationDate",method = RequestMethod.POST)
    @ResponseBody
    @RequiresPermissions(PermissionSign.COLLECT_REC_SMS)
    public List<LRltnshpDto> findRelationDate(String idCard){
    	List<LRltnshpDto> rltnshpListMes = collectionRecordService.selectRelationMesData(idCard);
        return rltnshpListMes;
    }
    /**
     * @Title: 查询模板组别
     * @return List<LRltnshp> 返回类型
     */
    @RequestMapping(value="/findSuiTableGroupMes",method = RequestMethod.POST)
    @ResponseBody
    @RequiresPermissions(PermissionSign.COLLECT_REC_SMS)
    public List<SysMessageTempLate> findSuiTableGroupMes(){
    	//短信模板
        List<SysMessageTempLate> listsmt1 = collectionRecordService.selectSysMessageTempLateSuiTableGroup();
        //去掉“区间”二字
        for(SysMessageTempLate smt:listsmt1){
            String str = smt.getSuiTableGroup();
            smt.setSuiTableGroup(str.substring(0, str.length()-2));
        }
        return listsmt1;
    }
    /**
     * 查询联系人电话号码
     * @param idCard 主贷人身份证号
     * @param relCode 联系人关系标识符
     * @param conName 关系联系人姓名
     * @return
     */
    @RequestMapping(value="/findContentTel",method = RequestMethod.POST)
    @ResponseBody
    @RequiresPermissions(PermissionSign.COLLECT_REC_SMS)
    public List<MesContact> findContentTel(String rltnshp,String idCard,String conName){
    	List<MesContact> mesContact = collectionRecordService.selectContantByMore(rltnshp,idCard,conName);
    	return mesContact;
    }
    /**
     * @Title: 生成短信
     * @Description: TODO(生成短信)
     * @param request
     * @return String 返回生成的短信
     */
    @SuppressWarnings("unused")
    @RequestMapping(value="/createMess",method = RequestMethod.POST,produces = "application/json; charset=utf-8")
    @ResponseBody
    @RequiresPermissions(PermissionSign.COLLECT_REC_SMS)
    public JSONResult createMess(HttpServletRequest request){
        //贷款申请ID
        long applId =Long.parseLong(request.getParameter("applId"));
        //合同号
        String contractNo = request.getParameter("contractNo");
        //联系人
        String contactsMes = request.getParameter("contactsMes");
        //模板组别
        String suiTableGroupMes = request.getParameter("suiTableGroupMes")+"区间";
        //模板类型
        String suiTableTypeMes = request.getParameter("suiTableTypeMes");
        //催收日期
        String hanstenDateMes =request.getParameter("hanstenDateMes");
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

        //生成的短信字符串
        String messageStr = "";
        Date datea = null;
        XMLGregorianCalendar xmlDate = null;

        try {
            datea = sdf.parse(hanstenDateMes);
        } catch (ParseException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        GregorianCalendar cal = new GregorianCalendar();
        cal.setTime(datea);
        try {
            xmlDate = DatatypeFactory.newInstance().newXMLGregorianCalendar(cal);
        } catch (DatatypeConfigurationException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        //还款方式
        String refundMes =request.getParameter("refundMes");
        //联系电话
        String telMes = request.getParameter("telMes");
        //放款方式
        String paymentType = request.getParameter("paymentType");
        //通过放款方式名查询放款方式的code
        String paymentTypeCode = collectionRecordService.findCodeByPaymentType(paymentType);
        //赎回
        String redeem = request.getParameter("redeemStatus");
        if("".equals(redeem)){
        	redeem = null;
        }
        try {
            //messageStr = loanService.getMessageContent(applId, contactsMes, telMes, contractNo, xmlDate, suiTableGroupMes,refundMes, paymentTypeCode, redeem, suiTableTypeMes);
            messageStr = LoanServiceWSDL.getService().getMessageContent(applId, contactsMes, telMes, contractNo, xmlDate, suiTableGroupMes,refundMes, paymentTypeCode, redeem, suiTableTypeMes);
            //注：此处最揉捏是导致短信发送失败的原因是“suiTableGroupMes”，“redeem”两个参数的值不正确，特别是suiTableGroupMes，是用字符串去查询数据的，如果在贷后页面修改了字符串的显示，而在传值的地方没有补回来是查询不到数据的，就会导致短信生成失败
        } catch (Exception e) {
            e.printStackTrace();
            logger.error("生成短信信息失败！");
            if(messageStr == null || "".equals(messageStr)){
            	logger.error("调用短信生成接口数据失败！");
            }
            return new JSONResult(false,"生成短信信息失败！");
        }
        return new JSONResult(true,messageStr);
    }

    /**
     * 发送短信
     * @param content 短信内容
     * @param officeTel 联系电话
     * @param applyId 贷款ID
     * @param contact 联系人code
     */
    @RequestMapping(value="/sendMessage",method = RequestMethod.POST)
    @ResponseBody
    @RequiresPermissions(PermissionSign.COLLECT_REC_SMS)
    public JSONResult sendMessage(MessageContent messageContent,HttpServletRequest request){
    	if(messageContent == null || messageContent.getApplId() == null){
            return new JSONResult(false,"参数错误");
        }
    	try {
            LoanServiceWSDL.getService().sendMessageTemplateContent(messageContent.getApplId(), messageContent.getContactsMes(), messageContent.getMessagetext(), messageContent.getTelMes());
            Boolean bool = addCollectionRecordMSG(messageContent,request,"SUCCEED");
            if(bool == true){
            	return new JSONResult(true,"短信发送成功");
            }else{
            	return new JSONResult(false,"短信发送失败");
            }
    	} catch (ErrorInfoException_Exception e) {
			e.printStackTrace();
			logger.error("短信发送失败失败");
			addCollectionRecordMSG(messageContent,request,"FAILD");
			return new JSONResult(false,"短信发送失败");
		}
    }

    /**
     * 新增催记
     * */
    
    private Boolean addCollectionRecordMSG(MessageContent messageContent,HttpServletRequest request,String res){
        SessionMsg session = SubjectUtil.getSession(request);
        PlmsLaCollectionRecord collectionRecord = new PlmsLaCollectionRecord();
        collectionRecord.setApplId(messageContent.getApplId());
        collectionRecord.setRltn(messageContent.getRelationMes()); //关系
        collectionRecord.setContactor(messageContent.getCustNamaGo()); //联系人
        collectionRecord.setTel(messageContent.getTelMes()); //电话
        collectionRecord.setContent(messageContent.getMessagetext());  //内容
        collectionRecord.setCollectTime(messageContent.getHanstenDateMes()); //催收时间
        collectionRecord.setCollectMthd("MSG"); //催收类型
        collectionRecord.setFollowedBy(session.getUserName()); //跟进人
        collectionRecord.setResult(res); //发送结果 失败还是成功
        if("12".equals(messageContent.getRelationMes()) || "13".equals(messageContent.getRelationMes()) || "14".equals(messageContent.getRelationMes())){
        	collectionRecord.setStatus("SELF"); //跟进情况 --本人
        }else if("11".equals(messageContent.getRelationMes())){
        	collectionRecord.setStatus("SPOUSE"); //跟进情况 --配偶
        }else if("1".equals(messageContent.getRelationMes()) || "2".equals(messageContent.getRelationMes()) || "5".equals(messageContent.getRelationMes())){
        	collectionRecord.setStatus("DIRECTLY "); //跟进情况 --直属关系
        }else{
        	collectionRecord.setStatus("THIRD_PARTY "); //跟进情况 --第三方
        }
        
        //登录用户
        String loginUser = SubjectUtil.getUserId();
        collectionRecord.setCreatedBy("system");
        collectionRecord.setUpdatedBy(loginUser);
        try{
        	collectionRecordService.insert(collectionRecord);
        	return true;
        }catch(Exception e){
        	e.printStackTrace();
        	return false;
        }

        
    }

    /**
     * 字符串转日期类型参数
     * */
    @InitBinder
    public void initBinder(WebDataBinder webDataBinder) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        dateFormat.setLenient(false);
        webDataBinder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, true));
    }

}
