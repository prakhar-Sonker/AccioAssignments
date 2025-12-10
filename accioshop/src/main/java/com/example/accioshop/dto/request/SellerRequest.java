package com.example.accioshop.dto.request;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class SellerRequest {

    private String compName;
    private String email;
    private String city;
    private String pan;
}
