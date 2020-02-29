package com.mcyy.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class MedicineExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MedicineExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andMIdIsNull() {
            addCriterion("m_id is null");
            return (Criteria) this;
        }

        public Criteria andMIdIsNotNull() {
            addCriterion("m_id is not null");
            return (Criteria) this;
        }

        public Criteria andMIdEqualTo(Integer value) {
            addCriterion("m_id =", value, "mId");
            return (Criteria) this;
        }

        public Criteria andMIdNotEqualTo(Integer value) {
            addCriterion("m_id <>", value, "mId");
            return (Criteria) this;
        }

        public Criteria andMIdGreaterThan(Integer value) {
            addCriterion("m_id >", value, "mId");
            return (Criteria) this;
        }

        public Criteria andMIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("m_id >=", value, "mId");
            return (Criteria) this;
        }

        public Criteria andMIdLessThan(Integer value) {
            addCriterion("m_id <", value, "mId");
            return (Criteria) this;
        }

        public Criteria andMIdLessThanOrEqualTo(Integer value) {
            addCriterion("m_id <=", value, "mId");
            return (Criteria) this;
        }

        public Criteria andMIdIn(List<Integer> values) {
            addCriterion("m_id in", values, "mId");
            return (Criteria) this;
        }

        public Criteria andMIdNotIn(List<Integer> values) {
            addCriterion("m_id not in", values, "mId");
            return (Criteria) this;
        }

        public Criteria andMIdBetween(Integer value1, Integer value2) {
            addCriterion("m_id between", value1, value2, "mId");
            return (Criteria) this;
        }

        public Criteria andMIdNotBetween(Integer value1, Integer value2) {
            addCriterion("m_id not between", value1, value2, "mId");
            return (Criteria) this;
        }

        public Criteria andMMedicineidIsNull() {
            addCriterion("m_medicineid is null");
            return (Criteria) this;
        }

        public Criteria andMMedicineidIsNotNull() {
            addCriterion("m_medicineid is not null");
            return (Criteria) this;
        }

        public Criteria andMMedicineidEqualTo(Integer value) {
            addCriterion("m_medicineid =", value, "mMedicineid");
            return (Criteria) this;
        }

        public Criteria andMMedicineidNotEqualTo(Integer value) {
            addCriterion("m_medicineid <>", value, "mMedicineid");
            return (Criteria) this;
        }

        public Criteria andMMedicineidGreaterThan(Integer value) {
            addCriterion("m_medicineid >", value, "mMedicineid");
            return (Criteria) this;
        }

        public Criteria andMMedicineidGreaterThanOrEqualTo(Integer value) {
            addCriterion("m_medicineid >=", value, "mMedicineid");
            return (Criteria) this;
        }

        public Criteria andMMedicineidLessThan(Integer value) {
            addCriterion("m_medicineid <", value, "mMedicineid");
            return (Criteria) this;
        }

        public Criteria andMMedicineidLessThanOrEqualTo(Integer value) {
            addCriterion("m_medicineid <=", value, "mMedicineid");
            return (Criteria) this;
        }

        public Criteria andMMedicineidIn(List<Integer> values) {
            addCriterion("m_medicineid in", values, "mMedicineid");
            return (Criteria) this;
        }

        public Criteria andMMedicineidNotIn(List<Integer> values) {
            addCriterion("m_medicineid not in", values, "mMedicineid");
            return (Criteria) this;
        }

        public Criteria andMMedicineidBetween(Integer value1, Integer value2) {
            addCriterion("m_medicineid between", value1, value2, "mMedicineid");
            return (Criteria) this;
        }

        public Criteria andMMedicineidNotBetween(Integer value1, Integer value2) {
            addCriterion("m_medicineid not between", value1, value2, "mMedicineid");
            return (Criteria) this;
        }

        public Criteria andMNameIsNull() {
            addCriterion("m_name is null");
            return (Criteria) this;
        }

        public Criteria andMNameIsNotNull() {
            addCriterion("m_name is not null");
            return (Criteria) this;
        }

        public Criteria andMNameEqualTo(String value) {
            addCriterion("m_name =", value, "mName");
            return (Criteria) this;
        }

        public Criteria andMNameNotEqualTo(String value) {
            addCriterion("m_name <>", value, "mName");
            return (Criteria) this;
        }

        public Criteria andMNameGreaterThan(String value) {
            addCriterion("m_name >", value, "mName");
            return (Criteria) this;
        }

        public Criteria andMNameGreaterThanOrEqualTo(String value) {
            addCriterion("m_name >=", value, "mName");
            return (Criteria) this;
        }

        public Criteria andMNameLessThan(String value) {
            addCriterion("m_name <", value, "mName");
            return (Criteria) this;
        }

        public Criteria andMNameLessThanOrEqualTo(String value) {
            addCriterion("m_name <=", value, "mName");
            return (Criteria) this;
        }

        public Criteria andMNameLike(String value) {
            addCriterion("m_name like", value, "mName");
            return (Criteria) this;
        }

        public Criteria andMNameNotLike(String value) {
            addCriterion("m_name not like", value, "mName");
            return (Criteria) this;
        }

        public Criteria andMNameIn(List<String> values) {
            addCriterion("m_name in", values, "mName");
            return (Criteria) this;
        }

        public Criteria andMNameNotIn(List<String> values) {
            addCriterion("m_name not in", values, "mName");
            return (Criteria) this;
        }

        public Criteria andMNameBetween(String value1, String value2) {
            addCriterion("m_name between", value1, value2, "mName");
            return (Criteria) this;
        }

        public Criteria andMNameNotBetween(String value1, String value2) {
            addCriterion("m_name not between", value1, value2, "mName");
            return (Criteria) this;
        }

        public Criteria andMStateIsNull() {
            addCriterion("m_state is null");
            return (Criteria) this;
        }

        public Criteria andMStateIsNotNull() {
            addCriterion("m_state is not null");
            return (Criteria) this;
        }

        public Criteria andMStateEqualTo(String value) {
            addCriterion("m_state =", value, "mState");
            return (Criteria) this;
        }

        public Criteria andMStateNotEqualTo(String value) {
            addCriterion("m_state <>", value, "mState");
            return (Criteria) this;
        }

        public Criteria andMStateGreaterThan(String value) {
            addCriterion("m_state >", value, "mState");
            return (Criteria) this;
        }

        public Criteria andMStateGreaterThanOrEqualTo(String value) {
            addCriterion("m_state >=", value, "mState");
            return (Criteria) this;
        }

        public Criteria andMStateLessThan(String value) {
            addCriterion("m_state <", value, "mState");
            return (Criteria) this;
        }

        public Criteria andMStateLessThanOrEqualTo(String value) {
            addCriterion("m_state <=", value, "mState");
            return (Criteria) this;
        }

        public Criteria andMStateLike(String value) {
            addCriterion("m_state like", value, "mState");
            return (Criteria) this;
        }

        public Criteria andMStateNotLike(String value) {
            addCriterion("m_state not like", value, "mState");
            return (Criteria) this;
        }

        public Criteria andMStateIn(List<String> values) {
            addCriterion("m_state in", values, "mState");
            return (Criteria) this;
        }

        public Criteria andMStateNotIn(List<String> values) {
            addCriterion("m_state not in", values, "mState");
            return (Criteria) this;
        }

        public Criteria andMStateBetween(String value1, String value2) {
            addCriterion("m_state between", value1, value2, "mState");
            return (Criteria) this;
        }

        public Criteria andMStateNotBetween(String value1, String value2) {
            addCriterion("m_state not between", value1, value2, "mState");
            return (Criteria) this;
        }

        public Criteria andMPriceIsNull() {
            addCriterion("m_price is null");
            return (Criteria) this;
        }

        public Criteria andMPriceIsNotNull() {
            addCriterion("m_price is not null");
            return (Criteria) this;
        }

        public Criteria andMPriceEqualTo(BigDecimal value) {
            addCriterion("m_price =", value, "mPrice");
            return (Criteria) this;
        }

        public Criteria andMPriceNotEqualTo(BigDecimal value) {
            addCriterion("m_price <>", value, "mPrice");
            return (Criteria) this;
        }

        public Criteria andMPriceGreaterThan(BigDecimal value) {
            addCriterion("m_price >", value, "mPrice");
            return (Criteria) this;
        }

        public Criteria andMPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("m_price >=", value, "mPrice");
            return (Criteria) this;
        }

        public Criteria andMPriceLessThan(BigDecimal value) {
            addCriterion("m_price <", value, "mPrice");
            return (Criteria) this;
        }

        public Criteria andMPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("m_price <=", value, "mPrice");
            return (Criteria) this;
        }

        public Criteria andMPriceIn(List<BigDecimal> values) {
            addCriterion("m_price in", values, "mPrice");
            return (Criteria) this;
        }

        public Criteria andMPriceNotIn(List<BigDecimal> values) {
            addCriterion("m_price not in", values, "mPrice");
            return (Criteria) this;
        }

        public Criteria andMPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("m_price between", value1, value2, "mPrice");
            return (Criteria) this;
        }

        public Criteria andMPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("m_price not between", value1, value2, "mPrice");
            return (Criteria) this;
        }

        public Criteria andMInventoryIsNull() {
            addCriterion("m_inventory is null");
            return (Criteria) this;
        }

        public Criteria andMInventoryIsNotNull() {
            addCriterion("m_inventory is not null");
            return (Criteria) this;
        }

        public Criteria andMInventoryEqualTo(Integer value) {
            addCriterion("m_inventory =", value, "mInventory");
            return (Criteria) this;
        }

        public Criteria andMInventoryNotEqualTo(Integer value) {
            addCriterion("m_inventory <>", value, "mInventory");
            return (Criteria) this;
        }

        public Criteria andMInventoryGreaterThan(Integer value) {
            addCriterion("m_inventory >", value, "mInventory");
            return (Criteria) this;
        }

        public Criteria andMInventoryGreaterThanOrEqualTo(Integer value) {
            addCriterion("m_inventory >=", value, "mInventory");
            return (Criteria) this;
        }

        public Criteria andMInventoryLessThan(Integer value) {
            addCriterion("m_inventory <", value, "mInventory");
            return (Criteria) this;
        }

        public Criteria andMInventoryLessThanOrEqualTo(Integer value) {
            addCriterion("m_inventory <=", value, "mInventory");
            return (Criteria) this;
        }

        public Criteria andMInventoryIn(List<Integer> values) {
            addCriterion("m_inventory in", values, "mInventory");
            return (Criteria) this;
        }

        public Criteria andMInventoryNotIn(List<Integer> values) {
            addCriterion("m_inventory not in", values, "mInventory");
            return (Criteria) this;
        }

        public Criteria andMInventoryBetween(Integer value1, Integer value2) {
            addCriterion("m_inventory between", value1, value2, "mInventory");
            return (Criteria) this;
        }

        public Criteria andMInventoryNotBetween(Integer value1, Integer value2) {
            addCriterion("m_inventory not between", value1, value2, "mInventory");
            return (Criteria) this;
        }

        public Criteria andMPastdateIsNull() {
            addCriterion("m_pastdate is null");
            return (Criteria) this;
        }

        public Criteria andMPastdateIsNotNull() {
            addCriterion("m_pastdate is not null");
            return (Criteria) this;
        }

        public Criteria andMPastdateEqualTo(Date value) {
            addCriterionForJDBCDate("m_pastdate =", value, "mPastdate");
            return (Criteria) this;
        }

        public Criteria andMPastdateNotEqualTo(Date value) {
            addCriterionForJDBCDate("m_pastdate <>", value, "mPastdate");
            return (Criteria) this;
        }

        public Criteria andMPastdateGreaterThan(Date value) {
            addCriterionForJDBCDate("m_pastdate >", value, "mPastdate");
            return (Criteria) this;
        }

        public Criteria andMPastdateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("m_pastdate >=", value, "mPastdate");
            return (Criteria) this;
        }

        public Criteria andMPastdateLessThan(Date value) {
            addCriterionForJDBCDate("m_pastdate <", value, "mPastdate");
            return (Criteria) this;
        }

        public Criteria andMPastdateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("m_pastdate <=", value, "mPastdate");
            return (Criteria) this;
        }

        public Criteria andMPastdateIn(List<Date> values) {
            addCriterionForJDBCDate("m_pastdate in", values, "mPastdate");
            return (Criteria) this;
        }

        public Criteria andMPastdateNotIn(List<Date> values) {
            addCriterionForJDBCDate("m_pastdate not in", values, "mPastdate");
            return (Criteria) this;
        }

        public Criteria andMPastdateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("m_pastdate between", value1, value2, "mPastdate");
            return (Criteria) this;
        }

        public Criteria andMPastdateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("m_pastdate not between", value1, value2, "mPastdate");
            return (Criteria) this;
        }

        public Criteria andMClassifyIsNull() {
            addCriterion("m_classify is null");
            return (Criteria) this;
        }

        public Criteria andMClassifyIsNotNull() {
            addCriterion("m_classify is not null");
            return (Criteria) this;
        }

        public Criteria andMClassifyEqualTo(String value) {
            addCriterion("m_classify =", value, "mClassify");
            return (Criteria) this;
        }

        public Criteria andMClassifyNotEqualTo(String value) {
            addCriterion("m_classify <>", value, "mClassify");
            return (Criteria) this;
        }

        public Criteria andMClassifyGreaterThan(String value) {
            addCriterion("m_classify >", value, "mClassify");
            return (Criteria) this;
        }

        public Criteria andMClassifyGreaterThanOrEqualTo(String value) {
            addCriterion("m_classify >=", value, "mClassify");
            return (Criteria) this;
        }

        public Criteria andMClassifyLessThan(String value) {
            addCriterion("m_classify <", value, "mClassify");
            return (Criteria) this;
        }

        public Criteria andMClassifyLessThanOrEqualTo(String value) {
            addCriterion("m_classify <=", value, "mClassify");
            return (Criteria) this;
        }

        public Criteria andMClassifyLike(String value) {
            addCriterion("m_classify like", value, "mClassify");
            return (Criteria) this;
        }

        public Criteria andMClassifyNotLike(String value) {
            addCriterion("m_classify not like", value, "mClassify");
            return (Criteria) this;
        }

        public Criteria andMClassifyIn(List<String> values) {
            addCriterion("m_classify in", values, "mClassify");
            return (Criteria) this;
        }

        public Criteria andMClassifyNotIn(List<String> values) {
            addCriterion("m_classify not in", values, "mClassify");
            return (Criteria) this;
        }

        public Criteria andMClassifyBetween(String value1, String value2) {
            addCriterion("m_classify between", value1, value2, "mClassify");
            return (Criteria) this;
        }

        public Criteria andMClassifyNotBetween(String value1, String value2) {
            addCriterion("m_classify not between", value1, value2, "mClassify");
            return (Criteria) this;
        }

        public Criteria andMRemarkIsNull() {
            addCriterion("m_remark is null");
            return (Criteria) this;
        }

        public Criteria andMRemarkIsNotNull() {
            addCriterion("m_remark is not null");
            return (Criteria) this;
        }

        public Criteria andMRemarkEqualTo(String value) {
            addCriterion("m_remark =", value, "mRemark");
            return (Criteria) this;
        }

        public Criteria andMRemarkNotEqualTo(String value) {
            addCriterion("m_remark <>", value, "mRemark");
            return (Criteria) this;
        }

        public Criteria andMRemarkGreaterThan(String value) {
            addCriterion("m_remark >", value, "mRemark");
            return (Criteria) this;
        }

        public Criteria andMRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("m_remark >=", value, "mRemark");
            return (Criteria) this;
        }

        public Criteria andMRemarkLessThan(String value) {
            addCriterion("m_remark <", value, "mRemark");
            return (Criteria) this;
        }

        public Criteria andMRemarkLessThanOrEqualTo(String value) {
            addCriterion("m_remark <=", value, "mRemark");
            return (Criteria) this;
        }

        public Criteria andMRemarkLike(String value) {
            addCriterion("m_remark like", value, "mRemark");
            return (Criteria) this;
        }

        public Criteria andMRemarkNotLike(String value) {
            addCriterion("m_remark not like", value, "mRemark");
            return (Criteria) this;
        }

        public Criteria andMRemarkIn(List<String> values) {
            addCriterion("m_remark in", values, "mRemark");
            return (Criteria) this;
        }

        public Criteria andMRemarkNotIn(List<String> values) {
            addCriterion("m_remark not in", values, "mRemark");
            return (Criteria) this;
        }

        public Criteria andMRemarkBetween(String value1, String value2) {
            addCriterion("m_remark between", value1, value2, "mRemark");
            return (Criteria) this;
        }

        public Criteria andMRemarkNotBetween(String value1, String value2) {
            addCriterion("m_remark not between", value1, value2, "mRemark");
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