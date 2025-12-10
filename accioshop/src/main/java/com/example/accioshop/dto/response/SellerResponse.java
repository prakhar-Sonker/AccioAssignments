package com.example.accioshop.dto.response;


import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class SellerResponse {

    private String compName;
    private String email;
    private String city;
}
