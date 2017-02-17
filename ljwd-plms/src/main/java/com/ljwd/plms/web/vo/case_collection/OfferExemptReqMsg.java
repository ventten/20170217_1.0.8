package com.ljwd.plms.web.vo.case_collection;

import javax.xml.bind.annotation.*;
import java.io.Serializable;
import java.util.Date;

/**
 * Created by zhengzw on 2016/11/16
 * 向微贷发送免扣申请请求实体
 */
@XmlRootElement
@XmlType
@XmlAccessorType(XmlAccessType.FIELD)
public class OfferExemptReqMsg implements Serializable {

    @XmlAttribute
    private String contractNo;              //合同编号
    @XmlAttribute
    private Date endDate;                   //免扣截止日期
    @XmlAttribute
    private String requestBy;               //申请人

    public String getContractNo() {
        return contractNo;
    }

    public void setContractNo(String contractNo) {
        this.contractNo = contractNo;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public String getRequestBy() {
        return requestBy;
    }

    public void setRequestBy(String requestBy) {
        this.requestBy = requestBy;
    }

}
