package com.xworkz.rain.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class RainInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

    public RainInitializer()
    {
        System.out.println("RainInitializer constructor");
    }
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[0];
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[]{RainConfiguration.class};
    }

    @Override
    protected String[] getServletMappings() {
        return new String[]{"/name","/hospital","/rto","/policeStation","/fruit"};
    }
}
