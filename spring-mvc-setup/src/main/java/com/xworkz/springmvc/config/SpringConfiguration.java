package com.xworkz.springmvc.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.xworkz.springmvc.component")
public class SpringConfiguration {
    public SpringConfiguration()
    {
        System.out.println("SpringConfiguration constructor");
    }

}
