package com.ljwd.plms.web.service.workorder_pool.impl;

import javax.annotation.Resource;

import com.ljwd.plms.web.model.workorder_pool.PlmsCircuRuleSetExample;

import org.springframework.stereotype.Service;

import com.ljwd.plms.core.generic.GenericDao;
import com.ljwd.plms.core.generic.GenericServiceImpl;
import com.ljwd.plms.web.dao.workorder_pool.PlmsCircuRuleSetMapper;
import com.ljwd.plms.web.model.workorder_pool.PlmsCircuRuleSet;
import com.ljwd.plms.web.service.workorder_pool.inf.PlmsCircuRuleSetService;

import java.util.List;

@Service
public class PlmsCircuRuleSetServiceImpl extends GenericServiceImpl<PlmsCircuRuleSet, Long> implements PlmsCircuRuleSetService {
	
	@Resource
	private PlmsCircuRuleSetMapper plmsCircuRuleSetMapper;

	
	@Override
	public GenericDao<PlmsCircuRuleSet, Long> getDao() {
		return plmsCircuRuleSetMapper;
	}

    /**
     * 根据条件查询
     * @param example 查询条件
     * @return 实体集
     */
    @Override
    public List<PlmsCircuRuleSet> selectByExample(PlmsCircuRuleSetExample example) {
        return plmsCircuRuleSetMapper.selectByExample(example);
    }

	@Override
	public int update(PlmsCircuRuleSet model) {
        return plmsCircuRuleSetMapper.updateByPrimaryKey(model);
	}

	/**
	 * 
	* @Description: 根据区间值查找逾期天数范围
	* @param status
	* @return
	* @return
	 */
	@Override
	public PlmsCircuRuleSet searchOverDaysByStatus(String status) {

		return plmsCircuRuleSetMapper.searchOverDaysByStatus(status);
	}

    
}
