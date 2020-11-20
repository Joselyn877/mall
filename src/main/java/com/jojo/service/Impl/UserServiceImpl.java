package com.jojo.service.Impl;

import com.jojo.mapper.UserMapper;
import com.jojo.service.UserService;
import com.jojo.util.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    //日志信息
    protected static final Logger LOG =LoggerFactory.getLogger(UserServiceImpl.class);
    @Autowired
    private UserMapper userMapper;
    @Override
    public List<User> selectById(Integer id) {
        LOG.debug("UserServiceImpl.selectById begin========");
        List<User> users = userMapper.selectById(id);
        System.out.println(users);
        LOG.debug("UserServiceImpl.selectById end========");
        return users;
    }
}
