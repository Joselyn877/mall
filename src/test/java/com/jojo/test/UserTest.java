package com.jojo.test;

import com.jojo.mapper.UserMapper;
import com.jojo.util.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class UserTest {
    @Autowired
    private UserMapper userMapper;
    @Test
    public void getUserInfo(){
        List<User> users = userMapper.selectById(1);
        System.out.println(users);
    }
}
