package com.xworkz.rain.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/")
public class RTOController {
    public RTOController()
    {
        System.out.println("RTOController constructor");
    }

    @RequestMapping("/rto")
    public String onRTO(@RequestParam String officeName,@RequestParam String address,@RequestParam String city,
                        @RequestParam long contactNumber,@RequestParam String email,@RequestParam String regionCode, Model model)
    {
        System.out.println("RTO form method ");

        System.out.println("Office Name: "+officeName);
        System.out.println("Address: "+address);
        System.out.println("Contact: "+contactNumber);
        System.out.println("City: "+city);
        System.out.println("Email: "+email);
        System.out.println("Region code: "+regionCode);

        model.addAttribute("officeName",officeName);
        model.addAttribute("address",address);
        model.addAttribute("contactNumber",contactNumber);
        model.addAttribute("city",city);
        model.addAttribute("email",email);
        model.addAttribute("regionCode",regionCode);
        return "/RTOResult.jsp";
    }
}
