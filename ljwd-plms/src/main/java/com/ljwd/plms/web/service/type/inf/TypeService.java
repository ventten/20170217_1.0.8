package com.ljwd.plms.web.service.type.inf;

import com.ljwd.plms.web.model.case_collection.LfRecivDtlEntery;
import com.ljwd.plms.web.model.case_management.PlmsLTransferType;
import com.ljwd.plms.web.model.case_management.PlmsLTransferTypeExample;
import com.ljwd.plms.web.model.type.*;

import java.util.List;

/**
 * Created by zhengzw on 2016/8/16
 * 类型service
 */
public interface TypeService {

    /**
     * 根据查询条件查找 账户流水类型
     * @param example 查询条件
     * @return 集合
     * */
    List<LAccwaterType> selectLAccwaterType(LAccwaterTypeExample example);

    /**
     * 根据查询条件查找 附件类别
     * @param example 查询条件
     * @return 集合
     * */
    List<LAnnexStyle> selectLAnnexStyle(LAnnexStyleExample example);

    /**
     * 根据查询条件查找 银行字典
     * @param example 查询条件
     * @return 集合
     * */
    List<LBank> selectLBank(LBankExample example);

    /**
     * 根据查询条件查找 个案情况
     * @param example 查询条件
     * @return 集合
     * */
    List<PlmsLCollectAbnormity> selectPlmsLCollectAbnormity(PlmsLCollectAbnormityExample example);

    /**
     * 根据查询条件查找 婚姻状况
     * @param example 查询条件
     * @return 集合
     * */
    List<LMarriage> selectLMarriage(LMarriageExample example);

    /**
     * 根据查询条件查找 客户亲属关系
     * @param example 查询条件
     * @return 集合
     * */
    List<LRltnshp> selectLRltnshp(LRltnshpExample example);

    /**
     * 根据查询条件查找 地址类型
     * @param example 查询条件
     * @return 集合
     * */
    List<PlmsLAddressType> selectPlmsLAddressType(PlmsLAddressTypeExample example);

    /**
     * 根据查询条件查找 附件类型
     * @param example 查询条件
     * @return 集合
     * */
    List<PlmsLAnnexType> selectPlmsLAnnexType(PlmsLAnnexTypeExample example);

    /**
     * 根据查询条件查找 资产类型
     * @param example 查询条件
     * @return 集合
     * */
    List<PlmsLAssetsType> selectPlmsLAssetsType(PlmsLAssetsTypeExample example);

    /**
     * 根据查询条件查找 催收类型
     * @param example 查询条件
     * @return 集合
     * */
    List<PlmsLCollectMthd> selectPlmsLCollectMthd(PlmsLCollectMthdExample example);

    /**
     * 根据查询条件查找 来源类型
     * @param example 查询条件
     * @return 集合
     * */
    List<PlmsLSourceType> selectPlmsLSourceType(PlmsLSourceTypeExample example);

    /**
     * 根据查询条件查找 号码类型
     * @param example 查询条件
     * @return 集合
     * */
    List<PlmsLTelType> selectPlmsLTelType(PlmsLTelTypeExample example);

    /**
     * 根据查询条件查找 跟进情况
     * @param example 查询条件
     * @return 集合
     * */
    List<PlmsLCollectStatus> selectPlmsLCollectStatus(PlmsLCollectStatusExample example);

    /**
     * 根据Code查找 跟进情况
     * @param code code
     * @return 实体
     * */
    PlmsLCollectStatus selectPlmsLCollectStatusByCode(String code);

    /**
     * 根据查询条件查找 催收代码
     * @param example 查询条件
     * @return 集合
     * */
    List<PlmsLCollectCode> selectPlmsLCollectCode(PlmsLCollectCodeExample example);

    /**
     * 根据查询条件查找 控管状态
     * @param example 查询条件
     * @return 集合
     * */
    List<PlmsLCollectControl> selectPlmsLCollectControl(PlmsLCollectControlExample example);

    /**
     * 根据查询条件查找 移交类型
     * @param example 查询条件
     * @return 集合
     * */
    List<PlmsLTransferType> selectPlmsLTransferType(PlmsLTransferTypeExample example);
    /**
     * 根据code查询费用项名称
     * @param example 查询条件
     * @return 集合
     * */
    List<LfRecivDtlEntery> selectLfRecivDtlEntery(String code);

}
