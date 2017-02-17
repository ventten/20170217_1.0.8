package com.ljwd.plms.web.service.cust.inf;

import com.ljwd.plms.core.feature.orm.mybatis.Page;
import com.ljwd.plms.core.generic.GenericService;
import com.ljwd.plms.mapp.vo.customer.APPCustInfoVo;
import com.ljwd.plms.web.model.cust.PlmsClCustInfo;
import com.ljwd.plms.web.model.cust.PlmsClCustInfoExample;
import com.ljwd.plms.web.vo.cust.CustCaseDto;
import com.ljwd.plms.web.vo.cust.CustCaseExample;
import com.ljwd.plms.web.vo.cust.PageCustDto;

import java.util.Date;
import java.util.List;

/**
 * 客户基本信息,plms_cl_cust_info
 * */
public interface PlmsClCustInfoService extends GenericService<PlmsClCustInfo, Long> {

    /**
     * 分页条件查询
     * @param page Page信息
     * @param example 查询条件
     * @return Page数据
     */
    Page<PlmsClCustInfo> selectByExampleAndPage(Page<PlmsClCustInfo> page, PlmsClCustInfoExample example);

    /**
     * 分页条件查询客户信息管理页
     * @param page Page信息
     * @param example 查询条件
     * @return Page数据
     */
    Page<PageCustDto> selectIndexAndPage(Page<PageCustDto> page, PlmsClCustInfoExample example);

    /**
     * 个案查询
     * @param page Page信息
     * @param example 查询条件
     * @return Page数据
     */
    Page<CustCaseDto> selectCustCaseAndPage(Page<CustCaseDto> page, CustCaseExample example);

    /**
     * 添加客户信息
     * @param custName 姓名
     * @param gender 性别
     * @param marriage 婚姻状况
     * @param doctype 证件类型
     * @param docno 证件号码
     * @param birthPlace 籍贯
     * @param education 教育程度
     * @param birthday 出生日期
     * @return 新客户ID
     * */
    public Long addCust(String custName,String gender,String marriage,String doctype,String docno,String birthPlace,String education,Date birthday);

    /**
     * 查询微贷系统逾期客户的信息
     * @param size 取记录条数
     * @return 实体集
     * */
    public List<PlmsClCustInfo> findMfbmsOverDueCust(int size);

    /**
     * 根据微贷借款申请ID查询贷后客户ID
     * @param applId 微贷借款申请ID
     * @return 贷后客户ID
     * */
    public Long selectClCustIdByApplId(Long applId);

    /**
     * 根据微贷客户ID查询微贷客户信息
     * @param custId CL_CUST表主键
     * @return 客户信息
     */
    APPCustInfoVo selectClCustById(Long custId);
}