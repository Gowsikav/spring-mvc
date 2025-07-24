package com.xworkz.icecream.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@EnableWebMvc
@ComponentScan("com.xworkz.icecream")
public class IceCreamConfiguration implements WebMvcConfigurer {
    public IceCreamConfiguration()
    {
        System.out.println("IceCreamConfiguration constructor");
    }

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        System.out.println("addResourceHandlers method");
        registry.addResourceHandler("/images/**").addResourceLocations("/images/");

        registry.addResourceHandler("/js/**").addResourceLocations("/js/");    }
}
