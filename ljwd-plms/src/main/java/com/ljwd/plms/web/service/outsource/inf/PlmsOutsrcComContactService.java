package com.ljwd.plms.web.service.outsource.inf;

import com.ljwd.plms.core.feature.orm.mybatis.Page;
import com.ljwd.plms.core.generic.GenericService;
import com.ljwd.plms.web.model.outsource.PlmsOutsrcComContact;
import com.ljwd.plms.web.model.outsource.PlmsOutsrcComContactExample;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * 委外机构联系人,PLMS_OUTSRC_COM_CONTACT
 * */
public interface PlmsOutsrcComContactService extends GenericService<PlmsOutsrcComContact,Long> {

    /**
     * 分页条件查询
     * @param page Page信息
     * @param example 查询条件
     * @return Page数据
     */
    Page<PlmsOutsrcComContact> selectByExampleAndPage(Page<PlmsOutsrcComContact> page, PlmsOutsrcComContactExample example);

    /**
     * Excel批量导入
     * @param inputStream 输入流
     * @param fileName 文件名称
     * @param outsrcComId 委外机构ID
     * @param loginUserId 登录用户ID
     */
    void saveContactByExcel(InputStream inputStream,String fileName,Long outsrcComId,String loginUserId) throws Exception;

}
