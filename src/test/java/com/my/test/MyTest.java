package com.my.test;

import com.my.pojo.User;
import com.my.service.UserService;
import com.my.util.DESUTIL;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.util.Date;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class MyTest {
    @Resource
    UserService userService;
    @Test
    public void method(){
        User user = new User();
        user.setName("牟奕");
        user.setPassword(DESUTIL.encode("abcdefg"));
        user.setLoginId("admin");
        user.setPhone("18335170630");
        user.setSex(1);
        user.setCreateDate(new Date());
        user.setEmail("abc@qq.com");
        System.out.println(userService.add(user));
    }
}

