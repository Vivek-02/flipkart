package com.demo.flipkart.service;

import com.demo.flipkart.dao.Product;
import com.demo.flipkart.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public List<Product> saveProduct(List<Product> products) {
        if(products!=null && !products.isEmpty())
            return productRepository.saveAll(products);

        return null;
    }
}
