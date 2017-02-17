package com.ljwd.plms.web.wsdl.webservice;

import com.ljwd.plms.core.util.ConfigUtil;
import com.ljwd.plms.core.util.EncryptUtils;
import com.ljwd.plms.web.wsdl.webservice.service.LoanService;
import com.ljwd.plms.web.wsdl.webservice.service.LoanServiceService;
import com.ljwd.plms.web.wsdl.webservice.service.UserProfileDto;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.xml.ws.BindingProvider;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

/**
 * 调用方式请参考com.ufclub.loan.eloan.business.service.LoanService#submit
 * <pre>
 * 错误信息汇总:
 * MFBMS_COR_00001:编号不能重复
 * MFBMS_COR_00002:带*号内容必须填写
 * MFBMS_COR_00003:名称不能重复
 * MFBMS_COR_00004:不能删除正被使用的数据；也不能保存重复数据。
 * MFBMS_COR_00005:不能删除正被使用的数据。
 * MFBMS_COR_20004:删除将不能恢复，您确认删除吗？
 * MFBMS_COR_20005:你将放弃本次操作，请确认
 * MFBMS_COR_00050:{0}不能为空.
 * MFBMS_CMP_00001:当前网点有组织机构或贷款记录关联，不可以删除
 * MFBMS_CMP_00002:当前机构有员工信息，不可以删除
 * MFBMS_CMP_00003:当前角色有用户信息，不可以删除
 * MFBMS_CMP_00004:员工姓名与工号不能同时与现有记录重复
 * MFBMS_CMP_00005:用户有待办业务，或者有业务数据，不可以删除，请设置员工信息为离职或者冻结用户
 * MFBMS_CMP_00006:用户名不能现有记录重复
 * MFBMS_CMP_30007:冻结{0}成功！
 * MFBMS_CMP_30008:解冻{0}成功！
 * MFBMS_CMP_30009:重置密码完成，请通知用户及时修改密码！
 * MFBMS_CMP_30010:新增用户完成，请通知用户及时修改密码！
 * MFBMS_COR_00006:用户名密码不正确
 * MFBMS_COR_00007:验证码不正确
 * MFBMS_COR_00008:用户状态不正常，请与系统管理员联系
 * MFBMS_COR_00009:原密码不正确
 * MFBMS_COR_00010:新密码不正确，请输入不少于6位的字母/数字的组合
 * MFBMS_COR_00011:新密码与确认新密码不相同
 * MFBMS_COR_00013:不能保存重复数据。
 * MFBMS_CMP_00007:员工有对应的用户信息,请先删除用户信息
 * MFBMS_CMP_00008:新增的工作日必须为将来的日期
 * MFBMS_CMP_00009:新增的节假日必须为将来的日期
 * MFBMS_CMP_00010:本年度已经存在相同的设置,请检查
 * MFBMS_CMP_00011:节假日必须为除周六周日外的国家法定假期
 * MFBMS_CMP_00012:工作日必须为因国家法定节假日导致的周六周日上班,不能设置为周一至周五的日期
 * MFBMS_CMP_00013:节假日年度必须至少包含一个节假日或工作日
 * MFBMS_CMP_00014:新增的节假日/工作日必须在节假日年度内
 * MFBMS_CMP_00015:若机构是网点,请必须选择所属网点
 * MFBMS_CMP_00016:若员工是贷款顾问或贷款主任,则网点信息不能为空,请检查机构设置
 * MFBMS_COR_00012:开始日期必须小于或者等于结束日期
 * MFBMS_LAP_00001:身份证号必须是15位或18位
 * MFBMS_LAP_00002:申请日期必须为今天或者之前
 * MFBMS_LAP_30001:贷款申请保存成功!
 * MFBMS_LAP_00003:请输入配偶信息
 * MFBMS_LAP_00004:此主贷人存在贷款申请在{0}状态中，不能提交申请
 * MFBMS_LAP_00005:此主贷人在过去30天内有被拒绝的贷款，不能提交申请
 * MFBMS_LAP_00006:同一个证件号码不允许存在未结清的贷款！不能提交申请。
 * MFBMS_LAP_30002:材料收集情况保存成功!
 * MFBMS_LAP_00007:上传的附件大小不能超过100M!
 * MFBMS_LAP_30003:附件上传成功!
 * MFBMS_LAP_30004:信用报告保存成功!
 * MFBMS_LAP_30005:客户分配成功!
 * MFBMS_LAP_00010:不允许删除,客户分配至少需要选择一条贷款记录
 * MFBMS_LAP_00008:请至少选择一条贷款申请记录
 * MFBMS_LAP_00009:附件类别为交单资料时，附件类型必须选择
 * MFBMS_LAP_00011:主贷人住宅信息,职业资料,公司资料和联系人信息都必须至少有一条记录。
 * MFBMS_LAP_00056:当贷款产品为“金薪贷”时，社保电脑号必填。
 * MFBMS_LAP_00057:金商贷、白金贷、快捷贷自雇客户，请填写对应的职业资料中“成立日期、雇员人数、经营场所、月均营业额、成本支出、月盈利”
 * MFBMS_LAP_00054:职业资料中经营场所为租用，请填写租金
 * MFBMS_LAP_00053:职业资料中经营场所为按揭，请填写月供
 * MFBMS_LAU_00001:批核额度和期限必须输入!
 * MFBMS_LAU_20001:是否确认同意该贷款申请?
 * MFBMS_LAU_30001:操作成功
 * MFBMS_LAU_00002:请输入拒绝原因
 * MFBMS_LAU_30002:操作完成
 * MFBMS_LAU_00003:请输入回退步骤和原因!
 * MFBMS_LAU_00004:请输入取消原因!
 * MFBMS_LAU_30003:警告!本次贷款后，此客户有负资产:{0}元,负债/资产占比为{1}
 * MFBMS_LAU_00005:请输入撤销审批原因!
 * MFBMS_LAU_00006:不允许删除,审批分配至少需要选择一条贷款记录
 * MFBMS_LAU_00007:请至少选择一条贷款审批记录
 * MFBMS_LAU_30004:审批分配成功!
 * MFBMS_LAU_00008:所选择的审批记录必须是同一产品并且在同一审批级别
 * MFBMS_LAU_00009:审批人{0}已经审批过申请记录{1},请重新选择!
 * MFBMS_LAU_00010:审批金额不能大于申请金额！
 * MFBMS_CHK_30001:贷款申请单分配成功
 * MFBMS_CHK_00001:请选择调查用户
 * MFBMS_CHK_00002:请选择贷款申请单
 * MFBMS_CHK_00003:贷款申请单分配失败!
 * MFBMS_CHK_00004:“评估价值”不能小于“贷款余额”
 * MFBMS_AUD_00001:请选择审计用户
 * MFBMS_AUD_00002:已达到今日最大审单量，不可再分配
 * MFBMS_AUD_00003:已达到今日最大审单量，不可再分配
 * MFBMS_AUD_00004:所选记录存在审计中的记录
 * MFBMS_AUD_00005:当前记录已在审计中，不能保存
 * MFBMS_AUD_00006:所选记录总数不可大于当前今日分配剩余量
 * MFBMS_AUD_00007:不允许删除,客户分配至少需要选择一条贷款记录
 * MFBMS_AUD_00008:不可查看，今日剩余可查看申请次数为0
 * MFBMS_AUD_00009:分配量不可超过每日最大审单量的用户
 * MFBMS_AUD_00010:此贷款申请已在审计中
 * MFBMS_AUD_00011:没有找到满足条件的记录
 * MFBMS_AUD_00012:必须填写一个查询条件
 * MFBMS_BOK_00001:"*"项必须填写。
 * MFBMS_BOK_00002:请输入退回原因。
 * MFBMS_BOK_00003:请输入取消原因。
 * MFBMS_CON_00001:账户信息必须要收款帐号和扣款帐号各一个，请增加帐户信息，或删除多余的账户信息。
 * MFBMS_CON_30001:客户账户保存成功
 * MFBMS_CON_00002:请输入贷款期数。
 * MFBMS_CON_00003:请输入作废理由。
 * MFBMS_CON_00004:放款日期小于今天，您确认继续操作吗？
 * MFBMS_CON_00005:起息日期小于今天，您确认继续操作吗？
 * MFBMS_CON_30002:合同保存成功
 * MFBMS_CON_30003:操作成功
 * MFBMS_CON_00006:您当前填写的客户帐号信息不完整，您确认继续操作吗？
 * MFBMS_CON_00007:您当前选择的业务类型为“趸缴业务”，期数不为36，您确认继续操作吗？
 * MFBMS_CON_00008:您本次修改了合同期数，请先执行“保存”操作
 * MFBMS_CON_00009:您当前选择的业务类型为“平缴业务”，期数不为36，您确认继续操作吗？
 * MFBMS_CMP_00017:产品编号不能与现有记录重复
 * MFBMS_CMP_00018:产品费用设置不能为空
 * MFBMS_CMP_00019:费用项的第一条记录的“从”必须为0
 * MFBMS_CMP_00020:费用项的最后一条的至必须为空
 * MFBMS_CMP_00021:费用项的前后两条记录必须首尾相连（前一条的从必须等于后一条的至）
 * MFBMS_CMP_00022:产品的费用项不能重复
 * MFBMS_CMP_00023:请输入百分比
 * MFBMS_CMP_00024:请输入固定值
 * MFBMS_CMP_00025:请输入"从"
 * MFBMS_CMP_00026:请输入"至"
 * MFBMS_CMP_00027:当前产品已经有相关的贷款申请记录不可以删除
 * MFBMS_CMP_20001:当前产品已经有相关的贷款申请记录,修改费用对已生成贷款计划表的贷款合同无效,请确认
 * MFBMS_CMP_00028:调查步骤必须至少选择一项
 * MFBMS_CMP_00029:所有步骤都必须填写工作量
 * MFBMS_CMP_00030:工作量必须为0或正数数值
 * MFBMS_CMP_00031:所有级别额度都必须填写
 * MFBMS_CMP_00032:额度必须为正数数值
 * MFBMS_CMP_00033:后一审批级别额度必须大于前一级别额度
 * MFBMS_CMP_00034:同级别审批用户已存在,请重新获取查询结果进行编辑
 * MFBMS_SYS_000001:系统错误{0}
 * MFBMS_SYS_001001:系统错误
 * MFBMS_SYS_001002:系统错误
 * MFBMS_SYS_001003:系统错误
 * MFBMS_SYS_001007:系统错误
 * MFBMS_SYS_001008:数据可能被其它用户修改，请刷新后重试。{0}
 * MFBMS_SYS_001009:记录可能被删除。
 * MFBMS_SYS_001101:无效用户ID
 * MFBMS_SYS_001102:密码错误
 * MFBMS_SYS_001103:您没有登录，或者长时间未使用导致登录失效，请重新登录。
 * MFBMS_SYS_001106:未授权访问
 * MFBMS_SYS_001201:系统错误
 * MFBMS_SYS_001202:系统错误
 * MFBMS_SYS_001203:数据可能被其它用户修改，请刷新后重试。
 * MFBMS_SYS_001204:系统错误
 * MFBMS_SYS_001205:系统错误
 * MFBMS_SYS_001301:客户端应用程序版本不再支持，请更新版本至{0}.
 * MFBMS_CLN_00001:系统错误。
 * MFBMS_CLN_00002:请稍候...
 * MFBMS_CLN_00003:不能连接到服务器，请联系管理员。
 * MFBMS_CLN_00004:请选择另外一个文件名。
 * MFBMS_CLN_00005:窗体正在打开，请稍候。
 * MFBMS_CLN_00006:未授权访问。
 * MFBMS_CLN_00007:您确定要退出应用程序吗？
 * MFBMS_CLN_00008:重新登录将会关闭所有窗体，继续吗？
 * MFBMS_CLN_00009:文件无法访问，请检查文件是否存在或者已经被其它程序打开。
 * MFBMS_CLN_00010:未授权访问文件，请检查安全设置。
 * MFBMS_WF_00001:系统错误。
 * MFBMS_WF_00002:流程信息不存在。
 * MFBMS_WF_00003:流程已经结束。
 * MFBMS_WF_00004:任务信息不存在。
 * MFBMS_WF_00005:任务已经结束。
 * MFBMS_WF_00006:缺少流程定义
 * MFBMS_WF_00007:提交人与处理人不一致。
 * MFBMS_WF_00008:任务可能被其它用户修改，请刷新之后重试。
 * MFBMS_WF_00009:任务已经被分配处理人，不能再次分配。
 * MFBMS_WF_00010:无法找到一个用户来处理这个任务。
 * MFBMS_CMP_00035:编码/名称/序号不能与已同一字典的其他记录重复
 * MFBMS_LAP_00012:申请额度必须在1万到50万之间
 * MFBMS_LAP_00013:当前客户不存在逾期或者正常还款的贷款申请，不能提交续贷申请。
 * MFBMS_LAP_00014:还款额不足以还清当前应收的所有余额。
 * MFBMS_OFF_00001:报盘/回盘的记录数不一致
 * MFBMS_OFF_00002:无效的文件格式
 * MFBMS_OFF_00003:文件不存在
 * MFBMS_OFF_00004:最少要选择一条报盘记录
 * MFBMS_OFF_00005:还款日期范围要在15天内
 * MFBMS_LAP_00015:还款金额不足以还清所有逾期的期数的费用。
 * MFBMS_LAP_00016:应还金额跟实还金额不相等。
 * MFBMS_LAP_00017:该预收款已经被退款，不能重复退款操作。
 * MFBMS_LAP_00018:该预收款处于'取消'状态，不能退款。
 * MFBMS_LAP_00019:该预收款不是属于最后一次还款，不能退款。
 * MFBMS_LAP_00020:该预收款对应的实收还存在一条'未处理'的预收款，请先处理'未处理'的预收款
 * MFBMS_LAP_00021:该预收款已经分配到了应还的期数中，不能退款。
 * MFBMS_LAP_00022:已经被部分退款的还款记录不能作退款操作。
 * MFBMS_LAP_00023:已经被取消的还款记录不能作退款操作。
 * MFBMS_LAP_00024:自动代扣的的回款是不可以做取消操作。
 * MFBMS_LAP_00025:该还款记录不是属于最后一次还款，不能取消。
 * MFBMS_LAP_00026:已经被部分退款的还款记录不能作取消操作.
 * MFBMS_LAP_00027:已经被取消的还款记录不能作取消操作。
 * MFBMS_LAP_00028:所选择的客户在系统中存在多笔贷款信息，请输入合同编号重新查询。
 * MFBMS_LAP_00029:入账金额必须大于0！
 * MFBMS_LAP_10001:该客户目前状态为已结清，多收金额入账后请在预收明细表查询，您确认继续操作吗？
 * MFBMS_LAP_00030:所操作的回款已经分配到了提前结清期数之前的费用，不能对该回款进行退款、取消的操作。
 * MFBMS_FIN_00001:此客户已报盘，在未回盘前，不可以进行入账操作，谢谢。
 * MFBMS_LAP_00031:该客户没有正在还款的贷款申请，不能做续贷。
 * MFBMS_OUT_00001:外包公司一级权重或二级权重累计之和需要在0%-100%，请修改
 * MFBMS_OUT_00002:最少要选择一条记录。
 * MFBMS_OUT_00004:当前日期要大于退案日期。
 * MFBMS_OUT_00003:委外次数超过了规定次数。
 * MFBMS_LAP_00032:缺少必要的信息，不能退款或取消回款。
 * MFBMS_LAP_00033:该还款记录已经锁定，不能作取消或退款操作。
 * MFBMS_LAP_00034:重扣金额必须大于0！
 * MFBMS_LAP_00035:贷款类型选择的是续贷，放款类别如果不是“自有资金”，则不能保存或提交。
 * MFBMS_OUT_00006:当前数据不是还款状态，不可以再提交。
 * MFBMS_OUT_00007:结案时间要大于等于委案时间。
 * MFBMS_LAP_00036:该还贷已经结清，不能做赎回操作。
 * MFBMS_LAP_00037:该还贷已经做了提前结清的操作，不能做赎回操作。
 * MFBMS_LAP_00038:上笔结清金额与合同确认签订计算出的金额不一致!
 * MFBMS_LAP_00039:实际放款金额必须大于0！
 * MFBMS_LAP_00040:预收款退款操作只能在结清状态后的多收款项。
 * MFBMS_LAP_00041:外部机构借款已经结清。{0}
 * MFBMS_LAP_00042:日期错误，找不到对应的提前还款期数。{0}
 * MFBMS_LAP_00043:日期错误，找到的对应的提前还款期数已经结清。{0}
 * MFBMS_LAP_00044:在对应的提前还款期数之前，存在未结清的期数。{0}
 * MFBMS_LAP_00045:申请日期不可以大于当前日期。
 * MFBMS_LAP_00046:该记录为调账记录，不能作退款操作。
 * MFBMS_LAP_00047:该回款后面有作调账操作，不能对该回款进行退款操作。
 * MFBMS_LAP_00055:导出数据超出10000条，请减少导出数据数量
 * MFBMS_OUT_00101:有计划中的案件，不可新增！
 * MFBMS_OUT_00102:请填写外访人员
 * MFBMS_OUT_00103:外访人员不是登录用户的记录，不可新增外访计划
 * MFBMS_OUT_00105:所属机构无对应行政区域
 * MFBMS_OUT_00106:此外访员已配置外访区域的数据，不可重复
 * MFBMS_CHA_00001:此申请编号的贷款记录状态未放款或不存在系统中
 * MFBMS_CHA_00002:请先填写申请编号
 * MFBMS_CHA_00003:未更改任何记录
 * MFBMS_CHA_00004:无具体数据
 * MFBMS_CHA_00005:未知修改类型
 * MFBMS_CHA_00006:已成功提交客户信息变更申请
 * MFBMS_CHA_00007:已成功批核客户信息变更申请，客户信息已变更
 * MFBMS_CHA_00008:已成功批核客户信息变更，由于此客户信息已变更，客户信息变更申请已“批核未修改”
 * MFBMS_CHA_00009:申请编号，客户姓名，身份证号码不能全部为空
 * MFBMS_CHA_00010:已拒绝客户信息变更申请
 * MFBMS_CHA_00011:已成功批核客户信息变更申请，扣款账户请到账户信息列表修改
 * </pre>
 * @author tangjialin on 2016-01-04 0004.
 */
public class LoanServiceWSDL {

    private static Logger logger = LoggerFactory.getLogger(LoanServiceWSDL.class);

    /** 这个变量是做同步用的 */
    private static final Object synchronizedObject = new Object();

    /** 微贷系统用户登录密码 */
    private static String password;

    /** 微贷系统用户登录帐号 */
    private static String userId;

    /** 微贷系统登录密码加密盐值 */
    private static String encryption;

    /** 微贷系统地址 */
    private static URL url;

    /** 微贷系统连接实例代理 */
    private static LoanService proxyService = null;

    /** 微贷系统登录用户信息 */
    private static UserProfileDto userProfileDto = null;

    private static Map<String, String> errorCodeMapping = new HashMap<>(256);

    static {
        userId = ConfigUtil.getStringVal("interface.config.mfbms.app.web.userid");
        password = ConfigUtil.getStringVal("interface.config.mfbms.app.web.pwd");
        encryption = ConfigUtil.getStringVal("interface.config.mfbms.app.web.encryption");
        String urlString = ConfigUtil.getStringVal("interface.config.mfbms.app.web.loan.url");
        try {
            url = new URL(urlString);
        } catch (MalformedURLException e) {
            if (logger.isErrorEnabled()) logger.error("错误的微贷接口地址:" + urlString, e);
        }
        errorCodeMapping.put("MFBMS_COR_00001", "编号不能重复");
        errorCodeMapping.put("MFBMS_COR_00002", "带*号内容必须填写");
        errorCodeMapping.put("MFBMS_COR_00003", "名称不能重复");
        errorCodeMapping.put("MFBMS_COR_00004", "不能删除正被使用的数据；也不能保存重复数据。");
        errorCodeMapping.put("MFBMS_COR_00005", "不能删除正被使用的数据。");
        errorCodeMapping.put("MFBMS_COR_20004", "删除将不能恢复，您确认删除吗？");
        errorCodeMapping.put("MFBMS_COR_20005", "你将放弃本次操作，请确认");
        errorCodeMapping.put("MFBMS_COR_00050", "{0}不能为空.");
        errorCodeMapping.put("MFBMS_CMP_00001", "当前网点有组织机构或贷款记录关联，不可以删除");
        errorCodeMapping.put("MFBMS_CMP_00002", "当前机构有员工信息，不可以删除");
        errorCodeMapping.put("MFBMS_CMP_00003", "当前角色有用户信息，不可以删除");
        errorCodeMapping.put("MFBMS_CMP_00004", "员工姓名与工号不能同时与现有记录重复");
        errorCodeMapping.put("MFBMS_CMP_00005", "用户有待办业务，或者有业务数据，不可以删除，请设置员工信息为离职或者冻结用户");
        errorCodeMapping.put("MFBMS_CMP_00006", "用户名不能现有记录重复");
        errorCodeMapping.put("MFBMS_CMP_30007", "冻结{0}成功！");
        errorCodeMapping.put("MFBMS_CMP_30008", "解冻{0}成功！");
        errorCodeMapping.put("MFBMS_CMP_30009", "重置密码完成，请通知用户及时修改密码！");
        errorCodeMapping.put("MFBMS_CMP_30010", "新增用户完成，请通知用户及时修改密码！");
        errorCodeMapping.put("MFBMS_COR_00006", "用户名密码不正确");
        errorCodeMapping.put("MFBMS_COR_00007", "验证码不正确");
        errorCodeMapping.put("MFBMS_COR_00008", "用户状态不正常，请与系统管理员联系");
        errorCodeMapping.put("MFBMS_COR_00009", "原密码不正确");
        errorCodeMapping.put("MFBMS_COR_00010", "新密码不正确，请输入不少于6位的字母/数字的组合");
        errorCodeMapping.put("MFBMS_COR_00011", "新密码与确认新密码不相同");
        errorCodeMapping.put("MFBMS_COR_00013", "不能保存重复数据。");
        errorCodeMapping.put("MFBMS_CMP_00007", "员工有对应的用户信息,请先删除用户信息");
        errorCodeMapping.put("MFBMS_CMP_00008", "新增的工作日必须为将来的日期");
        errorCodeMapping.put("MFBMS_CMP_00009", "新增的节假日必须为将来的日期");
        errorCodeMapping.put("MFBMS_CMP_00010", "本年度已经存在相同的设置,请检查");
        errorCodeMapping.put("MFBMS_CMP_00011", "节假日必须为除周六周日外的国家法定假期");
        errorCodeMapping.put("MFBMS_CMP_00012", "工作日必须为因国家法定节假日导致的周六周日上班,不能设置为周一至周五的日期");
        errorCodeMapping.put("MFBMS_CMP_00013", "节假日年度必须至少包含一个节假日或工作日");
        errorCodeMapping.put("MFBMS_CMP_00014", "新增的节假日/工作日必须在节假日年度内");
        errorCodeMapping.put("MFBMS_CMP_00015", "若机构是网点,请必须选择所属网点");
        errorCodeMapping.put("MFBMS_CMP_00016", "若员工是贷款顾问或贷款主任,则网点信息不能为空,请检查机构设置");
        errorCodeMapping.put("MFBMS_COR_00012", "开始日期必须小于或者等于结束日期");
        errorCodeMapping.put("MFBMS_LAP_00001", "身份证号必须是15位或18位");
        errorCodeMapping.put("MFBMS_LAP_00002", "申请日期必须为今天或者之前");
        errorCodeMapping.put("MFBMS_LAP_30001", "贷款申请保存成功!");
        errorCodeMapping.put("MFBMS_LAP_00003", "请输入配偶信息");
        errorCodeMapping.put("MFBMS_LAP_00004", "此主贷人存在贷款申请在{0}状态中，不能提交申请");
        errorCodeMapping.put("MFBMS_LAP_00005", "此主贷人在过去30天内有被拒绝的贷款，不能提交申请");
        errorCodeMapping.put("MFBMS_LAP_00006", "同一个证件号码不允许存在未结清的贷款！不能提交申请。");
        errorCodeMapping.put("MFBMS_LAP_30002", "材料收集情况保存成功!");
        errorCodeMapping.put("MFBMS_LAP_00007", "上传的附件大小不能超过100M!");
        errorCodeMapping.put("MFBMS_LAP_30003", "附件上传成功!");
        errorCodeMapping.put("MFBMS_LAP_30004", "信用报告保存成功!");
        errorCodeMapping.put("MFBMS_LAP_30005", "客户分配成功!");
        errorCodeMapping.put("MFBMS_LAP_00010", "不允许删除,客户分配至少需要选择一条贷款记录");
        errorCodeMapping.put("MFBMS_LAP_00008", "请至少选择一条贷款申请记录");
        errorCodeMapping.put("MFBMS_LAP_00009", "附件类别为交单资料时，附件类型必须选择");
        errorCodeMapping.put("MFBMS_LAP_00011", "主贷人住宅信息,职业资料,公司资料和联系人信息都必须至少有一条记录。");
        errorCodeMapping.put("MFBMS_LAP_00056", "当贷款产品为“金薪贷”时，社保电脑号必填。");
        errorCodeMapping.put("MFBMS_LAP_00057", "金商贷、白金贷、快捷贷自雇客户，请填写对应的职业资料中“成立日期、雇员人数、经营场所、月均营业额、成本支出、月盈利”");
        errorCodeMapping.put("MFBMS_LAP_00054", "职业资料中经营场所为租用，请填写租金");
        errorCodeMapping.put("MFBMS_LAP_00053", "职业资料中经营场所为按揭，请填写月供");
        errorCodeMapping.put("MFBMS_LAU_00001", "批核额度和期限必须输入!");
        errorCodeMapping.put("MFBMS_LAU_20001", "是否确认同意该贷款申请?");
        errorCodeMapping.put("MFBMS_LAU_30001", "操作成功");
        errorCodeMapping.put("MFBMS_LAU_00002", "请输入拒绝原因");
        errorCodeMapping.put("MFBMS_LAU_30002", "操作完成");
        errorCodeMapping.put("MFBMS_LAU_00003", "请输入回退步骤和原因!");
        errorCodeMapping.put("MFBMS_LAU_00004", "请输入取消原因!");
        errorCodeMapping.put("MFBMS_LAU_30003", "警告!本次贷款后，此客户有负资产:{0}元,负债/资产占比为{1}");
        errorCodeMapping.put("MFBMS_LAU_00005", "请输入撤销审批原因!");
        errorCodeMapping.put("MFBMS_LAU_00006", "不允许删除,审批分配至少需要选择一条贷款记录");
        errorCodeMapping.put("MFBMS_LAU_00007", "请至少选择一条贷款审批记录");
        errorCodeMapping.put("MFBMS_LAU_30004", "审批分配成功!");
        errorCodeMapping.put("MFBMS_LAU_00008", "所选择的审批记录必须是同一产品并且在同一审批级别");
        errorCodeMapping.put("MFBMS_LAU_00009", "审批人{0}已经审批过申请记录{1},请重新选择!");
        errorCodeMapping.put("MFBMS_LAU_00010", "审批金额不能大于申请金额！");
        errorCodeMapping.put("MFBMS_CHK_30001", "贷款申请单分配成功");
        errorCodeMapping.put("MFBMS_CHK_00001", "请选择调查用户");
        errorCodeMapping.put("MFBMS_CHK_00002", "请选择贷款申请单");
        errorCodeMapping.put("MFBMS_CHK_00003", "贷款申请单分配失败!");
        errorCodeMapping.put("MFBMS_CHK_00004", "“评估价值”不能小于“贷款余额”");
        errorCodeMapping.put("MFBMS_AUD_00001", "请选择审计用户");
        errorCodeMapping.put("MFBMS_AUD_00002", "已达到今日最大审单量，不可再分配");
        errorCodeMapping.put("MFBMS_AUD_00003", "已达到今日最大审单量，不可再分配");
        errorCodeMapping.put("MFBMS_AUD_00004", "所选记录存在审计中的记录");
        errorCodeMapping.put("MFBMS_AUD_00005", "当前记录已在审计中，不能保存");
        errorCodeMapping.put("MFBMS_AUD_00006", "所选记录总数不可大于当前今日分配剩余量");
        errorCodeMapping.put("MFBMS_AUD_00007", "不允许删除,客户分配至少需要选择一条贷款记录");
        errorCodeMapping.put("MFBMS_AUD_00008", "不可查看，今日剩余可查看申请次数为0");
        errorCodeMapping.put("MFBMS_AUD_00009", "分配量不可超过每日最大审单量的用户");
        errorCodeMapping.put("MFBMS_AUD_00010", "此贷款申请已在审计中");
        errorCodeMapping.put("MFBMS_AUD_00011", "没有找到满足条件的记录");
        errorCodeMapping.put("MFBMS_AUD_00012", "必须填写一个查询条件");
        errorCodeMapping.put("MFBMS_BOK_00001", "\"*\"项必须填写。");
        errorCodeMapping.put("MFBMS_BOK_00002", "请输入退回原因。");
        errorCodeMapping.put("MFBMS_BOK_00003", "请输入取消原因。");
        errorCodeMapping.put("MFBMS_CON_00001", "账户信息必须要收款帐号和扣款帐号各一个，请增加帐户信息，或删除多余的账户信息。");
        errorCodeMapping.put("MFBMS_CON_30001", "客户账户保存成功");
        errorCodeMapping.put("MFBMS_CON_00002", "请输入贷款期数。");
        errorCodeMapping.put("MFBMS_CON_00003", "请输入作废理由。");
        errorCodeMapping.put("MFBMS_CON_00004", "放款日期小于今天，您确认继续操作吗？");
        errorCodeMapping.put("MFBMS_CON_00005", "起息日期小于今天，您确认继续操作吗？");
        errorCodeMapping.put("MFBMS_CON_30002", "合同保存成功");
        errorCodeMapping.put("MFBMS_CON_30003", "操作成功");
        errorCodeMapping.put("MFBMS_CON_00006", "您当前填写的客户帐号信息不完整，您确认继续操作吗？");
        errorCodeMapping.put("MFBMS_CON_00007", "您当前选择的业务类型为“趸缴业务”，期数不为36，您确认继续操作吗？");
        errorCodeMapping.put("MFBMS_CON_00008", "您本次修改了合同期数，请先执行“保存”操作");
        errorCodeMapping.put("MFBMS_CON_00009", "您当前选择的业务类型为“平缴业务”，期数不为36，您确认继续操作吗？");
        errorCodeMapping.put("MFBMS_CMP_00017", "产品编号不能与现有记录重复");
        errorCodeMapping.put("MFBMS_CMP_00018", "产品费用设置不能为空");
        errorCodeMapping.put("MFBMS_CMP_00019", "费用项的第一条记录的“从”必须为0");
        errorCodeMapping.put("MFBMS_CMP_00020", "费用项的最后一条的至必须为空");
        errorCodeMapping.put("MFBMS_CMP_00021", "费用项的前后两条记录必须首尾相连（前一条的从必须等于后一条的至）");
        errorCodeMapping.put("MFBMS_CMP_00022", "产品的费用项不能重复");
        errorCodeMapping.put("MFBMS_CMP_00023", "请输入百分比");
        errorCodeMapping.put("MFBMS_CMP_00024", "请输入固定值");
        errorCodeMapping.put("MFBMS_CMP_00025", "请输入\"从\"");
        errorCodeMapping.put("MFBMS_CMP_00026", "请输入\"至\"");
        errorCodeMapping.put("MFBMS_CMP_00027", "当前产品已经有相关的贷款申请记录不可以删除");
        errorCodeMapping.put("MFBMS_CMP_20001", "当前产品已经有相关的贷款申请记录,修改费用对已生成贷款计划表的贷款合同无效,请确认");
        errorCodeMapping.put("MFBMS_CMP_00028", "调查步骤必须至少选择一项");
        errorCodeMapping.put("MFBMS_CMP_00029", "所有步骤都必须填写工作量");
        errorCodeMapping.put("MFBMS_CMP_00030", "工作量必须为0或正数数值");
        errorCodeMapping.put("MFBMS_CMP_00031", "所有级别额度都必须填写");
        errorCodeMapping.put("MFBMS_CMP_00032", "额度必须为正数数值");
        errorCodeMapping.put("MFBMS_CMP_00033", "后一审批级别额度必须大于前一级别额度");
        errorCodeMapping.put("MFBMS_CMP_00034", "同级别审批用户已存在,请重新获取查询结果进行编辑");
        errorCodeMapping.put("MFBMS_SYS_000001", "系统错误{0}");
        errorCodeMapping.put("MFBMS_SYS_001001", "系统错误");
        errorCodeMapping.put("MFBMS_SYS_001002", "系统错误");
        errorCodeMapping.put("MFBMS_SYS_001003", "系统错误");
        errorCodeMapping.put("MFBMS_SYS_001007", "系统错误");
        errorCodeMapping.put("MFBMS_SYS_001008", "数据可能被其它用户修改，请刷新后重试。{0}");
        errorCodeMapping.put("MFBMS_SYS_001009", "记录可能被删除。");
        errorCodeMapping.put("MFBMS_SYS_001101", "无效用户ID");
        errorCodeMapping.put("MFBMS_SYS_001102", "密码错误");
        errorCodeMapping.put("MFBMS_SYS_001103", "您没有登录，或者长时间未使用导致登录失效，请重新登录。");
        errorCodeMapping.put("MFBMS_SYS_001106", "未授权访问");
        errorCodeMapping.put("MFBMS_SYS_001201", "系统错误");
        errorCodeMapping.put("MFBMS_SYS_001202", "系统错误");
        errorCodeMapping.put("MFBMS_SYS_001203", "数据可能被其它用户修改，请刷新后重试。");
        errorCodeMapping.put("MFBMS_SYS_001204", "系统错误");
        errorCodeMapping.put("MFBMS_SYS_001205", "系统错误");
        errorCodeMapping.put("MFBMS_SYS_001301", "客户端应用程序版本不再支持，请更新版本至{0}.");
        errorCodeMapping.put("MFBMS_CLN_00001", "系统错误。");
        errorCodeMapping.put("MFBMS_CLN_00002", "请稍候...");
        errorCodeMapping.put("MFBMS_CLN_00003", "不能连接到服务器，请联系管理员。");
        errorCodeMapping.put("MFBMS_CLN_00004", "请选择另外一个文件名。");
        errorCodeMapping.put("MFBMS_CLN_00005", "窗体正在打开，请稍候。");
        errorCodeMapping.put("MFBMS_CLN_00006", "未授权访问。");
        errorCodeMapping.put("MFBMS_CLN_00007", "您确定要退出应用程序吗？");
        errorCodeMapping.put("MFBMS_CLN_00008", "重新登录将会关闭所有窗体，继续吗？");
        errorCodeMapping.put("MFBMS_CLN_00009", "文件无法访问，请检查文件是否存在或者已经被其它程序打开。");
        errorCodeMapping.put("MFBMS_CLN_00010", "未授权访问文件，请检查安全设置。");
        errorCodeMapping.put("MFBMS_WF_00001", "系统错误。");
        errorCodeMapping.put("MFBMS_WF_00002", "流程信息不存在。");
        errorCodeMapping.put("MFBMS_WF_00003", "流程已经结束。");
        errorCodeMapping.put("MFBMS_WF_00004", "任务信息不存在。");
        errorCodeMapping.put("MFBMS_WF_00005", "任务已经结束。");
        errorCodeMapping.put("MFBMS_WF_00006", "缺少流程定义");
        errorCodeMapping.put("MFBMS_WF_00007", "提交人与处理人不一致。");
        errorCodeMapping.put("MFBMS_WF_00008", "任务可能被其它用户修改，请刷新之后重试。");
        errorCodeMapping.put("MFBMS_WF_00009", "任务已经被分配处理人，不能再次分配。");
        errorCodeMapping.put("MFBMS_WF_00010", "无法找到一个用户来处理这个任务。");
        errorCodeMapping.put("MFBMS_CMP_00035", "编码/名称/序号不能与已同一字典的其他记录重复");
        errorCodeMapping.put("MFBMS_LAP_00012", "申请额度必须在1万到50万之间");
        errorCodeMapping.put("MFBMS_LAP_00013", "当前客户不存在逾期或者正常还款的贷款申请，不能提交续贷申请。");
        errorCodeMapping.put("MFBMS_LAP_00014", "还款额不足以还清当前应收的所有余额。");
        errorCodeMapping.put("MFBMS_OFF_00001", "报盘/回盘的记录数不一致");
        errorCodeMapping.put("MFBMS_OFF_00002", "无效的文件格式");
        errorCodeMapping.put("MFBMS_OFF_00003", "文件不存在");
        errorCodeMapping.put("MFBMS_OFF_00004", "最少要选择一条报盘记录");
        errorCodeMapping.put("MFBMS_OFF_00005", "还款日期范围要在15天内");
        errorCodeMapping.put("MFBMS_LAP_00015", "还款金额不足以还清所有逾期的期数的费用。");
        errorCodeMapping.put("MFBMS_LAP_00016", "应还金额跟实还金额不相等。");
        errorCodeMapping.put("MFBMS_LAP_00017", "该预收款已经被退款，不能重复退款操作。");
        errorCodeMapping.put("MFBMS_LAP_00018", "该预收款处于'取消'状态，不能退款。");
        errorCodeMapping.put("MFBMS_LAP_00019", "该预收款不是属于最后一次还款，不能退款。");
        errorCodeMapping.put("MFBMS_LAP_00020", "该预收款对应的实收还存在一条'未处理'的预收款，请先处理'未处理'的预收款");
        errorCodeMapping.put("MFBMS_LAP_00021", "该预收款已经分配到了应还的期数中，不能退款。");
        errorCodeMapping.put("MFBMS_LAP_00022", "已经被部分退款的还款记录不能作退款操作。");
        errorCodeMapping.put("MFBMS_LAP_00023", "已经被取消的还款记录不能作退款操作。");
        errorCodeMapping.put("MFBMS_LAP_00024", "自动代扣的的回款是不可以做取消操作。");
        errorCodeMapping.put("MFBMS_LAP_00025", "该还款记录不是属于最后一次还款，不能取消。");
        errorCodeMapping.put("MFBMS_LAP_00026", "已经被部分退款的还款记录不能作取消操作.");
        errorCodeMapping.put("MFBMS_LAP_00027", "已经被取消的还款记录不能作取消操作。");
        errorCodeMapping.put("MFBMS_LAP_00028", "所选择的客户在系统中存在多笔贷款信息，请输入合同编号重新查询。");
        errorCodeMapping.put("MFBMS_LAP_00029", "入账金额必须大于0！");
        errorCodeMapping.put("MFBMS_LAP_10001", "该客户目前状态为已结清，多收金额入账后请在预收明细表查询，您确认继续操作吗？");
        errorCodeMapping.put("MFBMS_LAP_00030", "所操作的回款已经分配到了提前结清期数之前的费用，不能对该回款进行退款、取消的操作。");
        errorCodeMapping.put("MFBMS_FIN_00001", "此客户已报盘，在未回盘前，不可以进行入账操作，谢谢。");
        errorCodeMapping.put("MFBMS_LAP_00031", "该客户没有正在还款的贷款申请，不能做续贷。");
        errorCodeMapping.put("MFBMS_OUT_00001", "外包公司一级权重或二级权重累计之和需要在0%-100%，请修改");
        errorCodeMapping.put("MFBMS_OUT_00002", "最少要选择一条记录。");
        errorCodeMapping.put("MFBMS_OUT_00004", "当前日期要大于退案日期。");
        errorCodeMapping.put("MFBMS_OUT_00003", "委外次数超过了规定次数。");
        errorCodeMapping.put("MFBMS_LAP_00032", "缺少必要的信息，不能退款或取消回款。");
        errorCodeMapping.put("MFBMS_LAP_00033", "该还款记录已经锁定，不能作取消或退款操作。");
        errorCodeMapping.put("MFBMS_LAP_00034", "重扣金额必须大于0！");
        errorCodeMapping.put("MFBMS_LAP_00035", "贷款类型选择的是续贷，放款类别如果不是“自有资金”，则不能保存或提交。");
        errorCodeMapping.put("MFBMS_OUT_00006", "当前数据不是还款状态，不可以再提交。");
        errorCodeMapping.put("MFBMS_OUT_00007", "结案时间要大于等于委案时间。");
        errorCodeMapping.put("MFBMS_LAP_00036", "该还贷已经结清，不能做赎回操作。");
        errorCodeMapping.put("MFBMS_LAP_00037", "该还贷已经做了提前结清的操作，不能做赎回操作。");
        errorCodeMapping.put("MFBMS_LAP_00038", "上笔结清金额与合同确认签订计算出的金额不一致!");
        errorCodeMapping.put("MFBMS_LAP_00039", "实际放款金额必须大于0！");
        errorCodeMapping.put("MFBMS_LAP_00040", "预收款退款操作只能在结清状态后的多收款项。");
        errorCodeMapping.put("MFBMS_LAP_00041", "外部机构借款已经结清。{0}");
        errorCodeMapping.put("MFBMS_LAP_00042", "日期错误，找不到对应的提前还款期数。{0}");
        errorCodeMapping.put("MFBMS_LAP_00043", "日期错误，找到的对应的提前还款期数已经结清。{0}");
        errorCodeMapping.put("MFBMS_LAP_00044", "在对应的提前还款期数之前，存在未结清的期数。{0}");
        errorCodeMapping.put("MFBMS_LAP_00045", "申请日期不可以大于当前日期。");
        errorCodeMapping.put("MFBMS_LAP_00046", "该记录为调账记录，不能作退款操作。");
        errorCodeMapping.put("MFBMS_LAP_00047", "该回款后面有作调账操作，不能对该回款进行退款操作。");
        errorCodeMapping.put("MFBMS_LAP_00055", "导出数据超出10000条，请减少导出数据数量");
        errorCodeMapping.put("MFBMS_OUT_00101", "有计划中的案件，不可新增！");
        errorCodeMapping.put("MFBMS_OUT_00102", "请填写外访人员");
        errorCodeMapping.put("MFBMS_OUT_00103", "外访人员不是登录用户的记录，不可新增外访计划");
        errorCodeMapping.put("MFBMS_OUT_00105", "所属机构无对应行政区域");
        errorCodeMapping.put("MFBMS_OUT_00106", "此外访员已配置外访区域的数据，不可重复");
        errorCodeMapping.put("MFBMS_CHA_00001", "此申请编号的贷款记录状态未放款或不存在系统中");
        errorCodeMapping.put("MFBMS_CHA_00002", "请先填写申请编号");
        errorCodeMapping.put("MFBMS_CHA_00003", "未更改任何记录");
        errorCodeMapping.put("MFBMS_CHA_00004", "无具体数据");
        errorCodeMapping.put("MFBMS_CHA_00005", "未知修改类型");
        errorCodeMapping.put("MFBMS_CHA_00006", "已成功提交客户信息变更申请");
        errorCodeMapping.put("MFBMS_CHA_00007", "已成功批核客户信息变更申请，客户信息已变更");
        errorCodeMapping.put("MFBMS_CHA_00008", "已成功批核客户信息变更，由于此客户信息已变更，客户信息变更申请已“批核未修改”");
        errorCodeMapping.put("MFBMS_CHA_00009", "申请编号，客户姓名，身份证号码不能全部为空");
        errorCodeMapping.put("MFBMS_CHA_00010", "已拒绝客户信息变更申请");
        errorCodeMapping.put("MFBMS_CHA_00011", "已成功批核客户信息变更申请，扣款账户请到账户信息列表修改");
    }

    /** 受保护构造函数,允许继承该类 */
    protected LoanServiceWSDL() {

    }

    /**
     * 获取微贷服务
     * @return 返回连接代理
     */
    public static LoanService getService(){
        if (proxyService == null) {
            synchronized (synchronizedObject) {
                if (proxyService != null) {
                    return proxyService;
                }
                // 创建连接
                LoanService originalService = createOriginalLoanService();
                // 创建掉线重连代理处理器
                ReLoginInvocationHandler handler = new ReLoginInvocationHandler(originalService);
                proxyService = bindHandler(originalService, handler);
            }
        }
        return proxyService;
    }

    /**
     * 设置动态代理
     * @param originalService 原始被代理对象
     * @param handler         业务处理器
     * @return 返回代理后的对象
     */
    protected static LoanService bindHandler(LoanService originalService, InvocationHandler handler) {
        login(originalService); // 登录微贷系统
        // 绑定掉线重连代理,并返回代理对象
        return (LoanService) Proxy.newProxyInstance(LoanService.class.getClassLoader(), new Class<?>[]{LoanService.class}, handler);
    }

    /**
     * 登录微贷服务
     * @param originalService 原始WEBServer服务
     */
    protected static void login(LoanService originalService) {
        try {
            // 登录微贷系统
            userProfileDto = originalService.login(EncryptUtils.xorEncryptString(password, encryption), userId);
        } catch (Exception e) {
            if (logger.isErrorEnabled()) logger.error("微贷系统登录异常", e);
        }
    }

    /**
     * 创建原始的微贷连接
     * @return 返回微贷连接对象
     */
    protected static LoanService createOriginalLoanService() {
        logger.info("连接微贷loan服务url:" + url);
        LoanService originalService = new LoanServiceService(url).getLoanServicePort();
        BindingProvider bindingProvider = (BindingProvider) originalService;
        bindingProvider.getRequestContext().put(BindingProvider.SESSION_MAINTAIN_PROPERTY, true);
        return originalService;
    }

    /**
     * 获取登录用户信息
     * @return 返回登录用户信息
     */
    public UserProfileDto getUserProfileDto() {
        return userProfileDto;
    }

    /**
     * 微贷错误码对应信息
     * @param errorCode 错误码
     * @return 如果有则返回对应描述, 如果没有则返回源信息
     */
    public String getWdErrorCodeMsg(String errorCode) {
        if (errorCode == null) return errorCode;
        String msg = errorCodeMapping.get(errorCode);
        return msg == null ? errorCode : msg;
    }

    /**
     * 微贷掉线重连处理器
     * @author tangjialin on 2016-01-04 0004.
     */
    private static class ReLoginInvocationHandler implements InvocationHandler {
        /** 被代理的原始对象 */
        private LoanService originalService;

        public ReLoginInvocationHandler(LoanService target) {
            this.originalService = target;
        }

        @Override
        public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
            try {
                return method.invoke(originalService, args);
            } catch (Exception e) {
                /** 错误信息查看类的类注释
                 * @see com.ljwd.plms.web.wsdl.webservice.LoanServiceWSDL */
                Throwable cause = e.getCause();
                String msg = null;
                if (cause != null && (msg = cause.getLocalizedMessage()) != null && msg.indexOf("MFBMS_SYS_001103") != -1) {
                    if (logger.isInfoEnabled()) logger.info("登录超时:", e);
                    // 重新连接微贷系统并再次执行本次业务请求
                    synchronized (synchronizedObject) {
                        originalService = createOriginalLoanService();
                        proxyService = bindHandler(originalService, this);
                    }
                    return method.invoke(originalService, args);
                }
                throw e;
            }
        }
    }

}