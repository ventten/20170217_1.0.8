package com.ljwd.plms.web.service.case_collection.impl;

import com.ljwd.plms.core.feature.orm.mybatis.Page;
import com.ljwd.plms.core.generic.GenericDao;
import com.ljwd.plms.core.generic.GenericServiceImpl;
import com.ljwd.plms.web.dao.case_collection.PlmsLnSurveyCallMapper;
import com.ljwd.plms.web.model.case_collection.PlmsLnSurveyCall;
import com.ljwd.plms.web.model.case_collection.PlmsLnSurveyCallExample;
import com.ljwd.plms.web.model.cust.PlmsLnPolyInfoExample;
import com.ljwd.plms.web.service.case_collection.inf.PlmsLnSurveyCallService;
import com.ljwd.plms.web.vo.case_collection.SurveyCallPageDto;
import com.ljwd.plms.web.vo.case_collection.SurveyCallPageExample;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 呼叫记录表,PLMS_LN_SURVEY_CALL
 * */
@Service
public class PlmsLnSurveyCallServiceImpl extends GenericServiceImpl<PlmsLnSurveyCall,Long> implements PlmsLnSurveyCallService {

    @Resource
    private PlmsLnSurveyCallMapper plmsLnSurveyCallMapper;

    /**
     * 定义成抽象方法,由子类实现,完成dao的注入
     * @return GenericDao实现类
     */
    @Override
    public GenericDao<PlmsLnSurveyCall, Long> getDao() {
        return plmsLnSurveyCallMapper;
    }

    /**
     * 插入对象
     * @param plmsLnSurveyCall 对象
     */
    @Override
    public Long insertSurveyCall(PlmsLnSurveyCall plmsLnSurveyCall) {
        int ret = plmsLnSurveyCallMapper.insert(plmsLnSurveyCall);
        if(ret <= 0){
            throw new RuntimeException("插入呼叫记录失败");
        }
        return plmsLnSurveyCall.getId();
    }

    /**
     * 分页条件查询
     * @param page    Page信息
     * @param example 查询条件
     * @return Page数据
     */
    @Override
    public Page<SurveyCallPageDto> selectByExampleAndPage(Page<SurveyCallPageDto> page, SurveyCallPageExample example) {
        plmsLnSurveyCallMapper.selectByExampleAndPage(page, example);
        return page;
    }

}
