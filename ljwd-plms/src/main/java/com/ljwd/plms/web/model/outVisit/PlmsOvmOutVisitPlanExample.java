package com.ljwd.plms.web.model.outVisit;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PlmsOvmOutVisitPlanExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PlmsOvmOutVisitPlanExample() {
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

        public Criteria andIdEqualTo(BigDecimal value) {
            addCriterion("ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(BigDecimal value) {
            addCriterion("ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(BigDecimal value) {
            addCriterion("ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(BigDecimal value) {
            addCriterion("ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<BigDecimal> values) {
            addCriterion("ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<BigDecimal> values) {
            addCriterion("ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(BigDecimal value1, BigDecimal value2) {
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

        public Criteria andApplIdEqualTo(BigDecimal value) {
            addCriterion("APPL_ID =", value, "applId");
            return (Criteria) this;
        }

        public Criteria andApplIdNotEqualTo(BigDecimal value) {
            addCriterion("APPL_ID <>", value, "applId");
            return (Criteria) this;
        }

        public Criteria andApplIdGreaterThan(BigDecimal value) {
            addCriterion("APPL_ID >", value, "applId");
            return (Criteria) this;
        }

        public Criteria andApplIdGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("APPL_ID >=", value, "applId");
            return (Criteria) this;
        }

        public Criteria andApplIdLessThan(BigDecimal value) {
            addCriterion("APPL_ID <", value, "applId");
            return (Criteria) this;
        }

        public Criteria andApplIdLessThanOrEqualTo(BigDecimal value) {
            addCriterion("APPL_ID <=", value, "applId");
            return (Criteria) this;
        }

        public Criteria andApplIdIn(List<BigDecimal> values) {
            addCriterion("APPL_ID in", values, "applId");
            return (Criteria) this;
        }

        public Criteria andApplIdNotIn(List<BigDecimal> values) {
            addCriterion("APPL_ID not in", values, "applId");
            return (Criteria) this;
        }

        public Criteria andApplIdBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("APPL_ID between", value1, value2, "applId");
            return (Criteria) this;
        }

        public Criteria andApplIdNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("APPL_ID not between", value1, value2, "applId");
            return (Criteria) this;
        }

        public Criteria andInfoIdIsNull() {
            addCriterion("INFO_ID is null");
            return (Criteria) this;
        }

        public Criteria andInfoIdIsNotNull() {
            addCriterion("INFO_ID is not null");
            return (Criteria) this;
        }

        public Criteria andInfoIdEqualTo(BigDecimal value) {
            addCriterion("INFO_ID =", value, "infoId");
            return (Criteria) this;
        }

        public Criteria andInfoIdNotEqualTo(BigDecimal value) {
            addCriterion("INFO_ID <>", value, "infoId");
            return (Criteria) this;
        }

        public Criteria andInfoIdGreaterThan(BigDecimal value) {
            addCriterion("INFO_ID >", value, "infoId");
            return (Criteria) this;
        }

        public Criteria andInfoIdGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("INFO_ID >=", value, "infoId");
            return (Criteria) this;
        }

        public Criteria andInfoIdLessThan(BigDecimal value) {
            addCriterion("INFO_ID <", value, "infoId");
            return (Criteria) this;
        }

        public Criteria andInfoIdLessThanOrEqualTo(BigDecimal value) {
            addCriterion("INFO_ID <=", value, "infoId");
            return (Criteria) this;
        }

        public Criteria andInfoIdIn(List<BigDecimal> values) {
            addCriterion("INFO_ID in", values, "infoId");
            return (Criteria) this;
        }

        public Criteria andInfoIdNotIn(List<BigDecimal> values) {
            addCriterion("INFO_ID not in", values, "infoId");
            return (Criteria) this;
        }

        public Criteria andInfoIdBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("INFO_ID between", value1, value2, "infoId");
            return (Criteria) this;
        }

        public Criteria andInfoIdNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("INFO_ID not between", value1, value2, "infoId");
            return (Criteria) this;
        }

        public Criteria andPlanCodeIsNull() {
            addCriterion("PLAN_CODE is null");
            return (Criteria) this;
        }

        public Criteria andPlanCodeIsNotNull() {
            addCriterion("PLAN_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andPlanCodeEqualTo(String value) {
            addCriterion("PLAN_CODE =", value, "planCode");
            return (Criteria) this;
        }

        public Criteria andPlanCodeNotEqualTo(String value) {
            addCriterion("PLAN_CODE <>", value, "planCode");
            return (Criteria) this;
        }

        public Criteria andPlanCodeGreaterThan(String value) {
            addCriterion("PLAN_CODE >", value, "planCode");
            return (Criteria) this;
        }

        public Criteria andPlanCodeGreaterThanOrEqualTo(String value) {
            addCriterion("PLAN_CODE >=", value, "planCode");
            return (Criteria) this;
        }

        public Criteria andPlanCodeLessThan(String value) {
            addCriterion("PLAN_CODE <", value, "planCode");
            return (Criteria) this;
        }

        public Criteria andPlanCodeLessThanOrEqualTo(String value) {
            addCriterion("PLAN_CODE <=", value, "planCode");
            return (Criteria) this;
        }

        public Criteria andPlanCodeLike(String value) {
            addCriterion("PLAN_CODE like", value, "planCode");
            return (Criteria) this;
        }

        public Criteria andPlanCodeNotLike(String value) {
            addCriterion("PLAN_CODE not like", value, "planCode");
            return (Criteria) this;
        }

        public Criteria andPlanCodeIn(List<String> values) {
            addCriterion("PLAN_CODE in", values, "planCode");
            return (Criteria) this;
        }

        public Criteria andPlanCodeNotIn(List<String> values) {
            addCriterion("PLAN_CODE not in", values, "planCode");
            return (Criteria) this;
        }

        public Criteria andPlanCodeBetween(String value1, String value2) {
            addCriterion("PLAN_CODE between", value1, value2, "planCode");
            return (Criteria) this;
        }

        public Criteria andPlanCodeNotBetween(String value1, String value2) {
            addCriterion("PLAN_CODE not between", value1, value2, "planCode");
            return (Criteria) this;
        }

        public Criteria andPlanStartTimeIsNull() {
            addCriterion("PLAN_START_TIME is null");
            return (Criteria) this;
        }

        public Criteria andPlanStartTimeIsNotNull() {
            addCriterion("PLAN_START_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andPlanStartTimeEqualTo(Date value) {
            addCriterion("PLAN_START_TIME =", value, "planStartTime");
            return (Criteria) this;
        }

        public Criteria andPlanStartTimeNotEqualTo(Date value) {
            addCriterion("PLAN_START_TIME <>", value, "planStartTime");
            return (Criteria) this;
        }

        public Criteria andPlanStartTimeGreaterThan(Date value) {
            addCriterion("PLAN_START_TIME >", value, "planStartTime");
            return (Criteria) this;
        }

        public Criteria andPlanStartTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("PLAN_START_TIME >=", value, "planStartTime");
            return (Criteria) this;
        }

        public Criteria andPlanStartTimeLessThan(Date value) {
            addCriterion("PLAN_START_TIME <", value, "planStartTime");
            return (Criteria) this;
        }

        public Criteria andPlanStartTimeLessThanOrEqualTo(Date value) {
            addCriterion("PLAN_START_TIME <=", value, "planStartTime");
            return (Criteria) this;
        }

        public Criteria andPlanStartTimeIn(List<Date> values) {
            addCriterion("PLAN_START_TIME in", values, "planStartTime");
            return (Criteria) this;
        }

        public Criteria andPlanStartTimeNotIn(List<Date> values) {
            addCriterion("PLAN_START_TIME not in", values, "planStartTime");
            return (Criteria) this;
        }

        public Criteria andPlanStartTimeBetween(Date value1, Date value2) {
            addCriterion("PLAN_START_TIME between", value1, value2, "planStartTime");
            return (Criteria) this;
        }

        public Criteria andPlanStartTimeNotBetween(Date value1, Date value2) {
            addCriterion("PLAN_START_TIME not between", value1, value2, "planStartTime");
            return (Criteria) this;
        }

        public Criteria andPlanStatusIsNull() {
            addCriterion("PLAN_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andPlanStatusIsNotNull() {
            addCriterion("PLAN_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andPlanStatusEqualTo(String value) {
            addCriterion("PLAN_STATUS =", value, "planStatus");
            return (Criteria) this;
        }

        public Criteria andPlanStatusNotEqualTo(String value) {
            addCriterion("PLAN_STATUS <>", value, "planStatus");
            return (Criteria) this;
        }

        public Criteria andPlanStatusGreaterThan(String value) {
            addCriterion("PLAN_STATUS >", value, "planStatus");
            return (Criteria) this;
        }

        public Criteria andPlanStatusGreaterThanOrEqualTo(String value) {
            addCriterion("PLAN_STATUS >=", value, "planStatus");
            return (Criteria) this;
        }

        public Criteria andPlanStatusLessThan(String value) {
            addCriterion("PLAN_STATUS <", value, "planStatus");
            return (Criteria) this;
        }

        public Criteria andPlanStatusLessThanOrEqualTo(String value) {
            addCriterion("PLAN_STATUS <=", value, "planStatus");
            return (Criteria) this;
        }

        public Criteria andPlanStatusLike(String value) {
            addCriterion("PLAN_STATUS like", value, "planStatus");
            return (Criteria) this;
        }

        public Criteria andPlanStatusNotLike(String value) {
            addCriterion("PLAN_STATUS not like", value, "planStatus");
            return (Criteria) this;
        }

        public Criteria andPlanStatusIn(List<String> values) {
            addCriterion("PLAN_STATUS in", values, "planStatus");
            return (Criteria) this;
        }

        public Criteria andPlanStatusNotIn(List<String> values) {
            addCriterion("PLAN_STATUS not in", values, "planStatus");
            return (Criteria) this;
        }

        public Criteria andPlanStatusBetween(String value1, String value2) {
            addCriterion("PLAN_STATUS between", value1, value2, "planStatus");
            return (Criteria) this;
        }

        public Criteria andPlanStatusNotBetween(String value1, String value2) {
            addCriterion("PLAN_STATUS not between", value1, value2, "planStatus");
            return (Criteria) this;
        }

        public Criteria andSignIdIsNull() {
            addCriterion("SIGN_ID is null");
            return (Criteria) this;
        }

        public Criteria andSignIdIsNotNull() {
            addCriterion("SIGN_ID is not null");
            return (Criteria) this;
        }

        public Criteria andSignIdEqualTo(BigDecimal value) {
            addCriterion("SIGN_ID =", value, "signId");
            return (Criteria) this;
        }

        public Criteria andSignIdNotEqualTo(BigDecimal value) {
            addCriterion("SIGN_ID <>", value, "signId");
            return (Criteria) this;
        }

        public Criteria andSignIdGreaterThan(BigDecimal value) {
            addCriterion("SIGN_ID >", value, "signId");
            return (Criteria) this;
        }

        public Criteria andSignIdGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("SIGN_ID >=", value, "signId");
            return (Criteria) this;
        }

        public Criteria andSignIdLessThan(BigDecimal value) {
            addCriterion("SIGN_ID <", value, "signId");
            return (Criteria) this;
        }

        public Criteria andSignIdLessThanOrEqualTo(BigDecimal value) {
            addCriterion("SIGN_ID <=", value, "signId");
            return (Criteria) this;
        }

        public Criteria andSignIdIn(List<BigDecimal> values) {
            addCriterion("SIGN_ID in", values, "signId");
            return (Criteria) this;
        }

        public Criteria andSignIdNotIn(List<BigDecimal> values) {
            addCriterion("SIGN_ID not in", values, "signId");
            return (Criteria) this;
        }

        public Criteria andSignIdBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SIGN_ID between", value1, value2, "signId");
            return (Criteria) this;
        }

        public Criteria andSignIdNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SIGN_ID not between", value1, value2, "signId");
            return (Criteria) this;
        }

        public Criteria andAddressIsNull() {
            addCriterion("ADDRESS is null");
            return (Criteria) this;
        }

        public Criteria andAddressIsNotNull() {
            addCriterion("ADDRESS is not null");
            return (Criteria) this;
        }

        public Criteria andAddressEqualTo(String value) {
            addCriterion("ADDRESS =", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotEqualTo(String value) {
            addCriterion("ADDRESS <>", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThan(String value) {
            addCriterion("ADDRESS >", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThanOrEqualTo(String value) {
            addCriterion("ADDRESS >=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThan(String value) {
            addCriterion("ADDRESS <", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThanOrEqualTo(String value) {
            addCriterion("ADDRESS <=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLike(String value) {
            addCriterion("ADDRESS like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotLike(String value) {
            addCriterion("ADDRESS not like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressIn(List<String> values) {
            addCriterion("ADDRESS in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotIn(List<String> values) {
            addCriterion("ADDRESS not in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressBetween(String value1, String value2) {
            addCriterion("ADDRESS between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotBetween(String value1, String value2) {
            addCriterion("ADDRESS not between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andAddressTypeIsNull() {
            addCriterion("ADDRESS_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andAddressTypeIsNotNull() {
            addCriterion("ADDRESS_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andAddressTypeEqualTo(String value) {
            addCriterion("ADDRESS_TYPE =", value, "addressType");
            return (Criteria) this;
        }

        public Criteria andAddressTypeNotEqualTo(String value) {
            addCriterion("ADDRESS_TYPE <>", value, "addressType");
            return (Criteria) this;
        }

        public Criteria andAddressTypeGreaterThan(String value) {
            addCriterion("ADDRESS_TYPE >", value, "addressType");
            return (Criteria) this;
        }

        public Criteria andAddressTypeGreaterThanOrEqualTo(String value) {
            addCriterion("ADDRESS_TYPE >=", value, "addressType");
            return (Criteria) this;
        }

        public Criteria andAddressTypeLessThan(String value) {
            addCriterion("ADDRESS_TYPE <", value, "addressType");
            return (Criteria) this;
        }

        public Criteria andAddressTypeLessThanOrEqualTo(String value) {
            addCriterion("ADDRESS_TYPE <=", value, "addressType");
            return (Criteria) this;
        }

        public Criteria andAddressTypeLike(String value) {
            addCriterion("ADDRESS_TYPE like", value, "addressType");
            return (Criteria) this;
        }

        public Criteria andAddressTypeNotLike(String value) {
            addCriterion("ADDRESS_TYPE not like", value, "addressType");
            return (Criteria) this;
        }

        public Criteria andAddressTypeIn(List<String> values) {
            addCriterion("ADDRESS_TYPE in", values, "addressType");
            return (Criteria) this;
        }

        public Criteria andAddressTypeNotIn(List<String> values) {
            addCriterion("ADDRESS_TYPE not in", values, "addressType");
            return (Criteria) this;
        }

        public Criteria andAddressTypeBetween(String value1, String value2) {
            addCriterion("ADDRESS_TYPE between", value1, value2, "addressType");
            return (Criteria) this;
        }

        public Criteria andAddressTypeNotBetween(String value1, String value2) {
            addCriterion("ADDRESS_TYPE not between", value1, value2, "addressType");
            return (Criteria) this;
        }

        public Criteria andAddressValidityIsNull() {
            addCriterion("ADDRESS_VALIDITY is null");
            return (Criteria) this;
        }

        public Criteria andAddressValidityIsNotNull() {
            addCriterion("ADDRESS_VALIDITY is not null");
            return (Criteria) this;
        }

        public Criteria andAddressValidityEqualTo(String value) {
            addCriterion("ADDRESS_VALIDITY =", value, "addressValidity");
            return (Criteria) this;
        }

        public Criteria andAddressValidityNotEqualTo(String value) {
            addCriterion("ADDRESS_VALIDITY <>", value, "addressValidity");
            return (Criteria) this;
        }

        public Criteria andAddressValidityGreaterThan(String value) {
            addCriterion("ADDRESS_VALIDITY >", value, "addressValidity");
            return (Criteria) this;
        }

        public Criteria andAddressValidityGreaterThanOrEqualTo(String value) {
            addCriterion("ADDRESS_VALIDITY >=", value, "addressValidity");
            return (Criteria) this;
        }

        public Criteria andAddressValidityLessThan(String value) {
            addCriterion("ADDRESS_VALIDITY <", value, "addressValidity");
            return (Criteria) this;
        }

        public Criteria andAddressValidityLessThanOrEqualTo(String value) {
            addCriterion("ADDRESS_VALIDITY <=", value, "addressValidity");
            return (Criteria) this;
        }

        public Criteria andAddressValidityLike(String value) {
            addCriterion("ADDRESS_VALIDITY like", value, "addressValidity");
            return (Criteria) this;
        }

        public Criteria andAddressValidityNotLike(String value) {
            addCriterion("ADDRESS_VALIDITY not like", value, "addressValidity");
            return (Criteria) this;
        }

        public Criteria andAddressValidityIn(List<String> values) {
            addCriterion("ADDRESS_VALIDITY in", values, "addressValidity");
            return (Criteria) this;
        }

        public Criteria andAddressValidityNotIn(List<String> values) {
            addCriterion("ADDRESS_VALIDITY not in", values, "addressValidity");
            return (Criteria) this;
        }

        public Criteria andAddressValidityBetween(String value1, String value2) {
            addCriterion("ADDRESS_VALIDITY between", value1, value2, "addressValidity");
            return (Criteria) this;
        }

        public Criteria andAddressValidityNotBetween(String value1, String value2) {
            addCriterion("ADDRESS_VALIDITY not between", value1, value2, "addressValidity");
            return (Criteria) this;
        }

        public Criteria andFollowupResultsIsNull() {
            addCriterion("FOLLOWUP_RESULTS is null");
            return (Criteria) this;
        }

        public Criteria andFollowupResultsIsNotNull() {
            addCriterion("FOLLOWUP_RESULTS is not null");
            return (Criteria) this;
        }

        public Criteria andFollowupResultsEqualTo(String value) {
            addCriterion("FOLLOWUP_RESULTS =", value, "followupResults");
            return (Criteria) this;
        }

        public Criteria andFollowupResultsNotEqualTo(String value) {
            addCriterion("FOLLOWUP_RESULTS <>", value, "followupResults");
            return (Criteria) this;
        }

        public Criteria andFollowupResultsGreaterThan(String value) {
            addCriterion("FOLLOWUP_RESULTS >", value, "followupResults");
            return (Criteria) this;
        }

        public Criteria andFollowupResultsGreaterThanOrEqualTo(String value) {
            addCriterion("FOLLOWUP_RESULTS >=", value, "followupResults");
            return (Criteria) this;
        }

        public Criteria andFollowupResultsLessThan(String value) {
            addCriterion("FOLLOWUP_RESULTS <", value, "followupResults");
            return (Criteria) this;
        }

        public Criteria andFollowupResultsLessThanOrEqualTo(String value) {
            addCriterion("FOLLOWUP_RESULTS <=", value, "followupResults");
            return (Criteria) this;
        }

        public Criteria andFollowupResultsLike(String value) {
            addCriterion("FOLLOWUP_RESULTS like", value, "followupResults");
            return (Criteria) this;
        }

        public Criteria andFollowupResultsNotLike(String value) {
            addCriterion("FOLLOWUP_RESULTS not like", value, "followupResults");
            return (Criteria) this;
        }

        public Criteria andFollowupResultsIn(List<String> values) {
            addCriterion("FOLLOWUP_RESULTS in", values, "followupResults");
            return (Criteria) this;
        }

        public Criteria andFollowupResultsNotIn(List<String> values) {
            addCriterion("FOLLOWUP_RESULTS not in", values, "followupResults");
            return (Criteria) this;
        }

        public Criteria andFollowupResultsBetween(String value1, String value2) {
            addCriterion("FOLLOWUP_RESULTS between", value1, value2, "followupResults");
            return (Criteria) this;
        }

        public Criteria andFollowupResultsNotBetween(String value1, String value2) {
            addCriterion("FOLLOWUP_RESULTS not between", value1, value2, "followupResults");
            return (Criteria) this;
        }

        public Criteria andAssistByIsNull() {
            addCriterion("ASSIST_BY is null");
            return (Criteria) this;
        }

        public Criteria andAssistByIsNotNull() {
            addCriterion("ASSIST_BY is not null");
            return (Criteria) this;
        }

        public Criteria andAssistByEqualTo(String value) {
            addCriterion("ASSIST_BY =", value, "assistBy");
            return (Criteria) this;
        }

        public Criteria andAssistByNotEqualTo(String value) {
            addCriterion("ASSIST_BY <>", value, "assistBy");
            return (Criteria) this;
        }

        public Criteria andAssistByGreaterThan(String value) {
            addCriterion("ASSIST_BY >", value, "assistBy");
            return (Criteria) this;
        }

        public Criteria andAssistByGreaterThanOrEqualTo(String value) {
            addCriterion("ASSIST_BY >=", value, "assistBy");
            return (Criteria) this;
        }

        public Criteria andAssistByLessThan(String value) {
            addCriterion("ASSIST_BY <", value, "assistBy");
            return (Criteria) this;
        }

        public Criteria andAssistByLessThanOrEqualTo(String value) {
            addCriterion("ASSIST_BY <=", value, "assistBy");
            return (Criteria) this;
        }

        public Criteria andAssistByLike(String value) {
            addCriterion("ASSIST_BY like", value, "assistBy");
            return (Criteria) this;
        }

        public Criteria andAssistByNotLike(String value) {
            addCriterion("ASSIST_BY not like", value, "assistBy");
            return (Criteria) this;
        }

        public Criteria andAssistByIn(List<String> values) {
            addCriterion("ASSIST_BY in", values, "assistBy");
            return (Criteria) this;
        }

        public Criteria andAssistByNotIn(List<String> values) {
            addCriterion("ASSIST_BY not in", values, "assistBy");
            return (Criteria) this;
        }

        public Criteria andAssistByBetween(String value1, String value2) {
            addCriterion("ASSIST_BY between", value1, value2, "assistBy");
            return (Criteria) this;
        }

        public Criteria andAssistByNotBetween(String value1, String value2) {
            addCriterion("ASSIST_BY not between", value1, value2, "assistBy");
            return (Criteria) this;
        }

        public Criteria andPtpDateIsNull() {
            addCriterion("PTP_DATE is null");
            return (Criteria) this;
        }

        public Criteria andPtpDateIsNotNull() {
            addCriterion("PTP_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andPtpDateEqualTo(Date value) {
            addCriterion("PTP_DATE =", value, "ptpDate");
            return (Criteria) this;
        }

        public Criteria andPtpDateNotEqualTo(Date value) {
            addCriterion("PTP_DATE <>", value, "ptpDate");
            return (Criteria) this;
        }

        public Criteria andPtpDateGreaterThan(Date value) {
            addCriterion("PTP_DATE >", value, "ptpDate");
            return (Criteria) this;
        }

        public Criteria andPtpDateGreaterThanOrEqualTo(Date value) {
            addCriterion("PTP_DATE >=", value, "ptpDate");
            return (Criteria) this;
        }

        public Criteria andPtpDateLessThan(Date value) {
            addCriterion("PTP_DATE <", value, "ptpDate");
            return (Criteria) this;
        }

        public Criteria andPtpDateLessThanOrEqualTo(Date value) {
            addCriterion("PTP_DATE <=", value, "ptpDate");
            return (Criteria) this;
        }

        public Criteria andPtpDateIn(List<Date> values) {
            addCriterion("PTP_DATE in", values, "ptpDate");
            return (Criteria) this;
        }

        public Criteria andPtpDateNotIn(List<Date> values) {
            addCriterion("PTP_DATE not in", values, "ptpDate");
            return (Criteria) this;
        }

        public Criteria andPtpDateBetween(Date value1, Date value2) {
            addCriterion("PTP_DATE between", value1, value2, "ptpDate");
            return (Criteria) this;
        }

        public Criteria andPtpDateNotBetween(Date value1, Date value2) {
            addCriterion("PTP_DATE not between", value1, value2, "ptpDate");
            return (Criteria) this;
        }

        public Criteria andPtpAmtIsNull() {
            addCriterion("PTP_AMT is null");
            return (Criteria) this;
        }

        public Criteria andPtpAmtIsNotNull() {
            addCriterion("PTP_AMT is not null");
            return (Criteria) this;
        }

        public Criteria andPtpAmtEqualTo(BigDecimal value) {
            addCriterion("PTP_AMT =", value, "ptpAmt");
            return (Criteria) this;
        }

        public Criteria andPtpAmtNotEqualTo(BigDecimal value) {
            addCriterion("PTP_AMT <>", value, "ptpAmt");
            return (Criteria) this;
        }

        public Criteria andPtpAmtGreaterThan(BigDecimal value) {
            addCriterion("PTP_AMT >", value, "ptpAmt");
            return (Criteria) this;
        }

        public Criteria andPtpAmtGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("PTP_AMT >=", value, "ptpAmt");
            return (Criteria) this;
        }

        public Criteria andPtpAmtLessThan(BigDecimal value) {
            addCriterion("PTP_AMT <", value, "ptpAmt");
            return (Criteria) this;
        }

        public Criteria andPtpAmtLessThanOrEqualTo(BigDecimal value) {
            addCriterion("PTP_AMT <=", value, "ptpAmt");
            return (Criteria) this;
        }

        public Criteria andPtpAmtIn(List<BigDecimal> values) {
            addCriterion("PTP_AMT in", values, "ptpAmt");
            return (Criteria) this;
        }

        public Criteria andPtpAmtNotIn(List<BigDecimal> values) {
            addCriterion("PTP_AMT not in", values, "ptpAmt");
            return (Criteria) this;
        }

        public Criteria andPtpAmtBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PTP_AMT between", value1, value2, "ptpAmt");
            return (Criteria) this;
        }

        public Criteria andPtpAmtNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PTP_AMT not between", value1, value2, "ptpAmt");
            return (Criteria) this;
        }

        public Criteria andOvtresultDetailIsNull() {
            addCriterion("OVTRESULT_DETAIL is null");
            return (Criteria) this;
        }

        public Criteria andOvtresultDetailIsNotNull() {
            addCriterion("OVTRESULT_DETAIL is not null");
            return (Criteria) this;
        }

        public Criteria andOvtresultDetailEqualTo(String value) {
            addCriterion("OVTRESULT_DETAIL =", value, "ovtresultDetail");
            return (Criteria) this;
        }

        public Criteria andOvtresultDetailNotEqualTo(String value) {
            addCriterion("OVTRESULT_DETAIL <>", value, "ovtresultDetail");
            return (Criteria) this;
        }

        public Criteria andOvtresultDetailGreaterThan(String value) {
            addCriterion("OVTRESULT_DETAIL >", value, "ovtresultDetail");
            return (Criteria) this;
        }

        public Criteria andOvtresultDetailGreaterThanOrEqualTo(String value) {
            addCriterion("OVTRESULT_DETAIL >=", value, "ovtresultDetail");
            return (Criteria) this;
        }

        public Criteria andOvtresultDetailLessThan(String value) {
            addCriterion("OVTRESULT_DETAIL <", value, "ovtresultDetail");
            return (Criteria) this;
        }

        public Criteria andOvtresultDetailLessThanOrEqualTo(String value) {
            addCriterion("OVTRESULT_DETAIL <=", value, "ovtresultDetail");
            return (Criteria) this;
        }

        public Criteria andOvtresultDetailLike(String value) {
            addCriterion("OVTRESULT_DETAIL like", value, "ovtresultDetail");
            return (Criteria) this;
        }

        public Criteria andOvtresultDetailNotLike(String value) {
            addCriterion("OVTRESULT_DETAIL not like", value, "ovtresultDetail");
            return (Criteria) this;
        }

        public Criteria andOvtresultDetailIn(List<String> values) {
            addCriterion("OVTRESULT_DETAIL in", values, "ovtresultDetail");
            return (Criteria) this;
        }

        public Criteria andOvtresultDetailNotIn(List<String> values) {
            addCriterion("OVTRESULT_DETAIL not in", values, "ovtresultDetail");
            return (Criteria) this;
        }

        public Criteria andOvtresultDetailBetween(String value1, String value2) {
            addCriterion("OVTRESULT_DETAIL between", value1, value2, "ovtresultDetail");
            return (Criteria) this;
        }

        public Criteria andOvtresultDetailNotBetween(String value1, String value2) {
            addCriterion("OVTRESULT_DETAIL not between", value1, value2, "ovtresultDetail");
            return (Criteria) this;
        }

        public Criteria andVisitCancelTypeIsNull() {
            addCriterion("VISIT_CANCEL_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andVisitCancelTypeIsNotNull() {
            addCriterion("VISIT_CANCEL_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andVisitCancelTypeEqualTo(String value) {
            addCriterion("VISIT_CANCEL_TYPE =", value, "visitCancelType");
            return (Criteria) this;
        }

        public Criteria andVisitCancelTypeNotEqualTo(String value) {
            addCriterion("VISIT_CANCEL_TYPE <>", value, "visitCancelType");
            return (Criteria) this;
        }

        public Criteria andVisitCancelTypeGreaterThan(String value) {
            addCriterion("VISIT_CANCEL_TYPE >", value, "visitCancelType");
            return (Criteria) this;
        }

        public Criteria andVisitCancelTypeGreaterThanOrEqualTo(String value) {
            addCriterion("VISIT_CANCEL_TYPE >=", value, "visitCancelType");
            return (Criteria) this;
        }

        public Criteria andVisitCancelTypeLessThan(String value) {
            addCriterion("VISIT_CANCEL_TYPE <", value, "visitCancelType");
            return (Criteria) this;
        }

        public Criteria andVisitCancelTypeLessThanOrEqualTo(String value) {
            addCriterion("VISIT_CANCEL_TYPE <=", value, "visitCancelType");
            return (Criteria) this;
        }

        public Criteria andVisitCancelTypeLike(String value) {
            addCriterion("VISIT_CANCEL_TYPE like", value, "visitCancelType");
            return (Criteria) this;
        }

        public Criteria andVisitCancelTypeNotLike(String value) {
            addCriterion("VISIT_CANCEL_TYPE not like", value, "visitCancelType");
            return (Criteria) this;
        }

        public Criteria andVisitCancelTypeIn(List<String> values) {
            addCriterion("VISIT_CANCEL_TYPE in", values, "visitCancelType");
            return (Criteria) this;
        }

        public Criteria andVisitCancelTypeNotIn(List<String> values) {
            addCriterion("VISIT_CANCEL_TYPE not in", values, "visitCancelType");
            return (Criteria) this;
        }

        public Criteria andVisitCancelTypeBetween(String value1, String value2) {
            addCriterion("VISIT_CANCEL_TYPE between", value1, value2, "visitCancelType");
            return (Criteria) this;
        }

        public Criteria andVisitCancelTypeNotBetween(String value1, String value2) {
            addCriterion("VISIT_CANCEL_TYPE not between", value1, value2, "visitCancelType");
            return (Criteria) this;
        }

        public Criteria andVisitCancelResionIsNull() {
            addCriterion("VISIT_CANCEL_RESION is null");
            return (Criteria) this;
        }

        public Criteria andVisitCancelResionIsNotNull() {
            addCriterion("VISIT_CANCEL_RESION is not null");
            return (Criteria) this;
        }

        public Criteria andVisitCancelResionEqualTo(String value) {
            addCriterion("VISIT_CANCEL_RESION =", value, "visitCancelResion");
            return (Criteria) this;
        }

        public Criteria andVisitCancelResionNotEqualTo(String value) {
            addCriterion("VISIT_CANCEL_RESION <>", value, "visitCancelResion");
            return (Criteria) this;
        }

        public Criteria andVisitCancelResionGreaterThan(String value) {
            addCriterion("VISIT_CANCEL_RESION >", value, "visitCancelResion");
            return (Criteria) this;
        }

        public Criteria andVisitCancelResionGreaterThanOrEqualTo(String value) {
            addCriterion("VISIT_CANCEL_RESION >=", value, "visitCancelResion");
            return (Criteria) this;
        }

        public Criteria andVisitCancelResionLessThan(String value) {
            addCriterion("VISIT_CANCEL_RESION <", value, "visitCancelResion");
            return (Criteria) this;
        }

        public Criteria andVisitCancelResionLessThanOrEqualTo(String value) {
            addCriterion("VISIT_CANCEL_RESION <=", value, "visitCancelResion");
            return (Criteria) this;
        }

        public Criteria andVisitCancelResionLike(String value) {
            addCriterion("VISIT_CANCEL_RESION like", value, "visitCancelResion");
            return (Criteria) this;
        }

        public Criteria andVisitCancelResionNotLike(String value) {
            addCriterion("VISIT_CANCEL_RESION not like", value, "visitCancelResion");
            return (Criteria) this;
        }

        public Criteria andVisitCancelResionIn(List<String> values) {
            addCriterion("VISIT_CANCEL_RESION in", values, "visitCancelResion");
            return (Criteria) this;
        }

        public Criteria andVisitCancelResionNotIn(List<String> values) {
            addCriterion("VISIT_CANCEL_RESION not in", values, "visitCancelResion");
            return (Criteria) this;
        }

        public Criteria andVisitCancelResionBetween(String value1, String value2) {
            addCriterion("VISIT_CANCEL_RESION between", value1, value2, "visitCancelResion");
            return (Criteria) this;
        }

        public Criteria andVisitCancelResionNotBetween(String value1, String value2) {
            addCriterion("VISIT_CANCEL_RESION not between", value1, value2, "visitCancelResion");
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

        public Criteria andRecVerEqualTo(BigDecimal value) {
            addCriterion("REC_VER =", value, "recVer");
            return (Criteria) this;
        }

        public Criteria andRecVerNotEqualTo(BigDecimal value) {
            addCriterion("REC_VER <>", value, "recVer");
            return (Criteria) this;
        }

        public Criteria andRecVerGreaterThan(BigDecimal value) {
            addCriterion("REC_VER >", value, "recVer");
            return (Criteria) this;
        }

        public Criteria andRecVerGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("REC_VER >=", value, "recVer");
            return (Criteria) this;
        }

        public Criteria andRecVerLessThan(BigDecimal value) {
            addCriterion("REC_VER <", value, "recVer");
            return (Criteria) this;
        }

        public Criteria andRecVerLessThanOrEqualTo(BigDecimal value) {
            addCriterion("REC_VER <=", value, "recVer");
            return (Criteria) this;
        }

        public Criteria andRecVerIn(List<BigDecimal> values) {
            addCriterion("REC_VER in", values, "recVer");
            return (Criteria) this;
        }

        public Criteria andRecVerNotIn(List<BigDecimal> values) {
            addCriterion("REC_VER not in", values, "recVer");
            return (Criteria) this;
        }

        public Criteria andRecVerBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("REC_VER between", value1, value2, "recVer");
            return (Criteria) this;
        }

        public Criteria andRecVerNotBetween(BigDecimal value1, BigDecimal value2) {
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

        public Criteria andTagSeqEqualTo(BigDecimal value) {
            addCriterion("TAG_SEQ =", value, "tagSeq");
            return (Criteria) this;
        }

        public Criteria andTagSeqNotEqualTo(BigDecimal value) {
            addCriterion("TAG_SEQ <>", value, "tagSeq");
            return (Criteria) this;
        }

        public Criteria andTagSeqGreaterThan(BigDecimal value) {
            addCriterion("TAG_SEQ >", value, "tagSeq");
            return (Criteria) this;
        }

        public Criteria andTagSeqGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("TAG_SEQ >=", value, "tagSeq");
            return (Criteria) this;
        }

        public Criteria andTagSeqLessThan(BigDecimal value) {
            addCriterion("TAG_SEQ <", value, "tagSeq");
            return (Criteria) this;
        }

        public Criteria andTagSeqLessThanOrEqualTo(BigDecimal value) {
            addCriterion("TAG_SEQ <=", value, "tagSeq");
            return (Criteria) this;
        }

        public Criteria andTagSeqIn(List<BigDecimal> values) {
            addCriterion("TAG_SEQ in", values, "tagSeq");
            return (Criteria) this;
        }

        public Criteria andTagSeqNotIn(List<BigDecimal> values) {
            addCriterion("TAG_SEQ not in", values, "tagSeq");
            return (Criteria) this;
        }

        public Criteria andTagSeqBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TAG_SEQ between", value1, value2, "tagSeq");
            return (Criteria) this;
        }

        public Criteria andTagSeqNotBetween(BigDecimal value1, BigDecimal value2) {
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