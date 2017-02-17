package com.ljwd.plms.web.controller.case_collection;

import com.alibaba.druid.util.StringUtils;
import com.alibaba.fastjson.JSONObject;
import com.ljwd.plms.core.entity.JSONResult;
import com.ljwd.plms.core.feature.orm.mybatis.Page;
import com.ljwd.plms.core.util.*;
import com.ljwd.plms.web.controller.BaseController;
import com.ljwd.plms.web.model.case_collection.PlmsLnSurveyCall;
import com.ljwd.plms.web.model.case_collection.PlmsLnSurveyCallExample;
import com.ljwd.plms.web.security.PermissionSign;
import com.ljwd.plms.web.security.SubjectUtil;
import com.ljwd.plms.web.service.case_collection.inf.PlmsLnSurveyCallService;
import com.ljwd.plms.web.service.sys_management.inf.SysUserService;
import com.ljwd.plms.web.vo.DataTableParam;
import com.ljwd.plms.web.vo.SessionMsg;
import com.ljwd.plms.web.vo.case_collection.SurveyCallPageDto;
import com.ljwd.plms.web.vo.case_collection.SurveyCallPageExample;
import com.ljwd.plms.web.vo.sys_management.SysUserExtention;
import org.apache.commons.io.IOUtils;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * 通话记录控制器
 */
@Controller
@RequestMapping("/surveyCall")
public class SurveyCallController extends BaseController{

	private Logger logger = LoggerFactory.getLogger(getClass());

    @Resource
    private SysUserService sysUserService;
    @Resource
    private PlmsLnSurveyCallService plmsLnSurveyCallService;

    /**
     * 呼叫记录页
     * @param contractNo 合同编号
     * */
    @RequestMapping(value = "/surveyCallIndex")
    @RequiresPermissions(PermissionSign.COLLECT_REC_CALL)
    public String surveyCallIndex(String contractNo,Model model){
        model.addAttribute("contractNo",contractNo);
        return "/jsp/case_collection/surveyCallIndex";
    }

    /**
     * 呼叫记录数据
     * */
    @RequestMapping(value = "/pageSurveyCallData",method = RequestMethod.POST)
    @ResponseBody
    @RequiresPermissions(PermissionSign.COLLECT_REC_CALL)
    public String pageSurveyCallData(SurveyCallPageExample example){
        if(example.getParamData() == null || "".equals(example.getParamData())){
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

        if(example.getCreateTimeMin() == null && example.getCreateTimeMax() == null){
            //没输入时间查询,默认查31天内的通话记录
            example.setMaxDays(31);
        }

        example.setOrderByClause("T.createTime DESC");

        Page<SurveyCallPageDto> pageData = new Page<SurveyCallPageDto>(pageNo, pageSize);

        pageData = plmsLnSurveyCallService.selectByExampleAndPage(pageData, example);

        return PageUtil.getPageJson(sEcho, pageData);
    }

    /**
     * 呼叫客户电话
     * @param applId 借款申请ID
     * @param cntrctNo 合同编号
     * @param custName 主贷人姓名
     * @param idCardNo 主贷人身份证
     * @param dest 手机或固话
     * @param rltnshp 被呼叫人和主贷人关系
     * @param callBy 被呼叫人
     * @param deptype 部门
     * @param phoneSource 被呼叫号码来源:1-联系人资料,2-聚信立
     */
    @RequestMapping("/callUp")
    @ResponseBody
    public JSONResult callUp(Long applId,String cntrctNo,String custName,String idCardNo,String dest,String rltnshp,String callBy,String deptype,Integer phoneSource,
                             HttpServletRequest request,HttpServletResponse response) {
        try {
            if (StringUtil.isEmpty(dest)) {
                return new JSONResult(false,"号码不能为空");
            }

            //去掉固话的分机号
            String destNo = dest;
            String[] destArr = dest.split("-");
            if(destArr.length == 2){
                if(destArr[0].length() >= 7){
                    destNo = destArr[0];
                }
            }else if (destArr.length >= 3){
                destNo = destArr[0] + "-" + destArr[1];
            }

            //当前登录催收员
            SessionMsg session = SubjectUtil.getSession(request);
            //催收员分机
            SysUserExtention userExtention = sysUserService.selectUserExtentionByUserId(session.getName());
            if(userExtention == null){
                return new JSONResult(false,"您当前没有配置分机");
            }
            String ext = userExtention.getExtention();  //催收员分机号
            if(StringUtils.isEmpty(ext)){
                return new JSONResult(false,"您的分机号暂未配置");
            }

            String area = userExtention.getAreaCode();  //催收员电话区号
            if (StringUtils.isEmpty(area)) {
                return new JSONResult(false,"您的分机号暂未配置区号");
            }

            //前缀
            String prefix = userExtention.getPrefix();
            if (StringUtil.isEmpty(prefix) || "111".equals(prefix)){
                return new JSONResult(false,"您的分机号暂未配置呼叫前缀");
            }

            String areaTemp = area + "-";
            int index = destNo.indexOf(areaTemp);
            destNo = index == -1 ? destNo : destNo.substring(areaTemp.length(),destNo.length());
            destNo = prefix + destNo;

            PlmsLnSurveyCall surveyCall = new PlmsLnSurveyCall();
            surveyCall.setApplyId(applId);                      //借款ID
            surveyCall.setContractno(cntrctNo);                 //合同编号
            surveyCall.setLoanname(custName);                   //主贷人
            surveyCall.setIdcard(idCardNo);                     //身份证号
            surveyCall.setDeptype(deptype);                     //部门
            surveyCall.setPhone(dest);                          //号码
            if(StringUtil.isEmpty(rltnshp) || "null".equals(rltnshp)){
                rltnshp = null;
            }
            surveyCall.setRelation(rltnshp);                    //关系
            surveyCall.setCallBy(callBy);                       //被呼叫人
            surveyCall.setCallFrom(ext);                        //分机号
            surveyCall.setCallType("1");                        //呼出
            surveyCall.setPhoneSource(phoneSource);             //被呼叫号码来源:1-联系人资料,2-聚信立
            surveyCall.setCreatusername(session.getUserName());
            surveyCall.setCreatedBy(session.getName());
            surveyCall.setUpdatedBy(session.getName());
            Long surveyCallId = plmsLnSurveyCallService.insertSurveyCall(surveyCall);

            Map<String, Object> params = new HashMap<>();
//            params.put("Reverse", true);      //true:先呼叫用户,接通后呼叫分机
//            params.put("Async", "0");         //0:等待分机摘机后才返回结果
            params.put("Dest", destNo);
			//此参数根据客服区号判断呼出电话是否需要加播0(自动的),例如:呼出号码为深圳号码,而客服号码区号为0755(深圳区号0755),则呼出为本地号码,不加0;否则呼出为外地号码,需要加0
            params.put("Area", area);
            params.put("Ext", ext);
            params.put("Writeback", ConfigUtil.getStringVal("interface.config.SmartWS.callBack.url"));
            params.put("Account", surveyCallId);

            String data = JSONUtil.toJSONString(params);

            return surveyCall(data,request,response);
        } catch (Exception e) {
            e.printStackTrace();
            logger.error("呼叫失败:" + e.getMessage());
            return new JSONResult(false,"呼叫失败");
        }
    }

    /**
     * 明元科技有限公司-呼叫中心系统：发起呼叫接口
     * <pre>
     * Http://192.168.10.251/SmartWS.php?Act=Call_Originate&retType=json&Dest=913828140299&Ext=8346&Area=0755
     * 请求参数：{"Act":"Call_Originate","Dest":"13828140299","Ext":"8346","Async":"0","retType":"json"}
     * 参数说明:
     * Ext：[必选]分机号码
     * Dest：[必选]外线号码(所有号码前加9)
     * Area：[可选]本地区号，根据参数自动判断是否增加前缀0或去除前缀0。[只适用于手机号码]
     * Async：[可选][默认1异步]同步请求：0为同步，1为异步。  @0 ：发起呼叫，确认分机摘机后再进行返回，此方式可完全控制外呼是否成功。@1 ：只要参数正常，则直接返回成功。
     * Routing：[可选][默认false(不增加)]增加默认路由前缀，[true(增加)|false[不增加]]
     * Reverse：[可选]反向，先呼叫外线，等待外线接通后，再呼叫分机。[true]
     * Account：[可选]客户信息, 回写记录时将传递此参数的值。[限制20个字符内]
     * Writeback：[可选]通话记录回写的地址,回写方式为GET请求方式，参数无需(不能)携带"http://"
     *
     * 返回消息：成功返回 SUCCESS 失败返回 FAILURE
     * </pre>
     * @param data 请求数据
     */
    private JSONResult surveyCall(String data,HttpServletRequest request,HttpServletResponse response) {
        logger.info("呼叫系统,拨出接口:" + data);
        try {
            if (data == null || data.isEmpty()) {
                return new JSONResult(false,"数据异常,请录入正确的数据");
            }
            JSONObject jsonObject = JSONObject.parseObject(data);
            String dest = jsonObject.getString("Dest");

            if(dest == null || dest.isEmpty()){
                return new JSONResult(false,"呼出号码错误");
            }

            dest = dest.startsWith("0755-") ? dest.substring(5, dest.length()) : dest;
            String[] tempDest = dest.split("-");
            StringBuilder sb = new StringBuilder();
            int len = tempDest.length;
            for (int i = 0; i < len; i++) {
                if (i == 2) { sb.append(","); }
                sb.append(tempDest[i]);
            }
            //if (sb.charAt(0) != '9') { sb.insert(0, 9); }
            dest = sb.toString();
            jsonObject.put("Dest", dest);

            //催收人员分机号
            String ext = jsonObject.getString("Ext");
            String url = "";
            if(StringUtil.isEmpty(ext)){
                return new JSONResult(false,"分机号错误");
            }
            //“5”开头的分机号，连254服务器
            if(ext.startsWith("5")){
                //点呼系统-呼叫Url
                url = ConfigUtil.getStringVal("interface.config.SmartWS.url2");
            }else {
                //点呼系统-呼叫Url
                url = ConfigUtil.getStringVal("interface.config.SmartWS.url");
            }

            StringBuilder sUrl = new StringBuilder(url).append("?Act=Call_Originate&retType=json");
            Set<Map.Entry<String, Object>> entries = jsonObject.entrySet();
            for (Map.Entry<String, Object> entry : entries) {
                sUrl.append("&").append(entry.getKey()).append("=").append(entry.getValue());
            }
            url = sUrl.toString();

            logger.info("callOriginate out:" + url);
            //发送请求呼叫
            String msg = HttpUtils.sendHttpGet(url);
            if(msg != null && msg.toUpperCase().contains("SUCCESS")){
                logger.info("呼叫成功 callOriginate msg:" + msg);
                return new JSONResult(true,"呼叫成功");
            }else {
                logger.info("呼叫失败 callOriginate msg:" + msg);
                return new JSONResult(false,"呼叫失败");
            }
        } catch (Exception e) {
            e.printStackTrace();
            logger.error("呼叫失败:" + e.getMessage());
            return new JSONResult(false,"呼叫失败");
        }
    }

	/**
	 * 呼叫系统回调接口(shiro不拦截),保存通话记录
	 * @param request request
	 * @param response response
	 */
	@RequestMapping("/callBack")
	@ResponseBody
	public void callBack(HttpServletRequest request, HttpServletResponse response) {
        String IP = HttpUtils.getRequestIp(request);
        logger.info("callBack IP:" + IP);
        String parameters = JSONUtil.toJSONString(request.getParameterMap());
        logger.info("callBack:" + parameters);
        try {
            Long surveyCallId = Long.parseLong(request.getParameter("accountcode"));                //呼叫记录ID
            PlmsLnSurveyCall surveyCall = plmsLnSurveyCallService.selectById(surveyCallId);                 //通过ID查找呼叫记录
            if(surveyCall != null){
                //拨号时间
                Date callTime = D.toDate(request.getParameter("calldate"),D.PATTERN_SECONDS);
                surveyCall.setCallDate(callTime);
                //如果有录音文件
                if("YES".equals(request.getParameter("Recording_file"))){
                    //录音文件ID
                    surveyCall.setUniqueid(request.getParameter("uniqueid"));
                }

                //通话时长
                String billsec = request.getParameter("billsec");
                surveyCall.setCallLong(billsec);

                //记录总时长
                String duration = request.getParameter("duration");
                //通话开始时间
                if(billsec != null && duration != null){
                    long callStart = callTime.getTime() + (Long.parseLong(duration) - Long.parseLong(billsec));
                    surveyCall.setCallStart(D.parse(new Date(callStart),"HH:mm:ss"));
                }
                //呼叫结果
                surveyCall.setCloudcallStatus(this.getCloudcallStatusText(request.getParameter("state")));

                logger.info("callBack json:" + JSONUtil.toJSONString(surveyCall));

                surveyCall.setUpdateTime(new Date());
                plmsLnSurveyCallService.update(surveyCall);
            }
        } catch (Exception e) {
            e.printStackTrace();
            if (logger.isErrorEnabled()) logger.error(parameters, e);
        }

        OutputStream os = null;
        try {
            os = response.getOutputStream();
            os.write("SUCCESS".getBytes("UTF-8"));
        }catch (IOException e) {
            e.printStackTrace();
        }finally {
            IOUtils.closeQuietly(os);
        }
	}

    private String getCloudcallStatusText(String state){
        if(state == null){
            return "";
        }
        switch (state){
            case "ANSWERED":
                return "15";    //接通
            case "FAILED":
                return "16";    //失败
            case "NO ANSWER":
                return "17";   //未接通
            default:
                return state;
        }
    }

    /**
     * 播放通话录音
     * @param uniqueid 通话记录连接所需唯一标识
     * @param callFrom 分机号
     * @param request request
     * @param response response
     */
    @RequestMapping("/play")
    @ResponseBody
    public void play(String uniqueid,String callFrom, HttpServletRequest request, HttpServletResponse response) {
        InputStream in  = null;
        OutputStream out = null;
        BufferedInputStream bis = null;
        try {
            if (StringUtils.isEmpty(uniqueid)) {
                return;
            }

            String url = null;
            // “5”开头的分机号，连254服务器
            if(!StringUtil.isEmpty(callFrom) && callFrom.startsWith("5")){
                url = ConfigUtil.getStringVal("interface.config.SmartWS.url2");
            }else {
                url = ConfigUtil.getStringVal("interface.config.SmartWS.url");
            }

            StringBuilder sUrl = new StringBuilder(url.length() + 40);
            sUrl.append(url).append("?Act=Recording&Uniqueid=").append(uniqueid);
            url = sUrl.toString();

            URL httpUrl = new URL(url);
            URLConnection httpURLConnection = httpUrl.openConnection();
            // 获取文件长度
            int fileLength = httpURLConnection.getContentLength();
            // 从呼叫系统下载文件
            in = httpUrl.openStream();
            bis = new BufferedInputStream(in);

            long pos = 0L;
            long toLength = 0L;
            long contentLength = 0L;
            int rangeSwitch = 0;//0-从头开始的全文下载 1-从某字节开始的下载（bytes=start-） 2-从某字节开始到某字节结束的下载（bytes=start-end）

            response.reset();
            response.setHeader("Accept-Ranges", "bytes");

            String range = request.getHeader("Range");
            if (range != null && range.trim().length() > 0 && !"null".equals(range)){
                response.setStatus(206);
                String rangeBytes = range.replaceAll("bytes=","");
                if (rangeBytes.endsWith("-")) {
                    rangeSwitch = 1;
                    pos = Long.parseLong(rangeBytes.substring(0, rangeBytes.indexOf("-")));
                    // 客户端请求的是pos之后的字节（包括bytes下标索引为pos的字节）
                    contentLength = fileLength - pos;
                } else {
                    rangeSwitch = 2;
                    String tempStart = rangeBytes.substring(0, rangeBytes.indexOf("-"));
                    String tempEnd = rangeBytes.substring(rangeBytes.indexOf("-") + 1, rangeBytes.length());
                    pos = Long.parseLong(tempStart);
                    toLength = Long.parseLong(tempEnd);
                    // 客户端请求的是start-end之间的字节
                    contentLength = toLength - pos + 1;
                }
            } else {
                contentLength = fileLength;
            }

            // 如果设置了Content-Length，则客户端会自动进行多线程下载(支持快进或后退)。如果不希望支持多线程，则不要设置这个参数。
            // Content-Length: [文件的总大小] - [客户端请求的下载的文件块的开始字节]
            response.setHeader("Content-Length", Long.toString(contentLength));

            // 断点开始
            // 响应的格式是:Content-Range: bytes [文件块的开始字节]-[文件的总大小 - 1]/[文件的总大小]
            if (rangeSwitch == 1) {
                String contentRange = new StringBuffer("bytes ").append(Long.toString(pos)).append("-")
                        .append(Long.toString(fileLength - 1)).append("/").append(Long.toString(fileLength)).toString();
                response.setHeader("Content-Range", contentRange);
                bis.skip(pos);
            } else if (rangeSwitch == 2) {
                String contentRange = range.replace("=", " ") + "/" + Long.toString(fileLength);
                response.setHeader("Content-Range", contentRange);
                bis.skip(pos);
            } else {
                String contentRange = new StringBuffer("bytes ").append("0-").append(fileLength - 1).append("/").append(fileLength).toString();
                response.setHeader("Content-Range", contentRange);
            }

            response.setContentType("application/octet-stream");
            response.addHeader("Content-Disposition", "attachment;filename=" + URLEncoder.encode(uniqueid + ".wav", "UTF-8"));

            out = response.getOutputStream();
            int i = 0;
            long readLength = 0;
            int size = 1024;
            byte[] bytes = new byte[size];
            if (rangeSwitch == 2) {
                // 针对 bytes=start-end 的请求，从start开始写数据
                while (readLength <= contentLength - size) {
                    i = bis.read(bytes);
                    readLength += i;
                    out.write(bytes, 0, i);
                }
                if (readLength <= contentLength) {
                    i = bis.read(bytes, 0, (int) (contentLength - readLength));
                    out.write(bytes, 0, i);
                }
            } else {
                while ((i = bis.read(bytes)) != -1) {
                    out.write(bytes,0,i);
                }
            }
            out.flush();
            out.close();
            bis.close();
        }catch (IOException e){
            e.printStackTrace();
        }catch (Exception e) {
            e.printStackTrace();
            logger.error(e.getLocalizedMessage(), e);
        } finally {
            IOUtils.closeQuietly(in);
        }
    }

//    /**
//     * 播放通话录音
//     * @param uniqueid 通话记录连接所需唯一标识
//     * @param callFrom 分机号
//     * @param request request
//     * @param response response
//     */
//    @RequestMapping("/play")
//    @ResponseBody
//    public JSONResult play(String uniqueid,String callFrom, HttpServletRequest request, HttpServletResponse response) {
//        JSONResult jsonResult = new JSONResult();
//        InputStream in  = null;
//        OutputStream os = null;
//        try {
//            if (StringUtils.isEmpty(uniqueid)) {
//                jsonResult.setSuccess(false);
//                jsonResult.setMessage("参数异常");
//                return jsonResult;
//            }
//
//            String url = null;
//            //“5”开头的分机号，连254服务器
//            if(!StringUtil.isEmpty(callFrom) && callFrom.startsWith("5")){
//                url = ConfigUtil.getStringVal("interface.config.SmartWS.url2");
//            }else {
//                url = ConfigUtil.getStringVal("interface.config.SmartWS.url");
//            }
//
//            StringBuilder sUrl = new StringBuilder(url.length() + 40);
//            sUrl.append(url).append("?Act=Recording&Uniqueid=").append(uniqueid);
//            url = sUrl.toString();
//
//            jsonResult.setSuccess(true);
////            jsonResult.setData(url);
//
//            in = new URL(url).openStream();
//            byte[] bytes = IOUtils.toByteArray(in);
//            int len = bytes.length;
//            response.reset();
//
//			/* 这三个header的设置非常重要,否则在线播放无法快进begin */
//            response.setHeader("Accept-Ranges", "bytes");
//            response.setHeader("Content-Length", String.valueOf(len));
//            response.setHeader("Content-Range", String.format("bytes 0-%s/%s", len, len));
//
//			/* 这三个header的设置非常重要,否则在线播放无法快进end */
//            response.setHeader("Content-Disposition", "attachment;filename=" + URLEncoder.encode(uniqueid + ".mp3", "UTF-8"));
//            response.setContentType("audio/mpeg;charset=UTF-8");
//            os = response.getOutputStream();
//            IOUtils.write(bytes, os);
//            return null;
//        } catch (Exception e) {
//            if (logger.isErrorEnabled()) logger.error(e.getLocalizedMessage(), e);
//            jsonResult.setSuccess(false);
//        } finally {
//            IOUtils.closeQuietly(in);
//            IOUtils.closeQuietly(os);
//        }
//        return jsonResult;
//    }

//     /**
//     * 播放通话录音
//     * @param uniqueid 通话记录连接所需唯一标识
//     * @param callFrom 分机号
//     * @param request request
//     * @param response response
//     */
//    @RequestMapping("/playTest")
//    @ResponseBody
//    public void playTest(String uniqueid,String callFrom, HttpServletRequest request, HttpServletResponse response) {
//        InputStream in  = null;
//        OutputStream os = null;
//        try {
//            if (StringUtils.isEmpty(uniqueid)) {
//                return;
//            }
//            Path path = Paths.get("D:\\test.wav");
//            try (
//                    SeekableByteChannel input = Files.newByteChannel(path, StandardOpenOption.READ);
//                    WritableByteChannel output = Channels.newChannel(response.getOutputStream())
//            ) {
//                String range = request.getHeader("range");
//                int pos = 0;
//                if(range != null && range.length() > 0) {
//                    pos = Integer.valueOf(range.replaceFirst("bytes=", "").split("-")[0]);
//                }
//                int length = (int)Files.size(path);
//                response.addHeader("Accept-Ranges", "bytes");
//                response.addHeader("Connection", "keep-alive");
//                if(pos > 0) {
//                    response.setStatus(206);
//                    response.addHeader("Content-Range", String.format("bytes %d-%d/%d", pos, length - 1, length));
//                    input.position(pos);
//                }
//                long time = Files.getLastModifiedTime(path, LinkOption.NOFOLLOW_LINKS).toMillis();
//                response.addHeader("ETag", "" + time);
//                response.addDateHeader("Last-Modified",time);
//                response.setContentType("audio/mpeg");
//                response.addIntHeader("Content-Length",length);
//                ByteBuffer bb = ByteBuffer.allocate(2048);
//                while(input.read(bb) != -1) {
//                    bb.flip();
//                    output.write(bb);
//                    bb.clear();
//                }
//            } catch(IOException e) {
//                e.printStackTrace();
//            }
//
//        } catch (Exception e) {
//            e.printStackTrace();
//            logger.error(e.getLocalizedMessage(), e);
//        } finally {
//            IOUtils.closeQuietly(in);
//            IOUtils.closeQuietly(os);
//        }
//    }

//	/**
//	 * 下载通话录音
//	 * @param uniqueid 通话记录连接所需唯一标识
//	 * @param request request
//	 * @param response response
//	 */
//	@RequestMapping("/download")
//	public void download(String uniqueid, HttpServletRequest request, HttpServletResponse response) {
//		InputStream in  = null;
//		OutputStream os = null;
//		try {
//			if (StringUtils.isEmpty(uniqueid)) {
//                return;
//            }
//
//			String url = ConfigUtil.getStringVal("interface.config.SmartWS.url");
//			StringBuilder sUrl = new StringBuilder(url.length() + 40);
//			sUrl.append(url).append("?Act=Recording&Uniqueid=").append(uniqueid);
//			url = sUrl.toString();
//
//			URL httpUrl = new URL(url);
//
//            File file = new File(uniqueid + ".mp3");
//            FileUtils.copyURLToFile(httpUrl, file);
//
//            InputStream inputStream = new FileInputStream(file);
//
//            response.setCharacterEncoding("utf-8");
//            response.setContentType("multipart/form-data");
//            //文件名外的双引号处理firefox的空格截断问题
//            response.setHeader("Content-disposition", String.format("attachment; filename=\"%s\"", uniqueid + ".mp3"));
//
//            OutputStream outputStream = response.getOutputStream();
//            byte[] b = new byte[2048];
//            int length;
//            while ((length = inputStream.read(b)) > 0) {
//                outputStream.write(b,0,length);
//            }
//            outputStream.close();
//            inputStream.close();
//		} catch (Exception e) {
//			if (logger.isErrorEnabled()) {
//                logger.error(e.getLocalizedMessage(), e);
//            }
//		} finally {
//			IOUtils.closeQuietly(in);
//			IOUtils.closeQuietly(os);
//		}
//	}


//	/**
//	 * 明元科技有限公司 -- 呼叫中心系统 ：获取通话记录( Info_Cdr )
//	 * <pre>
//	 * Http://192.168.10.251/SmartWS.php?Act=Info_Cdr&Ext=8888&cType=Outgoing&sTime=2014-10-01&eTime=2014-11-20&iStart=0&iEnd=1000&Count=true
//	 * 请求参数：
//	 * sTime： [可选]指定查询的起始时间，支持格式[时间戳|标准日期格式(2014-11-21| 2014-11-21 00:00:01)]
//	 * eTime: [可选]指定查询的结束时间，支持格式[时间戳|标准日期格式(2014-11-21| 2014-11-21 00:00:01)]
//	 * iStart: [可选]数据范围指定查询的数据起始位
//	 * iEnd:: [可选]数据范围指定查询的数据条数
//	 * cType: [可选]呼叫类型[Outgoing(呼出) | Incoming(呼入) ][默认为全部]
//	 * Ext: [可选]指定查询某个分机号码的通话记录
//	 * Dest: [可选]指定查询某个外线号码的通话记录(所有号码前加9)
//	 * Count: [可选]查询数据的总条数(如果指定为true则在返回的内容的Info中的iCount中)
//	 *
//	 * 返回消息：
//	 * {
//	 * "retstr":"SUCCESS",
//	 * "retinfo":{
//	 * 		"Info":{"Ext":"8321","Dest":"918578410010","iCount":1},
//	 * 		"Record":{
//	 * 			"1455862997.23672":{
//	 * 				"uniqueid":"1455862997.23672",
//	 * 				"calldate":"2016-02-19 14:23:17",
//	 * 				"type":"Outgoing",
//	 * 				"agent":null,
//	 * 				"ext":"8321",
//	 * 				"dest":"918578410010",
//	 * 				"duration":"21",
//	 * 				"billsec":"0",
//	 * 				"state":"FAILED",
//	 * 				"recording":"NO"
//	 * 			}
//	 * 		}
//	 * 	}
//	 * }
//	 * 数组结构[Info]为查询时的一些信息[Record] 为实际查询到的记录。
//	 * Record内容说明：
//	 * Key(键名): 记录的Uniqueid，注意Key为实际的内容的键名。
//	 * {
//	 * 	calldate: 呼叫的开始时间。
//	 * 	type: 通话的类型[Outgoing(呼出) | Incoming(呼入) ]。
//	 * 	ext: 分机号码，注意如果为aa_开头的则为IVR，为q开头的则为队列号码。
//	 * 	dest: 外线号码。
//	 * 	duration: 记录的总时长。
//	 * 	billsec: 通话时长(当类型为呼入时，此值和duration是差不多的，因为呼入是呼叫中心已经接通了)。
//	 * 	state: 记录的状态[ FAILED(失败) | ANSWERED(接通) | NOANSWER(未接通) ]
//	 * 	recording: 是否有录音文件[ YES(有) | NO(没有) ]
//	 * }
//	 * </pre>
//	 * @param data
//	 * @param request
//	 * @param response
//	 * @return
//	 * @throws Exception
//	 */
//	@RequestMapping("/infoCallRecords")
//	@ResponseBody
//	public JSONObject infoCallRecords(String data, HttpServletRequest request, HttpServletResponse response) {
//		boolean isInfoEnabled = logger.isInfoEnabled();
//		if (isInfoEnabled) { logger.info("呼叫系统,获取通话记录:" + data); }
//		JSONObject responseData = new JSONObject();
//		try {
//			if (data == null || data.isEmpty()) {
//				responseData.put("success", false);
//				responseData.put("message", "数据异常,请录入正确的数据");
//				return responseData;
//			}
//			String url = ConfigManageUtil.getConfigValue("interface.config.SmartWS.url");
//			StringBuilder sUrl = new StringBuilder(url).append("?Act=Info_Cdr&retType=json&Count=true");
//			JSONObject dataJson = JSONObject.fromObject(data);
//			if (isInfoEnabled) { logger.info("通话记录查询:" + dataJson.toString()); }
//			if (dataJson.getString("Ext") == null) {
//				sUrl.append("&Ext=").append(UserSessionUtil.getAdminUser(request.getSession()).getExt());
//			}
//			String dest = dataJson.getString("Dest");
//			if (dest != null) {
//				dest = dest.charAt(0) == '9' ? "9" + dest : dest;
//				sUrl.append("&Dest=").append(dest);
//				dataJson.remove("Dest");
//			}
//			Iterator<Map.Entry<String, Object>> iterator = dataJson.entrySet().iterator();
//			while (iterator.hasNext()) {
//				Map.Entry<String, Object> entry = iterator.next();
//				Object value = entry.getValue();
//				if (value != null) {
//					sUrl.append("&").append(entry.getKey()).append("=").append(entry.getValue());
//				}
//			}
//			if (isInfoEnabled) { logger.info("通话记录查询,请求完整连接:" + sUrl.toString()); }
//			String msg = HttpRequestUtil.utils.sendWithHttpAndGet(sUrl.toString());
//			responseData = JSONObject.fromObject(msg);
//			if (isInfoEnabled) { logger.info("infoCallRecords 响应信息=" + responseData); }
//		} catch (Exception e) {
//			if (logger.isErrorEnabled()) logger.error(e.getMessage(), e);
//			responseData.put("success", false);
//			responseData.put("message", e.getMessage());
//		}
//		return responseData;
//	}

}
