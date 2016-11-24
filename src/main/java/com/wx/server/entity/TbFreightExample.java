package com.wx.server.entity;

import com.wx.server.vo.page.Page;
import java.util.ArrayList;
import java.util.List;

public class TbFreightExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Page page;

    public TbFreightExample() {
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

    public void setPage(Page page) {
        this.page=page;
    }

    public Page getPage() {
        return page;
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

        public Criteria andFgtIdIsNull() {
            addCriterion("fgt_id is null");
            return (Criteria) this;
        }

        public Criteria andFgtIdIsNotNull() {
            addCriterion("fgt_id is not null");
            return (Criteria) this;
        }

        public Criteria andFgtIdEqualTo(Integer value) {
            addCriterion("fgt_id =", value, "fgtId");
            return (Criteria) this;
        }

        public Criteria andFgtIdNotEqualTo(Integer value) {
            addCriterion("fgt_id <>", value, "fgtId");
            return (Criteria) this;
        }

        public Criteria andFgtIdGreaterThan(Integer value) {
            addCriterion("fgt_id >", value, "fgtId");
            return (Criteria) this;
        }

        public Criteria andFgtIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("fgt_id >=", value, "fgtId");
            return (Criteria) this;
        }

        public Criteria andFgtIdLessThan(Integer value) {
            addCriterion("fgt_id <", value, "fgtId");
            return (Criteria) this;
        }

        public Criteria andFgtIdLessThanOrEqualTo(Integer value) {
            addCriterion("fgt_id <=", value, "fgtId");
            return (Criteria) this;
        }

        public Criteria andFgtIdIn(List<Integer> values) {
            addCriterion("fgt_id in", values, "fgtId");
            return (Criteria) this;
        }

        public Criteria andFgtIdNotIn(List<Integer> values) {
            addCriterion("fgt_id not in", values, "fgtId");
            return (Criteria) this;
        }

        public Criteria andFgtIdBetween(Integer value1, Integer value2) {
            addCriterion("fgt_id between", value1, value2, "fgtId");
            return (Criteria) this;
        }

        public Criteria andFgtIdNotBetween(Integer value1, Integer value2) {
            addCriterion("fgt_id not between", value1, value2, "fgtId");
            return (Criteria) this;
        }

        public Criteria andFgtPriceIsNull() {
            addCriterion("fgt_price is null");
            return (Criteria) this;
        }

        public Criteria andFgtPriceIsNotNull() {
            addCriterion("fgt_price is not null");
            return (Criteria) this;
        }

        public Criteria andFgtPriceEqualTo(Float value) {
            addCriterion("fgt_price =", value, "fgtPrice");
            return (Criteria) this;
        }

        public Criteria andFgtPriceNotEqualTo(Float value) {
            addCriterion("fgt_price <>", value, "fgtPrice");
            return (Criteria) this;
        }

        public Criteria andFgtPriceGreaterThan(Float value) {
            addCriterion("fgt_price >", value, "fgtPrice");
            return (Criteria) this;
        }

        public Criteria andFgtPriceGreaterThanOrEqualTo(Float value) {
            addCriterion("fgt_price >=", value, "fgtPrice");
            return (Criteria) this;
        }

        public Criteria andFgtPriceLessThan(Float value) {
            addCriterion("fgt_price <", value, "fgtPrice");
            return (Criteria) this;
        }

        public Criteria andFgtPriceLessThanOrEqualTo(Float value) {
            addCriterion("fgt_price <=", value, "fgtPrice");
            return (Criteria) this;
        }

        public Criteria andFgtPriceIn(List<Float> values) {
            addCriterion("fgt_price in", values, "fgtPrice");
            return (Criteria) this;
        }

        public Criteria andFgtPriceNotIn(List<Float> values) {
            addCriterion("fgt_price not in", values, "fgtPrice");
            return (Criteria) this;
        }

        public Criteria andFgtPriceBetween(Float value1, Float value2) {
            addCriterion("fgt_price between", value1, value2, "fgtPrice");
            return (Criteria) this;
        }

        public Criteria andFgtPriceNotBetween(Float value1, Float value2) {
            addCriterion("fgt_price not between", value1, value2, "fgtPrice");
            return (Criteria) this;
        }

        public Criteria andFreePriceIsNull() {
            addCriterion("free_price is null");
            return (Criteria) this;
        }

        public Criteria andFreePriceIsNotNull() {
            addCriterion("free_price is not null");
            return (Criteria) this;
        }

        public Criteria andFreePriceEqualTo(Float value) {
            addCriterion("free_price =", value, "freePrice");
            return (Criteria) this;
        }

        public Criteria andFreePriceNotEqualTo(Float value) {
            addCriterion("free_price <>", value, "freePrice");
            return (Criteria) this;
        }

        public Criteria andFreePriceGreaterThan(Float value) {
            addCriterion("free_price >", value, "freePrice");
            return (Criteria) this;
        }

        public Criteria andFreePriceGreaterThanOrEqualTo(Float value) {
            addCriterion("free_price >=", value, "freePrice");
            return (Criteria) this;
        }

        public Criteria andFreePriceLessThan(Float value) {
            addCriterion("free_price <", value, "freePrice");
            return (Criteria) this;
        }

        public Criteria andFreePriceLessThanOrEqualTo(Float value) {
            addCriterion("free_price <=", value, "freePrice");
            return (Criteria) this;
        }

        public Criteria andFreePriceIn(List<Float> values) {
            addCriterion("free_price in", values, "freePrice");
            return (Criteria) this;
        }

        public Criteria andFreePriceNotIn(List<Float> values) {
            addCriterion("free_price not in", values, "freePrice");
            return (Criteria) this;
        }

        public Criteria andFreePriceBetween(Float value1, Float value2) {
            addCriterion("free_price between", value1, value2, "freePrice");
            return (Criteria) this;
        }

        public Criteria andFreePriceNotBetween(Float value1, Float value2) {
            addCriterion("free_price not between", value1, value2, "freePrice");
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