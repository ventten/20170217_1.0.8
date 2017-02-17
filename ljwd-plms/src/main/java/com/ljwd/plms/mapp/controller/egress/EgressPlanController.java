package com.ljwd.plms.mapp.controller.egress;

import com.alibaba.fastjson.JSONObject;
import com.ljwd.plms.core.entity.JSONResult;
import com.ljwd.plms.core.entity.Result;
import com.ljwd.plms.core.util.ConfigUtil;
import com.ljwd.plms.core.util.D;
import com.ljwd.plms.core.util.HttpUtils;
import com.ljwd.plms.core.util.JSONUtil;
import com.ljwd.plms.mapp.controller.MAppAbstractController;
import com.ljwd.plms.mapp.filter.AESHttpServletRequestWrapper;
import com.ljwd.plms.mapp.security.SessionManage;
import com.ljwd.plms.mapp.vo.egress.AppOutVisitPlanResultVo;
import com.ljwd.plms.mapp.vo.egress.AppOutVisitTaskPlanResultVo;
import com.ljwd.plms.mapp.vo.egress.AppOutVisitTaskResultVo;
import com.ljwd.plms.mapp.vo.egress.AppUserVo;
import com.ljwd.plms.web.model.outVisit.PlmsOvmOutVisitPlan;
import com.ljwd.plms.web.model.outVisit.PlmsOvmOutVisitSign;
import com.ljwd.plms.web.service.outVisit.inf.PlmsOvmOutVisitPlanService;
import org.apache.ibatis.session.RowBounds;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * 外访计划模块
 * Created by tangjialin on 2016-10-31 0031.
 */
@RestController
@RequestMapping("/egressPlan")
public class EgressPlanController extends MAppAbstractController {
    /** 外访计划-考查 */
    public static final String VISIT_TYPE_EXAMINE = "1";
    /** 外访计划-协催 */
    public static final String VISIT_TYPE_URGING = "2";
    @Resource
    private PlmsOvmOutVisitPlanService outVisitPlanService;

    /**
     * 外访计划查询
     * <pre>
     * 请求信息:{"date":"2016-10-19"}
     *     date   : 数据查询日期.格式固定为:yyyy-MM-dd
     *
     * 响应信息:
     * {"message":null,"statusCode":0,"success":true,
     * "data":[
     *   {"applId":41653,"custName":"ny20160603","custId":41396,
     *     "planResult":[
     *       {"id":21,"address":"河北省邯郸市大名县56575675","planCode":"310000_2016110401"}
     *     ]
     *   },
     *   {"applId":42164,"custName":"嗯嗯","custId":41911,
     *     "planResult":[
     *       {"id":24,"address":"辽宁省抚顺市望花区ccc","planCode":"310000_2016110801"},
     *       {"id":25,"address":"上海上海市黄浦区嗯嗯","planCode":"310000_2016110901"}
     *     ]
     *   }
     * ]}
     * 键值对说明:
     *     success    : 处理成功返回true,否则返回false
     *     statusCode : 状态码.未定义,默认为0.
     *     message    : 当success返回为false时,此处返回服务器的错误描述
     *     data       : 响应结果时携带的数据.此处为数据结果集(数组)
     *     [{
     *       applId     : 贷款申请单主键
     *       custName   : 主贷人姓名
     *       custId     : 主贷人主键
     *       planResult : [{
     *         id            : 外访计划主键
     *         address       : 外访地址
     *         planCode      : 外访计划编号
     *         planStartTime : 外访时间(格式:yyyy-MM-dd)
     *       }]
     *      }]
     * </pre>
     * @param visitType 外访类型.1:考查,2:协催
     * @param request
     * @return 详见方法注释[响应信息]部分
     */
    public Result selectWithApp(String visitType, AESHttpServletRequestWrapper request) {
        JSONResult result = new JSONResult<>();
        try {
            JSONObject jsonObject = JSONUtil.parseObject(request.getDecryptedBodyContent());
            String dateString = jsonObject.getString("date"); // 查询日期,格式必须为yyyy-MM-dd(此处不直接获取其为Date类型,为了保证时分秒必须为0而减少一次日期转换)
            if (dateString == null) { return result.setMessage("参数错误"); }
            String userId = SessionManage.api.getLoginUser().getUserId();
            // 计算日期查询范围
            // 如查询2016-11-01的数据,使用BETWEEN [startDate] AND [endDate]
            // 因Oracle语法特性,使用BETWEEN AND是 >= startDate AND <= endDate
            // 故起始时间须为2016-11-01 00:00:00(请求携带时间参数只保留年月日)
            // 终止时间须为  2016-11-01 23:59:59(故起始时间 + 1天 - 1秒)
            Date visitStartDate = D.toDate(dateString, D.PATTERN_DATE);
            if (visitStartDate == null) { return result.setMessage("日期格式错误"); }
            Calendar calendar = Calendar.getInstance();      // 获得日历实例,用于计算日期
            calendar.setTime(visitStartDate);                // 设置计算的基准时间
            calendar.add(Calendar.DAY_OF_YEAR, 1); // 加一天
            calendar.add(Calendar.SECOND, -1);     // 减一秒
            Date visitEndDate = calendar.getTime();
            if (isInfoEnabled) {
                SimpleDateFormat dateFormat = new SimpleDateFormat(D.PATTERN_SECONDS);
                logger.info("外访时间 始:{} 止:{}", dateFormat.format(visitStartDate), dateFormat.format(visitEndDate));
            }

            Map<String, Object> param = new HashMap<>();
            param.put("visitStartDate", visitStartDate);
            param.put("visitEndDate", visitEndDate);
            param.put("visitType", visitType);
            param.put("visitUser", userId);
            param.put("planStatus", "Start");
            // 使用RowBounds.DEFAULT不分页
            List<AppOutVisitPlanResultVo> planResultVoList = outVisitPlanService.selectWithApp(RowBounds.DEFAULT, param);
            planResultVoList = planResultVoList == null ? new ArrayList<AppOutVisitPlanResultVo>(0) : planResultVoList;
            int size = planResultVoList.size();
            if (size == 0) { return result.setData(planResultVoList).setSuccess(true); }
            /*
             数据格式转换
             [
               {"applId":42164,"custName":"嗯嗯","custId":41911,"id":24,"address":"辽宁省抚顺市望花区ccc","planCode":"310000_2016110801"},
               {"applId":42164,"custName":"嗯嗯","custId":41911,"id":25,"address":"上海上海市黄浦区嗯嗯","planCode":"310000_2016110901"}
             ]
             转换为
             {
             "applId":42164,"custName":"嗯嗯","custId":41911,
               "planResult":[
                 {"id":24,"address":"辽宁省抚顺市望花区ccc","planCode":"310000_2016110801"},
                 {"id":25,"address":"上海上海市黄浦区嗯嗯","planCode":"310000_2016110901"}
               ]
             }
             */
            Map<Long, AppOutVisitTaskResultVo> resultVoMap = new LinkedHashMap<>(size, 1.0F);
            for (AppOutVisitPlanResultVo planResultVo : planResultVoList) {

                Long custId = planResultVo.getCustId();
                AppOutVisitTaskResultVo taskResultVo = resultVoMap.get(custId);
                boolean isPush = taskResultVo == null;
                taskResultVo = isPush ? new AppOutVisitTaskResultVo() : taskResultVo;
                if (isPush) {
                    resultVoMap.put(custId, taskResultVo);

                    taskResultVo.setApplId(planResultVo.getApplId());     // 贷款订单主键
                    taskResultVo.setCustId(planResultVo.getCustId());     // 贷款客户主键
                    taskResultVo.setCustName(planResultVo.getCustName()); // 贷款客户姓名
                }

                AppOutVisitTaskPlanResultVo taskPlanResultVo = new AppOutVisitTaskPlanResultVo();
                taskPlanResultVo.setId(planResultVo.getId());             // 外访计划主键
                taskPlanResultVo.setPlanCode(planResultVo.getPlanCode()); // 外访计划编号
                taskPlanResultVo.setAddress(planResultVo.getAddress());   // 外访计划地址
                taskResultVo.getPlanResult().add(taskPlanResultVo);
            }
            // 下面是数据格式转换 end
            result.setData(resultVoMap.values()).setSuccess(true);
        } catch (Exception e) {
            logger.error("外访任务查询类型:" + visitType, e);
            result.setData(new ArrayList<>(0)).setMessage("查询错误");
        }
        return result;
    }

    /**
     * 外访计划列表-协催
     * 详细参数见{@link EgressPlanController#selectWithApp(java.lang.String, com.ljwd.plms.mapp.filter.AESHttpServletRequestWrapper)}
     * @param request
     * @return 详见方法注释[响应信息]部分
     */
    @RequestMapping("/urging")
    public Result urgingList(AESHttpServletRequestWrapper request) {
        return selectWithApp(VISIT_TYPE_URGING, request);
    }

    /**
     * 外访计划列表-考查
     * 详细参数见{@link EgressPlanController#selectWithApp(java.lang.String, com.ljwd.plms.mapp.filter.AESHttpServletRequestWrapper)}
     * @param request
     * @return 详见方法注释[响应信息]部分
     */
    @RequestMapping("/examine")
    public Result examineList(AESHttpServletRequestWrapper request) {
        return selectWithApp(VISIT_TYPE_EXAMINE, request);
    }

    /**
     * 外访计划结果提交
     * <pre>
     * 提交外访结果时,需要做以下操作:
     * 1.外访详情记录至此处:PLMS_OVM_OUT_VISIT_PLAN.OVTRESULT_DETAIL
     * 2.更改计划状态:PLMS_OVM_OUT_VISIT_PLAN.PLAN_STATUS为End(结果已录)
     * 3.更改签到状态:PLMS_OVM_OUT_VISIT_PLAN.SIGN_STATUS为Signned(已签到)
     *
     * 参数说明:
     * 请求信息:
     *     json: {"planId":123,"visitType":"1","ovtResultDetail":"外访详情","lng":"123.11","lat":"123.45"}
     *       planId          : 外访计划ID(PLMS_OVM_OUT_VISIT_PLAN表主键)
     *       visitType       : 外访类型
     *                         1 : 考查
     *                         2 : 协催
     *       ovtResultDetail : 外访详情
     *       lng             : 经度
     *       lat             : 纬度
     *
     * 响应信息:
     * {"message":null,"statusCode":0,"success":true,"data":null}
     * 键值对说明:
     *     success    : 处理成功返回true,否则返回false
     *     statusCode : 状态码.未定义,默认为0.
     *     message    : 当success返回为false时,此处返回服务器的错误描述
     *     data       : 响应结果时携带的数据.此处为null
     *
     * </pre>
     * @param request
     * @return
     */
    @RequestMapping("/submitResult")
    public Result submitResult(AESHttpServletRequestWrapper request) {
        JSONResult result = new JSONResult();
        try {
            JSONObject jsonObject = JSONUtil.parseObject(request.getDecryptedBodyContent());
            long planId = jsonObject.getLongValue("planId");                  // 外访计划主键
            String visitType = jsonObject.getString("visitType");             // 外访类型
            String ovtResultDetail = jsonObject.getString("ovtResultDetail"); // 外访结果详情
            String lng = jsonObject.getString("lng");                         // 经度
            String lat = jsonObject.getString("lat");                         // 纬度
            if (lat == null || lat.isEmpty() || lng == null || lng.isEmpty()) { return result.setMessage("签到坐标不能为空"); }
            if (planId == 0) { return result.setMessage("外访计划主键不能为空"); }
            if (ovtResultDetail == null || ovtResultDetail.isEmpty()) { return result.setMessage("外访详情不能为空"); }
            if (!VISIT_TYPE_EXAMINE.equals(visitType) && !VISIT_TYPE_URGING.equals(visitType)) {
                return result.setMessage("外访类型错误");
            }

            PlmsOvmOutVisitPlan visitPlan = outVisitPlanService.selectById(planId);
            if (visitPlan == null) { return result.setMessage("外访计划不存在"); }
            if (!"Signning".equals(visitPlan.getSignStatus())) { return result.setMessage("非计划中的外访计划不允许此操作"); }
            if (!"Start".equals(visitPlan.getPlanStatus())) { return result.setMessage("外访计划已取消或已提交"); }
            if (visitPlan.getSignId() != null) { return result.setMessage("结果已提交,不允许多次提交"); }

            Date date = new Date(); // 同一批数据,时间必须一样
            AppUserVo loginUser = SessionManage.api.getLoginUser();
            String userId = loginUser.getUserId();
            // 签到信息
            // http://restapi.amap.com/v3/geocode/regeo?key=您的key&location=116.481488,39.990464&radius=1000&extensions=base&batch=false
            // 详见http://lbs.amap.com/api/webservice/guide/api/georegeo/#regeo
            String aMapUrl = ConfigUtil.getStringVal("interface.config.amap.api.server.base.url");
            aMapUrl = aMapUrl.endsWith("/") ? aMapUrl.substring(0, aMapUrl.length() - 1) : aMapUrl;
            String aMapKey = ConfigUtil.getStringVal("interface.config.amap.api.server.key");
            aMapUrl = String.format("%s/geocode/regeo?key=%s&location=%s,%s&radius=1000&extensions=base&batch=false", aMapUrl, aMapKey, lng, lat);
            String regeoJSONString = HttpUtils.sendGet(aMapUrl);
            if (isInfoEnabled) { logger.info("逆地理编码的响应结果:{}", regeoJSONString); }
            JSONObject regeoObject = JSONUtil.parseObject(regeoJSONString);
            boolean status = regeoObject.getBooleanValue("status");
            if (!status) { return result.setMessage("无法获取位置信息,请您到开阔的空间再次尝试"); }
            JSONObject regeocode = regeoObject.getJSONObject("regeocode");
            if (regeocode == null || regeocode.isEmpty()) { return result.setMessage("无法获取位置信息,请您到开阔的空间再次尝试"); }
            String address = regeocode.getString("formatted_address");
            if (address == null || address.isEmpty() || address.equals("[]")) { return result.setMessage("无法获取位置信息,请您到开阔的空间再次尝试"); }
            PlmsOvmOutVisitSign visitSign = new PlmsOvmOutVisitSign();
            visitSign.setPlanId(planId);
            visitSign.setSignAddress(address);
            visitSign.setSignBy(userId);
            visitSign.setSignTime(date);
            visitSign.setUpdateTime(date);
            visitSign.setCreateTime(date);
            visitSign.setCreatedBy(userId);
            visitSign.setUpdatedBy(userId);

            // 外访计划信息
            PlmsOvmOutVisitPlan saveVisitPlan = new PlmsOvmOutVisitPlan();
            saveVisitPlan.setId(planId);
            saveVisitPlan.setUpdateTime(date);
            saveVisitPlan.setPlanStatus("End");
            saveVisitPlan.setSignStatus("Signned");
            saveVisitPlan.setOvtresultDetail(ovtResultDetail);
            saveVisitPlan.setRecVer(visitPlan.getRecVer());
            saveVisitPlan.setInfoId(visitPlan.getInfoId());
            saveVisitPlan.setAddressType(visitPlan.getAddressType());
            
            outVisitPlanService.submitResult(saveVisitPlan, visitSign);
            result.setSuccess(true);
        } catch (Exception e) {
            logger.error("外访结果提交异常", e);
            result.setMessage("外访结果提交失败");
        }
        return result;
    }

//
//    /**
//     * 外访计划结果提交
//     * <pre>
//     * 提交外访结果时,需要做以下操作:
//     * 1.外访详情记录至此处:PLMS_OVM_OUT_VISIT_PLAN.OVTRESULT_DETAIL
//     * 2.更改计划状态:PLMS_OVM_OUT_VISIT_PLAN.PLAN_STATUS为End(结果已录)
//     * 3.更改签到状态:PLMS_OVM_OUT_VISIT_PLAN.SIGN_STATUS为Signned(已签到)
//     * 4.现场图片及现场录音存至此表PLMS_LN_ANNEX
//     * 5.插入提交结果时的信息到签到表(PLMS_OVM_OUT_VISIT_SIGN)
//     *
//     * 参数说明:
//     * 请求信息:
//     *     json: {"planId":123,"visitType":"1","ovtResultDetail":"外访详情"}
//     *       planId          : 外访计划ID(PLMS_OVM_OUT_VISIT_PLAN表主键)
//     *       visitType       : 外访类型
//     *                         1 : 考查
//     *                         2 : 协催
//     *       ovtResultDetail : 外访详情
//     *
//     * 响应信息:
//     * {"message":null,"statusCode":0,"success":true,"data":null}
//     * 键值对说明:
//     *     success    : 处理成功返回true,否则返回false
//     *     statusCode : 状态码.未定义,默认为0.
//     *     message    : 当success返回为false时,此处返回服务器的错误描述
//     *     data       : 响应结果时携带的数据.此处为null
//     *
//     * 注意:参数上传方式按照表单上传附件中参数的上传方式,如下.
//     * --1476848718690
//     * Content-Disposition: form-data; name="json"
//     *
//     * Base64_encode(AES({"planId":123,"visitType":"1","ovtResultDetail":"外访详情"}))
//     * --1476848718690
//     * Content-Disposition: form-data; name="文件参数名称(file)"; filename="文件名称(坐标.txt)"
//     * Content-Type:application/octet-stream
//     *
//     * (文件内容)
//     * --1476848718690--
//     *
//     * 文件内容为JSON格式的数组内嵌套键值对.格式示例如下:
//     * [
//     * {"lng":114.075,"lat":22.547,"accuracy":5.00,"dateTime":"2016-10-10 12:13:12","option":0},
//     * {"lng":114.075,"lat":22.548,"accuracy":5.00,"dateTime":"2016-10-10 12:25:13","option":1}
//     * ]
//     * 文件内容键值对说明:
//     *     lng      : 经度
//     *     lat      : 纬度
//     *     accuracy : 精度(单位:米)
//     *     dateTime : 时间(格式:yyyy-MM-dd HH:mm:ss)
//     *     option   : 选项.0或null:普通坐标;1:提交外访结果时追加的坐标.
//     * </pre>
//     * @param request
//     * @return
//     */
//    @AESAuthen(requestCheckAndBody = false, requestDecrypt = false, requestLog = false)
//    @RequestMapping("/submitResult")
//    public Result submitResult(HttpServletRequest request) {
//        JSONResult result = new JSONResult();
//        try {
//            // 从请求中解析上传的文件
//            if (!(request instanceof DefaultMultipartHttpServletRequest)) { return result.setMessage("文件缺失"); }
//            DefaultMultipartHttpServletRequest multipartHttpServletRequest = (DefaultMultipartHttpServletRequest) request;
//            Map<String, MultipartFile> multipartFileMap = multipartHttpServletRequest.getFileMap();
//            if (multipartFileMap == null || multipartFileMap.isEmpty()) { return result.setMessage("文件缺失"); }
//
//            HttpServletRequest tempRequest = multipartHttpServletRequest.getRequest();
//            if (!(tempRequest instanceof AESHttpServletRequestWrapper)) { return result.setMessage("认证错误"); }
//            AESHttpServletRequestWrapper aesRequest = (AESHttpServletRequestWrapper) tempRequest;
//
//            String jsonString = request.getParameter("json");
//            if (jsonString == null || jsonString.isEmpty()) { return result.setMessage("参数错误"); }
//            jsonString = AES.instance.decrypt(jsonString, aesRequest.getSecretKey()); // 数据解密
//            if (isInfoEnabled) { logger.info("请求参数:{}", jsonString); }
//            jsonString = jsonString.replace("\"(null)\"", "null");
//
//            JSONObject jsonObject = JSONUtil.parseObject(jsonString);
//            long planId = jsonObject.getLongValue("planId");
//            String visitType = jsonObject.getString("visitType");
//            String ovtResultDetail = jsonObject.getString("ovtResultDetail");
//            if (planId == 0) { return result.setMessage("外访计划主键不能为空"); }
//            if (ovtResultDetail == null || ovtResultDetail.isEmpty()) { return result.setMessage("外访详情不能为空"); }
//            if (!VISIT_TYPE_EXAMINE.equals(visitType) && !VISIT_TYPE_URGING.equals(visitType)) {
//                return result.setMessage("外访类型错误");
//            }
//
//            // 单文件上传,读取一个文件即可
//            Map.Entry<String, MultipartFile> multipartFileEntry = multipartFileMap.entrySet().iterator().next();
//            MultipartFile multipartFile = multipartFileEntry.getValue();
//            String context = IOUtils.toString(multipartFile.getInputStream(), null, true);
//            if (context == null || context.isEmpty()) { return result.setMessage("上传文件内容为空"); }
//            context = context.trim();
//
//            // 解析文件内容
//            List<PlmsAppMapPoint> plmsClMapList = JSONUtil.parseArray(context, PlmsAppMapPoint.class);
//            if (plmsClMapList == null || plmsClMapList.isEmpty()) { return result.setMessage("上传文件内容为空"); }
//            if (isInfoEnabled) { logger.info("坐标定位点:{}个", plmsClMapList.size()); }
//
//            PlmsOvmOutVisitPlan visitPlan = outVisitPlanService.selectById(planId);
//            if (visitPlan == null) { return result.setMessage("外访计划不存在"); }
//            if (!"Start".equals(visitPlan.getPlanStatus())) { return result.setMessage("外访计划已取消或已提交"); }
//            if (!"Signning".equals(visitPlan.getSignStatus())) { return result.setMessage("非计划中的外访计划不允许此操作"); }
//
//            Date date = new Date(); // 同一批数据,时间必须一样
//            AppUserVo loginUser = SessionManage.api.getLoginUser();
//            String userId = loginUser.getUserId();
//            // 外访定位坐标点
//            PlmsAppMapPoint searchPOIPoint = null;
//            Integer option = null;
//            for (PlmsAppMapPoint plmsClMap : plmsClMapList) {
//                plmsClMap.setPlanId(planId);
//                plmsClMap.setCreatedBy(userId);
//                plmsClMap.setUpdatedBy(userId);
//                plmsClMap.setCreateTime(date);
//                plmsClMap.setUpdateTime(date);
//                if (searchPOIPoint == null && (option = plmsClMap.getOption()) != null && option == 1) {
//                    searchPOIPoint = plmsClMap;
//                }
//            }
//            if (searchPOIPoint == null) { return result.setMessage("缺少提交坐标"); }
//            // 签到信息
//            // http://restapi.amap.com/v3/geocode/regeo?key=您的key&location=116.481488,39.990464&radius=1000&extensions=base&batch=false
//            // 详见http://lbs.amap.com/api/webservice/guide/api/georegeo/#regeo
//            String aMapUrl = ConfigUtil.getStringVal("interface.config.amap.api.server.base.url");
//            aMapUrl = aMapUrl.endsWith("/") ? aMapUrl.substring(0, aMapUrl.length() - 1) : aMapUrl;
//            String aMapKey = ConfigUtil.getStringVal("interface.config.amap.api.server.key");
//            aMapUrl = String.format("%s/geocode/regeo?key=%s&location=%s,%s&radius=500&extensions=base&batch=false", aMapUrl, aMapKey, searchPOIPoint.getLat(), searchPOIPoint.getLng());
//            String regeoJSONString = HttpUtils.sendGet(aMapUrl);
//            if (isInfoEnabled) { logger.info("逆地理编码的响应结果:{}", regeoJSONString); }
//            JSONObject regeoObject = JSONUtil.parseObject(regeoJSONString);
//            boolean status = regeoObject.getBooleanValue("status");
//            if (!status) { return result.setMessage("无法获取位置信息,请您到开阔的空间再次尝试"); }
//            JSONObject regeocode = regeoObject.getJSONObject("regeocode");
//            if (regeocode == null || regeocode.isEmpty()) { return result.setMessage("无法获取位置信息,请您到开阔的空间再次尝试"); }
//            String address = regeocode.getString("formatted_address");
//            if (address == null || address.isEmpty()) { return result.setMessage("无法获取位置信息,请您到开阔的空间再次尝试"); }
//            PlmsOvmOutVisitSign visitSign = new PlmsOvmOutVisitSign();
//            visitSign.setPlanId(planId);
//            visitSign.setSignAddress(address);
//            visitSign.setSignBy(userId);
//            visitSign.setSignTime(date);
//            visitSign.setUpdateTime(date);
//            visitSign.setCreateTime(date);
//            visitSign.setCreatedBy(userId);
//            visitSign.setUpdatedBy(userId);
//
//            // 外访计划信息
//            PlmsOvmOutVisitPlan saveVisitPlan = new PlmsOvmOutVisitPlan();
//            saveVisitPlan.setId(planId);
//            saveVisitPlan.setUpdateTime(date);
//            saveVisitPlan.setPlanStatus("End");
//            saveVisitPlan.setSignStatus("Signned");
//            saveVisitPlan.setRecVer(visitPlan.getRecVer());
//
//            outVisitPlanService.submitResult(saveVisitPlan, plmsClMapList, visitSign);
//            result.setSuccess(true);
//        } catch (Exception e) {
//            logger.error("外访结果提交异常", e);
//            result.setMessage("外访结果提交失败");
//        }
//        return result;
//    }

    /**
     * 外访计划列表
     * <pre>
     * 请求信息:{"pageNo":"1"}
     *     pageNo : 数据查询页码.起始值为1
     *
     * 响应信息:
     * {"message":null,"statusCode":0,"success":true,
     * "data":[
     * {"id":4,"applId":41815,"address":"53535","planCode":"310000_2016101702","planStartTime":"2016-10-18","custName":"九五五","custId":91054}
     * ]}
     * 键值对说明:
     *     success    : 处理成功返回true,否则返回false
     *     statusCode : 状态码.未定义,默认为0.
     *     message    : 当success返回为false时,此处返回服务器的错误描述
     *     data       : 响应结果时携带的数据.此处为数据结果集(数组)
     *      [{
     *      id            : 外访计划主键
     *      applId        : 贷款申请单主键
     *      address       : 外访地址
     *      planCode      : 外访计划编号
     *      planStartTime : 外访时间(格式:yyyy-MM-dd)(2016年12月12日改为外访签到表签到时间)
     *      custName      : 主贷人姓名
     *      custId        : 主贷人主键
     *      }]
     * </pre>
     * @param request
     * @return
     */
    @RequestMapping("/history")
    public Result history(AESHttpServletRequestWrapper request) {
        JSONResult result = new JSONResult();
        try {
            JSONObject jsonObject = JSONUtil.parseObject(request.getDecryptedBodyContent());
            int pageNo = jsonObject.getIntValue("pageNo");    // 分页查询页码,起始值为1
            if (pageNo <= 0) { return result.setMessage("参数错误"); }
            String userId = SessionManage.api.getLoginUser().getUserId();
            // 计算日期查询范围
            // 如查询2016-08-01至2016-11-01的数据,使用BETWEEN [startDate] AND [endDate]
            // 因Oracle语法特性,使用BETWEEN AND是 >= startDate AND <= endDate
            // 基准时间为 2016-11-01 00:00:00(当前系统时间只保留年月日)
            // 起始时间为 2016-08-01 00:00:00(基准时间 - 3月)
            // 终止时间为 2016-11-01 23:59:59(基准时间 + 1天 - 1秒)
            SimpleDateFormat patternDateFormat = new SimpleDateFormat(D.PATTERN_DATE);
            Calendar calendar = Calendar.getInstance(); // 获得日历实例,用于计算日期
            // 系统时间(基准时间)
            Date fiducialDate = patternDateFormat.parse(patternDateFormat.format(calendar.getTime()));
            calendar.setTime(fiducialDate);                  // 设置日历为基准时间
            calendar.add(Calendar.MONTH, -3);      // 减三个月
            Date visitStartDate = calendar.getTime();        // 故起始时间

            calendar.setTime(fiducialDate);                  // 设置日历为基准时间
            calendar.add(Calendar.DAY_OF_YEAR, 1); // 加一天
            calendar.add(Calendar.SECOND, -1);     // 减一秒
            Date visitEndDate = calendar.getTime();

            if (isInfoEnabled) {
                SimpleDateFormat dateFormat = new SimpleDateFormat(D.PATTERN_SECONDS);
                logger.info("外访历史查询时间 始:{} 止:{}", dateFormat.format(visitStartDate), dateFormat.format(visitEndDate));
            }

            Map<String, Object> param = new HashMap<>();
            param.put("visitStartDate", visitStartDate);
            param.put("visitEndDate", visitEndDate);
            param.put("visitUser", userId);
            List<AppOutVisitPlanResultVo> outVisitPlanList = outVisitPlanService.selecthistory(RowBounds.DEFAULT, param);
            outVisitPlanList = outVisitPlanList == null ? new ArrayList<AppOutVisitPlanResultVo>(0) : outVisitPlanList;
            result.setData(outVisitPlanList).setSuccess(true);
        } catch (Exception e) {
            logger.error("外访历史查询异常", e);
            result.setData(new ArrayList<>(0)).setMessage("查询错误");
        }
        return result;
    }

}
