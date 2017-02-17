package com.ljwd.plms.web.model.type;

import java.io.Serializable;

import com.ljwd.plms.web.model.BaseExample;

/**
 * 控管状态,PLMS_L_COLLECT_CONTROL
 * */
public class PlmsLCollectControlExample extends BaseExample implements Serializable{
	private static final long serialVersionUID = 1L;

	private String isActive;        //Y/N
    private String grpName;         //分组,催收类型PLMS_L_COLLECT_MTHD的code值
    private String codeNotIn;       //code不等于
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
        sb.append(codeNotIn == null ? "": ",codeNotIn:" + codeNotIn);
        sb.append(isSelected == null ? "": ",isSelected:" + isSelected);
        return sb.toString();
    }

    public String getIsActive() {
        return isActive;
    }

    public PlmsLCollectControlExample setIsActive(String isActive) {
        this.isActive = (isActive == null || "".equals(isActive) || "".equals(isActive.trim())) ? null : isActive.trim();
        return this;
    }

    public String getGrpName() {
        return grpName;
    }

    public PlmsLCollectControlExample setGrpName(String grpName) {
        this.grpName = (grpName == null || "".equals(grpName) || "".equals(grpName.trim())) ? null : grpName.trim();
        return this;
    }

    public String getCodeNotIn() {
        return codeNotIn;
    }

    public PlmsLCollectControlExample setCodeNotIn(String codeNotIn) {
        this.codeNotIn = (codeNotIn == null || "".equals(codeNotIn) || "".equals(codeNotIn.trim())) ? null : codeNotIn.trim();
        return this;
    }

    public String getIsSelected() {
        return isSelected;
    }

    public PlmsLCollectControlExample setIsSelected(String isSelected) {
        this.isSelected = (isSelected == null || "".equals(isSelected) || "".equals(isSelected.trim())) ? null : isSelected.trim();
        return this;
    }

}