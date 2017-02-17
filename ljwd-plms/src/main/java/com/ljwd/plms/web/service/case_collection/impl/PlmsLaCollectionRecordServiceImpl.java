package com.ljwd.plms.web.service.case_collection.impl;

import com.ljwd.plms.core.feature.orm.mybatis.Page;
import com.ljwd.plms.core.generic.GenericDao;
import com.ljwd.plms.core.generic.GenericServiceImpl;
import com.ljwd.plms.core.util.StringUtil;
import com.ljwd.plms.web.dao.case_collection.PlmsLaCollectionRecordMapper;
import com.ljwd.plms.web.model.case_collection.LRltnshpDto;
import com.ljwd.plms.web.model.case_collection.LfRecivFeeDtl;
import com.ljwd.plms.web.model.case_collection.LnCntrct;
import com.ljwd.plms.web.model.case_collection.LnPayment;
import com.ljwd.plms.web.model.case_collection.LnRpmntPlan;
import com.ljwd.plms.web.model.case_collection.PlmsLaCollectionRecord;
import com.ljwd.plms.web.model.case_collection.PlmsLaCollectionRecordExample;
import com.ljwd.plms.web.model.case_collection.SysChargeSchema;
import com.ljwd.plms.web.model.case_management.PlmsLaCollectAlloc;
import com.ljwd.plms.web.model.cust.PlmsClContactorInfo;
import com.ljwd.plms.web.model.cust.PlmsClContactorInfoExample;
import com.ljwd.plms.web.model.messageSystem.CalculateSummaryReceivableParamMyDto;
import com.ljwd.plms.web.model.messageSystem.ContractClientDto;
import com.ljwd.plms.web.model.messageSystem.Customer;
import com.ljwd.plms.web.model.messageSystem.Employee;
import com.ljwd.plms.web.model.messageSystem.LedgerTypeCode;
import com.ljwd.plms.web.model.messageSystem.MesContact;
import com.ljwd.plms.web.model.messageSystem.Receivable;
import com.ljwd.plms.web.model.messageSystem.ReceivableDetail;
import com.ljwd.plms.web.model.messageSystem.RepaymentStatus;
import com.ljwd.plms.web.model.messageSystem.SimulateCalculateSummaryReceivableResultDto;
import com.ljwd.plms.web.model.messageSystem.SysMessageTempLate;
import com.ljwd.plms.web.model.messageSystem.UserSearchResultItemDto;
import com.ljwd.plms.web.model.type.LRltnshp;
import com.ljwd.plms.web.service.case_collection.inf.PlmsLaCollectionRecordService;
import com.ljwd.plms.web.service.cust.inf.PlmsClContactorInfoService;
import com.ljwd.plms.web.service.cust.inf.PlmsClCustInfoService;
import com.ljwd.plms.web.vo.case_collection.*;

import org.joda.time.DateMidnight;
import org.joda.time.DateTime;
import org.joda.time.Period;
import org.joda.time.PeriodType;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

import java.math.BigDecimal;
import java.util.*;

/**
 * 催收记录表,PLMS_LA_COLLECTION_RECORD
 * */
@Service
public class PlmsLaCollectionRecordServiceImpl extends GenericServiceImpl<PlmsLaCollectionRecord,Long> implements PlmsLaCollectionRecordService {

    @Resource
    private PlmsLaCollectionRecordMapper plmsLaCollectionRecordMapper;
    @Resource
    private PlmsClContactorInfoService plmsClContactorInfoService;
    @Resource
    private PlmsClCustInfoService plmsClCustInfoService;

    /**
     * 定义成抽象方法,由子类实现,完成dao的注入
     * @return GenericDao实现类
     */
    @Override
    public GenericDao<PlmsLaCollectionRecord, Long> getDao() {
        return plmsLaCollectionRecordMapper;
    }
    
    /**
    * @Description: 批量插入
    * @param list
    * @return void
     */
    @Override
	public void insertBatch(List<PlmsLaCollectionRecord> list) {
		int comm = 500;
		int size = list.size()-1;
		if(size>=comm){
			List<PlmsLaCollectionRecord> newList = new ArrayList<PlmsLaCollectionRecord>();
			for(int i=0;i<=size;i++){
				if(i!=0&&i%comm==0||i==size){
					newList.add(list.get(i));
					plmsLaCollectionRecordMapper.insertBatch(newList);
					newList.clear();
				}else{
					newList.add(list.get(i));
				}
			}
		}else{
			plmsLaCollectionRecordMapper.insertBatch(list);
		}
	}

    /**
     * 插入对象
     * @param record 对象
     */
    @Override
    public int insert(PlmsLaCollectionRecord record) {
        this.addContactorByRecord(record);
        return plmsLaCollectionRecordMapper.insert(record);
    }

    /**
     * 根据ID和版本号更新对象
     * @param record 对象
     */
    @Override
    public int update(PlmsLaCollectionRecord record) {
        this.addContactorByRecord(record);
        int ret = plmsLaCollectionRecordMapper.updateByPrimaryKeySelective(record);
        if(ret < 1){
            throw new RuntimeException("催记修改失败,请刷新重试");
        }
        return ret;
    }

    /**
     * 根据催收记录添加联系人
     * @param record 催记实体
     */
    private void addContactorByRecord(PlmsLaCollectionRecord record){
        //如果是新增电话且电话不为空
        if("NEWPHONE".equals(record.getCollectMthd()) && !StringUtil.isEmpty(record.getTel())){
            Long applId = record.getApplId();
            //贷后客户ID
            Long clCustId = plmsClCustInfoService.selectClCustIdByApplId(applId);
            if(clCustId != null){
                String area = null;            //区号
                String telNo = null;           //号码
                String ext = null;             //分机号
                String telType = null;         //号码类型
                if(record.getTel().contains("-")){
                    telType = "FIXPHONE";      //固话
                    String[] telS = record.getTel().split("-");
                    if(telS.length == 1){
                        telNo = telS[0];
                    }else if(telS.length == 2){
                        area = telS[0];
                        telNo = telS[1];
                    }else if(telS.length >= 3) {
                        area = telS[0];
                        telNo = telS[1];
                        ext = telS[2];
                    }
                }else {
                    telType = "MOBPHONE";       //移动号码
                    telNo = record.getTel();
                }
                //号码去重校验
                PlmsClContactorInfoExample example = new PlmsClContactorInfoExample();
                example.setClCustId(clCustId).setApplIdOrNull(applId).setName(record.getContactor()).setTelType(telType).setArea(area)
                        .setTel(telNo).setExt(ext);
                int count = plmsClContactorInfoService.countByExample(example);
                if(count < 1){
                    PlmsClContactorInfo contactor = new PlmsClContactorInfo();
                    contactor.setApplId(applId);                  //借款ID
                    contactor.setRltnshp(record.getRltn());       //关系
                    contactor.setName(record.getContactor());     //姓名
                    contactor.setTelType(telType);                //号码类型
                    contactor.setArea(area);                      //区号
                    contactor.setTel(telNo);                      //号码
                    contactor.setExt(ext);                        //分机号
                    contactor.setClCustId(clCustId);              //贷后客户ID
                    contactor.setSrcCode("COLLECT");              //来源
                    contactor.setIsActive("Y");
                    contactor.setCreatedBy(record.getUpdatedBy());
                    contactor.setUpdatedBy(record.getUpdatedBy());
                    plmsClContactorInfoService.insert(contactor);
                }
            }
        }
    }

    /**
     * 根据条件统计数量
     * @param example 查询条件
     * @return 数量
     */
    @Override
    public int selectCountByExample(PlmsLaCollectionRecordExample example) {
        return plmsLaCollectionRecordMapper.countByExample(example);
    }

    /**
     * 分页条件查询
     * @param page    Page信息
     * @param example 查询条件
     * @return Page数据
     */
    @Override
    public Page<PlmsLaCollectionRecord> selectByExampleAndPage(Page<PlmsLaCollectionRecord> page, PlmsLaCollectionRecordExample example) {
        plmsLaCollectionRecordMapper.selectByExampleAndPage(page, example);
        return page;
    }

    /**
     * 分页条件查询银行代扣数据
     * @param page    Page信息
     * @param example 查询条件
     * @return Page数据
     */
    @Override
    public Page<LoanStuationDto> selectLoanStuationAndPage(Page<LoanStuationDto> page, LoanStuationExample example) {
        plmsLaCollectionRecordMapper.selectLoanStuationAndPage(page, example);
        return page;
    }

    /**
     * 根据条件查询
     * @param example 查询条件
     * @return 实体集
     */
    @Override
    public List<PlmsLaCollectionRecord> selectByExample(PlmsLaCollectionRecordExample example) {
        return plmsLaCollectionRecordMapper.selectByExample(example);
    }

    /**
     * 根据借款申请ID统计借款详细、破坏承诺次数、银行代扣情况、扣款账户
     * @param applId 借款申请ID
     * @param overduePeriod 最早逾期期数
     * @return ApplDetailDto
     */
    @Override
    public ApplDetailDto selectApplDetailByApplIdAndDuePeriod(Long applId,Integer overduePeriod) {
        if(applId == null){
            return null;
        }
        //根据借款申请ID统计借款详细
        ApplDetailDto applDetail = plmsLaCollectionRecordMapper.selectApplDetailByApplIdAndDuePeriod(applId, overduePeriod);
        if(applDetail != null){
            //统计破坏承诺次数
            BreakCountDto breakCount = plmsLaCollectionRecordMapper.selectBreakCountByApplIdAndDuePeriod(applId, overduePeriod);
            applDetail.setBreakCount(breakCount);

            //此借款所以的银行代扣情况
            List<LoanStuationDto> loanStuationList = plmsLaCollectionRecordMapper.selectLoanStuationByApplId(applId);
            if (loanStuationList != null && loanStuationList.size() > 0){
                //最新一笔代扣
                LoanStuationDto lastLoan = loanStuationList.get(0);

                applDetail.setLastLoanDate(lastLoan.getCreateTime());           //最后扣款时间
                applDetail.setLoanMoney(lastLoan.getLoanMoney());               //发起代扣金额
                applDetail.setLoanRealMoney(lastLoan.getLoanRealMoney());       //实际扣款金额
                //银行反馈
                applDetail.setLoanRemark(this.getLoanStuationRemark(lastLoan.getLoanRemark(),loanStuationList));
            }

            //查询扣款账号
            List<CollectBankDto> collectBankList = plmsLaCollectionRecordMapper.selectCollectBankByApplId(applId);
            if(collectBankList != null && collectBankList.size() > 0){
                for(CollectBankDto bank : collectBankList){
                    if(bank.getSeqNum() != null){
                        switch (bank.getSeqNum()){
                            case 1:
                                applDetail.setBankNameOne(bank.getBankName());
                                applDetail.setBankCardNoOne(bank.getBankCardNo());
                                break;
                            case 2:
                                applDetail.setBankNameTwo(bank.getBankName());
                                applDetail.setBankCardNoTwo(bank.getBankCardNo());
                                break;
                            case 3:
                                applDetail.setBankNameThree(bank.getBankName());
                                applDetail.setBankCardNoThree(bank.getBankCardNo());
                                break;
                            default:
                                break;
                        }
                    }
                }
            }

        }

        return applDetail;
    }

    /**
     * 根据IDS集合修改Tag(修改人设为system)
     * @param tag Tag
     * @param ids ids集合
     * @return 修改记录数
     */
    @Override
    public int updateTagByIds(Long tag, List<Long> ids) {
        if(tag == null || ids == null || ids.isEmpty()){
            return 0;
        }
        return plmsLaCollectionRecordMapper.updateTagByIds(tag, ids);
    }

    /**
     * 查找到期的申请再扣、承诺还款或代偿的入账结果(只有ID、applId、periodNum、rpmntAmt、rpmntDate、repaymentAmount有值)
     * @return 实体集
     */
    @Override
    public List<PlmsLaCollectionRecord> selectTPJournalReport() {
        return plmsLaCollectionRecordMapper.selectTPJournalReport();
    }

    /**
     * 根据借款ID和时间,统计成功入账的金额
     * @param applId 借款ID
     * @param startTime 开始时间
     * @return 金额
     */
    @Override
    public BigDecimal selectReportAmtByApplIdAndTime(Long applId, Date startTime) {
        return plmsLaCollectionRecordMapper.selectReportAmtByApplIdAndTime(applId, startTime);
    }

    /**
     * 拼接银行反馈
     * */
    private String getLoanStuationRemark(String loanRemark,List<LoanStuationDto> loanStuationList){
        if (loanRemark != null && !loanRemark.isEmpty()){
            String text = loanRemark;
            boolean flag = false;
            int rId = loanRemark.indexOf("|");
            if (rId > -1){
                String[] strS = loanRemark.split("\\|");
                for(int i = 0; i < strS.length; i++){
                    for (int j = i + 1; j < strS.length; j++){
                        if (!strS[i].equals(strS[j])){
                            flag = true;
                            break;
                        }
                    }
                    if (flag){
                        break;
                    }
                }
                if (!flag){
                    text = strS[0];
                }
            }else{
                flag = true;
            }

            int count = 0; //次数
            Map<Date,String> map = new HashMap<>();
            for(LoanStuationDto dto : loanStuationList){
                if (dto.getLoanRemark() == null || dto.getLoanRemark().isEmpty()){
                    continue;
                }
                int index = dto.getLoanRemark().indexOf(text);
                if(index > -1){
                    if (dto.getLoanRemark().equals(text)){
                        if (map.get(dto.getLoanDate()) == null){
                            map.put(dto.getLoanDate(),dto.getLoanRemark());
                            count++;
                        }
                    }
                    else{
                        int lastIndex = dto.getLoanRemark().lastIndexOf(text);
                        if (index != lastIndex){
                            if (map.get(dto.getLoanDate()) == null){
                                count++;
                            }
                        }
                    }
                }
            }
            loanRemark += " 共" + count + "次";
        }
        return loanRemark;
    }

	@Override
	public List<SysMessageTempLate> selectSysMessageTempLateSuiTableGroup() {
		List<SysMessageTempLate> smt1 = plmsLaCollectionRecordMapper.selectSysMessageTempLateSuiTableGroup();
		return smt1;
	}

	@Override
	public List<SysMessageTempLate> selectSuiTableTypeBySuiTableGroup(String stg) {
		List<SysMessageTempLate> smt1 = plmsLaCollectionRecordMapper.selectSuiTableTypeBySuiTableGroup(stg);
		return smt1;
	}

	@Override
	public List<UserSearchResultItemDto> selectListUserSearchResultItemDto(String userId) {
		List<UserSearchResultItemDto> list = plmsLaCollectionRecordMapper.selectListUserSearchResultItemDto(userId);
		return list;
	}

	@Override
	public Employee findEmployeeOne(Long id) {
		Employee em = plmsLaCollectionRecordMapper.findEmployeeOne(id);
		return em;
	}

	@Override
	public SimulateCalculateSummaryReceivableResultDto simulateCalculateSummaryReceivable(CalculateSummaryReceivableParamMyDto paramDto,boolean isNeedClientInfo) {
		//ValidationHelper.validateRequiredField(paramDto.getRepaymentDate(), "repaymentDate");
        if (paramDto.getIsRenewLoanRepayment()) {
            paramDto.setIsInAdvanceRepayment(Boolean.TRUE);
            //ValidationHelper.validateRequiredField(paramDto.getRenewLoanPenaltyRate(), "penaltyRate");
        }
        List<ContractClientDto> contractNos = this.searchContractNos(paramDto.getContractNo(), paramDto.getCustomerName(), paramDto.getIdCardNo());
        if (contractNos.size() > 1) {
        	return null;
        } else if (contractNos == null || contractNos.isEmpty()) {
            return null;
        }
        //1.find contract by contractNO.
        LnCntrct contract = plmsLaCollectionRecordMapper.findContractByContractNo(contractNos.get(0).getContractNo());
        if (contract == null) {
            /*logger.error("can't not find the contract of contract NO. is :" + paramDto.getContractNo());
            throw new SystemErrorException(ErrorCode.SYS_ERR, "can't not find the contract of contract NO. is :" + paramDto.getContractNo());*/
        	return null;
        }
        //find payment,plans,customer
        LnPayment payment = plmsLaCollectionRecordMapper.findPaymentByApplyId(contract.getApplId().toString());
        return this.simulateCalculateSummaryReceivable(payment, contract,paramDto.getRepaymentDate(), paramDto.getIsRenewLoanRepayment(), paramDto.getRenewLoanPenaltyRate(), paramDto.getIsInAdvanceRepayment(), isNeedClientInfo);
    
	}

	public List<ContractClientDto> searchContractNos(String contractNo,
			String customerName, String idCardNo) {
		List<ContractClientDto> list = plmsLaCollectionRecordMapper.searchContractNos(contractNo, customerName, idCardNo);
		return list;
	}
	
	private SimulateCalculateSummaryReceivableResultDto simulateCalculateSummaryReceivable(LnPayment payment, LnCntrct contract,Date repaymentDate, boolean isRenewLoanRepayment, BigDecimal renewLoanPenaltyRate, boolean isInAdvanceRepayment, boolean isNeedClientInfo) {/*
        //Contract contract = payment.getContract();
		SysChargeSchema product = plmsLaCollectionRecordMapper.searchChargeSchemaByContractId(contract.getId());
        List<LnRpmntPlan> plans = plmsLaCollectionRecordMapper.searchRepaymentPlansByPaymentId(payment.getId());
        //copy Receivables for calculate
        Set<Receivable> calculateReivables = this.copyReceivablesOfPayment(payment);
        Customer customer = plmsLaCollectionRecordMapper.getCustomerByApplyId(contract.getApplId());
        ReceivableContext ctx = new ReceivableContext(product, 
        		contract,
        		payment, 
        		plans,
                repaymentDate, 
                null, 
                isRenewLoanRepayment, 
                renewLoanPenaltyRate, 
                true, 
                isInAdvanceRepayment);

        calculateReivables = this.filterAfterInAdvanceReceivables(calculateReivables);
        //剩余本金
        BigDecimal remindPrincipal = this.calculateRemainderPrincipal(calculateReivables, payment);
        //redmine #332 还款金额查询---查询规则修改,逾期的客户，查询出客户逾期未还的金额数据,未逾期的客户，查询出客户应还的金额数据
        boolean isOverdue = false;
        for (Receivable rec : calculateReivables) {
            if (RepaymentStatus.PAID.toString() != rec.getStatus() && rec.getMaxRepaymentDate().compareTo(ctx.getRepaymentDate()) < 0) {
                isOverdue = true;
                break;
            }
        }
        LnRpmntPlan currentPlan = null;
        if (isOverdue) {
            currentPlan = this.getShouldRepaymentPlan(plans, repaymentDate);
        } else {
            currentPlan = this.getCurrentRepaymentPlan(plans, repaymentDate , ctx.isIsInAdvanceRepayment());
        }

        //1.计算逾期费用
        this.calculateOverduce(calculateReivables, ctx);
        //2.提前结清的或者核销计算
        if (ctx.getPayment().getIsWriteOff()) {
            calculateReivables = this.calculateOfWriteOff(calculateReivables, ctx);
        } else if (ctx.isIsInAdvanceRepayment()) {
            calculateReivables = this.calculateOfInAdvanceRepayment(calculateReivables, ctx);
        } else {
            calculateReivables = this.calculateOfInAdvanceRepaymentNoFirst(calculateReivables, ctx);
        }

        //3.算应还款总额
        Integer comparePeriodNumber = -1;
        if (currentPlan != null) {
            comparePeriodNumber = currentPlan.getPeriodNumber();
        }
        Integer advancePeriodNumber = this.getInAdvanceReceivablePeriodNumber(calculateReivables);
        if (advancePeriodNumber != null) {
            comparePeriodNumber = advancePeriodNumber;
        }
        BigDecimal sumCostAmount = BigDecimal.ZERO;
        Map<Long, BigDecimal> mapRepaymentDetailSumAmount = new HashMap<Long, BigDecimal>();
        for (Receivable rec : calculateReivables) {//只需计算当前期之前的
            if (rec.getPeriodNumber().compareTo(comparePeriodNumber) > 0 || rec.getStatus() == RepaymentStatus.PAID) {
                continue;
            }
            BigDecimal willCostAmount = rec.getTotalReceivableAmount().subtract(rec.getTotalWaivedAmount());
            if (rec.getTotalActualAmount() != null) {
                willCostAmount = willCostAmount.subtract(rec.getTotalActualAmount());
            }
            mapRepaymentDetailSumAmount.put(rec.getId(), willCostAmount);
            sumCostAmount = sumCostAmount.add(willCostAmount);
        }

        //找出最前面未还清的那一期的的应收记录
        Receivable firstNonePaidRec = null;
        List<Receivable> sortedReceivables = this.sortReceivable(calculateReivables);
        for (Receivable rec : sortedReceivables) {
            if (rec.getStatus() == RepaymentStatus.UNPAID || rec.getStatus() == RepaymentStatus.PARTIAL_PAID) {
                firstNonePaidRec = rec;
                break;
            }
        }

        if (sumCostAmount.compareTo(BigDecimal.ZERO) > 0) {
            //4.是外包客户的话，还需要反算出外包费用(能找到外包催收费用的费率说明需要计算外包催收费）
            BigDecimal outsourceFeeRate = this.applicationOutsourceService.getApplicationOutsourceFeeRate(payment.getId(), repaymentDate);
            if (outsourceFeeRate != null) {
                //小数位处理：逾期违约金保留整数，强制进位;其它金额保留2位小数，四舍五入
                //BigDecimal toalCostAmount = sumCostAmount.divide(BigDecimal.ONE.subtract(outsourceFeeRate), 2, RoundingMode.HALF_UP);
                //BigDecimal collectCostAmount = toalCostAmount.subtract(sumCostAmount).setScale(2, RoundingMode.HALF_UP);
                //sumCostAmount = toalCostAmount;

                //外包催收费 = 应收金额（除外包催收费）* 外包催收费率(一手外包为0.2，二手外包为0.3)
                BigDecimal collectCostAmount = sumCostAmount.multiply(outsourceFeeRate).setScale(2, RoundingMode.HALF_UP);
                sumCostAmount = sumCostAmount.add(collectCostAmount);

                ReceivableDetail firstCollectCostDetail = null;
                for (ReceivableDetail detail : firstNonePaidRec.getReceivableDetails()) {
                    if (detail.getLedgerTypeCode().equals(LedgerTypeCode.COLLECT_COST)) {
                        firstCollectCostDetail = detail;
                    }
                }
                if (firstCollectCostDetail == null) {
                    firstCollectCostDetail = new ReceivableDetail();
                    firstNonePaidRec.getReceivableDetails().add(firstCollectCostDetail);
                    firstCollectCostDetail.setLedgerTypeCode(LedgerTypeCode.COLLECT_COST);
                    firstCollectCostDetail.setReceivable(firstNonePaidRec);
                    firstCollectCostDetail.setReceivableId(firstNonePaidRec.getId());
                    firstCollectCostDetail.setReceivableAmount(BigDecimal.ZERO);
                }
                BigDecimal totalCollectCostAmount = firstCollectCostDetail.getReceivableAmount().add(collectCostAmount);
                mapRepaymentDetailSumAmount.put(firstNonePaidRec.getId(), mapRepaymentDetailSumAmount.get(firstNonePaidRec.getId()).add(collectCostAmount));
                firstCollectCostDetail.setReceivableAmount(totalCollectCostAmount);


                //************计算应收总数****************
                BigDecimal totalRecivableAmount = BigDecimal.ZERO;
                for (ReceivableDetail dtl : firstNonePaidRec.getReceivableDetails()) {
                    totalRecivableAmount = totalRecivableAmount.add(dtl.getReceivableAmount());
                }
                firstNonePaidRec.setTotalReceivableAmount(totalRecivableAmount);
            }
        }
	*/
	return null;	
	}
	private Set<Receivable> copyReceivablesOfPayment(LnPayment payment) {/*
        Set<Receivable> calculateReivables = new HashSet<Receivable>();
        if (payment.getReceivables() != null && payment.getReceivables().size() > 0) {
            for (Receivable rec : payment.getReceivables()) {
                Receivable copyRec = new Receivable();
                try {
                    PropertyUtils.copyProperties(copyRec, rec);
                    copyRec.setId(rec.getId());
                    if (copyRec.getReceivableDetails() != null && copyRec.getReceivableDetails().size() > 0) {
                        Set<ReceivableDetail> copyDetails = new HashSet<ReceivableDetail>();
                        for (ReceivableDetail detail : copyRec.getReceivableDetails()) {
                            ReceivableDetail copyDetail = new ReceivableDetail();
                            PropertyUtils.copyProperties(copyDetail, detail);
                            copyDetail.setId(detail.getId());
                            copyDetails.add(copyDetail);
                        }
                        copyRec.setReceivableDetails(copyDetails);
                    }
                    if (copyRec.getReceivableFeeDetails() != null && copyRec.getReceivableFeeDetails().size() > 0) {
                        Set<ReceivableFeeDetail> copyFeeDetails = new HashSet<ReceivableFeeDetail>();
                        for (ReceivableFeeDetail feeDtl : copyRec.getReceivableFeeDetails()) {
                            ReceivableFeeDetail copyFeeDetail = new ReceivableFeeDetail();
                            PropertyUtils.copyProperties(copyFeeDetail, feeDtl);
                            copyFeeDetail.setId(feeDtl.getId());
                            copyFeeDetails.add(copyFeeDetail);
                        }
                        copyRec.setReceivableFeeDetails(copyFeeDetails);
                    }

                    calculateReivables.add(copyRec);
                } catch (IllegalAccessException ex) {
                    logger.error(ex.getMessage());
                } catch (InvocationTargetException ex) {
                    logger.error(ex.getMessage());
                } catch (NoSuchMethodException ex) {
                    logger.error(ex.getMessage());
                }
            }
        }
        return calculateReivables;
    */
	return null;	
	}
	public Set<Receivable> filterAfterInAdvanceReceivables(Set<Receivable> receivables) {
        List<Receivable> sortedRecs = this.sortReceivable(receivables);
        Integer invanceAdvancePeriodNum = null;
        for (Receivable rec : receivables) {
            if (rec.getIsAdvanceClear()) {
                invanceAdvancePeriodNum = rec.getPeriodNumber();
                break;
            }
        }

        //移除掉提前结清后面的记录
        if (invanceAdvancePeriodNum != null) {
            List<Receivable> willDeletedRecs = new ArrayList<Receivable>();
            for (Receivable rec : receivables) {
                if (rec.getPeriodNumber().compareTo(invanceAdvancePeriodNum) > 0) {
                    willDeletedRecs.add(rec);
                }
            }

            if (willDeletedRecs.isEmpty() == false) {
                sortedRecs.removeAll(willDeletedRecs);
            }
        }

        //移除掉已经设置is_delete = 'Y'的记录
        List<Receivable> isDeletedRecs = new ArrayList<Receivable>();
        for (Receivable rec : sortedRecs) {
            if (rec.getIsDeleted()) {
                isDeletedRecs.add(rec);
            }
        }
        if (isDeletedRecs.isEmpty() == false) {
            sortedRecs.removeAll(isDeletedRecs);
        }

        Set<Receivable> filteredSet = new HashSet<Receivable>();
        filteredSet.addAll(sortedRecs);
        return filteredSet;
    }
	/**
     * 计算剩余本金
     *
     * @param receivables 所有该贷款申请中的应收记录.
     * @param payment     放款.
     * @return remainderAmount 剩余本金
     */
    private BigDecimal calculateRemainderPrincipal(Set<Receivable> receivables, LnPayment payment) {
        //计算剩余本金
        BigDecimal sumPayedAmount = BigDecimal.ZERO;
        for (Receivable r : receivables) {
        	//查询 应收款明细
        	List<ReceivableDetail> listRec = plmsLaCollectionRecordMapper.searchListReceivableDetailByRecivId(r.getId());
            if (listRec != null && listRec.size() > 0) {
                for (ReceivableDetail detail : listRec) {
                    if (detail.getLedgerTypeCode().equals(LedgerTypeCode.PRINCIPAL)) {
                        sumPayedAmount = sumPayedAmount.add(detail.getActualAmount());
                    }
                }
            }
        }
        if (payment.getPayAmt() == null) {
            /*logger.error("pay amount is null->payment id is :" + payment.getId());
            throw new SystemErrorException(ErrorCode.SYS_ERR, "pay amount is null->payment id is :" + payment.getId());*/
        	return null;
        }
        BigDecimal remainderAmount = payment.getPayAmt().subtract(sumPayedAmount);
        return remainderAmount;
    }
    private LnRpmntPlan getShouldRepaymentPlan(List<LnRpmntPlan> setPlans, Date repaymentDate) {
    	LnRpmntPlan currentRepaymentPlan = null;
        List<LnRpmntPlan> sortedPlans = this.sortRepaymentPlan(setPlans);
        for (int i = 0; i < sortedPlans.size(); i++) {
        	LnRpmntPlan plan = sortedPlans.get(i);
            {
                if (repaymentDate.compareTo(plan.getRpmntDate()) >= 0) {
                    currentRepaymentPlan = plan;
                }
            }
        }
        return currentRepaymentPlan;
    }
    public List<LnRpmntPlan> sortRepaymentPlan(List<LnRpmntPlan> plans) {
        List<LnRpmntPlan> listPlans = new ArrayList<LnRpmntPlan>();
        for (LnRpmntPlan plan : plans) {
            listPlans.add(plan);
        }
        Collections.sort(listPlans, new Comparator<LnRpmntPlan>() {
            @Override
            public int compare(LnRpmntPlan o1, LnRpmntPlan o2) {
                return o1.getPeriodNum().compareTo(o2.getPeriodNum());
            }
        });

        return listPlans;
    }
    public LnRpmntPlan getCurrentRepaymentPlan(LnPayment payment, Date repaymentDate , boolean isInAdvance) {
        List<LnRpmntPlan> plans = plmsLaCollectionRecordMapper.searchRepaymentPlansByPaymentId(payment.getId());
        return this.getCurrentRepaymentPlan(plans, repaymentDate , isInAdvance);
    }
    private LnRpmntPlan getCurrentRepaymentPlan(List<LnRpmntPlan> setPlans, Date repaymentDate , boolean isInAdvance) {
    	LnRpmntPlan currentRepaymentPlan = null; //不可能为null
        List<LnRpmntPlan> sortedPlans = this.sortRepaymentPlan(setPlans);
        for (int i = 0; i < sortedPlans.size(); i++) {
        	LnRpmntPlan plan = sortedPlans.get(i);
            {
                if (repaymentDate.compareTo(plan.getEndDate()) >= 0 && i == sortedPlans.size() - 1) {
                    currentRepaymentPlan = plan;
                } else if (repaymentDate.compareTo(plan.getEndDate()) >= 0 && i < sortedPlans.size() - 1) {
                    if (repaymentDate.compareTo(plan.getMaxRpmntDate()) <= 0) {
                        currentRepaymentPlan = plan;
                        break;
                    }
                } else if (repaymentDate.compareTo(plan.getEndDate()) <= 0) {
                    currentRepaymentPlan = plan;
                    break;
                }
            }
        }
        
        //2016-5-2 redmine#846 入账修改--对于0期未结清的客户提前结清处理
        //提前结清时候，根据时间算出当前期为0,找第1期
        if(currentRepaymentPlan.getPeriodNum() <= 0 && isInAdvance == true){
        	LnRpmntPlan firstPeriodRepaymentPlan = null; 
            for(LnRpmntPlan plan : sortedPlans){
                if(plan.getPeriodNum().compareTo(1) == 0){
                    firstPeriodRepaymentPlan = plan;
                    break;
                }
            }
            currentRepaymentPlan = firstPeriodRepaymentPlan;
        }
        return currentRepaymentPlan;
    }
    /**
     * 计算逾期费用
     */
    private Set<Receivable> calculateOverduce(Set<Receivable> receivables, ReceivableContext ctx) {
        return calculateOverduce(receivables, ctx, false);
    }
    /**
     * 计算逾期费用
     */
    private Set<Receivable> calculateOverduce(Set<Receivable> receivables, ReceivableContext ctx, boolean isNoNeedCalculateFeedDetail) {/*
        List<Receivable> sortedReceivables = this.sortReceivable(receivables);
        Date lastestActualRepaymentDate = null;
        if (ctx.getRepaymentId() != null) {
            lastestActualRepaymentDate = plmsLaCollectionRecordMapper.getPerviousRepaymentDate(ctx.getPayment().getId(), ctx.getRepaymentId());
        } else {
            lastestActualRepaymentDate = plmsLaCollectionRecordMapper.getLastRepaymentDate(ctx.getPayment().getId());
        }

        for (Receivable rec : sortedReceivables) {
            if (RepaymentStatus.PAID.toString() == rec.getStatus()) {
                continue;
            }

            //judge whether is Overdue
            if (rec.getMaxRepaymentDate().compareTo(ctx.getRepaymentDate()) < 0) {
                rec.setIsOverdue(Boolean.TRUE);
            } else {
                rec.setIsOverdue(Boolean.FALSE);
            }

            //if (rec.getIsOverdue() == false) {
            //    continue;
            //}

            Date addNewStartDate = null;
            if (lastestActualRepaymentDate != null && lastestActualRepaymentDate.compareTo(rec.getMaxRepaymentDate()) > 0) {
                addNewStartDate = lastestActualRepaymentDate;
            } else {//最后实际还款日期 <= 应收的最大还款日期的时候，取‘应收的应还款日期’
                addNewStartDate = rec.getRepaymentDate();
            }

            boolean needCalculate = false;
            if ((ctx.getRepaymentDate().compareTo(addNewStartDate) > 0) && (rec.getMaxRepaymentDate().compareTo(ctx.getRepaymentDate()) < 0)) {
                needCalculate = true;
            }

            if (needCalculate) {
                lastestActualRepaymentDate = ctx.getRepaymentDate();
                //1.计算当前剩余本金
                BigDecimal remainderAmount = this.calculateRemainderPrincipal(receivables, ctx.getPayment());
                //2.计算之前已经算好并且已经确定的逾期违约金
                BigDecimal proviousOverDuaAmount = BigDecimal.ZERO;
                Set<LfRecivFeeDtl> feeDetails = plmsLaCollectionRecordMapper.getReceivableFeeDetailsByRicivId(rec.getId());
                if (feeDetails != null && feeDetails.size() > 0) {
                    for (LfRecivFeeDtl feeDtl : feeDetails) {
                        if (feeDtl.getLedgerCode().equals(LedgerTypeCode.OVERDUE_INTEREST)) {
                            proviousOverDuaAmount = proviousOverDuaAmount.add(feeDtl.getAmt());
                        }
                    }
                }
                
                //3.计算 amount -->逾期违约金=当前剩余本金 * 0.001 * 逾期天数--> 小数位处理：逾期违约金保留整数，强制进位;其它金额保留2位小数，四舍五入
                DateMidnight startDate = new DateTime(addNewStartDate).toDateMidnight();
                DateMidnight endDate = new DateTime(ctx.getRepaymentDate()).toDateMidnight();
                int overdueDay = new Period(startDate, endDate, PeriodType.days()).getDays();
                
                ReceivableCalculateContext calculateCtx = new ReceivableCalculateContext(ctx, rec.getPeriodNumber());
                calculateCtx.setOverdueDay(overdueDay);
                calculateCtx.setRemainderAmount(remainderAmount);
                ReceivableCalculateResult calResult = this.receivableCalculateCalculator.calculateFee(calculateCtx, LedgerTypeCode.OVERDUE_INTEREST);
                BigDecimal overDueAmount = calResult.getCalculateAmt();
                BigDecimal overdueRate = calResult.getCalculateRate();
                
                ctx.setOverdueDays(overdueDay);
                ctx.setRemindPrincipal(remainderAmount);

                //************计算应收明细中逾期违约金应收总数****************
                ReceivableDetail targetDtl = null;
                for (ReceivableDetail dtl : rec.getReceivableDetails()) {
                    if (dtl.getLedgerTypeCode().equals(LedgerTypeCode.OVERDUE_INTEREST)) {
                        targetDtl = dtl;
                        break;
                    }
                }
                if (targetDtl == null) {
                    targetDtl = new ReceivableDetail();
                    rec.getReceivableDetails().add(targetDtl);
                    targetDtl.setLedgerTypeCode(LedgerTypeCode.OVERDUE_INTEREST);
                    targetDtl.setReceivable(rec);
                    targetDtl.setReceivableId(rec.getId());
                    targetDtl.setReceivableAmount(BigDecimal.ZERO);
                }
                BigDecimal totalOverDueAmount = overDueAmount.add(proviousOverDuaAmount);
                targetDtl.setReceivableAmount(totalOverDueAmount);

                //************计算应收总数****************
                BigDecimal totalRecivableAmount = BigDecimal.ZERO;
                for (ReceivableDetail dtl : rec.getReceivableDetails()) {
                    totalRecivableAmount = totalRecivableAmount.add(dtl.getReceivableAmount());
                }
                rec.setTotalReceivableAmount(totalRecivableAmount);

                if (isNoNeedCalculateFeedDetail == false) {//发起重扣是不需要保存feed detail，因为在入账的时候才需要
                    //增加ReceivableFeed Detail
                    ReceivableFeeDetail feeDetail = new ReceivableFeeDetail();
                    feeDetail.setLedgerTypeCode(LedgerTypeCode.OVERDUE_INTEREST);
                    feeDetail.setReceivable(rec);
                    feeDetail.setReceivableId(rec.getId());
                    feeDetail.setCalcTime(new Date());
                    feeDetail.setStartDate(addNewStartDate);
                    feeDetail.setEndDate(ctx.getRepaymentDate());
                    feeDetail.setAmount(overDueAmount);
                    feeDetail.setBaseValue(remainderAmount);
                    feeDetail.setRate(overdueRate);
                    rec.getReceivableFeeDetails().add(feeDetail);
                }
            } else {
                //********閲嶆柊褰掑苟閫炬湡鍒╂伅***********
                ReceivableDetail targetDtl = null;
                for (ReceivableDetail dtl : rec.getReceivableDetails()) {
                    if (dtl.getLedgerTypeCode().equals(LedgerTypeCode.OVERDUE_INTEREST)) {
                        targetDtl = dtl;
                        break;
                    }
                }
                if (targetDtl != null) {
                    //<1>把之前的逾期利息费用进行相加
                    BigDecimal proviousOverDuaAmount = BigDecimal.ZERO;
                    Set<ReceivableFeeDetail> feeDetails = rec.getReceivableFeeDetails();
                    if (feeDetails != null && feeDetails.size() > 0) {
                        for (ReceivableFeeDetail feeDtl : feeDetails) {
                            if (feeDtl.getLedgerTypeCode().equals(LedgerTypeCode.OVERDUE_INTEREST)) {
                                proviousOverDuaAmount = proviousOverDuaAmount.add(feeDtl.getAmount());
                            }
                        }
                    }
                    targetDtl.setReceivableAmount(proviousOverDuaAmount);

                    //<2)重新计算应收总额
                    BigDecimal totalRecivableAmount = BigDecimal.ZERO;
                    for (ReceivableDetail dtl : rec.getReceivableDetails()) {
                        totalRecivableAmount = totalRecivableAmount.add(dtl.getReceivableAmount());
                    }
                    rec.setTotalReceivableAmount(totalRecivableAmount);
                }

            }
        }

        Set<Receivable> setCalculatedRecs = new HashSet<Receivable>();
        setCalculatedRecs.addAll(sortedReceivables);
        return setCalculatedRecs;
    */
    return null;	
    }
    public List<Receivable> sortReceivable(Set<Receivable> receivables) {
        List<Receivable> listReceivables = new ArrayList<Receivable>();
        for (Receivable rec : receivables) {
            listReceivables.add(rec);
        }
        Collections.sort(listReceivables, new Comparator<Receivable>() {
            public int compare(Receivable o1, Receivable o2) {
                return o1.getPeriodNumber().compareTo(o2.getPeriodNumber());
            }
        });

        return listReceivables;
    }

	@Override
	public String findCodeByPaymentType(String paymentType) {
		String str = plmsLaCollectionRecordMapper.findCodeByPaymentType(paymentType);
		return str;
	}

	@Override
	public List<MesContact> selectContantByMore(String rltnshp,String idCard,String conName) {
		return plmsLaCollectionRecordMapper.selectContantByMore(rltnshp,idCard,conName);
	}

	@Override
	public List<LRltnshpDto> selectRelationMesData(String idCard) {
		return plmsLaCollectionRecordMapper.selectRelationMesData(idCard);
	}

	@Override
	public List<MesContact> selectContactsMes(String idCard, String rltnshp) {
		return plmsLaCollectionRecordMapper.selectContactsMes(idCard,rltnshp);
	}

	/**
	 * 
	* @Description: 查询外访员在外访期间提交的第一条催记  
	* @param map
	* @return
	* @return
	 */
	@Override
	public PlmsLaCollectionRecord selectMinTimeOutVisitRecord(
			Map<String, Object> map) {
		
		return plmsLaCollectionRecordMapper.selectMinTimeOutVisitRecord(map);
	}
    
}
