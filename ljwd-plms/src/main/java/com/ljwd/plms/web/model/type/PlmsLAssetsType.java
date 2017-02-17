package com.ljwd.plms.web.model.type;

import com.ljwd.plms.web.model.ActiveModel;
import com.ljwd.plms.web.model.BaseModel;

import java.io.Serializable;
import java.util.Date;

/**
 * 资产类型,PLMS_L_ASSETS_TYPE
 * */
public class PlmsLAssetsType extends ActiveModel implements Serializable{
	private static final long serialVersionUID = 1L;

	private String code;            //编码
    private String val;             //值
    private Integer seq;            //顺序
    private String remark;          //备注
    private String grpName;         //group

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

}