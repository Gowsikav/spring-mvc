package com.xworkz.bag.controller;

import com.xworkz.bag.dto.EducationDTO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class EducationController {

    public EducationController()
    {
        System.out.println("EducationController constructor");
    }

    @RequestMapping("/education")
    public String onEducation(EducationDTO educationDTO, Model model)
    {
        System.out.println("Education details form method");

        System.out.println("Education details: "+educationDTO);

        model.addAttribute("educationDTO",educationDTO);

        return "EducationDetailsResult.jsp";
    }
}
