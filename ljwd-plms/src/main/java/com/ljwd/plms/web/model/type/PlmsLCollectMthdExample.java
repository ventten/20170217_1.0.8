package com.ljwd.plms.web.model.type;

import java.io.Serializable;

import com.ljwd.plms.web.model.BaseExample;

/**
 * 催收类型,PLMS_L_COLLECT_MTHD
 * */
public class PlmsLCollectMthdExample extends BaseExample implements Serializable{
	private static final long serialVersionUID = 1L;

	private String isActive;        //Y/N
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
        sb.append(codeNotIn == null ? "": ",codeNotIn:" + codeNotIn);
        sb.append(isSelected == null ? "": ",isSelected:" + isSelected);
        return sb.toString();
    }

    public String getIsActive() {
        return isActive;
    }

    public PlmsLCollectMthdExample setIsActive(String isActive) {
        this.isActive = (isActive == null || "".equals(isActive) || "".equals(isActive.trim())) ? null : isActive.trim();
        return this;
    }

    public String getCodeNotIn() {
        return codeNotIn;
    }

    public PlmsLCollectMthdExample setCodeNotIn(String codeNotIn) {
        this.codeNotIn = (codeNotIn == null || "".equals(codeNotIn) || "".equals(codeNotIn.trim())) ? null : codeNotIn.trim();
        return this;
    }

    public String getIsSelected() {
        return isSelected;
    }

    public PlmsLCollectMthdExample setIsSelected(String isSelected) {
        this.isSelected = (isSelected == null || "".equals(isSelected) || "".equals(isSelected.trim())) ? null : isSelected.trim();
        return this;
    }

}
