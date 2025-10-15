package com.xworkz.fastfood.dto;

import lombok.Data;

@Data
public class FastFoodDTO {

    private Integer foodId;
    private String foodName;
    private Float price;
    private Integer quantity;
    private Float ratings;
}
