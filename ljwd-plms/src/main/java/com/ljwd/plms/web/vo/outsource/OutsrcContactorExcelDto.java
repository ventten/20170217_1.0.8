package com.ljwd.plms.web.vo.outsource;

/**
 * Created by zhengzw on 2017/01/14
 * 委外导出联系人通讯信息Dto,字段顺序有要求
 */
public class OutsrcContactorExcelDto {

    private String cntrctNo;                //合同编号
    private String custName;                //主贷人姓名
    private String name;                    //联系人姓名
    private String rltnshpVal;              //与主贷人关系类型值
    private String telTypeVal;              //号码类型值
    private String tel;                     //号码
    private String isActiveText;            //号码有效性显示值

    public String getCntrctNo() {
        return cntrctNo;
    }

    public void setCntrctNo(String cntrctNo) {
        this.cntrctNo = cntrctNo;
    }

    public String getCustName() {
        return custName;
    }

    public void setCustName(String custName) {
        this.custName = custName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRltnshpVal() {
        return rltnshpVal;
    }

    public void setRltnshpVal(String rltnshpVal) {
        this.rltnshpVal = rltnshpVal;
    }

    public String getTelTypeVal() {
        return telTypeVal;
    }

    public void setTelTypeVal(String telTypeVal) {
        this.telTypeVal = telTypeVal;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getIsActiveText() {
        return isActiveText;
    }

    public void setIsActiveText(String isActiveText) {
        this.isActiveText = isActiveText;
    }

}
