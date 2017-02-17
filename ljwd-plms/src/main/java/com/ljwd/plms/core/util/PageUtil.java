package com.ljwd.plms.core.util;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.serializer.SerializeConfig;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.alibaba.fastjson.serializer.SimpleDateFormatSerializer;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.ljwd.plms.core.feature.orm.mybatis.Page;
import com.ljwd.plms.web.constants.PageConstant;
import com.ljwd.plms.web.vo.DataTableParam;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 分页数据响应封装工具
 */
public class PageUtil {
	
	private PageUtil () {
		
	}
	private static SerializeConfig mapping = new SerializeConfig();  
    private static String dateFormat;  
    static {  
        dateFormat = "yyyy-MM-dd";  
    }
	
	/**
	 * 获取请求分页参数
	 * @param reqAoData 请求分页参数
	 * @return  String[0]=sEcho;String[1]=pageNo;String[2]=pageSize;
	 */
	public static String[] getPageRequest(List<Object> reqAoData) {
		String[] page = new String[3];
		page[0] = "1";
		page[1] = String.valueOf(PageConstant.pageNo);
		page[2] = String.valueOf(PageConstant.pageSize);
    	for(Object o : reqAoData){
    		Map<String, Object> obj = (HashMap<String, Object>)o;
    		if ("sEcho".equals((String)obj.get("name"))){
    			page[0] = obj.get("value").toString();
    		}
    		if ("iDisplayStart".equals((String)obj.get("name"))){
    			page[1] = String.valueOf(((Integer.valueOf(obj.get("value").toString())/PageConstant.pageSize)+1));
    		}
    		if ("iDisplayLength".equals((String)obj.get("name"))){
    			page[2] = obj.get("value").toString();
    		}
    	}
		return page;
	}

	/**
	 * 获取对应表格分页响应数据
	 * @param page 分页数据
	 * @return 分页响应数据
	 */
	public static String getPageJson(int sEcho, Page<?> page) {
		return JSONObject.toJSONString(getDataTablesPageResponse(sEcho, page), SerializerFeature.WriteDateUseDateFormat);
	}
	
	/**
	 * 获取对应表格分页响应数据
	 * @param page 分页数据
	 * @return 分页响应数据,时间精确到日
	 */
	public static String getPageJson_dataFormat(int sEcho, Page<?> page) {
		mapping.put(Date.class, new SimpleDateFormatSerializer(dateFormat));  
        return JSON.toJSONString(getDataTablesPageResponse(sEcho, page), mapping); 
		//return JSONObject.toJSONString(getDataTablesPageResponse(sEcho, page), SerializerFeature.WriteDateUseDateFormat);
	}

    /**
     * 获取DataTables表格的分页响应数据
     * @param sEcho 访问次数
     * @param page 分页数据
     * @return 分页响应数据
     */
    public static <E> Map<String, Object> getDataTablesPageResponse(int sEcho, Page<?> page) {
        Map<String, Object> pageWrapper = new HashMap<String, Object>();

        //旧版本
        pageWrapper.put("sEcho", sEcho);                                    //操作次数
        pageWrapper.put("iTotalRecords", page.getTotalCount());             //总记录数
        pageWrapper.put("iTotalDisplayRecords", page.getTotalCount());      //总记录数
        pageWrapper.put("aaData", page.getResult());                        //数据

        //pageWrapper.put("iDisplayStart", page.getPageNo()*page.getPageSize());
        //pageWrapper.put("iDisplayLength", page.getPageSize());

        //新版本
//		pageWrapper.put("draw", sEcho);
//		pageWrapper.put("recordsTotal", page.getTotalCount());
//		pageWrapper.put("recordsFiltered", page.getTotalCount());
//		pageWrapper.put("data", page.getResult());
        return pageWrapper;
    }

    /**
     * 将json格式的分页参数解析成对象
     * */
    public static DataTableParam getDataTableParamByJsonParam(String jsonParam){
        if (jsonParam == null || "".equals(jsonParam)){
            return null;
        }
        Map<String,Object> map = covertJsonStringToHashMap(jsonParam);
        int sEcho = (int) map.get("sEcho");
        int iDisplayStart = (int) map.get("iDisplayStart");
        int iDisplayLength = (int) map.get("iDisplayLength");
        int iColumns = (int)map.get("iColumns");
        int iSortingCols = map.get("iSortingCols") == null ? 0 : (int)map.get("iSortingCols");

        List<String> mDataProps = Lists.newArrayList();
        List<Boolean> bSortables = Lists.newArrayList();
        for(int i=0;i<iColumns;i++){
            String dataProp = (String) map.get("mDataProp_"+i);
            Boolean sortable = (Boolean) map.get("bSortable_"+i);
            mDataProps.add(dataProp);
            bSortables.add(sortable);
        }

        List<Integer> iSortCols = Lists.newArrayList();
        List<String> sSortDirs = Lists.newArrayList();
        List<String> iSortColsName = Lists.newArrayList();
        for(int i=0;i<iSortingCols;i++){
            Integer sortCol = (Integer) map.get("iSortCol_"+i);
            String sortColName = mDataProps.get(sortCol);
            String sortDir = (String) map.get("sSortDir_"+i);
            iSortCols.add(sortCol);
            sSortDirs.add(sortDir);
            iSortColsName.add(sortColName);
        }

        return new DataTableParam(sEcho, iDisplayStart, iDisplayLength, iColumns, mDataProps, bSortables, iSortingCols, iSortCols, iSortColsName,sSortDirs);
    }

    public static DataTableParam getDataTableParamByJsonParamNoSort(String jsonParam){
        if (jsonParam == null || "".equals(jsonParam)){
            return null;
        }
        Map<String,Object> map = covertJsonStringToHashMap(jsonParam);
        int sEcho = (int) map.get("sEcho");
        int iDisplayStart = (int) map.get("iDisplayStart");
        int iDisplayLength = (int) map.get("iDisplayLength");

        return new DataTableParam(sEcho, iDisplayStart, iDisplayLength);
    }

    /**
     * 将json格式的分页参数解析成Map
     * */
    public static Map<String,Object> covertJsonStringToHashMap(String jsonParam){
        JSONArray jsonArray = JSONArray.parseArray(jsonParam);
        Map<String,Object> map = Maps.newHashMap();
        for(int i=0;i<jsonArray.size();i++){
            JSONObject jsonObj = jsonArray.getJSONObject(i);
            map.put(jsonObj.getString("name"), jsonObj.get("value"));
        }
        return map;
    }

}
