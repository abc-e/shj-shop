package io.shj.shop.user.controller;

import com.alibaba.fastjson.JSONObject;
import io.shj.shop.bean.User;
import io.shj.shop.user.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@Slf4j
@RestController
public class UserController {
    @Autowired
    UserService userService;

    @RequestMapping("/getUserById")
    public User getUserById(@Param("id") Long userId){
        User user = userService.getUserById(userId);
        log.info("获取到的用户信息为：{}",JSONObject.toJSONString(user));
        return user;
    }
}
