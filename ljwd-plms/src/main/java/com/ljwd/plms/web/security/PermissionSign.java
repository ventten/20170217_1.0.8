package com.ljwd.plms.web.security;

/**
 * 权限标识配置类
 * 与 plms_permission 权限表中的 permission_sign 字段相对应
 * <pre>
 * @ RequiresPermissions(value = PermissionConfig.USER_CREATE)
 * public String create() {
 *     return "拥有user:create权限,能访问";
 * }
 * </pre>
 **/
public class PermissionSign {

    /**
     * 客户管理模块
     * */
    public static final String CUST_SELECT = "cust:select";                //查询客户信息列表
    public static final String CUST_DETAIL = "cust:detail";                //查询客户信息详情

    public static final String CONTACTOR_SELECT = "contactor:select";      //查询通讯信息
    public static final String CONTACTOR_INSERT = "contactor:insert";      //新增通讯信息
    public static final String CONTACTOR_UPDATE = "contactor:update";      //维护通讯信息

    public static final String ADDRESS_SELECT = "address:select";           //查询地址信息
    public static final String ADDRESS_INSERT = "address:insert";           //新增地址信息
    public static final String ADDRESS_UPDATE = "address:update";           //维护地址信息

    public static final String ANNEX_SELECT = "annex:select";               //查询附件信息
    public static final String ANNEX_UPLOAD = "annex:upload";               //上传附件信息
    public static final String ANNEX_DOWNLOAD = "annex:download";           //下载附件信息

    public static final String APPL_SELECT = "appl:select";                 //查看贷款信息

    public static final String UNIT_SELECT = "unit:select";                 //查询单位信息
    public static final String UNIT_INSERT = "unit:insert";                 //新增单位信息
    public static final String UNIT_UPDATE = "unit:update";                 //维护单位信息

    public static final String ASSETS_SELECT = "assets:select";             //查询资产信息
    public static final String ASSETS_INSERT = "assets:insert";             //新增资产信息
    public static final String ASSETS_UPDATE = "assets:update";             //维护资产信息

    public static final String CAR_SELECT = "car:select";                   //查询车辆信息
    public static final String CAR_INSERT = "car:insert";                   //新增车辆信息
    public static final String CAR_UPDATE = "car:update";                   //维护车辆信息

    public static final String POLICY_SELECT = "policy:select";             //查询保单信息
    public static final String POLICY_INSERT = "policy:insert";             //新增保单信息
    public static final String POLICY_UPDATE = "policy:update";             //维护保单信息

    public static final String ACCOUNT_SELECT = "account:select";           //查询流水账号
    public static final String ACCOUNT_INSERT = "account:insert";           //新增流水账号
    public static final String ACCOUNT_UPDATE = "account:update";           //维护流水账号

    /**
     * 系统管理模块
     * */
    public static final String USER_SELECT = "user:select";                 //查询用户信息
    public static final String USER_ALLOT = "user:allot";                   //角色分配

    public static final String ROLE_INSERT = "role:insert";                 //角色新增
    public static final String ROLE_DELETE = "role:delete";                 //角色删除
    public static final String ROLE_UPDATE = "role:update";                 //角色修改
    public static final String ROLE_SELECT = "role:select";                 //角色查询

    public static final String USERDATARANGE_SELECT = "userDataRange:select";           //查询用户数据权限管理
    public static final String USERDATARANGE_INSERT = "userDataRange:insert";           //新增用户数据权限管理
    public static final String USERDATARANGE_UPDATE = "userDataRange:update";           //修改用户数据权限管理
    public static final String USERDATARANGE_DELETE = "userDataRange:delete";           //删除用户数据权限管理

    public static final String MONTHALLOCUPPER_SELECT = "monthAllocUpper:select";       //查询月分配案件数管理
    public static final String MONTHALLOCUPPER_INSERT = "monthAllocUpper:insert";       //新增月分配案件数管理
    public static final String MONTHALLOCUPPER_UPDATE = "monthAllocUpper:update";       //修改月分配案件数管理

    public static final String ORGSCOPE_SELECT = "orgScope:select";                     //查询机构_区间关系配置
    public static final String ORGSCOPE_INSERT = "orgScope:insert";                     //新增机构_区间关系配置
    public static final String ORGSCOPE_UPDATE = "orgScope:update";                     //修改机构_区间关系配置
    public static final String ORGSCOPE_DELETE = "orgScope:delete";                     //删除机构_区间关系配置

    public static final String COLLECTOR_SELECT = "collector:select";                   //查询催收用户设置
    public static final String COLLECTOR_INSERT = "collector:insert";                   //新增催收用户设置
    public static final String COLLECTOR_UPDATE = "collector:update";                   //修改催收用户设置
    public static final String COLLECTOR_DELETE = "collector:delete";                   //修改催收用户设置

    public static final String OUT_RATE_SELECT = "out_rate:select";                     //委外费率查询
    public static final String OUT_RATE_INSERT = "out_rate:insert";                     //委外费率新增
    public static final String OUT_RATE_UPDATE = "out_rate:update";                     //委外费率修改
    
    public static final String OUTVISITUSER_SELECT = "outVisitUser:select";                   //查询外访用户设置
    public static final String OUTVISITUSER_INSERT = "outVisitUser:insert";                   //新增外访用户设置
    public static final String OUTVISITUSER_UPDATE = "outVisitUser:update";                   //修改外访用户设置
    public static final String OUTVISITUSER_DELETE = "outVisitUser:delete";                   //删除外访用户设置
    
    
    public static final String BRANCHMANAGE_SELECT = "branchManage:select";                   //查询分行监管权限
    public static final String BRANCHMANAGE_INSERT = "branchManage:insert";                   //新增分行监管权限
    public static final String BRANCHMANAGE_UPDATE = "branchManage:update";                   //修改分行监管权限
    public static final String BRANCHMANAGE_DELETE = "branchManage:delete";                   //删除分行监管权限
    

    /**
     * 案件催收模块
     * */
    public static final String CASE_MY_SELECT = "case_my:select";                 //查询我的案件
    public static final String CASE_MY_DETAIL = "case_my:detail";                 //我的案件查看催记
    public static final String CASE_MY_OUT_ADD = "case_my:out_add";               //我的案件发起委外申请
    public static final String CASE_MY_OUT_VISIT_ADD = "case_my:out_visit_add";   //我的案件发起外访申请

    public static final String CASE_ALL_SELECT = "case_all:select";               //查询全部案件
    public static final String CASE_ALL_DETAIL = "case_all:detail";               //全部案件查看催记
    public static final String CASE_ALL_ALL_COLLECTOR = "case_all:all_collector"; //查看全部催收员
    public static final String CASE_ALL_EXPORT = "case_all:export";               //全部案件导出

    public static final String COLLECT_REC_INSERT = "collect_rec:insert";         //新增催记
    public static final String COLLECT_REC_KEEP = "collect_rec:keep";             //发起保留
    public static final String COLLECT_REC_OFFER_EXEMPT = "collect_rec:offer_exempt";//申请免扣
    public static final String COLLECT_REC_TRANSFER = "collect_rec:transfer";     //发起提前移交
    public static final String COLLECT_REC_INFO = "collect_rec:info";             //自定义信息
    public static final String COLLECT_REC_LOAN = "collect_rec:loan";             //代扣情况-查询
    public static final String COLLECT_REC_CALL = "collect_rec:call";             //呼叫记录-查询
    public static final String COLLECT_REC_SMS = "collect_rec:sms";               //发送短信
    public static final String COLLECT_REC_OUTSRC_KEEP = "collect_rec:outsrc_keep";//发起委外保留

    public static final String COLLECT_REC_RE_COLLECT = "collect_rec:re_collect";  //发起再扣
    public static final String COLLECT_REC_RECIV_DTL = "collect_rec:reciv_dtl";    //查看客户应收明细

    public static final String OFFER_EXEMPT_SELECT = "offer_exempt:select";        //免扣管理-查询
    public static final String OFFER_EXEMPT_INSERT = "offer_exempt:insert";        //免扣管理-新增
    
    public static final String REPAY_SELECT = "repay_select:select";        	   //还款查询-查询数据

    /**
     * 工单池模块
     */
    public static final String WORKORDERPOOL_SELECT ="workorderpool:select";       //查询工单池
    public static final String WORKORDERPOOL_INSERT ="workorderpool:insert";       //新增工单池管理规则
    public static final String WORKORDERPOOL_UPDATE ="workorderpool:update";       //修改工单池管理规则
    public static final String WORKORDERPOOL_STOP ="workorderpool:stop";           //停用工单池管理规则

    public static final String CIRCURULE_SELECT ="circuRule:select";               //查看流转规则
    public static final String CIRCURULE_UPDATE ="circuRule:update";               //修改流转规则

    public static final String ASSIGNRULE_SELECT ="assignRule:select";             //查看分配规则
    public static final String ASSIGNRULE_UPDATE ="assignRule:update";             //修改分配规则

    public static final String PROTECTRULE_SELECT ="protectRule:select";           //查看保护规则
    public static final String PROTECTRULE_UPDATE ="protectRule:update";           //修改保护规则

    /**
     * 案件管理模块
     */
    public static final String CASEMANAGEMENT_SELECT = "casemanagement:select";                      //查询案件分配
    public static final String CASEMANAGEMENT_BRANCHSELECT = "casemanagement:branchSelect";          //分行查询案件分配
    public static final String CASEMANAGEDETAIL_SELECT = "casemanageDetail:select";                  //查询案件详情
    public static final String CASEMANAGEMENT_ALLOC = "casemanagement:alloc";                        //手工调整
    public static final String CASEMANAGEMENT_BATCHALLOC = "casemanagement:batchAlloc";              //批量分配
    public static final String CASEMANAGEMENT_AGENTALLOC = "casemanagement:agentAlloc";              //代理分配
    public static final String CASEMANAGEMENT_COLLECTORSELECT = "casemanagement:collectorSelect";    //查找催收员
    public static final String CASEMANAGEMENT_EXPORTEXCEL = "casemanagement:exportExcel";            //导出

    public static final String PROTECTCASE_SELECT = "protectCase:select";                            //查看保护案件
    public static final String PROTECTCASE_ALLOC = "protectCase:alloc";                              //分配保护案件

    public static final String TRANSFERADVANCECASE_SELECT = "transferAdvanceCase:select";            //查询提前移交案件
    public static final String TRANSFERADVANCECASE_AUDIT = "transferAdvanceCase:audit";              //审核提前移交案件
    public static final String TRANSFERADVANCECASE_APPROVED = "transferAdvanceCase:approved";        //审批提前移交案件
    public static final String TRANSFERADVANCECASE_ALLOC = "transferAdvanceCase:alloc";              //分配提前移交案件

    /**
     * 信函管理模块
     */
    public static final String CORRESPONDENCE_SELECT = "correspondence:select";         //信函管理-信函生成-查询
    public static final String CORRESPONDENCE_PDFOUT = "correspondence:pdfout";         //信函管理-信函生成-生成信函
    
    public static final String CORRESPONDENCE_ALL_SELECT = "correspondenceall:select";         //信函管理-全部信函-查询
    public static final String CORRESPONDENCE_ALL_UPDATE = "correspondenceall:update";         //信函管理-全部信函-更新
    public static final String CORRESPONDENCE_ALL_EXPORT = "correspondenceall:export";         //信函管理-全部信函-excel导出
    /**
     * 信函模板管理
     */
    public static final String CORRESMANAGE_SELECT = "corresmanage:select";         //信函模板管理-查询
    public static final String CORRESMANAGE_INSERT = "corresmanage:insert";         //信函模板管理-新增
    public static final String CORRESMANAGE_UPDATE = "corresmanage:update";         //信函模板管理-更新
    public static final String CORRESMANAGE_DELETE = "corresmanage:delete";         //信函模板管理-删除
    public static final String CORRESMANAGE_PDFOUT = "corresmanage:pdfout";         //信函模板管理-PDF导出
    

    /**
     * 委外模块
     * */
    public static final String OUT_COM_SELECT = "out_com:select";                       //委外机构查询
    public static final String OUT_COM_INSERT = "out_com:insert";                       //委外机构新增
    public static final String OUT_COM_UPDATE = "out_com:update";                       //委外机构修改
    public static final String OUT_COM_SWITCH = "out_com:switch";                       //委外机构启用停用

    public static final String OUT_LOG_SELECT = "out_log:select";                       //委外机构沟通日志查询
    public static final String OUT_LOG_INSERT = "out_log:insert";                       //委外机构沟通日志新增

    public static final String OUT_CONTACT_SELECT = "out_contact:select";               //委外机构联系人查询
    public static final String OUT_CONTACT_IMPORT = "out_contact:import";               //委外机构联系人导入

    public static final String OUT_COLLECT_SELECT = "out_collect:select";               //委外催记查询
    public static final String OUT_COLLECT_IMPORT = "out_collect:import";               //委外催记导入

    public static final String OUT_SRC_SELECT = "out_src:select";                       //委外申请查询
    //public static final String OUT_SRC_SEARCH = "out_src:search";                       //查询未再委案
    public static final String OUT_SRC_EXPORT = "out_src:export";                       //导出
    public static final String OUT_SRC_EXPORT_DETAIL = "out_src:export_detail";         //导出委外明细
    public static final String OUT_SRC_EXPORT_CONTACTOR = "out_src:export_contactor";   //导出通讯信息
    public static final String OUT_SRC_EXPORT_ADDRESS = "out_src:export_address";       //导出地址信息
    public static final String OUT_SRC_INSERT = "out_src:insert";                       //委外申请_申请委外
    public static final String OUT_SRC_AUDIT_PASS = "out_src:audit_pass";               //委外申请_审核通过
    public static final String OUT_SRC_AUDIT_REJECT = "out_src:audit_reject";           //委外申请_审核拒绝
    public static final String OUT_SRC_SUBMIT = "out_src:submit";                       //委外申请_提交
    public static final String OUT_SRC_MODIFY = "out_src:modify";                       //委外申请_修改委外信息
    public static final String OUT_SRC_IMPORT_ALLOT = "out_src:import_allot";           //委外申请_导入分配
    public static final String OUT_SRC_APPROVE_PASS = "out_src:approve_pass";           //委外申请_审批通过
    public static final String OUT_SRC_APPROVE_REJECT = "out_src:approve_reject";       //委外申请_审批拒绝
    public static final String OUT_SRC_EXTENTED = "out_src:extented";                   //委外申请_延期
    public static final String OUT_SRC_ENDED = "out_src:ended";                         //委外申请_结案
    public static final String OUT_SRC_RE_COLLECT = "out_src:re_collect";               //委外申请_发起再扣
    public static final String OUT_SRC_TO_NORMAL = "out_src:to_normal";                 //委外申请_案件转正常
    public static final String OUT_SRC_BACK = "out_src:back";                           //委外申请_退回
    public static final String OUT_SRC_UNDO_ENDED = "out_src:undo_ended";               //委外申请_撤销结案

    /**
     * 外访模块
     */
    public static final String OUTVISITAUDIT_SELECT = "outVisitAudit:select";                      //查询外访审核
    public static final String OUTVISITAUDIT_AUDIT = "outVisitAudit:audit";                        //外访审核
    
    public static final String OUTVISITASSIGN_SELECT = "outVisitAssign:select";                    //查询外访分配
    public static final String OUTVISITASSIGN_AUTOASSIGN = "outVisitAssign:autoAssign";            //自动分配外访
    public static final String OUTVISITASSIGN_MARUASSIGN = "outVisitAssign:maruAssign";            //手工调整外访
    public static final String OUTVISITASSIGN_CLOSED = "outVisitAssign:closed";                    //分配页面结案
    
    public static final String MYOUTVISIT_SELECT = "myOutVisit:select";                      		//查询我的外访
    public static final String MYOUTVISIT_ADDOUTVISITPLAN = "myOutVisit:addOutVisitPlan";           //新增外访计划
    public static final String MYOUTVISIT_SUBMITDELAY = "myOutVisit:submitDelay";                   //申请延期
    public static final String MYOUTVISIT_SELECTOUTVISITPLAN = "myOutVisit:selectOutVisitPlan";     //我的外访查看外访计划
    public static final String MYOUTVISIT_ADDOUTVISITPLANADDR = "myOutVisit:addOutVisitPlanAddr";   //新增外访地址
    public static final String MYOUTVISIT_CANCELOUTVISITPLAN = "myOutVisit:cancelOutVisitPlan";     //取消外访计划
    public static final String MYOUTVISIT_OUTVISITPLANRESULT = "myOutVisit:outVisitPlanResult";     //外访结果
    public static final String MYOUTVISIT_OUTVISITOPTIONS = "myOutVisit:outVisitOptions";           //外访附件

    
    public static final String ALLOUTVISIT_SELECT = "allOutVisit:select";                      		//查询(个人)
    public static final String ALLOUTVISIT_SELECTALL = "allOutVisit:selectAll";                     //查询全部外访（全部催收员）
    public static final String ALLOUTVISIT_CLOSED = "allOutVisit:closed";                      		//全部外访结案
    public static final String ALLOUTVISIT_ADDOUTVISITPLAN = "allOutVisit:addOutVisitPlan";         //新增外访计划
    public static final String ALLOUTVISIT_EXPORT = "allOutVisit:export";                      		//全部外访导出
    public static final String ALLOUTVISIT_AREA_SELECT = "allOutVisit:areaSelect";                  //外访区域查看（同区域）TODO


    
    public static final String OUTVISITPLAN_SELECT = "outVisitPlan:select";  						//查询外访计划(个人)
    public static final String OUTVISITPLAN_SELECTALL = "outVisitPlan:selectAll"; 					//查询全部外访计划（全部）
    public static final String OUTVISITPLAN_SELECTDETAIL = "outVisitPlan:selectDetail";             //查看计划详情
    public static final String OUTVISITPLAN_OUTVISITOPTIONS = "outVisitPlan:outVisitOptions";       //外访附件操作
    
    public static final String OUTVISITDELAY_SELECT = "outVisitDelay:select";                      //查询外访延期
    public static final String OUTVISITDELAY_AUDIT = "outVisitDelay:audit";                      	//审核外访延期

    public static final String OUTVISITROUTE_SELECT = "outVisitRoute:select";                      //查询外访路线
    public static final String OUTVISITROUTE_SELECTALL = "outVisitRoute:selectAll";                //查看所有外访员的外访路线
    
    /**
     * 报表模块
     */
    public static final String INCOMEREPORT_SELECT= "incomeReport:select";							//查询催收实收明细
    public static final String INCOMEREPORT_EXPORT= "incomeReport:export";							//导出催收实收明细
    public static final String INCOMEREPORT_CREATEDATA= "incomeReport:createData";					//生成当天催收实收明细
    public static final String OUTVIISTINCOMEREPORT_CREATEDATA= "outViistIncomeReport:createData";	//生成外访人员数据
    public static final String COLLECTORPERSONINCOMEREPORT_SELECT= "collectorPersonIncomeReport:select";							//查询催收个人实收明细
    public static final String COLLECTORPERSONINCOMEREPORT_EXPORT= "collectorPersonIncomeReport:export";							//导出催收个人实收明细
    public static final String OUTVISITPERSONINCOMEREPORT_SELECT= "outVisitPersonIncomeReport:select";							//查询外访个人实收明细
    public static final String OUTVISITPERSONINCOMEREPORT_EXPORT= "outVisitPersonIncomeReport:export";							//导出外访个人实收明细
}

