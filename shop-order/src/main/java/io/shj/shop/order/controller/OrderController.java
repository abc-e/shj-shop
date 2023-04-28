package io.shj.shop.order.controller;

import com.alibaba.fastjson.JSONObject;
import io.shj.shop.order.service.OrderService;
import io.shj.shop.params.OrderParams;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@Slf4j
@RestController
public class OrderController {
    @Autowired
    OrderService orderService;

    @GetMapping(value = "/getOrderTest")
    public String getOrderTest(){
        return "ok";
    }

    @GetMapping(value = "/submitOrder")
    public String submitOrder(OrderParams orderParams){
        log.info("提交订单时传递的参数:{}", JSONObject.toJSONString(orderParams));
        orderService.saveOrder(orderParams);
        return "success";
    }
}
