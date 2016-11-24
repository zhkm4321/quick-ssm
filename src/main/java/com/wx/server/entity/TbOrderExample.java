package com.wx.server.entity;

import com.wx.server.vo.page.Page;
import java.util.ArrayList;
import java.util.List;

public class TbOrderExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Page page;

    public TbOrderExample() {
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

        public Criteria andOrderIdIsNull() {
            addCriterion("order_id is null");
            return (Criteria) this;
        }

        public Criteria andOrderIdIsNotNull() {
            addCriterion("order_id is not null");
            return (Criteria) this;
        }

        public Criteria andOrderIdEqualTo(Integer value) {
            addCriterion("order_id =", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotEqualTo(Integer value) {
            addCriterion("order_id <>", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThan(Integer value) {
            addCriterion("order_id >", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("order_id >=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThan(Integer value) {
            addCriterion("order_id <", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThanOrEqualTo(Integer value) {
            addCriterion("order_id <=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdIn(List<Integer> values) {
            addCriterion("order_id in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotIn(List<Integer> values) {
            addCriterion("order_id not in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdBetween(Integer value1, Integer value2) {
            addCriterion("order_id between", value1, value2, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotBetween(Integer value1, Integer value2) {
            addCriterion("order_id not between", value1, value2, "orderId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdIsNull() {
            addCriterion("goods_id is null");
            return (Criteria) this;
        }

        public Criteria andGoodsIdIsNotNull() {
            addCriterion("goods_id is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsIdEqualTo(String value) {
            addCriterion("goods_id =", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdNotEqualTo(String value) {
            addCriterion("goods_id <>", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdGreaterThan(String value) {
            addCriterion("goods_id >", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdGreaterThanOrEqualTo(String value) {
            addCriterion("goods_id >=", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdLessThan(String value) {
            addCriterion("goods_id <", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdLessThanOrEqualTo(String value) {
            addCriterion("goods_id <=", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdLike(String value) {
            addCriterion("goods_id like", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdNotLike(String value) {
            addCriterion("goods_id not like", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdIn(List<String> values) {
            addCriterion("goods_id in", values, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdNotIn(List<String> values) {
            addCriterion("goods_id not in", values, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdBetween(String value1, String value2) {
            addCriterion("goods_id between", value1, value2, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdNotBetween(String value1, String value2) {
            addCriterion("goods_id not between", value1, value2, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsSpeIsNull() {
            addCriterion("goods_spe is null");
            return (Criteria) this;
        }

        public Criteria andGoodsSpeIsNotNull() {
            addCriterion("goods_spe is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsSpeEqualTo(String value) {
            addCriterion("goods_spe =", value, "goodsSpe");
            return (Criteria) this;
        }

        public Criteria andGoodsSpeNotEqualTo(String value) {
            addCriterion("goods_spe <>", value, "goodsSpe");
            return (Criteria) this;
        }

        public Criteria andGoodsSpeGreaterThan(String value) {
            addCriterion("goods_spe >", value, "goodsSpe");
            return (Criteria) this;
        }

        public Criteria andGoodsSpeGreaterThanOrEqualTo(String value) {
            addCriterion("goods_spe >=", value, "goodsSpe");
            return (Criteria) this;
        }

        public Criteria andGoodsSpeLessThan(String value) {
            addCriterion("goods_spe <", value, "goodsSpe");
            return (Criteria) this;
        }

        public Criteria andGoodsSpeLessThanOrEqualTo(String value) {
            addCriterion("goods_spe <=", value, "goodsSpe");
            return (Criteria) this;
        }

        public Criteria andGoodsSpeLike(String value) {
            addCriterion("goods_spe like", value, "goodsSpe");
            return (Criteria) this;
        }

        public Criteria andGoodsSpeNotLike(String value) {
            addCriterion("goods_spe not like", value, "goodsSpe");
            return (Criteria) this;
        }

        public Criteria andGoodsSpeIn(List<String> values) {
            addCriterion("goods_spe in", values, "goodsSpe");
            return (Criteria) this;
        }

        public Criteria andGoodsSpeNotIn(List<String> values) {
            addCriterion("goods_spe not in", values, "goodsSpe");
            return (Criteria) this;
        }

        public Criteria andGoodsSpeBetween(String value1, String value2) {
            addCriterion("goods_spe between", value1, value2, "goodsSpe");
            return (Criteria) this;
        }

        public Criteria andGoodsSpeNotBetween(String value1, String value2) {
            addCriterion("goods_spe not between", value1, value2, "goodsSpe");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceIsNull() {
            addCriterion("goods_price is null");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceIsNotNull() {
            addCriterion("goods_price is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceEqualTo(String value) {
            addCriterion("goods_price =", value, "goodsPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceNotEqualTo(String value) {
            addCriterion("goods_price <>", value, "goodsPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceGreaterThan(String value) {
            addCriterion("goods_price >", value, "goodsPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceGreaterThanOrEqualTo(String value) {
            addCriterion("goods_price >=", value, "goodsPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceLessThan(String value) {
            addCriterion("goods_price <", value, "goodsPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceLessThanOrEqualTo(String value) {
            addCriterion("goods_price <=", value, "goodsPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceLike(String value) {
            addCriterion("goods_price like", value, "goodsPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceNotLike(String value) {
            addCriterion("goods_price not like", value, "goodsPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceIn(List<String> values) {
            addCriterion("goods_price in", values, "goodsPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceNotIn(List<String> values) {
            addCriterion("goods_price not in", values, "goodsPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceBetween(String value1, String value2) {
            addCriterion("goods_price between", value1, value2, "goodsPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceNotBetween(String value1, String value2) {
            addCriterion("goods_price not between", value1, value2, "goodsPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsNumIsNull() {
            addCriterion("goods_num is null");
            return (Criteria) this;
        }

        public Criteria andGoodsNumIsNotNull() {
            addCriterion("goods_num is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsNumEqualTo(String value) {
            addCriterion("goods_num =", value, "goodsNum");
            return (Criteria) this;
        }

        public Criteria andGoodsNumNotEqualTo(String value) {
            addCriterion("goods_num <>", value, "goodsNum");
            return (Criteria) this;
        }

        public Criteria andGoodsNumGreaterThan(String value) {
            addCriterion("goods_num >", value, "goodsNum");
            return (Criteria) this;
        }

        public Criteria andGoodsNumGreaterThanOrEqualTo(String value) {
            addCriterion("goods_num >=", value, "goodsNum");
            return (Criteria) this;
        }

        public Criteria andGoodsNumLessThan(String value) {
            addCriterion("goods_num <", value, "goodsNum");
            return (Criteria) this;
        }

        public Criteria andGoodsNumLessThanOrEqualTo(String value) {
            addCriterion("goods_num <=", value, "goodsNum");
            return (Criteria) this;
        }

        public Criteria andGoodsNumLike(String value) {
            addCriterion("goods_num like", value, "goodsNum");
            return (Criteria) this;
        }

        public Criteria andGoodsNumNotLike(String value) {
            addCriterion("goods_num not like", value, "goodsNum");
            return (Criteria) this;
        }

        public Criteria andGoodsNumIn(List<String> values) {
            addCriterion("goods_num in", values, "goodsNum");
            return (Criteria) this;
        }

        public Criteria andGoodsNumNotIn(List<String> values) {
            addCriterion("goods_num not in", values, "goodsNum");
            return (Criteria) this;
        }

        public Criteria andGoodsNumBetween(String value1, String value2) {
            addCriterion("goods_num between", value1, value2, "goodsNum");
            return (Criteria) this;
        }

        public Criteria andGoodsNumNotBetween(String value1, String value2) {
            addCriterion("goods_num not between", value1, value2, "goodsNum");
            return (Criteria) this;
        }

        public Criteria andGoodsTotalIsNull() {
            addCriterion("goods_total is null");
            return (Criteria) this;
        }

        public Criteria andGoodsTotalIsNotNull() {
            addCriterion("goods_total is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsTotalEqualTo(Float value) {
            addCriterion("goods_total =", value, "goodsTotal");
            return (Criteria) this;
        }

        public Criteria andGoodsTotalNotEqualTo(Float value) {
            addCriterion("goods_total <>", value, "goodsTotal");
            return (Criteria) this;
        }

        public Criteria andGoodsTotalGreaterThan(Float value) {
            addCriterion("goods_total >", value, "goodsTotal");
            return (Criteria) this;
        }

        public Criteria andGoodsTotalGreaterThanOrEqualTo(Float value) {
            addCriterion("goods_total >=", value, "goodsTotal");
            return (Criteria) this;
        }

        public Criteria andGoodsTotalLessThan(Float value) {
            addCriterion("goods_total <", value, "goodsTotal");
            return (Criteria) this;
        }

        public Criteria andGoodsTotalLessThanOrEqualTo(Float value) {
            addCriterion("goods_total <=", value, "goodsTotal");
            return (Criteria) this;
        }

        public Criteria andGoodsTotalIn(List<Float> values) {
            addCriterion("goods_total in", values, "goodsTotal");
            return (Criteria) this;
        }

        public Criteria andGoodsTotalNotIn(List<Float> values) {
            addCriterion("goods_total not in", values, "goodsTotal");
            return (Criteria) this;
        }

        public Criteria andGoodsTotalBetween(Float value1, Float value2) {
            addCriterion("goods_total between", value1, value2, "goodsTotal");
            return (Criteria) this;
        }

        public Criteria andGoodsTotalNotBetween(Float value1, Float value2) {
            addCriterion("goods_total not between", value1, value2, "goodsTotal");
            return (Criteria) this;
        }

        public Criteria andGoodsTotalNumIsNull() {
            addCriterion("goods_total_num is null");
            return (Criteria) this;
        }

        public Criteria andGoodsTotalNumIsNotNull() {
            addCriterion("goods_total_num is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsTotalNumEqualTo(Integer value) {
            addCriterion("goods_total_num =", value, "goodsTotalNum");
            return (Criteria) this;
        }

        public Criteria andGoodsTotalNumNotEqualTo(Integer value) {
            addCriterion("goods_total_num <>", value, "goodsTotalNum");
            return (Criteria) this;
        }

        public Criteria andGoodsTotalNumGreaterThan(Integer value) {
            addCriterion("goods_total_num >", value, "goodsTotalNum");
            return (Criteria) this;
        }

        public Criteria andGoodsTotalNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("goods_total_num >=", value, "goodsTotalNum");
            return (Criteria) this;
        }

        public Criteria andGoodsTotalNumLessThan(Integer value) {
            addCriterion("goods_total_num <", value, "goodsTotalNum");
            return (Criteria) this;
        }

        public Criteria andGoodsTotalNumLessThanOrEqualTo(Integer value) {
            addCriterion("goods_total_num <=", value, "goodsTotalNum");
            return (Criteria) this;
        }

        public Criteria andGoodsTotalNumIn(List<Integer> values) {
            addCriterion("goods_total_num in", values, "goodsTotalNum");
            return (Criteria) this;
        }

        public Criteria andGoodsTotalNumNotIn(List<Integer> values) {
            addCriterion("goods_total_num not in", values, "goodsTotalNum");
            return (Criteria) this;
        }

        public Criteria andGoodsTotalNumBetween(Integer value1, Integer value2) {
            addCriterion("goods_total_num between", value1, value2, "goodsTotalNum");
            return (Criteria) this;
        }

        public Criteria andGoodsTotalNumNotBetween(Integer value1, Integer value2) {
            addCriterion("goods_total_num not between", value1, value2, "goodsTotalNum");
            return (Criteria) this;
        }

        public Criteria andAddrNameIsNull() {
            addCriterion("addr_name is null");
            return (Criteria) this;
        }

        public Criteria andAddrNameIsNotNull() {
            addCriterion("addr_name is not null");
            return (Criteria) this;
        }

        public Criteria andAddrNameEqualTo(String value) {
            addCriterion("addr_name =", value, "addrName");
            return (Criteria) this;
        }

        public Criteria andAddrNameNotEqualTo(String value) {
            addCriterion("addr_name <>", value, "addrName");
            return (Criteria) this;
        }

        public Criteria andAddrNameGreaterThan(String value) {
            addCriterion("addr_name >", value, "addrName");
            return (Criteria) this;
        }

        public Criteria andAddrNameGreaterThanOrEqualTo(String value) {
            addCriterion("addr_name >=", value, "addrName");
            return (Criteria) this;
        }

        public Criteria andAddrNameLessThan(String value) {
            addCriterion("addr_name <", value, "addrName");
            return (Criteria) this;
        }

        public Criteria andAddrNameLessThanOrEqualTo(String value) {
            addCriterion("addr_name <=", value, "addrName");
            return (Criteria) this;
        }

        public Criteria andAddrNameLike(String value) {
            addCriterion("addr_name like", value, "addrName");
            return (Criteria) this;
        }

        public Criteria andAddrNameNotLike(String value) {
            addCriterion("addr_name not like", value, "addrName");
            return (Criteria) this;
        }

        public Criteria andAddrNameIn(List<String> values) {
            addCriterion("addr_name in", values, "addrName");
            return (Criteria) this;
        }

        public Criteria andAddrNameNotIn(List<String> values) {
            addCriterion("addr_name not in", values, "addrName");
            return (Criteria) this;
        }

        public Criteria andAddrNameBetween(String value1, String value2) {
            addCriterion("addr_name between", value1, value2, "addrName");
            return (Criteria) this;
        }

        public Criteria andAddrNameNotBetween(String value1, String value2) {
            addCriterion("addr_name not between", value1, value2, "addrName");
            return (Criteria) this;
        }

        public Criteria andReceiveIsNull() {
            addCriterion("receive is null");
            return (Criteria) this;
        }

        public Criteria andReceiveIsNotNull() {
            addCriterion("receive is not null");
            return (Criteria) this;
        }

        public Criteria andReceiveEqualTo(String value) {
            addCriterion("receive =", value, "receive");
            return (Criteria) this;
        }

        public Criteria andReceiveNotEqualTo(String value) {
            addCriterion("receive <>", value, "receive");
            return (Criteria) this;
        }

        public Criteria andReceiveGreaterThan(String value) {
            addCriterion("receive >", value, "receive");
            return (Criteria) this;
        }

        public Criteria andReceiveGreaterThanOrEqualTo(String value) {
            addCriterion("receive >=", value, "receive");
            return (Criteria) this;
        }

        public Criteria andReceiveLessThan(String value) {
            addCriterion("receive <", value, "receive");
            return (Criteria) this;
        }

        public Criteria andReceiveLessThanOrEqualTo(String value) {
            addCriterion("receive <=", value, "receive");
            return (Criteria) this;
        }

        public Criteria andReceiveLike(String value) {
            addCriterion("receive like", value, "receive");
            return (Criteria) this;
        }

        public Criteria andReceiveNotLike(String value) {
            addCriterion("receive not like", value, "receive");
            return (Criteria) this;
        }

        public Criteria andReceiveIn(List<String> values) {
            addCriterion("receive in", values, "receive");
            return (Criteria) this;
        }

        public Criteria andReceiveNotIn(List<String> values) {
            addCriterion("receive not in", values, "receive");
            return (Criteria) this;
        }

        public Criteria andReceiveBetween(String value1, String value2) {
            addCriterion("receive between", value1, value2, "receive");
            return (Criteria) this;
        }

        public Criteria andReceiveNotBetween(String value1, String value2) {
            addCriterion("receive not between", value1, value2, "receive");
            return (Criteria) this;
        }

        public Criteria andCpsIdIsNull() {
            addCriterion("cps_id is null");
            return (Criteria) this;
        }

        public Criteria andCpsIdIsNotNull() {
            addCriterion("cps_id is not null");
            return (Criteria) this;
        }

        public Criteria andCpsIdEqualTo(Integer value) {
            addCriterion("cps_id =", value, "cpsId");
            return (Criteria) this;
        }

        public Criteria andCpsIdNotEqualTo(Integer value) {
            addCriterion("cps_id <>", value, "cpsId");
            return (Criteria) this;
        }

        public Criteria andCpsIdGreaterThan(Integer value) {
            addCriterion("cps_id >", value, "cpsId");
            return (Criteria) this;
        }

        public Criteria andCpsIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("cps_id >=", value, "cpsId");
            return (Criteria) this;
        }

        public Criteria andCpsIdLessThan(Integer value) {
            addCriterion("cps_id <", value, "cpsId");
            return (Criteria) this;
        }

        public Criteria andCpsIdLessThanOrEqualTo(Integer value) {
            addCriterion("cps_id <=", value, "cpsId");
            return (Criteria) this;
        }

        public Criteria andCpsIdIn(List<Integer> values) {
            addCriterion("cps_id in", values, "cpsId");
            return (Criteria) this;
        }

        public Criteria andCpsIdNotIn(List<Integer> values) {
            addCriterion("cps_id not in", values, "cpsId");
            return (Criteria) this;
        }

        public Criteria andCpsIdBetween(Integer value1, Integer value2) {
            addCriterion("cps_id between", value1, value2, "cpsId");
            return (Criteria) this;
        }

        public Criteria andCpsIdNotBetween(Integer value1, Integer value2) {
            addCriterion("cps_id not between", value1, value2, "cpsId");
            return (Criteria) this;
        }

        public Criteria andCpsNameIsNull() {
            addCriterion("cps_name is null");
            return (Criteria) this;
        }

        public Criteria andCpsNameIsNotNull() {
            addCriterion("cps_name is not null");
            return (Criteria) this;
        }

        public Criteria andCpsNameEqualTo(String value) {
            addCriterion("cps_name =", value, "cpsName");
            return (Criteria) this;
        }

        public Criteria andCpsNameNotEqualTo(String value) {
            addCriterion("cps_name <>", value, "cpsName");
            return (Criteria) this;
        }

        public Criteria andCpsNameGreaterThan(String value) {
            addCriterion("cps_name >", value, "cpsName");
            return (Criteria) this;
        }

        public Criteria andCpsNameGreaterThanOrEqualTo(String value) {
            addCriterion("cps_name >=", value, "cpsName");
            return (Criteria) this;
        }

        public Criteria andCpsNameLessThan(String value) {
            addCriterion("cps_name <", value, "cpsName");
            return (Criteria) this;
        }

        public Criteria andCpsNameLessThanOrEqualTo(String value) {
            addCriterion("cps_name <=", value, "cpsName");
            return (Criteria) this;
        }

        public Criteria andCpsNameLike(String value) {
            addCriterion("cps_name like", value, "cpsName");
            return (Criteria) this;
        }

        public Criteria andCpsNameNotLike(String value) {
            addCriterion("cps_name not like", value, "cpsName");
            return (Criteria) this;
        }

        public Criteria andCpsNameIn(List<String> values) {
            addCriterion("cps_name in", values, "cpsName");
            return (Criteria) this;
        }

        public Criteria andCpsNameNotIn(List<String> values) {
            addCriterion("cps_name not in", values, "cpsName");
            return (Criteria) this;
        }

        public Criteria andCpsNameBetween(String value1, String value2) {
            addCriterion("cps_name between", value1, value2, "cpsName");
            return (Criteria) this;
        }

        public Criteria andCpsNameNotBetween(String value1, String value2) {
            addCriterion("cps_name not between", value1, value2, "cpsName");
            return (Criteria) this;
        }

        public Criteria andCpsPriceIsNull() {
            addCriterion("cps_price is null");
            return (Criteria) this;
        }

        public Criteria andCpsPriceIsNotNull() {
            addCriterion("cps_price is not null");
            return (Criteria) this;
        }

        public Criteria andCpsPriceEqualTo(Float value) {
            addCriterion("cps_price =", value, "cpsPrice");
            return (Criteria) this;
        }

        public Criteria andCpsPriceNotEqualTo(Float value) {
            addCriterion("cps_price <>", value, "cpsPrice");
            return (Criteria) this;
        }

        public Criteria andCpsPriceGreaterThan(Float value) {
            addCriterion("cps_price >", value, "cpsPrice");
            return (Criteria) this;
        }

        public Criteria andCpsPriceGreaterThanOrEqualTo(Float value) {
            addCriterion("cps_price >=", value, "cpsPrice");
            return (Criteria) this;
        }

        public Criteria andCpsPriceLessThan(Float value) {
            addCriterion("cps_price <", value, "cpsPrice");
            return (Criteria) this;
        }

        public Criteria andCpsPriceLessThanOrEqualTo(Float value) {
            addCriterion("cps_price <=", value, "cpsPrice");
            return (Criteria) this;
        }

        public Criteria andCpsPriceIn(List<Float> values) {
            addCriterion("cps_price in", values, "cpsPrice");
            return (Criteria) this;
        }

        public Criteria andCpsPriceNotIn(List<Float> values) {
            addCriterion("cps_price not in", values, "cpsPrice");
            return (Criteria) this;
        }

        public Criteria andCpsPriceBetween(Float value1, Float value2) {
            addCriterion("cps_price between", value1, value2, "cpsPrice");
            return (Criteria) this;
        }

        public Criteria andCpsPriceNotBetween(Float value1, Float value2) {
            addCriterion("cps_price not between", value1, value2, "cpsPrice");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Integer value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Integer value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Integer value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Integer value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Integer value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Integer> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Integer> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Integer value1, Integer value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andNoteIsNull() {
            addCriterion("note is null");
            return (Criteria) this;
        }

        public Criteria andNoteIsNotNull() {
            addCriterion("note is not null");
            return (Criteria) this;
        }

        public Criteria andNoteEqualTo(String value) {
            addCriterion("note =", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteNotEqualTo(String value) {
            addCriterion("note <>", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteGreaterThan(String value) {
            addCriterion("note >", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteGreaterThanOrEqualTo(String value) {
            addCriterion("note >=", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteLessThan(String value) {
            addCriterion("note <", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteLessThanOrEqualTo(String value) {
            addCriterion("note <=", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteLike(String value) {
            addCriterion("note like", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteNotLike(String value) {
            addCriterion("note not like", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteIn(List<String> values) {
            addCriterion("note in", values, "note");
            return (Criteria) this;
        }

        public Criteria andNoteNotIn(List<String> values) {
            addCriterion("note not in", values, "note");
            return (Criteria) this;
        }

        public Criteria andNoteBetween(String value1, String value2) {
            addCriterion("note between", value1, value2, "note");
            return (Criteria) this;
        }

        public Criteria andNoteNotBetween(String value1, String value2) {
            addCriterion("note not between", value1, value2, "note");
            return (Criteria) this;
        }

        public Criteria andAddTimeIsNull() {
            addCriterion("add_time is null");
            return (Criteria) this;
        }

        public Criteria andAddTimeIsNotNull() {
            addCriterion("add_time is not null");
            return (Criteria) this;
        }

        public Criteria andAddTimeEqualTo(String value) {
            addCriterion("add_time =", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeNotEqualTo(String value) {
            addCriterion("add_time <>", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeGreaterThan(String value) {
            addCriterion("add_time >", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeGreaterThanOrEqualTo(String value) {
            addCriterion("add_time >=", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeLessThan(String value) {
            addCriterion("add_time <", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeLessThanOrEqualTo(String value) {
            addCriterion("add_time <=", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeLike(String value) {
            addCriterion("add_time like", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeNotLike(String value) {
            addCriterion("add_time not like", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeIn(List<String> values) {
            addCriterion("add_time in", values, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeNotIn(List<String> values) {
            addCriterion("add_time not in", values, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeBetween(String value1, String value2) {
            addCriterion("add_time between", value1, value2, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeNotBetween(String value1, String value2) {
            addCriterion("add_time not between", value1, value2, "addTime");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(String value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(String value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(String value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(String value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(String value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLike(String value) {
            addCriterion("user_id like", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotLike(String value) {
            addCriterion("user_id not like", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<String> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<String> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(String value1, String value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(String value1, String value2) {
            addCriterion("user_id not between", value1, value2, "userId");
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