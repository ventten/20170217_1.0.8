package com.ljwd.plms.web.controller.outVisit;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.shiro.authz.annotation.Logical;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;

import com.ljwd.plms.core.entity.JSONResult;
import com.ljwd.plms.core.feature.orm.mybatis.Page;
import com.ljwd.plms.core.util.ConfigUtil;
import com.ljwd.plms.core.util.D;
import com.ljwd.plms.core.util.JSONUtil;
import com.ljwd.plms.core.util.PageUtil;
import com.ljwd.plms.web.model.cust.PlmsClAddressInfo;
import com.ljwd.plms.web.model.cust.PlmsLnAnnex;
import com.ljwd.plms.web.model.cust.PlmsLnAnnexExample;
import com.ljwd.plms.web.model.cust.SysAdministrativeRegion;
import com.ljwd.plms.web.model.outVisit.PlmsOvmCancelType;
import com.ljwd.plms.web.model.outVisit.PlmsOvmOutVisitPlan;
import com.ljwd.plms.web.model.outVisit.PlmsOvmResultType;
import com.ljwd.plms.web.security.PermissionSign;
import com.ljwd.plms.web.security.SubjectUtil;
import com.ljwd.plms.web.service.cust.inf.PlmsClAddressInfoService;
import com.ljwd.plms.web.service.cust.inf.PlmsLnAnnexService;
import com.ljwd.plms.web.service.outVisit.inf.PlmsOvmOutVisitInfoService;
import com.ljwd.plms.web.service.outVisit.inf.PlmsOvmOutVisitPlanService;
import com.ljwd.plms.web.vo.DataTableParam;
import com.ljwd.plms.web.vo.SessionMsg;
import com.ljwd.plms.web.vo.outVisit.AllOutVisitDetailInfoResult;
import com.ljwd.plms.web.vo.outVisit.OutVisitPlanDetailResult;
import com.ljwd.plms.web.vo.outVisit.OutVisitPlanDto;
import com.ljwd.plms.web.wsdl.webservice.LoanServiceWSDL;
import com.ljwd.plms.web.wsdl.webservice.exception.ErrorInfoException_Exception;
import com.ljwd.plms.web.wsdl.webservice.service.CalculateSummaryReceivableParamDto;
import com.ljwd.plms.web.wsdl.webservice.service.SimulateCalculateSummaryReceivableResultDto;

@RequestMapping("/outVisitPlan")
@Controller
public class OutVisitPlanController {
	@Resource
	private PlmsOvmOutVisitInfoService plmsOvmOutVisitInfoService;
	@Resource
	private PlmsOvmOutVisitPlanService plmsOvmOutVisitPlanService;
	@Resource
	private PlmsClAddressInfoService addressInfoService;
	@Resource
    private PlmsLnAnnexService annexService;

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    private static List<String> fileType = new ArrayList<>();    //支持上传的格式
    static {
    	 //图片
        fileType.add(".JPEG");
        fileType.add(".TIFF");
        fileType.add(".RAW");
        fileType.add(".BMP");
        fileType.add(".GIF");
        fileType.add(".PNG");
        fileType.add(".JPG");
        //Word文档
        fileType.add(".DOC");
        fileType.add(".DOCX");
       /* //Excel
        fileType.add(".XLS");
        fileType.add(".XLSX");
        //PDF
        fileType.add(".PDF");
        //压缩文件
        fileType.add(".RAR");
        fileType.add(".ZIP");
        //音频文件
        fileType.add(".MP3");*/
    }

    
	/**
	* @Description: 查看外访计划详情
	* @param applId
	* @param infoId
	* @param model
	* @param request
	* @return String
	 */
	@RequestMapping("/outVisitDetail")
//	@RequiresPermissions(PermissionSign.)
	public String outVisitDetail(Long applId,Long infoId,Model model,HttpServletRequest request){
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("applId", applId);
		map.put("infoId", infoId);
		//客户信息
		OutVisitPlanDetailResult detail = plmsOvmOutVisitInfoService.selectOutVisitDetail(map);
        //调用微贷接口
		CalculateSummaryReceivableParamDto param = new CalculateSummaryReceivableParamDto();
        param.setContractNo(detail.getCntrctNo());
        param.setIdCardNo(detail.getIdCardNo());
        //正常结清
        param.setIsInAdvanceRepayment(false);
        param.setIsRenewLoanRepayment(false);
        param.setRepaymentDate(new Date());
        SimulateCalculateSummaryReceivableResultDto result = null;
        try {
            result = LoanServiceWSDL.getService().calculateSummaryReceivable(param);
        } catch (Exception e) {
            e.printStackTrace();
            logger.error("计算应收金额：" + e.getMessage());
        }

        if(result!=null){
    		//逾期应还金额
        	detail.setOverdueAmount(result.getReceivableSumaryAmount());
    		//已还期数
        	detail.setPaidPeriod(result.getCalculateClientInfoDto().getPaidPeriodNumber());
        	//当前逾期天数
        	detail.setOverdueDayNow(result.getOverdueDays()==null?null:result.getOverdueDays().longValue());
        	//贷款期数
        	detail.setPeriodNum(result.getCalculateClientInfoDto().getLoanPeriod());
        	//货款金额
        	detail.setLoanAmt(result.getCalculateClientInfoDto().getLoanAmount());
        }


		//外访计划
		List<PlmsOvmOutVisitPlan> outPlanList = plmsOvmOutVisitPlanService.searchByMap(map);
		//外访取消类型
		List<PlmsOvmCancelType> cancelTypeList = plmsOvmOutVisitPlanService.searchOutVisitPlanCancelType();
		//跟进结果列表
		List<PlmsOvmResultType> outResult_01 = plmsOvmOutVisitPlanService.searchOvmResultTypeByGroupId(1);
		List<PlmsOvmResultType> outResult_02 = plmsOvmOutVisitPlanService.searchOvmResultTypeByGroupId(2);

		model.addAttribute("applDetail", detail);
		model.addAttribute("outPlanList", outPlanList);
		model.addAttribute("cancelTypeList", cancelTypeList);
		model.addAttribute("applId", applId);
		model.addAttribute("infoId", infoId);
		model.addAttribute("outResult_01", outResult_01);
		model.addAttribute("outResult_02", outResult_02);
		return "/jsp/outVisit/myOutVisitDetail";
		
	}
	
	/**
	* @Description: 外访计划取消
	* @param planDto
	* @return JSONResult
	 */
	@RequestMapping("/cancelOutVisitPlan")
	@ResponseBody
	@RequiresPermissions(PermissionSign.MYOUTVISIT_CANCELOUTVISITPLAN)
	public JSONResult cancelOutVisitPlan(PlmsOvmOutVisitPlan planDto,HttpServletRequest request){
		if(planDto.getVisitCancelType()==null){
			return new JSONResult(false,"请选择外访计划取消类型！");
		}
		if(planDto.getVisitCancelResion()==null){
			return new JSONResult(false,"请填写取消外访计划的原因！");
		}
    	SessionMsg loginUser = SubjectUtil.getSession(request);
    	int i = plmsOvmOutVisitPlanService.cancelOutVisitPlan(planDto, loginUser);
    	if(i>0){
			return new JSONResult(true,"此外访计划取消成功！");

    	}else{
			return new JSONResult(false,"此外访计划取消失败！");
    	}
	}
	
	/**
	* @Description: 外访结果
	* @param id
	* @return JSONResult
	 */
	@RequestMapping("/searchOutVisitPlanResult")
	@ResponseBody
	@RequiresPermissions(PermissionSign.MYOUTVISIT_OUTVISITPLANRESULT)
	public Map<String,Object> searchOutVisitPlanResult(Long id){
		if(id==null){
			//return new JSONResult(true,"外访结果出错！");
			return null;
		}
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("planId", id);
        AllOutVisitDetailInfoResult outplanDetail = plmsOvmOutVisitPlanService.selectAllOutPlanInfoDetail(map);

		Map<String,Object> mapResult = new HashMap<String,Object>();
		mapResult.put("plan", outplanDetail);
		return mapResult;
		
	}
	
	/**
	* @Description: 保存外访结果
	* @param planDto
	* @return JSONResult
	 */
	@RequestMapping("/saveOutVisitResult")
	@ResponseBody
	@RequiresPermissions(PermissionSign.MYOUTVISIT_OUTVISITPLANRESULT)
	public JSONResult saveOutVisitResult(OutVisitPlanDto planDto,HttpServletRequest request){
		SessionMsg loginUser = SubjectUtil.getSession(request);
				if(loginUser==null){
			return new JSONResult(false,"请重新登录！");
		}
		if(planDto==null){
			return new JSONResult(false,"外访结果出错!");
		}
		if(planDto.getId()==null){
			return new JSONResult(false,"外访结果出错！");	
		}else{
			PlmsOvmOutVisitPlan plan = plmsOvmOutVisitPlanService.selectById(planDto.getId());
			if(plan.getSignStatus()==null||(!plan.getSignStatus().equals("Signned"))){
				return new JSONResult(false,"外访尚未结束，不能保存外访结果!");	
			}
		}
		
		plmsOvmOutVisitPlanService.saveOutVisitPlanResult(planDto,loginUser);

			
		return new JSONResult(true,"外访结果保存成功！");	
		
	}
	
	@RequestMapping("/addAddress")
	@ResponseBody
	@RequiresPermissions(PermissionSign.MYOUTVISIT_ADDOUTVISITPLANADDR)
	public JSONResult addAddress(PlmsClAddressInfo info){
        if(info == null || info.getClCustId() == null){
            return new JSONResult(false,"参数错误");
        }

        info.setIsActive("Y");
        info.setSrcCode("OUTVISIT");
        info.setRltnshp("12");
        String loginUser = SubjectUtil.getUserId();
        info.setCreatedBy(loginUser);
        info.setCreateTime(new Date());
        info.setUpdatedBy(loginUser);
        info.setUpdateTime(new Date());
        info.setRecVer(0L);
        info.setTagSeq(0L);
        //拼接地址
        //省
        String provinceName = findAddreNameById(info.getAddrProvinceId()).getRname();
        //市
        String cityName = findAddreNameById(info.getAddrCityId()).getRname();
        //区域
        String areaName = findAddreNameById(info.getAddrAreaId()).getRname();
        //长地址
        String addre = provinceName+cityName+areaName+info.getAddrDetails();
        info.setAddr(addre);

        int ret = addressInfoService.insert(info);
        if(ret < 1){
            return new JSONResult(false,"添加失败.");
        }
        return new JSONResult(true,"操作成功.");
	}
	
	
	 /**
	 * @Description: 查找属于此外访计划的附件
	 * @param example
	 * @return String
	  */
    @RequestMapping(value = "/searchMyOutVisitPlanAnnex",method = RequestMethod.POST)
    @ResponseBody
	@RequiresPermissions(PermissionSign.MYOUTVISIT_OUTVISITOPTIONS)
    public String searchMyOutVisitPlanAnnex(PlmsLnAnnexExample example){
        if(example.getParamData() == null || "".equals(example.getParamData()) || example.getClCustId() == null){
            return PageUtil.getPageJson(1, new Page<Object>()); //参数有误返回返回空数据
        }

        //分页条件
        DataTableParam dataTableParam = PageUtil.getDataTableParamByJsonParam(example.getParamData());
        //记录操作的次数
        int sEcho = dataTableParam.getsEcho();
        //每页记录数
        int pageSize = dataTableParam.getiDisplayLength();
        //页数
        int pageNo = dataTableParam.getiDisplayStart() / dataTableParam.getiDisplayLength() + 1;

        example.setIsDeleted("N");
        
        example.setOrderByClause("T.ID DESC");

        Page<PlmsLnAnnex> pageData = new Page<PlmsLnAnnex>(pageNo, pageSize);

        pageData = annexService.selectByExampleAndPage(pageData, example);

        return PageUtil.getPageJson_dataFormat(sEcho, pageData);
    }	
	
    
    
    @RequestMapping("/searchOutVisitPlan")
    @ResponseBody
    public String searchOutVisitPlan(Long infoId,Long applId){
    	Map<String,Object> map = new HashMap<String,Object>();
		map.put("applId", applId);
		map.put("infoId", infoId);
		//外访计划
	    List<PlmsOvmOutVisitPlan> outPlanList = plmsOvmOutVisitPlanService.searchByMap(map);
	    //客户信息
	  	OutVisitPlanDetailResult detail = plmsOvmOutVisitInfoService.selectOutVisitDetail(map);
	  	Map<String,Object> mapResult = new HashMap<String,Object>();
	  	mapResult.put("custDetail", detail);
	  	mapResult.put("outPlanList", outPlanList);
	    
	  	return JSONUtil.toJSONString(mapResult);
    	
    }
	
    /**
     * 添加附件和上传文件
     * */
    @RequestMapping(value = "/addOutVisitPlanAnnex",method = RequestMethod.POST)
    @ResponseBody
	@RequiresPermissions(PermissionSign.MYOUTVISIT_OUTVISITOPTIONS)
    public JSONResult addOutVisitPlanAnnex(PlmsLnAnnex info,HttpServletRequest request){
        if(info == null || info.getClCustId() == null){
            return new JSONResult(false,"参数错误");
        }
        if(info.getFileName() == null || "".equals(info.getFileName().trim())){
            return new JSONResult(false,"文件名不能为空");
        }
        //创建一个通用的文件解析器
        CommonsMultipartResolver multipartResolver = new CommonsMultipartResolver(request.getSession().getServletContext());

        String path = null;             //保存到数据库的路径
        String ext = null;              //文件扩展名
        String fileName = null;         //文件名称
        String pathUrl = null;          //文件路径

        //判断request是否有文件上传,即多文件请求
        if(multipartResolver.isMultipart(request)){
            MultipartHttpServletRequest multiRequest = (MultipartHttpServletRequest)request;              //转换成多部分request
            if(multiRequest.getMultiFileMap().size()==0){
                return new JSONResult(false,"请选择文件");
            }
            if(multiRequest.getMultiFileMap().size() > 1){
                return new JSONResult(false,"一次只能上传一个文件");
            }
            Iterator<String> iterator = multiRequest.getFileNames();                                      //取得request中的所有文件名
            pathUrl = ConfigUtil.getStringVal("file.picture.url") +File.separator+"outVisit"+File.separator+"annex"+ File.separator + info.getPlanCode();  //配置的文件保存路劲
            while(iterator.hasNext()){
                MultipartFile file = multiRequest.getFile(iterator.next());                               //取得上传文件
                if(file != null){
                    fileName = file.getOriginalFilename();                                                //取得当前上传文件的文件名称
                    //如果名称不为"",说明该文件存在,否则说明该文件不存在
                    if(fileName != null && !"".equals(fileName.trim())){
                        try {
                            ext = fileName.substring(fileName.lastIndexOf("."),fileName.length());
                            if(!fileType.contains(ext.toUpperCase())){
                                return new JSONResult(false,"不支持的文件格式");
                            }
                            fileName = new SimpleDateFormat("yyyyMMddHHmmssSSSS").format(new Date()) + ext;
                        }catch (Exception e){
                            return new JSONResult(false,"不支持的文件格式");
                        }
                        try {
                            File targetFile = new File(pathUrl,fileName);                  //重命名上传后的文件名
                            if(!targetFile.exists()){
                                targetFile.mkdirs();                                       //创建目录
                            }
                            file.transferTo(targetFile);                                   //保存文件
                        } catch (Exception e) {
                            e.printStackTrace();
                            logger.error("文件保存失败:" + D.parse(new Date(), D.PATTERN_SECONDS) + "-->" + e.getMessage());
                            return new JSONResult(false,"文件保存失败");
                        }
                        path = pathUrl + File.separator + fileName;                         //拼接路劲
                    }else {
                        return new JSONResult(false,"文件不存在");
                    }
                }
            }
        }else {
            return new JSONResult(false,"请选择文件");
        }

        String loginUser = SubjectUtil.getUserId();                                         //当前登录用户
        info.setPath(path.replaceAll("\\\\","\\\\\\\\"));                                   //将\替换成\\保存到数据库
        info.setFileName(info.getFileName() + ext);
        info.setUploadBy(loginUser);
        info.setCreatedBy(loginUser);
        info.setUpdatedBy(loginUser);
        info.setAnnexStyle("ANST002"); //非流水性附件
        info.setAnnexType("AN101");//外访附件
        info.setIsDeleted("N");
        
        int ret = annexService.insert(info);
        if(ret < 1){
            File targetFile = new File(pathUrl,fileName);
            targetFile.delete();                                                            //如果添加失败则删除文件
            logger.error("文件上传失败:" + D.parse(new Date(), D.PATTERN_SECONDS) + "外访计划编号为："+info.getPlanCode());
            return new JSONResult(false,"上传失败");
        }
        return new JSONResult(true,"上传成功");
    }

    /**
     * 下载文件
     * @param id 贷后附件记录ID
     * */
    @RequestMapping(value = "/download")
	@RequiresPermissions(value={PermissionSign.MYOUTVISIT_OUTVISITOPTIONS,PermissionSign.OUTVISITPLAN_OUTVISITOPTIONS},logical=Logical.OR)
    public void download(Long id,HttpServletResponse response,HttpServletRequest request) throws IOException, ErrorInfoException_Exception {
        if(id == null){
            return;
        }
        PlmsLnAnnex annex = annexService.selectById(id);    //根据ID查找
        if(annex == null){
            return;
        }
        String fileName = annex.getFileName();              //文件名称
        if(fileName != null && !"".equals(fileName.trim())){
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
        }

        //外访计划中的附件肯定不是从微贷导入的附件
        if(annex.getAnnexId() == null){
            String path = annex.getPath();                  //文件url
            InputStream inputStream = new FileInputStream(new File(path));
            response.setCharacterEncoding("utf-8");
            response.setContentType("multipart/form-data");
            response.setHeader("Content-disposition", String.format("attachment; filename=\"%s\"", fileName));//文件名外的双引号处理firefox的空格截断问题
            OutputStream outputStream = response.getOutputStream();
            byte[] b = new byte[2048];
            int length;
            while ((length = inputStream.read(b)) > 0) {
                outputStream.write(b,0,length);
            }
            outputStream.close();
            inputStream.close();
        }
    }


    /** 通过记录ID查询行政区域的名称
     * @param id 记录ID
     * @return
     */
    public SysAdministrativeRegion findAddreNameById(Long id){
        if(id == null){
            return null;
        }
        SysAdministrativeRegion sar = addressInfoService.findAddreNameById(id);
        return sar;
    }

}
