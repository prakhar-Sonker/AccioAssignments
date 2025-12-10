package com.example.accioshop.transformer;

import com.example.accioshop.dto.request.SellerRequest;

import com.example.accioshop.dto.response.SellerResponse;
import com.example.accioshop.model.Seller;
import lombok.experimental.UtilityClass;

import java.util.ArrayList;

@UtilityClass
public class SellerTransformer {

    public static Seller sellerRequestToSeller(SellerRequest sellerRequest){
        return Seller.builder()
                .compName(sellerRequest.getCompName())
                .email(sellerRequest.getEmail())
                .city(sellerRequest.getCity())
                .pan(sellerRequest.getPan())
                .products(new ArrayList<>())
                .build();
    }

    public static SellerResponse sellerToSellerResponse(Seller seller){
        return SellerResponse.builder()
                .compName(seller.getCompName())
                .city(seller.getCity())
                .email(seller.getEmail())
                .build();
    }
}
