package com.ljwd.plms.web.service.case_management.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.ljwd.plms.core.generic.GenericDao;
import com.ljwd.plms.core.generic.GenericServiceImpl;
import com.ljwd.plms.web.dao.case_management.PlmsLaCollectAllocMapper;
import com.ljwd.plms.web.model.case_management.PlmsLaCollectAlloc;
import com.ljwd.plms.web.model.case_management.PlmsLaCollectAllocExample;
import com.ljwd.plms.web.service.case_management.inf.PlmsLaCollectAllocService;

@Service
public class PlmsLaCollectAllocServiceImpl extends GenericServiceImpl<PlmsLaCollectAlloc, Long> implements PlmsLaCollectAllocService {
	@Resource
	private PlmsLaCollectAllocMapper plmsLaCollectAllocMapper;

	@Override
	public GenericDao<PlmsLaCollectAlloc, Long> getDao() {
		return plmsLaCollectAllocMapper;
	}

	@Override
	public List<PlmsLaCollectAlloc> selectByExample(PlmsLaCollectAllocExample example) {
		return plmsLaCollectAllocMapper.selectByExample(example);
	}

	@Override
	public void insertBatch(List<PlmsLaCollectAlloc> list) {
        if(list == null || list.isEmpty()){
            return;
        }
		int comm = 500;
		int size = list.size()-1;
		if(size>=comm){
			List<PlmsLaCollectAlloc> newList = new ArrayList<PlmsLaCollectAlloc>();
			for(int i=0;i<=size;i++){
				if(i!=0&&i%comm==0||i==size){
					newList.add(list.get(i));
					plmsLaCollectAllocMapper.insertBatch(newList);
					newList.clear();
				}else{
					newList.add(list.get(i));
				}
			}
		}else{
			plmsLaCollectAllocMapper.insertBatch(list);
		}
	}

	@Override
	public void updateBatch(List<PlmsLaCollectAlloc> list) {
        if(list == null || list.isEmpty()){
            return;
        }
		int comm = 500;
		int size = list.size()-1;
		if(size>=comm){
			List<PlmsLaCollectAlloc> newList = new ArrayList<PlmsLaCollectAlloc>();
			for(int i=0;i<=size;i++){
				if(i!=0&&i%comm==0||i==size){
					newList.add(list.get(i));
					plmsLaCollectAllocMapper.updateBatch(newList);
					newList.clear();
				}else{
					newList.add(list.get(i));
				}
			}	
		}else{
			plmsLaCollectAllocMapper.updateBatch(list);
		}
	}

	/**
	* @Description: 根据条件查询最新的分配记录
	* @param map
	* @return 实体集
	 */
	@Override
	public List<PlmsLaCollectAlloc> selectMaxDateByMap(Map<String, Object> map) {
		return plmsLaCollectAllocMapper.selectMaxDateByMap(map);
	}

    /**
     * @Description: 根据借款ID查询有效的未结束的最新的分配记录
     * @param applId 借款ID
     * @return 实体
     */
    @Override
    public PlmsLaCollectAlloc selectMaxAllocByApplId(Long applId) {
        if(applId == null){
            return null;
        }
        PlmsLaCollectAllocExample example = new PlmsLaCollectAllocExample();
        example.createCriteria().andAllocEndDateIsNull().andIsActiveEqualTo("Y").andApplIdEqualTo(applId);
        example.setOrderByClause("ID DESC");
        List<PlmsLaCollectAlloc> allocList = this.selectByExample(example);
        if(allocList == null || allocList.isEmpty()){
            return null;
        }
        return allocList.get(0);
    }

	/**
	 * 提前移交或委外审核通过、委外结案时结束催收员
	 * @param paymentIds 放款IDS
	 * @param userId     操作人
	 * @param time       操作时间
	 */
	@Override
	public void saveEendAlloc(List<Long> paymentIds, String userId, Date time) {
		if(paymentIds != null && !paymentIds.isEmpty()){
			//修改的集合
			List<PlmsLaCollectAlloc> updateAllocList = new ArrayList<PlmsLaCollectAlloc>();
			//使用IN查询,参数不能大于1000
			int count = 1000;
			int size = paymentIds.size() - 1;
			if(size >= count){
				List<Long> newPaymentIds = new ArrayList<Long>();
				for(int i = 0 ; i <= size ; i++){
					if(i != 0 && i % count == 0 || i == size){
						newPaymentIds.add(paymentIds.get(i));
						updateAllocList.addAll(this.endAlloc(newPaymentIds,userId,time));
						newPaymentIds.clear();
					}else{
						newPaymentIds.add(paymentIds.get(i));
					}
				}
			}else{
				updateAllocList.addAll(this.endAlloc(paymentIds,userId,time));
			}
			//结束催收员
			this.updateBatch(updateAllocList);
		}
	}

	/**
	 * 提前移交或委外审核通过、委外结案时结束催收员
	 * @param paymentIds 放款IDS
	 * @param userId     操作人
	 * @param time       操作时间
	 */
	private List<PlmsLaCollectAlloc> endAlloc(List<Long> paymentIds, String userId, Date time) {
		//修改催收员分配表
		PlmsLaCollectAllocExample exapAlloc = new PlmsLaCollectAllocExample();
		exapAlloc.createCriteria().andAllocEndDateIsNull().andPaymentIdIn(paymentIds).andIsActiveEqualTo("Y");
		List<PlmsLaCollectAlloc> allocList = this.selectByExample(exapAlloc);
		//返回的集合
		List<PlmsLaCollectAlloc> updateAllocList = new ArrayList<PlmsLaCollectAlloc>();

		if(allocList != null && allocList.size() > 0){
			for(PlmsLaCollectAlloc alloc : allocList){
				PlmsLaCollectAlloc newAlloc = new PlmsLaCollectAlloc();
				newAlloc.setId(alloc.getId());
				newAlloc.setRecVer(alloc.getRecVer());
				newAlloc.setAllocType(PlmsLaCollectAlloc.TYPE_ADJUST);
				newAlloc.setAdjustedBy(userId);
				newAlloc.setAdjustTime(time);
				newAlloc.setAllocEndDate(time);
				newAlloc.setUpdatedBy(userId);
				newAlloc.setUpdateTime(time);

				updateAllocList.add(newAlloc);
			}
		}
		return updateAllocList;
	}

}
