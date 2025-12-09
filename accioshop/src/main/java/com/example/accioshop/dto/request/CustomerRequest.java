package com.example.accioshop.dto.request;

import com.example.accioshop.enums.Gender;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class CustomerRequest {


    private String name;

    private int age;

    private String email;

    private Gender gender;

    private String mobNo;
}
