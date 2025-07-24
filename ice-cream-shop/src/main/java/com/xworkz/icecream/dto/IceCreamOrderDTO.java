package com.xworkz.icecream.dto;

import lombok.Data;

@Data
public class IceCreamOrderDTO {

    private String name;
    private String flavour;
    private int quantity;
    private boolean takeAway;
    private boolean adsOn;
    private String couponCode;
}
