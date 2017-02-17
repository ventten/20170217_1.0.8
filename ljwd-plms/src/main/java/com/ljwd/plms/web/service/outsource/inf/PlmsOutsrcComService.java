package com.ljwd.plms.web.service.outsource.inf;

import com.ljwd.plms.core.feature.orm.mybatis.Page;
import com.ljwd.plms.core.generic.GenericService;
import com.ljwd.plms.web.model.outsource.PlmsOutsrcCom;
import com.ljwd.plms.web.model.outsource.PlmsOutsrcComExample;
import com.ljwd.plms.web.vo.outsource.WdCorpDto;

import java.util.List;

/**
 * 委外机构,PLMS_OUTSRC_COM
 * */
public interface PlmsOutsrcComService extends GenericService<PlmsOutsrcCom,Long> {

    /**
     * 根据条件查询数量
     * @param example 查询条件
     * @return 数量
     */
    int countByExample(PlmsOutsrcComExample example);

    /**
     * 根据公司名称查询
     * @param comName 公司名称
     * @return 实体
     */
    PlmsOutsrcCom selectByComName(String comName);

    /**
     * 条件查询
     * @param example 查询条件
     * @return List
     */
    List<PlmsOutsrcCom> selectByExample(PlmsOutsrcComExample example);

    /**
     * 分页条件查询
     * @param page Page信息
     * @param example 查询条件
     * @return Page数据
     */
    Page<PlmsOutsrcCom> selectByExampleAndPage(Page<PlmsOutsrcCom> page, PlmsOutsrcComExample example);

    /**
     * 根据区域ID查询启用的委外机构,并按优先级降序排序(一手案件分配用)
     * @param regionId 区域ID
     * @return 实体集
     */
    List<PlmsOutsrcCom> selectFirstByRegionId(Long regionId);

    /**
     * 根据区域ID查询启用的委外机构和机构二手案件在户数,并按在户数升序、优先级降序排序(二手案件分配用)
     * @param regionId 区域ID
     * @return 实体集
     */
    List<PlmsOutsrcCom> selectSecondByRegionId(Long regionId);

    /**
     * 根据区域ID查询启用的委外机构,及委外机构的二手案件在户数,并根据借款ID、委外批次编号查询此借款是否委外过给委外机构,并按照是否委外(先否后是)、在户数升序、机构优先级降序排序
     * @param regionId 区域ID
     * @param applId 借款ID
     * @param lotNo 委外批次编号
     * @return 实体集
     */
    List<PlmsOutsrcCom> selectByRegionIdApplIdLotNo(Long regionId,Long applId,String lotNo);

    /**
     * 添加委外机构
     * @param outsrcCom 委外机构
     * @param regionIds 辐射区域IDS
     * @param loginUser 操作员
     */
    void addOutsrcCom(PlmsOutsrcCom outsrcCom, Long[] regionIds, String loginUser);

    /**
     * 修改委外机构
     * @param outsrcCom 委外机构
     * @param regionIds 辐射区域IDS
     * @param loginUser 操作员
     */
    void updateOutsrcCom(PlmsOutsrcCom outsrcCom, Long[] regionIds, String loginUser);

    /**
     * 查找微贷有效的外包公司
     * @return 实体集
     */
    List<WdCorpDto> selectWdCorp();

}
