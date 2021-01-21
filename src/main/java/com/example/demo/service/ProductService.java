package com.example.demo.service;

import com.example.demo.dto.ProductDto;
import com.example.demo.entity.Product;

import java.util.List;
import java.util.Optional;

public interface ProductService {
    void saveProduct(ProductDto dto);
    List<Product> getAllProduct();
    Product updateProduct(Integer id, ProductDto dto);
    Product getProductById(Integer id);
}
