package com.xworkz.springjdbc.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@EnableWebMvc
@ComponentScan("com.xworkz.springjdbc")
public class SpringConfiguration implements WebMvcConfigurer {
    public SpringConfiguration()
    {
        System.out.println("SpringConfiguration constructor");
    }

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        System.out.println("addResourceHandlers method");
        registry.addResourceHandler("/images/**").addResourceLocations("/images/");
    }

    @Bean
    public InternalResourceViewResolver internalResourceViewResolver()
    {
        System.out.println("InternalResourceViewResolver method");
        InternalResourceViewResolver internalResourceViewResolver=new InternalResourceViewResolver();
        internalResourceViewResolver.setSuffix(".jsp");
        internalResourceViewResolver.setPrefix("/");
        return internalResourceViewResolver;
    }
}
