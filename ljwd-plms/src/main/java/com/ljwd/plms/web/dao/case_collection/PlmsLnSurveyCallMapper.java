package com.ljwd.plms.web.dao.case_collection;

import com.ljwd.plms.core.feature.orm.mybatis.Page;
import com.ljwd.plms.core.generic.GenericDao;
import com.ljwd.plms.web.model.case_collection.PlmsLnSurveyCall;
import com.ljwd.plms.web.model.case_collection.PlmsLnSurveyCallExample;
import java.util.List;

import com.ljwd.plms.web.vo.case_collection.SurveyCallPageDto;
import com.ljwd.plms.web.vo.case_collection.SurveyCallPageExample;
import org.apache.ibatis.annotations.Param;

/**
 * 呼叫记录表,PLMS_LN_SURVEY_CALL
 * */
public interface PlmsLnSurveyCallMapper extends GenericDao<PlmsLnSurveyCall,Long>{

    int countByExample(PlmsLnSurveyCallExample example);

    int deleteByExample(PlmsLnSurveyCallExample example);

    int deleteByPrimaryKey(Long id);

    int insert(PlmsLnSurveyCall record);

    int insertSelective(PlmsLnSurveyCall record);

    List<PlmsLnSurveyCall> selectByExample(PlmsLnSurveyCallExample example);

    PlmsLnSurveyCall selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") PlmsLnSurveyCall record, @Param("example") PlmsLnSurveyCallExample example);

    int updateByExample(@Param("record") PlmsLnSurveyCall record, @Param("example") PlmsLnSurveyCallExample example);

    int updateByPrimaryKeySelective(PlmsLnSurveyCall record);

    int updateByPrimaryKey(PlmsLnSurveyCall record);

    /**
     * 分页条件查询
     * @param page Page信息
     * @param example 查询条件
     * @return Page数据
     */
    List<SurveyCallPageDto> selectByExampleAndPage(Page<SurveyCallPageDto> page, SurveyCallPageExample example);

}