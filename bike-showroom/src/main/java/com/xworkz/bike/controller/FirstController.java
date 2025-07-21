package com.xworkz.bike.controller;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
@RequestMapping("/")
public class FirstController {

    public FirstController()
    {
        System.out.println("FirstController constructor");
    }

    @RequestMapping("/send")
    public String toSend()
    {
        System.out.println("toSend method in FirstController");

        return "/index.jsp";
    }
}
