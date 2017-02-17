package com.ljwd.plms.web.service.type.impl;

import com.ljwd.plms.web.dao.case_management.PlmsLTransferTypeMapper;
import com.ljwd.plms.web.dao.type.*;
import com.ljwd.plms.web.model.case_collection.LfRecivDtlEntery;
import com.ljwd.plms.web.model.case_management.PlmsLTransferType;
import com.ljwd.plms.web.model.case_management.PlmsLTransferTypeExample;
import com.ljwd.plms.web.model.type.*;
import com.ljwd.plms.web.service.type.inf.TypeService;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

import java.io.Serializable;
import java.util.List;

/**
 * Created by zhengzw on 2016/8/16
 * 类型service实现类
 */
@Service
public class TypeServiceImpl implements TypeService {

    @Resource
    private LBankMapper lBankMapper;
    @Resource
    private LRltnshpMapper lRltnshpMapper;
    @Resource
    private LMarriageMapper lMarriageMapper;
    @Resource
    private LAnnexStyleMapper lAnnexStyleMapper;
    @Resource
    private PlmsLTelTypeMapper plmsLTelTypeMapper;
    @Resource
    private LAccwaterTypeMapper lAccwaterTypeMapper;
    @Resource
    private PlmsLAnnexTypeMapper plmsLAnnexTypeMapper;
    @Resource
    private PlmsLAssetsTypeMapper plmsLAssetsTypeMapper;
    @Resource
    private PlmsLSourceTypeMapper plmsLSourceTypeMapper;
    @Resource
    private PlmsLAddressTypeMapper plmsLAddressTypeMapper;
    @Resource
    private PlmsLCollectMthdMapper plmsLCollectMthdMapper;
    @Resource
    private PlmsLCollectCodeMapper plmsLCollectCodeMapper;
    @Resource
    private PlmsLCollectAbnormityMapper plmsLCollectAbnormityMapper;
    @Resource
    private PlmsLTransferTypeMapper plmsLTransferTypeMapper;
    @Resource
    private PlmsLCollectStatusMapper plmsLCollectStatusMapper;
    @Resource
    private PlmsLCollectControlMapper plmsLCollectControlMapper;

    /**
     * 根据查询条件查找 账户流水类型
     * @param example 查询条件
     * @return 集合
     */
    @Override
    @Cacheable(value="typeCache", key="'TypeService_selectLAccwaterType_' + #example.getCacheKey()")
    public List<LAccwaterType> selectLAccwaterType(LAccwaterTypeExample example) {
        return lAccwaterTypeMapper.selectByExample(example);
    }

    /**
     * 根据查询条件查找 附件类别
     * @param example 查询条件
     * @return 集合
     */
    @Override
    @Cacheable(value="typeCache", key="'TypeService_selectLAnnexStyle_' + #example.getCacheKey()")
    public List<LAnnexStyle> selectLAnnexStyle(LAnnexStyleExample example) {
        return lAnnexStyleMapper.selectByExample(example);
    }

    /**
     * 根据查询条件查找 银行字典
     * @param example 查询条件
     * @return 集合
     */
    @Override
    @Cacheable(value="typeCache", key="'TypeService_selectLBank_' + #example.getCacheKey()")
    public List<LBank> selectLBank(LBankExample example) {
        return lBankMapper.selectByExample(example);
    }

    /**
     * 根据查询条件查找 个案情况
     * @param example 查询条件
     * @return 集合
     */
    @Override
    @Cacheable(value="typeCache", key="'TypeService_selectPlmsLCollectAbnormity_' + #example.getCacheKey()")
    public List<PlmsLCollectAbnormity> selectPlmsLCollectAbnormity(PlmsLCollectAbnormityExample example) {
        return plmsLCollectAbnormityMapper.selectByExample(example);
    }

    /**
     * 根据查询条件查找 婚姻状况
     * @param example 查询条件
     * @return 集合
     */
    @Override
    @Cacheable(value="typeCache", key="'TypeService_selectLMarriage_' + #example.getCacheKey()")
    public List<LMarriage> selectLMarriage(LMarriageExample example) {
        return lMarriageMapper.selectByExample(example);
    }

    /**
     * 根据查询条件查找 客户亲属关系
     * @param example 查询条件
     * @return 集合
     */
    @Override
    @Cacheable(value="typeCache", key="'TypeService_selectLRltnshp_' + #example.getCacheKey()")
    public List<LRltnshp> selectLRltnshp(LRltnshpExample example) {
        return lRltnshpMapper.selectByExample(example);
    }

    /**
     * 根据查询条件查找 地址类型
     * @param example 查询条件
     * @return 集合
     */
    @Override
    @Cacheable(value="typeCache", key="'TypeService_selectPlmsLAddressType_' + #example.getCacheKey()")
    public List<PlmsLAddressType> selectPlmsLAddressType(PlmsLAddressTypeExample example) {
        return plmsLAddressTypeMapper.selectByExample(example);
    }

    /**
     * 根据查询条件查找 附件类型
     * @param example 查询条件
     * @return 集合
     */
    @Override
    @Cacheable(value="typeCache", key="'TypeService_selectPlmsLAnnexType_' + #example.getCacheKey()")
    public List<PlmsLAnnexType> selectPlmsLAnnexType(PlmsLAnnexTypeExample example) {
        return plmsLAnnexTypeMapper.selectByExample(example);
    }

    /**
     * 根据查询条件查找 资产类型
     * @param example 查询条件
     * @return 集合
     */
    @Override
    @Cacheable(value="typeCache", key="'TypeService_selectPlmsLAssetsType_' + #example.getCacheKey()")
    public List<PlmsLAssetsType> selectPlmsLAssetsType(PlmsLAssetsTypeExample example) {
        return plmsLAssetsTypeMapper.selectByExample(example);
    }

    /**
     * 根据查询条件查找 催收类型
     * @param example 查询条件
     * @return 集合
     */
    @Override
    @Cacheable(value="typeCache", key="'TypeService_selectPlmsLCollectMthd_' + #example.getCacheKey()")
    public List<PlmsLCollectMthd> selectPlmsLCollectMthd(PlmsLCollectMthdExample example) {
        return plmsLCollectMthdMapper.selectByExample(example);
    }

    /**
     * 根据查询条件查找 来源类型
     * @param example 查询条件
     * @return 集合
     */
    @Override
    @Cacheable(value="typeCache", key="'TypeService_selectPlmsLSourceType_' + #example.getCacheKey()")
    public List<PlmsLSourceType> selectPlmsLSourceType(PlmsLSourceTypeExample example) {
        return plmsLSourceTypeMapper.selectByExample(example);
    }

    /**
     * 根据查询条件查找 号码类型
     * @param example 查询条件
     * @return 集合
     */
    @Override
    @Cacheable(value="typeCache", key="'TypeService_selectPlmsLTelType_' + #example.getCacheKey()")
    public List<PlmsLTelType> selectPlmsLTelType(PlmsLTelTypeExample example) {
        return plmsLTelTypeMapper.selectByExample(example);
    }

    /**
     * 根据查询条件查找 跟进情况
     * @param example 查询条件
     * @return 集合
     */
    @Override
    @Cacheable(value="typeCache", key="'TypeService_selectPlmsLCollectStatus_' + #example.getCacheKey()")
    public List<PlmsLCollectStatus> selectPlmsLCollectStatus(PlmsLCollectStatusExample example) {
        return plmsLCollectStatusMapper.selectByExample(example);
    }

    /**
     * 根据Code查找 跟进情况
     * @param code code
     * @return 实体
     */
    @Override
    @Cacheable(value="typeCache",key="'TypeService_selectPlmsLCollectStatusByCode_' + #code")
    public PlmsLCollectStatus selectPlmsLCollectStatusByCode(String code) {
        if(code == null || code.isEmpty()){
            return null;
        }
        List<PlmsLCollectStatus> list = plmsLCollectStatusMapper.selectByExample(new PlmsLCollectStatusExample().setCode(code));
        if(list == null || list.size() == 0){
            return null;
        }
        return list.get(0);
    }

    /**
     * 根据查询条件查找 催收代码
     * @param example 查询条件
     * @return 集合
     */
    @Override
    @Cacheable(value="typeCache", key="'TypeService_selectPlmsLCollectCode_' + #example.getCacheKey()")
    public List<PlmsLCollectCode> selectPlmsLCollectCode(PlmsLCollectCodeExample example) {
        return plmsLCollectCodeMapper.selectByExample(example);
    }

    /**
     * 根据查询条件查找 控管状态
     * @param example 查询条件
     * @return 集合
     */
    @Override
    @Cacheable(value="typeCache", key="'TypeService_selectPlmsLCollectControl_' + #example.getCacheKey()")
    public List<PlmsLCollectControl> selectPlmsLCollectControl(PlmsLCollectControlExample example) {
        return plmsLCollectControlMapper.selectByExample(example);
    }

    /**
     * 根据查询条件查找 移交类型
     * @param example 查询条件
     * @return 集合
     */
    @Override
    @Cacheable(value="typeCache",key="'TypeService_selectPlmsLTransferType_' + #example.getOrderByClause()")
    public List<PlmsLTransferType> selectPlmsLTransferType(PlmsLTransferTypeExample example) {
        return plmsLTransferTypeMapper.selectByExample(example);
    }

	@Override
	public List<LfRecivDtlEntery> selectLfRecivDtlEntery(String code) {
		//return plmsLCollectMthdMapper.selectLfRecivDtlEntery(recode);
		return null;
	}

}
