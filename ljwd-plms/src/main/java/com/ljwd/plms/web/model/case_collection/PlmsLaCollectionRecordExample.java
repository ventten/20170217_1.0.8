package com.ljwd.plms.web.model.case_collection;

import com.ljwd.plms.core.util.StringUtil;
import com.ljwd.plms.web.model.BaseExample;
import com.ljwd.plms.web.vo.DataTableParam;

import java.math.BigDecimal;
import java.util.*;

/**
 * 催收记录表,PLMS_LA_COLLECTION_RECORD
 * */
public class PlmsLaCollectionRecordExample extends BaseExample{

    private Long id;                        //记录ID
    private Long applId;                    //借款申请id
    private Long recVer;                    //版本号
    private String controlStatusIn;         //控管状态
    private Date rpmntDateMin;              //承诺还款时间-左
    private Date rpmntDateMax;              //承诺还款时间-右
    private Long noThisId;                  //排除此ID

    //瀑布流分页
    private Integer pageSize;               //每页记录数
    private Integer pageNo;                 //页数
    private String sortCol;                 //排序列
    private String sortDir;                 //排序形式 Asc/Desc
    
    //计算绩效时，查找外访员有效的催记
    private List<String>  collectMthd;			//催收类型
    private String 	followedBy;				//跟进人
    private Date startTime;			//创建时间
    private Date endTime;			//创建时间

    
    private static Map<String,String> sortMap = new HashMap<String,String>();
    static {
        sortMap.put("collectTime","T.COLLECT_TIME ");
        sortMap.put("content","nlssort(T.CONTENT,'NLS_SORT=SCHINESE_PINYIN_M') ");
        sortMap.put("contactor","nlssort(T.CONTACTOR,'NLS_SORT=SCHINESE_PINYIN_M') ");
        sortMap.put("rltnText","nlssort(RLTNSHP.VAL,'NLS_SORT=SCHINESE_PINYIN_M') ");
        sortMap.put("tel","T.TEL ");
        sortMap.put("collectMthdText","nlssort(T.collectMthdText,'NLS_SORT=SCHINESE_PINYIN_M') ");
        sortMap.put("followedBy","nlssort(T.FOLLOWED_BY,'NLS_SORT=SCHINESE_PINYIN_M') ");
        sortMap.put("statusText","nlssort(T.statusText,'NLS_SORT=SCHINESE_PINYIN_M') ");
        sortMap.put("resultText","nlssort(T.resultText,'NLS_SORT=SCHINESE_PINYIN_M') ");
        sortMap.put("controlStatusText","nlssort(T.controlStatusText,'NLS_SORT=SCHINESE_PINYIN_M') ");
        sortMap.put("rpmntAmt","T.RPMNT_AMT ");
        sortMap.put("rpmntDateFmt","T.RPMNT_DATE ");
        sortMap.put("abnormityCodeText","nlssort(T.abnormityCodeText,'NLS_SORT=SCHINESE_PINYIN_M') ");
    }

    public void setOrderByClause(){
        String sortCol = sortMap.get(this.sortCol);
        if(!StringUtil.isEmpty(sortCol)){
            super.setOrderByClause(sortCol + (sortDir == null ? "" : sortDir));
        }else {
            super.setOrderByClause("T.CREATE_TIME DESC");
        }
    }

    public Long getNoThisId() {
        return noThisId;
    }

    public PlmsLaCollectionRecordExample setNoThisId(Long noThisId) {
        this.noThisId = noThisId;
        return this;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getApplId() {
        return applId;
    }

    public PlmsLaCollectionRecordExample setApplId(Long applId) {
        this.applId = applId;
        return this;
    }

    public Long getRecVer() {
        return recVer;
    }

    public PlmsLaCollectionRecordExample setRecVer(Long recVer) {
        this.recVer = recVer;
        return this;
    }

    public String getControlStatusIn() {
        return controlStatusIn;
    }

    public PlmsLaCollectionRecordExample setControlStatusIn(String controlStatusIn) {
        this.controlStatusIn = controlStatusIn;
        return this;
    }

    public Date getRpmntDateMin() {
        return rpmntDateMin;
    }

    public PlmsLaCollectionRecordExample setRpmntDateMin(Date rpmntDateMin) {
        this.rpmntDateMin = rpmntDateMin;
        return this;
    }

    public Date getRpmntDateMax() {
        return rpmntDateMax;
    }

    public PlmsLaCollectionRecordExample setRpmntDateMax(Date rpmntDateMax) {
        this.rpmntDateMax = rpmntDateMax;
        return this;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public Integer getPageNo() {
        return pageNo;
    }

    public void setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
    }

    public String getSortCol() {
        return sortCol;
    }

    public void setSortCol(String sortCol) {
        this.sortCol = sortCol;
    }

    public String getSortDir() {
        return sortDir;
    }

    public void setSortDir(String sortDir) {
        this.sortDir = sortDir;
    }

	
	public List<String> getCollectMthd() {
		return collectMthd;
	}

	public void setCollectMthd(List<String> collectMthd) {
		this.collectMthd = collectMthd;
	}

	public String getFollowedBy() {
		return followedBy;
	}

	public void setFollowedBy(String followedBy) {
		this.followedBy = followedBy;
	}

	public Date getStartTime() {
		return startTime;
	}

	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

	public Date getEndTime() {
		return endTime;
	}

	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}

	
	

    
}