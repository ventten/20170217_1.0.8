package com.ljwd.plms.web.model.type;

import java.io.Serializable;

import com.ljwd.plms.web.model.BaseExample;

/**
 * Created by zhengzw on 2016/6/14
 * 客户亲属关系查询条件
 */
public class LRltnshpExample extends BaseExample implements Serializable{
	private static final long serialVersionUID = 1L;

	private String isActive;        //Y/N

    /**
     * 获取缓存key
     * @return String
     */
    public String getCacheKey(){
        StringBuffer sb = new StringBuffer();
        sb.append(super.getCacheKey());
        sb.append(isActive == null ? "": ",isActive:" + isActive);
        return sb.toString();
    }

    public String getIsActive() {
        return isActive;
    }

    public LRltnshpExample setIsActive(String isActive) {
        this.isActive = (isActive == null || "".equals(isActive) || "".equals(isActive.trim())) ? null : isActive.trim();
        return this;
    }

}
