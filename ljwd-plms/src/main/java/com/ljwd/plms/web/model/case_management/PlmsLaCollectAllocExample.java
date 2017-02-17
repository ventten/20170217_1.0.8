package com.ljwd.plms.web.model.case_management;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PlmsLaCollectAllocExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PlmsLaCollectAllocExample() {
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

        public Criteria andOverdueDaysIsNull() {
            addCriterion("OVERDUE_DAYS is null");
            return (Criteria) this;
        }

        public Criteria andOverdueDaysIsNotNull() {
            addCriterion("OVERDUE_DAYS is not null");
            return (Criteria) this;
        }

        public Criteria andOverdueDaysEqualTo(Long value) {
            addCriterion("OVERDUE_DAYS =", value, "overdueDays");
            return (Criteria) this;
        }

        public Criteria andOverdueDaysNotEqualTo(Long value) {
            addCriterion("OVERDUE_DAYS <>", value, "overdueDays");
            return (Criteria) this;
        }

        public Criteria andOverdueDaysGreaterThan(Long value) {
            addCriterion("OVERDUE_DAYS >", value, "overdueDays");
            return (Criteria) this;
        }

        public Criteria andOverdueDaysGreaterThanOrEqualTo(Long value) {
            addCriterion("OVERDUE_DAYS >=", value, "overdueDays");
            return (Criteria) this;
        }

        public Criteria andOverdueDaysLessThan(Long value) {
            addCriterion("OVERDUE_DAYS <", value, "overdueDays");
            return (Criteria) this;
        }

        public Criteria andOverdueDaysLessThanOrEqualTo(Long value) {
            addCriterion("OVERDUE_DAYS <=", value, "overdueDays");
            return (Criteria) this;
        }

        public Criteria andOverdueDaysIn(List<Long> values) {
            addCriterion("OVERDUE_DAYS in", values, "overdueDays");
            return (Criteria) this;
        }

        public Criteria andOverdueDaysNotIn(List<Long> values) {
            addCriterion("OVERDUE_DAYS not in", values, "overdueDays");
            return (Criteria) this;
        }

        public Criteria andOverdueDaysBetween(Long value1, Long value2) {
            addCriterion("OVERDUE_DAYS between", value1, value2, "overdueDays");
            return (Criteria) this;
        }

        public Criteria andOverdueDaysNotBetween(Long value1, Long value2) {
            addCriterion("OVERDUE_DAYS not between", value1, value2, "overdueDays");
            return (Criteria) this;
        }

        public Criteria andRemainingPrincipalIsNull() {
            addCriterion("REMAINING_PRINCIPAL is null");
            return (Criteria) this;
        }

        public Criteria andRemainingPrincipalIsNotNull() {
            addCriterion("REMAINING_PRINCIPAL is not null");
            return (Criteria) this;
        }

        public Criteria andRemainingPrincipalEqualTo(BigDecimal value) {
            addCriterion("REMAINING_PRINCIPAL =", value, "remainingPrincipal");
            return (Criteria) this;
        }

        public Criteria andRemainingPrincipalNotEqualTo(BigDecimal value) {
            addCriterion("REMAINING_PRINCIPAL <>", value, "remainingPrincipal");
            return (Criteria) this;
        }

        public Criteria andRemainingPrincipalGreaterThan(BigDecimal value) {
            addCriterion("REMAINING_PRINCIPAL >", value, "remainingPrincipal");
            return (Criteria) this;
        }

        public Criteria andRemainingPrincipalGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("REMAINING_PRINCIPAL >=", value, "remainingPrincipal");
            return (Criteria) this;
        }

        public Criteria andRemainingPrincipalLessThan(BigDecimal value) {
            addCriterion("REMAINING_PRINCIPAL <", value, "remainingPrincipal");
            return (Criteria) this;
        }

        public Criteria andRemainingPrincipalLessThanOrEqualTo(BigDecimal value) {
            addCriterion("REMAINING_PRINCIPAL <=", value, "remainingPrincipal");
            return (Criteria) this;
        }

        public Criteria andRemainingPrincipalIn(List<BigDecimal> values) {
            addCriterion("REMAINING_PRINCIPAL in", values, "remainingPrincipal");
            return (Criteria) this;
        }

        public Criteria andRemainingPrincipalNotIn(List<BigDecimal> values) {
            addCriterion("REMAINING_PRINCIPAL not in", values, "remainingPrincipal");
            return (Criteria) this;
        }

        public Criteria andRemainingPrincipalBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("REMAINING_PRINCIPAL between", value1, value2, "remainingPrincipal");
            return (Criteria) this;
        }

        public Criteria andRemainingPrincipalNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("REMAINING_PRINCIPAL not between", value1, value2, "remainingPrincipal");
            return (Criteria) this;
        }

        public Criteria andCollectorIsNull() {
            addCriterion("COLLECTOR is null");
            return (Criteria) this;
        }

        public Criteria andCollectorIsNotNull() {
            addCriterion("COLLECTOR is not null");
            return (Criteria) this;
        }

        public Criteria andCollectorEqualTo(String value) {
            addCriterion("COLLECTOR =", value, "collector");
            return (Criteria) this;
        }

        public Criteria andCollectorNotEqualTo(String value) {
            addCriterion("COLLECTOR <>", value, "collector");
            return (Criteria) this;
        }

        public Criteria andCollectorGreaterThan(String value) {
            addCriterion("COLLECTOR >", value, "collector");
            return (Criteria) this;
        }

        public Criteria andCollectorGreaterThanOrEqualTo(String value) {
            addCriterion("COLLECTOR >=", value, "collector");
            return (Criteria) this;
        }

        public Criteria andCollectorLessThan(String value) {
            addCriterion("COLLECTOR <", value, "collector");
            return (Criteria) this;
        }

        public Criteria andCollectorLessThanOrEqualTo(String value) {
            addCriterion("COLLECTOR <=", value, "collector");
            return (Criteria) this;
        }

        public Criteria andCollectorLike(String value) {
            addCriterion("COLLECTOR like", value, "collector");
            return (Criteria) this;
        }

        public Criteria andCollectorNotLike(String value) {
            addCriterion("COLLECTOR not like", value, "collector");
            return (Criteria) this;
        }

        public Criteria andCollectorIn(List<String> values) {
            addCriterion("COLLECTOR in", values, "collector");
            return (Criteria) this;
        }

        public Criteria andCollectorNotIn(List<String> values) {
            addCriterion("COLLECTOR not in", values, "collector");
            return (Criteria) this;
        }

        public Criteria andCollectorBetween(String value1, String value2) {
            addCriterion("COLLECTOR between", value1, value2, "collector");
            return (Criteria) this;
        }

        public Criteria andCollectorNotBetween(String value1, String value2) {
            addCriterion("COLLECTOR not between", value1, value2, "collector");
            return (Criteria) this;
        }

        public Criteria andAssignTimeIsNull() {
            addCriterion("ASSIGN_TIME is null");
            return (Criteria) this;
        }

        public Criteria andAssignTimeIsNotNull() {
            addCriterion("ASSIGN_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andAssignTimeEqualTo(Date value) {
            addCriterion("ASSIGN_TIME =", value, "assignTime");
            return (Criteria) this;
        }

        public Criteria andAssignTimeNotEqualTo(Date value) {
            addCriterion("ASSIGN_TIME <>", value, "assignTime");
            return (Criteria) this;
        }

        public Criteria andAssignTimeGreaterThan(Date value) {
            addCriterion("ASSIGN_TIME >", value, "assignTime");
            return (Criteria) this;
        }

        public Criteria andAssignTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("ASSIGN_TIME >=", value, "assignTime");
            return (Criteria) this;
        }

        public Criteria andAssignTimeLessThan(Date value) {
            addCriterion("ASSIGN_TIME <", value, "assignTime");
            return (Criteria) this;
        }

        public Criteria andAssignTimeLessThanOrEqualTo(Date value) {
            addCriterion("ASSIGN_TIME <=", value, "assignTime");
            return (Criteria) this;
        }

        public Criteria andAssignTimeIn(List<Date> values) {
            addCriterion("ASSIGN_TIME in", values, "assignTime");
            return (Criteria) this;
        }

        public Criteria andAssignTimeNotIn(List<Date> values) {
            addCriterion("ASSIGN_TIME not in", values, "assignTime");
            return (Criteria) this;
        }

        public Criteria andAssignTimeBetween(Date value1, Date value2) {
            addCriterion("ASSIGN_TIME between", value1, value2, "assignTime");
            return (Criteria) this;
        }

        public Criteria andAssignTimeNotBetween(Date value1, Date value2) {
            addCriterion("ASSIGN_TIME not between", value1, value2, "assignTime");
            return (Criteria) this;
        }

        public Criteria andAllocBeginDateIsNull() {
            addCriterion("ALLOC_BEGIN_DATE is null");
            return (Criteria) this;
        }

        public Criteria andAllocBeginDateIsNotNull() {
            addCriterion("ALLOC_BEGIN_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andAllocBeginDateEqualTo(Date value) {
            addCriterion("ALLOC_BEGIN_DATE =", value, "allocBeginDate");
            return (Criteria) this;
        }

        public Criteria andAllocBeginDateNotEqualTo(Date value) {
            addCriterion("ALLOC_BEGIN_DATE <>", value, "allocBeginDate");
            return (Criteria) this;
        }

        public Criteria andAllocBeginDateGreaterThan(Date value) {
            addCriterion("ALLOC_BEGIN_DATE >", value, "allocBeginDate");
            return (Criteria) this;
        }

        public Criteria andAllocBeginDateGreaterThanOrEqualTo(Date value) {
            addCriterion("ALLOC_BEGIN_DATE >=", value, "allocBeginDate");
            return (Criteria) this;
        }

        public Criteria andAllocBeginDateLessThan(Date value) {
            addCriterion("ALLOC_BEGIN_DATE <", value, "allocBeginDate");
            return (Criteria) this;
        }

        public Criteria andAllocBeginDateLessThanOrEqualTo(Date value) {
            addCriterion("ALLOC_BEGIN_DATE <=", value, "allocBeginDate");
            return (Criteria) this;
        }

        public Criteria andAllocBeginDateIn(List<Date> values) {
            addCriterion("ALLOC_BEGIN_DATE in", values, "allocBeginDate");
            return (Criteria) this;
        }

        public Criteria andAllocBeginDateNotIn(List<Date> values) {
            addCriterion("ALLOC_BEGIN_DATE not in", values, "allocBeginDate");
            return (Criteria) this;
        }

        public Criteria andAllocBeginDateBetween(Date value1, Date value2) {
            addCriterion("ALLOC_BEGIN_DATE between", value1, value2, "allocBeginDate");
            return (Criteria) this;
        }

        public Criteria andAllocBeginDateNotBetween(Date value1, Date value2) {
            addCriterion("ALLOC_BEGIN_DATE not between", value1, value2, "allocBeginDate");
            return (Criteria) this;
        }

        public Criteria andAllocEndDateIsNull() {
            addCriterion("ALLOC_END_DATE is null");
            return (Criteria) this;
        }

        public Criteria andAllocEndDateIsNotNull() {
            addCriterion("ALLOC_END_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andAllocEndDateEqualTo(Date value) {
            addCriterion("ALLOC_END_DATE =", value, "allocEndDate");
            return (Criteria) this;
        }

        public Criteria andAllocEndDateNotEqualTo(Date value) {
            addCriterion("ALLOC_END_DATE <>", value, "allocEndDate");
            return (Criteria) this;
        }

        public Criteria andAllocEndDateGreaterThan(Date value) {
            addCriterion("ALLOC_END_DATE >", value, "allocEndDate");
            return (Criteria) this;
        }

        public Criteria andAllocEndDateGreaterThanOrEqualTo(Date value) {
            addCriterion("ALLOC_END_DATE >=", value, "allocEndDate");
            return (Criteria) this;
        }

        public Criteria andAllocEndDateLessThan(Date value) {
            addCriterion("ALLOC_END_DATE <", value, "allocEndDate");
            return (Criteria) this;
        }

        public Criteria andAllocEndDateLessThanOrEqualTo(Date value) {
            addCriterion("ALLOC_END_DATE <=", value, "allocEndDate");
            return (Criteria) this;
        }

        public Criteria andAllocEndDateIn(List<Date> values) {
            addCriterion("ALLOC_END_DATE in", values, "allocEndDate");
            return (Criteria) this;
        }

        public Criteria andAllocEndDateNotIn(List<Date> values) {
            addCriterion("ALLOC_END_DATE not in", values, "allocEndDate");
            return (Criteria) this;
        }

        public Criteria andAllocEndDateBetween(Date value1, Date value2) {
            addCriterion("ALLOC_END_DATE between", value1, value2, "allocEndDate");
            return (Criteria) this;
        }

        public Criteria andAllocEndDateNotBetween(Date value1, Date value2) {
            addCriterion("ALLOC_END_DATE not between", value1, value2, "allocEndDate");
            return (Criteria) this;
        }

        public Criteria andAllocTypeIsNull() {
            addCriterion("ALLOC_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andAllocTypeIsNotNull() {
            addCriterion("ALLOC_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andAllocTypeEqualTo(String value) {
            addCriterion("ALLOC_TYPE =", value, "allocType");
            return (Criteria) this;
        }

        public Criteria andAllocTypeNotEqualTo(String value) {
            addCriterion("ALLOC_TYPE <>", value, "allocType");
            return (Criteria) this;
        }

        public Criteria andAllocTypeGreaterThan(String value) {
            addCriterion("ALLOC_TYPE >", value, "allocType");
            return (Criteria) this;
        }

        public Criteria andAllocTypeGreaterThanOrEqualTo(String value) {
            addCriterion("ALLOC_TYPE >=", value, "allocType");
            return (Criteria) this;
        }

        public Criteria andAllocTypeLessThan(String value) {
            addCriterion("ALLOC_TYPE <", value, "allocType");
            return (Criteria) this;
        }

        public Criteria andAllocTypeLessThanOrEqualTo(String value) {
            addCriterion("ALLOC_TYPE <=", value, "allocType");
            return (Criteria) this;
        }

        public Criteria andAllocTypeLike(String value) {
            addCriterion("ALLOC_TYPE like", value, "allocType");
            return (Criteria) this;
        }

        public Criteria andAllocTypeNotLike(String value) {
            addCriterion("ALLOC_TYPE not like", value, "allocType");
            return (Criteria) this;
        }

        public Criteria andAllocTypeIn(List<String> values) {
            addCriterion("ALLOC_TYPE in", values, "allocType");
            return (Criteria) this;
        }

        public Criteria andAllocTypeNotIn(List<String> values) {
            addCriterion("ALLOC_TYPE not in", values, "allocType");
            return (Criteria) this;
        }

        public Criteria andAllocTypeBetween(String value1, String value2) {
            addCriterion("ALLOC_TYPE between", value1, value2, "allocType");
            return (Criteria) this;
        }

        public Criteria andAllocTypeNotBetween(String value1, String value2) {
            addCriterion("ALLOC_TYPE not between", value1, value2, "allocType");
            return (Criteria) this;
        }

        public Criteria andAdjustedByIsNull() {
            addCriterion("ADJUSTED_BY is null");
            return (Criteria) this;
        }

        public Criteria andAdjustedByIsNotNull() {
            addCriterion("ADJUSTED_BY is not null");
            return (Criteria) this;
        }

        public Criteria andAdjustedByEqualTo(String value) {
            addCriterion("ADJUSTED_BY =", value, "adjustedBy");
            return (Criteria) this;
        }

        public Criteria andAdjustedByNotEqualTo(String value) {
            addCriterion("ADJUSTED_BY <>", value, "adjustedBy");
            return (Criteria) this;
        }

        public Criteria andAdjustedByGreaterThan(String value) {
            addCriterion("ADJUSTED_BY >", value, "adjustedBy");
            return (Criteria) this;
        }

        public Criteria andAdjustedByGreaterThanOrEqualTo(String value) {
            addCriterion("ADJUSTED_BY >=", value, "adjustedBy");
            return (Criteria) this;
        }

        public Criteria andAdjustedByLessThan(String value) {
            addCriterion("ADJUSTED_BY <", value, "adjustedBy");
            return (Criteria) this;
        }

        public Criteria andAdjustedByLessThanOrEqualTo(String value) {
            addCriterion("ADJUSTED_BY <=", value, "adjustedBy");
            return (Criteria) this;
        }

        public Criteria andAdjustedByLike(String value) {
            addCriterion("ADJUSTED_BY like", value, "adjustedBy");
            return (Criteria) this;
        }

        public Criteria andAdjustedByNotLike(String value) {
            addCriterion("ADJUSTED_BY not like", value, "adjustedBy");
            return (Criteria) this;
        }

        public Criteria andAdjustedByIn(List<String> values) {
            addCriterion("ADJUSTED_BY in", values, "adjustedBy");
            return (Criteria) this;
        }

        public Criteria andAdjustedByNotIn(List<String> values) {
            addCriterion("ADJUSTED_BY not in", values, "adjustedBy");
            return (Criteria) this;
        }

        public Criteria andAdjustedByBetween(String value1, String value2) {
            addCriterion("ADJUSTED_BY between", value1, value2, "adjustedBy");
            return (Criteria) this;
        }

        public Criteria andAdjustedByNotBetween(String value1, String value2) {
            addCriterion("ADJUSTED_BY not between", value1, value2, "adjustedBy");
            return (Criteria) this;
        }

        public Criteria andAdjustTimeIsNull() {
            addCriterion("ADJUST_TIME is null");
            return (Criteria) this;
        }

        public Criteria andAdjustTimeIsNotNull() {
            addCriterion("ADJUST_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andAdjustTimeEqualTo(Date value) {
            addCriterion("ADJUST_TIME =", value, "adjustTime");
            return (Criteria) this;
        }

        public Criteria andAdjustTimeNotEqualTo(Date value) {
            addCriterion("ADJUST_TIME <>", value, "adjustTime");
            return (Criteria) this;
        }

        public Criteria andAdjustTimeGreaterThan(Date value) {
            addCriterion("ADJUST_TIME >", value, "adjustTime");
            return (Criteria) this;
        }

        public Criteria andAdjustTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("ADJUST_TIME >=", value, "adjustTime");
            return (Criteria) this;
        }

        public Criteria andAdjustTimeLessThan(Date value) {
            addCriterion("ADJUST_TIME <", value, "adjustTime");
            return (Criteria) this;
        }

        public Criteria andAdjustTimeLessThanOrEqualTo(Date value) {
            addCriterion("ADJUST_TIME <=", value, "adjustTime");
            return (Criteria) this;
        }

        public Criteria andAdjustTimeIn(List<Date> values) {
            addCriterion("ADJUST_TIME in", values, "adjustTime");
            return (Criteria) this;
        }

        public Criteria andAdjustTimeNotIn(List<Date> values) {
            addCriterion("ADJUST_TIME not in", values, "adjustTime");
            return (Criteria) this;
        }

        public Criteria andAdjustTimeBetween(Date value1, Date value2) {
            addCriterion("ADJUST_TIME between", value1, value2, "adjustTime");
            return (Criteria) this;
        }

        public Criteria andAdjustTimeNotBetween(Date value1, Date value2) {
            addCriterion("ADJUST_TIME not between", value1, value2, "adjustTime");
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