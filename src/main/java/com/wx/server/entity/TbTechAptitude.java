package com.wx.server.entity;

import java.io.Serializable;

public class TbTechAptitude implements Serializable {

  /**
   * This field was generated by MyBatis Generator. This field corresponds to the database column tb_tech_aptitude.id
   * @mbg.generated
   */
  private Integer id;
  /**
   * This field was generated by MyBatis Generator. This field corresponds to the database column tb_tech_aptitude.user_id
   * @mbg.generated
   */
  private Integer userId;
  /**
   * This field was generated by MyBatis Generator. This field corresponds to the database column tb_tech_aptitude.aptitude_name
   * @mbg.generated
   */
  private String aptitudeName;
  /**
   * This field was generated by MyBatis Generator. This field corresponds to the database column tb_tech_aptitude.file_id
   * @mbg.generated
   */
  private Integer fileId;
  /**
   * This field was generated by MyBatis Generator. This field corresponds to the database column tb_tech_aptitude.file_path
   * @mbg.generated
   */
  private String filePath;
  /**
   * This field was generated by MyBatis Generator. This field corresponds to the database table tb_tech_aptitude
   * @mbg.generated
   */
  private static final long serialVersionUID = 1L;

  /**
   * This method was generated by MyBatis Generator. This method returns the value of the database column tb_tech_aptitude.id
   * @return  the value of tb_tech_aptitude.id
   * @mbg.generated
   */
  public Integer getId() {
    return id;
  }

  /**
   * This method was generated by MyBatis Generator. This method sets the value of the database column tb_tech_aptitude.id
   * @param id  the value for tb_tech_aptitude.id
   * @mbg.generated
   */
  public void setId(Integer id) {
    this.id = id;
  }

  /**
   * This method was generated by MyBatis Generator. This method returns the value of the database column tb_tech_aptitude.user_id
   * @return  the value of tb_tech_aptitude.user_id
   * @mbg.generated
   */
  public Integer getUserId() {
    return userId;
  }

  /**
   * This method was generated by MyBatis Generator. This method sets the value of the database column tb_tech_aptitude.user_id
   * @param userId  the value for tb_tech_aptitude.user_id
   * @mbg.generated
   */
  public void setUserId(Integer userId) {
    this.userId = userId;
  }

  /**
   * This method was generated by MyBatis Generator. This method returns the value of the database column tb_tech_aptitude.aptitude_name
   * @return  the value of tb_tech_aptitude.aptitude_name
   * @mbg.generated
   */
  public String getAptitudeName() {
    return aptitudeName;
  }

  /**
   * This method was generated by MyBatis Generator. This method sets the value of the database column tb_tech_aptitude.aptitude_name
   * @param aptitudeName  the value for tb_tech_aptitude.aptitude_name
   * @mbg.generated
   */
  public void setAptitudeName(String aptitudeName) {
    this.aptitudeName = aptitudeName == null ? null : aptitudeName.trim();
  }

  /**
   * This method was generated by MyBatis Generator. This method returns the value of the database column tb_tech_aptitude.file_id
   * @return  the value of tb_tech_aptitude.file_id
   * @mbg.generated
   */
  public Integer getFileId() {
    return fileId;
  }

  /**
   * This method was generated by MyBatis Generator. This method sets the value of the database column tb_tech_aptitude.file_id
   * @param fileId  the value for tb_tech_aptitude.file_id
   * @mbg.generated
   */
  public void setFileId(Integer fileId) {
    this.fileId = fileId;
  }

  /**
   * This method was generated by MyBatis Generator. This method returns the value of the database column tb_tech_aptitude.file_path
   * @return  the value of tb_tech_aptitude.file_path
   * @mbg.generated
   */
  public String getFilePath() {
    return filePath;
  }

  /**
   * This method was generated by MyBatis Generator. This method sets the value of the database column tb_tech_aptitude.file_path
   * @param filePath  the value for tb_tech_aptitude.file_path
   * @mbg.generated
   */
  public void setFilePath(String filePath) {
    this.filePath = filePath == null ? null : filePath.trim();
  }
}