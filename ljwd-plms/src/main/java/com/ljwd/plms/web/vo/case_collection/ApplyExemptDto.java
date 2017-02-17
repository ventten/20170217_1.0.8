package com.ljwd.plms.web.vo.case_collection;

/**
 * Created by zhengzw on 2016/9/5
 * 新增免扣时搜索结果的Dto
 */
public class ApplyExemptDto {

    private Long paymentId;             //放款ID
    private String custName;            //主贷人
    private String cntrctNo;            //合同编号

    public Long getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(Long paymentId) {
        this.paymentId = paymentId;
    }

    public String getCntrctNo() {
        return cntrctNo;
    }

    public void setCntrctNo(String cntrctNo) {
        this.cntrctNo = cntrctNo;
    }

    public String getCustName() {
        return custName;
    }

    public void setCustName(String custName) {
        this.custName = custName;
    }

}
