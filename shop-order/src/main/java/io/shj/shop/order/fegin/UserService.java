package io.shj.shop.order.fegin;

import io.shj.shop.bean.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author shijiepro
 * @version 1.0.0
 * @description 调用用户微服务的接口
 */
@FeignClient("server-shop-user")
public interface UserService {
    @GetMapping(value = "/shop-user/getUser/{uid}")
    User getUser(@PathVariable("uid") Long uid);
}
