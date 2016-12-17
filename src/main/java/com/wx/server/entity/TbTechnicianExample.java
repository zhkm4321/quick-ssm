package com.wx.server.entity;

import com.wx.server.vo.page.Page;
import java.util.ArrayList;
import java.util.List;

public class TbTechnicianExample {
    /**
   * This field was generated by MyBatis Generator. This field corresponds to the database table tb_technician
   * @mbg.generated
   */
  protected String orderByClause;
  /**
   * This field was generated by MyBatis Generator. This field corresponds to the database table tb_technician
   * @mbg.generated
   */
  protected boolean distinct;
  /**
   * This field was generated by MyBatis Generator. This field corresponds to the database table tb_technician
   * @mbg.generated
   */protected List<Criteria> oredCriteria;
  /**
   * This field was generated by MyBatis Generator. This field corresponds to the database table tb_technician
   * @mbg.generated
   */
  protected Page page;

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table tb_technician
   * @mbg.generated
   */public TbTechnicianExample(){oredCriteria=new ArrayList<Criteria>();}

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table tb_technician
   * @mbg.generated
   */
  public void setOrderByClause(String orderByClause) {
    this.orderByClause = orderByClause;
  }

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table tb_technician
   * @mbg.generated
   */
  public String getOrderByClause() {
    return orderByClause;
  }

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table tb_technician
   * @mbg.generated
   */
  public void setDistinct(boolean distinct) {
    this.distinct = distinct;
  }

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table tb_technician
   * @mbg.generated
   */
  public boolean isDistinct() {
    return distinct;
  }

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table tb_technician
   * @mbg.generated
   */public List<Criteria> getOredCriteria(){return oredCriteria;}

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table tb_technician
   * @mbg.generated
   */
  public void or(Criteria criteria) {
    oredCriteria.add(criteria);
  }

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table tb_technician
   * @mbg.generated
   */
  public Criteria or() {
    Criteria criteria = createCriteriaInternal();
    oredCriteria.add(criteria);
    return criteria;
  }

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table tb_technician
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
   * This method was generated by MyBatis Generator. This method corresponds to the database table tb_technician
   * @mbg.generated
   */
  protected Criteria createCriteriaInternal() {
    Criteria criteria = new Criteria();
    return criteria;
  }

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table tb_technician
   * @mbg.generated
   */
  public void clear() {
    oredCriteria.clear();
    orderByClause = null;
    distinct = false;
  }

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table tb_technician
   * @mbg.generated
   */
  public void setPage(Page page) {
    this.page = page;
  }

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table tb_technician
   * @mbg.generated
   */
  public Page getPage() {
    return page;
  }

  /**
   * This class was generated by MyBatis Generator. This class corresponds to the database table tb_technician
   * @mbg.generated
   */protected abstract static class GeneratedCriteria {protected List<Criterion> criteria;protected GeneratedCriteria(){super();criteria=new ArrayList<Criterion>();}public boolean isValid(){return criteria.size() > 0;}public List<Criterion> getAllCriteria(){return criteria;}public List<Criterion> getCriteria(){return criteria;}protected void addCriterion(String condition){if (condition == null){throw new RuntimeException("Value for condition cannot be null");}criteria.add(new Criterion(condition));}protected void addCriterion(String condition,Object value,String property){if (value == null){throw new RuntimeException("Value for " + property + " cannot be null");}criteria.add(new Criterion(condition,value));}protected void addCriterion(String condition,Object value1,Object value2,String property){if (value1 == null || value2 == null){throw new RuntimeException("Between values for " + property + " cannot be null");}criteria.add(new Criterion(condition,value1,value2));}public Criteria andIdIsNull(){addCriterion("id is null");return (Criteria)this;}public Criteria andIdIsNotNull(){addCriterion("id is not null");return (Criteria)this;}public Criteria andIdEqualTo(Integer value){addCriterion("id =",value,"id");return (Criteria)this;}public Criteria andIdNotEqualTo(Integer value){addCriterion("id <>",value,"id");return (Criteria)this;}public Criteria andIdGreaterThan(Integer value){addCriterion("id >",value,"id");return (Criteria)this;}public Criteria andIdGreaterThanOrEqualTo(Integer value){addCriterion("id >=",value,"id");return (Criteria)this;}public Criteria andIdLessThan(Integer value){addCriterion("id <",value,"id");return (Criteria)this;}public Criteria andIdLessThanOrEqualTo(Integer value){addCriterion("id <=",value,"id");return (Criteria)this;}public Criteria andIdIn(List<Integer> values){addCriterion("id in",values,"id");return (Criteria)this;}public Criteria andIdNotIn(List<Integer> values){addCriterion("id not in",values,"id");return (Criteria)this;}public Criteria andIdBetween(Integer value1,Integer value2){addCriterion("id between",value1,value2,"id");return (Criteria)this;}public Criteria andIdNotBetween(Integer value1,Integer value2){addCriterion("id not between",value1,value2,"id");return (Criteria)this;}public Criteria andUserIdIsNull(){addCriterion("user_id is null");return (Criteria)this;}public Criteria andUserIdIsNotNull(){addCriterion("user_id is not null");return (Criteria)this;}public Criteria andUserIdEqualTo(Integer value){addCriterion("user_id =",value,"userId");return (Criteria)this;}public Criteria andUserIdNotEqualTo(Integer value){addCriterion("user_id <>",value,"userId");return (Criteria)this;}public Criteria andUserIdGreaterThan(Integer value){addCriterion("user_id >",value,"userId");return (Criteria)this;}public Criteria andUserIdGreaterThanOrEqualTo(Integer value){addCriterion("user_id >=",value,"userId");return (Criteria)this;}public Criteria andUserIdLessThan(Integer value){addCriterion("user_id <",value,"userId");return (Criteria)this;}public Criteria andUserIdLessThanOrEqualTo(Integer value){addCriterion("user_id <=",value,"userId");return (Criteria)this;}public Criteria andUserIdIn(List<Integer> values){addCriterion("user_id in",values,"userId");return (Criteria)this;}public Criteria andUserIdNotIn(List<Integer> values){addCriterion("user_id not in",values,"userId");return (Criteria)this;}public Criteria andUserIdBetween(Integer value1,Integer value2){addCriterion("user_id between",value1,value2,"userId");return (Criteria)this;}public Criteria andUserIdNotBetween(Integer value1,Integer value2){addCriterion("user_id not between",value1,value2,"userId");return (Criteria)this;}public Criteria andRealnameIsNull(){addCriterion("realname is null");return (Criteria)this;}public Criteria andRealnameIsNotNull(){addCriterion("realname is not null");return (Criteria)this;}public Criteria andRealnameEqualTo(String value){addCriterion("realname =",value,"realname");return (Criteria)this;}public Criteria andRealnameNotEqualTo(String value){addCriterion("realname <>",value,"realname");return (Criteria)this;}public Criteria andRealnameGreaterThan(String value){addCriterion("realname >",value,"realname");return (Criteria)this;}public Criteria andRealnameGreaterThanOrEqualTo(String value){addCriterion("realname >=",value,"realname");return (Criteria)this;}public Criteria andRealnameLessThan(String value){addCriterion("realname <",value,"realname");return (Criteria)this;}public Criteria andRealnameLessThanOrEqualTo(String value){addCriterion("realname <=",value,"realname");return (Criteria)this;}public Criteria andRealnameLike(String value){addCriterion("realname like",value,"realname");return (Criteria)this;}public Criteria andRealnameNotLike(String value){addCriterion("realname not like",value,"realname");return (Criteria)this;}public Criteria andRealnameIn(List<String> values){addCriterion("realname in",values,"realname");return (Criteria)this;}public Criteria andRealnameNotIn(List<String> values){addCriterion("realname not in",values,"realname");return (Criteria)this;}public Criteria andRealnameBetween(String value1,String value2){addCriterion("realname between",value1,value2,"realname");return (Criteria)this;}public Criteria andRealnameNotBetween(String value1,String value2){addCriterion("realname not between",value1,value2,"realname");return (Criteria)this;}public Criteria andSeniorityIsNull(){addCriterion("seniority is null");return (Criteria)this;}public Criteria andSeniorityIsNotNull(){addCriterion("seniority is not null");return (Criteria)this;}public Criteria andSeniorityEqualTo(Integer value){addCriterion("seniority =",value,"seniority");return (Criteria)this;}public Criteria andSeniorityNotEqualTo(Integer value){addCriterion("seniority <>",value,"seniority");return (Criteria)this;}public Criteria andSeniorityGreaterThan(Integer value){addCriterion("seniority >",value,"seniority");return (Criteria)this;}public Criteria andSeniorityGreaterThanOrEqualTo(Integer value){addCriterion("seniority >=",value,"seniority");return (Criteria)this;}public Criteria andSeniorityLessThan(Integer value){addCriterion("seniority <",value,"seniority");return (Criteria)this;}public Criteria andSeniorityLessThanOrEqualTo(Integer value){addCriterion("seniority <=",value,"seniority");return (Criteria)this;}public Criteria andSeniorityIn(List<Integer> values){addCriterion("seniority in",values,"seniority");return (Criteria)this;}public Criteria andSeniorityNotIn(List<Integer> values){addCriterion("seniority not in",values,"seniority");return (Criteria)this;}public Criteria andSeniorityBetween(Integer value1,Integer value2){addCriterion("seniority between",value1,value2,"seniority");return (Criteria)this;}public Criteria andSeniorityNotBetween(Integer value1,Integer value2){addCriterion("seniority not between",value1,value2,"seniority");return (Criteria)this;}public Criteria andPhoneIsNull(){addCriterion("phone is null");return (Criteria)this;}public Criteria andPhoneIsNotNull(){addCriterion("phone is not null");return (Criteria)this;}public Criteria andPhoneEqualTo(String value){addCriterion("phone =",value,"phone");return (Criteria)this;}public Criteria andPhoneNotEqualTo(String value){addCriterion("phone <>",value,"phone");return (Criteria)this;}public Criteria andPhoneGreaterThan(String value){addCriterion("phone >",value,"phone");return (Criteria)this;}public Criteria andPhoneGreaterThanOrEqualTo(String value){addCriterion("phone >=",value,"phone");return (Criteria)this;}public Criteria andPhoneLessThan(String value){addCriterion("phone <",value,"phone");return (Criteria)this;}public Criteria andPhoneLessThanOrEqualTo(String value){addCriterion("phone <=",value,"phone");return (Criteria)this;}public Criteria andPhoneLike(String value){addCriterion("phone like",value,"phone");return (Criteria)this;}public Criteria andPhoneNotLike(String value){addCriterion("phone not like",value,"phone");return (Criteria)this;}public Criteria andPhoneIn(List<String> values){addCriterion("phone in",values,"phone");return (Criteria)this;}public Criteria andPhoneNotIn(List<String> values){addCriterion("phone not in",values,"phone");return (Criteria)this;}public Criteria andPhoneBetween(String value1,String value2){addCriterion("phone between",value1,value2,"phone");return (Criteria)this;}public Criteria andPhoneNotBetween(String value1,String value2){addCriterion("phone not between",value1,value2,"phone");return (Criteria)this;}public Criteria andDescriptionIsNull(){addCriterion("description is null");return (Criteria)this;}public Criteria andDescriptionIsNotNull(){addCriterion("description is not null");return (Criteria)this;}public Criteria andDescriptionEqualTo(String value){addCriterion("description =",value,"description");return (Criteria)this;}public Criteria andDescriptionNotEqualTo(String value){addCriterion("description <>",value,"description");return (Criteria)this;}public Criteria andDescriptionGreaterThan(String value){addCriterion("description >",value,"description");return (Criteria)this;}public Criteria andDescriptionGreaterThanOrEqualTo(String value){addCriterion("description >=",value,"description");return (Criteria)this;}public Criteria andDescriptionLessThan(String value){addCriterion("description <",value,"description");return (Criteria)this;}public Criteria andDescriptionLessThanOrEqualTo(String value){addCriterion("description <=",value,"description");return (Criteria)this;}public Criteria andDescriptionLike(String value){addCriterion("description like",value,"description");return (Criteria)this;}public Criteria andDescriptionNotLike(String value){addCriterion("description not like",value,"description");return (Criteria)this;}public Criteria andDescriptionIn(List<String> values){addCriterion("description in",values,"description");return (Criteria)this;}public Criteria andDescriptionNotIn(List<String> values){addCriterion("description not in",values,"description");return (Criteria)this;}public Criteria andDescriptionBetween(String value1,String value2){addCriterion("description between",value1,value2,"description");return (Criteria)this;}public Criteria andDescriptionNotBetween(String value1,String value2){addCriterion("description not between",value1,value2,"description");return (Criteria)this;}public Criteria andOrderMonthIsNull(){addCriterion("order_month is null");return (Criteria)this;}public Criteria andOrderMonthIsNotNull(){addCriterion("order_month is not null");return (Criteria)this;}public Criteria andOrderMonthEqualTo(Integer value){addCriterion("order_month =",value,"orderMonth");return (Criteria)this;}public Criteria andOrderMonthNotEqualTo(Integer value){addCriterion("order_month <>",value,"orderMonth");return (Criteria)this;}public Criteria andOrderMonthGreaterThan(Integer value){addCriterion("order_month >",value,"orderMonth");return (Criteria)this;}public Criteria andOrderMonthGreaterThanOrEqualTo(Integer value){addCriterion("order_month >=",value,"orderMonth");return (Criteria)this;}public Criteria andOrderMonthLessThan(Integer value){addCriterion("order_month <",value,"orderMonth");return (Criteria)this;}public Criteria andOrderMonthLessThanOrEqualTo(Integer value){addCriterion("order_month <=",value,"orderMonth");return (Criteria)this;}public Criteria andOrderMonthIn(List<Integer> values){addCriterion("order_month in",values,"orderMonth");return (Criteria)this;}public Criteria andOrderMonthNotIn(List<Integer> values){addCriterion("order_month not in",values,"orderMonth");return (Criteria)this;}public Criteria andOrderMonthBetween(Integer value1,Integer value2){addCriterion("order_month between",value1,value2,"orderMonth");return (Criteria)this;}public Criteria andOrderMonthNotBetween(Integer value1,Integer value2){addCriterion("order_month not between",value1,value2,"orderMonth");return (Criteria)this;}public Criteria andScoreIsNull(){addCriterion("score is null");return (Criteria)this;}public Criteria andScoreIsNotNull(){addCriterion("score is not null");return (Criteria)this;}public Criteria andScoreEqualTo(Double value){addCriterion("score =",value,"score");return (Criteria)this;}public Criteria andScoreNotEqualTo(Double value){addCriterion("score <>",value,"score");return (Criteria)this;}public Criteria andScoreGreaterThan(Double value){addCriterion("score >",value,"score");return (Criteria)this;}public Criteria andScoreGreaterThanOrEqualTo(Double value){addCriterion("score >=",value,"score");return (Criteria)this;}public Criteria andScoreLessThan(Double value){addCriterion("score <",value,"score");return (Criteria)this;}public Criteria andScoreLessThanOrEqualTo(Double value){addCriterion("score <=",value,"score");return (Criteria)this;}public Criteria andScoreIn(List<Double> values){addCriterion("score in",values,"score");return (Criteria)this;}public Criteria andScoreNotIn(List<Double> values){addCriterion("score not in",values,"score");return (Criteria)this;}public Criteria andScoreBetween(Double value1,Double value2){addCriterion("score between",value1,value2,"score");return (Criteria)this;}public Criteria andScoreNotBetween(Double value1,Double value2){addCriterion("score not between",value1,value2,"score");return (Criteria)this;}}

  /**
   * This class was generated by MyBatis Generator. This class corresponds to the database table tb_technician
   * @mbg.generated
   */public static class Criterion {private String condition;private Object value;private Object secondValue;private boolean noValue;private boolean singleValue;private boolean betweenValue;private boolean listValue;private String typeHandler;public String getCondition(){return condition;}public Object getValue(){return value;}public Object getSecondValue(){return secondValue;}public boolean isNoValue(){return noValue;}public boolean isSingleValue(){return singleValue;}public boolean isBetweenValue(){return betweenValue;}public boolean isListValue(){return listValue;}public String getTypeHandler(){return typeHandler;}protected Criterion(String condition){super();this.condition=condition;this.typeHandler=null;this.noValue=true;}protected Criterion(String condition,Object value,String typeHandler){super();this.condition=condition;this.value=value;this.typeHandler=typeHandler;if (value instanceof List<?>){this.listValue=true;} else {this.singleValue=true;}}protected Criterion(String condition,Object value){this(condition,value,null);}protected Criterion(String condition,Object value,Object secondValue,String typeHandler){super();this.condition=condition;this.value=value;this.secondValue=secondValue;this.typeHandler=typeHandler;this.betweenValue=true;}protected Criterion(String condition,Object value,Object secondValue){this(condition,value,secondValue,null);}}

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table tb_technician
     *
     * @mbg.generated do_not_delete_during_merge
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }
}