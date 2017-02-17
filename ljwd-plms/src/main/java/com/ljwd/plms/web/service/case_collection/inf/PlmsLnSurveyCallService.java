package com.ljwd.plms.web.service.case_collection.inf;

import com.ljwd.plms.core.feature.orm.mybatis.Page;
import com.ljwd.plms.core.generic.GenericService;
import com.ljwd.plms.web.model.case_collection.PlmsLnSurveyCall;
import com.ljwd.plms.web.model.case_collection.PlmsLnSurveyCallExample;
import com.ljwd.plms.web.model.cust.PlmsLnPolyInfoExample;
import com.ljwd.plms.web.vo.case_collection.SurveyCallPageDto;
import com.ljwd.plms.web.vo.case_collection.SurveyCallPageExample;

import java.util.List;

/**
 * 呼叫记录表,PLMS_LN_SURVEY_CALL
 * */
public interface PlmsLnSurveyCallService extends GenericService<PlmsLnSurveyCall,Long> {

    /**
     * 插入对象
     * @param plmsLnSurveyCall 对象
     * @return Long 新纪录ID
     */
    Long insertSurveyCall(PlmsLnSurveyCall plmsLnSurveyCall);

    /**
     * 分页条件查询
     * @param page Page信息
     * @param example 查询条件
     * @return Page数据
     */
    Page<SurveyCallPageDto> selectByExampleAndPage(Page<SurveyCallPageDto> page, SurveyCallPageExample example);

}
