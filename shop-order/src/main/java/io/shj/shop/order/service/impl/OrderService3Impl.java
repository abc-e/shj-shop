package io.shj.shop.order.service.impl;

import com.alibaba.fastjson.JSON;
import io.shj.shop.bean.Order;
import io.shj.shop.bean.OrderItem;
import io.shj.shop.bean.Product;
import io.shj.shop.bean.User;
import io.shj.shop.order.fegin.ProductService;
import io.shj.shop.order.fegin.UserService;
import io.shj.shop.order.mapper.OrderItemMapper;
import io.shj.shop.order.mapper.OrderMapper;
import io.shj.shop.order.service.OrderService;
import io.shj.shop.params.OrderParams;
import io.shj.shop.utils.constants.HttpCode;
import io.shj.shop.utils.resp.Result;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.client.RestTemplate;

import java.math.BigDecimal;

@Service
@Slf4j
public class OrderService3Impl implements OrderService {
    @Autowired
    private DiscoveryClient discoveryClient;

    @Autowired
    private OrderMapper orderMapper;

    @Autowired
    private OrderItemMapper orderItemMapper;

    @Autowired
    private UserService userService;

    @Autowired
    private ProductService productService;

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void saveOrder(OrderParams orderParams) {
        if(orderParams.isEmpty()){
            throw new RuntimeException("参数异常："+ JSON.toJSONString(orderParams));
        }

        // 查询用户信息
        User user = userService.getUser(orderParams.getUserId());
        if(user == null){
            throw new RuntimeException("未获取到用户信息："+ JSON.toJSONString(orderParams));
        }

        // 查询商品信息
        Product product = productService.getProduct(orderParams.getProductId());
        if(product == null){
            throw new RuntimeException("未获取到商品信息："+ JSON.toJSONString(orderParams));
        }
        // 商品库存 < 订单中的购买数量 ？
        if(product.getProStock() < orderParams.getCount()){
            throw new RuntimeException("商品库存不足："+ JSON.toJSONString(orderParams));
        }
        // 订单保存
        Order order = new Order();
        order.setUserId(user.getId());
        order.setUserName(user.getUserName());
        order.setPhone(user.getPhone());
        order.setAddress(user.getAddress());
        order.setTotalPrice(product.getProPrice().multiply(BigDecimal.valueOf(orderParams.getCount())));
        orderMapper.insert(order);
        // 订单明细
        OrderItem orderItem = new OrderItem();
        orderItem.setNumber(orderParams.getCount());
//        orderItem.setOrderId(order.getId());
        orderItem.setProId(product.getId());
        orderItem.setProName(product.getProName());
        orderItem.setProPrice(product.getProPrice());
        orderItemMapper.insert(orderItem);

        Result<Integer> result = productService.updateCount(orderParams.getProductId(), orderParams.getCount());
        if(result.getCode() != HttpCode.SUCCESS){
            throw new RuntimeException("库存扣减失败");
        }

    }
}
