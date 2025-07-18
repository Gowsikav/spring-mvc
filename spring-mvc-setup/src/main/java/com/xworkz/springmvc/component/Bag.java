package com.xworkz.springmvc.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Bag {

    @Autowired
    @Qualifier("snacks")
    private Bakery bakery;

    @Autowired
    private Bakery snacks;

    public Bag()
    {
        System.out.println("Bag constructor");
    }
}
