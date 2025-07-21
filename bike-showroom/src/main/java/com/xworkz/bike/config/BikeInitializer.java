package com.xworkz.bike.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class BikeInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {
    public BikeInitializer()
    {
        System.out.println("BikeInitializer constructor");
    }

    @Override
    protected String[] getServletMappings() {
        return new String[]{"/send"};
    }

    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[0];
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[]{BikeConfiguration.class};
    }

}
