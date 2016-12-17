package com.wx.server.dao;

import com.wx.server.entity.TbPermission;
import com.wx.server.entity.TbPermissionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbPermissionMapper {

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table tb_permission
   * @mbg.generated
   */
  int deleteByExample(TbPermissionExample example);

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table tb_permission
   * @mbg.generated
   */
  int deleteByPrimaryKey(Integer id);

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table tb_permission
   * @mbg.generated
   */
  int insert(TbPermission record);

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table tb_permission
   * @mbg.generated
   */
  int insertSelective(TbPermission record);

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table tb_permission
   * @mbg.generated
   */List<TbPermission> selectByExample(TbPermissionExample example);

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table tb_permission
   * @mbg.generated
   */
  TbPermission selectByPrimaryKey(Integer id);

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table tb_permission
   * @mbg.generated
   */int updateByExampleSelective(@Param("record") TbPermission record,@Param("example") TbPermissionExample example);

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table tb_permission
   * @mbg.generated
   */int updateByExample(@Param("record") TbPermission record,@Param("example") TbPermissionExample example);

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table tb_permission
   * @mbg.generated
   */
  int updateByPrimaryKeySelective(TbPermission record);

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table tb_permission
   * @mbg.generated
   */
  int updateByPrimaryKey(TbPermission record);
}