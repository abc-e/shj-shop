package io.shj.shop.user.controller;

import com.alibaba.fastjson.JSONObject;
import io.shj.shop.bean.User;
import io.shj.shop.user.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@Slf4j
@RestController
public class UserController {
    @Autowired
    UserService userService;

    @GetMapping("/getTest")
    public String getTest(){
        return "ok,User";
    }

    @GetMapping("/getUser/{uid}")
    public User getUserById(@PathVariable("uid") Long uid){
        User user = userService.getUserById(uid);
        log.info("获取到的用户信息为：{}",JSONObject.toJSONString(user));
        return user;
    }
}
