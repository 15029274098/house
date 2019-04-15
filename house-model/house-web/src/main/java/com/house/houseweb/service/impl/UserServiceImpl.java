package com.house.houseweb.service.impl;

import com.house.housebiz.mapper.UserMapper;
import com.house.housecommon.model.User;
import com.house.houseweb.service.UserService;
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
