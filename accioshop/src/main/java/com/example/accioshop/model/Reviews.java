package com.example.accioshop.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Reviews {

    @Id
    private int id;

    @Min(value = 1)
    @Max(value=5)
    private int rating;

    @Column
    private String reviewComment;

    @ManyToOne
    @JoinColumn(name = "customer_id")
//    @JsonIgnore
    @JsonBackReference
    private Customer customer;

    @ManyToOne
    @JoinColumn(name = "product_id")
    @JsonIgnore //to break the infinite recursion
    private Products products;

}
