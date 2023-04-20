package io.shj.shop.user.mapper;

import io.shj.shop.bean.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface UserMapper {
    User getUserById(@Param("id") Long userId);
}
