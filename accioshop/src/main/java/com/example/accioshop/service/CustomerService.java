package com.example.accioshop.service;

import com.example.accioshop.exceptions.CustomerNotFound;
import com.example.accioshop.model.Customer;
import com.example.accioshop.model.Reviews;
import com.example.accioshop.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service

public class CustomerService {

    @Autowired
    CustomerRepository customerRepository;

//    1st Api
    public Customer addCustomer(Customer customer){
        Customer savedCustomer = customerRepository.save(customer);
        return savedCustomer;
    }

//    2nd API
    public Customer getCustomerById(int id){
        Optional<Customer> optionalCustomer = customerRepository.findById(id);
        if(optionalCustomer.isEmpty()){
            throw new CustomerNotFound("Invalid id");
        }
        Customer getCustomer = optionalCustomer.get();
        return getCustomer;
    }

//    3rd API

}
