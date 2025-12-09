package com.example.accioshop.dto.response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.Date;


@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter

public class CustomerResponse {

    private String name;
    private String email;
//    private String message;
    private LocalDate createdAt;
}
