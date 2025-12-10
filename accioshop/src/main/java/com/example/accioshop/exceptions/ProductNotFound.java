package com.example.accioshop.exceptions;

public class ProductNotFound extends RuntimeException {
  public ProductNotFound(String message) {
    super(message);
  }
}
