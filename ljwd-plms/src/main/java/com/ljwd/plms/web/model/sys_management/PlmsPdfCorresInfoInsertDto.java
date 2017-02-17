package com.ljwd.plms.web.model.sys_management;

import com.ljwd.plms.web.model.BaseModel;

/**
 * 
 * ClassName: PlmsPdfCorresInfoInsertDto 
 * @Description: 信函模板中 插入模板信息或者更新模板信息的实体  PLMS_LN_DOC_MANAGE
 * @author zhengjizhao
 * @date 2016年12月1日上午10:22:26
 */
public class PlmsPdfCorresInfoInsertDto  extends BaseModel{
	private Long id;//主键ID
	private String documentCode;//模板编码
    private String documentName;//模板名称 （信函类别）
    private String dataSource; //数据源
    private Integer businessModel; //业务模式
    private Integer contractWay; //签约方式
    private String filePath; //文件存放路径
	public Long getId() {
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
    
}
