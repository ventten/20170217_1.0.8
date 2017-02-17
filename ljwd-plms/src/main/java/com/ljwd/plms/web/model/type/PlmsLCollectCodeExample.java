package com.ljwd.plms.web.model.type;

import java.io.Serializable;

import com.ljwd.plms.web.model.BaseExample;

/**
 * 催收代码,PLMS_L_COLLECT_CODE
 * */
public class PlmsLCollectCodeExample extends BaseExample  implements Serializable{
	private static final long serialVersionUID = 1L;

	private String isActive;        //Y/N
    private String grpName;         //分组,跟进情况PLMS_L_COLLECT_STATUS的collectCodeGroup值
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
        sb.append(isSelected == null ? "": ",isSelected:" + isSelected);
        return sb.toString();
    }

    public String getIsActive() {
        return isActive;
    }

    public PlmsLCollectCodeExample setIsActive(String isActive) {
        this.isActive = (isActive == null || "".equals(isActive) || "".equals(isActive.trim())) ? null : isActive.trim();
        return this;
    }

    public String getGrpName() {
        return grpName;
    }

    public PlmsLCollectCodeExample setGrpName(String grpName) {
        this.grpName = (grpName == null || "".equals(grpName) || "".equals(grpName.trim())) ? null : grpName.trim();
        return this;
    }

    public String getIsSelected() {
        return isSelected;
    }

    public PlmsLCollectCodeExample setIsSelected(String isSelected) {
        this.isSelected = (isSelected == null || "".equals(isSelected) || "".equals(isSelected.trim())) ? null : isSelected.trim();
        return this;
    }

}
