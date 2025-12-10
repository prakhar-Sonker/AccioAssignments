package com.example.accioshop.transformer;

import com.example.accioshop.dto.request.CustomerRequest;
import com.example.accioshop.dto.response.CustomerResponse;
import com.example.accioshop.model.Customer;
import lombok.experimental.UtilityClass;

import java.util.Date;

@UtilityClass
//ye annotation likhne se @component nhi likhna pdega aur static bhi optional hai
public class CustomerTransformer {

//    ab is class me saare fxn likh denge aur unko static bna denge bcz directly class k name se call kr ske
//    na ki unka obj bnaye phle fir call kre aur na hi ab annotation likhne ki need hai

    public static CustomerResponse customerToCustomerResponse(Customer customer){
        CustomerResponse customerResponse = new CustomerResponse();
        customerResponse.setName(customer.getName());
        customerResponse.setEmail(customer.getEmail());
        customerResponse.setCreatedAt(customer.getCreatedAt());
        return customerResponse;
    }

    public static Customer customerRequestToCustomer(CustomerRequest customerRequest){
        Customer customer = new Customer();
        customer.setName(customerRequest.getName());
        customer.setEmail(customerRequest.getEmail());
        customer.setAge(customerRequest.getAge());
        customer.setGender(customerRequest.getGender());
        customer.setMobNo(customerRequest.getMobNo());
        return customer;
    }

}
