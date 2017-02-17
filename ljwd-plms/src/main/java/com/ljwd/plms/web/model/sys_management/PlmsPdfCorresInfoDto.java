package com.ljwd.plms.web.model.sys_management;

import java.util.Date;

import com.ljwd.plms.web.vo.PageRowNo;

/**
 * 
 * ClassName: PlmsPdfCorresInfoDto 
 * @Description: 查询信函模板信息表实体  PLMS_LN_DOC_MANAGE
 * @author zhengjizhao
 * @date 2016年11月1日下午3:48:58
 */
public class PlmsPdfCorresInfoDto extends PageRowNo {

	private Long id;//主键ID
	private String documentCode;//模板编码
    private String documentName;//模板名称 （信函类别）
    private String dataSource; //数据源
    private Integer businessModel; //业务模式
    private Integer contractWay; //签约方式
    private String filePath; //文件存放路径
	/*private String createBy; //新增人
	private Date createTime; //新增时间
    private String upDateby; //修改人
    private Date upDateTime; //修改时间
    private Integer recVer; //版本
    private Integer tegSeq; //tag
*/	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getDocumentCode() {
		return documentCode;
	}
	public void setDocumentCode(String documentCode) {
		this.documentCode = documentCode;
	}
	public String getDocumentName() {
		return documentName;
	}
	public void setDocumentName(String documentName) {
		this.documentName = documentName;
	}
	public String getDataSource() {
		return dataSource;
	}
	public void setDataSource(String dataSource) {
		this.dataSource = dataSource;
	}
	public Integer getBusinessModel() {
		return businessModel;
	}
	public void setBusinessModel(Integer businessModel) {
		this.businessModel = businessModel;
	}
	public Integer getContractWay() {
		return contractWay;
	}
	public void setContractWay(Integer contractWay) {
		this.contractWay = contractWay;
	}
	public String getFilePath() {
		return filePath;
	}
	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}
	/*public String getCreateBy() {
		return createBy;
	}
	public void setCreateBy(String createBy) {
		this.createBy = createBy;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	public String getUpDateby() {
		return upDateby;
	}
	public void setUpDateby(String upDateby) {
		this.upDateby = upDateby;
	}
	public Date getUpDateTime() {
		return upDateTime;
	}
	public void setUpDateTime(Date upDateTime) {
		this.upDateTime = upDateTime;
	}
	public Integer getRecVer() {
		return recVer;
	}
	public void setRecVer(Integer recVer) {
		this.recVer = recVer;
	}
	public Integer getTegSeq() {
		return tegSeq;
	}
	public void setTegSeq(Integer tegSeq) {
		this.tegSeq = tegSeq;
	}*/
    
	
    
}
