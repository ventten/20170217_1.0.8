package com.ljwd.plms.web.model.cust;

import com.ljwd.plms.web.model.ActiveModel;

/**
 * 客户地址信息,plms_cl_address_info
 * */
public class PlmsClAddressInfo extends ActiveModel{

    private Long id;                //记录id
    private Long clCustId;          //客户基本信息表ID
    private String srcCode;         //来源：微贷、聚信立、网络、外部机构、客户来电
    private Long applId;            //贷款申请ID
    private String rltnshp;         //与主贷人关系:配偶、朋友、公司、同事、亲戚
    private String name;            //联系人姓名
    private String addrType;        //地址类型：公司、住宅（即现居住地）、户籍、其他
    private String addr;            //由省市区详细地址拼接的总地址
    private Long addrProvinceId;    //地址所在省ID
    private Long addrCityId;        //地址所在市ID
    private Long addrAreaId;        //地址所在区域ID
    private String addrDetails;     //详细地址


    /** 扩展字段 **/
    //text-ext
    private Long rowNo;             //分页行数

    //join-ext
    private String srcVal;          //来源类型值
    private String rltnshpVal;      //关系类型值
    private String addrTypeVal;     //地址类型值

    //mfbms-ext
    private String docno;           //身份证号

    /**
     * 跑批导入判断数据是否重复
     * @return String
     */
    public String getCheck(){
        String nameStr = name == null ? "null" : name;
        String addrStr = addr == null ? "null" : addr;
        String addrTypeStr = addrType == null ? "null" : addrType;
        return "{name:" + nameStr + ",addr:" + addrStr + ",addrType:" + addrTypeStr + "}";
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getClCustId() {
        return clCustId;
    }

    public void setClCustId(Long clCustId) {
        this.clCustId = clCustId;
    }

    public String getSrcCode() {
        return srcCode;
    }

    public void setSrcCode(String srcCode) {
        this.srcCode = srcCode == null ? null : srcCode.trim();
    }

    public Long getApplId() {
        return applId;
    }

    public void setApplId(Long applId) {
        this.applId = applId;
    }

    public String getRltnshp() {
        return rltnshp;
    }

    public void setRltnshp(String rltnshp) {
        this.rltnshp = rltnshp == null ? null : rltnshp.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getAddrType() {
        return addrType;
    }

    public void setAddrType(String addrType) {
        this.addrType = addrType == null ? null : addrType.trim();
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr == null ? null : addr.trim();
    }

    public String getSrcVal() {
        return srcVal;
    }

    public void setSrcVal(String srcVal) {
        this.srcVal = srcVal;
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

    public String getDocno() {
        return docno;
    }

    public void setDocno(String docno) {
        this.docno = docno;
    }

    public Long getAddrProvinceId() {
        return addrProvinceId;
    }

    public void setAddrProvinceId(Long addrProvinceId) {
        this.addrProvinceId = addrProvinceId;
    }

    public Long getAddrCityId() {
        return addrCityId;
    }

    public void setAddrCityId(Long addrCityId) {
        this.addrCityId = addrCityId;
    }

    public Long getAddrAreaId() {
        return addrAreaId;
    }

    public void setAddrAreaId(Long addrAreaId) {
        this.addrAreaId = addrAreaId;
    }

    public String getAddrDetails() {
        return addrDetails;
    }

    public void setAddrDetails(String addrDetails) {
        this.addrDetails = addrDetails;
    }

	public Long getRowNo() {
		return rowNo;
	}

	public void setRowNo(Long rowNo) {
		this.rowNo = rowNo;
	}
    
}