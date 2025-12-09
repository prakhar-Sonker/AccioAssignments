package com.example.accioshop.model;

import com.example.accioshop.enums.Gender;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import java.time.LocalDate;
import java.util.ArrayList;

import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor


public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column
    private String name;

    @Column(nullable = false)
    private int age;

    @Column(unique = true)
    private String email;

    @Column
    @Enumerated(value = EnumType.STRING)
    private Gender gender;

    @Column(length = 10)
    private String mobNo;

    @CreationTimestamp
    LocalDate createdAt;

//    add review list
@OneToMany(mappedBy = "customer")
//@JsonIgnore
@JsonManagedReference
private List<Reviews> reviews = new ArrayList<>();

}
