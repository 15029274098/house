package com.ruantong.house.service.impl;

import com.ruantong.house.mapper.UserMapper;
import com.ruantong.house.model.User;
import com.ruantong.house.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;
    @Override
    public List<User> getUsers() {
        return userMapper.selectUsers();
    }
}
