package com.example.accioshop.transformer;

import com.example.accioshop.dto.request.ProductRequest;
import com.example.accioshop.model.Products;


public class ProductTransformer {

    public static Products productsRequestToProduct(ProductRequest productRequest){
        return Products.builder()
                .name(productRequest.getName())
                .price(productRequest.getPrice())
                .category(productRequest.getCategory())
                .build();

    }
}
