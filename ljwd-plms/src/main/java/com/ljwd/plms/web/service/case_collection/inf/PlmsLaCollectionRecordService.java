package com.ljwd.plms.web.service.case_collection.inf;

import com.ljwd.plms.core.feature.orm.mybatis.Page;
import com.ljwd.plms.core.generic.GenericService;
import com.ljwd.plms.web.model.case_collection.LRltnshpDto;
import com.ljwd.plms.web.model.case_collection.PlmsLaCollectionRecord;
import com.ljwd.plms.web.model.case_collection.PlmsLaCollectionRecordExample;
import com.ljwd.plms.web.model.cust.PlmsClContactorInfo;
import com.ljwd.plms.web.model.messageSystem.CalculateSummaryReceivableParamMyDto;
import com.ljwd.plms.web.model.messageSystem.ContractClientDto;
import com.ljwd.plms.web.model.messageSystem.Employee;
import com.ljwd.plms.web.model.messageSystem.MesContact;
import com.ljwd.plms.web.model.messageSystem.SimulateCalculateSummaryReceivableResultDto;
import com.ljwd.plms.web.model.messageSystem.SysMessageTempLate;
import com.ljwd.plms.web.model.messageSystem.UserSearchResultItemDto;
import com.ljwd.plms.web.model.type.LRltnshp;
import com.ljwd.plms.web.vo.case_collection.ApplDetailDto;
import com.ljwd.plms.web.vo.case_collection.LoanStuationDto;
import com.ljwd.plms.web.vo.case_collection.LoanStuationExample;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

/**
 * 催收记录表,PLMS_LA_COLLECTION_RECORD
 * */
public interface PlmsLaCollectionRecordService extends GenericService<PlmsLaCollectionRecord,Long>{

    /**
     * 根据条件统计数量
     * @param example 查询条件
     * @return 数量
     * */
    int selectCountByExample(PlmsLaCollectionRecordExample example);

    /**
     * 分页条件查询
     * @param page Page信息
     * @param example 查询条件
     * @return Page数据
     */
    Page<PlmsLaCollectionRecord> selectByExampleAndPage(Page<PlmsLaCollectionRecord> page, PlmsLaCollectionRecordExample example);

    /**
     * 分页条件查询银行代扣数据
     * @param page Page信息
     * @param example 查询条件
     * @return Page数据
     */
    Page<LoanStuationDto> selectLoanStuationAndPage(Page<LoanStuationDto> page, LoanStuationExample example);

    /**
     * 根据条件查询
     * @param example 查询条件
     * @return 实体集
     * */
    List<PlmsLaCollectionRecord> selectByExample(PlmsLaCollectionRecordExample example);

    /**
     * 根据借款申请ID统计借款详细、破坏承诺次数、银行代扣情况、扣款账户
     * @param applId 借款申请ID
     * @param overduePeriod 最早逾期期数
     * @return ApplDetailDto
     * */
    ApplDetailDto selectApplDetailByApplIdAndDuePeriod(Long applId,Integer overduePeriod);

    /**
    * @Title: selectSysMessageTempLateSuiTableGroup
    * @Description: TODO(查询模板组别) 
    * @return SysMessageTempLate    返回类型
     */
    List<SysMessageTempLate> selectSysMessageTempLateSuiTableGroup();

    /**
    * @Title: selectSuiTableTypeBySuiTableGroup
    * @Description: TODO(短信发送模块查询模板类型) 
    * @paramstg 模板组别 参数
    * @return List<SysMessageTempLate> 返回类型 设定文件
     */
    List<SysMessageTempLate> selectSuiTableTypeBySuiTableGroup(String stg);

    /**
    * @Title: selectListUserSearchResultItemDto
    * @Description: TODO(查询登录用户信息) 
    * @param userId 用户ID
    * @return List<UserSearchResultItemDto> 返回类型 设定文件
    * @throws
     */
    List<UserSearchResultItemDto> selectListUserSearchResultItemDto(String userId);

    /**
    * @Title: findEmployeeOne
    * @Description: TODO(通过ID查询雇员信息) 
    * @param id
    * @return Employee 返回类型
     */
    Employee findEmployeeOne(Long id);
    
    /**
    * @Title: simulateCalculateSummaryReceivable
    * @Description: TODO(模拟计算当天还清时需还款总额) 
    * @param paramDto
    * @param isNeedClientInfo
    * @return SimulateCalculateSummaryReceivableResultDto    返回类型
     */
    SimulateCalculateSummaryReceivableResultDto simulateCalculateSummaryReceivable(CalculateSummaryReceivableParamMyDto paramDto, boolean isNeedClientInfo);

    /**
     * 根据IDS集合修改Tag(修改人设为system)
     * @param tag Tag
     * @param ids ids集合
     * @return 修改记录数
     * */
    int updateTagByIds(Long tag,List<Long> ids);

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
    BigDecimal selectReportAmtByApplIdAndTime(Long applId,Date startTime);
    
    /**
    * @Description: 批量插入
    * @param list
     */
	void insertBatch(List<PlmsLaCollectionRecord> list);

	/**
	* @Title: findCodeByPaymentType
	* @Description: TODO(通过放款方式名查询放款方式code) 
	* @param paymentType 放款方式名
	* @return String  返回类型
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
    List<MesContact> selectContantByMore(String rltnshp,String idCard,String conName);
    /**
     * 
     * @Description: 通过主贷人身份证号查询此主贷人所拥有的 关系 数据
     * @param idCard 主贷人身份证号
     * @return List<LRltnshp>  
     * @author zhengjizhao
     * @date 2017年1月4日下午12:43:51
     */
    List<LRltnshpDto> selectRelationMesData(String idCard);
    /**
     * 
     * @Description: 通过身份证号和关系标识符查询联系人姓名列表
     * @param @param idCard 主贷人身份证号
     * @param @param rltnshp 与主贷人的关系标识符
     * @return List<MesContact>  
     * @author zhengjizhao
     * @date 2017年1月4日下午7:52:20
     */
    List<MesContact> selectContactsMes(String idCard,String rltnshp);
    
    
    /**
     * 
    * @Description: 查询外访员在外访期间提交的第一条催记 
    * @param map
    * @return
    * @return PlmsLaCollectionRecord
     */
    PlmsLaCollectionRecord selectMinTimeOutVisitRecord(Map<String, Object> map);
}
