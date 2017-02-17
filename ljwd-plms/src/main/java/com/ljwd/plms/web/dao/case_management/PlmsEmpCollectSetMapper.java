package com.ljwd.plms.web.dao.case_management;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.ljwd.plms.core.feature.orm.mybatis.Page;
import com.ljwd.plms.core.generic.GenericDao;
import com.ljwd.plms.web.model.case_management.PlmsEmpCollectSet;
import com.ljwd.plms.web.model.case_management.PlmsEmpCollectSetExample;
import com.ljwd.plms.web.vo.case_management.PlmsEmpCollectDetailDto;
import com.ljwd.plms.web.vo.case_management.PlmsEmpCollectDto;
import com.ljwd.plms.web.vo.case_management.PlmsLaCollectRecDto;
import com.ljwd.plms.web.vo.sys_management.PlmsEmpCollectorParam;

public interface PlmsEmpCollectSetMapper extends GenericDao<PlmsEmpCollectSet, Long>{
    int countByExample(PlmsEmpCollectSetExample example);

    int deleteByExample(PlmsEmpCollectSetExample example);

    int deleteByPrimaryKey(Long id);

    int insert(PlmsEmpCollectSet record);

    int insertSelective(PlmsEmpCollectSet record);

    List<PlmsEmpCollectSet> selectByExample(PlmsEmpCollectSetExample example);

    PlmsEmpCollectSet selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") PlmsEmpCollectSet record, @Param("example") PlmsEmpCollectSetExample example);

    int updateByExample(@Param("record") PlmsEmpCollectSet record, @Param("example") PlmsEmpCollectSetExample example);

    int updateByPrimaryKeySelective(PlmsEmpCollectSet record);

    int updateByPrimaryKey(PlmsEmpCollectSet record);
    
    
    //自动分配(平均)统计催收员数据  人员先按【月新增累计库存】升序排序，再按【月新增累计库存剩余本金】升序排序；
    List<PlmsEmpCollectDto> selectDtoByExampleList(Map<String,Object> map);
    
    //自动分配(多劳多得)统计催收员数据
    List<PlmsEmpCollectDto> selectDtoByExampleList02(Map<String,Object> map);
    
    List<PlmsLaCollectRecDto> judgeCollector(@Param("payments")List<Long> list);
    //手动分配统计催收员方式一（不管代理出去与否，库存都属于原催收员）
    List<PlmsEmpCollectDetailDto> getAllCollector01(Map<String,Object> map);
    //手动分配统计催收员方式一（代理出去并由代理催收员催收成功的，库存都属于代理催收员，其余情况库存仍属于原催收员）
    List<PlmsEmpCollectDetailDto> getAllCollector02(Map<String,Object> map);
    //查询离职的催收员列表
    List<PlmsEmpCollectSet> searchIsquitCollector();
    
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
	* @Description: 催收员分页列表 
	* @param pagedata
	* @param example
	* @return
	* @return List<PlmsEmpCollectSet>
	 */
    List<PlmsEmpCollectSet> selectByExampleAndPage(Page<PlmsEmpCollectSet> pagedata, PlmsEmpCollectorParam example);
    
    /**
     * 
    * @Description: 根据GroupId查询本区间的有效催收员 
    * @param map
    * @return
    * @return List<PlmsEmpCollectSet>
     */
    List<PlmsEmpCollectDto>  selectByGroupId(Map<String,Object> map);
    
    /**
     * 
    * @Description: 查询所有催收员
    * @param example
    * @return
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