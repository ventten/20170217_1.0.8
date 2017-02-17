package com.ljwd.plms.web.controller.correspondence;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.math.BigDecimal;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.UUID;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ljwd.plms.web.wsdl.webservice.LoanServiceWSDL;

import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSONObject;
import com.itextpdf.text.pdf.AcroFields;
import com.itextpdf.text.pdf.BaseFont;
import com.itextpdf.text.pdf.PdfReader;
import com.itextpdf.text.pdf.PdfStamper;
import com.ljwd.plms.core.util.D;
import com.ljwd.plms.core.util.FileUtil;
import com.ljwd.plms.core.util.exportPdf.MergerPdf;
import com.ljwd.plms.web.model.case_collection.LfRecivDtl;
import com.ljwd.plms.web.model.case_collection.PlmsLaCollectionRecord;
import com.ljwd.plms.web.model.correspondence.PlmsCorresSerialNo;
import com.ljwd.plms.web.model.correspondence.PlmsLnCorresLog;
import com.ljwd.plms.web.model.correspondence.PlmsDocumentGenLogDto;
import com.ljwd.plms.web.model.correspondence.PlmsLetterPrintDto;
import com.ljwd.plms.web.model.correspondence.PlmsOverdueClientLetterGenerateDto;
import com.ljwd.plms.web.model.correspondence.PlmsOverdueClientLetterGenerateParamDto;
import com.ljwd.plms.web.model.messageSystem.MessageContent;
import com.ljwd.plms.web.model.sys_management.PlmsPdfCorresInfoDto;
import com.ljwd.plms.web.security.PermissionSign;
import com.ljwd.plms.web.security.SubjectUtil;
import com.ljwd.plms.web.service.case_collection.inf.PlmsLaCollectionRecordService;
import com.ljwd.plms.web.service.correspondence.inf.CorrespondenceService;
import com.ljwd.plms.web.service.sys_management.inf.PlmsCorresManageService;
import com.ljwd.plms.web.vo.SessionMsg;
import com.ljwd.plms.web.vo.correspondence.ParaListEntry;
import com.ljwd.plms.web.vo.correspondence.PlmCoDig;
import com.ljwd.plms.web.vo.correspondence.PlmsCollectorInfo;
import com.ljwd.plms.web.vo.correspondence.PlmsDocumentGenLogTelDto;
import com.ljwd.plms.web.wsdl.webservice.service.CalculateSummaryReceivableParamDto;
import com.ljwd.plms.web.wsdl.webservice.service.ErrorInfoException_Exception;
import com.ljwd.plms.web.wsdl.webservice.service.LoanService;
import com.ljwd.plms.web.wsdl.webservice.service.ReceivableDetailDto;
import com.ljwd.plms.web.wsdl.webservice.service.ReceivableSearchResultDto;
import com.ljwd.plms.web.wsdl.webservice.service.SimulateCalculateSummaryReceivableResultDto;

/**
 * ClassName: CorrespondencePdfController
 * @Description: 信函管理 中pdf导出 控制器
 * @author zhengjizhao
 * @date 2016年10月19日下午4:34:44
 */
@Controller
@RequestMapping(value="/correspondenceTwo")
public class CorrespondencePdfController {
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	@Resource
    private CorrespondenceService correspondenceService;
	@Resource
	private PlmsCorresManageService plmsCorresManageService;
	@Resource
    private PlmsLaCollectionRecordService collectionRecordService;
	/**
	 * @Description: pdf导出
	 * @param request
	 * @param response
	 * @param  Exception   
	 * @author zhengjizhao
	 * @date 2016年10月19日下午4:34:38
	 */
	@RequestMapping(value = "/exportApplyForm",method = RequestMethod.POST)
	@RequiresPermissions(PermissionSign.CORRESPONDENCE_PDFOUT)
    @ResponseBody
    public void exportApplyForm(HttpServletRequest request,HttpServletResponse response,String contractNo,Long tmplid,String tmplCode,String tmplName) throws IOException, ErrorInfoException_Exception{  
		//当前登录用户
        SessionMsg session = SubjectUtil.getSession(request);
		// 获取应用的根路径
        String servletContextRealPath = "";
        // 获取模板文件地址
        PlmsPdfCorresInfoDto docINFO = plmsCorresManageService.selectCorresPdfDataById(tmplid);
        String templatePdfPath = docINFO.getFilePath();
        //获取模板所在文件夹
        String[] files =  templatePdfPath.split("/");
        for(int i=0;i<files.length-1;i++){
        	servletContextRealPath +=files[i]+File.separator;
        }
        servletContextRealPath +="temp";
        File fileget = new File(servletContextRealPath);
        if(!fileget.exists()){
        	fileget.mkdirs();
        }
        try {
            //把字符串参数转换为list数组格式
        	List<String> contractNoss = new ArrayList<String>();
        	//地址类型
        	List<ParaListEntry> paraList = new ArrayList<ParaListEntry>();
        	try{
        		String[] strcontractNoss = contractNo.split(",");
        		for(int i=0;i<strcontractNoss.length;i++){
        			String[] str = strcontractNoss[i].split("###");
        			ParaListEntry paraListEntry = new ParaListEntry();
        			if(str.length == 4){
    					paraListEntry.setClientName(str[0] == null?"":str[0]);
    					paraListEntry.setClientAddr(str[1] == null?"":str[1]);
    					contractNoss.add(str[2] == null?"":str[2]);
    					paraListEntry.setContractNo(str[2] == null?"":str[2]);
    					paraListEntry.setAddType(str[3] == null?"":str[3]);
    					paraList.add(paraListEntry);
        			}
        		}
        	}catch(Exception e){
        		e.printStackTrace();
        	}
            //通过合同号查询被选中的数据（这个查询是根据合同号查询出来的数据，其中包括一个合同号下的所有地址信息
            List<PlmsOverdueClientLetterGenerateDto> listSelect = correspondenceService.findSelectDataByContractNo(contractNoss);
            List<PlmsOverdueClientLetterGenerateDto> list = new ArrayList<PlmsOverdueClientLetterGenerateDto>();
            //选出被选择的数据（根据根据合同号，客户姓名，地址确认勾选的数据）注：因为“信函生成”的数据是由多表联查得到的数据，当勾选多个信函来生成PDF的时候，不能通过多个参数（多表联查得到的数据没有主键ID）查询出数据集合
            for(PlmsOverdueClientLetterGenerateDto pocg:listSelect){
            	for (ParaListEntry entry : paraList) {       
            	    String contractNo1 = entry.getContractNo(); //合同号
            	    String clientName1 = entry.getClientName(); //客户姓名
            	    String clientAddr1 = entry.getClientAddr(); //客户地址
            	    String addrType1 = entry.getAddType();      //地址类型
            	    if(contractNo1.equals(pocg.getContractNo()) && clientName1.equals(pocg.getClientName()) && clientAddr1.equals((pocg.getClientAddr()).replaceAll(" ", "").replaceAll("<", "(").replaceAll(">", ")")) && addrType1.equals(pocg.getAddrType())){
            	    	list.add(pocg);//此步骤不能少，因为查询sql里不可能同时存在多个查询条件 “in (条件集合)”
            	    }
            	    
            	}  
            }
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日");
           //存儲PDF地址路劲 
           List<String> pdfName = new ArrayList<>();
           //储存查询到金额后的数据
           List<PlmsOverdueClientLetterGenerateDto> listOut = new ArrayList<PlmsOverdueClientLetterGenerateDto>();
            //补全信息的金额
           for(int i=0;i<list.size();i++){
				PlmsOverdueClientLetterGenerateDto pcgd = fillOverdueClientLetterGenerateDto(list.get(i),request);
				//补全金额
				PlmsLetterPrintDto plmsLetterPrintDto = getLetterDataSource(pcgd);
				//通过合同号查询当前合同下被分派的催收员的姓和其办公电话，用来生成PDF中的 联系人 和办公电话 
				PlmsCollectorInfo collectoeInfo = new PlmsCollectorInfo();
	           if(session.getName() !=null){
	        	   collectoeInfo = correspondenceService.selectCollectorInfo(plmsLetterPrintDto.getContractNo());
	           }
				if(collectoeInfo !=null){
					if(collectoeInfo.getCollectorEmp() != null){
						plmsLetterPrintDto.setCollector(collectoeInfo.getCollectorEmp());
					}else{
						plmsLetterPrintDto.setCollector("");
					}
					plmsLetterPrintDto.setCollectPhone(collectoeInfo.getCollectorPhone());
				}
				   //读取模板
				   PdfReader reader = new PdfReader(templatePdfPath);  
	               ByteArrayOutputStream bos = new ByteArrayOutputStream();  
	               PdfStamper ps = new PdfStamper(reader, bos); 
	               /*使用中文字体  itext-asian.jar包读取*/
	               BaseFont bf = BaseFont.createFont("STSong-Light", "UniGB-UCS2-H", BaseFont.NOT_EMBEDDED);
	               ArrayList<BaseFont> fontList = new ArrayList<BaseFont>();   
	               fontList.add(bf);
	               Date date = new Date();
	               //模板对象
	               AcroFields acroFieldss = ps.getAcroFields();  
	               acroFieldss.setSubstitutionFonts(fontList); //字体
	               acroFieldss.setField("corresCode", plmsLetterPrintDto.getCorresCode()); //信函编号
	               acroFieldss.setField("contractNo", plmsLetterPrintDto.getContractNo()); //合同编号
	               acroFieldss.setField("clearAmt", plmsLetterPrintDto.getTtlAmtStr()); //逾期的合计金额
	               acroFieldss.setField("overdueFailCollectFee", plmsLetterPrintDto.getOverdueFailCollectFeeStr()); //逾期扣款失败费
	               acroFieldss.setField("clientName", plmsLetterPrintDto.getCustName()); //客户名称
	               acroFieldss.setField("brokerFeeAndOverdueInterest", plmsLetterPrintDto.getBrokerFeeAndIntStr()); //居间费 + 未还的利息
	               acroFieldss.setField("collector", plmsLetterPrintDto.getCollector()); //崔收专员
	               acroFieldss.setField("collectPhone", plmsLetterPrintDto.getCollectPhone()); //崔收电话
	               //acroFieldss.setField("repaymentDate", pcgd.getRepaymentDate().toString());
	               acroFieldss.setField("repayYear", plmsLetterPrintDto.getCutoffDateStr().substring(0, 4));
	               acroFieldss.setField("repayMon", plmsLetterPrintDto.getCutoffDateStr().substring(5, 7));
	               acroFieldss.setField("repayDay", plmsLetterPrintDto.getCutoffDateStr().substring(8,10));
	               acroFieldss.setField("genTime", sdf.format(date));
	               pcgd.setCreateDate(date);
	               acroFieldss.setField("clientName", plmsLetterPrintDto.getCustName());//客户名称
	               acroFieldss.setField("clientAddr", plmsLetterPrintDto.getLetterAddr()); //收信地址
	               acroFieldss.setField("overduePrincipal", plmsLetterPrintDto.getOverduePrincipalStr()); //逾期未还的本金
	               acroFieldss.setField("idCardNo", plmsLetterPrintDto.getIdCardNo()); //身份证号码
	               acroFieldss.setField("overdueDay", plmsLetterPrintDto.getOverdueDayStr()); //逾期天数
	               acroFieldss.setField("overduePenalty", plmsLetterPrintDto.getOverduePenaltyStr()); //逾期违约金
	               acroFieldss.setField("creaditFee",plmsLetterPrintDto.getCreaditQueryFee());  //划扣手续费
	               ps.setFormFlattening(true);  
	               ps.close();  
	               UUID randomUUID = UUID.randomUUID();
                   String attachmentName = randomUUID.toString();
                   String fileName = servletContextRealPath+File.separator+attachmentName + ".pdf";  
                   File file = new File(fileName);
	               FileOutputStream fos = new FileOutputStream(file);  
	               fos.write(bos.toByteArray());
	               fos.close(); 
	               pdfName.add(fileName);//存储PDF地址用以下载
	               listOut.add(pcgd);//储存查询到的金额数据
	               reader.close();
            }
           //判断生成的PDF是多个还是单个，如果是单个就直接导出，如果是多个就拼接成一条pdf文件后导出
           if(pdfName.size() == 1){
    		   listOut.get(0).setTmplCode(tmplCode);
    		   listOut.get(0).setTmplName(tmplName);
    		   PlmsDocumentGenLogDto plmsDocumentGenLogDto = getDocumentGenLogDto(listOut.get(0),request);
    		   //通过合同号查询当前合同下被分派的催收员的姓和其办公电话，用来生成PDF中的 联系人 和办公电话 
			   PlmsCollectorInfo collectoeInfo = new PlmsCollectorInfo();
   	           if(session.getName() !=null){
   	        	   collectoeInfo = correspondenceService.selectCollectorInfo(plmsDocumentGenLogDto.getContractNo());
   	           }
   	           //补全催收人信息
    		   if(collectoeInfo !=null){
	   				plmsDocumentGenLogDto.setCollector(collectoeInfo.getCollectorName());
	   				if(collectoeInfo.getCollectorEmp() != null){
        		   		plmsDocumentGenLogDto.setCollectorApell(collectoeInfo.getCollectorEmp());
    				}else{
    					plmsDocumentGenLogDto.setCollectorApell("");
    				}
	        		plmsDocumentGenLogDto.setCollectPhone(collectoeInfo.getCollectorPhone());
	        		plmsDocumentGenLogDto.setGender(collectoeInfo.getGender());
    		   }
               //通过主贷人名称和身份证号查询主贷人电话(主要是为了新增催记中的电话属性提供数据)
               PlmsDocumentGenLogTelDto clientPhone = correspondenceService.selectCorrTelImfomationById(plmsDocumentGenLogDto.getClientName(),plmsDocumentGenLogDto.getIdCardNo());
               if(clientPhone != null){
            	   plmsDocumentGenLogDto.setClientPhone(clientPhone.getTel());
               }
               //跟进人姓名（系统登录）
               plmsDocumentGenLogDto.setFollowedBy(session.getUserName());
               //在生成信函的时候新增“信函生成”记录，和案件管理中的“催记”和“信函记录”
               Boolean bool = correspondenceService.insertCorresData(plmsDocumentGenLogDto);
               //数据插入成功后才可以下载PDF文件
               if(bool == true){
            	   download(pdfName.get(0),tmplName,request,response);
               }
           }
           else if(pdfName.size() > 1){
        	   Boolean boolone = true;
        	   //pdf文件生成成功后保存金额基本信息
        	   for(int i=0;i<listOut.size();i++){
        		   listOut.get(i).setTmplCode(tmplCode);
        		   listOut.get(i).setTmplName(tmplName);
        		   PlmsDocumentGenLogDto plmsDocumentGenLogDto = getDocumentGenLogDto(listOut.get(i),request);
        		   //通过合同号查询当前合同下被分派的催收员的姓和其办公电话，用来生成PDF中的 联系人 和办公电话 
        		   PlmsCollectorInfo collectoeInfo = new PlmsCollectorInfo();
        		   if(session.getName() !=null){
        			   collectoeInfo = correspondenceService.selectCollectorInfo(plmsDocumentGenLogDto.getContractNo());
        		   }
        		   //补全催收人信息
        		   if(collectoeInfo !=null){
        			   plmsDocumentGenLogDto.setCollector(collectoeInfo.getCollectorName());
        			   if(collectoeInfo.getCollectorEmp() != null){
        				   plmsDocumentGenLogDto.setCollectorApell(collectoeInfo.getCollectorEmp());
        			   }else{
        				   plmsDocumentGenLogDto.setCollectorApell("");
        			   }
        			   plmsDocumentGenLogDto.setCollectPhone(collectoeInfo.getCollectorPhone());
        			   plmsDocumentGenLogDto.setGender(collectoeInfo.getGender());
        		   }
        		   //通过主贷人名称和身份证号查询主贷人电话(主要是为了新增催记中的电话属性提供数据)
        		   PlmsDocumentGenLogTelDto clientPhone = correspondenceService.selectCorrTelImfomationById(plmsDocumentGenLogDto.getClientName(),plmsDocumentGenLogDto.getIdCardNo());
        		   if(clientPhone != null){
        			   plmsDocumentGenLogDto.setClientPhone(clientPhone.getTel());
        		   }
        		   //跟进人姓名（系统登录）
        		   plmsDocumentGenLogDto.setFollowedBy(session.getUserName());
        		   //在生成信函的时候新增“信函生成”记录，和案件管理中的“催记”和“信函记录”
        		   Boolean boolt = correspondenceService.insertCorresData(plmsDocumentGenLogDto);
        		   if(boolt == false){
        			   boolone = boolt;
        		   }
        	   }
        	   if(boolone == true){
        		   //调用PDF拼接
        		   UUID randomUUID = UUID.randomUUID();
        		   String attachmentName = randomUUID.toString();
        		   String fileName = servletContextRealPath+File.separator+attachmentName + ".pdf";
        		   Boolean bool = MergerPdf.concatPDFs(pdfName, fileName, false);
        		   //合成成功才能下载
        		   if(bool == true){
        			   download(fileName,tmplName,request,response);
        		   }
        	   }

           }
        } catch (Exception e) {
            e.printStackTrace();
            logger.error("信函文件生成失败");
            throw new RuntimeException("信函文件生成失败");
        } 
    }
	/**
	 * @Description: 批量pdf导出
	 * @param  request
	 * @param  response
	 * @param  Exception   
	 * @author zhengjizhao
	 * @date 2016年12月01日下午4:34:38
	 */
	@RequestMapping(value = "/exportBatchApplyForm",method = RequestMethod.POST)
	@RequiresPermissions(PermissionSign.CORRESPONDENCE_PDFOUT)
    @ResponseBody
    public void exportBatchApplyForm(HttpServletRequest request,HttpServletResponse response,@RequestParam("parameter")String parameter,String contractNo,Long tmplid,String tmplCode,String tmplName) throws Exception {  
		//当前登录用户
        SessionMsg session = SubjectUtil.getSession(request);
		// 获取应用的根路径
        String servletContextRealPath = "";
        // 获取模板文件地址
        PlmsPdfCorresInfoDto docINFO = plmsCorresManageService.selectCorresPdfDataById(tmplid);
        String templatePdfPath = docINFO.getFilePath();
        //获取模板所在文件夹
        String[] files =  templatePdfPath.split("/");
        for(int i=0;i<files.length-1;i++){
        	servletContextRealPath +=files[i]+File.separator;
        }
        servletContextRealPath +="temp";
        File fileget = new File(servletContextRealPath);
        if(!fileget.exists()){
        	fileget.mkdirs();
        }
        DateFormat fmt =new SimpleDateFormat("yyyy-MM-dd");
        try {
        	PlmsOverdueClientLetterGenerateParamDto example = new PlmsOverdueClientLetterGenerateParamDto();
        	String[] paraArr = parameter.split("&");
        	for(int i=0;i<paraArr.length;i++){
        		String[]  paraArrs = paraArr[i].split("=");
        		if(paraArrs.length <= 1){
        			continue;
        		}
        		if(paraArrs[0].equals("siteCode")){	//所属城市
        			example.setSiteCode(paraArrs[1]);
        		}else if(paraArrs[0].equals("addrType")){		//地址类型
        			example.setAddrType(paraArrs[1]);
        		}else if(paraArrs[0].equals("contractNo")){		//合同编号
        			example.setContractNo(paraArrs[1]);
        		}else if(paraArrs[0].equals("loanName")){		//主贷人
        			example.setLoanName(paraArrs[1]);
        		}else if(paraArrs[0].equals("loanCardId")){		//身份证号
        			example.setLoanCardId(paraArrs[1]);
        		}else if(paraArrs[0].equals("repaymentFrom")){		//应还款日期1
        			Date date = fmt.parse(paraArrs[1]);
        			example.setRepaymentFrom(date);
        		}else if(paraArrs[0].equals("repaymentTo")){		//应还款日期2
        			Date date = fmt.parse(paraArrs[1]);
        			example.setRepaymentTo(date);
        		}else if(paraArrs[0].equals("overdueDayFrom")){		//逾期天数1
        			example.setOverdueDayFrom(Integer.parseInt(paraArrs[1]));
        		}else if(paraArrs[0].equals("overdueDayTo")){		//逾期天数2
        			example.setOverdueDayTo(Integer.parseInt(paraArrs[1]));
        		}
        	}
        	//查询条件下的所有要生成信函的数据
        	List<PlmsOverdueClientLetterGenerateDto> list = correspondenceService.selectByCorrespondenceList(example);
        	SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日");
        	
            //存儲PDF地址路劲 
            List<String> pdfName = new ArrayList<>();
            //储存查询到金额后的数据
            List<PlmsOverdueClientLetterGenerateDto> listOut = new ArrayList<PlmsOverdueClientLetterGenerateDto>();
             //补全信息的金额
            for(int i=0;i<list.size();i++){
 				PlmsOverdueClientLetterGenerateDto pcgd = fillOverdueClientLetterGenerateDto(list.get(i),request);
 				//补全金额
 				PlmsLetterPrintDto plmsLetterPrintDto = getLetterDataSource(pcgd);
 				//通过合同号查询当前合同下被分派的催收员的姓和其办公电话，用来生成PDF中的 联系人 和办公电话 
 				PlmsCollectorInfo collectoeInfo = new PlmsCollectorInfo();
 				if(session.getName() !=null){
 					collectoeInfo = correspondenceService.selectCollectorInfo(plmsLetterPrintDto.getContractNo());
 				}
 				if(collectoeInfo !=null){
 					if(collectoeInfo.getCollectorEmp() != null){
 						plmsLetterPrintDto.setCollector(collectoeInfo.getCollectorEmp());
 					}else{
 						plmsLetterPrintDto.setCollector("");
 					}
 					plmsLetterPrintDto.setCollectPhone(collectoeInfo.getCollectorPhone());
 				}
 				   //读取模板
 				   PdfReader reader = new PdfReader(templatePdfPath);  
 	               ByteArrayOutputStream bos = new ByteArrayOutputStream();  
 	               PdfStamper ps = new PdfStamper(reader, bos); 
 	               /*使用中文字体  itext-asian.jar包读取*/
 	               BaseFont bf = BaseFont.createFont("STSong-Light", "UniGB-UCS2-H", BaseFont.NOT_EMBEDDED);
 	               ArrayList<BaseFont> fontList = new ArrayList<BaseFont>();   
 	               fontList.add(bf);
 	               
 	               Date date = new Date();
 	               //模板对象
 	               AcroFields acroFieldss = ps.getAcroFields();  
 	               acroFieldss.setSubstitutionFonts(fontList); //字体
 	               acroFieldss.setField("corresCode", plmsLetterPrintDto.getCorresCode()); //信函编号
 	               acroFieldss.setField("contractNo", plmsLetterPrintDto.getContractNo()); //合同编号
 	               acroFieldss.setField("clearAmt", plmsLetterPrintDto.getTtlAmtStr()); //逾期的合计金额
 	               acroFieldss.setField("overdueFailCollectFee", plmsLetterPrintDto.getOverdueFailCollectFeeStr()); //逾期扣款失败费
 	               acroFieldss.setField("clientName", plmsLetterPrintDto.getCustName()); //客户名称
 	               acroFieldss.setField("brokerFeeAndOverdueInterest", plmsLetterPrintDto.getBrokerFeeAndIntStr()); //居间费 + 未还的利息
 	               acroFieldss.setField("collector", plmsLetterPrintDto.getCollector()); //崔收专员
 	               acroFieldss.setField("collectPhone", plmsLetterPrintDto.getCollectPhone()); //崔收电话
 	               //acroFieldss.setField("repaymentDate", pcgd.getRepaymentDate().toString());
 	               acroFieldss.setField("repayYear", plmsLetterPrintDto.getCutoffDateStr().substring(0, 4));
 	               acroFieldss.setField("repayMon", plmsLetterPrintDto.getCutoffDateStr().substring(5, 7));
 	               acroFieldss.setField("repayDay", plmsLetterPrintDto.getCutoffDateStr().substring(8,10));
 	               acroFieldss.setField("genTime", sdf.format(date));
 	               pcgd.setCreateDate(date);
 	               acroFieldss.setField("clientName", plmsLetterPrintDto.getCustName());//客户名称
 	               acroFieldss.setField("clientAddr", plmsLetterPrintDto.getLetterAddr()); //收信地址
 	               acroFieldss.setField("overduePrincipal", plmsLetterPrintDto.getOverduePrincipalStr()); //逾期未还的本金
 	               acroFieldss.setField("idCardNo", plmsLetterPrintDto.getIdCardNo()); //身份证号码
 	               acroFieldss.setField("overdueDay", plmsLetterPrintDto.getOverdueDayStr()); //逾期天数
 	               acroFieldss.setField("overduePenalty", plmsLetterPrintDto.getOverduePenaltyStr()); //逾期违约金
 	              acroFieldss.setField("creaditFee",plmsLetterPrintDto.getCreaditQueryFee());  //划扣手续费
 	               ps.setFormFlattening(true);  
 	               ps.close();  
 	               UUID randomUUID = UUID.randomUUID();
                   String attachmentName = randomUUID.toString();
                   String fileName = servletContextRealPath+File.separator+attachmentName + ".pdf";  
                   File file = new File(fileName);
 	               FileOutputStream fos = new FileOutputStream(file);  
 	               fos.write(bos.toByteArray());
 	               bos.close();
 	               fos.close(); 
 	               pdfName.add(fileName);//存储PDF地址用以下载
 	               listOut.add(pcgd);//储存查询到的金额数据
 	               reader.close();
             }
            
            //判断生成的PDF是多个还是单个，如果是单个就直接导出，如果是多个就拼接成一条pdf文件后导出
            if(pdfName.size() == 1){
            	listOut.get(0).setTmplCode(tmplCode);
            	listOut.get(0).setTmplName(tmplName);
            	PlmsDocumentGenLogDto plmsDocumentGenLogDto = getDocumentGenLogDto(listOut.get(0),request);
            	//通过合同号查询当前合同下被分派的催收员的姓和其办公电话，用来生成PDF中的 联系人 和办公电话 
            	PlmsCollectorInfo collectoeInfo = new PlmsCollectorInfo();
            	if(session.getName() !=null){
            		collectoeInfo = correspondenceService.selectCollectorInfo(plmsDocumentGenLogDto.getContractNo());
            	}
            	//补全催收人信息
            	if(collectoeInfo !=null){
            		plmsDocumentGenLogDto.setCollector(collectoeInfo.getCollectorName());
            		if(collectoeInfo.getCollectorEmp() != null){
            			plmsDocumentGenLogDto.setCollectorApell(collectoeInfo.getCollectorEmp());
            		}else{
            			plmsDocumentGenLogDto.setCollectorApell("");
            		}
            		plmsDocumentGenLogDto.setCollectPhone(collectoeInfo.getCollectorPhone());
            		plmsDocumentGenLogDto.setGender(collectoeInfo.getGender());
            	}
            	//通过主贷人名称和身份证号查询主贷人电话(主要是为了新增催记中的电话属性提供数据)
            	PlmsDocumentGenLogTelDto clientPhone = correspondenceService.selectCorrTelImfomationById(plmsDocumentGenLogDto.getClientName(),plmsDocumentGenLogDto.getIdCardNo());
            	if(clientPhone != null){
            		plmsDocumentGenLogDto.setClientPhone(clientPhone.getTel());
            	}
            	//跟进人姓名（系统登录）
            	plmsDocumentGenLogDto.setFollowedBy(session.getUserName());
            	//在生成信函的时候新增“信函生成”记录，和案件管理中的“催记”和“信函记录”
            	Boolean bool = correspondenceService.insertCorresData(plmsDocumentGenLogDto);
            	//数据插入成功后才可以下载PDF文件
            	if(bool == true){
            		download(pdfName.get(0),tmplName,request,response);
            	}
            }
            else if(pdfName.size() > 1){
            	Boolean boolone = true;
            	//pdf文件生成成功后保存金额基本信息
            	for(int i=0;i<listOut.size();i++){
            		listOut.get(i).setTmplCode(tmplCode);
            		listOut.get(i).setTmplName(tmplName);
            		PlmsDocumentGenLogDto plmsDocumentGenLogDto = getDocumentGenLogDto(listOut.get(i),request);
            		//通过合同号查询当前合同下被分派的催收员的姓和其办公电话，用来生成PDF中的 联系人 和办公电话 
            		PlmsCollectorInfo collectoeInfo = new PlmsCollectorInfo();
            		if(session.getName() !=null){
            			collectoeInfo = correspondenceService.selectCollectorInfo(plmsDocumentGenLogDto.getContractNo());
            		}
            		//补全催收人信息
            		if(collectoeInfo !=null){
            			plmsDocumentGenLogDto.setCollector(collectoeInfo.getCollectorName());
            			if(collectoeInfo.getCollectorEmp() != null){
            				plmsDocumentGenLogDto.setCollectorApell(collectoeInfo.getCollectorEmp());
            			}else{
            				plmsDocumentGenLogDto.setCollectorApell("");
            			}
            			plmsDocumentGenLogDto.setCollectPhone(collectoeInfo.getCollectorPhone());
            			plmsDocumentGenLogDto.setGender(collectoeInfo.getGender());
            		}
            		//通过主贷人名称和身份证号查询主贷人电话(主要是为了新增催记中的电话属性提供数据)
            		PlmsDocumentGenLogTelDto clientPhone = correspondenceService.selectCorrTelImfomationById(plmsDocumentGenLogDto.getClientName(),plmsDocumentGenLogDto.getIdCardNo());
            		if(clientPhone != null){
            			plmsDocumentGenLogDto.setClientPhone(clientPhone.getTel());
            		}
            		//跟进人姓名（系统登录）
            		plmsDocumentGenLogDto.setFollowedBy(session.getUserName());
            		//在生成信函的时候新增“信函生成”记录，和案件管理中的“催记”和“信函记录”
            		Boolean boolt = correspondenceService.insertCorresData(plmsDocumentGenLogDto);
            		if(boolt == false){
            			boolone = boolt;
            		}
            	}
            	if(boolone == true){
            		//调用PDF拼接
            		UUID randomUUID = UUID.randomUUID();
            		String attachmentName = randomUUID.toString();
            		String fileName = servletContextRealPath+File.separator+attachmentName + ".pdf";
            		Boolean bool = MergerPdf.concatPDFs(pdfName, fileName, false);
            		//合成成功才能下载
            		if(bool == true){
            			download(fileName,tmplName,request,response);
            		}
            	}
            }
        } catch (Exception e) {
            e.printStackTrace();
            logger.error("信函文件生成失败");
            throw new RuntimeException("信函文件生成失败");
        } 
    }
	/**
	 * @Description: 取得要插入信息的数据
	 * @param  letterDto 信函逾期数据查询实体
	 * @return LetterPrintDto   生成PDF模板时要在模板里替换的属性 实体
	 * @author zhengjizhao
	 * @date 2016年10月27日下午5:30:19
	 */
	private PlmsLetterPrintDto getLetterDataSource(PlmsOverdueClientLetterGenerateDto letterDto) {
		PlmsLetterPrintDto letterPrint = new PlmsLetterPrintDto();
		letterPrint.setCorresCode(letterDto.getCorresCode());
        letterPrint.setContractNo(letterDto.getContractNo());
        letterPrint.setCustName(letterDto.getClientName());
        letterPrint.setLetterAddr(letterDto.getClientAddr());
        letterPrint.setCollectPhone(letterDto.getCollectPhone());
        letterPrint.setCollector(letterDto.getCollector());
        letterPrint.setCutoffDateStr(D.parse(new Date(),D.CHINA_DATE_PATTEN));
        if (letterDto.getIdCardNo() != null) {
            StringBuffer sb = new StringBuffer(letterDto.getIdCardNo().substring(0, 8));
            sb.append("******");
            sb.append(letterDto.getIdCardNo().substring(14));
            letterPrint.setIdCardNo(sb.toString());
        }
        BigDecimal ttlAmt = BigDecimal.ZERO;
        ttlAmt = ttlAmt.add(letterDto.getOverdueBrokerFee()).add(letterDto.getOverdueFailCollectFee())
                .add(letterDto.getOverdueInterest()).add(letterDto.getOverduePenalty()).add(letterDto.getOverduePrincipal()).add(letterDto.getCreaditQueryFee());
        letterPrint.setTtlAmtStr(ttlAmt.toString());
        letterPrint.setOverdueBrokerFeeStr(letterDto.getOverdueBrokerFee().toString());
        letterPrint.setOverdueDayStr(letterDto.getOverdueDay().toString());
        letterPrint.setOverdueFailCollectFeeStr(letterDto.getOverdueFailCollectFee().toString());
        letterPrint.setOverdueIntStr(letterDto.getOverdueInterest().toString());
        letterPrint.setOverduePenaltyStr(letterDto.getOverduePenalty().toString());
        letterPrint.setOverduePrincipalStr(letterDto.getOverduePrincipal().toString());
        letterPrint.setBrokerFeeAndIntStr(letterDto.getOverdueBrokerFee().add(letterDto.getOverdueInterest()).toString());
        letterPrint.setClearAmtStr(letterDto.getClearAmt().toString());
        letterPrint.setCreaditQueryFee(letterDto.getCreaditQueryFee().toString());
        return letterPrint;
    }
	/**
	 * @Description: 信函模板生成后 取得要生成记录的数据 存入表中
	 * @param letterDto
	 * @param tmplCode
	 * @param tmplName
	 * @return PlmsDocumentGenLogDto  
	 * @author zhengjizhao
	 * @date 2016年10月27日下午6:10:04
	 */
	private PlmsDocumentGenLogDto getDocumentGenLogDto(PlmsOverdueClientLetterGenerateDto letterDto,HttpServletRequest request) {
        Date now = new Date();
        //当前登录用户
        SessionMsg session = SubjectUtil.getSession(request);
        PlmsDocumentGenLogDto logDto = new PlmsDocumentGenLogDto();
        logDto.setCorresCode(letterDto.getCorresCode());
        logDto.setDocumentCode(letterDto.getTmplCode());
        logDto.setDocumentName(letterDto.getTmplName());
        logDto.setGenTime(now);
        logDto.setGenBy(session.getName());
        logDto.setContractId(letterDto.getContractId());
        logDto.setCutoffDate(letterDto.getRepaymentDate());
        logDto.setPrincipal(letterDto.getOverduePrincipal());
        logDto.setInterest(letterDto.getOverdueInterest());
        logDto.setBrokerFee(letterDto.getOverdueBrokerFee());
        logDto.setOverdueInterest(letterDto.getOverduePenalty());
        logDto.setFailCollectFee(letterDto.getOverdueFailCollectFee());
        logDto.setCollectCost(BigDecimal.ZERO);
        BigDecimal ttlAmt = BigDecimal.ZERO;
        ttlAmt = ttlAmt.add(letterDto.getOverdueBrokerFee()).add(letterDto.getOverdueFailCollectFee())
                .add(letterDto.getOverdueInterest()).add(letterDto.getOverduePenalty()).add(letterDto.getOverduePrincipal()).add(letterDto.getCreaditQueryFee());
        logDto.setTotalAmount(ttlAmt);
        logDto.setOverdueDay(letterDto.getOverdueDay());
        logDto.setParameter("地址类别(&)" + letterDto.getAddrType() + "(&&)客户地址(&)" + letterDto.getClientAddr() + "(&&)结清金额(&)" + letterDto.getClearAmt().toString());
        logDto.setClearAmount(letterDto.getClearAmt()); //结算金额
        logDto.setRemark("");
        logDto.setGenByName(session.getUserName());
        logDto.setContractNo(letterDto.getContractNo());
        logDto.setClientName(letterDto.getClientName());
        logDto.setLoanName(letterDto.getClientName());
        logDto.setIdCardNo(letterDto.getIdCardNo());
        logDto.setAddrType(letterDto.getAddrType()); //地址类别
        logDto.setAddres(letterDto.getClientAddr()); //客户地址
        logDto.setApplyId(letterDto.getApplyId());
        logDto.setCreaditFee(letterDto.getCreaditQueryFee()); //划扣手续费
        return logDto;
    }

	/**
	 * @Description: 下载PDF文件
	 * @param  path PDF文件路径
	 * @param  request
	 * @param  response
	 * @param pdfName 生成信函后文件的名称
	 * @return Boolean   返回值，判断文件是否下载成功
	 * @author zhengjizhao
	 * @date 2016年10月27日下午2:45:36
	 */
	private Boolean download(String path,String pdfName, HttpServletRequest request,HttpServletResponse response) {
		SimpleDateFormat corrSdf = new SimpleDateFormat("yyyyMMdd");
		try {
			// path是指欲下载的文件的路径。
			// 以流的形式下载文件。
			InputStream fis = new BufferedInputStream(new FileInputStream(path));
			byte[] buffer = new byte[fis.available()];
			fis.read(buffer);
			fis.close();
			// 清空response
			response.reset();
			// 设置response的Header
			Date dateC = new Date();
			String fileName = pdfName+"_"+corrSdf.format(dateC)+"_"+getCorresSNo(PlmsCorresSerialNo.PAPER)+".PDF";
			 try{
	                String userAgent = request.getHeader("User-Agent");
	                //针对各浏览器文件中文名称乱码问题
	                if (userAgent.contains("MSIE") || userAgent.contains("Trident")) {
	                    //针对IE或者以IE为内核的浏览器
	                    fileName = java.net.URLEncoder.encode(fileName, "UTF-8");
	                } else {
	                    //非IE浏览器或者以IE为内核的处理
	                    fileName = new String(fileName.getBytes("UTF-8"),"ISO-8859-1");
	                }
	            }catch (Exception e){
	                e.printStackTrace();
	            }
		    response.setCharacterEncoding("utf-8");
            response.setContentType("multipart/form-data");
            response.setHeader("Content-disposition", String.format("attachment; filename=\"%s\"", fileName));//文件名外的双引号处理firefox的空格截断问题
			OutputStream toClient = new BufferedOutputStream(response.getOutputStream());
			toClient.write(buffer);
			toClient.flush();
			toClient.close();
			//删除文件
			FileUtil.deleteFile(path);
			return true;
		} catch (IOException ex) {
			ex.printStackTrace();
			return false;
		}finally{
			
		}
	}
	/**
	 * @Description: 计算应收金额
	 * @param  para
	 * @param  request
	 * @return PlmsOverdueClientLetterGenerateDto   信函逾期数据查询实体
	 * @author zhengjizhao
	 * @date 2016年12月29日下午3:32:44
	 */
	private PlmsOverdueClientLetterGenerateDto fillOverdueClientLetterGenerateDto(PlmsOverdueClientLetterGenerateDto para,HttpServletRequest request){
		CalculateSummaryReceivableParamDto paramDto = new CalculateSummaryReceivableParamDto();
        paramDto.setIdCardNo(para.getIdCardNo());
        paramDto.setRepaymentDate( new Date());
        paramDto.setIsInAdvanceRepayment(false);
        paramDto.setIsRenewLoanRepayment(false);
        paramDto.setContractNo(para.getContractNo());
        SimulateCalculateSummaryReceivableResultDto result = null;
        SimpleDateFormat corrSdf = new SimpleDateFormat("yyyyMMdd");
        try {
        	result = LoanServiceWSDL.getService().calculateSummaryReceivable(paramDto);
            BigDecimal principal = BigDecimal.ZERO; //本金
            BigDecimal penalty = BigDecimal.ZERO;  //逾期违约金
            BigDecimal interest = BigDecimal.ZERO;  //利息
            BigDecimal failCollectFee = BigDecimal.ZERO;  //扣款失败手续费
            BigDecimal brokerFee = BigDecimal.ZERO;  //居间费
            BigDecimal creaditFee = BigDecimal.ZERO;  //划扣手续费
            //计算每一期累计下来的费用
            for(ReceivableSearchResultDto receivable:result.getReceivableDtos()){
            	for(ReceivableDetailDto detail:receivable.getReceivableDetails()){
            		//代扣费
            		if((LfRecivDtl.FAIL_COLLECT_FEE).equals(detail.getLedgerTypeCode())){
            			if(detail.getRepaymentPostAmount() != null && !(BigDecimal.ZERO).equals(detail.getRepaymentPostAmount())){
            				failCollectFee = failCollectFee.add(detail.getRepaymentPostAmount());
            			}
            		//本金/保证金
                    } else if((LfRecivDtl.PRINCIPAL).equals(detail.getLedgerTypeCode())){
                    	if(detail.getRepaymentPostAmount() != null && !(BigDecimal.ZERO).equals(detail.getRepaymentPostAmount())){
                    		principal = principal.add(detail.getRepaymentPostAmount());
                    	}
                    //居间费
                    } else if((LfRecivDtl.BROKER_FEE).equals(detail.getLedgerTypeCode())){
                    	if(detail.getRepaymentPostAmount() != null && !(BigDecimal.ZERO).equals(detail.getRepaymentPostAmount())){
                    		brokerFee = brokerFee.add(detail.getRepaymentPostAmount());
                    	}
                    //逾期利息
                    } else if((LfRecivDtl.OVERDUE_INTEREST).equals(detail.getLedgerTypeCode())){
                    	if(detail.getRepaymentPostAmount() != null && !(BigDecimal.ZERO).equals(detail.getRepaymentPostAmount())){
                    		penalty = penalty.add(detail.getRepaymentPostAmount());
                    	}
                    //利息
                    } else if((LfRecivDtl.INTEREST).equals(detail.getLedgerTypeCode())){
                    	if(detail.getRepaymentPostAmount() != null && !(BigDecimal.ZERO).equals(detail.getRepaymentPostAmount())){
                    		interest = interest.add(detail.getRepaymentPostAmount());
                    	}
                    //划扣手续费
                    }else if((LfRecivDtl.CREDIT_QUERY_FEE).equals(detail.getLedgerTypeCode())){
                    	if(detail.getRepaymentPostAmount() != null && !(BigDecimal.ZERO).equals(detail.getRepaymentPostAmount())){
                    		creaditFee = creaditFee.add(detail.getRepaymentPostAmount());
                    	}
                    }
            	}
            }
            //生成信函编号
  		   	Date dateC = new Date();
            para.setCorresCode("YQ_XH_"+corrSdf.format(dateC)+"_"+getCorresSNo(PlmsCorresSerialNo.RECORD));
            para.setOverdueBrokerFee(brokerFee);
            para.setOverdueFailCollectFee(failCollectFee);
            para.setOverdueInterest(interest);
            para.setOverduePenalty(penalty);
            para.setOverduePrincipal(principal);
            para.setCreaditQueryFee(creaditFee);
            para.setClearAmt(result.getCalculateClientInfoDto().getReceivableSumaryAmount());//应还金额，所有金额的综合（等于上面六个金额的总和）
            return para;
        } catch (Exception e) {
            e.printStackTrace();
            logger.error("计算应收金额：" + e.getMessage());
            return null;
        }
	}
	/**
	 * 
	 * @Description: 得到信函编号
	 * @param  para 区分得到哪一种流水号的参数（流水号来源 RECORD生成信函记录  PAPER生成信函文件）
	 * @return String  
	 * @author zhengjizhao
	 * @date 2016年12月23日下午1:52:31
	 */
	private synchronized  String getCorresSNo(String para){
		String reNo = "";
		try{
			PlmCoDig plmCoDig = correspondenceService.selectCorresSNo(para);
			//如果是同一天
			if(isSameDate(plmCoDig.getNowTime(),new Date())){
				//如果是生成记录
				if((PlmsCorresSerialNo.RECORD).equals(para)){
					//如果值小于9999
					if(plmCoDig.getCountNo() < 9999){
						plmCoDig.setCountNo(plmCoDig.getCountNo()+1);
						correspondenceService.updateCorresSNo(plmCoDig.getCountNo(),null,para);
					}else{
						plmCoDig.setCountNo(1);
						correspondenceService.updateCorresSNo(1,null,para);
					}
				//如果是生成文件名
				}else{
					//如果值小于999
					if(plmCoDig.getCountNo() < 999){
						plmCoDig.setCountNo(plmCoDig.getCountNo()+1);
						correspondenceService.updateCorresSNo(plmCoDig.getCountNo(),null,para);
					}else{
						plmCoDig.setCountNo(1);
						correspondenceService.updateCorresSNo(1,null,para);
					}
				}
			}
			//如果不是同一天,刷新时间并重新计算流水号
			else{
				plmCoDig.setNowTime(new Date());
				plmCoDig.setCountNo(1);
				correspondenceService.updateCorresSNo(plmCoDig.getCountNo(),plmCoDig.getNowTime(),para);
			}
			//如果是生成记录
			if((PlmsCorresSerialNo.RECORD).equals(para)){
				if(plmCoDig.getCountNo()<10){
					reNo = "000"+plmCoDig.getCountNo();
				}else if(plmCoDig.getCountNo() >=10 && plmCoDig.getCountNo()<100){
					reNo = "00"+plmCoDig.getCountNo();
				}else if(plmCoDig.getCountNo() >=100 && plmCoDig.getCountNo()<1000){
					reNo = "0"+plmCoDig.getCountNo();
				}
			}else{
				if(plmCoDig.getCountNo()<10){
					reNo = "00"+plmCoDig.getCountNo();
				}else if(plmCoDig.getCountNo() >=10 && plmCoDig.getCountNo()<100){
					reNo = "0"+plmCoDig.getCountNo();
				}
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		 return reNo;
	}
	/**
	 * 
	 * @Description: 判断两个日期的年月日是否相等
	 * @param  date1 时间1
	 * @param  date2 时间2
	 * @return boolean   返回状态 true or false 
	 * @author zhengjizhao
	 * @date 2016年12月20日下午3:00:48
	 */
	private static boolean isSameDate(Date date1, Date date2) {
       Calendar cal1 = Calendar.getInstance();
       cal1.setTime(date1);
       Calendar cal2 = Calendar.getInstance();
       cal2.setTime(date2);
       boolean isSameYear = cal1.get(Calendar.YEAR) == cal2.get(Calendar.YEAR);
       boolean isSameMonth = isSameYear && cal1.get(Calendar.MONTH) == cal2.get(Calendar.MONTH);
       boolean isSameDate = isSameMonth && cal1.get(Calendar.DAY_OF_MONTH) == cal2.get(Calendar.DAY_OF_MONTH);
       return isSameDate;
	}
}
