package com.ljwd.plms.web.vo.outsource;

/**
 * Created by zhengzw on 2017/01/14
 * 委外导出联系人地址信息Dto,字段顺序有要求
 */
public class OutsrcAddressExcelDto {

    private String cntrctNo;                //合同编号
    private String custName;                //姓名
    private String name;                    //联系人姓名
    private String rltnshpVal;              //与主贷人关系类型值
    private String addrTypeVal;             //地址类型值
    private String addr;                    //由省市区详细地址拼接的总地址
    private String isActiveText;            //地址有效性显示值

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

    public String getAddrTypeVal() {
        return addrTypeVal;
    }

    public void setAddrTypeVal(String addrTypeVal) {
        this.addrTypeVal = addrTypeVal;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    public String getIsActiveText() {
        return isActiveText;
    }

    public void setIsActiveText(String isActiveText) {
        this.isActiveText = isActiveText;
    }

}
