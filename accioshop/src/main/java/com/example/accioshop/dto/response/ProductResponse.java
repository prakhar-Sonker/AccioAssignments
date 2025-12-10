package com.example.accioshop.dto.response;

import jdk.jfr.Category;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class ProductResponse {


    private String name;

    private int price;

    private Category category;

    private SellerResponse seller;
}
