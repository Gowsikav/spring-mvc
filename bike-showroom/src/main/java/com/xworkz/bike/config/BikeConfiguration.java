package com.xworkz.bike.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz.bike")
public class BikeConfiguration {

    public BikeConfiguration()
    {
        System.out.println("BikeConfiguration constructor");
    }

}
