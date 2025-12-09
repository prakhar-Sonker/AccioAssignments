package com.example.accioshop.service;

import com.example.accioshop.exceptions.SellerNotFound;
import com.example.accioshop.model.Seller;
import com.example.accioshop.repository.SellerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class SellerService {

    @Autowired
    SellerRepository sellerRepository;

//    1st API
    public Seller addSeller(Seller seller){
        Seller savedCustomer = sellerRepository.save(seller);
        return savedCustomer;
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
