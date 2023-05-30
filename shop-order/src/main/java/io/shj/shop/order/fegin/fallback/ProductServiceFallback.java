package io.shj.shop.order.fegin.fallback;

import io.shj.shop.bean.Product;
import io.shj.shop.order.fegin.ProductService;
import io.shj.shop.utils.resp.Result;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * 实现 产品 容错
 * */
@Component
@Qualifier(value = "productServiceFallback")
public class ProductServiceFallback implements ProductService {

    @Override
    public Product getProduct(Long pid) {
        Product product = new Product();
        product.setId(-1L);
        return product;
    }

    @Override
    public Result<Integer> updateCount(Long pid, Integer count) {
        Result<Integer> result = new Result<>();
        result.setCode(1001);
        result.setCodeMsg("触发容错逻辑");
        return result;
    }
}
