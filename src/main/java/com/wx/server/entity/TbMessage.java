package com.wx.server.entity;

import java.io.Serializable;
import java.util.Date;

public class TbMessage implements Serializable {

  /**
   * This field was generated by MyBatis Generator. This field corresponds to the database column tb_message.id
   * @mbg.generated
   */
  private Integer id;
  /**
   * This field was generated by MyBatis Generator. This field corresponds to the database column tb_message.user_id
   * @mbg.generated
   */
  private Integer userId;
  /**
   * This field was generated by MyBatis Generator. This field corresponds to the database column tb_message.message
   * @mbg.generated
   */
  private String message;
  /**
   * This field was generated by MyBatis Generator. This field corresponds to the database column tb_message.create_time
   * @mbg.generated
   */
  private Date createTime;
  /**
   * This field was generated by MyBatis Generator. This field corresponds to the database column tb_message.read
   * @mbg.generated
   */
  private Integer read;
  /**
   * This field was generated by MyBatis Generator. This field corresponds to the database table tb_message
   * @mbg.generated
   */
  private static final long serialVersionUID = 1L;

  /**
   * This method was generated by MyBatis Generator. This method returns the value of the database column tb_message.id
   * @return  the value of tb_message.id
   * @mbg.generated
   */
  public Integer getId() {
    return id;
  }

  /**
   * This method was generated by MyBatis Generator. This method sets the value of the database column tb_message.id
   * @param id  the value for tb_message.id
   * @mbg.generated
   */
  public void setId(Integer id) {
    this.id = id;
  }

  /**
   * This method was generated by MyBatis Generator. This method returns the value of the database column tb_message.user_id
   * @return  the value of tb_message.user_id
   * @mbg.generated
   */
  public Integer getUserId() {
    return userId;
  }

  /**
   * This method was generated by MyBatis Generator. This method sets the value of the database column tb_message.user_id
   * @param userId  the value for tb_message.user_id
   * @mbg.generated
   */
  public void setUserId(Integer userId) {
    this.userId = userId;
  }

  /**
   * This method was generated by MyBatis Generator. This method returns the value of the database column tb_message.message
   * @return  the value of tb_message.message
   * @mbg.generated
   */
  public String getMessage() {
    return message;
  }

  /**
   * This method was generated by MyBatis Generator. This method sets the value of the database column tb_message.message
   * @param message  the value for tb_message.message
   * @mbg.generated
   */
  public void setMessage(String message) {
    this.message = message == null ? null : message.trim();
  }

  /**
   * This method was generated by MyBatis Generator. This method returns the value of the database column tb_message.create_time
   * @return  the value of tb_message.create_time
   * @mbg.generated
   */
  public Date getCreateTime() {
    return createTime;
  }

  /**
   * This method was generated by MyBatis Generator. This method sets the value of the database column tb_message.create_time
   * @param createTime  the value for tb_message.create_time
   * @mbg.generated
   */
  public void setCreateTime(Date createTime) {
    this.createTime = createTime;
  }

  /**
   * This method was generated by MyBatis Generator. This method returns the value of the database column tb_message.read
   * @return  the value of tb_message.read
   * @mbg.generated
   */
  public Integer getRead() {
    return read;
  }

  /**
   * This method was generated by MyBatis Generator. This method sets the value of the database column tb_message.read
   * @param read  the value for tb_message.read
   * @mbg.generated
   */
  public void setRead(Integer read) {
    this.read = read;
  }
}