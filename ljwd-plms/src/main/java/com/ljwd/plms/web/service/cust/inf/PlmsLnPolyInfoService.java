package com.ljwd.plms.web.service.cust.inf;

import java.util.List;

import com.ljwd.plms.core.feature.orm.mybatis.Page;
import com.ljwd.plms.core.generic.GenericService;
import com.ljwd.plms.web.model.cust.PlmsLnApplInfo;
import com.ljwd.plms.web.model.cust.PlmsLnPolyInfoExample;
import com.ljwd.plms.web.wsdl.webservice.service.Contact;
/**
 * 
* @ClassName: PlmsLnPolyInfoService 
* @Description: TODO(聚信立) 
* @author zhengjizhao
* @date 2016年8月17日 下午4:11:06 
*
 */
public interface PlmsLnPolyInfoService{

	/**
     * 分页条件查询
     * @param example 查询条件
     * @return Page数据
     */
    List<Contact> selectByExampleAndPage( PlmsLnPolyInfoExample example);
}
