package com.ljwd.plms.web.model.messageSystem;

import java.math.BigDecimal;

import javax.xml.bind.annotation.XmlAttribute;

import com.ljwd.plms.web.enums.CalcMethod;
import com.ljwd.plms.web.enums.ValueType;


public class ProductFeeCalculateDto {

    private ValueType valueType;
    @XmlAttribute
    private BigDecimal value;
    private CalcMethod calMethod;

    /**
     * @return the valueType
     */
    public ValueType getValueType() {
        return valueType;
    }

    /**
     * @param valueType the valueType to set
     */
    public void setValueType(ValueType valueType) {
        this.valueType = valueType;
    }

    /**
     * @return the value
     */
    public BigDecimal getValue() {
        return value;
    }

    /**
     * @param value the value to set
     */
    public void setValue(BigDecimal value) {
        this.value = value;
    }

    /**
     * @return the calMethod
     */
    public CalcMethod getCalMethod() {
        return calMethod;
    }

    /**
     * @param calMethod the calMethod to set
     */
    public void setCalMethod(CalcMethod calMethod) {
        this.calMethod = calMethod;
    }
    
  
}
