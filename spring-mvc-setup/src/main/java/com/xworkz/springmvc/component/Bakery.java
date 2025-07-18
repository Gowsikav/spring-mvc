package com.xworkz.springmvc.component;

import org.springframework.stereotype.Component;

@Component("snacks")
public class Bakery {
    public Bakery()
    {
        System.out.println("Bakery constructor");
    }
}
