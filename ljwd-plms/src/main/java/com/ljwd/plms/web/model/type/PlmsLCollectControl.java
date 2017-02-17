package com.ljwd.plms.web.model.type;

import com.ljwd.plms.web.model.ActiveModel;
import com.ljwd.plms.web.model.BaseModel;

import java.io.Serializable;
import java.util.Date;

/**
 * 控管状态,PLMS_L_COLLECT_CONTROL
 * */
public class PlmsLCollectControl extends ActiveModel implements Serializable{
	private static final long serialVersionUID = 1L;

	private String code;            //编码
    private String val;             //值
    private Integer seq;            //顺序
    private String remark;          //备注
    private String grpName;         //分组,催收类型PLMS_L_COLLECT_MTHD的code值
    private String isSelected;      //是否显示在下拉选择框

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

    public String getGrpName() {
        return grpName;
    }

    public void setGrpName(String grpName) {
        this.grpName = grpName == null ? null : grpName.trim();
    }

    public String getIsSelected() {
        return isSelected;
    }

    public void setIsSelected(String isSelected) {
        this.isSelected = isSelected;
    }

}