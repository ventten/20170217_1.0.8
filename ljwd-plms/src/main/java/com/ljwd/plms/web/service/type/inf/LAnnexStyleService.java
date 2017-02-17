package com.ljwd.plms.web.service.type.inf;

import com.ljwd.plms.core.generic.GenericService;
import com.ljwd.plms.web.model.type.LAnnexStyle;
import com.ljwd.plms.web.model.type.LAnnexStyleExample;

import java.util.List;

/**
 * 附件类别,L_ANNEX_STYLE
 * */
public interface LAnnexStyleService extends GenericService<LAnnexStyle,String> {

    /**
     * 根据查询条件查找
     * @param example 查询条件
     * @return 集合
     * */
    List<LAnnexStyle> selectByExample(LAnnexStyleExample example);

}