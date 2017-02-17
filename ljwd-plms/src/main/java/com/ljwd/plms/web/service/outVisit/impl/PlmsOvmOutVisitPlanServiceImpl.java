package com.ljwd.plms.web.service.outVisit.impl;

import com.ljwd.plms.core.feature.orm.mybatis.Page;
import com.ljwd.plms.core.generic.GenericDao;
import com.ljwd.plms.core.generic.GenericServiceImpl;
import com.ljwd.plms.mapp.vo.egress.AppOutVisitPlanResultVo;
import com.ljwd.plms.web.dao.outVisit.PlmsOvmCancelTypeMapper;
import com.ljwd.plms.web.dao.outVisit.PlmsOvmOutVisitInfoMapper;
import com.ljwd.plms.web.dao.outVisit.PlmsOvmOutVisitLogMapper;
import com.ljwd.plms.web.dao.outVisit.PlmsOvmOutVisitPlanMapper;
import com.ljwd.plms.web.dao.outVisit.PlmsOvmOutVisitUserMapper;
import com.ljwd.plms.web.dao.outVisit.PlmsOvmResultTypeMapper;
import com.ljwd.plms.web.model.case_collection.PlmsLaCollectionRecord;
import com.ljwd.plms.web.model.outVisit.PlmsOvmCancelType;
import com.ljwd.plms.web.model.outVisit.PlmsOvmCancelTypeExample;
import com.ljwd.plms.web.model.outVisit.PlmsOvmOutVisitInfo;
import com.ljwd.plms.web.model.outVisit.PlmsOvmOutVisitLog;
import com.ljwd.plms.web.model.outVisit.PlmsOvmOutVisitPlan;
import com.ljwd.plms.web.model.outVisit.PlmsOvmOutVisitPlanExample;
import com.ljwd.plms.web.model.outVisit.PlmsOvmOutVisitSign;
import com.ljwd.plms.web.model.outVisit.PlmsOvmOutVisitUser;
import com.ljwd.plms.web.model.outVisit.PlmsOvmResultType;
import com.ljwd.plms.web.model.outVisit.PlmsOvmResultTypeExample;
import com.ljwd.plms.web.service.case_collection.inf.PlmsLaCollectionRecordService;
import com.ljwd.plms.web.service.outVisit.inf.PlmsOvmOutVisitPlanService;
import com.ljwd.plms.web.service.outVisit.inf.PlmsOvmOutVisitSignService;
import com.ljwd.plms.web.vo.SessionMsg;
import com.ljwd.plms.web.vo.outVisit.AllOutVisitDetailInfoResult;
import com.ljwd.plms.web.vo.outVisit.AllOutVisitPlanDetailCustResult;
import com.ljwd.plms.web.vo.outVisit.AllOutVisitPlanParamDto;
import com.ljwd.plms.web.vo.outVisit.AllOutVisitPlanResult;
import com.ljwd.plms.web.vo.outVisit.OutVisitPlanDto;
import com.ljwd.plms.web.vo.outVisit.OutVisitPlanStatusType;
import com.ljwd.plms.web.vo.outVisit.OutVisitRouteParamDto;
import com.ljwd.plms.web.vo.outVisit.OutVisitRouteResult;
import com.ljwd.plms.web.vo.outVisit.OutVisitStatusType;

import org.apache.ibatis.session.RowBounds;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

@Service
public class PlmsOvmOutVisitPlanServiceImpl extends
		GenericServiceImpl<PlmsOvmOutVisitPlan, Long> implements PlmsOvmOutVisitPlanService {

	@Resource
	private PlmsOvmOutVisitPlanMapper plmsOvmOutVisitPlanMapper;
	@Resource
	private PlmsOvmOutVisitInfoMapper plmsOvmOutVisitInfoMapper;
	@Resource
	private PlmsOvmCancelTypeMapper plmsOvmCancelTypeMapper;
	@Resource
	private PlmsOvmResultTypeMapper plmsOvmResultTypeMapper;
	@Resource
	private PlmsOvmOutVisitUserMapper plmsOvmOutVisitUserMapper;
	@Resource
	private PlmsOvmOutVisitLogMapper plmsOvmOutVisitLogMapper;
	@Resource
	private PlmsLaCollectionRecordService collectionRecordService;
	@Resource
	private PlmsOvmOutVisitSignService outVisitSignService;

	
	@Override
	public GenericDao<PlmsOvmOutVisitPlan, Long> getDao() {
		return plmsOvmOutVisitPlanMapper;
	}
	
	/*@Override
	public PlmsOvmOutVisitPlan selectById(Long id) {
		PlmsOvmOutVisitPlan dto = plmsOvmOutVisitPlanMapper.selectByPrimaryKey(id);
		if(dto!=null){
			String assitBy = dto.getAssistBy();
			if(assitBy!=null){
				String assitByName = "";
				String[] assitBys = assitBy.split(",");
				List<String> userIds = Arrays.asList(assitBys);
				Map<String,Object> map  = new HashMap<String,Object>();
				map.put("userIds", userIds);
				List<PlmsOvmOutVisitUser> users = plmsOvmOutVisitUserMapper.searchInfoByMap(map);
				if(users.size()>0){
					for(PlmsOvmOutVisitUser user:users){
						assitByName+=user.getUserName()+",";
					}
				}
				dto.setAssistByNames(assitByName.substring(0, assitByName.length()-1));
			}
		}
		return dto;
	}*/
	
	@Override
	public List<PlmsOvmOutVisitPlan> searchByMap(Map<String, Object> map) {
		return plmsOvmOutVisitPlanMapper.searchByMap(map);
	}

	/**
	 * 
	* @Description: 新增外访计划 
	* @param planDto
	* @return
	* @return
	 */
	@Override
	public int addOutVisitPlan(OutVisitPlanDto planDto,SessionMsg loginUser) {
    	String addr = planDto.getAddr();
    	String[] addrs = addr.split(",");
    	Date time = new Date();
		//新增外访计划
    	PlmsOvmOutVisitPlan plan = new PlmsOvmOutVisitPlan();
    	plan.setAddress(addrs[1]);
    	plan.setAddressType(addrs[0]);
    	plan.setPlanStartTime(planDto.getPlanStartTime());
    	plan.setApplId(planDto.getApplId());
    	plan.setInfoId(planDto.getInfoId());
    	plan.setAssistBy(planDto.getAssistBy());
    	plan.setPlanCode(planDto.getPlanCode());
    	plan.setCreatedBy(loginUser.getName());
    	plan.setCreateTime(time);
    	plan.setUpdatedBy(loginUser.getName());
    	plan.setUpdateTime(time);
    	plan.setSignStatus("Signning");
    	plan.setPlanStatus(OutVisitPlanStatusType.Start);
    	int i = plmsOvmOutVisitPlanMapper.insertSelective(plan);
    	//外访信息表中的变化
    	PlmsOvmOutVisitInfo info =  plmsOvmOutVisitInfoMapper.selectByPrimaryKey(planDto.getInfoId());
    	if(info!=null){
    		info.setStatus(OutVisitStatusType.Planing);
    		info.setVisitPlanNum(info.getVisitPlanNum()==null?1:info.getVisitPlanNum()+1);
    		info.setUpdatedBy(loginUser.getName());
    		info.setUpdateTime(time);
    		plmsOvmOutVisitInfoMapper.updateByPrimaryKey(info);
    	}
    	//外访日志表中新增
    	PlmsOvmOutVisitLog outLog = insertOutLogModel(info,loginUser,plan,"addOutVisitPlan");
		plmsOvmOutVisitLogMapper.insertSelective(outLog);
		return i;
	}

	/**
	 * 
	* @Description: 查找外访计划取消的取消类型 
	* @return
	* @return
	 */
	@Override
	public List<PlmsOvmCancelType> searchOutVisitPlanCancelType() {
		PlmsOvmCancelTypeExample example = new PlmsOvmCancelTypeExample();
		example.createCriteria().andIsActiveEqualTo("Y");
		return plmsOvmCancelTypeMapper.selectByExample(example);
		  
	}

	/**
	 * 
	* @Description: 取消外访计划
	* @param planDto
	* @param loginUser
	* @return
	* @return
	 */
	@Override
	public int cancelOutVisitPlan(PlmsOvmOutVisitPlan planDto, SessionMsg loginUser) {
		Long id = planDto.getId();
		PlmsOvmOutVisitPlan plan = plmsOvmOutVisitPlanMapper.selectByPrimaryKey(id);
		Date time = new Date();
		plan.setVisitCancelResion(planDto.getVisitCancelResion());
		plan.setCntrctNo(planDto.getCntrctNo());
		plan.setVisitCancelType(planDto.getVisitCancelType());
		plan.setPlanStatus(OutVisitPlanStatusType.Cancel);
		plan.setUpdatedBy(loginUser.getName());
		plan.setUpdateTime(time);
		int i = plmsOvmOutVisitPlanMapper.updateByPrimaryKeySelective(plan);
    	PlmsOvmOutVisitInfo info =  plmsOvmOutVisitInfoMapper.selectByPrimaryKey(plan.getInfoId());
		boolean flag = false;
    	if(isTheMaxDatePlan(plan.getInfoId(),plan.getId())){
			//外访信息表中的变化
	    	if(info!=null){
	    		info.setStatus(OutVisitStatusType.NoVisit);
	    		info.setUpdatedBy(loginUser.getName());
	    		info.setUpdateTime(time);
	    		plmsOvmOutVisitInfoMapper.updateByPrimaryKey(info);
	    		flag = true;
	    	}
			
		}
		//外访日志表中新增
    	PlmsOvmOutVisitLog outLog = insertOutLogModel(info,loginUser,plan,"cancelOutVisitPlan");
		plmsOvmOutVisitLogMapper.insertSelective(outLog);
		if(flag){
	    	PlmsOvmOutVisitLog outLog02 = insertOutLogModel(info,loginUser,plan,"cancelOutVisit");
			plmsOvmOutVisitLogMapper.insertSelective(outLog02);

		}
		return i;
	}

	/**
	 * 
	* @Description: 根据分组查询跟进结果的列表选项 
	* @param groupId
	* @return
	* @return
	 */
	@Override
    @Cacheable(value="typeCache", key="#groupId")
	public List<PlmsOvmResultType> searchOvmResultTypeByGroupId(Integer groupId) {
		PlmsOvmResultTypeExample example= new PlmsOvmResultTypeExample();
		example.createCriteria().andGroupidEqualTo(groupId);
		return plmsOvmResultTypeMapper.selectByExample(example);
	}

	/**
	 * 
	* @Description: 保存外访结果 
	* @param planDto
	* @param loginUser
	* @return
	 */
	@Override
	public void saveOutVisitPlanResult(OutVisitPlanDto planDto,
			SessionMsg loginUser) {
		//修改外访计划表
		PlmsOvmOutVisitPlan plan = plmsOvmOutVisitPlanMapper.selectByPrimaryKey(planDto.getId());
		plan.setAddressValidity(planDto.getAddressValidity());
		plan.setFollowupResults(planDto.getFollowupResults());
		plan.setValidAddress(planDto.getValidAddress());
		plan.setPtpAmt(planDto.getPtpAmt());
		plan.setPtpDate(planDto.getPtpDate());
		plan.setOvtresultDetail(planDto.getOvtresultDetail());
		plan.setUpdatedBy(loginUser.getName());
		plan.setUpdateTime(new Date());
		plan.setPlanStatus(OutVisitPlanStatusType.End);
		plmsOvmOutVisitPlanMapper.updateByPrimaryKeySelective(plan);
		//修改外访信息表
    	PlmsOvmOutVisitInfo info =  plmsOvmOutVisitInfoMapper.selectByPrimaryKey(plan.getInfoId());
//    	if(info!=null){
//    		info.setVisitOverNum(info.getVisitOverNum()==null?1:info.getVisitOverNum()+1);
//    		info.setStatus(OutVisitStatusType.Visited);
//    		info.setUpdatedBy(loginUser.getName());
//    		info.setUpdateTime(new Date());
//    		plmsOvmOutVisitInfoMapper.updateByPrimaryKey(info);
//    	}
		//外访日志表中新增
    	PlmsOvmOutVisitLog outLog = insertOutLogModel(info,loginUser,plan,"inputOutVisitResult");
		plmsOvmOutVisitLogMapper.insertSelective(outLog);
		//催收记录表中新增外访结果
		PlmsLaCollectionRecord record = setRecordModel(plan,loginUser);
		collectionRecordService.insert(record);
	}
	

	/**
	 * 
	* @Description: 构造催收记录对象 
	* @param plan
	* @param loginUser
	* @return void
	 */
	private PlmsLaCollectionRecord setRecordModel(PlmsOvmOutVisitPlan plan, SessionMsg loginUser) {
		PlmsLaCollectionRecord record = new PlmsLaCollectionRecord();
		record.setCollectMthd("SURVEY");
		record.setApplId(plan.getApplId());
		record.setFollowedBy(loginUser.getUserName());
		String addressType = plan.getAddressType();
		if(addressType.equals("COMPANY")){//公司
			if(plan.getAddressValidity().equals("Y")){
				record.setStatus("ADDR_UNIT_VALID");
			}else{
				record.setStatus("ADDR_UNIT_INVALID");
			}
		}else if(addressType.equals("HOUSE")){//住宅
			if(plan.getAddressValidity().equals("Y")){
				record.setStatus("ADDR_HOME_VALID");
			}else{
				record.setStatus("ADDR_HOME_INVALID");
			}
		}else if(addressType.equals("REGISTER")){//户籍
			if(plan.getAddressValidity().equals("Y")){
				record.setStatus("ADDR_HOUSEHOLD_VALID");
			}else{
				record.setStatus("ADDR_HOUSEHOLD_INVALID");
			}
		}else{
			if(plan.getAddressValidity().equals("Y")){
				record.setStatus("ADDR_NEW_VALID");
			}else{
				record.setStatus("ADDR_NEW_INVALID");
			}
		}
		record.setContent(plan.getOvtresultDetail());		
		record.setResult(plan.getFollowupResults());
		record.setRpmntAmt(plan.getPtpAmt());
		record.setRpmntDate(plan.getPtpDate());
		record.setCreateTime(new Date());
		record.setUpdateTime(new Date());
		record.setCreatedBy(loginUser.getName());
		record.setUpdatedBy(loginUser.getName());
		return record;
		
	}

	/**
	 * 
	* @Description: 构造外访日志对象 
	* @param outVisit
	* @param loginUser
	* @param plan
	* @return
	* @return PlmsOvmOutVisitLog
	 */
	private PlmsOvmOutVisitLog insertOutLogModel(
			PlmsOvmOutVisitInfo outVisit,SessionMsg loginUser,PlmsOvmOutVisitPlan plan,String action) {
		PlmsOvmOutVisitLog outLog = new PlmsOvmOutVisitLog();
		outLog.setApplId(outVisit.getApplId());
		outLog.setCreateTime(new Date());
		outLog.setUpdateTime(new Date());
		outLog.setStatus(outVisit.getStatus());
		//新增外访计划
		if(action.equals("addOutVisitPlan")){
			outLog.setContent("新增外访计划，编号为"+plan.getPlanCode());

		}//取消外访计划
		else if(action.equals("cancelOutVisitPlan")){
			outLog.setContent("取消编号为"+plan.getPlanCode()+"的外访计划,取消原因："+plan.getVisitCancelResion());

		}//录入外访结果
		else if(action.equals("inputOutVisitResult")){
			outLog.setContent("完成编号为"+plan.getPlanCode()+"的外访计划的结果录入");
		}//取消外访（最新的外访计划被取消，外访则取消）
		else if(action.equals("cancelOutVisit")){
			
			outLog.setContent("取消合同编号为"+plan.getCntrctNo()+"的外访.");
		}
		outLog.setHandleBy(loginUser.getUserName());
		outLog.setCreatedBy(loginUser.getName());
		outLog.setUpdatedBy(loginUser.getName());
		return outLog;
		
	}

	/**
	 * APP外访计划数据查询
	 * @param pageData 分页参数
	 * @param param    查询条件
	 *                 {
	 *                 visitStartDate : 外访查询起始时间,
	 *                 visitEndDate   : 外访查询结束时间,
	 *                 visitType      : 外访类型,
	 *                 visitUser      : 外访人员,
	 *                 planStatus     : 外访计划状态
	 *                 }
	 * @return 返回查询结果
	 */
	public List<AppOutVisitPlanResultVo> selectWithApp(RowBounds pageData, Map<String, Object> param) {
		return plmsOvmOutVisitPlanMapper.selectWithApp(pageData, param);
	}

	/**
	 * APP外访计划数据查询
	 * @param pageData 分页参数
	 * @param param    查询条件
	 *                 {
	 *                 visitStartDate : 外访查询起始时间,
	 *                 visitEndDate   : 外访查询结束时间,
	 *                 visitUser      : 外访人员
	 *                 }
	 * @return 返回查询结果
	 */
	public List<AppOutVisitPlanResultVo> selecthistory(RowBounds pageData, Map<String, Object> param) {
		return plmsOvmOutVisitPlanMapper.selecthistory(pageData, param);
	}

	/**
	 * 
	* @Description:  外访计划分页查询 
	* @param pageData
	* @param example
	* @return
	* @return
	 */
	@Override
	public Page<AllOutVisitPlanResult> selectAllOutVisitPlanByExampleAndPage(
			Page<AllOutVisitPlanResult> pageData,
			AllOutVisitPlanParamDto example) {
		plmsOvmOutVisitPlanMapper.selectAllOutVisitPlanByExampleAndPage(pageData, example);
		return pageData;
	}

	/**
	 * 
	* @Description:  外访计划详情  客户信息 
	* @param map
	* @return
	* @return
	 */
	@Override
	public AllOutVisitPlanDetailCustResult selectAllOutPlanCustDetail(
			Map<String, Object> map) {
		
		return plmsOvmOutVisitPlanMapper.selectAllOutPlanCustDetail(map);
	}

	/**
	 * 
	* @Description: 外访计划详情  外访信息  
	* @param map
	* @return
	* @return
	 */
	@Override
	public AllOutVisitDetailInfoResult selectAllOutPlanInfoDetail(
			Map<String, Object> map) {
	
		AllOutVisitDetailInfoResult dto =  plmsOvmOutVisitPlanMapper.selectAllOutPlanInfoDetail(map);
		
		if(dto!=null){
			String assitBy = dto.getAssistBy();
			if(assitBy!=null){
				String assitByName = "";
				String[] assitBys = assitBy.split(",");
				List<String> userIds = Arrays.asList(assitBys);
				Map<String,Object> mapT  = new HashMap<String,Object>();
				mapT.put("userIds", userIds);
				List<PlmsOvmOutVisitUser> users = plmsOvmOutVisitUserMapper.searchInfoByMap(mapT);
				if(users.size()>0){
					for(PlmsOvmOutVisitUser user:users){
						assitByName+=user.getUserName()+",";
					}
				}
				dto.setAssistByNames(assitByName.substring(0, assitByName.length()-1));
			}
		}

		return dto;
	}

	/**
	 * 
	* @Description: 批量修改外访计划
	* @param list
	* @return
	 */
	@Override
	public void updateBatch(List<PlmsOvmOutVisitPlan> list) {
		 if(list == null || list.isEmpty()){
	            return;
	        }
			int comm = 2000;
			int size = list.size()-1;
			if(size>=comm){
				List<PlmsOvmOutVisitPlan> newList = new ArrayList<PlmsOvmOutVisitPlan>();
				for(int i=0;i<=size;i++){
					if(i!=0&&i%comm==0||i==size){
						newList.add(list.get(i));
						plmsOvmOutVisitPlanMapper.updateBatch(newList);
						newList.clear();
					}else{
						newList.add(list.get(i));
					}
				}	
			}else{
				plmsOvmOutVisitPlanMapper.updateBatch(list);
			}

	}
	/**
	 * 
	* @Description: 判断此计划是否是此外访案件最新的计划 
	* @param infoId
	* @param planId
	* @return
	* @return boolean
	 */
	private boolean isTheMaxDatePlan(Long infoId,Long planId){
		boolean b = false;
		PlmsOvmOutVisitPlan plan = plmsOvmOutVisitPlanMapper.isTheMaxDatePlan(infoId);
		if(plan!=null){
			Long id = plan.getId();
			if(planId.longValue()==id.longValue()){
				b = true;
			}else{
				b = false;
			}
		}
		return b;
		
	}

	/**
	 * 联金催收外访结果提交
	 * @param visitPlan     外访计划
	 * @param visitSign     签到信息
	 */
	@Override
	public void submitResult(PlmsOvmOutVisitPlan visitPlan, PlmsOvmOutVisitSign visitSign) {
		int insert = outVisitSignService.insert(visitSign); // 插入签到信息
		if (insert != 1) { throw new RuntimeException("签到信息插入失败"); }
		visitPlan.setSignId(visitSign.getId());
		int update = this.update(visitPlan);            // 更新计划信息
		if (update != 1) { throw new RuntimeException("更新计划信息失败"); }
		Long infoId = visitPlan.getInfoId();
		if(infoId!=null){
			PlmsOvmOutVisitInfo outInfo = plmsOvmOutVisitInfoMapper.selectByPrimaryKey(infoId);
			if(outInfo!=null){
				outInfo.setVisitOverNum(outInfo.getVisitOverNum()==null?1:outInfo.getVisitOverNum()+1);
				String addressType = visitPlan.getAddressType();
				if(addressType!=null&&(!addressType.equals(""))){
					if(addressType.equals("REGISTER")){
						outInfo.setRegisterOverNum(outInfo.getRegisterOverNum()==null?1:outInfo.getRegisterOverNum()+1);
					}else if(addressType.equals("COMPANY")){
						outInfo.setCompanyOverNum(outInfo.getCompanyOverNum()==null?1:outInfo.getCompanyOverNum()+1);
					}else if(addressType.equals("HOUSE")){
						outInfo.setHouseOverNum(outInfo.getHouseOverNum()==null?1:outInfo.getHouseOverNum()+1);
					}
				}
				//如果此外访计划是此外访信息的最新的一条计划，则外访信息状态变为已外访
				if(isTheMaxDatePlan(infoId, visitPlan.getId())){
					outInfo.setStatus(OutVisitStatusType.Visited);
				}
				
				outInfo.setUpdatedBy(visitSign.getUpdatedBy());
				outInfo.setUpdateTime(new Date());
				plmsOvmOutVisitInfoMapper.updateByPrimaryKeySelective(outInfo); //更新外访信息
			}else{
				throw new RuntimeException("更新外访信息失败");
			}
		}else{
			throw new RuntimeException("更新外访信息失败");
		}
		
	}

	/**
	 * 
	* @Description: 外访路线分页查询 
	* @param pageData
	* @param example
	* @return
	* @return
	 */
	@Override
	public Page<OutVisitRouteResult> selectPageOutVisitRouteData(
			Page<OutVisitRouteResult> pageData, OutVisitRouteParamDto example) {
		List<OutVisitRouteResult> routeList = plmsOvmOutVisitPlanMapper.selectPageOutVisitRouteData(pageData, example);
		if(routeList!=null&&routeList.size()>0){
			for(OutVisitRouteResult dto :routeList){
				String assitBy = dto.getAssistBy();
				if(assitBy!=null){
					String assitByName = "";
					String[] assitBys = assitBy.split(",");
					//去重
					List<String> userIds = Arrays.asList(assitBys);
					userIds = new ArrayList<String>(new HashSet<String>(userIds));
					Map<String,Object> mapT  = new HashMap<String,Object>();
					mapT.put("userIds", userIds);
					List<PlmsOvmOutVisitUser> users = plmsOvmOutVisitUserMapper.searchInfoByMap(mapT);
					if(users.size()>0){
						for(PlmsOvmOutVisitUser user:users){
							assitByName+=user.getUserName()+",";
						}
					}
					dto.setAssistByNames(assitByName.substring(0, assitByName.length()-1));
				}
			}
		}
		
		return pageData;
	}

	@Override
	public int selectCountByExample(Map<String, Object> map) {

		return plmsOvmOutVisitPlanMapper.countByOutVisitUser(map);
	}

	/**
	 * 
	* @Description: 查询某次外访最早的有效外访计划  
	* @param map
	* @return
	* @return
	 */
	@Override
	public PlmsOvmOutVisitPlan selectMinTimeIsActivePlan(Map<String, Object> map) {

		return plmsOvmOutVisitPlanMapper.selectMinTimeIsActivePlan(map);
	}
	
	
	
	
}
