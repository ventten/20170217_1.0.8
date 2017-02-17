package com.ljwd.plms.web.model.type;

import java.io.Serializable;

import com.ljwd.plms.web.model.BaseExample;

/**
 * 跟进情况,PLMS_L_COLLECT_STATUS
 * */
public class PlmsLCollectStatusExample extends BaseExample  implements Serializable{
	private static final long serialVersionUID = 1L;

	private String isActive;        //Y/N
    private String grpName;         //分组,催收类型PLMS_L_COLLECT_MTHD的code值
    private String code;            //编码
    private String isSelected;      //是否显示在下拉选择框

    /**
     * 获取缓存key
     * @return String
     */
    public String getCacheKey(){
        StringBuffer sb = new StringBuffer();
        sb.append(super.getCacheKey());
        sb.append(isActive == null ? "": ",isActive:" + isActive);
        sb.append(grpName == null ? "": ",grpName:" + grpName);
        sb.append(code == null ? "": ",code:" + code);
        sb.append(isSelected == null ? "": ",isSelected:" + isSelected);
        return sb.toString();
    }

    public String getIsActive() {
        return isActive;
    }

    public PlmsLCollectStatusExample setIsActive(String isActive) {
        this.isActive = (isActive == null || "".equals(isActive) || "".equals(isActive.trim())) ? null : isActive.trim();
        return this;
    }

    public String getGrpName() {
        return grpName;
    }

    public PlmsLCollectStatusExample setGrpName(String grpName) {
        this.grpName = (grpName == null || "".equals(grpName) || "".equals(grpName.trim())) ? null : grpName.trim();
        return this;
    }

    public String getCode() {
        return code;
    }

    public PlmsLCollectStatusExample setCode(String code) {
        this.code = (code == null || "".equals(code) || "".equals(code.trim())) ? null : code.trim();
        return this;
    }

    public String getIsSelected() {
        return isSelected;
    }

    public PlmsLCollectStatusExample setIsSelected(String isSelected) {
        this.isSelected = (isSelected == null || "".equals(isSelected) || "".equals(isSelected.trim())) ? null : isSelected.trim();
        return this;
    }
}
