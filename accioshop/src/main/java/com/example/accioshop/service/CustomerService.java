package com.example.accioshop.service;

import com.example.accioshop.dto.request.CustomerRequest;
import com.example.accioshop.dto.response.CustomerResponse;
import com.example.accioshop.exceptions.CustomerNotFound;
import com.example.accioshop.model.Customer;
import com.example.accioshop.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.Optional;

@Service

public class CustomerService {

    @Autowired
    CustomerRepository customerRepository;

//    1st Api
    public CustomerResponse addCustomer(CustomerRequest customerRequest){
//        Step-1 --> Convert Request DTO -> Entity
       Customer customer = customerRequestToCustomer(customerRequest);

//        Step-2 --> Save to Database
        Customer savedCustomer = customerRepository.save(customer);

//        Step-3 --> Convert Entity --> Response DTO
//        CustomerResponse customerResponse = new CustomerResponse();
//        customerResponse.setName(savedCustomer.getName());
//        customerResponse.setEmail(savedCustomer.getEmail());
////        customerResponse.setMessage("Customer Added Successfully");
//        customerResponse.setCreatedAt(savedCustomer.getCreatedAt());

        return customerToCustomerResponse(savedCustomer);
    }

//    2nd API
    public CustomerResponse getCustomerById(int id){
        Optional<Customer> optionalCustomer = customerRepository.findById(id);
        if(optionalCustomer.isEmpty()){
            throw new CustomerNotFound("Invalid id");
        }

        Customer customer = optionalCustomer.get();
        CustomerResponse response = customerToCustomerResponse(customer);
        return response;
    }

    public CustomerResponse customerToCustomerResponse(Customer customer){
        CustomerResponse customerResponse = new CustomerResponse();
        customerResponse.setName(customer.getName());
        customerResponse.setEmail(customer.getEmail());
        customerResponse.setCreatedAt(customer.getCreatedAt());
        return customerResponse;
    }

    public Customer customerRequestToCustomer(CustomerRequest customerRequest){
        Customer customer = new Customer();
        customer.setName(customerRequest.getName());
        customer.setEmail(customerRequest.getEmail());
        customer.setAge(customerRequest.getAge());
        customer.setGender(customerRequest.getGender());
        customer.setMobNo(customerRequest.getMobNo());
        return customer;
    }

}
