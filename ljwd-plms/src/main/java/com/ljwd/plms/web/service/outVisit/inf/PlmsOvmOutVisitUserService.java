package com.ljwd.plms.web.service.outVisit.inf;

import java.util.List;
import java.util.Map;

import com.ljwd.plms.core.feature.orm.mybatis.Page;
import com.ljwd.plms.core.generic.GenericService;
import com.ljwd.plms.web.model.outVisit.PlmsOvmOutVisitArea;
import com.ljwd.plms.web.model.outVisit.PlmsOvmOutVisitUser;
import com.ljwd.plms.web.model.outVisit.PlmsOvmOutVisitUserExample;
import com.ljwd.plms.web.vo.outVisit.PlmsOvmOutVisitDto;
import com.ljwd.plms.web.vo.sys_management.PlmsEmpCollectorParam;

public interface PlmsOvmOutVisitUserService extends GenericService<PlmsOvmOutVisitUser, Long> {

	/**
	 * 根据applId查找此案件所属区域的外访人员列表
	* @Description: TODO 
	* @param applId
	* @return
	* @return List<PlmsOvmOutVisitUser>
	 */
	List<PlmsOvmOutVisitUser> searchOutVisitUserListByApplId(Long applId);
	
	/**
	 * 
	* @Description: 根据applId查询合同编号 
	* @param applId
	* @return
	* @return List<String>
	 */
	String searchCntrctNoByapplId(Long applId);

	/**
	 * 
	* @Description: 添加外访员
	* @param outVisiter
	* @param createBy
	* @return void
	 */
	void insertOutVisitUser(PlmsEmpCollectorParam outVisiter, String createBy);
	
	
    List<PlmsOvmOutVisitUser> selectByExample(PlmsOvmOutVisitUserExample example);

    /**
     * 
    * @Description: 外访员分页查找 
    * @param pageData
    * @param example
    * @return
    * @return Page<PlmsOvmOutVisitUser>
     */
	Page<PlmsOvmOutVisitUser> selectByExampleAndPage(
			Page<PlmsOvmOutVisitUser> pageData, PlmsEmpCollectorParam example);

	/**
	 * 
	* @Description: 修改外访员
	* @param outVisiter
	* @param createBy
	* @return void
	 */
	void updatetOutVisitUser(PlmsEmpCollectorParam outVisiter, String createBy);
	
	/**
	 * 根据map查询
	* @Description: 
	* @param map
	* @return
	* @return List<PlmsOvmOutVisitUser>
	 */
	List<PlmsOvmOutVisitUser> searchInfoByMap(Map<String,Object> map);
	/**
	 * 
	 * @Description: 查找所有的外访区域
	 * @return List<PlmsOvmOutVisitArea>  
	 * @author zhengjizhao
	 * @date 2017年2月10日下午4:25:54
	 */
	List<PlmsOvmOutVisitDto> searchOutVisitArea();
	

}
