package com.ljwd.plms.web.service.outsource.inf;

import com.ljwd.plms.core.entity.JSONResult;
import com.ljwd.plms.core.feature.orm.mybatis.Page;
import com.ljwd.plms.core.generic.GenericService;
import com.ljwd.plms.web.model.outsource.PlmsLaApplOutsrcCollect;
import com.ljwd.plms.web.model.outsource.PlmsLaApplOutsrcCollectExample;
import com.ljwd.plms.web.vo.outsource.OutsrcCollectPageDto;
import com.ljwd.plms.web.vo.outsource.OutsrcCollectPageExample;

import java.io.InputStream;
import java.util.List;

/**
 * 委外催记表,PLMS_LA_APPL_OUTSRC_COLLECT
 * */
public interface PlmsLaApplOutsrcCollectService extends GenericService<PlmsLaApplOutsrcCollect,Long> {

    /**
     * 根据条件统计数量
     * @param example 查询条件
     * @return 数量
     */
    int countByExample(PlmsLaApplOutsrcCollectExample example);

    /**
     * 根据条件查询
     * @param example 查询条件
     * @return 实体集
     */
    List<PlmsLaApplOutsrcCollect> selectByExample(PlmsLaApplOutsrcCollectExample example);

    /**
     * 分页条件查询
     * @param page Page信息
     * @param example 查询条件
     * @return Page数据
     */
    Page<OutsrcCollectPageDto> selectByExampleAndPage(Page<OutsrcCollectPageDto> page, OutsrcCollectPageExample example);

    /**
     * Excel批量导入
     * @param inputStream 输入流
     * @param fileName    文件名称
     * @param loginUserId 登录用户ID
     * @return JSONResult
     */
    public JSONResult saveCollectByExcel(InputStream inputStream, String fileName,String loginUserId) throws Exception;

}
