package com.jojo.service;

import com.jojo.util.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {
    List<User> selectById(Integer id);
}
