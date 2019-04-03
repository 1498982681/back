package com.my.service.impl;

import com.my.dao.UserMapper;
import com.my.pojo.User;
import com.my.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by dell on 2019/4/3.
 */
@Service
public class UserServiceImpl implements UserService {
    @Resource
    UserMapper userMapper;
    @Override
    public int add(User user) {
        return userMapper.insertSelective(user);
    }
}

