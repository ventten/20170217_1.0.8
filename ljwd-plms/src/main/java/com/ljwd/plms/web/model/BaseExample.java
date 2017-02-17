package com.ljwd.plms.web.model;

import com.ljwd.plms.core.util.StringUtil;
import com.ljwd.plms.web.vo.DataTableParam;

import java.util.List;
import java.util.Map;

/**
 * Created by zhengzw on 2016/6/13 0013.
 * 基础查询条件
 */
public class BaseExample {

    protected String paramData;     //前端dataTables分页插件的json请求参数
    protected String orderByClause; //排序
    protected boolean distinct;    //是否去重

    public void setOrderByClause(DataTableParam param,Map<String,String> sortMap){
        if(param == null || sortMap == null || sortMap.isEmpty()){
            return;
        }
        List<String> iSortColsName = param.getiSortColsName();     //排序列的名称
        List<String> sSortDirs = param.getsSortDirs();             //排布列排序形式 Asc/Desc
        if(iSortColsName != null && !iSortColsName.isEmpty()){
            StringBuffer sb = new StringBuffer();
            String col = null;
            for(int i = 0 ; i < iSortColsName.size() ; i++){
                col = iSortColsName.get(i);
                col = sortMap.get(col);
                if(!StringUtil.isEmpty(col)){
                    sb.append(",").append(col).append(sSortDirs.get(i));
                }
            }
            String order = sb.toString();
            if(!StringUtil.isEmpty(order)){
                this.setOrderByClause(order.replaceFirst(",", ""));
            }
        }
    }

    /**
     * 获取缓存key
     * @return String
     */
    public String getCacheKey(){
        StringBuffer sb = new StringBuffer();
        sb.append("distinct:" + distinct);
        sb.append(paramData == null ? "": ",paramData:" + paramData);
        sb.append(orderByClause == null ? "": ",orderByClause:" + orderByClause);
        return sb.toString();
    }

    public String getParamData() {
        return paramData;
    }

    public void setParamData(String paramData) {
        this.paramData = paramData;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

}
