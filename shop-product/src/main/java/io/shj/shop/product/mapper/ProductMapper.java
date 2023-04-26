package io.shj.shop.product.mapper;

import io.shj.shop.bean.Product;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface ProductMapper {

    Product getProductById(@Param("id") Long id);
    /**
     * 更新商品库存
     * */
    int updateProductStockById(@Param("id") Long id, @Param("count")Integer count);
}
