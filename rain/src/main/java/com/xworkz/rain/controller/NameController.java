package com.xworkz.rain.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/")
public class NameController {
    public NameController()
    {
        System.out.println("NameController constructor");
    }

    @RequestMapping("/name")
    public String onSubmit(@RequestParam String firstName, @RequestParam String middleName,
                           @RequestParam String lastName, @RequestParam String displayName, Model model)
    {
        System.out.println("Name form method");
        System.out.println("First Name: "+firstName);
        System.out.println("Middle Name: "+middleName);
        System.out.println("Last Name: "+lastName);
        System.out.println("Display Name: "+displayName);

        model.addAttribute("firstName",firstName);
        model.addAttribute("lastName",lastName);
        model.addAttribute("middleName",middleName);
        model.addAttribute("displayName",displayName);

        return "/NameResult.jsp";
    }
}
