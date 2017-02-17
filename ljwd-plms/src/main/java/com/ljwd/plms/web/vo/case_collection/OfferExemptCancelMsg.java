package com.ljwd.plms.web.vo.case_collection;

import javax.xml.bind.annotation.*;
import java.io.Serializable;

/**
 * Created by zhengzw on 2016/11/16
 * 向微贷发送免扣作废请求实体
 */
@XmlRootElement
@XmlType
@XmlAccessorType(XmlAccessType.FIELD)
public class OfferExemptCancelMsg implements Serializable {

    @XmlAttribute
    private Long offerExemptId;             //免扣申请记录ID
    @XmlAttribute
    private String cancelledBy;             //取消人
    @XmlAttribute
    private Long recordVersion;             //版本号

    public Long getOfferExemptId() {
        return offerExemptId;
    }

    public void setOfferExemptId(Long offerExemptId) {
        this.offerExemptId = offerExemptId;
    }

    public String getCancelledBy() {
        return cancelledBy;
    }

    public void setCancelledBy(String cancelledBy) {
        this.cancelledBy = cancelledBy;
    }

    public Long getRecordVersion() {
        return recordVersion;
    }

    public void setRecordVersion(Long recordVersion) {
        this.recordVersion = recordVersion;
    }

}

