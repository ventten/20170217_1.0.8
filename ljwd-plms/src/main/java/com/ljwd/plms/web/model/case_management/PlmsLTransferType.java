package com.ljwd.plms.web.model.case_management;

import java.io.Serializable;

import com.ljwd.plms.web.model.ActiveModel;

/**
 * 移交类型表,PLMS_L_TRANSFER_TYPE
 * */
public class PlmsLTransferType extends ActiveModel implements Serializable{

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String code;            //编码
    private String val;             //值
    private Integer seq;            //顺序
    private String remark;          //备注

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    public String getVal() {
        return val;
    }

    public void setVal(String val) {
        this.val = val == null ? null : val.trim();
    }

    public Integer getSeq() {
        return seq;
    }

    public void setSeq(Integer seq) {
        this.seq = seq;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

}