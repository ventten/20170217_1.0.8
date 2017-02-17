package com.ljwd.plms.web.model.case_management;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class PlmsWorkOrderPoolLogExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PlmsWorkOrderPoolLogExample() {
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

        public Criteria andOverduePeriodIsNull() {
            addCriterion("OVERDUE_PERIOD is null");
            return (Criteria) this;
        }

        public Criteria andOverduePeriodIsNotNull() {
            addCriterion("OVERDUE_PERIOD is not null");
            return (Criteria) this;
        }

        public Criteria andOverduePeriodEqualTo(Integer value) {
            addCriterion("OVERDUE_PERIOD =", value, "overduePeriod");
            return (Criteria) this;
        }

        public Criteria andOverduePeriodNotEqualTo(Integer value) {
            addCriterion("OVERDUE_PERIOD <>", value, "overduePeriod");
            return (Criteria) this;
        }

        public Criteria andOverduePeriodGreaterThan(Integer value) {
            addCriterion("OVERDUE_PERIOD >", value, "overduePeriod");
            return (Criteria) this;
        }

        public Criteria andOverduePeriodGreaterThanOrEqualTo(Integer value) {
            addCriterion("OVERDUE_PERIOD >=", value, "overduePeriod");
            return (Criteria) this;
        }

        public Criteria andOverduePeriodLessThan(Integer value) {
            addCriterion("OVERDUE_PERIOD <", value, "overduePeriod");
            return (Criteria) this;
        }

        public Criteria andOverduePeriodLessThanOrEqualTo(Integer value) {
            addCriterion("OVERDUE_PERIOD <=", value, "overduePeriod");
            return (Criteria) this;
        }

        public Criteria andOverduePeriodIn(List<Integer> values) {
            addCriterion("OVERDUE_PERIOD in", values, "overduePeriod");
            return (Criteria) this;
        }

        public Criteria andOverduePeriodNotIn(List<Integer> values) {
            addCriterion("OVERDUE_PERIOD not in", values, "overduePeriod");
            return (Criteria) this;
        }

        public Criteria andOverduePeriodBetween(Integer value1, Integer value2) {
            addCriterion("OVERDUE_PERIOD between", value1, value2, "overduePeriod");
            return (Criteria) this;
        }

        public Criteria andOverduePeriodNotBetween(Integer value1, Integer value2) {
            addCriterion("OVERDUE_PERIOD not between", value1, value2, "overduePeriod");
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

        public Criteria andHandleDateIsNull() {
            addCriterion("HANDLE_DATE is null");
            return (Criteria) this;
        }

        public Criteria andHandleDateIsNotNull() {
            addCriterion("HANDLE_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andHandleDateEqualTo(Date value) {
            addCriterion("HANDLE_DATE =", value, "handleDate");
            return (Criteria) this;
        }

        public Criteria andHandleDateNotEqualTo(Date value) {
            addCriterion("HANDLE_DATE <>", value, "handleDate");
            return (Criteria) this;
        }

        public Criteria andHandleDateGreaterThan(Date value) {
            addCriterion("HANDLE_DATE >", value, "handleDate");
            return (Criteria) this;
        }

        public Criteria andHandleDateGreaterThanOrEqualTo(Date value) {
            addCriterion("HANDLE_DATE >=", value, "handleDate");
            return (Criteria) this;
        }

        public Criteria andHandleDateLessThan(Date value) {
            addCriterion("HANDLE_DATE <", value, "handleDate");
            return (Criteria) this;
        }

        public Criteria andHandleDateLessThanOrEqualTo(Date value) {
            addCriterion("HANDLE_DATE <=", value, "handleDate");
            return (Criteria) this;
        }

        public Criteria andHandleDateIn(List<Date> values) {
            addCriterion("HANDLE_DATE in", values, "handleDate");
            return (Criteria) this;
        }

        public Criteria andHandleDateNotIn(List<Date> values) {
            addCriterion("HANDLE_DATE not in", values, "handleDate");
            return (Criteria) this;
        }

        public Criteria andHandleDateBetween(Date value1, Date value2) {
            addCriterion("HANDLE_DATE between", value1, value2, "handleDate");
            return (Criteria) this;
        }

        public Criteria andHandleDateNotBetween(Date value1, Date value2) {
            addCriterion("HANDLE_DATE not between", value1, value2, "handleDate");
            return (Criteria) this;
        }

        public Criteria andActionTypeIsNull() {
            addCriterion("ACTION_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andActionTypeIsNotNull() {
            addCriterion("ACTION_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andActionTypeEqualTo(String value) {
            addCriterion("ACTION_TYPE =", value, "actionType");
            return (Criteria) this;
        }

        public Criteria andActionTypeNotEqualTo(String value) {
            addCriterion("ACTION_TYPE <>", value, "actionType");
            return (Criteria) this;
        }

        public Criteria andActionTypeGreaterThan(String value) {
            addCriterion("ACTION_TYPE >", value, "actionType");
            return (Criteria) this;
        }

        public Criteria andActionTypeGreaterThanOrEqualTo(String value) {
            addCriterion("ACTION_TYPE >=", value, "actionType");
            return (Criteria) this;
        }

        public Criteria andActionTypeLessThan(String value) {
            addCriterion("ACTION_TYPE <", value, "actionType");
            return (Criteria) this;
        }

        public Criteria andActionTypeLessThanOrEqualTo(String value) {
            addCriterion("ACTION_TYPE <=", value, "actionType");
            return (Criteria) this;
        }

        public Criteria andActionTypeLike(String value) {
            addCriterion("ACTION_TYPE like", value, "actionType");
            return (Criteria) this;
        }

        public Criteria andActionTypeNotLike(String value) {
            addCriterion("ACTION_TYPE not like", value, "actionType");
            return (Criteria) this;
        }

        public Criteria andActionTypeIn(List<String> values) {
            addCriterion("ACTION_TYPE in", values, "actionType");
            return (Criteria) this;
        }

        public Criteria andActionTypeNotIn(List<String> values) {
            addCriterion("ACTION_TYPE not in", values, "actionType");
            return (Criteria) this;
        }

        public Criteria andActionTypeBetween(String value1, String value2) {
            addCriterion("ACTION_TYPE between", value1, value2, "actionType");
            return (Criteria) this;
        }

        public Criteria andActionTypeNotBetween(String value1, String value2) {
            addCriterion("ACTION_TYPE not between", value1, value2, "actionType");
            return (Criteria) this;
        }

        public Criteria andActionIsNull() {
            addCriterion("ACTION is null");
            return (Criteria) this;
        }

        public Criteria andActionIsNotNull() {
            addCriterion("ACTION is not null");
            return (Criteria) this;
        }

        public Criteria andActionEqualTo(String value) {
            addCriterion("ACTION =", value, "action");
            return (Criteria) this;
        }

        public Criteria andActionNotEqualTo(String value) {
            addCriterion("ACTION <>", value, "action");
            return (Criteria) this;
        }

        public Criteria andActionGreaterThan(String value) {
            addCriterion("ACTION >", value, "action");
            return (Criteria) this;
        }

        public Criteria andActionGreaterThanOrEqualTo(String value) {
            addCriterion("ACTION >=", value, "action");
            return (Criteria) this;
        }

        public Criteria andActionLessThan(String value) {
            addCriterion("ACTION <", value, "action");
            return (Criteria) this;
        }

        public Criteria andActionLessThanOrEqualTo(String value) {
            addCriterion("ACTION <=", value, "action");
            return (Criteria) this;
        }

        public Criteria andActionLike(String value) {
            addCriterion("ACTION like", value, "action");
            return (Criteria) this;
        }

        public Criteria andActionNotLike(String value) {
            addCriterion("ACTION not like", value, "action");
            return (Criteria) this;
        }

        public Criteria andActionIn(List<String> values) {
            addCriterion("ACTION in", values, "action");
            return (Criteria) this;
        }

        public Criteria andActionNotIn(List<String> values) {
            addCriterion("ACTION not in", values, "action");
            return (Criteria) this;
        }

        public Criteria andActionBetween(String value1, String value2) {
            addCriterion("ACTION between", value1, value2, "action");
            return (Criteria) this;
        }

        public Criteria andActionNotBetween(String value1, String value2) {
            addCriterion("ACTION not between", value1, value2, "action");
            return (Criteria) this;
        }

        public Criteria andActionDateIsNull() {
            addCriterion("ACTION_DATE is null");
            return (Criteria) this;
        }

        public Criteria andActionDateIsNotNull() {
            addCriterion("ACTION_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andActionDateEqualTo(Date value) {
            addCriterion("ACTION_DATE =", value, "actionDate");
            return (Criteria) this;
        }

        public Criteria andActionDateNotEqualTo(Date value) {
            addCriterion("ACTION_DATE <>", value, "actionDate");
            return (Criteria) this;
        }

        public Criteria andActionDateGreaterThan(Date value) {
            addCriterion("ACTION_DATE >", value, "actionDate");
            return (Criteria) this;
        }

        public Criteria andActionDateGreaterThanOrEqualTo(Date value) {
            addCriterion("ACTION_DATE >=", value, "actionDate");
            return (Criteria) this;
        }

        public Criteria andActionDateLessThan(Date value) {
            addCriterion("ACTION_DATE <", value, "actionDate");
            return (Criteria) this;
        }

        public Criteria andActionDateLessThanOrEqualTo(Date value) {
            addCriterion("ACTION_DATE <=", value, "actionDate");
            return (Criteria) this;
        }

        public Criteria andActionDateIn(List<Date> values) {
            addCriterion("ACTION_DATE in", values, "actionDate");
            return (Criteria) this;
        }

        public Criteria andActionDateNotIn(List<Date> values) {
            addCriterion("ACTION_DATE not in", values, "actionDate");
            return (Criteria) this;
        }

        public Criteria andActionDateBetween(Date value1, Date value2) {
            addCriterion("ACTION_DATE between", value1, value2, "actionDate");
            return (Criteria) this;
        }

        public Criteria andActionDateNotBetween(Date value1, Date value2) {
            addCriterion("ACTION_DATE not between", value1, value2, "actionDate");
            return (Criteria) this;
        }

        public Criteria andActionByIsNull() {
            addCriterion("ACTION_BY is null");
            return (Criteria) this;
        }

        public Criteria andActionByIsNotNull() {
            addCriterion("ACTION_BY is not null");
            return (Criteria) this;
        }

        public Criteria andActionByEqualTo(String value) {
            addCriterion("ACTION_BY =", value, "actionBy");
            return (Criteria) this;
        }

        public Criteria andActionByNotEqualTo(String value) {
            addCriterion("ACTION_BY <>", value, "actionBy");
            return (Criteria) this;
        }

        public Criteria andActionByGreaterThan(String value) {
            addCriterion("ACTION_BY >", value, "actionBy");
            return (Criteria) this;
        }

        public Criteria andActionByGreaterThanOrEqualTo(String value) {
            addCriterion("ACTION_BY >=", value, "actionBy");
            return (Criteria) this;
        }

        public Criteria andActionByLessThan(String value) {
            addCriterion("ACTION_BY <", value, "actionBy");
            return (Criteria) this;
        }

        public Criteria andActionByLessThanOrEqualTo(String value) {
            addCriterion("ACTION_BY <=", value, "actionBy");
            return (Criteria) this;
        }

        public Criteria andActionByLike(String value) {
            addCriterion("ACTION_BY like", value, "actionBy");
            return (Criteria) this;
        }

        public Criteria andActionByNotLike(String value) {
            addCriterion("ACTION_BY not like", value, "actionBy");
            return (Criteria) this;
        }

        public Criteria andActionByIn(List<String> values) {
            addCriterion("ACTION_BY in", values, "actionBy");
            return (Criteria) this;
        }

        public Criteria andActionByNotIn(List<String> values) {
            addCriterion("ACTION_BY not in", values, "actionBy");
            return (Criteria) this;
        }

        public Criteria andActionByBetween(String value1, String value2) {
            addCriterion("ACTION_BY between", value1, value2, "actionBy");
            return (Criteria) this;
        }

        public Criteria andActionByNotBetween(String value1, String value2) {
            addCriterion("ACTION_BY not between", value1, value2, "actionBy");
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

        public Criteria andDefendStatusIsNull() {
            addCriterion("DEFEND_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andDefendStatusIsNotNull() {
            addCriterion("DEFEND_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andDefendStatusEqualTo(String value) {
            addCriterion("DEFEND_STATUS =", value, "defendStatus");
            return (Criteria) this;
        }

        public Criteria andDefendStatusNotEqualTo(String value) {
            addCriterion("DEFEND_STATUS <>", value, "defendStatus");
            return (Criteria) this;
        }

        public Criteria andDefendStatusGreaterThan(String value) {
            addCriterion("DEFEND_STATUS >", value, "defendStatus");
            return (Criteria) this;
        }

        public Criteria andDefendStatusGreaterThanOrEqualTo(String value) {
            addCriterion("DEFEND_STATUS >=", value, "defendStatus");
            return (Criteria) this;
        }

        public Criteria andDefendStatusLessThan(String value) {
            addCriterion("DEFEND_STATUS <", value, "defendStatus");
            return (Criteria) this;
        }

        public Criteria andDefendStatusLessThanOrEqualTo(String value) {
            addCriterion("DEFEND_STATUS <=", value, "defendStatus");
            return (Criteria) this;
        }

        public Criteria andDefendStatusLike(String value) {
            addCriterion("DEFEND_STATUS like", value, "defendStatus");
            return (Criteria) this;
        }

        public Criteria andDefendStatusNotLike(String value) {
            addCriterion("DEFEND_STATUS not like", value, "defendStatus");
            return (Criteria) this;
        }

        public Criteria andDefendStatusIn(List<String> values) {
            addCriterion("DEFEND_STATUS in", values, "defendStatus");
            return (Criteria) this;
        }

        public Criteria andDefendStatusNotIn(List<String> values) {
            addCriterion("DEFEND_STATUS not in", values, "defendStatus");
            return (Criteria) this;
        }

        public Criteria andDefendStatusBetween(String value1, String value2) {
            addCriterion("DEFEND_STATUS between", value1, value2, "defendStatus");
            return (Criteria) this;
        }

        public Criteria andDefendStatusNotBetween(String value1, String value2) {
            addCriterion("DEFEND_STATUS not between", value1, value2, "defendStatus");
            return (Criteria) this;
        }

        public Criteria andProtectEndDateIsNull() {
            addCriterion("PROTECT_END_DATE is null");
            return (Criteria) this;
        }

        public Criteria andProtectEndDateIsNotNull() {
            addCriterion("PROTECT_END_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andProtectEndDateEqualTo(Date value) {
            addCriterion("PROTECT_END_DATE =", value, "protectEndDate");
            return (Criteria) this;
        }

        public Criteria andProtectEndDateNotEqualTo(Date value) {
            addCriterion("PROTECT_END_DATE <>", value, "protectEndDate");
            return (Criteria) this;
        }

        public Criteria andProtectEndDateGreaterThan(Date value) {
            addCriterion("PROTECT_END_DATE >", value, "protectEndDate");
            return (Criteria) this;
        }

        public Criteria andProtectEndDateGreaterThanOrEqualTo(Date value) {
            addCriterion("PROTECT_END_DATE >=", value, "protectEndDate");
            return (Criteria) this;
        }

        public Criteria andProtectEndDateLessThan(Date value) {
            addCriterion("PROTECT_END_DATE <", value, "protectEndDate");
            return (Criteria) this;
        }

        public Criteria andProtectEndDateLessThanOrEqualTo(Date value) {
            addCriterion("PROTECT_END_DATE <=", value, "protectEndDate");
            return (Criteria) this;
        }

        public Criteria andProtectEndDateIn(List<Date> values) {
            addCriterion("PROTECT_END_DATE in", values, "protectEndDate");
            return (Criteria) this;
        }

        public Criteria andProtectEndDateNotIn(List<Date> values) {
            addCriterion("PROTECT_END_DATE not in", values, "protectEndDate");
            return (Criteria) this;
        }

        public Criteria andProtectEndDateBetween(Date value1, Date value2) {
            addCriterion("PROTECT_END_DATE between", value1, value2, "protectEndDate");
            return (Criteria) this;
        }

        public Criteria andProtectEndDateNotBetween(Date value1, Date value2) {
            addCriterion("PROTECT_END_DATE not between", value1, value2, "protectEndDate");
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