package com.example.accioshop.model;

import com.example.accioshop.enums.ProductCategory;
import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class Products {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column
    private String name;

    @Column
    private int price;

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
