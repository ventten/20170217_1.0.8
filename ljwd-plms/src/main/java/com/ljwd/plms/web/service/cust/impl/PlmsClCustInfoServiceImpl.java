package com.ljwd.plms.web.service.cust.impl;

import com.ljwd.plms.core.feature.orm.mybatis.Page;
import com.ljwd.plms.core.generic.GenericDao;
import com.ljwd.plms.core.generic.GenericServiceImpl;
import com.ljwd.plms.mapp.vo.customer.APPCustInfoVo;
import com.ljwd.plms.web.dao.cust.PlmsClCustInfoMapper;
import com.ljwd.plms.web.model.cust.PlmsClCustInfo;
import com.ljwd.plms.web.model.cust.PlmsClCustInfoExample;
import com.ljwd.plms.web.service.cust.inf.PlmsClCustInfoService;
import com.ljwd.plms.web.vo.cust.CustCaseDto;
import com.ljwd.plms.web.vo.cust.CustCaseExample;
import com.ljwd.plms.web.vo.cust.PageCustDto;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

/**
 * 客户基本信息,plms_cl_cust_info
 * */
@Service
public class PlmsClCustInfoServiceImpl extends GenericServiceImpl<PlmsClCustInfo, Long> implements PlmsClCustInfoService {

    @Resource
    private PlmsClCustInfoMapper plmsClCustInfoMapper;

    /**
     * 定义成抽象方法,由子类实现,完成dao的注入
     * @return GenericDao实现类
     */
    @Override
    public GenericDao<PlmsClCustInfo, Long> getDao() {
        return plmsClCustInfoMapper;
    }

    /**
     * 分页条件查询
     * @param page Page信息
     * @param example 查询条件
     * @return Page数据
     */
    @Override
    public Page<PlmsClCustInfo> selectByExampleAndPage(Page<PlmsClCustInfo> page, PlmsClCustInfoExample example) {
        plmsClCustInfoMapper.selectByExampleAndPage(page, example);
        return page;
    }

    /**
     * 分页条件查询客户信息管理页
     * @param page    Page信息
     * @param example 查询条件
     * @return Page数据
     */
    @Override
    public Page<PageCustDto> selectIndexAndPage(Page<PageCustDto> page, PlmsClCustInfoExample example) {
        plmsClCustInfoMapper.selectIndexAndPage(page, example);
        return page;
    }

    /**
     * 个案查询
     * @param page    Page信息
     * @param example 查询条件
     * @return Page数据
     */
    @Override
    public Page<CustCaseDto> selectCustCaseAndPage(Page<CustCaseDto> page, CustCaseExample example) {
        plmsClCustInfoMapper.selectCustCaseAndPage(page, example);
        return page;
    }

    /**
     * 添加客户信息
     * @param custName   姓名
     * @param gender     性别
     * @param marriage   婚姻状况
     * @param doctype    证件类型
     * @param docno      证件号码
     * @param birthPlace 籍贯
     * @param education  教育程度
     * @param birthday   出生日期
     * @return 新客户ID
     */
    @Override
    public Long addCust(String custName, String gender, String marriage, String doctype, String docno, String birthPlace, String education,Date birthday) {
        PlmsClCustInfo newCust = new PlmsClCustInfo();
        newCust.setCustName(custName);
        newCust.setGender(gender);
        newCust.setBirthday(birthday);
        newCust.setMarriage(marriage);
        newCust.setDoctype(doctype);
        newCust.setDocno(docno);
        newCust.setBirthPlace(birthPlace);
        newCust.setEducation(education);

        newCust.setCreatedBy("admin");
        newCust.setCreateTime(new Date());
        newCust.setUpdatedBy("admin");
        newCust.setUpdateTime(new Date());
        newCust.setRecVer(0L);
        newCust.setTagSeq(0L);

        int ret = plmsClCustInfoMapper.insert(newCust);
        if(ret <= 0){
            throw new RuntimeException("添加客户信息失败.");
        }
        return newCust.getId();
    }

    /**
     * 查询微贷系统逾期客户的信息
     * @param size 取记录条数
     * @return 实体集
     */
    @Override
    public List<PlmsClCustInfo> findMfbmsOverDueCust(int size) {
        return plmsClCustInfoMapper.findMfbmsOverDueCust(size);
    }

    /**
     * 根据微贷借款申请ID查询贷后客户ID
     * @param applId 微贷借款申请ID
     * @return 贷后客户ID
     */
    @Override
    public Long selectClCustIdByApplId(Long applId) {
        if(applId == null){
            return null;
        }
        return plmsClCustInfoMapper.selectClCustIdByApplId(applId);
    }

    /**
     * 根据微贷客户ID查询微贷客户信息
     * @param custId CL_CUST表主键
     * @return 客户信息
     */
    @Override
    public APPCustInfoVo selectClCustById(Long custId) {
        return plmsClCustInfoMapper.selectClCustById(custId);
    }

}