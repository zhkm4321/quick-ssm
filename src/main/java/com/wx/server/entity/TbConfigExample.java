package com.wx.server.entity;

import com.wx.server.vo.page.Page;
import java.util.ArrayList;
import java.util.List;
import java.util.Date;

public class TbConfigExample {
    /**
   * This field was generated by MyBatis Generator. This field corresponds to the database table tb_config
   * @mbg.generated
   */
  protected String orderByClause;
  /**
   * This field was generated by MyBatis Generator. This field corresponds to the database table tb_config
   * @mbg.generated
   */
  protected boolean distinct;
  /**
   * This field was generated by MyBatis Generator. This field corresponds to the database table tb_config
   * @mbg.generated
   */protected List<Criteria> oredCriteria;
  /**
   * This field was generated by MyBatis Generator. This field corresponds to the database table tb_config
   * @mbg.generated
   */
  protected Page page;

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table tb_config
   * @mbg.generated
   */public TbConfigExample(){oredCriteria=new ArrayList<Criteria>();}

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table tb_config
   * @mbg.generated
   */
  public void setOrderByClause(String orderByClause) {
    this.orderByClause = orderByClause;
  }

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table tb_config
   * @mbg.generated
   */
  public String getOrderByClause() {
    return orderByClause;
  }

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table tb_config
   * @mbg.generated
   */
  public void setDistinct(boolean distinct) {
    this.distinct = distinct;
  }

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table tb_config
   * @mbg.generated
   */
  public boolean isDistinct() {
    return distinct;
  }

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table tb_config
   * @mbg.generated
   */public List<Criteria> getOredCriteria(){return oredCriteria;}

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table tb_config
   * @mbg.generated
   */
  public void or(Criteria criteria) {
    oredCriteria.add(criteria);
  }

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table tb_config
   * @mbg.generated
   */
  public Criteria or() {
    Criteria criteria = createCriteriaInternal();
    oredCriteria.add(criteria);
    return criteria;
  }

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table tb_config
   * @mbg.generated
   */
  public Criteria createCriteria() {
    Criteria criteria = createCriteriaInternal();
    if (oredCriteria.size() == 0) {
      oredCriteria.add(criteria);
    }
    return criteria;
  }

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table tb_config
   * @mbg.generated
   */
  protected Criteria createCriteriaInternal() {
    Criteria criteria = new Criteria();
    return criteria;
  }

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table tb_config
   * @mbg.generated
   */
  public void clear() {
    oredCriteria.clear();
    orderByClause = null;
    distinct = false;
  }

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table tb_config
   * @mbg.generated
   */
  public void setPage(Page page) {
    this.page = page;
  }

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table tb_config
   * @mbg.generated
   */
  public Page getPage() {
    return page;
  }

  /**
   * This class was generated by MyBatis Generator. This class corresponds to the database table tb_config
   * @mbg.generated
   */protected abstract static class GeneratedCriteria {protected List<Criterion> criteria;protected GeneratedCriteria(){super();criteria=new ArrayList<Criterion>();}public boolean isValid(){return criteria.size() > 0;}public List<Criterion> getAllCriteria(){return criteria;}public List<Criterion> getCriteria(){return criteria;}protected void addCriterion(String condition){if (condition == null){throw new RuntimeException("Value for condition cannot be null");}criteria.add(new Criterion(condition));}protected void addCriterion(String condition,Object value,String property){if (value == null){throw new RuntimeException("Value for " + property + " cannot be null");}criteria.add(new Criterion(condition,value));}protected void addCriterion(String condition,Object value1,Object value2,String property){if (value1 == null || value2 == null){throw new RuntimeException("Between values for " + property + " cannot be null");}criteria.add(new Criterion(condition,value1,value2));}public Criteria andIdIsNull(){addCriterion("id is null");return (Criteria)this;}public Criteria andIdIsNotNull(){addCriterion("id is not null");return (Criteria)this;}public Criteria andIdEqualTo(Integer value){addCriterion("id =",value,"id");return (Criteria)this;}public Criteria andIdNotEqualTo(Integer value){addCriterion("id <>",value,"id");return (Criteria)this;}public Criteria andIdGreaterThan(Integer value){addCriterion("id >",value,"id");return (Criteria)this;}public Criteria andIdGreaterThanOrEqualTo(Integer value){addCriterion("id >=",value,"id");return (Criteria)this;}public Criteria andIdLessThan(Integer value){addCriterion("id <",value,"id");return (Criteria)this;}public Criteria andIdLessThanOrEqualTo(Integer value){addCriterion("id <=",value,"id");return (Criteria)this;}public Criteria andIdIn(List<Integer> values){addCriterion("id in",values,"id");return (Criteria)this;}public Criteria andIdNotIn(List<Integer> values){addCriterion("id not in",values,"id");return (Criteria)this;}public Criteria andIdBetween(Integer value1,Integer value2){addCriterion("id between",value1,value2,"id");return (Criteria)this;}public Criteria andIdNotBetween(Integer value1,Integer value2){addCriterion("id not between",value1,value2,"id");return (Criteria)this;}public Criteria andConfigGroupIsNull(){addCriterion("config_group is null");return (Criteria)this;}public Criteria andConfigGroupIsNotNull(){addCriterion("config_group is not null");return (Criteria)this;}public Criteria andConfigGroupEqualTo(String value){addCriterion("config_group =",value,"configGroup");return (Criteria)this;}public Criteria andConfigGroupNotEqualTo(String value){addCriterion("config_group <>",value,"configGroup");return (Criteria)this;}public Criteria andConfigGroupGreaterThan(String value){addCriterion("config_group >",value,"configGroup");return (Criteria)this;}public Criteria andConfigGroupGreaterThanOrEqualTo(String value){addCriterion("config_group >=",value,"configGroup");return (Criteria)this;}public Criteria andConfigGroupLessThan(String value){addCriterion("config_group <",value,"configGroup");return (Criteria)this;}public Criteria andConfigGroupLessThanOrEqualTo(String value){addCriterion("config_group <=",value,"configGroup");return (Criteria)this;}public Criteria andConfigGroupLike(String value){addCriterion("config_group like",value,"configGroup");return (Criteria)this;}public Criteria andConfigGroupNotLike(String value){addCriterion("config_group not like",value,"configGroup");return (Criteria)this;}public Criteria andConfigGroupIn(List<String> values){addCriterion("config_group in",values,"configGroup");return (Criteria)this;}public Criteria andConfigGroupNotIn(List<String> values){addCriterion("config_group not in",values,"configGroup");return (Criteria)this;}public Criteria andConfigGroupBetween(String value1,String value2){addCriterion("config_group between",value1,value2,"configGroup");return (Criteria)this;}public Criteria andConfigGroupNotBetween(String value1,String value2){addCriterion("config_group not between",value1,value2,"configGroup");return (Criteria)this;}public Criteria andConfigKeyIsNull(){addCriterion("config_key is null");return (Criteria)this;}public Criteria andConfigKeyIsNotNull(){addCriterion("config_key is not null");return (Criteria)this;}public Criteria andConfigKeyEqualTo(String value){addCriterion("config_key =",value,"configKey");return (Criteria)this;}public Criteria andConfigKeyNotEqualTo(String value){addCriterion("config_key <>",value,"configKey");return (Criteria)this;}public Criteria andConfigKeyGreaterThan(String value){addCriterion("config_key >",value,"configKey");return (Criteria)this;}public Criteria andConfigKeyGreaterThanOrEqualTo(String value){addCriterion("config_key >=",value,"configKey");return (Criteria)this;}public Criteria andConfigKeyLessThan(String value){addCriterion("config_key <",value,"configKey");return (Criteria)this;}public Criteria andConfigKeyLessThanOrEqualTo(String value){addCriterion("config_key <=",value,"configKey");return (Criteria)this;}public Criteria andConfigKeyLike(String value){addCriterion("config_key like",value,"configKey");return (Criteria)this;}public Criteria andConfigKeyNotLike(String value){addCriterion("config_key not like",value,"configKey");return (Criteria)this;}public Criteria andConfigKeyIn(List<String> values){addCriterion("config_key in",values,"configKey");return (Criteria)this;}public Criteria andConfigKeyNotIn(List<String> values){addCriterion("config_key not in",values,"configKey");return (Criteria)this;}public Criteria andConfigKeyBetween(String value1,String value2){addCriterion("config_key between",value1,value2,"configKey");return (Criteria)this;}public Criteria andConfigKeyNotBetween(String value1,String value2){addCriterion("config_key not between",value1,value2,"configKey");return (Criteria)this;}public Criteria andConfigValueIsNull(){addCriterion("config_value is null");return (Criteria)this;}public Criteria andConfigValueIsNotNull(){addCriterion("config_value is not null");return (Criteria)this;}public Criteria andConfigValueEqualTo(String value){addCriterion("config_value =",value,"configValue");return (Criteria)this;}public Criteria andConfigValueNotEqualTo(String value){addCriterion("config_value <>",value,"configValue");return (Criteria)this;}public Criteria andConfigValueGreaterThan(String value){addCriterion("config_value >",value,"configValue");return (Criteria)this;}public Criteria andConfigValueGreaterThanOrEqualTo(String value){addCriterion("config_value >=",value,"configValue");return (Criteria)this;}public Criteria andConfigValueLessThan(String value){addCriterion("config_value <",value,"configValue");return (Criteria)this;}public Criteria andConfigValueLessThanOrEqualTo(String value){addCriterion("config_value <=",value,"configValue");return (Criteria)this;}public Criteria andConfigValueLike(String value){addCriterion("config_value like",value,"configValue");return (Criteria)this;}public Criteria andConfigValueNotLike(String value){addCriterion("config_value not like",value,"configValue");return (Criteria)this;}public Criteria andConfigValueIn(List<String> values){addCriterion("config_value in",values,"configValue");return (Criteria)this;}public Criteria andConfigValueNotIn(List<String> values){addCriterion("config_value not in",values,"configValue");return (Criteria)this;}public Criteria andConfigValueBetween(String value1,String value2){addCriterion("config_value between",value1,value2,"configValue");return (Criteria)this;}public Criteria andConfigValueNotBetween(String value1,String value2){addCriterion("config_value not between",value1,value2,"configValue");return (Criteria)this;}public Criteria andUpdateTimeIsNull(){addCriterion("update_time is null");return (Criteria)this;}public Criteria andUpdateTimeIsNotNull(){addCriterion("update_time is not null");return (Criteria)this;}public Criteria andUpdateTimeEqualTo(Date value){addCriterion("update_time =",value,"updateTime");return (Criteria)this;}public Criteria andUpdateTimeNotEqualTo(Date value){addCriterion("update_time <>",value,"updateTime");return (Criteria)this;}public Criteria andUpdateTimeGreaterThan(Date value){addCriterion("update_time >",value,"updateTime");return (Criteria)this;}public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value){addCriterion("update_time >=",value,"updateTime");return (Criteria)this;}public Criteria andUpdateTimeLessThan(Date value){addCriterion("update_time <",value,"updateTime");return (Criteria)this;}public Criteria andUpdateTimeLessThanOrEqualTo(Date value){addCriterion("update_time <=",value,"updateTime");return (Criteria)this;}public Criteria andUpdateTimeIn(List<Date> values){addCriterion("update_time in",values,"updateTime");return (Criteria)this;}public Criteria andUpdateTimeNotIn(List<Date> values){addCriterion("update_time not in",values,"updateTime");return (Criteria)this;}public Criteria andUpdateTimeBetween(Date value1,Date value2){addCriterion("update_time between",value1,value2,"updateTime");return (Criteria)this;}public Criteria andUpdateTimeNotBetween(Date value1,Date value2){addCriterion("update_time not between",value1,value2,"updateTime");return (Criteria)this;}}

  /**
   * This class was generated by MyBatis Generator. This class corresponds to the database table tb_config
   * @mbg.generated
   */public static class Criterion {private String condition;private Object value;private Object secondValue;private boolean noValue;private boolean singleValue;private boolean betweenValue;private boolean listValue;private String typeHandler;public String getCondition(){return condition;}public Object getValue(){return value;}public Object getSecondValue(){return secondValue;}public boolean isNoValue(){return noValue;}public boolean isSingleValue(){return singleValue;}public boolean isBetweenValue(){return betweenValue;}public boolean isListValue(){return listValue;}public String getTypeHandler(){return typeHandler;}protected Criterion(String condition){super();this.condition=condition;this.typeHandler=null;this.noValue=true;}protected Criterion(String condition,Object value,String typeHandler){super();this.condition=condition;this.value=value;this.typeHandler=typeHandler;if (value instanceof List<?>){this.listValue=true;} else {this.singleValue=true;}}protected Criterion(String condition,Object value){this(condition,value,null);}protected Criterion(String condition,Object value,Object secondValue,String typeHandler){super();this.condition=condition;this.value=value;this.secondValue=secondValue;this.typeHandler=typeHandler;this.betweenValue=true;}protected Criterion(String condition,Object value,Object secondValue){this(condition,value,secondValue,null);}}

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table tb_config
     *
     * @mbg.generated do_not_delete_during_merge
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }
}