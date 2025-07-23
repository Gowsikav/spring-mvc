package com.xworkz.bag.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz.bag")
public class BagConfiguration {

    public BagConfiguration()
    {
        System.out.println("BagConfiguration constructor");
    }
}
