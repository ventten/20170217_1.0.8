package com.ljwd.plms.web.dao.cust;

import com.ljwd.plms.core.feature.orm.mybatis.Page;
import com.ljwd.plms.core.generic.GenericDao;
import com.ljwd.plms.mapp.vo.customer.APPCustInfoVo;
import com.ljwd.plms.web.model.cust.PlmsClCustInfo;
import com.ljwd.plms.web.model.cust.PlmsClCustInfoExample;
import com.ljwd.plms.web.vo.cust.CustCaseDto;
import com.ljwd.plms.web.vo.cust.CustCaseExample;
import com.ljwd.plms.web.vo.cust.PageCustDto;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 客户基本信息,plms_cl_cust_info
 * */
public interface PlmsClCustInfoMapper extends GenericDao<PlmsClCustInfo, Long> {

    int countByExample(PlmsClCustInfoExample example);

    int deleteByExample(PlmsClCustInfoExample example);

    int deleteByPrimaryKey(Long id);

    int insert(PlmsClCustInfo record);

    int insertSelective(PlmsClCustInfo record);

    List<PlmsClCustInfo> selectByExample(PlmsClCustInfoExample example);

    PlmsClCustInfo selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") PlmsClCustInfo record, @Param("example") PlmsClCustInfoExample example);

    int updateByExample(@Param("record") PlmsClCustInfo record, @Param("example") PlmsClCustInfoExample example);

    int updateByPrimaryKeySelective(PlmsClCustInfo record);

    int updateByPrimaryKey(PlmsClCustInfo record);

    /**
     * 分页条件查询
     * @param page Page信息
     * @param example 查询条件
     * @return Page数据
     */
    List<PlmsClCustInfo> selectByExampleAndPage(Page<PlmsClCustInfo> page, PlmsClCustInfoExample example);

    /**
     * 分页条件查询客户信息管理页
     * @param page Page信息
     * @param example 查询条件
     * @return Page数据
     */
    List<PageCustDto> selectIndexAndPage(Page<PageCustDto> page, PlmsClCustInfoExample example);

    /**
     * 个案查询
     * @param page Page信息
     * @param example 查询条件
     * @return Page数据
     */
    List<CustCaseDto> selectCustCaseAndPage(Page<CustCaseDto> page, CustCaseExample example);

    /**
     * 查询微贷系统逾期客户的信息
     * @param size 取记录条数
     * @return 实体集
     * */
    List<PlmsClCustInfo> findMfbmsOverDueCust(int size);

    /**
     * 根据微贷借款申请ID查询贷后客户ID
     * @param applId 微贷借款申请ID
     * @return 贷后客户ID
     * */
    Long selectClCustIdByApplId(Long applId);

    /**
     * 根据微贷客户ID查询微贷客户信息
     * @param custId CL_CUST表主键
     * @return 客户信息
     */
    APPCustInfoVo selectClCustById(Long custId);

}