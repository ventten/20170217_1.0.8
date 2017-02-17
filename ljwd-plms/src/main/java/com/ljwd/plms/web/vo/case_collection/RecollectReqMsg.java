package com.ljwd.plms.web.vo.case_collection;

import com.ljwd.plms.web.enums.RepayType;

import javax.xml.bind.annotation.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * Created by zhengzw on 2016/11/16
 * 向微贷发送发起再扣请求实体
 */
@XmlRootElement
@XmlType
@XmlAccessorType(XmlAccessType.FIELD)
public class RecollectReqMsg implements Serializable {

    @XmlAttribute(required =true)
    private String contractNo;
    @XmlAttribute(required=true)
    private Integer periodNum;
    @XmlAttribute(required =true)
    private RepayType repayType;
    @XmlAttribute(required =true)
    private Date collectDate;
    @XmlAttribute(required =true)
    private BigDecimal collectAmt;
    @XmlAttribute(required =true)
    private String requestBy;

    public String getContractNo() {
        return contractNo;
    }

    public void setContractNo(String contractNo) {
        this.contractNo = contractNo;
    }

    public Integer getPeriodNum() {
        return periodNum;
    }

    public void setPeriodNum(Integer periodNum) {
        this.periodNum = periodNum;
    }

    public RepayType getRepayType() {
        return repayType;
    }

    public void setRepayType(RepayType repayType) {
        this.repayType = repayType;
    }

    public Date getCollectDate() {
        return collectDate;
    }

    public void setCollectDate(Date collectDate) {
        this.collectDate = collectDate;
    }

    public BigDecimal getCollectAmt() {
        return collectAmt;
    }

    public void setCollectAmt(BigDecimal collectAmt) {
        this.collectAmt = collectAmt;
    }

    public String getRequestBy() {
        return requestBy;
    }

    public void setRequestBy(String requestBy) {
        this.requestBy = requestBy;
    }

}
