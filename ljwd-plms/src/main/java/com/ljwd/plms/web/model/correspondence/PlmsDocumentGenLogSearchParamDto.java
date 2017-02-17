package com.ljwd.plms.web.model.correspondence;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import com.ljwd.plms.web.model.BaseExample;
import com.ljwd.plms.web.vo.DataTableParam;

/**
 * 查询崔信记录列表数据的条件实体
 * @author zhengjizhao
 *
 */
public class PlmsDocumentGenLogSearchParamDto extends BaseExample{

	private String contractNo; 		//合同编号
    private String loanName; 		//客户名称
    private String idCardNo; 		//证件号码
    private Date genDateFrom;  		//生成日期开始
    private Date genDateTo;   		//生成日期结束
    private String docCode;  		//文档名称（code） 信函类别
    private Integer coStatus;  		//信函状态
    private Long id; 				//信函ID
    private String genBy;			//生成人code
    private String genByName;		//生成人姓名
    private String corresCode;		//信函编码
    private Long applId;             //贷款ID
    
    private static Map<String,String> sortMap = new HashMap<String,String>();
    static {
        sortMap.put("corresCode","GENLOG.CORRES_CODE ");
        sortMap.put("documentName","GENLOG.DOC_NAME ");
        sortMap.put("clientName","GENLOG.CLIENT_NAME ");
        sortMap.put("clientName","GENLOG.CLIENT_NAME ");
        sortMap.put("contractNo","CONTRACT.CNTRCT_NO ");
        sortMap.put("idCardNo","GENLOG.CLIENT_ID_CARD ");
        sortMap.put("parameter","GENLOG.PARAM ");
        sortMap.put("genTime","GENLOG.GEN_TIME ");
        sortMap.put("genByName","SYSUSER.USER_NAME ");
    }

    public void setOrderByClause(DataTableParam param){
        super.setOrderByClause(param,sortMap);
    }
	public Long getApplId() {
		return applId;
	}
	public void setApplId(Long applId) {
		this.applId = applId;
	}
	public String getGenByName() {
		return genByName;
	}
	public void setGenByName(String genByName) {
		this.genByName = genByName;
	}
	public String getContractNo() {
		return contractNo;
	}
	public void setContractNo(String contractNo) {
		this.contractNo = contractNo;
	}
	public String getLoanName() {
		return loanName;
	}
	public void setLoanName(String loanName) {
		this.loanName = loanName;
	}
	public String getIdCardNo() {
		return idCardNo;
	}
	public void setIdCardNo(String idCardNo) {
		this.idCardNo = idCardNo;
	}
	public Date getGenDateFrom() {
		return genDateFrom;
	}
	public void setGenDateFrom(Date genDateFrom) {
		this.genDateFrom = genDateFrom;
	}
	public Date getGenDateTo() {
		return genDateTo;
	}
	public void setGenDateTo(Date genDateTo) {
		this.genDateTo = genDateTo;
	}
	public String getDocCode() {
		return docCode;
	}
	public void setDocCode(String docCode) {
		this.docCode = docCode;
	}
	public Integer getCoStatus() {
		return coStatus;
	}
	public void setCoStatus(Integer coStatus) {
		this.coStatus = coStatus;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getGenBy() {
		return genBy;
	}
	public void setGenBy(String genBy) {
		this.genBy = genBy;
	}
	public String getCorresCode() {
		return corresCode;
	}
	public void setCorresCode(String corresCode) {
		this.corresCode = corresCode;
	}
    
}
