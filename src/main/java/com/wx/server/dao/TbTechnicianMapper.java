package com.wx.server.dao;

import com.wx.server.entity.TbTechnician;
import com.wx.server.entity.TbTechnicianExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbTechnicianMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_technician
     *
     * @mbg.generated
     */
    int deleteByExample(TbTechnicianExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_technician
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_technician
     *
     * @mbg.generated
     */
    int insert(TbTechnician record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_technician
     *
     * @mbg.generated
     */
    int insertSelective(TbTechnician record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_technician
     *
     * @mbg.generated
     */
    List<TbTechnician> selectByExample(TbTechnicianExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_technician
     *
     * @mbg.generated
     */
    TbTechnician selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_technician
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") TbTechnician record, @Param("example") TbTechnicianExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_technician
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") TbTechnician record, @Param("example") TbTechnicianExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_technician
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(TbTechnician record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_technician
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(TbTechnician record);
}