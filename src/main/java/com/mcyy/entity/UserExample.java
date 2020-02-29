package com.mcyy.entity;

import java.util.ArrayList;
import java.util.List;

public class UserExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserExample() {
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

        public Criteria andUIdIsNull() {
            addCriterion("u_id is null");
            return (Criteria) this;
        }

        public Criteria andUIdIsNotNull() {
            addCriterion("u_id is not null");
            return (Criteria) this;
        }

        public Criteria andUIdEqualTo(Integer value) {
            addCriterion("u_id =", value, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdNotEqualTo(Integer value) {
            addCriterion("u_id <>", value, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdGreaterThan(Integer value) {
            addCriterion("u_id >", value, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("u_id >=", value, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdLessThan(Integer value) {
            addCriterion("u_id <", value, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdLessThanOrEqualTo(Integer value) {
            addCriterion("u_id <=", value, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdIn(List<Integer> values) {
            addCriterion("u_id in", values, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdNotIn(List<Integer> values) {
            addCriterion("u_id not in", values, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdBetween(Integer value1, Integer value2) {
            addCriterion("u_id between", value1, value2, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdNotBetween(Integer value1, Integer value2) {
            addCriterion("u_id not between", value1, value2, "uId");
            return (Criteria) this;
        }

        public Criteria andUUsernameIsNull() {
            addCriterion("u_username is null");
            return (Criteria) this;
        }

        public Criteria andUUsernameIsNotNull() {
            addCriterion("u_username is not null");
            return (Criteria) this;
        }

        public Criteria andUUsernameEqualTo(String value) {
            addCriterion("u_username =", value, "uUsername");
            return (Criteria) this;
        }

        public Criteria andUUsernameNotEqualTo(String value) {
            addCriterion("u_username <>", value, "uUsername");
            return (Criteria) this;
        }

        public Criteria andUUsernameGreaterThan(String value) {
            addCriterion("u_username >", value, "uUsername");
            return (Criteria) this;
        }

        public Criteria andUUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("u_username >=", value, "uUsername");
            return (Criteria) this;
        }

        public Criteria andUUsernameLessThan(String value) {
            addCriterion("u_username <", value, "uUsername");
            return (Criteria) this;
        }

        public Criteria andUUsernameLessThanOrEqualTo(String value) {
            addCriterion("u_username <=", value, "uUsername");
            return (Criteria) this;
        }

        public Criteria andUUsernameLike(String value) {
            addCriterion("u_username like", value, "uUsername");
            return (Criteria) this;
        }

        public Criteria andUUsernameNotLike(String value) {
            addCriterion("u_username not like", value, "uUsername");
            return (Criteria) this;
        }

        public Criteria andUUsernameIn(List<String> values) {
            addCriterion("u_username in", values, "uUsername");
            return (Criteria) this;
        }

        public Criteria andUUsernameNotIn(List<String> values) {
            addCriterion("u_username not in", values, "uUsername");
            return (Criteria) this;
        }

        public Criteria andUUsernameBetween(String value1, String value2) {
            addCriterion("u_username between", value1, value2, "uUsername");
            return (Criteria) this;
        }

        public Criteria andUUsernameNotBetween(String value1, String value2) {
            addCriterion("u_username not between", value1, value2, "uUsername");
            return (Criteria) this;
        }

        public Criteria andUPasswordIsNull() {
            addCriterion("u_password is null");
            return (Criteria) this;
        }

        public Criteria andUPasswordIsNotNull() {
            addCriterion("u_password is not null");
            return (Criteria) this;
        }

        public Criteria andUPasswordEqualTo(String value) {
            addCriterion("u_password =", value, "uPassword");
            return (Criteria) this;
        }

        public Criteria andUPasswordNotEqualTo(String value) {
            addCriterion("u_password <>", value, "uPassword");
            return (Criteria) this;
        }

        public Criteria andUPasswordGreaterThan(String value) {
            addCriterion("u_password >", value, "uPassword");
            return (Criteria) this;
        }

        public Criteria andUPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("u_password >=", value, "uPassword");
            return (Criteria) this;
        }

        public Criteria andUPasswordLessThan(String value) {
            addCriterion("u_password <", value, "uPassword");
            return (Criteria) this;
        }

        public Criteria andUPasswordLessThanOrEqualTo(String value) {
            addCriterion("u_password <=", value, "uPassword");
            return (Criteria) this;
        }

        public Criteria andUPasswordLike(String value) {
            addCriterion("u_password like", value, "uPassword");
            return (Criteria) this;
        }

        public Criteria andUPasswordNotLike(String value) {
            addCriterion("u_password not like", value, "uPassword");
            return (Criteria) this;
        }

        public Criteria andUPasswordIn(List<String> values) {
            addCriterion("u_password in", values, "uPassword");
            return (Criteria) this;
        }

        public Criteria andUPasswordNotIn(List<String> values) {
            addCriterion("u_password not in", values, "uPassword");
            return (Criteria) this;
        }

        public Criteria andUPasswordBetween(String value1, String value2) {
            addCriterion("u_password between", value1, value2, "uPassword");
            return (Criteria) this;
        }

        public Criteria andUPasswordNotBetween(String value1, String value2) {
            addCriterion("u_password not between", value1, value2, "uPassword");
            return (Criteria) this;
        }

        public Criteria andULimitIsNull() {
            addCriterion("u_limit is null");
            return (Criteria) this;
        }

        public Criteria andULimitIsNotNull() {
            addCriterion("u_limit is not null");
            return (Criteria) this;
        }

        public Criteria andULimitEqualTo(Integer value) {
            addCriterion("u_limit =", value, "uLimit");
            return (Criteria) this;
        }

        public Criteria andULimitNotEqualTo(Integer value) {
            addCriterion("u_limit <>", value, "uLimit");
            return (Criteria) this;
        }

        public Criteria andULimitGreaterThan(Integer value) {
            addCriterion("u_limit >", value, "uLimit");
            return (Criteria) this;
        }

        public Criteria andULimitGreaterThanOrEqualTo(Integer value) {
            addCriterion("u_limit >=", value, "uLimit");
            return (Criteria) this;
        }

        public Criteria andULimitLessThan(Integer value) {
            addCriterion("u_limit <", value, "uLimit");
            return (Criteria) this;
        }

        public Criteria andULimitLessThanOrEqualTo(Integer value) {
            addCriterion("u_limit <=", value, "uLimit");
            return (Criteria) this;
        }

        public Criteria andULimitIn(List<Integer> values) {
            addCriterion("u_limit in", values, "uLimit");
            return (Criteria) this;
        }

        public Criteria andULimitNotIn(List<Integer> values) {
            addCriterion("u_limit not in", values, "uLimit");
            return (Criteria) this;
        }

        public Criteria andULimitBetween(Integer value1, Integer value2) {
            addCriterion("u_limit between", value1, value2, "uLimit");
            return (Criteria) this;
        }

        public Criteria andULimitNotBetween(Integer value1, Integer value2) {
            addCriterion("u_limit not between", value1, value2, "uLimit");
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