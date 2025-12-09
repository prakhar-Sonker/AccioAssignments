package com.example.accioshop.controller;


import com.example.accioshop.dto.request.CustomerRequest;
import com.example.accioshop.dto.response.CustomerResponse;
import com.example.accioshop.exceptions.CustomerNotFound;
import com.example.accioshop.exceptions.ReviewsNotFound;
import com.example.accioshop.model.Customer;
import com.example.accioshop.model.Reviews;
import com.example.accioshop.service.CustomerService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/customer")
@Slf4j
public class CustomerController {

    @Autowired
    CustomerService customerService;
//    Add customer
    @PostMapping
    public ResponseEntity addCustomer(@RequestBody CustomerRequest customerRequest){
        log.info("Recieved Customer object: {}", customerRequest);
        CustomerResponse customerResponse = customerService.addCustomer(customerRequest);
        return new ResponseEntity(customerResponse, HttpStatus.CREATED);
    }

//    get the details of customer based on id
    @GetMapping
    public ResponseEntity getCustomerById(@RequestParam("id")int id){
        try{
            return new ResponseEntity(customerService.getCustomerById(id), HttpStatus.FOUND);
        }
        catch (CustomerNotFound e){
            return new ResponseEntity<>(e.getMessage(), HttpStatus.BAD_REQUEST);
        }
    }

}
