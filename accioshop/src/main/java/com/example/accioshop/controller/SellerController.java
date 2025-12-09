package com.example.accioshop.controller;


import com.example.accioshop.exceptions.SellerNotFound;
import com.example.accioshop.model.Seller;
import com.example.accioshop.service.SellerService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;



@Slf4j
@RestController
@RequestMapping("/api/v1/seller")
public class SellerController {

    @Autowired
    SellerService sellerService;

//    write an api to add seller
    @PostMapping
    public ResponseEntity addSeller(@RequestBody Seller seller){
        log.info("Recieved Seller object: {}", seller);
        Seller savedSeller = sellerService.addSeller(seller);
        return new ResponseEntity(savedSeller, HttpStatus.CREATED);
    }

//    write an api to find seller by id
    @GetMapping
    public ResponseEntity findSellerById(@RequestParam("id") int id){
        try{
            return new ResponseEntity(sellerService.findSellerById(id), HttpStatus.FOUND);
        }
        catch(SellerNotFound e){
            return new ResponseEntity<>(e.getMessage(), HttpStatus.NOT_FOUND);
        }
    }
}
