package com.mcyy.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ExcelExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ExcelExample() {
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
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andSalmedicinenameIsNull() {
            addCriterion("salmedicinename is null");
            return (Criteria) this;
        }

        public Criteria andSalmedicinenameIsNotNull() {
            addCriterion("salmedicinename is not null");
            return (Criteria) this;
        }

        public Criteria andSalmedicinenameEqualTo(String value) {
            addCriterion("salmedicinename =", value, "salmedicinename");
            return (Criteria) this;
        }

        public Criteria andSalmedicinenameNotEqualTo(String value) {
            addCriterion("salmedicinename <>", value, "salmedicinename");
            return (Criteria) this;
        }

        public Criteria andSalmedicinenameGreaterThan(String value) {
            addCriterion("salmedicinename >", value, "salmedicinename");
            return (Criteria) this;
        }

        public Criteria andSalmedicinenameGreaterThanOrEqualTo(String value) {
            addCriterion("salmedicinename >=", value, "salmedicinename");
            return (Criteria) this;
        }

        public Criteria andSalmedicinenameLessThan(String value) {
            addCriterion("salmedicinename <", value, "salmedicinename");
            return (Criteria) this;
        }

        public Criteria andSalmedicinenameLessThanOrEqualTo(String value) {
            addCriterion("salmedicinename <=", value, "salmedicinename");
            return (Criteria) this;
        }

        public Criteria andSalmedicinenameLike(String value) {
            addCriterion("salmedicinename like", value, "salmedicinename");
            return (Criteria) this;
        }

        public Criteria andSalmedicinenameNotLike(String value) {
            addCriterion("salmedicinename not like", value, "salmedicinename");
            return (Criteria) this;
        }

        public Criteria andSalmedicinenameIn(List<String> values) {
            addCriterion("salmedicinename in", values, "salmedicinename");
            return (Criteria) this;
        }

        public Criteria andSalmedicinenameNotIn(List<String> values) {
            addCriterion("salmedicinename not in", values, "salmedicinename");
            return (Criteria) this;
        }

        public Criteria andSalmedicinenameBetween(String value1, String value2) {
            addCriterion("salmedicinename between", value1, value2, "salmedicinename");
            return (Criteria) this;
        }

        public Criteria andSalmedicinenameNotBetween(String value1, String value2) {
            addCriterion("salmedicinename not between", value1, value2, "salmedicinename");
            return (Criteria) this;
        }

        public Criteria andSalamountIsNull() {
            addCriterion("salamount is null");
            return (Criteria) this;
        }

        public Criteria andSalamountIsNotNull() {
            addCriterion("salamount is not null");
            return (Criteria) this;
        }

        public Criteria andSalamountEqualTo(String value) {
            addCriterion("salamount =", value, "salamount");
            return (Criteria) this;
        }

        public Criteria andSalamountNotEqualTo(String value) {
            addCriterion("salamount <>", value, "salamount");
            return (Criteria) this;
        }

        public Criteria andSalamountGreaterThan(String value) {
            addCriterion("salamount >", value, "salamount");
            return (Criteria) this;
        }

        public Criteria andSalamountGreaterThanOrEqualTo(String value) {
            addCriterion("salamount >=", value, "salamount");
            return (Criteria) this;
        }

        public Criteria andSalamountLessThan(String value) {
            addCriterion("salamount <", value, "salamount");
            return (Criteria) this;
        }

        public Criteria andSalamountLessThanOrEqualTo(String value) {
            addCriterion("salamount <=", value, "salamount");
            return (Criteria) this;
        }

        public Criteria andSalamountLike(String value) {
            addCriterion("salamount like", value, "salamount");
            return (Criteria) this;
        }

        public Criteria andSalamountNotLike(String value) {
            addCriterion("salamount not like", value, "salamount");
            return (Criteria) this;
        }

        public Criteria andSalamountIn(List<String> values) {
            addCriterion("salamount in", values, "salamount");
            return (Criteria) this;
        }

        public Criteria andSalamountNotIn(List<String> values) {
            addCriterion("salamount not in", values, "salamount");
            return (Criteria) this;
        }

        public Criteria andSalamountBetween(String value1, String value2) {
            addCriterion("salamount between", value1, value2, "salamount");
            return (Criteria) this;
        }

        public Criteria andSalamountNotBetween(String value1, String value2) {
            addCriterion("salamount not between", value1, value2, "salamount");
            return (Criteria) this;
        }

        public Criteria andSalpriceIsNull() {
            addCriterion("salprice is null");
            return (Criteria) this;
        }

        public Criteria andSalpriceIsNotNull() {
            addCriterion("salprice is not null");
            return (Criteria) this;
        }

        public Criteria andSalpriceEqualTo(String value) {
            addCriterion("salprice =", value, "salprice");
            return (Criteria) this;
        }

        public Criteria andSalpriceNotEqualTo(String value) {
            addCriterion("salprice <>", value, "salprice");
            return (Criteria) this;
        }

        public Criteria andSalpriceGreaterThan(String value) {
            addCriterion("salprice >", value, "salprice");
            return (Criteria) this;
        }

        public Criteria andSalpriceGreaterThanOrEqualTo(String value) {
            addCriterion("salprice >=", value, "salprice");
            return (Criteria) this;
        }

        public Criteria andSalpriceLessThan(String value) {
            addCriterion("salprice <", value, "salprice");
            return (Criteria) this;
        }

        public Criteria andSalpriceLessThanOrEqualTo(String value) {
            addCriterion("salprice <=", value, "salprice");
            return (Criteria) this;
        }

        public Criteria andSalpriceLike(String value) {
            addCriterion("salprice like", value, "salprice");
            return (Criteria) this;
        }

        public Criteria andSalpriceNotLike(String value) {
            addCriterion("salprice not like", value, "salprice");
            return (Criteria) this;
        }

        public Criteria andSalpriceIn(List<String> values) {
            addCriterion("salprice in", values, "salprice");
            return (Criteria) this;
        }

        public Criteria andSalpriceNotIn(List<String> values) {
            addCriterion("salprice not in", values, "salprice");
            return (Criteria) this;
        }

        public Criteria andSalpriceBetween(String value1, String value2) {
            addCriterion("salprice between", value1, value2, "salprice");
            return (Criteria) this;
        }

        public Criteria andSalpriceNotBetween(String value1, String value2) {
            addCriterion("salprice not between", value1, value2, "salprice");
            return (Criteria) this;
        }

        public Criteria andSaldateIsNull() {
            addCriterion("saldate is null");
            return (Criteria) this;
        }

        public Criteria andSaldateIsNotNull() {
            addCriterion("saldate is not null");
            return (Criteria) this;
        }

        public Criteria andSaldateEqualTo(Date value) {
            addCriterion("saldate =", value, "saldate");
            return (Criteria) this;
        }

        public Criteria andSaldateNotEqualTo(Date value) {
            addCriterion("saldate <>", value, "saldate");
            return (Criteria) this;
        }

        public Criteria andSaldateGreaterThan(Date value) {
            addCriterion("saldate >", value, "saldate");
            return (Criteria) this;
        }

        public Criteria andSaldateGreaterThanOrEqualTo(Date value) {
            addCriterion("saldate >=", value, "saldate");
            return (Criteria) this;
        }

        public Criteria andSaldateLessThan(Date value) {
            addCriterion("saldate <", value, "saldate");
            return (Criteria) this;
        }

        public Criteria andSaldateLessThanOrEqualTo(Date value) {
            addCriterion("saldate <=", value, "saldate");
            return (Criteria) this;
        }

        public Criteria andSaldateIn(List<Date> values) {
            addCriterion("saldate in", values, "saldate");
            return (Criteria) this;
        }

        public Criteria andSaldateNotIn(List<Date> values) {
            addCriterion("saldate not in", values, "saldate");
            return (Criteria) this;
        }

        public Criteria andSaldateBetween(Date value1, Date value2) {
            addCriterion("saldate between", value1, value2, "saldate");
            return (Criteria) this;
        }

        public Criteria andSaldateNotBetween(Date value1, Date value2) {
            addCriterion("saldate not between", value1, value2, "saldate");
            return (Criteria) this;
        }

        public Criteria andSalnameIsNull() {
            addCriterion("salname is null");
            return (Criteria) this;
        }

        public Criteria andSalnameIsNotNull() {
            addCriterion("salname is not null");
            return (Criteria) this;
        }

        public Criteria andSalnameEqualTo(String value) {
            addCriterion("salname =", value, "salname");
            return (Criteria) this;
        }

        public Criteria andSalnameNotEqualTo(String value) {
            addCriterion("salname <>", value, "salname");
            return (Criteria) this;
        }

        public Criteria andSalnameGreaterThan(String value) {
            addCriterion("salname >", value, "salname");
            return (Criteria) this;
        }

        public Criteria andSalnameGreaterThanOrEqualTo(String value) {
            addCriterion("salname >=", value, "salname");
            return (Criteria) this;
        }

        public Criteria andSalnameLessThan(String value) {
            addCriterion("salname <", value, "salname");
            return (Criteria) this;
        }

        public Criteria andSalnameLessThanOrEqualTo(String value) {
            addCriterion("salname <=", value, "salname");
            return (Criteria) this;
        }

        public Criteria andSalnameLike(String value) {
            addCriterion("salname like", value, "salname");
            return (Criteria) this;
        }

        public Criteria andSalnameNotLike(String value) {
            addCriterion("salname not like", value, "salname");
            return (Criteria) this;
        }

        public Criteria andSalnameIn(List<String> values) {
            addCriterion("salname in", values, "salname");
            return (Criteria) this;
        }

        public Criteria andSalnameNotIn(List<String> values) {
            addCriterion("salname not in", values, "salname");
            return (Criteria) this;
        }

        public Criteria andSalnameBetween(String value1, String value2) {
            addCriterion("salname between", value1, value2, "salname");
            return (Criteria) this;
        }

        public Criteria andSalnameNotBetween(String value1, String value2) {
            addCriterion("salname not between", value1, value2, "salname");
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