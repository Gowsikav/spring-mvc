package com.xworkz.rain.controller;

import com.xworkz.rain.dto.RTODTO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class RTOController {
    public RTOController()
    {
        System.out.println("RTOController constructor");
    }

    @RequestMapping("/rto")
    public String onRTO(RTODTO rtodto, Model model)
    {
        System.out.println("RTO form method ");

        System.out.println("RTO Office details: "+rtodto);

        model.addAttribute("rtodto",rtodto);
        return "/RTOResult.jsp";
    }
}
