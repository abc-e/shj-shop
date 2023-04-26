package io.shj.shop.product.service;

import io.shj.shop.bean.Product;

public interface ProductService {
    Product getProductById(Long pid);

    int updateProductStockById(Long id, Integer count);
}
