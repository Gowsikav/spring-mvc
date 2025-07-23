package com.xworkz.rain.controller;

import com.xworkz.rain.dto.HospitalDTO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class HospitalController {
    public HospitalController()
    {
        System.out.println("HospitalController constructor");
    }

    @RequestMapping("/hospital")
    public String onHospital(HospitalDTO hospitalDTO, Model model)
    {
        System.out.println("Hospital form method");

        System.out.println("Hospital Details: "+hospitalDTO);

        model.addAttribute("hospitalDTO",hospitalDTO);

        return "/HospitalResult.jsp";
    }
}
