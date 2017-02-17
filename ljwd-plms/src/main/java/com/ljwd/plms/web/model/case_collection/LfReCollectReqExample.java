package com.ljwd.plms.web.model.case_collection;

import com.ljwd.plms.web.model.BaseExample;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by zhengzw on 2016/12/10
 * 再扣申请表,LF_RE_COLLECT_REQ
 * */
public class LfReCollectReqExample extends BaseExample{

    private Long id;                        //记录ID
    private Long cntrctId;                  //合同ID
    private String rpayType;                //再扣类型：NORMAL-正常还款,ADV_CLEAR-提前结清
    private String status;                  //状态：CREATED-未处理,CANCELLED-取消,OFFERED-已报盘,FAILED-扣款失败,COLLECTED-扣款成功
    private List<String> statusS;           //状态集合

    public Long getId() {
        return id;
    }

    public LfReCollectReqExample setId(Long id) {
        this.id = id;
        return this;
    }

    public Long getCntrctId() {
        return cntrctId;
    }

    public LfReCollectReqExample setCntrctId(Long cntrctId) {
        this.cntrctId = cntrctId;
        return this;
    }

    public String getRpayType() {
        return rpayType;
    }

    public LfReCollectReqExample setRpayType(String rpayType) {
        this.rpayType = rpayType;
        return this;
    }

    public String getStatus() {
        return status;
    }

    public LfReCollectReqExample setStatus(String status) {
        this.status = status;
        return this;
    }

    public List<String> getStatusS() {
        return statusS;
    }

    public LfReCollectReqExample setStatusS(List<String> statusS) {
        this.statusS = statusS;
        return this;
    }

}