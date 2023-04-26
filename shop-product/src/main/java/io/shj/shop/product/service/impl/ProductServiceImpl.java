package io.shj.shop.product.service.impl;

import io.shj.shop.bean.Product;
import io.shj.shop.product.mapper.ProductMapper;
import io.shj.shop.product.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    private ProductMapper productMapper;

    @Override
    public Product getProductById(Long pid) {
        Product product = productMapper.getProductById(pid);

        return product;
    }

    @Override
    public int updateProductStockById(Long id, Integer count) {
        int i = productMapper.updateProductStockById(id, count);
        return i;
    }
}
