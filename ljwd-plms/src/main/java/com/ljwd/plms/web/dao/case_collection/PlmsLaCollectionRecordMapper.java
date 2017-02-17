package com.ljwd.plms.web.dao.case_collection;

import com.ljwd.plms.core.feature.orm.mybatis.Page;
import com.ljwd.plms.core.generic.GenericDao;
import com.ljwd.plms.web.model.case_collection.LRltnshpDto;
import com.ljwd.plms.web.model.case_collection.LfRecivFeeDtl;
import com.ljwd.plms.web.model.case_collection.LnCntrct;
import com.ljwd.plms.web.model.case_collection.LnPayment;
import com.ljwd.plms.web.model.case_collection.LnRpmntPlan;
import com.ljwd.plms.web.model.case_collection.PlmsLaCollectionRecord;
import com.ljwd.plms.web.model.case_collection.PlmsLaCollectionRecordExample;
import com.ljwd.plms.web.model.case_collection.SysChargeSchema;
import com.ljwd.plms.web.model.cust.PlmsClContactorInfo;
import com.ljwd.plms.web.model.messageSystem.ContractClientDto;
import com.ljwd.plms.web.model.messageSystem.Customer;
import com.ljwd.plms.web.model.messageSystem.Employee;
import com.ljwd.plms.web.model.messageSystem.MesContact;
import com.ljwd.plms.web.model.messageSystem.ProductFee;
import com.ljwd.plms.web.model.messageSystem.ReceivableDetail;
import com.ljwd.plms.web.model.messageSystem.SysMessageTempLate;
import com.ljwd.plms.web.model.messageSystem.UserSearchResultItemDto;
import com.ljwd.plms.web.model.type.LRltnshp;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.ljwd.plms.web.vo.case_collection.*;

import org.apache.ibatis.annotations.Param;

/**
 * 催收记录表,PLMS_LA_COLLECTION_RECORD
 * */
public interface PlmsLaCollectionRecordMapper extends GenericDao<PlmsLaCollectionRecord,Long>{

    int countByExample(PlmsLaCollectionRecordExample example);

    int deleteByExample(PlmsLaCollectionRecordExample example);

    int deleteByPrimaryKey(Long id);

    int insert(PlmsLaCollectionRecord record);

    int insertSelective(PlmsLaCollectionRecord record);

    List<PlmsLaCollectionRecord> selectByExample(PlmsLaCollectionRecordExample example);

    PlmsLaCollectionRecord selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") PlmsLaCollectionRecord record, @Param("example") PlmsLaCollectionRecordExample example);

    int updateByExample(@Param("record") PlmsLaCollectionRecord record, @Param("example") PlmsLaCollectionRecordExample example);

    int updateByPrimaryKeySelective(PlmsLaCollectionRecord record);

    int updateByPrimaryKey(PlmsLaCollectionRecord record);

    /**
     * 根据IDS集合修改Tag(修改人设为system)
     * @param tag Tag
     * @param ids ids集合
     * @return 修改记录数
     * */
    int updateTagByIds(@Param("tag")Long tag,@Param("ids")List<Long> ids);

    /**
     * 查找到期的申请再扣、承诺还款或代偿的入账结果(只有ID、applId、periodNum、rpmntAmt、rpmntDate、repaymentAmount有值)
     * @return 实体集
     */
    List<PlmsLaCollectionRecord> selectTPJournalReport();

    /**
     * 根据借款ID和时间,统计成功入账的金额
     * @param applId 借款ID
     * @param startTime 开始时间
     * @return 金额
     */
    BigDecimal selectReportAmtByApplIdAndTime(@Param("applId")Long applId,@Param("startTime")Date startTime);

    /**
     * 分页条件查询
     * @param page Page信息
     * @param example 查询条件
     * @return Page数据
     */
    List<PlmsLaCollectionRecord> selectByExampleAndPage(Page<PlmsLaCollectionRecord> page, PlmsLaCollectionRecordExample example);

    /**
     * 分页条件查询银行代扣数据
     * @param page Page信息
     * @param example 查询条件
     * @return Page数据
     */
    List<LoanStuationDto> selectLoanStuationAndPage(Page<LoanStuationDto> page, LoanStuationExample example);

    /**
     * 根据借款申请ID统计借款详细
     * @param applId 借款申请ID
     * @param overduePeriod 最早逾期期数
     * @return ApplDetailDto
     * */
    ApplDetailDto selectApplDetailByApplIdAndDuePeriod(@Param("applId")Long applId,@Param("overduePeriod")Integer overduePeriod);
    /**
     * 
    * @Title: selectSysMessageTempLateSuiTableGroup 
    * @Description: TODO(查询模板组别a) 
    * @param @return    设定文件 
    * @return SysMessageTempLate    返回类型 
    * @throws
     */
    List<SysMessageTempLate> selectSysMessageTempLateSuiTableGroup();
    
    /**
     * 
    * @Title: selectSuiTableTypeBySuiTableGroup 
    * @Description: TODO(短信发送模块查询模板类型) 
    * @param @param stg 模板组别 参数
    * @param @return    设定文件 
    * @return List<SysMessageTempLate>    返回类型 
    * @throws
     */
    List<SysMessageTempLate> selectSuiTableTypeBySuiTableGroup(String stg);
    /**
     * 根据借款申请ID查询银行扣款情况
     * @param applId 借款申请ID
     * @return 实体集
     * */
    List<LoanStuationDto> selectLoanStuationByApplId(Long applId);
    /**
     * 
    * @Title: selectListUserSearchResultItemDto 
    * @Description: TODO(查询登录用户信息) 
    * @param @param userId
    * @param @return    设定文件 
    * @return List<UserSearchResultItemDto>    返回类型 
    * @throws
     */
    List<UserSearchResultItemDto> selectListUserSearchResultItemDto(String userId);
    /**
     * 根据借款申请ID查询扣款银行账号
     * @param applId 借款申请ID
     * @return 实体集
     * */
    List<CollectBankDto> selectCollectBankByApplId(Long applId);
    /**
     * 
    * @Title: findEmployeeOne 
    * @Description: TODO(通过ID查询雇员信息) 
    * @param @param id
    * @param @return    设定文件 
    * @return Employee    返回类型 
    * @throws
     */
    Employee findEmployeeOne(Long id);

    /**
     * 查询客户银行认账信息
     * @param example 查询条件
     * @return 实体集
     * */
    List<BankJournalReportDto> selectBankJournalReport(BankJournalReportExample example);

    /**
     * 根据借款申请ID和最早逾期期数统计破坏承诺次数
     * @param applId 借款申请ID
     * @param overduePeriod 最早逾期期数
     * @return BreakCountDto
     * */
    BreakCountDto selectBreakCountByApplIdAndDuePeriod(@Param("applId")Long applId,@Param("overduePeriod")Integer overduePeriod);
    
    public List<ContractClientDto> searchContractNos(String contractNo ,  String customerName ,  String idCardNo );
    
    LnCntrct findContractByContractNo(String contractNo);
    /**
     * 
    * @Title: findPaymentByApplyId 
    * @Description: TODO(查询 付款申请单信息,用于记录付款申请单信息) 
    * @param applId 贷款申请ID
    * @return Payment    返回类型
    * @throws
     */
    LnPayment findPaymentByApplyId(String applId);
    
    SysChargeSchema searchChargeSchemaByContractId(Long id);
    
    List<LnRpmntPlan> searchRepaymentPlansByPaymentId(Long paymentId);
    /**
     * 
    * @Title: getCustomerByApplyId 
    * @Description: TODO(查询 贷款申请人基本信息CL_CUST) 
    * @param applId
    * @return Customer 返回类型
    * @throws
     */
    Customer getCustomerByApplyId(Long applId);

    /**
    * @Title: searchListReceivableDetailByRecivId
    * @Description: TODO(查询应收款明细) 
    * @param ricivId
    * @return List<ReceivableDetail>    返回类型
     */
    List<ReceivableDetail> searchListReceivableDetailByRecivId(Long ricivId);
    
    Date getPerviousRepaymentDate(Long paymentId , Long repaymentId); 
    
    Date getLastRepaymentDate(Long paymentId);
    
    Set<LfRecivFeeDtl> getReceivableFeeDetailsByRicivId(Long ricivId);
    
    List<ProductFee> findListProductFeeBySchemaId(Long schemaId);

    /**
    * @Title: findCodeByPaymentType
    * @Description: TODO(通过放款方式查询放款方式code) 
    * @param paymentType
    * @return String 返回类型
     */
    String findCodeByPaymentType(String paymentType);

    /**
     * 
     * @Description: 通过条件查询联系人电话
     *@param relCode 关系code
     * @param idCard 贷款人身份证号 
     * @param conName 关系人姓名
     * @author zhengjizhao
     * @date 2017年1月4日上午11:12:46
     */
    List<MesContact> selectContantByMore(@Param("rltnshp")String rltnshp,@Param("idCard")String idCard,@Param("conName")String conName);
    /**
     * 
     * @Description: 通过主贷人身份证号查询此主贷人所拥有的 关系 数据
     * @param idCard 主贷人身份证号
     * @return List<LRltnshp>  
     * @author zhengjizhao
     * @date 2017年1月4日下午12:43:51
     */
    List<LRltnshpDto> selectRelationMesData(@Param("idCard")String idCard);
    /**
     * 
     * @Description: 通过身份证号和关系标识符查询联系人姓名列表
     * @param @param idCard 主贷人身份证号
     * @param @param rltnshp 与主贷人的关系标识符
     * @return List<MesContact>  
     * @author zhengjizhao
     * @date 2017年1月4日下午7:52:20
     */
    List<MesContact> selectContactsMes(@Param("idCard")String idCard,@Param("rltnshp")String rltnshp);
    
    /**
     * 
    * @Description: 询外访员在外访期间提交的第一条催记 
    * @param map
    * @return
    * @return PlmsLaCollectionRecord
     */
    PlmsLaCollectionRecord selectMinTimeOutVisitRecord(Map<String, Object> map);

}