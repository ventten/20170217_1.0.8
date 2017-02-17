package com.ljwd.plms.web.dao.outVisit;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.ljwd.plms.core.feature.orm.mybatis.Page;
import com.ljwd.plms.core.generic.GenericDao;
import com.ljwd.plms.web.model.outVisit.PlmsOvmOutVisitArea;
import com.ljwd.plms.web.model.outVisit.PlmsOvmOutVisitUser;
import com.ljwd.plms.web.model.outVisit.PlmsOvmOutVisitUserExample;
import com.ljwd.plms.web.vo.outVisit.PlmsOvmOutVisitDto;
import com.ljwd.plms.web.vo.sys_management.PlmsEmpCollectorParam;

public interface PlmsOvmOutVisitUserMapper extends GenericDao<PlmsOvmOutVisitUser,Long>{
    int countByExample(PlmsOvmOutVisitUserExample example);

    int deleteByExample(PlmsOvmOutVisitUserExample example);

    int deleteByPrimaryKey(Long id);

    int insert(PlmsOvmOutVisitUser record);

    int insertSelective(PlmsOvmOutVisitUser record);

    List<PlmsOvmOutVisitUser> selectByExample(PlmsOvmOutVisitUserExample example);

    PlmsOvmOutVisitUser selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") PlmsOvmOutVisitUser record, @Param("example") PlmsOvmOutVisitUserExample example);

    int updateByExample(@Param("record") PlmsOvmOutVisitUser record, @Param("example") PlmsOvmOutVisitUserExample example);

    int updateByPrimaryKeySelective(PlmsOvmOutVisitUser record);

    int updateByPrimaryKey(PlmsOvmOutVisitUser record);
    
    /**
	 * 根据applId查找此案件所属区域的外访人员列表
	* @Description: TODO 
	* @param applId
	* @return
	* @return List<PlmsOvmOutVisitUser>
	 */
	List<PlmsOvmOutVisitUser> searchOutVisitUserListByApplId(@Param("applId")Long applId);
	
	/**
	 * 
	* @Description: 根据applId查询合同编号 
	* @param applId
	* @return
	* @return List<String>
	 */
	String searchCntrctNoByapplId(@Param("applId")Long applId);
	
	
	/**
	 * 
	* @Description:外访员分页查找
	* @param pageData
	* @param example
	* @return
	* @return List<PlmsOvmOutVisitUser>
	 */
	List<PlmsOvmOutVisitUser> selectByExampleAndPage(
			Page<PlmsOvmOutVisitUser> pageData, PlmsEmpCollectorParam example);

	/**
	 * 查找外访用户中共有多少种区域
	* @Description: TODO 
	* @return
	* @return List<Long>
	 */
	List<Long> searchAreaIdForOutVisitUser();
	
	/**
	 * 
	* @Description: 某区域外访员按总库存升序排序 
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
	 * @date 2017年2月10日下午4:27:53
	 */
	List<PlmsOvmOutVisitDto> searchOutVisitArea();
}