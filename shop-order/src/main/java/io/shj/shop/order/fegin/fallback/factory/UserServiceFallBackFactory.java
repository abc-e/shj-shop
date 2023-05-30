package io.shj.shop.order.fegin.fallback.factory;


import feign.hystrix.FallbackFactory;
import io.shj.shop.bean.User;
import io.shj.shop.order.fegin.UserService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier(value = "userServiceFallBackFactory")
public class UserServiceFallBackFactory implements FallbackFactory<UserService> {
    @Override
    public UserService create(Throwable throwable) {
        return new UserService() {
            @Override
            public User getUser(Long uid) {
                User user = new User();
                user.setId(-1L);
                return user;
            }
        };
    }
}
