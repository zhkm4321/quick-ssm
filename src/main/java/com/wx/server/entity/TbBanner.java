package com.wx.server.entity;

import java.io.Serializable;

public class TbBanner implements Serializable {

  /**
   * This field was generated by MyBatis Generator. This field corresponds to the database column tb_banner.id
   * @mbg.generated
   */
  private Integer id;
  /**
   * This field was generated by MyBatis Generator. This field corresponds to the database column tb_banner.ban_img
   * @mbg.generated
   */
  private String banImg;
  /**
   * This field was generated by MyBatis Generator. This field corresponds to the database column tb_banner.url
   * @mbg.generated
   */
  private String url;
  /**
   * This field was generated by MyBatis Generator. This field corresponds to the database column tb_banner.sort
   * @mbg.generated
   */
  private Integer sort;
  /**
   * This field was generated by MyBatis Generator. This field corresponds to the database column tb_banner.type
   * @mbg.generated
   */
  private Integer type;
  /**
   * This field was generated by MyBatis Generator. This field corresponds to the database column tb_banner.status
   * @mbg.generated
   */
  private Integer status;
  /**
   * This field was generated by MyBatis Generator. This field corresponds to the database table tb_banner
   * @mbg.generated
   */
  private static final long serialVersionUID = 1L;

  /**
   * This method was generated by MyBatis Generator. This method returns the value of the database column tb_banner.id
   * @return  the value of tb_banner.id
   * @mbg.generated
   */
  public Integer getId() {
    return id;
  }

  /**
   * This method was generated by MyBatis Generator. This method sets the value of the database column tb_banner.id
   * @param id  the value for tb_banner.id
   * @mbg.generated
   */
  public void setId(Integer id) {
    this.id = id;
  }

  /**
   * This method was generated by MyBatis Generator. This method returns the value of the database column tb_banner.ban_img
   * @return  the value of tb_banner.ban_img
   * @mbg.generated
   */
  public String getBanImg() {
    return banImg;
  }

  /**
   * This method was generated by MyBatis Generator. This method sets the value of the database column tb_banner.ban_img
   * @param banImg  the value for tb_banner.ban_img
   * @mbg.generated
   */
  public void setBanImg(String banImg) {
    this.banImg = banImg == null ? null : banImg.trim();
  }

  /**
   * This method was generated by MyBatis Generator. This method returns the value of the database column tb_banner.url
   * @return  the value of tb_banner.url
   * @mbg.generated
   */
  public String getUrl() {
    return url;
  }

  /**
   * This method was generated by MyBatis Generator. This method sets the value of the database column tb_banner.url
   * @param url  the value for tb_banner.url
   * @mbg.generated
   */
  public void setUrl(String url) {
    this.url = url == null ? null : url.trim();
  }

  /**
   * This method was generated by MyBatis Generator. This method returns the value of the database column tb_banner.sort
   * @return  the value of tb_banner.sort
   * @mbg.generated
   */
  public Integer getSort() {
    return sort;
  }

  /**
   * This method was generated by MyBatis Generator. This method sets the value of the database column tb_banner.sort
   * @param sort  the value for tb_banner.sort
   * @mbg.generated
   */
  public void setSort(Integer sort) {
    this.sort = sort;
  }

  /**
   * This method was generated by MyBatis Generator. This method returns the value of the database column tb_banner.type
   * @return  the value of tb_banner.type
   * @mbg.generated
   */
  public Integer getType() {
    return type;
  }

  /**
   * This method was generated by MyBatis Generator. This method sets the value of the database column tb_banner.type
   * @param type  the value for tb_banner.type
   * @mbg.generated
   */
  public void setType(Integer type) {
    this.type = type;
  }

  /**
   * This method was generated by MyBatis Generator. This method returns the value of the database column tb_banner.status
   * @return  the value of tb_banner.status
   * @mbg.generated
   */
  public Integer getStatus() {
    return status;
  }

  /**
   * This method was generated by MyBatis Generator. This method sets the value of the database column tb_banner.status
   * @param status  the value for tb_banner.status
   * @mbg.generated
   */
  public void setStatus(Integer status) {
    this.status = status;
  }
}