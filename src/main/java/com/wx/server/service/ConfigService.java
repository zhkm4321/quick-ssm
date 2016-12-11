package com.wx.server.service;

import java.util.List;

import com.wx.server.entity.TbConfig;

/**
 * 微信服务端配置服务
 * 
 * @author zhenghang
 * @version 创建时间：2016年12月11日 下午5:31:24
 */
public interface ConfigService extends CommonService {

  public static String GROUP_WXCONFIG = "wxconfig";

  public static String GROUP_USERCONFIG = "userconfig";

  public static String WXCONFIG_TOKEN = "token";

  public static String WXCONFIG_APPID = "appID";

  public static String WXCONFIG_APPSECRET = "appsecret";

  public static String WXCONFIG_WXSERVER_DOMAIN = "wxserver_domain";

  public static String WXCONFIG_GET_ACCESS_TOKEN_URL = "get_access_token_url";

  public static String WXCONFIG_ACCESS_TOKEN = "access_token";

  public static String WXCONFIG_EXPIRES_IN = "expires_in";

  public static String WXCONFIG_MENU_CREATE_URL = "menu_create_url";

  public static String WXCONFIG_MENU_CONFIG = "menu_config";

  public static String USERCONFIG_SNSAPI_USERINFO_URL = "snsapi_userinfo_url";

  public static String USERCONFIG_REDIRECT_URI = "redirect_uri";

  /**
   * 刷新缓存
   */
  public void reload();

  /**
   * 根据分组获取配置
   * 
   * @param groupName
   * @return
   */
  public List<TbConfig> getByGroup(String groupName);

  /**
   * 根据分组和key获取配置实体
   * 
   * @param groupWxconfig
   * @param wxconfigExpiresIn
   * @return
   */
  public TbConfig getByGroupAndKey(String group, String key);

  /**
   * 获取配置信息
   * 
   * @param groupName
   * @param key
   * @return
   */
  public String getValue(String groupName, String key);

  /**
   * 更新数据库和缓存中的值
   * 
   * @param groupName
   * @param key
   * @param value
   * @return
   */
  public void setValue(String groupName, String key, String value);

  /**
   * 强制更新数据库和缓存中的值
   * 
   * @param groupName
   * @param key
   * @param value
   * @param forceUpdate
   */
  public void setValue(String groupName, String key, String value, boolean forceUpdate);

}
