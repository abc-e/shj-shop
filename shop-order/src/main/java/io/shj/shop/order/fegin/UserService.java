package io.shj.shop.order.fegin;

import io.shj.shop.bean.User;
import io.shj.shop.order.fegin.fallback.UserServiceFallback;
import io.shj.shop.order.fegin.fallback.factory.UserServiceFallBackFactory;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author shijiepro
 * @version 1.0.0
 * @description 调用用户微服务的接口
 */
//@FeignClient(value = "server-shop-user", fallback = UserServiceFallback.class)
@FeignClient(value = "server-shop-user", fallbackFactory = UserServiceFallBackFactory.class)
public interface UserService {
    @GetMapping(value = "/shop-user/getUser/{uid}")
    User getUser(@PathVariable("uid") Long uid);
}
