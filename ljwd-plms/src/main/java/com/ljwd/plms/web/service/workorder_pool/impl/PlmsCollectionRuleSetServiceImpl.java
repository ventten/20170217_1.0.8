package com.ljwd.plms.web.service.workorder_pool.impl;

import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import com.ljwd.plms.web.vo.workorder_pool.CollectionCircuDto;

import org.springframework.stereotype.Service;

import com.ljwd.plms.core.generic.GenericDao;
import com.ljwd.plms.core.generic.GenericServiceImpl;
import com.ljwd.plms.web.dao.workorder_pool.PlmsCollectionRuleSetMapper;
import com.ljwd.plms.web.model.workorder_pool.PlmsCollectionRuleSet;
import com.ljwd.plms.web.model.workorder_pool.PlmsCollectionRuleSetExample;
import com.ljwd.plms.web.service.workorder_pool.inf.PlmsCollectionRuleSetService;
import com.ljwd.plms.web.vo.workorder_pool.PlmsCollectionRuleSetDto;

@Service
public class PlmsCollectionRuleSetServiceImpl extends GenericServiceImpl<PlmsCollectionRuleSet, Long> implements PlmsCollectionRuleSetService {

	@Resource
	private PlmsCollectionRuleSetMapper plmsCollectionRuleSetMapper;

	@Override
	public int insert(PlmsCollectionRuleSet model) {
		model.setCreateTime(new Date());
		model.setUpdateTime(new Date());
		model.setIsActive("Y");
		model.setIsRunning("Y");
		model.setRecVer(0L);
		model.setTagSeq(1L);
		return plmsCollectionRuleSetMapper.insertSelective(model);
	}

	@Override
	public GenericDao<PlmsCollectionRuleSet, Long> getDao() {
		return plmsCollectionRuleSetMapper;
	}

	@Override
	public List<PlmsCollectionRuleSetDto> selectDtoList() {
		List<PlmsCollectionRuleSetDto> list = plmsCollectionRuleSetMapper.selectDtoList();
		for(PlmsCollectionRuleSetDto dto:list){
			if(dto.getIsActive().equals("Y")){
				dto.setIsActive("有效");
			}else{
				dto.setIsActive("无效");
			}
		}
		return plmsCollectionRuleSetMapper.selectDtoList();
	}


	@Override
	public int updateCheckExit(PlmsCollectionRuleSet set) {
		String circuCode = set.getAssignRuleCode();
		PlmsCollectionRuleSetExample examp = new PlmsCollectionRuleSetExample();
		examp.createCriteria().andIsRunningEqualTo("Y").andIsActiveEqualTo("Y").andCircuRuleCodeEqualTo(circuCode);
		List<PlmsCollectionRuleSet> exitList = plmsCollectionRuleSetMapper.selectByExample(examp);
		int count = 0;
		if(exitList.size()>0){
			
		}else{
			if (checkCircuCodeExit(set.getCircuRuleCode())){
				int val = set.getVal();
				PlmsCollectionRuleSetExample example = new PlmsCollectionRuleSetExample();
				example.createCriteria().andIsRunningEqualTo("Y").andIsActiveEqualTo("Y").andValEqualTo(val);
				List<PlmsCollectionRuleSet> list0 = plmsCollectionRuleSetMapper.selectByExample(example);
				if(list0.size()==0){
					
				}else{
					PlmsCollectionRuleSetExample example1 = new PlmsCollectionRuleSetExample();
					example1.createCriteria().andValGreaterThanOrEqualTo(val).andIsRunningEqualTo("Y").andIsActiveEqualTo("Y");
					example1.setOrderByClause("val desc");
					List<PlmsCollectionRuleSet> list = plmsCollectionRuleSetMapper.selectByExample(example1);
					if(list.size()>0){
						for(PlmsCollectionRuleSet co:list){
							co.setVal(co.getVal()+1);
							
							plmsCollectionRuleSetMapper.updateByPrimaryKeySelective(co);
						}
					}
				}
				
				 count = this.insert(set);
			}
		}
		
			return count;
	}

    /**
    * @Description: 判断流转规则是否已存在
    * @param circuRuleCode
    * @return boolean
     */
	private boolean checkCircuCodeExit(String circuRuleCode) {
		boolean b = true;
		PlmsCollectionRuleSetExample example = new PlmsCollectionRuleSetExample();
		example.createCriteria().andIsRunningEqualTo("Y").andIsActiveEqualTo("Y").andCircuRuleCodeEqualTo(circuRuleCode);
		List<PlmsCollectionRuleSet> list = plmsCollectionRuleSetMapper.selectByExample(example);
		if(list.size()>0){
			b = false;
		}
		return b;
	}

	@Override
	public List<PlmsCollectionRuleSetDto> selectworkOrderPoolRulesList() {
		return plmsCollectionRuleSetMapper.selectworkOrderPoolRulesList();
	}

    /**
     * @Description: 根据流转规则查询区间状态(单个)
     * @param code 流转规则code
     * @return PlmsCollectionRuleSet
     */
    @Override
	public PlmsCollectionRuleSet selectByCircuCode(String code) {
		PlmsCollectionRuleSetExample example = new PlmsCollectionRuleSetExample();
		example.createCriteria().andCircuRuleCodeEqualTo(code).andIsActiveEqualTo("Y");
        List<PlmsCollectionRuleSet> list = plmsCollectionRuleSetMapper.selectByExample(example);
        if(list == null || list.isEmpty()){
            return null;
        }
		return list.get(0);
	}

    /**
     * @param code 流转规则code
     * @return 区间状态值
     * @Description: 根据流转规则查询区间状态值
     */
    @Override
    public String selectStatusByCircuCode(String code) {
        PlmsCollectionRuleSet set = this.selectByCircuCode(code);
        return set == null ? null : set.getStatus();
    }

    @Override
	public List<PlmsCollectionRuleSet> selectByExampleList(
			PlmsCollectionRuleSetExample example) {
		example.setOrderByClause("val");
		return plmsCollectionRuleSetMapper.selectByExample(example);
	}


	@Override
	public String checkcircuRule(String circuRule) {
		String result = "N";
		PlmsCollectionRuleSetExample example = new PlmsCollectionRuleSetExample();
		example.createCriteria().andCircuRuleCodeEqualTo(circuRule).andIsActiveEqualTo("Y");
		List<PlmsCollectionRuleSet> cheackList = plmsCollectionRuleSetMapper.selectByExample(example);
		if(cheackList!=null&&cheackList.size()>0){
			result = "Y";
		}
		return result;
	}

	/**
	* @Description: 具有上限并具有下限的区间
	* @return
	 */
	@Override
	public List<PlmsCollectionRuleSetDto> hasOverduedaysScope() {
		return plmsCollectionRuleSetMapper.hasOverduedaysScope();
	}


	/**
	* @Description: 根据用户id查找此用户的数据区间
	* @param userId
	* @return
	 */
	@Override
	public List<PlmsCollectionRuleSet> selectScopeByUserId(String userId) {
		return plmsCollectionRuleSetMapper.selectScopeByUserId(userId);
	}

    /**
     * @Description: 查找有效的区间且流转规则overduedays_from不为空的数据
     * @return List<PlmsCollectionRuleSet>
     */
    @Override
    public List<CollectionCircuDto> selectCollectionCircu(Map<String, Object> map ) {
        return plmsCollectionRuleSetMapper.selectCollectionCircu(map);
    }

}
