package com.example.accioshop.exceptions;

public class SellerNotFound extends RuntimeException {
    public SellerNotFound(String message) {
        super(message);
    }
}
