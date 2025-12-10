package com.example.accioshop.service;

import com.example.accioshop.dto.request.ProductRequest;
import com.example.accioshop.dto.response.ProductResponse;
import com.example.accioshop.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

    @Autowired
    ProductRepository productRepository;

    public ProductResponse addProduct(int sellerId, ProductRequest productRequest){

//        Request DTO -> Entity
//        Save to DB
//        Entity -> Response DTO
    }
}
