package com.example.accioshop.controller;

import com.example.accioshop.dto.request.ProductRequest;
import com.example.accioshop.dto.response.ProductResponse;
import com.example.accioshop.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/product")
public class ProductController {

    @Autowired
    ProductService productService;

    @PostMapping
    public ResponseEntity addProduct(@RequestParam("seller-id") int sellerId,
                                     @RequestBody ProductRequest productRequest){

        ProductResponse response = productService.addProduct(sellerId, productRequest);

    }
}
