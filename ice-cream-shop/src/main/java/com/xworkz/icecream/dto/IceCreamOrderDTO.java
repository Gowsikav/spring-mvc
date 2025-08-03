package com.xworkz.icecream.dto;

import lombok.Data;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.Size;

@Data
public class IceCreamOrderDTO {

    @Size(min = 3,max = 30)
    private String name;

    @Size(min = 3,max = 30)
    private String flavour;

    @Min(1)
    @Max(15)
    private int quantity;
    private boolean takeAway;
    private boolean addOn;
    private String couponCode;
    private MultipartFile multipartFile;
}
