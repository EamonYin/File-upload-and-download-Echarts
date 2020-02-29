package com.mcyy.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SalesmessageExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SalesmessageExample() {
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

        public Criteria andSmIdIsNull() {
            addCriterion("sm_id is null");
            return (Criteria) this;
        }

        public Criteria andSmIdIsNotNull() {
            addCriterion("sm_id is not null");
            return (Criteria) this;
        }

        public Criteria andSmIdEqualTo(Integer value) {
            addCriterion("sm_id =", value, "smId");
            return (Criteria) this;
        }

        public Criteria andSmIdNotEqualTo(Integer value) {
            addCriterion("sm_id <>", value, "smId");
            return (Criteria) this;
        }

        public Criteria andSmIdGreaterThan(Integer value) {
            addCriterion("sm_id >", value, "smId");
            return (Criteria) this;
        }

        public Criteria andSmIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("sm_id >=", value, "smId");
            return (Criteria) this;
        }

        public Criteria andSmIdLessThan(Integer value) {
            addCriterion("sm_id <", value, "smId");
            return (Criteria) this;
        }

        public Criteria andSmIdLessThanOrEqualTo(Integer value) {
            addCriterion("sm_id <=", value, "smId");
            return (Criteria) this;
        }

        public Criteria andSmIdIn(List<Integer> values) {
            addCriterion("sm_id in", values, "smId");
            return (Criteria) this;
        }

        public Criteria andSmIdNotIn(List<Integer> values) {
            addCriterion("sm_id not in", values, "smId");
            return (Criteria) this;
        }

        public Criteria andSmIdBetween(Integer value1, Integer value2) {
            addCriterion("sm_id between", value1, value2, "smId");
            return (Criteria) this;
        }

        public Criteria andSmIdNotBetween(Integer value1, Integer value2) {
            addCriterion("sm_id not between", value1, value2, "smId");
            return (Criteria) this;
        }

        public Criteria andSmMedicineidIsNull() {
            addCriterion("sm_medicineid is null");
            return (Criteria) this;
        }

        public Criteria andSmMedicineidIsNotNull() {
            addCriterion("sm_medicineid is not null");
            return (Criteria) this;
        }

        public Criteria andSmMedicineidEqualTo(Integer value) {
            addCriterion("sm_medicineid =", value, "smMedicineid");
            return (Criteria) this;
        }

        public Criteria andSmMedicineidNotEqualTo(Integer value) {
            addCriterion("sm_medicineid <>", value, "smMedicineid");
            return (Criteria) this;
        }

        public Criteria andSmMedicineidGreaterThan(Integer value) {
            addCriterion("sm_medicineid >", value, "smMedicineid");
            return (Criteria) this;
        }

        public Criteria andSmMedicineidGreaterThanOrEqualTo(Integer value) {
            addCriterion("sm_medicineid >=", value, "smMedicineid");
            return (Criteria) this;
        }

        public Criteria andSmMedicineidLessThan(Integer value) {
            addCriterion("sm_medicineid <", value, "smMedicineid");
            return (Criteria) this;
        }

        public Criteria andSmMedicineidLessThanOrEqualTo(Integer value) {
            addCriterion("sm_medicineid <=", value, "smMedicineid");
            return (Criteria) this;
        }

        public Criteria andSmMedicineidIn(List<Integer> values) {
            addCriterion("sm_medicineid in", values, "smMedicineid");
            return (Criteria) this;
        }

        public Criteria andSmMedicineidNotIn(List<Integer> values) {
            addCriterion("sm_medicineid not in", values, "smMedicineid");
            return (Criteria) this;
        }

        public Criteria andSmMedicineidBetween(Integer value1, Integer value2) {
            addCriterion("sm_medicineid between", value1, value2, "smMedicineid");
            return (Criteria) this;
        }

        public Criteria andSmMedicineidNotBetween(Integer value1, Integer value2) {
            addCriterion("sm_medicineid not between", value1, value2, "smMedicineid");
            return (Criteria) this;
        }

        public Criteria andSmUseridIsNull() {
            addCriterion("sm_userid is null");
            return (Criteria) this;
        }

        public Criteria andSmUseridIsNotNull() {
            addCriterion("sm_userid is not null");
            return (Criteria) this;
        }

        public Criteria andSmUseridEqualTo(Integer value) {
            addCriterion("sm_userid =", value, "smUserid");
            return (Criteria) this;
        }

        public Criteria andSmUseridNotEqualTo(Integer value) {
            addCriterion("sm_userid <>", value, "smUserid");
            return (Criteria) this;
        }

        public Criteria andSmUseridGreaterThan(Integer value) {
            addCriterion("sm_userid >", value, "smUserid");
            return (Criteria) this;
        }

        public Criteria andSmUseridGreaterThanOrEqualTo(Integer value) {
            addCriterion("sm_userid >=", value, "smUserid");
            return (Criteria) this;
        }

        public Criteria andSmUseridLessThan(Integer value) {
            addCriterion("sm_userid <", value, "smUserid");
            return (Criteria) this;
        }

        public Criteria andSmUseridLessThanOrEqualTo(Integer value) {
            addCriterion("sm_userid <=", value, "smUserid");
            return (Criteria) this;
        }

        public Criteria andSmUseridIn(List<Integer> values) {
            addCriterion("sm_userid in", values, "smUserid");
            return (Criteria) this;
        }

        public Criteria andSmUseridNotIn(List<Integer> values) {
            addCriterion("sm_userid not in", values, "smUserid");
            return (Criteria) this;
        }

        public Criteria andSmUseridBetween(Integer value1, Integer value2) {
            addCriterion("sm_userid between", value1, value2, "smUserid");
            return (Criteria) this;
        }

        public Criteria andSmUseridNotBetween(Integer value1, Integer value2) {
            addCriterion("sm_userid not between", value1, value2, "smUserid");
            return (Criteria) this;
        }

        public Criteria andSmDataIsNull() {
            addCriterion("sm_data is null");
            return (Criteria) this;
        }

        public Criteria andSmDataIsNotNull() {
            addCriterion("sm_data is not null");
            return (Criteria) this;
        }

        public Criteria andSmDataEqualTo(Date value) {
            addCriterion("sm_data =", value, "smData");
            return (Criteria) this;
        }

        public Criteria andSmDataNotEqualTo(Date value) {
            addCriterion("sm_data <>", value, "smData");
            return (Criteria) this;
        }

        public Criteria andSmDataGreaterThan(Date value) {
            addCriterion("sm_data >", value, "smData");
            return (Criteria) this;
        }

        public Criteria andSmDataGreaterThanOrEqualTo(Date value) {
            addCriterion("sm_data >=", value, "smData");
            return (Criteria) this;
        }

        public Criteria andSmDataLessThan(Date value) {
            addCriterion("sm_data <", value, "smData");
            return (Criteria) this;
        }

        public Criteria andSmDataLessThanOrEqualTo(Date value) {
            addCriterion("sm_data <=", value, "smData");
            return (Criteria) this;
        }

        public Criteria andSmDataIn(List<Date> values) {
            addCriterion("sm_data in", values, "smData");
            return (Criteria) this;
        }

        public Criteria andSmDataNotIn(List<Date> values) {
            addCriterion("sm_data not in", values, "smData");
            return (Criteria) this;
        }

        public Criteria andSmDataBetween(Date value1, Date value2) {
            addCriterion("sm_data between", value1, value2, "smData");
            return (Criteria) this;
        }

        public Criteria andSmDataNotBetween(Date value1, Date value2) {
            addCriterion("sm_data not between", value1, value2, "smData");
            return (Criteria) this;
        }

        public Criteria andSmInventoryIsNull() {
            addCriterion("sm_inventory is null");
            return (Criteria) this;
        }

        public Criteria andSmInventoryIsNotNull() {
            addCriterion("sm_inventory is not null");
            return (Criteria) this;
        }

        public Criteria andSmInventoryEqualTo(Integer value) {
            addCriterion("sm_inventory =", value, "smInventory");
            return (Criteria) this;
        }

        public Criteria andSmInventoryNotEqualTo(Integer value) {
            addCriterion("sm_inventory <>", value, "smInventory");
            return (Criteria) this;
        }

        public Criteria andSmInventoryGreaterThan(Integer value) {
            addCriterion("sm_inventory >", value, "smInventory");
            return (Criteria) this;
        }

        public Criteria andSmInventoryGreaterThanOrEqualTo(Integer value) {
            addCriterion("sm_inventory >=", value, "smInventory");
            return (Criteria) this;
        }

        public Criteria andSmInventoryLessThan(Integer value) {
            addCriterion("sm_inventory <", value, "smInventory");
            return (Criteria) this;
        }

        public Criteria andSmInventoryLessThanOrEqualTo(Integer value) {
            addCriterion("sm_inventory <=", value, "smInventory");
            return (Criteria) this;
        }

        public Criteria andSmInventoryIn(List<Integer> values) {
            addCriterion("sm_inventory in", values, "smInventory");
            return (Criteria) this;
        }

        public Criteria andSmInventoryNotIn(List<Integer> values) {
            addCriterion("sm_inventory not in", values, "smInventory");
            return (Criteria) this;
        }

        public Criteria andSmInventoryBetween(Integer value1, Integer value2) {
            addCriterion("sm_inventory between", value1, value2, "smInventory");
            return (Criteria) this;
        }

        public Criteria andSmInventoryNotBetween(Integer value1, Integer value2) {
            addCriterion("sm_inventory not between", value1, value2, "smInventory");
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