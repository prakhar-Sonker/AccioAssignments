package com.example.accioshop.service;

import com.example.accioshop.dto.request.SellerRequest;
import com.example.accioshop.dto.response.SellerResponse;
import com.example.accioshop.exceptions.SellerNotFound;
import com.example.accioshop.model.Seller;
import com.example.accioshop.repository.SellerRepository;
import com.example.accioshop.transformer.SellerTransformer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class SellerService {

    @Autowired
    SellerRepository sellerRepository;

//    1st API
    public SellerResponse addSeller(SellerRequest sellerRequest){
//        SellerResponse savedCustomer = sellerRepository.save(sellerRequest);
//        return savedCustomer;

//        now make transformer and add here to link it with dto

//        Step-1 Convert Request DTO -> Entity
        Seller seller = SellerTransformer.sellerRequestToSeller(sellerRequest);
//        STEP-2 Save to DB
        Seller savedSeller = sellerRepository.save(seller);
//        STEP-3 Convert Entity to Response DTO
        return SellerTransformer.sellerToSellerResponse(savedSeller);
    }


//    2nd API
    public Seller findSellerById(int id){
        Optional<Seller> optionalSeller = sellerRepository.findById(id);
        if(optionalSeller.isEmpty()){
            throw new SellerNotFound("Invalid Id Of Seller");
        }
        return optionalSeller.get();
    }

}
