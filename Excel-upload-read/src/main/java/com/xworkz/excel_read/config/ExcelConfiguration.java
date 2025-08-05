package com.xworkz.excel_read.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.multipart.MultipartResolver;
import org.springframework.web.multipart.support.StandardServletMultipartResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@ComponentScan("com.xworkz.excel_read")
@EnableWebMvc
public class ExcelConfiguration implements WebMvcConfigurer {

    public ExcelConfiguration()
    {
        System.out.println("ExcelConfiguration constructor");
    }

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        System.out.println("addResourceHandlers method");
        registry.addResourceHandler("/images/**").addResourceLocations("/images/");
        registry.addResourceHandler("/js/**").addResourceLocations("/js/");
    }

    @Bean
    public InternalResourceViewResolver internalResourceViewResolver()
    {
        System.out.println("InternalResourceViewResolver method");
        InternalResourceViewResolver internalResourceViewResolver=new InternalResourceViewResolver();
        internalResourceViewResolver.setPrefix("/");
        internalResourceViewResolver.setSuffix(".jsp");
        return internalResourceViewResolver;
    }

    @Bean
    public MultipartResolver multipartResolver()
    {
        System.out.println("MultipartResolver method");
        return new StandardServletMultipartResolver();
    }
}
