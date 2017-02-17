package com.ljwd.plms.web.enums;

import java.util.LinkedHashMap;
import java.util.Map;

public enum OutVisitCustType {

	Bouncing("多次跳票"),
	Lost("失联"),
	Others("其他");
	
	 //定义私有变量
    private String nCode;

    //构造函数，枚举类型只能为私有
    OutVisitCustType(String _nCode) {
        this.nCode = _nCode;
    }

    @Override
    public String toString() {
        return String.valueOf(this.nCode);
    }
    
    public static Map<String,Object> getOutVisitCustType(){
		Map<String,Object> map = new LinkedHashMap<String,Object>();
		OutVisitCustType[] values = OutVisitCustType.values();
    	for(OutVisitCustType val:values){
    		map.put(val.name(), val.toString());
    	}
    	return map;    	
    }
}
