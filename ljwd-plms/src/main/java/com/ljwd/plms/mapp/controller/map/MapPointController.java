package com.ljwd.plms.mapp.controller.map;

import com.alibaba.fastjson.JSONArray;
import com.ljwd.plms.core.entity.JSONResult;
import com.ljwd.plms.core.entity.Result;
import com.ljwd.plms.core.util.IOUtils;
import com.ljwd.plms.mapp.controller.MAppAbstractController;
import com.ljwd.plms.mapp.filter.AESAuthen;
import com.ljwd.plms.mapp.model.PlmsAppMapPoint;
import com.ljwd.plms.mapp.security.SessionManage;
import com.ljwd.plms.mapp.service.map.inf.MapPointService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/**
 * 位置信息
 * Created by tangjialin on 2016-10-13 0013.
 */
@Controller
@RequestMapping("/map")
public class MapPointController extends MAppAbstractController {
    @Resource
    private MapPointService mapPointService;

    /**
     * 轨迹展示视图
     * @param request
     * @return
     */
    @AESAuthen(requestCheck = false, responseEncrypt = false)
    @RequestMapping(method = RequestMethod.GET)
    public String index(HttpServletRequest request) {
        List<String> selectAllGroup = mapPointService.selectAllGroup();
        request.setAttribute("allUsers", selectAllGroup);
        return "map/index";
    }

    /**
     * 轨迹展示视图
     * @param request
     * @return
     */
    @AESAuthen(requestCheck = false, responseEncrypt = false, responseLog = false)
    @RequestMapping(value = "/{userId}", method = RequestMethod.POST)
    @ResponseBody
    public Result select(@PathVariable("userId") String userId, HttpServletRequest request) {
        JSONResult result = new JSONResult();
        List<PlmsAppMapPoint> plmsAppMapPoints = null;
        try {
            if (StringUtils.isEmpty(userId)) { return result.setMessage("查询条件错误"); }
            plmsAppMapPoints = mapPointService.selectByCreatedUser(userId);
            plmsAppMapPoints = plmsAppMapPoints == null ? new ArrayList<PlmsAppMapPoint>(0) : plmsAppMapPoints;
            result.setData(plmsAppMapPoints).setSuccess(true);
        } catch (Exception e) {
            logger.error("用户坐标信息上传异常", e);
            plmsAppMapPoints = new ArrayList<>(0);
            result.setData(plmsAppMapPoints).setMessage("查询失败");
        }
        return result;
    }

    /**
     * 坐标信息上传
     * <pre>
     * 文件内容为JSON格式的数组内嵌套键值对.格式示例如下:
     * [
     * {"lng":114.075,"lat":22.546,"accuracy":5.00,"dateTime":"2016-10-10 12:13:12","option":2},
     * {"lng":114.075,"lat":22.547,"accuracy":5.00,"dateTime":"2016-10-10 12:13:12","option":0},
     * {"lng":114.075,"lat":22.548,"accuracy":5.00,"dateTime":"2016-10-10 12:25:13","option":1},
     * {"lng":114.075,"lat":22.549,"accuracy":5.00,"dateTime":"2016-10-10 12:13:12","option":0},
     * {"lng":114.075,"lat":22.550,"accuracy":5.00,"dateTime":"2016-10-10 12:13:12","option":3}
     * ]
     * 文件内容键值对说明:
     *     lng      : 经度
     *     lat      : 纬度
     *     accuracy : 精度(单位:米)
     *     dateTime : 时间(格式:yyyy-MM-dd HH:mm:ss)
     *     option   : 选项.0或null:默认值,普通坐标;1:外访提交坐标点;2:签到开始坐标;3:签到结束坐标;
     *
     * 响应信息:
     * {"message":null,"statusCode":0,"success":true,"data":null}
     * {"message":"上传文件内容为空","statusCode":0,"success":false,"data":null}
     * 键值对说明:
     *     success    : 处理成功返回true,否则返回false
     *     statusCode : 状态码.暂时为0,需要时再定义
     *     message    : 当success返回为false时,此处返回服务器的错误描述
     *     data       : 响应结果时携带的数据,暂时为空
     * </pre>
     * @param request
     * @return 返回服务器处理结果
     */
    @AESAuthen(requestCheckAndBody = false, requestDecrypt = false, requestLog = false)
    @RequestMapping("/upload")
    @ResponseBody
    public Result upload(HttpServletRequest request) {
        JSONResult result = new JSONResult();
        try {
            // 从请求中解析上传的文件
            if (!(request instanceof MultipartHttpServletRequest)) { return result.setMessage("文件缺失"); }
            MultipartHttpServletRequest multipartHttpServletRequest = (MultipartHttpServletRequest) request;
            Map<String, MultipartFile> multipartFileMap = multipartHttpServletRequest.getFileMap();
            if (multipartFileMap == null || multipartFileMap.isEmpty()) { return result.setMessage("文件缺失"); }
            if (isInfoEnabled) { logger.info("坐标信息上传文件数量:{}", multipartFileMap.size()); }
            Iterator<Map.Entry<String, MultipartFile>> iterator = multipartFileMap.entrySet().iterator();
            String context = null;
            while (iterator.hasNext()) {
                Map.Entry<String, MultipartFile> multipartFileEntry = iterator.next();
                MultipartFile multipartFile = multipartFileEntry.getValue();
                context = IOUtils.toString(multipartFile.getInputStream(), null, true);
                break; // 因是单文件上传,读取一个文件后即退出
            }
            if (context == null || context.isEmpty()) { return result.setMessage("上传文件内容为空"); }
            context = context.trim();
            // 因option是数据库关键字,固更改为options,但为了方便app,所以由后台替换所有上传信息option为options. by:tangjialin at:2016年12月5日 11:09:49
            context = context.replaceAll("option", "options");

            // 解析文件内容
            List<PlmsAppMapPoint> plmsClMapList = JSONArray.parseArray(context, PlmsAppMapPoint.class);
            if (plmsClMapList == null || plmsClMapList.isEmpty()) { return result.setMessage("上传文件内容为空"); }
            Date date = new Date(); // 同一批数据,时间必须一样
            String userId = SessionManage.api.getLoginUser().getUserId();
            for (PlmsAppMapPoint plmsClMap : plmsClMapList) {
                plmsClMap.setCreatedBy(userId);
                plmsClMap.setUpdatedBy(userId);
                plmsClMap.setCreateTime(date);
                plmsClMap.setUpdateTime(date);
            }
            mapPointService.insertBatch(plmsClMapList);
            result.setSuccess(true);
        } catch (Exception e) {
            logger.error("用户坐标信息上传异常", e);
            result.setMessage("文件上传异常");
        }
        return result;
    }

}
