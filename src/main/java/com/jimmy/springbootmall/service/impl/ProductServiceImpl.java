package com.jimmy.springbootmall.service.impl;

import com.jimmy.springbootmall.dao.ProductDao;
import com.jimmy.springbootmall.model.Product;
import com.jimmy.springbootmall.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductDao productDao;

    @Override
    public Product getProductById(Integer productId){
        return productDao.getProductById(productId);
    }


}
