package com.xworkz.bag.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class BagInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

    public BagInitializer()
   {
       System.out.println("BagInitializer constructor");
   }

    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[0];
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[]{BagConfiguration.class};
    }

    @Override
    protected String[] getServletMappings() {
        return new String[]{"/person","/product","/education"};
    }
}
