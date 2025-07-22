package com.xworkz.rain.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz.rain")
public class RainConfiguration {
    public RainConfiguration()
    {
        System.out.println("RainConfiguration constructor");
    }
}
