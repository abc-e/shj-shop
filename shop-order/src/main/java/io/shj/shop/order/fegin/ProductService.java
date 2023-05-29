package io.shj.shop.order.fegin;

import io.shj.shop.bean.Product;
import io.shj.shop.bean.User;
import io.shj.shop.utils.resp.Result;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author shijiepro
 * @version 1.0.0
 * @description 调用用户微服务的接口
 */
@FeignClient("server-shop-product")
public interface ProductService {
    @RequestMapping(value = "/shop-product/getProduct/{pid}")
    public Product getProduct(@PathVariable("pid") Long pid);

    @RequestMapping(value = "/shop-product/updateCount/{pid}/{count}")
    public Result<Integer> updateCount(@PathVariable("pid")Long pid, @PathVariable("count")Integer count);

}
