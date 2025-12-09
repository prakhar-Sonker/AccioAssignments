package com.example.accioshop.model;


import com.example.accioshop.enums.OrderStatus;
import com.example.accioshop.enums.ProductCategory;
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
public class OrderEntity {

    @Id
    @Column
    private int id;

    @Column
    private String value;

    @Column
    @Enumerated(value = EnumType.STRING)
    private OrderStatus status;


    @ManyToMany
    @JoinTable
    List<Products> product = new ArrayList<>();
}
