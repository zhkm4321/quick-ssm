package com.wx.server.entity;

import java.io.Serializable;

public class TbGoods implements Serializable {

  /**
   * This field was generated by MyBatis Generator. This field corresponds to the database column tb_goods.id
   * @mbg.generated
   */
  private Integer id;
  /**
   * This field was generated by MyBatis Generator. This field corresponds to the database column tb_goods.goods_name
   * @mbg.generated
   */
  private String goodsName;
  /**
   * This field was generated by MyBatis Generator. This field corresponds to the database column tb_goods.goods_img
   * @mbg.generated
   */
  private String goodsImg;
  /**
   * This field was generated by MyBatis Generator. This field corresponds to the database column tb_goods.goods_spe
   * @mbg.generated
   */
  private String goodsSpe;
  /**
   * This field was generated by MyBatis Generator. This field corresponds to the database column tb_goods.goods_price
   * @mbg.generated
   */
  private Double goodsPrice;
  /**
   * This field was generated by MyBatis Generator. This field corresponds to the database column tb_goods.goods_num
   * @mbg.generated
   */
  private String goodsNum;
  /**
   * This field was generated by MyBatis Generator. This field corresponds to the database column tb_goods.add_time
   * @mbg.generated
   */
  private String addTime;
  /**
   * This field was generated by MyBatis Generator. This field corresponds to the database column tb_goods.ctg_id
   * @mbg.generated
   */
  private Integer ctgId;
  /**
   * This field was generated by MyBatis Generator. This field corresponds to the database column tb_goods.is_recommend
   * @mbg.generated
   */
  private Integer isRecommend;
  /**
   * This field was generated by MyBatis Generator. This field corresponds to the database column tb_goods.status
   * @mbg.generated
   */
  private Integer status;
  /**
   * This field was generated by MyBatis Generator. This field corresponds to the database column tb_goods.type
   * @mbg.generated
   */
  private Integer type;
  /**
   * This field was generated by MyBatis Generator. This field corresponds to the database column tb_goods.goods_detail
   * @mbg.generated
   */
  private String goodsDetail;
  /**
   * This field was generated by MyBatis Generator. This field corresponds to the database table tb_goods
   * @mbg.generated
   */
  private static final long serialVersionUID = 1L;

  /**
   * This method was generated by MyBatis Generator. This method returns the value of the database column tb_goods.id
   * @return  the value of tb_goods.id
   * @mbg.generated
   */
  public Integer getId() {
    return id;
  }

  /**
   * This method was generated by MyBatis Generator. This method sets the value of the database column tb_goods.id
   * @param id  the value for tb_goods.id
   * @mbg.generated
   */
  public void setId(Integer id) {
    this.id = id;
  }

  /**
   * This method was generated by MyBatis Generator. This method returns the value of the database column tb_goods.goods_name
   * @return  the value of tb_goods.goods_name
   * @mbg.generated
   */
  public String getGoodsName() {
    return goodsName;
  }

  /**
   * This method was generated by MyBatis Generator. This method sets the value of the database column tb_goods.goods_name
   * @param goodsName  the value for tb_goods.goods_name
   * @mbg.generated
   */
  public void setGoodsName(String goodsName) {
    this.goodsName = goodsName == null ? null : goodsName.trim();
  }

  /**
   * This method was generated by MyBatis Generator. This method returns the value of the database column tb_goods.goods_img
   * @return  the value of tb_goods.goods_img
   * @mbg.generated
   */
  public String getGoodsImg() {
    return goodsImg;
  }

  /**
   * This method was generated by MyBatis Generator. This method sets the value of the database column tb_goods.goods_img
   * @param goodsImg  the value for tb_goods.goods_img
   * @mbg.generated
   */
  public void setGoodsImg(String goodsImg) {
    this.goodsImg = goodsImg == null ? null : goodsImg.trim();
  }

  /**
   * This method was generated by MyBatis Generator. This method returns the value of the database column tb_goods.goods_spe
   * @return  the value of tb_goods.goods_spe
   * @mbg.generated
   */
  public String getGoodsSpe() {
    return goodsSpe;
  }

  /**
   * This method was generated by MyBatis Generator. This method sets the value of the database column tb_goods.goods_spe
   * @param goodsSpe  the value for tb_goods.goods_spe
   * @mbg.generated
   */
  public void setGoodsSpe(String goodsSpe) {
    this.goodsSpe = goodsSpe == null ? null : goodsSpe.trim();
  }

  /**
   * This method was generated by MyBatis Generator. This method returns the value of the database column tb_goods.goods_price
   * @return  the value of tb_goods.goods_price
   * @mbg.generated
   */
  public Double getGoodsPrice() {
    return goodsPrice;
  }

  /**
   * This method was generated by MyBatis Generator. This method sets the value of the database column tb_goods.goods_price
   * @param goodsPrice  the value for tb_goods.goods_price
   * @mbg.generated
   */
  public void setGoodsPrice(Double goodsPrice) {
    this.goodsPrice = goodsPrice;
  }

  /**
   * This method was generated by MyBatis Generator. This method returns the value of the database column tb_goods.goods_num
   * @return  the value of tb_goods.goods_num
   * @mbg.generated
   */
  public String getGoodsNum() {
    return goodsNum;
  }

  /**
   * This method was generated by MyBatis Generator. This method sets the value of the database column tb_goods.goods_num
   * @param goodsNum  the value for tb_goods.goods_num
   * @mbg.generated
   */
  public void setGoodsNum(String goodsNum) {
    this.goodsNum = goodsNum == null ? null : goodsNum.trim();
  }

  /**
   * This method was generated by MyBatis Generator. This method returns the value of the database column tb_goods.add_time
   * @return  the value of tb_goods.add_time
   * @mbg.generated
   */
  public String getAddTime() {
    return addTime;
  }

  /**
   * This method was generated by MyBatis Generator. This method sets the value of the database column tb_goods.add_time
   * @param addTime  the value for tb_goods.add_time
   * @mbg.generated
   */
  public void setAddTime(String addTime) {
    this.addTime = addTime == null ? null : addTime.trim();
  }

  /**
   * This method was generated by MyBatis Generator. This method returns the value of the database column tb_goods.ctg_id
   * @return  the value of tb_goods.ctg_id
   * @mbg.generated
   */
  public Integer getCtgId() {
    return ctgId;
  }

  /**
   * This method was generated by MyBatis Generator. This method sets the value of the database column tb_goods.ctg_id
   * @param ctgId  the value for tb_goods.ctg_id
   * @mbg.generated
   */
  public void setCtgId(Integer ctgId) {
    this.ctgId = ctgId;
  }

  /**
   * This method was generated by MyBatis Generator. This method returns the value of the database column tb_goods.is_recommend
   * @return  the value of tb_goods.is_recommend
   * @mbg.generated
   */
  public Integer getIsRecommend() {
    return isRecommend;
  }

  /**
   * This method was generated by MyBatis Generator. This method sets the value of the database column tb_goods.is_recommend
   * @param isRecommend  the value for tb_goods.is_recommend
   * @mbg.generated
   */
  public void setIsRecommend(Integer isRecommend) {
    this.isRecommend = isRecommend;
  }

  /**
   * This method was generated by MyBatis Generator. This method returns the value of the database column tb_goods.status
   * @return  the value of tb_goods.status
   * @mbg.generated
   */
  public Integer getStatus() {
    return status;
  }

  /**
   * This method was generated by MyBatis Generator. This method sets the value of the database column tb_goods.status
   * @param status  the value for tb_goods.status
   * @mbg.generated
   */
  public void setStatus(Integer status) {
    this.status = status;
  }

  /**
   * This method was generated by MyBatis Generator. This method returns the value of the database column tb_goods.type
   * @return  the value of tb_goods.type
   * @mbg.generated
   */
  public Integer getType() {
    return type;
  }

  /**
   * This method was generated by MyBatis Generator. This method sets the value of the database column tb_goods.type
   * @param type  the value for tb_goods.type
   * @mbg.generated
   */
  public void setType(Integer type) {
    this.type = type;
  }

  /**
   * This method was generated by MyBatis Generator. This method returns the value of the database column tb_goods.goods_detail
   * @return  the value of tb_goods.goods_detail
   * @mbg.generated
   */
  public String getGoodsDetail() {
    return goodsDetail;
  }

  /**
   * This method was generated by MyBatis Generator. This method sets the value of the database column tb_goods.goods_detail
   * @param goodsDetail  the value for tb_goods.goods_detail
   * @mbg.generated
   */
  public void setGoodsDetail(String goodsDetail) {
    this.goodsDetail = goodsDetail == null ? null : goodsDetail.trim();
  }
}