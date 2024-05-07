package com.demo.flipkart.controller;

import com.demo.flipkart.dao.Product;
import com.demo.flipkart.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    private ProductService productService;

    @PostMapping("/create")
    public List<Product> saveProduct(@RequestBody List<Product> products) {
        return productService.saveProduct(products);
    }
}
