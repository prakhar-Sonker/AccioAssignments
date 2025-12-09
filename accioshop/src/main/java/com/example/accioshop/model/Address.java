package com.example.accioshop.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Address {

    @Id
    private int id;

    @Column
    private String houseNo;

    @Column
    private String city;

    @Column
    private String state;

    @Column
    private int pincode;

//    yha pe object bnaya hai aur ab relationship define krenge aur fk bnayenge
//    aur ye uniderectional hai isko bi-directional bnane k liye iski opposite class me relationship define krdo aur mappedby lik do object bna krr bs
    @OneToOne
    @JoinColumn(name="customer_id")
    Customer customer;

}
