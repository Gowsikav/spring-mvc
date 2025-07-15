package com.xworkz.springmvc.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class SpringInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

    public SpringInitializer()
    {
        System.out.println("SpringInitializer constructor");
    }
    @Override
    protected Class<?>[] getRootConfigClasses() {
        System.out.println("getRootConfigClasses method in SpringInitializer ");
        return new Class[0];
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        System.out.println("getServletConfigClasses method in SpringInitializer");
        return new Class[0];
    }

    @Override
    protected String[] getServletMappings() {
        System.out.println("getServletMappings method in SpringInitializer");
        return new String[0];
    }
}
