package com.ljwd.plms.mapp.controller.customer;

import com.alibaba.fastjson.JSONObject;
import com.ljwd.plms.core.entity.JSONResult;
import com.ljwd.plms.core.entity.Result;
import com.ljwd.plms.core.util.JSONUtil;
import com.ljwd.plms.mapp.controller.MAppAbstractController;
import com.ljwd.plms.mapp.filter.AESHttpServletRequestWrapper;
import com.ljwd.plms.mapp.vo.customer.APPApplInfoVo;
import com.ljwd.plms.mapp.vo.customer.APPCustInfoVo;
import com.ljwd.plms.web.service.cust.inf.PlmsClCustInfoService;
import com.ljwd.plms.web.service.cust.inf.PlmsLnApplInfoService;
import com.ljwd.plms.web.wsdl.webservice.LoanServiceWSDL;
import com.ljwd.plms.web.wsdl.webservice.service.CalculateSummaryReceivableClientInfoDto;
import com.ljwd.plms.web.wsdl.webservice.service.CalculateSummaryReceivableParamDto;
import com.ljwd.plms.web.wsdl.webservice.service.SimulateCalculateSummaryReceivableResultDto;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Date;

/**
 * 客户信息
 * Created by tangjialin on 2016-10-20 0020.
 */
@RestController
@RequestMapping("/customer")
public class CustomerController extends MAppAbstractController {

    @Resource
    private PlmsClCustInfoService custInfoService;
    @Resource
    private PlmsLnApplInfoService applInfoService;

    /**
     * 客户基本信息
     * <pre>
     * 请求信息:{"id":1479}
     *     id : 客户ID(CL_CUST表主键)
     *
     * 响应信息:
     * {"message":null,"statusCode":0,"success":true,
     * "data":{
     *   "id":1479,
     *   "custName":"陈业X",
     *   "idCardNo":"440xxxxxxxxxxxx227",
     *   "mobile":"139xxxx1997",
     *   "houseTel":"83310122",
     *   "education":"高中或中专",
     *   "unitName":"深圳市江信实业发展有限公司",
     *   "position":"总经理",
     *   "unitTel":"83310122",
     *   "marriage":true,
     *   "spouseName":"郑汉英",
     *   "spouseTel":"138xxxx9082"
     * }}
     * 键值对说明:
     *     success    : 处理成功返回true,否则返回false
     *     statusCode : 状态码.未定义,默认为0.
     *     message    : 当success返回为false时,此处返回服务器的错误描述
     *     data       : 客户信息.
     *      {
     *      id         : 客户主键
     *      custName   : 客户姓名
     *      idCardNo   : 证件号码
     *      mobile     : 手机号
     *      houseTel   : 住宅电话
     *      education  : 教育程度/学历
     *      unitName   : 公司名称
     *      unitTel    : 公司电话
     *      marriage   : 婚姻状况.true:已婚,false:未婚
     *      spouseName : 配偶姓名
     *      spouseTel  : 配偶手机号
     *      }
     * </pre>
     *
     * @param request
     * @return
     */
    @RequestMapping("/base")
    public Result baseInfo(AESHttpServletRequestWrapper request) {
        JSONResult result = new JSONResult<>();
        try {
            JSONObject jsonObject = JSONUtil.parseObject(request.getDecryptedBodyContent());
            long id = jsonObject.getLongValue("id");
            if (id <= 0) { return result.setMessage("参数错误"); }
            APPCustInfoVo custInfoVo = custInfoService.selectClCustById(id);
            if (custInfoVo == null) { return result.setMessage("用户信息不存在"); }
            result.setData(custInfoVo).setSuccess(true);
        } catch (Exception e) {
            logger.error("主贷人基本信息查询异常", e);
            result.setMessage("主贷人信息获取失败");
        }
        return result;
    }

    /**
     * 客户贷款信息
     * <pre>
     * 请求信息:{"id":1304}
     *     id : 贷款表主键(LN_APPL_INFO表主键)
     *
     * 响应信息:
     * {"message":null,"statusCode":0,"success":true,
     * "data":{
     *   "id":1304,
     *   "cntrctNo":"深金贷CL-888-00053-1",
     *   "loanPeriod":12,
     *   "loanAmt":300000,
     *   "clearAmt":null,
     *   "receivableAmt":null,
     *   "paidPeriod":null,
     *   "overdueDays":null,
     *   "applCode":"888112070700025",
     *   "applAmt":"500000"
     * }}
     * 键值对说明:
     *     success    : 处理成功返回true,否则返回false
     *     statusCode : 状态码.未定义,默认为0.
     *     message    : 当success返回为false时,此处返回服务器的错误描述
     *     data       : 响应结果时携带的数据.此处为数据结果集(数组)
     *      {
     *      id            : 贷款订单主键
     *      cntrctNo      : 合同编号
     *      loanPeriod    : 贷款期数
     *      loanAmt       : 贷款金额(协催)/合同金额(考查)
     *      clearAmt      : 结清金额
     *      receivableAmt : 应还金额
     *      paidPeriod    : 已还期数
     *      overdueDays   : 逾期天数
     *      applCode      : 申请编号
     *      applAmt       : 申请额度
     *      }
     * </pre>
     * @param request
     * @return
     */
    @RequestMapping("/loan")
    public Result loan(AESHttpServletRequestWrapper request) {
        JSONResult result = new JSONResult<>();
        try {
            JSONObject jsonObject = JSONUtil.parseObject(request.getDecryptedBodyContent());
            long id = jsonObject.getLongValue("id");
            if (id <= 0) { return result.setMessage("参数错误"); }
            APPApplInfoVo applInfoVo = applInfoService.selectByApplId(id);
            if (applInfoVo == null) { return result.setMessage("贷款信息不存在"); }

            CalculateSummaryReceivableParamDto param = new CalculateSummaryReceivableParamDto();
            param.setIsRenewLoanRepayment(false);
            param.setRepaymentDate(new Date());
            param.setContractNo(applInfoVo.getCntrctNo());
            param.setIdCardNo(applInfoVo.getIdCardNo());
            // 提前结清
            param.setIsInAdvanceRepayment(true);
            SimulateCalculateSummaryReceivableResultDto resultDto = LoanServiceWSDL.getService().calculateSummaryReceivable(param);
            if (resultDto != null) {
                applInfoVo.setClearAmt(resultDto.getReceivableSumaryAmount());     // 提前结清金额
            }
            // 正常还款
            param.setIsInAdvanceRepayment(false);
            resultDto = LoanServiceWSDL.getService().calculateSummaryReceivable(param);
            if (resultDto != null) {
                applInfoVo.setReceivableAmt(resultDto.getReceivableSumaryAmount());// 正常还款金额
                applInfoVo.setOverdueDays(resultDto.getOverdueDays());             // 逾期天数
                CalculateSummaryReceivableClientInfoDto calculateClientInfoDto = resultDto.getCalculateClientInfoDto();
                applInfoVo.setPaidPeriod(calculateClientInfoDto == null ? null : calculateClientInfoDto.getPaidPeriodNumber());  // 已还期数
            }
            result.setData(applInfoVo).setSuccess(true);
        } catch (Exception e) {
            logger.error("贷款信息查询异常", e);
            result.setMessage("贷款信息获取失败");
        }
        return result;
    }
}
