package com.ljwd.plms.web.model.case_management;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PlmsLTransferAdvanceAlExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PlmsLTransferAdvanceAlExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("ID is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("ID is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("ID not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andPidIsNull() {
            addCriterion("PID is null");
            return (Criteria) this;
        }

        public Criteria andPidIsNotNull() {
            addCriterion("PID is not null");
            return (Criteria) this;
        }

        public Criteria andPidEqualTo(Long value) {
            addCriterion("PID =", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidNotEqualTo(Long value) {
            addCriterion("PID <>", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidGreaterThan(Long value) {
            addCriterion("PID >", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidGreaterThanOrEqualTo(Long value) {
            addCriterion("PID >=", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidLessThan(Long value) {
            addCriterion("PID <", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidLessThanOrEqualTo(Long value) {
            addCriterion("PID <=", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidIn(List<Long> values) {
            addCriterion("PID in", values, "pid");
            return (Criteria) this;
        }

        public Criteria andPidNotIn(List<Long> values) {
            addCriterion("PID not in", values, "pid");
            return (Criteria) this;
        }

        public Criteria andPidBetween(Long value1, Long value2) {
            addCriterion("PID between", value1, value2, "pid");
            return (Criteria) this;
        }

        public Criteria andPidNotBetween(Long value1, Long value2) {
            addCriterion("PID not between", value1, value2, "pid");
            return (Criteria) this;
        }

        public Criteria andPaymentIdIsNull() {
            addCriterion("PAYMENT_ID is null");
            return (Criteria) this;
        }

        public Criteria andPaymentIdIsNotNull() {
            addCriterion("PAYMENT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andPaymentIdEqualTo(Long value) {
            addCriterion("PAYMENT_ID =", value, "paymentId");
            return (Criteria) this;
        }

        public Criteria andPaymentIdNotEqualTo(Long value) {
            addCriterion("PAYMENT_ID <>", value, "paymentId");
            return (Criteria) this;
        }

        public Criteria andPaymentIdGreaterThan(Long value) {
            addCriterion("PAYMENT_ID >", value, "paymentId");
            return (Criteria) this;
        }

        public Criteria andPaymentIdGreaterThanOrEqualTo(Long value) {
            addCriterion("PAYMENT_ID >=", value, "paymentId");
            return (Criteria) this;
        }

        public Criteria andPaymentIdLessThan(Long value) {
            addCriterion("PAYMENT_ID <", value, "paymentId");
            return (Criteria) this;
        }

        public Criteria andPaymentIdLessThanOrEqualTo(Long value) {
            addCriterion("PAYMENT_ID <=", value, "paymentId");
            return (Criteria) this;
        }

        public Criteria andPaymentIdIn(List<Long> values) {
            addCriterion("PAYMENT_ID in", values, "paymentId");
            return (Criteria) this;
        }

        public Criteria andPaymentIdNotIn(List<Long> values) {
            addCriterion("PAYMENT_ID not in", values, "paymentId");
            return (Criteria) this;
        }

        public Criteria andPaymentIdBetween(Long value1, Long value2) {
            addCriterion("PAYMENT_ID between", value1, value2, "paymentId");
            return (Criteria) this;
        }

        public Criteria andPaymentIdNotBetween(Long value1, Long value2) {
            addCriterion("PAYMENT_ID not between", value1, value2, "paymentId");
            return (Criteria) this;
        }

        public Criteria andApplIdIsNull() {
            addCriterion("APPL_ID is null");
            return (Criteria) this;
        }

        public Criteria andApplIdIsNotNull() {
            addCriterion("APPL_ID is not null");
            return (Criteria) this;
        }

        public Criteria andApplIdEqualTo(Long value) {
            addCriterion("APPL_ID =", value, "applId");
            return (Criteria) this;
        }

        public Criteria andApplIdNotEqualTo(Long value) {
            addCriterion("APPL_ID <>", value, "applId");
            return (Criteria) this;
        }

        public Criteria andApplIdGreaterThan(Long value) {
            addCriterion("APPL_ID >", value, "applId");
            return (Criteria) this;
        }

        public Criteria andApplIdGreaterThanOrEqualTo(Long value) {
            addCriterion("APPL_ID >=", value, "applId");
            return (Criteria) this;
        }

        public Criteria andApplIdLessThan(Long value) {
            addCriterion("APPL_ID <", value, "applId");
            return (Criteria) this;
        }

        public Criteria andApplIdLessThanOrEqualTo(Long value) {
            addCriterion("APPL_ID <=", value, "applId");
            return (Criteria) this;
        }

        public Criteria andApplIdIn(List<Long> values) {
            addCriterion("APPL_ID in", values, "applId");
            return (Criteria) this;
        }

        public Criteria andApplIdNotIn(List<Long> values) {
            addCriterion("APPL_ID not in", values, "applId");
            return (Criteria) this;
        }

        public Criteria andApplIdBetween(Long value1, Long value2) {
            addCriterion("APPL_ID between", value1, value2, "applId");
            return (Criteria) this;
        }

        public Criteria andApplIdNotBetween(Long value1, Long value2) {
            addCriterion("APPL_ID not between", value1, value2, "applId");
            return (Criteria) this;
        }

        public Criteria andHandlebyIsNull() {
            addCriterion("HANDLEBY is null");
            return (Criteria) this;
        }

        public Criteria andHandlebyIsNotNull() {
            addCriterion("HANDLEBY is not null");
            return (Criteria) this;
        }

        public Criteria andHandlebyEqualTo(String value) {
            addCriterion("HANDLEBY =", value, "handleby");
            return (Criteria) this;
        }

        public Criteria andHandlebyNotEqualTo(String value) {
            addCriterion("HANDLEBY <>", value, "handleby");
            return (Criteria) this;
        }

        public Criteria andHandlebyGreaterThan(String value) {
            addCriterion("HANDLEBY >", value, "handleby");
            return (Criteria) this;
        }

        public Criteria andHandlebyGreaterThanOrEqualTo(String value) {
            addCriterion("HANDLEBY >=", value, "handleby");
            return (Criteria) this;
        }

        public Criteria andHandlebyLessThan(String value) {
            addCriterion("HANDLEBY <", value, "handleby");
            return (Criteria) this;
        }

        public Criteria andHandlebyLessThanOrEqualTo(String value) {
            addCriterion("HANDLEBY <=", value, "handleby");
            return (Criteria) this;
        }

        public Criteria andHandlebyLike(String value) {
            addCriterion("HANDLEBY like", value, "handleby");
            return (Criteria) this;
        }

        public Criteria andHandlebyNotLike(String value) {
            addCriterion("HANDLEBY not like", value, "handleby");
            return (Criteria) this;
        }

        public Criteria andHandlebyIn(List<String> values) {
            addCriterion("HANDLEBY in", values, "handleby");
            return (Criteria) this;
        }

        public Criteria andHandlebyNotIn(List<String> values) {
            addCriterion("HANDLEBY not in", values, "handleby");
            return (Criteria) this;
        }

        public Criteria andHandlebyBetween(String value1, String value2) {
            addCriterion("HANDLEBY between", value1, value2, "handleby");
            return (Criteria) this;
        }

        public Criteria andHandlebyNotBetween(String value1, String value2) {
            addCriterion("HANDLEBY not between", value1, value2, "handleby");
            return (Criteria) this;
        }

        public Criteria andHandledateIsNull() {
            addCriterion("HANDLEDATE is null");
            return (Criteria) this;
        }

        public Criteria andHandledateIsNotNull() {
            addCriterion("HANDLEDATE is not null");
            return (Criteria) this;
        }

        public Criteria andHandledateEqualTo(Date value) {
            addCriterion("HANDLEDATE =", value, "handledate");
            return (Criteria) this;
        }

        public Criteria andHandledateNotEqualTo(Date value) {
            addCriterion("HANDLEDATE <>", value, "handledate");
            return (Criteria) this;
        }

        public Criteria andHandledateGreaterThan(Date value) {
            addCriterion("HANDLEDATE >", value, "handledate");
            return (Criteria) this;
        }

        public Criteria andHandledateGreaterThanOrEqualTo(Date value) {
            addCriterion("HANDLEDATE >=", value, "handledate");
            return (Criteria) this;
        }

        public Criteria andHandledateLessThan(Date value) {
            addCriterion("HANDLEDATE <", value, "handledate");
            return (Criteria) this;
        }

        public Criteria andHandledateLessThanOrEqualTo(Date value) {
            addCriterion("HANDLEDATE <=", value, "handledate");
            return (Criteria) this;
        }

        public Criteria andHandledateIn(List<Date> values) {
            addCriterion("HANDLEDATE in", values, "handledate");
            return (Criteria) this;
        }

        public Criteria andHandledateNotIn(List<Date> values) {
            addCriterion("HANDLEDATE not in", values, "handledate");
            return (Criteria) this;
        }

        public Criteria andHandledateBetween(Date value1, Date value2) {
            addCriterion("HANDLEDATE between", value1, value2, "handledate");
            return (Criteria) this;
        }

        public Criteria andHandledateNotBetween(Date value1, Date value2) {
            addCriterion("HANDLEDATE not between", value1, value2, "handledate");
            return (Criteria) this;
        }

        public Criteria andHandleresultIsNull() {
            addCriterion("HANDLERESULT is null");
            return (Criteria) this;
        }

        public Criteria andHandleresultIsNotNull() {
            addCriterion("HANDLERESULT is not null");
            return (Criteria) this;
        }

        public Criteria andHandleresultEqualTo(String value) {
            addCriterion("HANDLERESULT =", value, "handleresult");
            return (Criteria) this;
        }

        public Criteria andHandleresultNotEqualTo(String value) {
            addCriterion("HANDLERESULT <>", value, "handleresult");
            return (Criteria) this;
        }

        public Criteria andHandleresultGreaterThan(String value) {
            addCriterion("HANDLERESULT >", value, "handleresult");
            return (Criteria) this;
        }

        public Criteria andHandleresultGreaterThanOrEqualTo(String value) {
            addCriterion("HANDLERESULT >=", value, "handleresult");
            return (Criteria) this;
        }

        public Criteria andHandleresultLessThan(String value) {
            addCriterion("HANDLERESULT <", value, "handleresult");
            return (Criteria) this;
        }

        public Criteria andHandleresultLessThanOrEqualTo(String value) {
            addCriterion("HANDLERESULT <=", value, "handleresult");
            return (Criteria) this;
        }

        public Criteria andHandleresultLike(String value) {
            addCriterion("HANDLERESULT like", value, "handleresult");
            return (Criteria) this;
        }

        public Criteria andHandleresultNotLike(String value) {
            addCriterion("HANDLERESULT not like", value, "handleresult");
            return (Criteria) this;
        }

        public Criteria andHandleresultIn(List<String> values) {
            addCriterion("HANDLERESULT in", values, "handleresult");
            return (Criteria) this;
        }

        public Criteria andHandleresultNotIn(List<String> values) {
            addCriterion("HANDLERESULT not in", values, "handleresult");
            return (Criteria) this;
        }

        public Criteria andHandleresultBetween(String value1, String value2) {
            addCriterion("HANDLERESULT between", value1, value2, "handleresult");
            return (Criteria) this;
        }

        public Criteria andHandleresultNotBetween(String value1, String value2) {
            addCriterion("HANDLERESULT not between", value1, value2, "handleresult");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("STATUS is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(String value) {
            addCriterion("STATUS =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(String value) {
            addCriterion("STATUS <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(String value) {
            addCriterion("STATUS >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(String value) {
            addCriterion("STATUS >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(String value) {
            addCriterion("STATUS <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(String value) {
            addCriterion("STATUS <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLike(String value) {
            addCriterion("STATUS like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotLike(String value) {
            addCriterion("STATUS not like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<String> values) {
            addCriterion("STATUS in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<String> values) {
            addCriterion("STATUS not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(String value1, String value2) {
            addCriterion("STATUS between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(String value1, String value2) {
            addCriterion("STATUS not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("REMARK is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("REMARK is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("REMARK =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("REMARK <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("REMARK >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("REMARK >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("REMARK <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("REMARK <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("REMARK like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("REMARK not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("REMARK in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("REMARK not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("REMARK between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("REMARK not between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andIsActiveIsNull() {
            addCriterion("IS_ACTIVE is null");
            return (Criteria) this;
        }

        public Criteria andIsActiveIsNotNull() {
            addCriterion("IS_ACTIVE is not null");
            return (Criteria) this;
        }

        public Criteria andIsActiveEqualTo(String value) {
            addCriterion("IS_ACTIVE =", value, "isActive");
            return (Criteria) this;
        }

        public Criteria andIsActiveNotEqualTo(String value) {
            addCriterion("IS_ACTIVE <>", value, "isActive");
            return (Criteria) this;
        }

        public Criteria andIsActiveGreaterThan(String value) {
            addCriterion("IS_ACTIVE >", value, "isActive");
            return (Criteria) this;
        }

        public Criteria andIsActiveGreaterThanOrEqualTo(String value) {
            addCriterion("IS_ACTIVE >=", value, "isActive");
            return (Criteria) this;
        }

        public Criteria andIsActiveLessThan(String value) {
            addCriterion("IS_ACTIVE <", value, "isActive");
            return (Criteria) this;
        }

        public Criteria andIsActiveLessThanOrEqualTo(String value) {
            addCriterion("IS_ACTIVE <=", value, "isActive");
            return (Criteria) this;
        }

        public Criteria andIsActiveLike(String value) {
            addCriterion("IS_ACTIVE like", value, "isActive");
            return (Criteria) this;
        }

        public Criteria andIsActiveNotLike(String value) {
            addCriterion("IS_ACTIVE not like", value, "isActive");
            return (Criteria) this;
        }

        public Criteria andIsActiveIn(List<String> values) {
            addCriterion("IS_ACTIVE in", values, "isActive");
            return (Criteria) this;
        }

        public Criteria andIsActiveNotIn(List<String> values) {
            addCriterion("IS_ACTIVE not in", values, "isActive");
            return (Criteria) this;
        }

        public Criteria andIsActiveBetween(String value1, String value2) {
            addCriterion("IS_ACTIVE between", value1, value2, "isActive");
            return (Criteria) this;
        }

        public Criteria andIsActiveNotBetween(String value1, String value2) {
            addCriterion("IS_ACTIVE not between", value1, value2, "isActive");
            return (Criteria) this;
        }

        public Criteria andCreatedByIsNull() {
            addCriterion("CREATED_BY is null");
            return (Criteria) this;
        }

        public Criteria andCreatedByIsNotNull() {
            addCriterion("CREATED_BY is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedByEqualTo(String value) {
            addCriterion("CREATED_BY =", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByNotEqualTo(String value) {
            addCriterion("CREATED_BY <>", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByGreaterThan(String value) {
            addCriterion("CREATED_BY >", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByGreaterThanOrEqualTo(String value) {
            addCriterion("CREATED_BY >=", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByLessThan(String value) {
            addCriterion("CREATED_BY <", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByLessThanOrEqualTo(String value) {
            addCriterion("CREATED_BY <=", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByLike(String value) {
            addCriterion("CREATED_BY like", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByNotLike(String value) {
            addCriterion("CREATED_BY not like", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByIn(List<String> values) {
            addCriterion("CREATED_BY in", values, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByNotIn(List<String> values) {
            addCriterion("CREATED_BY not in", values, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByBetween(String value1, String value2) {
            addCriterion("CREATED_BY between", value1, value2, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByNotBetween(String value1, String value2) {
            addCriterion("CREATED_BY not between", value1, value2, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("CREATE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("CREATE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("CREATE_TIME =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("CREATE_TIME <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("CREATE_TIME >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CREATE_TIME >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("CREATE_TIME <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("CREATE_TIME <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("CREATE_TIME in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("CREATE_TIME not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("CREATE_TIME between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("CREATE_TIME not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andUpdatedByIsNull() {
            addCriterion("UPDATED_BY is null");
            return (Criteria) this;
        }

        public Criteria andUpdatedByIsNotNull() {
            addCriterion("UPDATED_BY is not null");
            return (Criteria) this;
        }

        public Criteria andUpdatedByEqualTo(String value) {
            addCriterion("UPDATED_BY =", value, "updatedBy");
            return (Criteria) this;
        }

        public Criteria andUpdatedByNotEqualTo(String value) {
            addCriterion("UPDATED_BY <>", value, "updatedBy");
            return (Criteria) this;
        }

        public Criteria andUpdatedByGreaterThan(String value) {
            addCriterion("UPDATED_BY >", value, "updatedBy");
            return (Criteria) this;
        }

        public Criteria andUpdatedByGreaterThanOrEqualTo(String value) {
            addCriterion("UPDATED_BY >=", value, "updatedBy");
            return (Criteria) this;
        }

        public Criteria andUpdatedByLessThan(String value) {
            addCriterion("UPDATED_BY <", value, "updatedBy");
            return (Criteria) this;
        }

        public Criteria andUpdatedByLessThanOrEqualTo(String value) {
            addCriterion("UPDATED_BY <=", value, "updatedBy");
            return (Criteria) this;
        }

        public Criteria andUpdatedByLike(String value) {
            addCriterion("UPDATED_BY like", value, "updatedBy");
            return (Criteria) this;
        }

        public Criteria andUpdatedByNotLike(String value) {
            addCriterion("UPDATED_BY not like", value, "updatedBy");
            return (Criteria) this;
        }

        public Criteria andUpdatedByIn(List<String> values) {
            addCriterion("UPDATED_BY in", values, "updatedBy");
            return (Criteria) this;
        }

        public Criteria andUpdatedByNotIn(List<String> values) {
            addCriterion("UPDATED_BY not in", values, "updatedBy");
            return (Criteria) this;
        }

        public Criteria andUpdatedByBetween(String value1, String value2) {
            addCriterion("UPDATED_BY between", value1, value2, "updatedBy");
            return (Criteria) this;
        }

        public Criteria andUpdatedByNotBetween(String value1, String value2) {
            addCriterion("UPDATED_BY not between", value1, value2, "updatedBy");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("UPDATE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("UPDATE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("UPDATE_TIME =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("UPDATE_TIME <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("UPDATE_TIME >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("UPDATE_TIME >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("UPDATE_TIME <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("UPDATE_TIME <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("UPDATE_TIME in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("UPDATE_TIME not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("UPDATE_TIME between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("UPDATE_TIME not between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andRecVerIsNull() {
            addCriterion("REC_VER is null");
            return (Criteria) this;
        }

        public Criteria andRecVerIsNotNull() {
            addCriterion("REC_VER is not null");
            return (Criteria) this;
        }

        public Criteria andRecVerEqualTo(Long value) {
            addCriterion("REC_VER =", value, "recVer");
            return (Criteria) this;
        }

        public Criteria andRecVerNotEqualTo(Long value) {
            addCriterion("REC_VER <>", value, "recVer");
            return (Criteria) this;
        }

        public Criteria andRecVerGreaterThan(Long value) {
            addCriterion("REC_VER >", value, "recVer");
            return (Criteria) this;
        }

        public Criteria andRecVerGreaterThanOrEqualTo(Long value) {
            addCriterion("REC_VER >=", value, "recVer");
            return (Criteria) this;
        }

        public Criteria andRecVerLessThan(Long value) {
            addCriterion("REC_VER <", value, "recVer");
            return (Criteria) this;
        }

        public Criteria andRecVerLessThanOrEqualTo(Long value) {
            addCriterion("REC_VER <=", value, "recVer");
            return (Criteria) this;
        }

        public Criteria andRecVerIn(List<Long> values) {
            addCriterion("REC_VER in", values, "recVer");
            return (Criteria) this;
        }

        public Criteria andRecVerNotIn(List<Long> values) {
            addCriterion("REC_VER not in", values, "recVer");
            return (Criteria) this;
        }

        public Criteria andRecVerBetween(Long value1, Long value2) {
            addCriterion("REC_VER between", value1, value2, "recVer");
            return (Criteria) this;
        }

        public Criteria andRecVerNotBetween(Long value1, Long value2) {
            addCriterion("REC_VER not between", value1, value2, "recVer");
            return (Criteria) this;
        }

        public Criteria andTagSeqIsNull() {
            addCriterion("TAG_SEQ is null");
            return (Criteria) this;
        }

        public Criteria andTagSeqIsNotNull() {
            addCriterion("TAG_SEQ is not null");
            return (Criteria) this;
        }

        public Criteria andTagSeqEqualTo(Long value) {
            addCriterion("TAG_SEQ =", value, "tagSeq");
            return (Criteria) this;
        }

        public Criteria andTagSeqNotEqualTo(Long value) {
            addCriterion("TAG_SEQ <>", value, "tagSeq");
            return (Criteria) this;
        }

        public Criteria andTagSeqGreaterThan(Long value) {
            addCriterion("TAG_SEQ >", value, "tagSeq");
            return (Criteria) this;
        }

        public Criteria andTagSeqGreaterThanOrEqualTo(Long value) {
            addCriterion("TAG_SEQ >=", value, "tagSeq");
            return (Criteria) this;
        }

        public Criteria andTagSeqLessThan(Long value) {
            addCriterion("TAG_SEQ <", value, "tagSeq");
            return (Criteria) this;
        }

        public Criteria andTagSeqLessThanOrEqualTo(Long value) {
            addCriterion("TAG_SEQ <=", value, "tagSeq");
            return (Criteria) this;
        }

        public Criteria andTagSeqIn(List<Long> values) {
            addCriterion("TAG_SEQ in", values, "tagSeq");
            return (Criteria) this;
        }

        public Criteria andTagSeqNotIn(List<Long> values) {
            addCriterion("TAG_SEQ not in", values, "tagSeq");
            return (Criteria) this;
        }

        public Criteria andTagSeqBetween(Long value1, Long value2) {
            addCriterion("TAG_SEQ between", value1, value2, "tagSeq");
            return (Criteria) this;
        }

        public Criteria andTagSeqNotBetween(Long value1, Long value2) {
            addCriterion("TAG_SEQ not between", value1, value2, "tagSeq");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}