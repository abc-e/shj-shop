package io.shj.shop.order.mapper;

import io.shj.shop.bean.Order;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface OrderMapper {
    Integer insert(Order order);
}
