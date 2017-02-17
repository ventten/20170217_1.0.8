package com.ljwd.plms.web.model.cust;

import java.io.Serializable;

/**
 * 行政区域实体 SYS_ADMINISTRATIVE_REGION
 * @author zhengjizhao
 */
public class SysAdministrativeRegion implements Serializable{
	private static final long serialVersionUID = 1L;

	private Long id;			     //记录ID
	private Long pid; 				 //上级区域ID
	private String rcode; 		     //区域code
	private String rname; 			 //区域名称
	private String rlevel; 			 //行政区域层级(1：省、2：市、3：区/县)

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getPid() {
		return pid;
	}

	public void setPid(Long pid) {
		this.pid = pid;
	}

	public String getRcode() {
		return rcode;
	}

	public void setRcode(String rcode) {
		this.rcode = rcode;
	}

	public String getRname() {
		return rname;
	}

	public void setRname(String rname) {
		this.rname = rname;
	}

	public String getRlevel() {
		return rlevel;
	}

	public void setRlevel(String rlevel) {
		this.rlevel = rlevel;
	}

}
