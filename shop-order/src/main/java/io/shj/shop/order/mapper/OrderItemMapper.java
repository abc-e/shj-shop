package io.shj.shop.order.mapper;

import io.shj.shop.bean.OrderItem;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface OrderItemMapper {
    Integer insert(OrderItem orderMapper);
}
