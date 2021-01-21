package com.example.demo.controller;

import com.example.demo.dto.ProductDto;
import com.example.demo.entity.Product;
import com.example.demo.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.persistence.criteria.CriteriaBuilder;
import java.util.List;
import java.util.Optional;

@CrossOrigin
@RestController
@RequestMapping(value = "/api")
public class ProductController {
    @Autowired
    private ProductService productService;

    @PostMapping(value = "/saveProduct")
    public void saveProduct(@RequestBody ProductDto dto){
        productService.saveProduct(dto);
    }

    @GetMapping(value = "/getAllProducts")
    public List<Product> getAllProducts(){
        return productService.getAllProduct();
    }

    @GetMapping(value = "/getProduct/{id}")
    public Product getProductById(@PathVariable("id") Integer id){
        return productService.getProductById(id);
    }

    @PutMapping(value = "/updateProduct/{id}")
    public Product updateProduct(@PathVariable("id") Integer id, @RequestBody ProductDto dto){
        return productService.updateProduct(id, dto);
    }



}
