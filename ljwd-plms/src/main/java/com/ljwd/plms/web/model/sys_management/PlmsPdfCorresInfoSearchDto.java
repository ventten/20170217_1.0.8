package com.ljwd.plms.web.model.sys_management;

import java.util.HashMap;
import java.util.Map;

import com.ljwd.plms.web.model.BaseExample;
import com.ljwd.plms.web.vo.DataTableParam;

/**
 * 
 * ClassName: PlmsPdfCorresInfoSearchDto 
 * @Description: 信函模板参数dto
 * @author zhengjizhao
 * @date 2016年11月3日下午1:01:30
 */
public class PlmsPdfCorresInfoSearchDto extends BaseExample{

	private String documentCode;//模板编码
    private String documentName;//模板名称 （信函类别）
    private static Map<String,String> sortMap = new HashMap<String,String>();
    static {
        sortMap.put("documentCode","documentCode ");
        sortMap.put("documentName","documentName ");
        sortMap.put("dataSource","dataSource ");
        sortMap.put("businessModel","businessModel ");
        sortMap.put("contractWay","contractWay ");
    }

    public void setOrderByClause(DataTableParam param){
        super.setOrderByClause(param,sortMap);
    }
	public String getDocumentCode() {
		return documentCode;
	}
	public void setDocumentCode(String documentCode) {
		this.documentCode = documentCode;
	}
	public String getDocumentName() {
		return documentName;
	}
	public void setDocumentName(String documentName) {
		this.documentName = documentName;
	}
    
}
