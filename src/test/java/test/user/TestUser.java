package test.user;

import com.wx.server.entity.TbUser;
import com.wx.server.utils.HttpClientUtils;

public class TestUser {

  // @Test
  public void Test01() {

    TbUser user = new TbUser();
    user.setOpenId("1111111111");
    user.setUsername("我是郑航");

    String postJsonEntity = HttpClientUtils.postJsonEntity("http://localhost:8080/wxserver/user/register.action", user);
    System.out.println(postJsonEntity);

  }

  // @Test
  public void Test03() {

    TbUser user = new TbUser();
    user.setUserId(23523);
    String postJsonEntity = HttpClientUtils.postJsonEntity("http://localhost:8080/wxserver/user/login.action", user);
    System.out.println(postJsonEntity);

  }

}
