package io.shj.shop.user.service.impl;

import io.shj.shop.bean.User;
import io.shj.shop.user.mapper.UserMapper;
import io.shj.shop.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;

    @Override
    public User getUserById(Long userId) {
        return userMapper.getUserById(userId);
    }
}
