package com.xworkz.icecream.config;

import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class IceCreamInitializer extends AbstractAnnotationConfigDispatcherServletInitializer implements WebMvcConfigurer {

    public IceCreamInitializer()
    {
        System.out.println("IceCreamInitializer constructor");
    }

    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[0];
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[]{IceCreamConfiguration.class};
    }

    @Override
    protected String[] getServletMappings() {
        return new String[]{"/"};
    }

}
