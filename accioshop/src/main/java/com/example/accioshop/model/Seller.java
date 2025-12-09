package com.example.accioshop.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Seller {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column
    private String compName;

    @Column
    private String email;
    @Column
    private String city;
    @Column
    private String pan;

    @OneToMany(mappedBy = "seller")
            @JsonIgnore
//    one seller can have multiple products to get that we will use list
    List<Products> products = new ArrayList<>();
}
