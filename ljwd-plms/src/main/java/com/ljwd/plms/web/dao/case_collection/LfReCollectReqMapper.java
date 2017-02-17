package com.ljwd.plms.web.dao.case_collection;

import com.ljwd.plms.web.model.case_collection.LfReCollectReq;
import com.ljwd.plms.web.model.case_collection.LfReCollectReqExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 * Created by zhengzw on 2016/12/10
 * 再扣申请表,LF_RE_COLLECT_REQ
 * */
public interface LfReCollectReqMapper {

    int countByExample(LfReCollectReqExample example);

    List<LfReCollectReq> selectByExample(LfReCollectReqExample example);

}