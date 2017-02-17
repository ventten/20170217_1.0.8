package com.ljwd.plms.mapp.controller.annex;

import com.alibaba.fastjson.JSONObject;
import com.ljwd.plms.core.entity.JSONResult;
import com.ljwd.plms.core.entity.Result;
import com.ljwd.plms.core.util.ConfigUtil;
import com.ljwd.plms.core.util.D;
import com.ljwd.plms.core.util.JSONUtil;
import com.ljwd.plms.mapp.controller.MAppAbstractController;
import com.ljwd.plms.mapp.filter.AESAuthen;
import com.ljwd.plms.mapp.filter.AESHttpServletRequestWrapper;
import com.ljwd.plms.mapp.filter.AESHttpServletResponseWrapper;
import com.ljwd.plms.mapp.security.SessionManage;
import com.ljwd.plms.mapp.utils.AES;
import com.ljwd.plms.mapp.vo.annex.AppAnnexVo;
import com.ljwd.plms.mapp.vo.egress.AppUserVo;
import com.ljwd.plms.web.model.cust.PlmsLnAnnex;
import com.ljwd.plms.web.model.cust.PlmsLnAnnexExample;
import com.ljwd.plms.web.model.outVisit.PlmsOvmOutVisitPlan;
import com.ljwd.plms.web.service.cust.inf.PlmsLnAnnexService;
import com.ljwd.plms.web.service.outVisit.inf.PlmsOvmOutVisitPlanService;
import org.apache.commons.codec.binary.Base64;
import org.apache.commons.io.FileUtils;
import org.apache.commons.io.IOUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.support.DefaultMultipartHttpServletRequest;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * 附件操作控制器
 * Created by tangjialin on 2016-11-10 0010.
 */
@RestController
@RequestMapping("/annex")
public class AnnexController extends MAppAbstractController {

    @Resource
    private PlmsLnAnnexService annexService;
    @Resource
    private PlmsOvmOutVisitPlanService outVisitPlanService;

    /**
     * 附件上传
     * <pre>
     * 请求信息://"topic":"文件名",数据库字段，topic为主题名字段，所以要将文件名存储进File_name字段
     *     json: {"planId":123,"topic":"文件名","remark":"备注/描述","fileType":"文件类型","channel":"android"}
     *       planId   : 外访计划ID(PLMS_OVM_OUT_VISIT_PLAN表主键)
     *       topic    : 附件主题(文件名)
     *       remark   : 备注
     *       fileType : 文件类型.{@link PlmsLnAnnex#FILE_TYPE_IMG}和{@link PlmsLnAnnex#FILE_TYPE_RECORD}
     *                  IMG   :图片
     *                  RECORD:录音
     *       channel  : 渠道(和APP使用的操作系统有关)
     *                  ios     : 苹果系统必须为此值
     *                  android : 安卓系统必须为此值
     *
     * 响应信息:
     * 上传失败响应示例:
     * {"message":"上传文件内容为空","statusCode":0,"success":false,"data":null}
     * 上传成功响应示例:
     * {"message":null,"statusCode":0,"success":true,"data":66107}
     * 键值对说明:
     *     success    : 处理成功返回true,否则返回false
     *     statusCode : 状态码.暂时为0,需要时再定义
     *     message    : 当success返回为false时,此处返回服务器的错误描述
     *     data       : 文件上传后,该文件的id.删除和修改文件信息时携带的id(长整型)
     *
     * 注意:参数上传方式按照表单上传附件中参数的上传方式,如下.
     * --1476848718690
     * Content-Disposition: form-data; name="json"
     *
     * Base64_encode(AES({"planId":123,"topic":"文件名","remark":"备注/描述","fileType":"文件类型"}))
     * --1476848718690
     * Content-Disposition: form-data; name="文件参数名称(file)"; filename="文件名称(外访图片.png)"
     * Content-Type:application/octet-stream
     *
     * (文件内容)
     * --1476848718690--
     * </pre>
     * @param request
     * @return 返回服务器处理结果
     */
    @AESAuthen(requestCheckAndBody = false, requestDecrypt = false, requestLog = false)
    @RequestMapping("/upload")
    public Result upload(HttpServletRequest request) {
        JSONResult result = new JSONResult();
        File file = null;
        try {
            // 从请求中解析上传的文件
            if (!(request instanceof DefaultMultipartHttpServletRequest)) { return result.setMessage("文件缺失"); }
            DefaultMultipartHttpServletRequest multipartHttpServletRequest = (DefaultMultipartHttpServletRequest) request;
            Map<String, MultipartFile> multipartFileMap = multipartHttpServletRequest.getFileMap();
            if (multipartFileMap == null || multipartFileMap.isEmpty()) { return result.setMessage("文件缺失"); }

            HttpServletRequest tempRequest = multipartHttpServletRequest.getRequest();
            if (!(tempRequest instanceof AESHttpServletRequestWrapper)) { return result.setMessage("认证错误"); }
            AESHttpServletRequestWrapper aesRequest = (AESHttpServletRequestWrapper) tempRequest;

            String jsonString = request.getParameter("json");
            if (jsonString == null || jsonString.isEmpty()) { return result.setMessage("参数错误"); }
            jsonString = AES.instance.decrypt(jsonString, aesRequest.getSecretKey()); // 数据解密
            if (isInfoEnabled) { logger.info("请求参数:{}", jsonString); }
            jsonString = jsonString.replace("\"(null)\"", "null");

            JSONObject jsonObject = JSONUtil.parseObject(jsonString);
            long planId = jsonObject.getLongValue("planId");
            String topic = jsonObject.getString("topic");
            String fileType = jsonObject.getString("fileType");
            String remark = jsonObject.getString("remark");
            String channel = jsonObject.getString("channel");
            if (planId == 0) { return result.setMessage("外访计划主键不能为空"); }
            if (topic == null || topic.isEmpty()) { return result.setMessage("附件主题(文件名称)不能为空"); }
            if (fileType == null || fileType.isEmpty()) { return result.setMessage("文件类型不能为空"); }
            if (!PlmsLnAnnex.FILE_TYPE_IMG.equals(fileType) && !PlmsLnAnnex.FILE_TYPE_RECORD.equals(fileType)) {
                return result.setMessage("文件类型错误");
            }
            if (channel == null || channel.isEmpty()) { return result.setMessage("文件上传渠道错误"); }

            PlmsOvmOutVisitPlan visitPlan = outVisitPlanService.selectById(planId);
            if (visitPlan == null) { return result.setMessage("外访计划不存在"); }

            // 因是单文件上传,读取一个文件即可
            Map.Entry<String, MultipartFile> multipartFileEntry = multipartFileMap.entrySet().iterator().next();
            MultipartFile multipartFile = multipartFileEntry.getValue();

            String originalFilename = multipartFile.getOriginalFilename();
//            String originalFilename = multipartFile.getName();
            String suffix = originalFilename.substring(originalFilename.lastIndexOf(".")).toLowerCase();
            Date date = new Date();
            // 截取文件后缀名,并转成小写
            String filePath = ConfigUtil.getStringVal("file.picture.url");
            // 基础目录/年份/月份/日子/外访计划编号/时间戳.文件后缀
            // file.picture.url/outVisit/annex/计划编号/201612131723480886.jpg
            filePath = String.format("%s/outVisit/annex/%s/%s%s", filePath, visitPlan.getPlanCode(), D.parse(date, "yyyyMMddHHmmssSSS"), suffix);
            file = new File(filePath);
            file.getParentFile().mkdirs();
            if ("ios".equals(channel)) {
                byte[] bytes = new Base64().decode(multipartFile.getBytes());
                FileUtils.writeByteArrayToFile(file, bytes);
            } else {
                multipartFile.transferTo(file);
            }

            // 文件名添加后缀名和后台统一 at:2016-12-13
            if (!topic.toLowerCase().endsWith(suffix)) {
                topic += suffix;
            }
            filePath = file.getPath();
           // String fileName = file.getName();
            AppUserVo loginUser = SessionManage.api.getLoginUser();
            String userId = loginUser.getUserId();
            PlmsLnAnnex plmsLnAnnex = new PlmsLnAnnex();
            plmsLnAnnex.setSrcCode("OUTVISIT");
            plmsLnAnnex.setAnnexStyle("ANST002");
            plmsLnAnnex.setAnnexType("AN101");
            plmsLnAnnex.setIsDeleted("N");
            plmsLnAnnex.setFileType(fileType);
           // plmsLnAnnex.setTopic(topic);
           // plmsLnAnnex.setFileName(fileName);
           // topic在数据库中为主题名，所以此处修改为存储进FileName字段 at:2016-12-12
            plmsLnAnnex.setFileName(topic);
            plmsLnAnnex.setPath(filePath);
            plmsLnAnnex.setRemark(remark);
            plmsLnAnnex.setApplId(visitPlan.getApplId());
            plmsLnAnnex.setClCustId(planId);     // TODO 主贷人贷后信息ID
            plmsLnAnnex.setOutVisitPlanId(planId);
            plmsLnAnnex.setCreatedBy(userId);
            plmsLnAnnex.setUpdatedBy(userId);
            plmsLnAnnex.setUploadBy(userId);
            plmsLnAnnex.setCreateTime(date);
            plmsLnAnnex.setUpdateTime(date);
            plmsLnAnnex.setRecVer(0L);
            plmsLnAnnex.setTagSeq(1L);
            annexService.insert(plmsLnAnnex);
            result.setData(plmsLnAnnex.getId()).setSuccess(true);
        } catch (Exception e) {
            logger.error("附件上传异常", e);
            result.setMessage("文件上传失败");
            if (file != null) { file.delete(); }
        }
        return result;
    }

    /**
     * 附件下载
     * <pre>
     * 请求信息:{"id":66104}
     *     id   : 附件ID(PLMS_LN_ANNEX表主键)
     *
     * 响应信息:文件流,处理失败响应[失败信息.txt]
     * </pre>
     * @param request
     * @return 返回服务器处理结果
     */
    @AESAuthen(responseEncrypt = false, responseLog = false)
    @RequestMapping("/download")
    public void download(AESHttpServletRequestWrapper request, AESHttpServletResponseWrapper response) {
        JSONResult result = new JSONResult();
        String fileName = null;
        InputStream is = null;
        OutputStream os = null;
        try {
            AppAnnexVo appAnnexVo = JSONUtil.parseObject(request.getDecryptedBodyContent(), AppAnnexVo.class);
            Long id = appAnnexVo.getId();
            if (id == null) { throw new IllegalArgumentException("参数错误"); }
            PlmsLnAnnex plmsLnAnnex = annexService.selectById(id);
            if (plmsLnAnnex == null) { throw new IllegalArgumentException("参数错误"); }
            if ("Y".equals(plmsLnAnnex.getIsDeleted())) { throw new IllegalArgumentException("无效的文件"); }
            File downloadFile = new File(plmsLnAnnex.getPath());
            if (!downloadFile.exists()) { throw new IllegalArgumentException("文件不存在"); }
            is = FileUtils.openInputStream(downloadFile);
            fileName = downloadFile.getName();
            result.setSuccess(true);
        } catch (Exception e) {
            logger.error("附件下载异常", e);
            result.setMessage("文件下载失败");
        }
        try {
            if (!result.isSuccess()) {
                fileName = result.getMessage();
                is = new ByteArrayInputStream(fileName.getBytes("UTF-8"));
                fileName += ".txt";
            }

            response.reset();
            response.setDateHeader("Expires", 0);
            response.setContentLength(is.available());
            response.addHeader("Cache-Control", "no-cache");
            response.addHeader("Cache-Control", "no-store");
            response.setHeader("Pragma", "No-cache");
            response.setHeader("Content-Disposition", "attachment;filename=" + URLEncoder.encode(fileName, "UTF-8"));
            response.setContentType("application/octet-stream;charset=UTF-8");
            os = response.getOutputStream();
            IOUtils.copyLarge(is, os);
        } catch (Exception e) {
            logger.error("附件下载流输出异常", e);
        } finally {
            IOUtils.closeQuietly(is);
            IOUtils.closeQuietly(os);
        }
    }

    /**
     * 附件列表
     * <pre>
     * 请求信息:{"planId":23}
     *     planId : 外访计划表ID(PLMS_OVM_OUT_VISIT_PLAN表主键)
     *
     * 响应信息:
     * {"message":null,"statusCode":0,"success":true,
     * "data":[
     *   {"id":66104,"topic":"测试文件-文件名","remark":"测试文件-备注"}
     * ]}
     * 键值对说明:
     *     success    : 处理成功返回true,否则返回false
     *     statusCode : 状态码.未定义,默认为0.
     *     message    : 当success返回为false时,此处返回服务器的错误描述
     *     data       : 响应结果时携带的数据,暂时为空
     *     [{
     *       id     : 附件主键
     *       topic  : 附件主题(文件名)
     *       remark : 附件备注
     *     }]
     * </pre>
     * @param fileType 文件类型.{@link PlmsLnAnnex#FILE_TYPE_IMG}和{@link PlmsLnAnnex#FILE_TYPE_RECORD}
     * @param request
     * @return
     */
    public Result annexList(String fileType, AESHttpServletRequestWrapper request) {
        JSONResult result = new JSONResult();
        try {
            JSONObject jsonObject = JSONUtil.parseObject(request.getDecryptedBodyContent());
            long planId = jsonObject.getLongValue("planId");
            if (planId <= 0) { return result.setMessage("参数错误"); }
            PlmsLnAnnexExample plmsLnAnnexExample = new PlmsLnAnnexExample();
            plmsLnAnnexExample.setIsDeleted("N");
            plmsLnAnnexExample.setFileType(fileType).setOutVisitPlanId(planId);
            List<PlmsLnAnnex> plmsLnAnnexList = annexService.selectByExample(plmsLnAnnexExample);

            int size = plmsLnAnnexList == null ? 0 : plmsLnAnnexList.size();
            List<AppAnnexVo> appAnnexVoList = new ArrayList<>(size);
            for (int index = 0; index < size; index++) {
                PlmsLnAnnex plmsLnAnnex = plmsLnAnnexList.get(index);
                AppAnnexVo appAnnexVo = new AppAnnexVo();
                // 附件名称由topic改为fileName at:2016-12-12
                appAnnexVo.setId(plmsLnAnnex.getId());
                appAnnexVo.setTopic(plmsLnAnnex.getFileName());
                appAnnexVo.setRemark(plmsLnAnnex.getRemark());
                appAnnexVoList.add(appAnnexVo);
            }

            result.setData(appAnnexVoList).setSuccess(true);
        } catch (Exception e) {
            logger.error("附件获取异常", e);
        }
        if (!result.isSuccess()) result.setMessage("文件获取失败");
        return result;
    }

    /**
     * 图片附件列表
     * 详细参数见{@link AnnexController#annexList(java.lang.String, com.ljwd.plms.mapp.filter.AESHttpServletRequestWrapper)}
     * @param request
     * @return 详见方法注释[响应信息]部分
     */
    @RequestMapping("/image")
    public Result imgList(AESHttpServletRequestWrapper request) {
        return annexList(PlmsLnAnnex.FILE_TYPE_IMG, request);
    }

    /**
     * 录音附件列表
     * 详细参数见{@link AnnexController#annexList(java.lang.String, com.ljwd.plms.mapp.filter.AESHttpServletRequestWrapper)}
     * @param request
     * @return 详见方法注释[响应信息]部分
     */
    @RequestMapping("/record")
    public Result recordList(AESHttpServletRequestWrapper request) {
        return annexList(PlmsLnAnnex.FILE_TYPE_RECORD, request);
    }

    /**
     * 修改附件信息
     * <pre>
     * 请求信息:{"id":66104,"topic":"测试录音","remark":"备注"}
     *     id     : 附件ID(PLMS_LN_ANNEX表主键)
     *     topic  : 附件主题(文件名称)
     *     remark : 备注
     *
     * 响应信息:
     * {"message":null,"statusCode":0,"success":true,"data":null}
     * 键值对说明:
     *     success    : 处理成功返回true,否则返回false
     *     statusCode : 状态码.未定义,默认为0.
     *     message    : 当success返回为false时,此处返回服务器的错误描述
     *     data       : 响应结果时携带的数据,暂时为空
     * </pre>
     * @param request
     * @return
     */
    @RequestMapping("/update")
    public Result update(AESHttpServletRequestWrapper request) {
        JSONResult result = new JSONResult();
        try {
            AppAnnexVo appAnnexVo = JSONUtil.parseObject(request.getDecryptedBodyContent(), AppAnnexVo.class);
            Long id = appAnnexVo.getId();
            String topic = appAnnexVo.getTopic();
            if (id == null) { return result.setMessage("参数错误"); }
            if (topic == null || topic.isEmpty()) { return result.setMessage("附件主题(文件名称)不能为空"); }

            PlmsLnAnnex oldPlmsLnAnnex = annexService.selectById(id);
            if (oldPlmsLnAnnex == null) { return result.setMessage("参数错误"); }
            if ("Y".equals(oldPlmsLnAnnex.getIsDeleted())) { return result.setMessage("无效的文件"); }

            // 文件名添加后缀名和后台统一 at:2016-12-13
            String path = oldPlmsLnAnnex.getPath();
            String suffix = path.substring(path.lastIndexOf('.'));
            if (!topic.toLowerCase().endsWith(suffix)) {
                topic += suffix;
            }
            PlmsLnAnnex savePlmsLnAnnex = new PlmsLnAnnex();
            // 附件名称由topic改为fileName at:2016-12-12
            savePlmsLnAnnex.setFileName(topic); // 文件名由topic改为fileName
            savePlmsLnAnnex.setId(id);
            savePlmsLnAnnex.setRemark(appAnnexVo.getRemark());
            savePlmsLnAnnex.setRecVer(oldPlmsLnAnnex.getRecVer());
            int update = annexService.update(savePlmsLnAnnex);
            result.setSuccess(update == 1);
        } catch (Exception e) {
            logger.error("附件修改异常", e);
        }
        if (!result.isSuccess()) result.setMessage("文件修改失败");
        return result;
    }

    /**
     * 删除附件
     * <pre>
     * 请求信息:{"id":66104}
     *     id : 附件ID(PLMS_LN_ANNEX表主键)
     *
     * 响应信息:
     * {"message":null,"statusCode":0,"success":true,"data":null}
     * 键值对说明:
     *     success    : 处理成功返回true,否则返回false
     *     statusCode : 状态码.未定义,默认为0.
     *     message    : 当success返回为false时,此处返回服务器的错误描述
     *     data       : 响应结果时携带的数据,暂时为空
     * </pre>
     * @param request
     * @return
     */
    @RequestMapping("/delete")
    public Result delete(AESHttpServletRequestWrapper request) {
        JSONResult result = new JSONResult();
        try {
            AppAnnexVo appAnnexVo = JSONUtil.parseObject(request.getDecryptedBodyContent(), AppAnnexVo.class);
            Long id = appAnnexVo.getId();
            if (id == null) { return result.setMessage("参数错误"); }

            PlmsLnAnnex oldPlmsLnAnnex = annexService.selectById(appAnnexVo.getId());
            if (oldPlmsLnAnnex == null) { return result.setMessage("参数错误"); }

            PlmsLnAnnex savePlmsLnAnnex = new PlmsLnAnnex();
            savePlmsLnAnnex.setId(id);
            savePlmsLnAnnex.setRecVer(oldPlmsLnAnnex.getRecVer());
            savePlmsLnAnnex.setIsDeleted("Y");
            int update = annexService.update(savePlmsLnAnnex);
            result.setSuccess(update == 1);
        } catch (Exception e) {
            logger.error("附件删除异常", e);
        }
        if (!result.isSuccess()) result.setMessage("文件删除失败");
        return result;
    }
}
