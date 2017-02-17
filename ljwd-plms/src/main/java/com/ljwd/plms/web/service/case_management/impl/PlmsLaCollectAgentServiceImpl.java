package com.ljwd.plms.web.service.case_management.impl;

import java.util.*;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.ljwd.plms.core.generic.GenericDao;
import com.ljwd.plms.core.generic.GenericServiceImpl;
import com.ljwd.plms.web.dao.case_management.PlmsLaCollectAgentMapper;
import com.ljwd.plms.web.model.case_management.PlmsLaCollectAgent;
import com.ljwd.plms.web.model.case_management.PlmsLaCollectAgentExample;
import com.ljwd.plms.web.service.case_management.inf.PlmsLaCollectAgentService;

@Service
public class PlmsLaCollectAgentServiceImpl extends
		GenericServiceImpl<PlmsLaCollectAgent, Long> implements PlmsLaCollectAgentService {
	@Resource
	private PlmsLaCollectAgentMapper plmsLaCollectAgentMapper;
	
	
	@Override
	public GenericDao<PlmsLaCollectAgent, Long> getDao() {
		return plmsLaCollectAgentMapper;
	}

	/*@Override
	public List<PlmsLaCollectAgent> selectByExample(
			PlmsLaCollectAgentExample example) {
		return plmsLaCollectAgentMapper.selectByExample(example);
	}*/

	@Override
	public void updateBatch(List<PlmsLaCollectAgent> list) {
		if(list == null || list.isEmpty()){
			return;
		}
		int comm = 500;
		int size = list.size()-1;
		if(size>=comm){
			List<PlmsLaCollectAgent> newList = new ArrayList<PlmsLaCollectAgent>();
			for(int i=0;i<=size;i++){
				if(i!=0&&i%comm==0||i==size){
					newList.add(list.get(i));
					plmsLaCollectAgentMapper.updateBatch(newList);
					newList.clear();
				}else{
					newList.add(list.get(i));
				}
			}
		}else{
			plmsLaCollectAgentMapper.updateBatch(list);
		}
	}

	@Override
	public void insertBatch(List<PlmsLaCollectAgent> list) {
		if(list == null || list.isEmpty()){
			return;
		}
		int comm = 500;
		int size = list.size()-1;
		if(size>=comm){
			List<PlmsLaCollectAgent> newList = new ArrayList<PlmsLaCollectAgent>();
			for(int i=0;i<=size;i++){
				if(i!=0&&i%comm==0||i==size){
					newList.add(list.get(i));
					plmsLaCollectAgentMapper.insertBatch(newList);
					newList.clear();
				}else{
					newList.add(list.get(i));
				}
			}
		}else{
			plmsLaCollectAgentMapper.insertBatch(list);
		}
		
	}

	/**
	 * 提前移交或委外审核通过、委外结案时结束代理催收员
	 * @param paymentIds 放款IDS
	 * @param userId     操作人
	 * @param time       操作时间
	 */
	@Override
	public void saveEndAgent(List<Long> paymentIds, String userId, Date time) {
		if(paymentIds != null && !paymentIds.isEmpty()){
			//修改的集合
			List<PlmsLaCollectAgent> updateAgentList = new ArrayList<PlmsLaCollectAgent>();
			//使用IN查询,参数不能大于1000
			int count = 1000;
			int size = paymentIds.size() - 1;
			if(size >= count){
				List<Long> newPaymentIds = new ArrayList<Long>();
				for(int i = 0 ; i <= size ; i++){
					if(i != 0 && i % count == 0 || i == size){
						newPaymentIds.add(paymentIds.get(i));
						updateAgentList.addAll(this.endAgent(newPaymentIds,userId,time));
						newPaymentIds.clear();
					}else{
						newPaymentIds.add(paymentIds.get(i));
					}
				}
			}else{
				updateAgentList.addAll(this.endAgent(paymentIds,userId,time));
			}
			//结束代理催收员
			this.updateBatch(updateAgentList);
		}
	}

	/**
	 * 提前移交或委外审核通过、委外结案时结束代理催收员
	 * @param paymentIds 放款IDS
	 * @param userId     操作人
	 * @param time       操作时间
	 */
	private List<PlmsLaCollectAgent> endAgent(List<Long> paymentIds, String userId, Date time){
		//修改催收员代理表
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("payments", paymentIds);
		map.put("mode", 2);
		List<PlmsLaCollectAgent> agentList = this.selectByExample2(map);
		//返回的集合
		List<PlmsLaCollectAgent> updateAgentList = new ArrayList<PlmsLaCollectAgent>();
		if(agentList != null && agentList.size() > 0){
			for(PlmsLaCollectAgent agent : agentList){
				PlmsLaCollectAgent newAgent = new PlmsLaCollectAgent();
				newAgent.setId(agent.getId());
				newAgent.setRecVer(agent.getRecVer());
				newAgent.setAllocEndDate(time);
				newAgent.setUpdatedBy(userId);
				newAgent.setUpdateTime(new Date());
				if(agent.getAllocBeginDate().compareTo(time) > 0){
					newAgent.setIsActive("N");
					newAgent.setAllocBeginDate(time);
				}
				updateAgentList.add(newAgent);
			}
		}
		return updateAgentList;
	}

	@Override
	public List<PlmsLaCollectAgent> selectByExample2(Map<String, Object> map) {
		return plmsLaCollectAgentMapper.selectByExample2(map);
	}

}
