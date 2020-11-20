package com.jojo.controller;

import com.jojo.service.UserService;
import com.jojo.util.User;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

//用户信息查询接口
@RestController
@Api(tags = "用户管理")
public class UserController {
    @Autowired
    private UserService userService;
    @GetMapping("/user")
    public List<User> getUser(Integer id){
        List<User> users = userService.selectById(id);
        return users;
    }

}
