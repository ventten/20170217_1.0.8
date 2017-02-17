package com.ljwd.plms.web.service.case_management.inf;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.ljwd.plms.core.feature.orm.mybatis.Page;
import com.ljwd.plms.core.generic.GenericService;
import com.ljwd.plms.web.model.case_management.PlmsEmpCollectSet;
import com.ljwd.plms.web.model.case_management.PlmsEmpCollectSetExample;
import com.ljwd.plms.web.vo.case_management.PlmsEmpCollectDto;
import com.ljwd.plms.web.vo.case_management.PlmsLaCollectRecDto;
import com.ljwd.plms.web.vo.case_management.PlmsWorkOrderPoolDto;
import com.ljwd.plms.web.vo.case_management.PlmsWorkOrderPoolParam;
import com.ljwd.plms.web.vo.sys_management.PlmsEmpCollectorParam;

public interface PlmsEmpCollectSetService extends GenericService<PlmsEmpCollectSet, Long>{

	List<PlmsEmpCollectSet> selectByExampleList(PlmsEmpCollectSetExample example);
	/**
	 * 
	* @Description: 平均分配时查找催收员数据	人员先按【月新增累计库存】升序排序，再按【月新增累计库存剩余本金】升序排序；
	* @param map
	* @return
	* @return List<PlmsEmpCollectDto>
	 */
	List<PlmsEmpCollectDto> selectDtoByExampleList(Map<String,Object> map);
	
	
	/**
	 * 
	* @Description: 平均分配时查找催收员数据  	人员先按【月初库存个数】进行升序排序，再按【月初库存剩余本金】进行升序排序；
	* @param map
	* @return
	* @return List<PlmsEmpCollectDto>
	 */
	List<PlmsEmpCollectDto> selectCollectorByExampleList(Map<String,Object> map);

	
	
	/**
	 * 
	* @Description: 多劳多得时查找催收员数据 
	* @param map
	* @return
	* @return List<PlmsEmpCollectDto>
	 */
	List<PlmsEmpCollectDto> selectDtoByExampleList02(Map<String,Object> map);
	/**
	 * 
	* @Description: 查找此单被回收时所对应的催收员 
	* @param list
	* @return
	* @return List<PlmsLaCollectRecDto>
	 */
    List<PlmsLaCollectRecDto> judgeCollector(List<Long> list);
    
    /**
    * @Description:      * 查询离职的催收员列表 
    * @return
    * @return List<PlmsEmpCollectSet>
     */
    List<PlmsEmpCollectSet> searchIsquitCollector();

    /**
     * 
    * @Description: 催收员分页列表
    * @param pagedata
    * @param example
    * @return
    * @return Page<PlmsEmpCollectSet>
     */
    Page<PlmsEmpCollectSet> selectByExampleAndPage(Page<PlmsEmpCollectSet> pagedata, PlmsEmpCollectorParam example);
    
    /**
     * 
    * @Description: 添加催收用户 
    * @param param
    * @param creatBy
    * @return
    * @return int
     */
    void insertEmpCollectSet(PlmsEmpCollectorParam param,String creatBy);
    
    /**
     * 
    * @Description: 修改催收用户 
    * @param param
    * @param updateBy
    * @return
    * @return int
     */
	void updateEmpCollectSet(PlmsEmpCollectorParam set, String updateBy);
	
	/**
	 * 
	* @Description:根据用户Id删除催收员  
	* @param userId
	* @return
	* @return int
	 */
	int deleteByUserId(String userId);
    
	/* *//**
    * @Description: 根据GroupId查询本区间的有效催收员
    * @param map
    * @return
    * @return List<PlmsEmpCollectSet>
     *//*
    List<PlmsEmpCollectDto>  selectByGroupId(Map<String,Object> map);*/
	
	 /**
    * @Description: 查询所有催收员
    * @param example
    * @return List<PlmsEmpCollectSet>
     */
    List<PlmsEmpCollectSet> selectCollector(PlmsEmpCollectorParam example);

	/**
	 * 根据流转规则code,查找有效且可分配的催收员
	 * @param circuRuleCode 流转规则code
	 * @return List<PlmsEmpCollectSet>
	 */
	List<PlmsEmpCollectSet> selectCollectorByCircuRuleCode(String circuRuleCode);

}
