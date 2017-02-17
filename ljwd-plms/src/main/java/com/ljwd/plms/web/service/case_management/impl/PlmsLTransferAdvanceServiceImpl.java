package com.ljwd.plms.web.service.case_management.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import com.itextpdf.text.pdf.PdfStructTreeController.returnType;
import com.ljwd.plms.core.entity.JSONResult;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.ljwd.plms.core.feature.orm.mybatis.Page;
import com.ljwd.plms.core.generic.GenericDao;
import com.ljwd.plms.core.generic.GenericServiceImpl;
import com.ljwd.plms.web.dao.case_management.PlmsLTransferAdvanceAlMapper;
import com.ljwd.plms.web.dao.case_management.PlmsLTransferAdvanceMapper;
import com.ljwd.plms.web.dao.case_management.PlmsWorkOrderPoolMapper;
import com.ljwd.plms.web.enums.TransferStatusType;
import com.ljwd.plms.web.model.case_management.PlmsLTransferAdvance;
import com.ljwd.plms.web.model.case_management.PlmsLTransferAdvanceAl;
import com.ljwd.plms.web.model.case_management.PlmsLTransferAdvanceExample;
import com.ljwd.plms.web.model.case_management.PlmsLaCollectAgent;
import com.ljwd.plms.web.model.case_management.PlmsLaCollectAgentExample;
import com.ljwd.plms.web.model.case_management.PlmsLaCollectAlloc;
import com.ljwd.plms.web.model.case_management.PlmsLaCollectAllocExample;
import com.ljwd.plms.web.model.case_management.PlmsWorkOrderPool;
import com.ljwd.plms.web.model.case_management.PlmsWorkOrderPoolExample;
import com.ljwd.plms.web.model.case_management.PlmsWorkOrderPoolLog;
import com.ljwd.plms.web.model.workorder_pool.PlmsCollectionRuleSet;
import com.ljwd.plms.web.model.workorder_pool.PlmsCollectionRuleSetExample;
import com.ljwd.plms.web.service.case_management.inf.PlmsLTransferAdvanceService;
import com.ljwd.plms.web.service.case_management.inf.PlmsLaCollectAgentService;
import com.ljwd.plms.web.service.case_management.inf.PlmsLaCollectAllocService;
import com.ljwd.plms.web.service.case_management.inf.PlmsWorkOrderPoolCaseService;
import com.ljwd.plms.web.service.case_management.inf.PlmsWorkOrderPoolLogService;
import com.ljwd.plms.web.service.case_management.inf.PlmsWorkOrderPoolService;
import com.ljwd.plms.web.service.workorder_pool.inf.PlmsCollectionRuleSetService;
import com.ljwd.plms.web.vo.case_management.PlmsLTransferAdvanceParam;
import com.ljwd.plms.web.vo.case_management.PlmsLTransferAdvanceResult;
import com.ljwd.plms.web.vo.case_management.PlmsWorkOrderAssignDto;
import com.ljwd.plms.web.vo.case_management.PlmsWorkOrderPoolDto;

/**
 * 提前移交案件表,PLMS_L_TRANSFER_ADVANCE
 * */
@Service
public class PlmsLTransferAdvanceServiceImpl extends GenericServiceImpl<PlmsLTransferAdvance, Long> implements PlmsLTransferAdvanceService {

    @Resource
    private PlmsLTransferAdvanceMapper plmsLTransferAdvanceMapper;
    @Resource
    private PlmsLTransferAdvanceAlMapper plmsLTransferAdvanceAlMapper;
    @Resource
    private PlmsCollectionRuleSetService plmsCollectionRuleSetService;
    @Resource
    private PlmsWorkOrderPoolService plmsWorkOrderPoolService;
    @Resource
    private PlmsLaCollectAllocService plmsLaCollectAllocService;
    @Resource
    private PlmsLaCollectAgentService plmsLaCollectAgentService;
    @Resource
    private PlmsWorkOrderPoolCaseService plmsWorkOrderPoolCaseService;
    @Resource
    private PlmsWorkOrderPoolMapper plmsWorkOrderPoolMapper;
    @Resource
    private PlmsWorkOrderPoolLogService plmsWorkOrderPoolLogService;

    private static Logger logger = LoggerFactory.getLogger(PlmsLTransferAdvanceServiceImpl.class);


    @Override
    public GenericDao<PlmsLTransferAdvance, Long> getDao() {
        return plmsLTransferAdvanceMapper;
    }

    /**
     * 插入对象
     * @param plmsLTransferAdvance 对象
     */
    @Override
    public int insert(PlmsLTransferAdvance plmsLTransferAdvance) {
        return plmsLTransferAdvanceMapper.insert(plmsLTransferAdvance);
    }

    /**
     * @Description: 提前移交案件分页数据
     * @param pageData 分页数据
     * @param example 查询条件
     * @return Page<PlmsLTransferAdvance>
     */
    @Override
    public Page<PlmsLTransferAdvanceResult> selectTransferAdvanceAndPage(
            Page<PlmsLTransferAdvanceResult> pageData,
            PlmsLTransferAdvanceParam example) {
        List<PlmsLTransferAdvanceResult> list = plmsLTransferAdvanceMapper.selectTransferAdvanceAndPage(pageData, example);
        if(list!=null && list.size()>0){
            TransferStatusType[] values = TransferStatusType.values();
            for(PlmsLTransferAdvanceResult result:list){
                for(TransferStatusType val:values){
                    if(result.getStatus().equals(val.name())){
                        result.setStatus(val.toString());
                    }
                }
            }
        }
        return pageData;
    }

    /**
     * @Description: 处理提前移交案件的各种状态
     * @param ids
     * @param handelResult
     * @param userName
     */
    @Override
    public void updateTransferCaseHandel(List<Long> ids, String handelResult,String refusalReason, String userName) {
        if(ids!=null&&ids.size()>0){
            String mode = "auditPass";
            List<PlmsLTransferAdvanceAl> alList = new ArrayList<PlmsLTransferAdvanceAl>();
            List<PlmsLTransferAdvance> transferList = new ArrayList<PlmsLTransferAdvance>();
            //审核通过的案件要进入提前移交区间
            List<PlmsWorkOrderPool> poolList = new ArrayList<PlmsWorkOrderPool>();
            List<PlmsWorkOrderPoolLog> logList = new ArrayList<PlmsWorkOrderPoolLog>();
            PlmsCollectionRuleSetExample example= new PlmsCollectionRuleSetExample();
            example.createCriteria().andIsActiveEqualTo("Y").andCircuRuleCodeEqualTo("TRANINAD");
            List<PlmsCollectionRuleSet> setList = plmsCollectionRuleSetService.selectByExampleList(example);
            if(setList!=null&&setList.size()>0){
                PlmsCollectionRuleSet set = setList.get(0);
                for(Long id :ids){
                    PlmsLTransferAdvance transfer = plmsLTransferAdvanceMapper.selectByPrimaryKey(id);
                    if(handelResult.equals("auditPass")){//审核通过
                        transfer.setStatus(TransferStatusType.NOT_APPROVED.name());
                        //审核通过后案件要进入提前移交队列
                        PlmsWorkOrderPool pool = setPlmsWorkOrderPool(transfer,set.getStatus(),userName);
                        poolList.add(pool);
                    }else if(handelResult.equals("auditReject")){//审核拒绝
                        transfer.setStatus(TransferStatusType.AUDIT_REJECT.name());
                        transfer.setRefusalReason(refusalReason);
                    }else if (handelResult.equals("approvedPass")){//审批通过
                        transfer.setStatus(TransferStatusType.APPROVED_ASSIGN.name());
						/*//审批通过后案件要进入提前移交队列
						PlmsWorkOrderPool pool = setPlmsWorkOrderPool(transfer,set.getStatus(),userName);
						poolList.add(pool);*/
                    }else if (handelResult.equals("approvedReject")){//审批拒绝
                        transfer.setStatus(TransferStatusType.APPROVED_REJECT.name());
                        transfer.setRefusalReason(refusalReason);
                        //审批拒绝后案件要退回到之前的队列
                        PlmsWorkOrderPool pool = setPlmsWorkOrderPool(transfer,transfer.getCircustatus(),userName);
                        poolList.add(pool);
                        mode = "approvedReject";
                    }
                    //处理提前移交明细表
                    PlmsLTransferAdvanceAl al = setPlmsLTransferAdvanceAlModel(transfer,handelResult,userName);
                    alList.add(al);
                    //处理提前移交表
                    transfer = setPlmsLTransferAdvance(transfer,handelResult,userName);
                    transferList.add(transfer);
                }
                plmsLTransferAdvanceAlMapper.insertBatch(alList);
                plmsLTransferAdvanceMapper.updateBatch(transferList);

                //修改案件的催收区间
                if(poolList!=null&&poolList.size()>0){
                    List<Long> payments = new ArrayList<Long>();
                    List<Long> applIds = new ArrayList<Long>();
                    List<PlmsLaCollectAlloc> oldAllocList = new ArrayList<PlmsLaCollectAlloc>();
                    List<PlmsLaCollectAlloc> newAllocList = new ArrayList<PlmsLaCollectAlloc>();
                    for(PlmsWorkOrderPool pool:poolList){
                        payments.add(pool.getPaymentId());
                        applIds.add(pool.getApplId());
                    }
                    Map<String,Object> map = new HashMap<String,Object>();
                    map.put("applIds", applIds);
                    //需要修改区间的案件集合
                    List<PlmsWorkOrderPoolDto>  caseTempList = plmsWorkOrderPoolMapper.searchReceiveOverdueByApplIds(map);
                    if(caseTempList!=null&&caseTempList.size()>0){
                        for(PlmsWorkOrderPoolDto dto:caseTempList){
                            PlmsWorkOrderPoolLog log = new PlmsWorkOrderPoolLog();
                            if(mode.equals("auditPass")){
                                log.setStatus(set.getStatus());
                            }else if(mode.equals("approvedReject")){
                                //审批拒绝此案件回到原来的催收区间，催收员仍是原来的催收员
                                Map<String,Object> newMap = new HashMap<String,Object>();
                                newMap.put("paymentId", dto.getPaymentId());
                                PlmsLTransferAdvance transfer = plmsLTransferAdvanceMapper.selectMaxDateTransferAdvanceByPaymentId(newMap);
                                log.setStatus(transfer.getCircustatus());
                                String collector = transfer.getCollector();
                                Map<String,Object> allocMap = new HashMap<String,Object>();
                                allocMap.put("paymentId", dto.getPaymentId());
                                allocMap.put("collector", collector);
                                //此案件之前的分配记录
                                PlmsLaCollectAlloc theOldAlloc = plmsLaCollectAllocService.selectMaxDateByMap(allocMap).get(0);
                                //a,将之前的分配记录置为无效 b,插入新纪录
                                PlmsLaCollectAlloc theNewAlloc = new PlmsLaCollectAlloc();
                                setAllocModel(theOldAlloc,theNewAlloc,userName);
                                setUpdateAllocModel(theOldAlloc,userName);
                                oldAllocList.add(theOldAlloc);
                                newAllocList.add(theNewAlloc);
                            }
                            setLogModel(dto,log,userName);
                            logList.add(log);
                        }
                    }
                    if("auditPass".equals(mode)){
                        //a,处理案件原有的催收员
                        this.updateAllocData(payments, userName);
                        //b,处理案件原有的代理催收员
                        this.updateAgentData(payments, userName);
                    }else if ("approvedReject".equals(mode)){
                        //审批拒绝，此案件回到原来的催收区间，催收员仍是原来的催收员，
                        //1,查找此案件最新的分配记录，将此记录设为无效
                        plmsLaCollectAllocService.updateBatch(oldAllocList);
                        plmsLaCollectAllocService.insertBatch(newAllocList);
                    }

                    //c,修改工单池区间值
                    plmsWorkOrderPoolService.updateBatch(poolList);
                    //d,流转日志表
                    plmsWorkOrderPoolLogService.insertBatch(logList);

                }

            }else{
                logger.info("-----工单池配置中没有提前移交区间-----");
            }

        }
    }

    /**
     * @Description: 构造需要修改的分配记录model
     * @param theOldAlloc
     */
    private void setUpdateAllocModel(PlmsLaCollectAlloc theOldAlloc,String userName) {
        theOldAlloc.setIsActive("N");
        theOldAlloc.setRecVer(theOldAlloc.getRecVer()+1);
        theOldAlloc.setTagSeq(theOldAlloc.getTagSeq());
        theOldAlloc.setUpdatedBy(userName);
        theOldAlloc.setUpdateTime(new Date());
        theOldAlloc.setAllocType("ADJUST");
        theOldAlloc.setAdjustedBy(userName);
        theOldAlloc.setAdjustTime(new Date());
    }

    /**
     * @Description: 构造分配记录model
     * @param theOldAlloc
     * @param theNewAlloc
     * @param userName
     * @return void
     */
    private void setAllocModel(PlmsLaCollectAlloc theOldAlloc,
                               PlmsLaCollectAlloc theNewAlloc, String userName) {
        theNewAlloc.setAdjustedBy(userName);
        theNewAlloc.setAdjustTime(new Date());
        theNewAlloc.setAllocBeginDate(theOldAlloc.getAllocBeginDate());
        theNewAlloc.setAllocType("ADJUST");
        theNewAlloc.setApplId(theOldAlloc.getApplId());
        theNewAlloc.setAssignTime(new Date());
        theNewAlloc.setCollector(theOldAlloc.getCollector());
        theNewAlloc.setCreatedBy(userName);
        theNewAlloc.setCreateTime(new Date());
        theNewAlloc.setIsActive("Y");
        theNewAlloc.setOverdueDays(theOldAlloc.getOverdueDays());
        theNewAlloc.setPaymentId(theOldAlloc.getPaymentId());
        theNewAlloc.setRemainingPrincipal(theOldAlloc.getRemainingPrincipal());
        theNewAlloc.setUpdatedBy(userName);
        theNewAlloc.setUpdateTime(new Date());
        theNewAlloc.setRecVer(0L);
        theNewAlloc.setTagSeq(1L);
    }

    /**
     * @Description: 工单日志表model构建
     * @param p
     * @param log
     */
    private void setLogModel(PlmsWorkOrderPoolDto p,PlmsWorkOrderPoolLog log,String userName){
        log.setApplId(p.getApplId());
        log.setPaymentId(p.getPaymentId());
        log.setOverdueDays(p.getOverDays());
        log.setRemainingPrincipal(p.getRemainingPrincipal());
        log.setOverduePeriod(p.getOverduePeriod());
        log.setHandleDate(new Date());
        log.setActionType("update");
        log.setAction("update");
        log.setActionDate(new Date());
        log.setCreatedBy(userName);
        log.setCreateTime(new Date());
        log.setUpdatedBy(userName);
        log.setUpdateTime(new Date());
        log.setTagSeq(1L);
        log.setRecVer(0L);
    }

    /**
     * @Description: 手动调整需要修改的催收分配记录
     * @param payments
     * @return Map<Long,PlmsLaCollectAlloc>
     */
    private void updateAllocData(List<Long> payments,String userName){
        Date updateDate = new Date();
        PlmsLaCollectAllocExample exapAlloc = new PlmsLaCollectAllocExample();
        exapAlloc.createCriteria().andAllocEndDateIsNull().andPaymentIdIn(payments).andIsActiveEqualTo("Y");
        List<PlmsLaCollectAlloc> allocList = plmsLaCollectAllocService.selectByExample(exapAlloc);
        if(allocList!=null&&allocList.size()>0){
            for(PlmsLaCollectAlloc alloc : allocList){
                alloc.setAllocType("ADJUST");
                alloc.setAllocEndDate(updateDate);
                alloc.setUpdateTime(updateDate);
                alloc.setUpdatedBy(userName);
                alloc.setAdjustedBy(userName);
                alloc.setAdjustTime(updateDate);
            }
            plmsLaCollectAllocService.updateBatch(allocList);
        }
    }

    /**
     * @Description: 手动调整需要修改的代理催收分配记录
     * @param payments
     * @return Map<Long,PlmsLaCollectAgent>
     */
    private void updateAgentData(List<Long> payments,String userName){
        Date updateDate = new Date();
			/*	PlmsLaCollectAgentExample examAgent = new PlmsLaCollectAgentExample();
	            examAgent.createCriteria().andAllocEndDateGreaterThanOrEqualTo(new Date()).andPaymentIdIn(payments).andIsActiveEqualTo("Y");*/
        Map<String,Object> map = new HashMap<String,Object>();
        map.put("payments", payments);
        map.put("mode", 2);
        //map.put("agentEnd", new Date());
        List<PlmsLaCollectAgent> agentList = plmsLaCollectAgentService.selectByExample2(map);
        if(agentList!=null&&agentList.size()>0){
            for(PlmsLaCollectAgent agent : agentList){
                if(agent.getAllocBeginDate().compareTo(updateDate)>0){
                	agent.setIsActive("N");
                }else{
                	agent.setAllocEndDate(updateDate);
                }
                agent.setUpdateTime(updateDate);
                agent.setUpdatedBy(userName);
            }
            plmsLaCollectAgentService.updateBatch(agentList);
        }
    }

    private PlmsWorkOrderPool setPlmsWorkOrderPool(PlmsLTransferAdvance transfer, String status,String userName) {
        PlmsWorkOrderPoolExample example = new PlmsWorkOrderPoolExample();
        example.createCriteria().andApplIdEqualTo(transfer.getApplId()).andIsActiveEqualTo("Y");
        List<PlmsWorkOrderPool> poolList = plmsWorkOrderPoolService.selectByExampleList(example);
        PlmsWorkOrderPool pool = new PlmsWorkOrderPool();
        if(poolList!=null&&poolList.size()>0){
            pool = poolList.get(0);
            pool.setStatus(status);
            pool.setUpdatedBy(userName);
            pool.setUpdateTime(new Date());
        }
        return pool;
    }

    private PlmsLTransferAdvanceAl setPlmsLTransferAdvanceAlModel(PlmsLTransferAdvance transfer,String handelResult,String userName){
        Date date = new Date();
        PlmsLTransferAdvanceAl al = new PlmsLTransferAdvanceAl();
        al.setApplId(transfer.getApplId());
        al.setPaymentId(transfer.getPaymentId());
        al.setPid(transfer.getId());
        al.setHandleby(userName);
        al.setHandledate(date);
        al.setHandleresult(handelResult);
        al.setIsActive("Y");
        al.setStatus(transfer.getStatus());
        al.setCreatedBy(userName);
        al.setCreateTime(date);
        al.setRecVer(0L);
        al.setTagSeq(1L);
        al.setUpdatedBy(userName);
        al.setUpdateTime(date);
        return al;
    }

    private PlmsLTransferAdvance setPlmsLTransferAdvance(PlmsLTransferAdvance transfer,String handelResult,String userName){
        Date date = new Date();
        transfer.setUpdatedBy(userName);
        transfer.setUpdateTime(date);
        return transfer;
    }

    /**
     * 根据条件统计数量
     * @param example 查询条件
     * @return 数量
     */
    @Override
    public int countByExample(PlmsLTransferAdvanceExample example) {
        return plmsLTransferAdvanceMapper.countByExample(example);
    }

    /**
     * 根据借款ID判断是否在提前移交流程
     * @param applId 借款ID
     * @return boolean true-是
     */
    @Override
    public boolean selectCheckIsAdvance(Long applId) {
        //状态
        List<String> statusList = new ArrayList<String>();
        statusList.add(TransferStatusType.NOT_AUDITED.name());
        statusList.add(TransferStatusType.NOT_APPROVED.name());
        statusList.add(TransferStatusType.APPROVED_ASSIGN.name());

        PlmsLTransferAdvanceExample example = new PlmsLTransferAdvanceExample();
        PlmsLTransferAdvanceExample.Criteria criteria = example.createCriteria();
        criteria.andStatusIn(statusList);
        criteria.andApplIdEqualTo(applId);

        int count = this.countByExample(example);

        return count > 0;
    }

    /**
     * 根据条件查询
     * @param example 查询条件
     * @return 实体集
     */
    @Override
    public List<PlmsLTransferAdvance> selectByExample(PlmsLTransferAdvanceExample example) {
        return plmsLTransferAdvanceMapper.selectByExample(example);
    }

    /**
     * @Description: 手动分配提前移交案件
     * @param idsList
     * @param colleocterList
     * @param userName
     * @return
     */
    @Override
    public String updateTransferCaseAlloc(List<Long> idsList,
                                        List<String> colleocterList, String userName) {
    	String  resultString = "OK";
        if(idsList !=null&&idsList.size()>0){
            //1,改变提前移交表中的案件状态
        	List<PlmsLTransferAdvance> transferList = new ArrayList<PlmsLTransferAdvance>();
            List<PlmsLTransferAdvanceAl> transferAlList = new ArrayList<PlmsLTransferAdvanceAl>();
            List<Long> payments =new  ArrayList<Long>();
            for(Long id :idsList){
                PlmsLTransferAdvance transfer = plmsLTransferAdvanceMapper.selectByPrimaryKey(id);
                payments.add(transfer.getPaymentId());
                transfer.setStatus(TransferStatusType.ASSIGNED.name());
                transfer.setUpdatedBy(userName);
                transfer.setUpdateTime(new Date());
                transferList.add(transfer);
                PlmsLTransferAdvanceAl al = setPlmsLTransferAdvanceAlModel(transfer,"assigned",userName);
                transferAlList.add(al);
            }
            //2,分配催收员
            PlmsCollectionRuleSet rset = plmsCollectionRuleSetService.selectByCircuCode("TRANINAD");
            Map<String,Object> map = new HashMap<String,Object>();
            map.put("status", rset.getStatus());
            map.put("payments", payments);
            List<PlmsWorkOrderAssignDto> dList = plmsWorkOrderPoolService.selectMaruAssignList(map);
            if(dList!=null&&dList.size()>0){
            	for(PlmsWorkOrderAssignDto dto:dList){
            		if(dto.getOverdueDays()==null||dto.getOverdueDays().longValue()==0){
            			resultString = "no_over";
            			return resultString;
            		}
            	}
            }
            
            if(rset.getAssignRuleCode().equals("AVRG_DIST")){
                List<PlmsLaCollectAlloc> allocAddList = plmsWorkOrderPoolCaseService.addAllocNoUpper(dList, colleocterList, userName);
				/*if(allocAddList!=null&&allocAddList.size()>0){
					plmsLaCollectAllocService.insertBatch(allocAddList);
				}*/
            }else if (rset.getAssignRuleCode().equals("WORK_MORE")){
                plmsWorkOrderPoolCaseService.workMore(dList, colleocterList, userName, rset.getStatus());
            }

            
            plmsLTransferAdvanceAlMapper.insertBatch(transferAlList);
            plmsLTransferAdvanceMapper.updateBatch(transferList);
        }
		
        return resultString;

    }

    /**
     * @Description: 根据paymentId查询
     * @param map
     * @return
     */
    @Override
    public PlmsLTransferAdvance selectMaxDateTransferAdvanceByPaymentId(
            Map<String, Object> map) {
        return plmsLTransferAdvanceMapper.selectMaxDateTransferAdvanceByPaymentId(map);
    }

    /**
     * @Title: 根据借款IDS和状态查找
     * @Description: TODO(根据借款IDS和状态查找)
     * @param applIds 借款IDS
     * @param statusS 状态
     * @return 实体集
     */
    @Override
    public List<PlmsLTransferAdvance> selectByApplIdsAndStatusS(List<Long> applIds, List<String> statusS) {
        return plmsLTransferAdvanceMapper.selectByApplIdsAndStatusS(applIds, statusS);
    }

}