package com.xworkz.fastfood.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Generated;
import org.springframework.stereotype.Component;

import java.util.zip.CheckedOutputStream;

@Data
@Entity
@Table(name = "fast_food_details")
public class FastFoodEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "food_id")
    private Integer foodId;

    @Column(name = "food_name")
    private String foodName;

    @Column(name = "price")
    private Float price;

    @Column(name = "quantity")
    private Integer quantity;

    @Column(name = "ratings")
    private Float ratings;
}
