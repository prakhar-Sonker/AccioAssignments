package com.example.accioshop.model;

import com.example.accioshop.enums.ProductCategory;
import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Products {

    @Column
    @Id
    private int id;

    @Column
    private String name;

    @Column
    private double price;

    @Column
    @Enumerated(value = EnumType.STRING)
    private ProductCategory category;


    @ManyToOne
    @JoinColumn(name = "seller_id")
    Seller seller;


    @OneToMany(mappedBy = "products")
    List<Reviews> reviews = new ArrayList<>();


    @ManyToMany(mappedBy = "product")
    List<OrderEntity> orders = new ArrayList<>();

}
