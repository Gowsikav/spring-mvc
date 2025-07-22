package com.xworkz.rain.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/")
public class HospitalController {
    public HospitalController()
    {
        System.out.println("HospitalController constructor");
    }

    @RequestMapping("/hospital")
    public String onHospital(@RequestParam String hospitalName , @RequestParam String address, @RequestParam String city,
                             @RequestParam long contactNumber, @RequestParam String email, @RequestParam String type, Model model)
    {
        System.out.println("Hospital form method");

        System.out.println("Hospital Name: "+hospitalName);
        System.out.println("Address: "+address);
        System.out.println("Contact: "+contactNumber);
        System.out.println("City: "+city);
        System.out.println("Email: "+email);
        System.out.println("Type: "+type);

        model.addAttribute("hospitalName",hospitalName);
        model.addAttribute("address",address);
        model.addAttribute("contactNumber",contactNumber);
        model.addAttribute("city",city);
        model.addAttribute("email",email);
        model.addAttribute("type",type);

        return "/HospitalResult.jsp";
    }
}
