package io.shj.shop.order.service;

import io.shj.shop.params.OrderParams;

public interface OrderService {

    // 保存订单
    void saveOrder(OrderParams orderParams);

}
