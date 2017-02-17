package com.ljwd.plms.web.dao.case_collection;

import com.ljwd.plms.web.model.case_collection.SysChargeSchema;
import com.ljwd.plms.web.model.case_collection.SysChargeSchemaExample;
import java.math.BigDecimal;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 * SYS_CHARGE_SCHEMA
 * */
public interface SysChargeSchemaMapper {

    int countByExample(SysChargeSchemaExample example);

    List<SysChargeSchema> selectByExample(SysChargeSchemaExample example);

    SysChargeSchema selectByPrimaryKey(Long id);

}