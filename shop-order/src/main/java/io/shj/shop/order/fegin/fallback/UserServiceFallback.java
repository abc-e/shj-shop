package io.shj.shop.order.fegin.fallback;

import io.shj.shop.bean.User;
import io.shj.shop.order.fegin.UserService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * @author shijiepro
 * @version 1.0.0
 * @description 用户服务-容错类
 * */
@Component
@Qualifier(value = "userServiceFallback")
public class UserServiceFallback implements UserService {
    @Override
    public User getUser(Long uid) {
        User user = new User();
        user.setId(-1L);
        return user;
    }
}
