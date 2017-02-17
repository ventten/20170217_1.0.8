package com.ljwd.plms.web.service.case_management.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import com.ljwd.plms.core.util.StringUtil;
import org.springframework.stereotype.Service;

import com.ljwd.plms.core.feature.orm.mybatis.Page;
import com.ljwd.plms.core.generic.GenericDao;
import com.ljwd.plms.core.generic.GenericServiceImpl;
import com.ljwd.plms.web.dao.case_management.PlmsEmpCollectSetMapper;
import com.ljwd.plms.web.model.case_management.PlmsEmpCollectSet;
import com.ljwd.plms.web.model.case_management.PlmsEmpCollectSetExample;
import com.ljwd.plms.web.model.case_management.PlmsLTransferAdvance;
import com.ljwd.plms.web.model.case_management.PlmsWorkOrderPool;
import com.ljwd.plms.web.model.case_management.PlmsWorkOrderPoolExample;
import com.ljwd.plms.web.model.workorder_pool.PlmsCollectionRuleSet;
import com.ljwd.plms.web.service.case_management.inf.PlmsEmpCollectSetService;
import com.ljwd.plms.web.service.case_management.inf.PlmsLTransferAdvanceService;
import com.ljwd.plms.web.service.case_management.inf.PlmsLaCollectAllocService;
import com.ljwd.plms.web.service.case_management.inf.PlmsWorkOrderPoolService;
import com.ljwd.plms.web.service.workorder_pool.inf.PlmsCollectionRuleSetService;
import com.ljwd.plms.web.vo.case_management.PlmsEmpCollectDto;
import com.ljwd.plms.web.vo.case_management.PlmsLaCollectRecDto;
import com.ljwd.plms.web.vo.case_management.PlmsWorkOrderAssignDto;
import com.ljwd.plms.web.vo.case_management.PlmsWorkOrderPoolParam;
import com.ljwd.plms.web.vo.sys_management.PlmsEmpCollectorParam;

@Service
public class PlmsEmpCollectSetServiceImpl extends GenericServiceImpl<PlmsEmpCollectSet, Long>
		implements PlmsEmpCollectSetService {
	@Resource
	private PlmsEmpCollectSetMapper plmsEmpCollectSetMapper;
	@Resource
	private PlmsCollectionRuleSetService plmsCollectionRuleSetService;
	@Resource
	private PlmsWorkOrderPoolService plmsWorkOrderPoolService;
	@Resource
	private PlmsLaCollectAllocService plmsLaCollectAllocService;
	@Resource
	private PlmsLTransferAdvanceService plmsLTransferAdvanceService;
	
	
	@Override
	public GenericDao<PlmsEmpCollectSet, Long> getDao() {
		return plmsEmpCollectSetMapper;
	}

	@Override
	public List<PlmsEmpCollectSet> selectByExampleList(
			PlmsEmpCollectSetExample example) {
		return plmsEmpCollectSetMapper.selectByExample(example);
	}

	
	/**
	 * 
	* @Description: 平均分配时查找催收员数据 (人员先按【月新增累计库存】升序排序，再按【月新增累计库存剩余本金】升序排序；)
	* @param map
	* @return
	* @return List<PlmsEmpCollectDto>
	 */
	@Override
	public List<PlmsEmpCollectDto> selectDtoByExampleList(
			Map<String, Object> map) {
		return plmsEmpCollectSetMapper.selectDtoByExampleList(map);
	}

	
	/**
	 * 
	* @Description: 多劳多得时查找催收员数据 
	* @param map
	* @return
	* @return List<PlmsEmpCollectDto>
	 */
	@Override
	public List<PlmsEmpCollectDto> selectDtoByExampleList02(
			Map<String, Object> map) {
		return plmsEmpCollectSetMapper.selectDtoByExampleList02(map);
	}
	
	
	/**
	 * 
	* @Description: 查找此单被回收时所对应的催收员 
	* @param list
	* @return
	* @return List<PlmsLaCollectRecDto>
	 */
	@Override
	public List<PlmsLaCollectRecDto> judgeCollector(List<Long> list) {
		List<PlmsLaCollectRecDto> collectorList = new ArrayList<PlmsLaCollectRecDto>(); 
		//提前移交状态
		PlmsCollectionRuleSet rset = plmsCollectionRuleSetService.selectByCircuCode("TRANINAD");
		
		PlmsWorkOrderPoolExample example = new PlmsWorkOrderPoolExample();
		example.createCriteria().andPaymentIdIn(list).andStatusEqualTo(rset.getStatus());
		//提前移交队列
		List<PlmsWorkOrderPool> transeferList = plmsWorkOrderPoolService.selectByExampleList(example);
		if(transeferList!=null&&transeferList.size()>0){
			List<Long> transferPayments = new ArrayList<Long>();
			for(PlmsWorkOrderPool pool:transeferList){
				transferPayments.add(pool.getPaymentId());
			}
			//在提前移交区间但是没有分配的案件处理
			List<PlmsLaCollectRecDto> transferCollector = searchTransferCollectorList(transferPayments,rset);
			if(transferCollector !=null&&transferCollector.size()>0){
				collectorList.addAll(transferCollector);
				Iterator<Long> iter=list.iterator();
				while(iter.hasNext()){
					Long paymentId =  iter.next();
					for(PlmsLaCollectRecDto rec:transferCollector){
						if(rec.getPaymentId().longValue() == paymentId.longValue()){
							iter.remove();
						}
					}
					
				}
			}
		}
		if(list!=null&&list.size()>0){
			List<PlmsLaCollectRecDto> colllectTempList = plmsEmpCollectSetMapper.judgeCollector(list);
			collectorList.addAll(colllectTempList);
		}
		

		return collectorList;
	}

	/**
	 * 
	* @param paymentId 
	 * @Description: 提前移交区间没有被分配的案件
	* @return void
	 */
	private List<PlmsLaCollectRecDto> searchTransferCollectorList(List<Long> paymentsId,PlmsCollectionRuleSet set) {
		List<PlmsLaCollectRecDto> collectorList = new ArrayList<PlmsLaCollectRecDto>(); 
		Map<String,Object> mapA = new HashMap<String,Object>();
		mapA.put("status", set.getStatus());
		mapA.put("paymentsId", paymentsId);
		//处在提前移交区间未被分配的案件（这些案件的催收员为申请提前移交的原催收员）
		List<PlmsWorkOrderPool> dtoList = plmsWorkOrderPoolService.selectTansferNotAssign(mapA);
		if(dtoList!=null&&dtoList.size()>0){
			for(PlmsWorkOrderPool dto:dtoList){
				Map<String,Object> map = new HashMap<String,Object>();
				map.put("paymentId", dto.getPaymentId());
				PlmsLTransferAdvance transfer = plmsLTransferAdvanceService.selectMaxDateTransferAdvanceByPaymentId(map);
				PlmsLaCollectRecDto rec = new PlmsLaCollectRecDto();
				rec.setApplId(dto.getApplId());
				rec.setPaymentId(dto.getPaymentId());
				if(transfer !=null){
					rec.setCollector(transfer.getCollector());
				}
				rec.setStatus(set.getStatus());
				collectorList.add(rec);
			}
			
			
		}
		return collectorList;
		
	}

	/**
    * @Description:      * 查询微贷离职但在贷后中仍有效的催收员列表 
    * @return
    * @return List<PlmsEmpCollectSet>
     */
	@Override
	public List<PlmsEmpCollectSet> searchIsquitCollector() {
		return plmsEmpCollectSetMapper.searchIsquitCollector();
	}

	/**
	 * 
	* @Description:  平均分配时查找催收员数据  	人员先按【月初库存个数】进行升序排序，再按【月初库存剩余本金】进行升序排序；
	* @param map
	* @return
	* @return
	 */
	@Override
	public List<PlmsEmpCollectDto> selectCollectorByExampleList(
			Map<String, Object> map) {
		return plmsEmpCollectSetMapper.selectCollectorByExampleList(map);
	}

	/**
	 * 
	* @Description: 催收员分页列表
	* @param pagedata
	* @param example
	* @return
	* @return
	 */
	@Override
	public Page<PlmsEmpCollectSet> selectByExampleAndPage(
			Page<PlmsEmpCollectSet> pagedata, PlmsEmpCollectorParam example) {
		plmsEmpCollectSetMapper.selectByExampleAndPage(pagedata, example);
		return pagedata;
	}

	/**
	 * 
	* @Description:添加催收用户
	* @param param
	* @param creatBy
	* @return
	* @return
	 */
	@Override
	public void insertEmpCollectSet(PlmsEmpCollectorParam param, String creatBy) {
		Long[] scopeList = param.getScopeList();
		for(int i=0;i<scopeList.length;i++){
			PlmsEmpCollectSet cSet = new PlmsEmpCollectSet();
			cSet.setGroupId(scopeList[i]);
			cSet.setIsActive("Y");
			cSet.setIsleader(param.getIsLeader());
			cSet.setMessageName(param.getMessageName());
			cSet.setIsAlloc(param.getIsAlloc());
		//	cSet.setOrgId(param.getOrgId());
			cSet.setUserId(param.getUserId());
			cSet.setCreatedBy(creatBy);
			cSet.setUpdatedBy(creatBy);
			cSet.setCreateTime(new Date());
			cSet.setUpdateTime(new Date());
			plmsEmpCollectSetMapper.insertSelective(cSet);
		}
	}

	/**
	 * 
	* @Description: 修改催收用户
	* @param set
	* @param updateBy
	* @return
	 */
	@Override
	public void updateEmpCollectSet(PlmsEmpCollectorParam set, String updateBy) {
		//1,删除原有的
		PlmsEmpCollectSetExample example= new PlmsEmpCollectSetExample();
		example.createCriteria().andUserIdEqualTo(set.getUserId());
		plmsEmpCollectSetMapper.deleteByExample(example);
		//2,插入新记录
		insertEmpCollectSet(set,updateBy);
		
	}

	@Override
	public int deleteByUserId(String userId) {
		PlmsEmpCollectSetExample example= new PlmsEmpCollectSetExample();
		example.createCriteria().andUserIdEqualTo(userId);
		return plmsEmpCollectSetMapper.deleteByExample(example);
	}

	/**
	 * 
	* @Description: 查询所有催收员
	* @param example
	* @return
	* @return
	 */
	@Override
	public List<PlmsEmpCollectSet> selectCollector(PlmsEmpCollectorParam example) {

		return plmsEmpCollectSetMapper.selectCollector(example);
	}

	/**
	 * 根据流转规则code,查找有效且可分配的催收员
	 * @param circuRuleCode 流转规则code
	 * @return List<PlmsEmpCollectSet>
	 */
	@Override
	public List<PlmsEmpCollectSet> selectCollectorByCircuRuleCode(String circuRuleCode) {
		if(StringUtil.isEmpty(circuRuleCode)){
			return null;
		}
		return plmsEmpCollectSetMapper.selectCollectorByCircuRuleCode(circuRuleCode);
	}

	/**
	 * 
	* @Description: 根据GroupId查询本区间的有效催收员 
	* @param map
	* @return
	* @return
	 *//*
	@Override
	public List<PlmsEmpCollectDto> selectByGroupId(Map<String, Object> map) {
		return plmsEmpCollectSetMapper.selectByGroupId(map);
	}

	
*/
	
}
