package io.shj.shop.user.controller;

import io.shj.shop.bean.User;
import io.shj.shop.user.service.UserService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    UserService userService;

    public User getUserById(@Param("id") Long userId){
        return userService.getUserById(userId);
    }
}
