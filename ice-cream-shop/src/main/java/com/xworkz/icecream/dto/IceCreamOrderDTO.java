package com.xworkz.icecream.dto;

import lombok.Data;

@Data
public class IceCreamOrderDTO {

    private String name;
    private String flavour;
    private String quantity;
    private String takeAway;
    private String addOn;
    private String couponCode;
}
