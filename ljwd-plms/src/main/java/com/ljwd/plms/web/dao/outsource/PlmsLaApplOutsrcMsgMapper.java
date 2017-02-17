package com.ljwd.plms.web.dao.outsource;

import com.ljwd.plms.core.generic.GenericDao;
import com.ljwd.plms.web.model.outsource.PlmsLaApplOutsrcMsg;
import com.ljwd.plms.web.model.outsource.PlmsLaApplOutsrcMsgExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 * Created by zhengzw on 2016/11/15
 * 委外申请同步记录表,PLMS_LA_APPL_OUTSRC_MSG
 * */
public interface PlmsLaApplOutsrcMsgMapper extends GenericDao<PlmsLaApplOutsrcMsg,Long>{

    int countByExample(PlmsLaApplOutsrcMsgExample example);

    int deleteByExample(PlmsLaApplOutsrcMsgExample example);

    int deleteByPrimaryKey(Long id);

    int insert(PlmsLaApplOutsrcMsg record);

    int insertSelective(PlmsLaApplOutsrcMsg record);

    List<PlmsLaApplOutsrcMsg> selectByExample(PlmsLaApplOutsrcMsgExample example);

    PlmsLaApplOutsrcMsg selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") PlmsLaApplOutsrcMsg record, @Param("example") PlmsLaApplOutsrcMsgExample example);

    int updateByExample(@Param("record") PlmsLaApplOutsrcMsg record, @Param("example") PlmsLaApplOutsrcMsgExample example);

    int updateByPrimaryKeySelective(PlmsLaApplOutsrcMsg record);

    int updateByPrimaryKey(PlmsLaApplOutsrcMsg record);

}