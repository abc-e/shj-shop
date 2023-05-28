package io.shj.shop.product.controller;

import com.alibaba.fastjson.JSONObject;
import io.shj.shop.bean.Product;
import io.shj.shop.product.service.ProductService;
import io.shj.shop.utils.constants.HttpCode;
import io.shj.shop.utils.resp.Result;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class ProductController {

    @Autowired
    ProductService productService;

    @RequestMapping(value = "/getProduct/{pid}")
    public Product getProduct(@PathVariable("pid") Long pid){
        Product product = productService.getProductById(pid);
        log.info("获取到的商品信息为：{}", JSONObject.toJSONString(product));
        return product;
    }

    @RequestMapping(value = "/updateCount/{pid}/{count}")
    public Result<Integer> updateCount(@PathVariable("pid")Long pid, @PathVariable("count")Integer count){
        int updateCount = productService.updateProductStockById(pid, count);
        Result<Integer> result = new Result<>(HttpCode.SUCCESS, "执行成功", updateCount);
        return result;
    }
}
