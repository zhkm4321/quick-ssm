package com.wx.server.entity;

import java.io.Serializable;

public class TbTopicKeep implements Serializable {

  /**
   * This field was generated by MyBatis Generator. This field corresponds to the database column tb_topic_keep.id
   * @mbg.generated
   */
  private Integer id;
  /**
   * This field was generated by MyBatis Generator. This field corresponds to the database column tb_topic_keep.topic_id
   * @mbg.generated
   */
  private Integer topicId;
  /**
   * This field was generated by MyBatis Generator. This field corresponds to the database column tb_topic_keep.user_id
   * @mbg.generated
   */
  private Integer userId;
  /**
   * This field was generated by MyBatis Generator. This field corresponds to the database table tb_topic_keep
   * @mbg.generated
   */
  private static final long serialVersionUID = 1L;

  /**
   * This method was generated by MyBatis Generator. This method returns the value of the database column tb_topic_keep.id
   * @return  the value of tb_topic_keep.id
   * @mbg.generated
   */
  public Integer getId() {
    return id;
  }

  /**
   * This method was generated by MyBatis Generator. This method sets the value of the database column tb_topic_keep.id
   * @param id  the value for tb_topic_keep.id
   * @mbg.generated
   */
  public void setId(Integer id) {
    this.id = id;
  }

  /**
   * This method was generated by MyBatis Generator. This method returns the value of the database column tb_topic_keep.topic_id
   * @return  the value of tb_topic_keep.topic_id
   * @mbg.generated
   */
  public Integer getTopicId() {
    return topicId;
  }

  /**
   * This method was generated by MyBatis Generator. This method sets the value of the database column tb_topic_keep.topic_id
   * @param topicId  the value for tb_topic_keep.topic_id
   * @mbg.generated
   */
  public void setTopicId(Integer topicId) {
    this.topicId = topicId;
  }

  /**
   * This method was generated by MyBatis Generator. This method returns the value of the database column tb_topic_keep.user_id
   * @return  the value of tb_topic_keep.user_id
   * @mbg.generated
   */
  public Integer getUserId() {
    return userId;
  }

  /**
   * This method was generated by MyBatis Generator. This method sets the value of the database column tb_topic_keep.user_id
   * @param userId  the value for tb_topic_keep.user_id
   * @mbg.generated
   */
  public void setUserId(Integer userId) {
    this.userId = userId;
  }
}