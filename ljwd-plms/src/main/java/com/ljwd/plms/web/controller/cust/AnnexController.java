package com.ljwd.plms.web.controller.cust;

import com.ljwd.plms.core.entity.JSONResult;
import com.ljwd.plms.core.feature.orm.mybatis.Page;
import com.ljwd.plms.core.util.ConfigUtil;
import com.ljwd.plms.core.util.D;
import com.ljwd.plms.core.util.PageUtil;
import com.ljwd.plms.core.util.StringUtil;
import com.ljwd.plms.web.model.cust.PlmsLnAnnex;
import com.ljwd.plms.web.model.cust.PlmsLnAnnexExample;
import com.ljwd.plms.web.security.PermissionSign;
import com.ljwd.plms.web.security.SubjectUtil;
import com.ljwd.plms.web.service.cust.inf.PlmsLnAnnexService;
import com.ljwd.plms.web.vo.DataTableParam;
import com.ljwd.plms.web.wsdl.webservice.AnnexServiceWSDL;
import com.ljwd.plms.web.wsdl.webservice.annexService.AnnexDto;
import com.ljwd.plms.web.wsdl.webservice.exception.ErrorInfoException_Exception;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

/**
 * Created by zhengzw on 2016/6/29
 * 客户附件信息控制器
 */
@Controller()
@RequestMapping(value = "/cust")
public class AnnexController {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Resource
    private PlmsLnAnnexService annexService;

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
        //Excel
        fileType.add(".XLS");
        fileType.add(".XLSX");
        //PDF
        fileType.add(".PDF");
        //压缩文件
        fileType.add(".RAR");
        fileType.add(".ZIP");
        //音频文件
        fileType.add(".MP3");
    }

    /**
     * 客户附件信息数据
     * */
    @RequestMapping(value = "/pageAnnexData",method = RequestMethod.POST)
    @ResponseBody
    @RequiresPermissions(PermissionSign.ANNEX_SELECT)
    public String pageAnnexData(PlmsLnAnnexExample example){
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

        example.setOrderByClause("T.ID DESC");

        Page<PlmsLnAnnex> pageData = new Page<PlmsLnAnnex>(pageNo, pageSize);

        pageData = annexService.selectByExampleAndPage(pageData, example);

        return PageUtil.getPageJson(sEcho, pageData);
    }

    /**
     * 添加附件和上传文件
     * */
    @RequestMapping(value = "/addAnnex",method = RequestMethod.POST)
    @ResponseBody
    @RequiresPermissions(PermissionSign.ANNEX_UPLOAD)
    public JSONResult addAnnex(PlmsLnAnnex info,HttpServletRequest request){
        if(info == null || info.getClCustId() == null){
            return new JSONResult(false,"参数错误");
        }
        if(StringUtil.isEmpty(info.getTopic())){
            return new JSONResult(false,"请输入主题");
        }
        if(info.getFileName() == null || "".equals(info.getFileName().trim())){
            return new JSONResult(false,"请输入文件名");
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
            //配置的文件保存路劲
            pathUrl = ConfigUtil.getStringVal("file.picture.url") + File.separator + "cust" + File.separator + "annex" + File.separator + info.getClCustId();
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
        info.setAnnexStyle("ANST002");                                                      //非流水性附件
        info.setIsDeleted("N");

        int ret = annexService.insert(info);
        if(ret < 1){
            File targetFile = new File(pathUrl,fileName);
            targetFile.delete();                                                            //如果添加失败则删除文件
            logger.error("文件上传失败:" + D.parse(new Date(), D.PATTERN_SECONDS) + "-->用户ID" + info.getClCustId());
            return new JSONResult(false,"上传失败");
        }
        return new JSONResult(true,"上传成功");
    }

    /**
     * 下载文件
     * @param id 贷后附件记录ID
     * */
    @RequestMapping(value = "/download")
    @RequiresPermissions(PermissionSign.ANNEX_DOWNLOAD)
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

        //如果不是从微贷导入的附件
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
        //如果是微贷系统的附件
        else {
//            SessionMsg session = (SessionMsg)request.getSession().getAttribute("session");
//            //base64解密
//            String key = ConfigUtil.getStringVal("session.base64.key.encryption");
//            String pwd = EncryptUtils.xorDecryptString(session.getPwd(),key);
//            if(mfbmsAnnexService == null){
//                try{
//                    //登录微贷系统并获取服务
//                    mfbmsAnnexService = AnnexServiceUtils.getService(session.getName(),pwd);
//                }catch (Exception e){
//                    e.printStackTrace();
//                    logger.error("连接微贷系统失败");
//                    throw new RuntimeException("连接微贷系统失败");
//                }
//            }

            //到微贷系统获取附件
            AnnexDto dto = null;
            try{
                dto = AnnexServiceWSDL.getService().downloadAnnexMtom(annex.getAnnexId());
            }catch (Exception e){
                e.printStackTrace();
                logger.error("获取微贷系统附件失败");
                throw new RuntimeException("获取微贷系统附件失败");
            }
            if(dto == null){
                return;
            }
            if(dto.getAnnexHandler() != null){
//                InputStream inputStream = dto.getAnnexHandler().getInputStream();
                response.setCharacterEncoding("utf-8");
                response.setContentType("multipart/form-data");
                response.setHeader("Content-disposition", String.format("attachment; filename=\"%s\"", fileName));//文件名外的双引号处理firefox的空格截断问题
                OutputStream outputStream = response.getOutputStream();
                //将微贷获取的附件写出
                dto.getAnnexHandler().writeTo(outputStream);
                outputStream.close();
            }
        }

    }

//    /**
//     * 上传图片-字节流方式
//     * */
//    @RequestMapping(value = "/upload",method = RequestMethod.POST)
//    @ResponseBody
//    public JSONResult upload(@RequestParam(value = "image", required = false) MultipartFile file){
//        String path = ConfigUtil.getStringVal("file.picture.url");
//        String fileName = file.getOriginalFilename();
//        File targetFile = new File(path,fileName);
//        if(!targetFile.exists()){
//            targetFile.mkdirs();
//        }
//        //保存
//        try {
//            file.transferTo(targetFile);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        return new JSONResult(true,"操作成功.");
//    }
//
//    /**
//     * 上传图片-spring解析器方式
//     * */
//    @RequestMapping("/upload2")
//    public JSONResult upload2(HttpServletRequest request) throws IllegalStateException, IOException {
//        //创建一个通用的多部分解析器
//        CommonsMultipartResolver multipartResolver = new CommonsMultipartResolver(request.getSession().getServletContext());
//        //判断 request 是否有文件上传,即多部分请求
//        if(multipartResolver.isMultipart(request)){
//            //转换成多部分request
//            MultipartHttpServletRequest multiRequest = (MultipartHttpServletRequest)request;
//            //取得request中的所有文件名
//            Iterator<String> iter = multiRequest.getFileNames();
//            String path = ConfigUtil.getStringVal("file.picture.url");
//            while(iter.hasNext()){
//                //记录上传过程起始时的时间，用来计算上传时间
//                long start = System.currentTimeMillis();
//                //取得上传文件
//                MultipartFile file = multiRequest.getFile(iter.next());
//                if(file != null){
//                    //取得当前上传文件的文件名称
//                    String myFileName = file.getOriginalFilename();
//                    //如果名称不为“”,说明该文件存在，否则说明该文件不存在
//                    if(!"".equals(myFileName.trim())){
//                        System.out.println(myFileName);
//                        //重命名上传后的文件名
//                        File targetFile = new File(path,myFileName);
//                        if(!targetFile.exists()){
//                            targetFile.mkdirs();
//                        }
//                        //保存
//                        try {
//                            file.transferTo(targetFile);
//                        } catch (Exception e) {
//                            e.printStackTrace();
//                        }
//                    }
//                }
//                //记录上传该文件后的时间
//                long end = System.currentTimeMillis();
//                System.out.println(end - start);
//            }
//        }
//        return new JSONResult(true,"操作成功.");
//    }

}
