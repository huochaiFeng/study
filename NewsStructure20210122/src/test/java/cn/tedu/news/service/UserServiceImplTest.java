package cn.tedu.news.service;

import cn.tedu.news.pojo.User;
import org.junit.jupiter.api.Test;

public class UserServiceImplTest {
    UserService userService=new UserServiceImpl();
    @Test
    public void testLogin(){
        User user=userService.login("admin");
        System.out.println(user.getuPwd());
    }
}
