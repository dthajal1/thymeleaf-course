package com.tutorial.thymeleafcourse.services;

import com.tutorial.thymeleafcourse.domain.Product;

import java.util.List;

public interface ProductService {

    Product getProduct(Integer id);

    List<Product> listProducts();
}
