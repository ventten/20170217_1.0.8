package com.ljwd.plms.web.service.outsource.impl;

import com.ljwd.plms.core.feature.orm.mybatis.Page;
import com.ljwd.plms.core.generic.GenericDao;
import com.ljwd.plms.core.generic.GenericServiceImpl;
import com.ljwd.plms.core.util.ExcelUtil;
import com.ljwd.plms.core.util.StringUtil;
import com.ljwd.plms.web.dao.outsource.PlmsOutsrcComContactMapper;
import com.ljwd.plms.web.model.outsource.PlmsOutsrcComContact;
import com.ljwd.plms.web.model.outsource.PlmsOutsrcComContactExample;
import com.ljwd.plms.web.service.outsource.inf.PlmsOutsrcComContactService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

/**
 * 委外机构联系人,PLMS_OUTSRC_COM_CONTACT
 * */
@Service
public class PlmsOutsrcComContactServiceImpl extends GenericServiceImpl<PlmsOutsrcComContact,Long> implements PlmsOutsrcComContactService {

    @Resource
    private PlmsOutsrcComContactMapper plmsOutsrcComContactMapper;

    /**
     * 定义成抽象方法,由子类实现,完成dao的注入
     * @return GenericDao实现类
     */
    @Override
    public GenericDao<PlmsOutsrcComContact, Long> getDao() {
        return plmsOutsrcComContactMapper;
    }

    /**
     * 分页条件查询
     * @param page    Page信息
     * @param example 查询条件
     * @return Page数据
     */
    @Override
    public Page<PlmsOutsrcComContact> selectByExampleAndPage(Page<PlmsOutsrcComContact> page, PlmsOutsrcComContactExample example) {
        plmsOutsrcComContactMapper.selectByExampleAndPage(page, example);
        return page;
    }

    /**
     * Excel批量导入
     * @param inputStream 输入流
     * @param fileName    文件名称
     * @param outsrcComId 委外机构ID
     * @param loginUserId 登录用户ID
     */
    @Override
    public void saveContactByExcel(InputStream inputStream, String fileName, Long outsrcComId, String loginUserId) throws Exception {
        List<PlmsOutsrcComContact> list = ExcelUtil.getOutsrcComContactList(inputStream, fileName, outsrcComId, loginUserId);
        if(list != null && list.size() > 0){
            List<PlmsOutsrcComContact> insertList = new ArrayList<PlmsOutsrcComContact>();
            for(PlmsOutsrcComContact contact : list){
                if(!StringUtil.isEmpty(contact.getMobile())){
                    int count = plmsOutsrcComContactMapper.countByExample(new PlmsOutsrcComContactExample().setOutsrcComId(outsrcComId)
                            .setName(contact.getName()).setMobile(contact.getMobile()));
                    if(count > 0) continue;
                }
                insertList.add(contact);
            }
            super.insertBatch(insertList);
        }
    }

}
