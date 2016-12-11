package com.wx.server.dao;

import com.wx.server.entity.TbRole;
import com.wx.server.entity.TbRoleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbRoleMapper {

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table tb_role
   * @mbg.generated
   */
  int deleteByExample(TbRoleExample example);

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table tb_role
   * @mbg.generated
   */
  int deleteByPrimaryKey(Integer id);

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table tb_role
   * @mbg.generated
   */
  int insert(TbRole record);

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table tb_role
   * @mbg.generated
   */
  int insertSelective(TbRole record);

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table tb_role
   * @mbg.generated
   */List<TbRole> selectByExample(TbRoleExample example);

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table tb_role
   * @mbg.generated
   */
  TbRole selectByPrimaryKey(Integer id);

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table tb_role
   * @mbg.generated
   */int updateByExampleSelective(@Param("record") TbRole record,@Param("example") TbRoleExample example);

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table tb_role
   * @mbg.generated
   */int updateByExample(@Param("record") TbRole record,@Param("example") TbRoleExample example);

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table tb_role
   * @mbg.generated
   */
  int updateByPrimaryKeySelective(TbRole record);

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table tb_role
   * @mbg.generated
   */
  int updateByPrimaryKey(TbRole record);
}