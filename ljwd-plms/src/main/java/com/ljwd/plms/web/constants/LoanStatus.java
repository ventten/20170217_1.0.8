package com.ljwd.plms.web.constants;

/**
 * Created by zhengzw on 2016/10/8
 * 贷款状态:参考 L_LOAN_STATUS(贷款状态表) 和 WF_WORKFLOW_INFO(工作流表)
 */
public class LoanStatus {

    public static final String DRAFT = "DRAFT";                 //资料维护
    public static final String CANCELLED = "CANCELLED";         //取消
    public static final String REJECTED = "REJECTED";           //拒绝
    public static final String VOIDED = "VOIDED";               //作废
    public static final String APPROVING = "APPROVING";         //贷款审批中
    public static final String SIGNING = "SIGNING";             //合同待签订
    public static final String PAYING = "PAYING";               //待放款
    public static final String REPAYING = "REPAYING";           //还款中
    public static final String CLEAR = "CLEAR";                 //结清

}
