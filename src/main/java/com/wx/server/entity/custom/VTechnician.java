package com.wx.server.entity.custom;

import java.util.List;

import com.wx.server.entity.TbService;
import com.wx.server.entity.TbTechnician;

/**
 * 技师实体类用于关联查询
 * 
 * @author zhenghang
 * @version 创建时间：2016年12月17日 下午11:39:47
 */
public class VTechnician extends TbTechnician {

  private static final long serialVersionUID = 8708342327957548384L;

  private List<TbService> skilfulList;

  public List<TbService> getSkilfulList() {
    return skilfulList;
  }

  public void setSkilfulList(List<TbService> skilfulList) {
    this.skilfulList = skilfulList;
  }

}
