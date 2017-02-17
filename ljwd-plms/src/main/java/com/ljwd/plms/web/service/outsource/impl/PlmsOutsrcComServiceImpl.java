package com.ljwd.plms.web.service.outsource.impl;

import com.ljwd.plms.core.feature.orm.mybatis.Page;
import com.ljwd.plms.core.generic.GenericDao;
import com.ljwd.plms.core.generic.GenericServiceImpl;
import com.ljwd.plms.core.util.StringUtil;
import com.ljwd.plms.web.dao.outsource.PlmsOutsrcComMapper;
import com.ljwd.plms.web.model.outsource.PlmsOutsrcCom;
import com.ljwd.plms.web.model.outsource.PlmsOutsrcComExample;
import com.ljwd.plms.web.model.outsource.PlmsOutsrcComRegion;
import com.ljwd.plms.web.model.outsource.PlmsOutsrcComRegionExample;
import com.ljwd.plms.web.service.outsource.inf.PlmsOutsrcComRegionService;
import com.ljwd.plms.web.service.outsource.inf.PlmsOutsrcComService;
import com.ljwd.plms.web.vo.outsource.WdCorpDto;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * 委外机构,PLMS_OUTSRC_COM
 * */
@Service
public class PlmsOutsrcComServiceImpl extends GenericServiceImpl<PlmsOutsrcCom,Long> implements PlmsOutsrcComService {

    @Resource
    private PlmsOutsrcComMapper plmsOutsrcComMapper;
    @Resource
    private PlmsOutsrcComRegionService plmsOutsrcComRegionService;

    /**
     * 定义成抽象方法,由子类实现,完成dao的注入
     * @return GenericDao实现类
     */
    @Override
    public GenericDao<PlmsOutsrcCom, Long> getDao() {
        return plmsOutsrcComMapper;
    }

    /**
     * 插入对象
     * @param outsrcCom 对象
     */
    @Override
    public int insert(PlmsOutsrcCom outsrcCom) {
        return plmsOutsrcComMapper.insert(outsrcCom);
    }

    /**
     * 根据条件查询数量
     * @param example 查询条件
     * @return 数量
     */
    @Override
    public int countByExample(PlmsOutsrcComExample example) {
        return plmsOutsrcComMapper.countByExample(example);
    }

    /**
     * 根据公司名称查询
     * @param comName 公司名称
     * @return 实体
     */
    @Override
    public PlmsOutsrcCom selectByComName(String comName) {
        if(StringUtil.isEmpty(comName)){
            return null;
        }
        List<PlmsOutsrcCom> list = plmsOutsrcComMapper.selectByExample(new PlmsOutsrcComExample().setComName(comName));
        if(list == null || list.isEmpty()){
            return null;
        }
        return list.get(0);
    }

    /**
     * 条件查询
     * @param example 查询条件
     * @return List
     */
    @Override
    public List<PlmsOutsrcCom> selectByExample(PlmsOutsrcComExample example) {
        return plmsOutsrcComMapper.selectByExample(example);
    }

    /**
     * 分页条件查询
     * @param page    Page信息
     * @param example 查询条件
     * @return Page数据
     */
    @Override
    public Page<PlmsOutsrcCom> selectByExampleAndPage(Page<PlmsOutsrcCom> page, PlmsOutsrcComExample example) {
        plmsOutsrcComMapper.selectByExampleAndPage(page, example);
        return page;
    }

    /**
     * 根据区域ID查询启用的委外机构,并按优先级降序排序(一手案件分配用)
     * @param regionId 区域ID
     * @return 实体集
     */
    @Override
    public List<PlmsOutsrcCom> selectFirstByRegionId(Long regionId) {
        return regionId == null ? null : plmsOutsrcComMapper.selectFirstByRegionId(regionId);
    }

    /**
     * 根据区域ID查询启用的委外机构和机构二手案件在户数,并按在户数升序、优先级降序排序(二手案件分配用)
     * @param regionId 区域ID
     * @return 实体集
     */
    @Override
    public List<PlmsOutsrcCom> selectSecondByRegionId(Long regionId) {
        return regionId == null ? null : plmsOutsrcComMapper.selectSecondByRegionId(regionId);
    }

    /**
     * 根据区域ID查询启用的委外机构,及委外机构的二手案件在户数,并根据借款ID、委外批次编号查询此借款是否委外过给委外机构,并按照是否委外(先否后是)、在户数升序、机构优先级降序排序
     * @param regionId 区域ID
     * @param applId   借款ID
     * @param lotNo    委外批次编号
     * @return 实体集
     */
    @Override
    public List<PlmsOutsrcCom> selectByRegionIdApplIdLotNo(Long regionId, Long applId, String lotNo) {
        if(regionId == null || applId == null){
            return null;
        }
        return plmsOutsrcComMapper.selectByRegionIdApplIdLotNo(regionId, applId, lotNo);
    }

    /**
     * 添加委外机构
     * @param outsrcCom 委外机构
     * @param regionIds 辐射区域IDS
     * @param loginUser 操作员
     */
    @Override
    public void addOutsrcCom(PlmsOutsrcCom outsrcCom, Long[] regionIds, String loginUser) {
        int ret = plmsOutsrcComMapper.insert(outsrcCom);
        if(ret < 1){
            throw new RuntimeException("添加委外机构失败");
        }

        //委外机构ID
        Long comId = outsrcCom.getId();

        //辐射区域集合
        List<PlmsOutsrcComRegion> regionList = new ArrayList<PlmsOutsrcComRegion>();
        Date time = new Date();
        String isActive = "Y";
        for(Long regionId : regionIds){
            PlmsOutsrcComRegion region = new PlmsOutsrcComRegion();
            region.setOutsrcComId(comId);
            region.setRegionId(regionId);
            region.setIsActive(isActive);
            region.setCreateTime(time);
            region.setCreatedBy(loginUser);
            region.setUpdateTime(time);
            region.setUpdatedBy(loginUser);
            region.setRecVer(0L);
            region.setTagSeq(1L);
            regionList.add(region);
        }
        //批量添加辐射区域
        plmsOutsrcComRegionService.insertBatch(regionList);
    }

    /**
     * 修改委外机构
     * @param outsrcCom 委外机构
     * @param regionIds 辐射区域IDS
     * @param loginUser 操作员
     */
    @Override
    public void updateOutsrcCom(PlmsOutsrcCom outsrcCom, Long[] regionIds, String loginUser) {
        int ret = plmsOutsrcComMapper.updateByPrimaryKeySelective(outsrcCom);
        if(ret <= 0){
            throw new RuntimeException("修改委外机构失败");
        }

        //委外机构ID
        Long comId = outsrcCom.getId();

        //根据机构ID删除旧的辐射区域
        plmsOutsrcComRegionService.deleteByExample(new PlmsOutsrcComRegionExample().setOutsrcComId(comId));

        //辐射区域集合
        List<PlmsOutsrcComRegion> regionList = new ArrayList<PlmsOutsrcComRegion>();
        Date time = new Date();
        String isActive = "Y";
        for(Long regionId : regionIds){
            PlmsOutsrcComRegion region = new PlmsOutsrcComRegion();
            region.setOutsrcComId(comId);
            region.setRegionId(regionId);
            region.setIsActive(isActive);
            region.setCreateTime(time);
            region.setCreatedBy(loginUser);
            region.setUpdateTime(time);
            region.setUpdatedBy(loginUser);
            region.setRecVer(0L);
            region.setTagSeq(1L);
            regionList.add(region);
        }
        //批量添加辐射区域
        plmsOutsrcComRegionService.insertBatch(regionList);
    }

    /**
     * 查找微贷有效的外包公司
     * @return 实体集
     */
    @Override
    public List<WdCorpDto> selectWdCorp() {
        return plmsOutsrcComMapper.selectWdCorp();
    }

}
