package com.ljwd.plms.web.enums;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * <p>Title: TransferStatusType</p>
 * @author pangshanxing
 * @date 2016年8月12日上午11:13:14
 */
public enum TransferStatusType {

	NOT_AUDITED("待审核"),
	NOT_APPROVED("待审批"),
	AUDIT_REJECT("审核拒绝"),
	APPROVED_REJECT("审批拒绝"),
	APPROVED_ASSIGN("待分配"),
	ASSIGNED("已分配");
	
	 //定义私有变量
    private String nCode;

    //构造函数，枚举类型只能为私有
    TransferStatusType(String _nCode) {
        this.nCode = _nCode;
    }

    @Override
    public String toString() {
        return String.valueOf(this.nCode);
    }
    
    public static Map<String,Object> getStatusType(){
		Map<String,Object> map = new LinkedHashMap<String,Object>();
    	TransferStatusType[] values = TransferStatusType.values();
    	for(TransferStatusType val:values){
    		map.put(val.name(), val.toString());
    	}
    	return map;    	
    }

}
