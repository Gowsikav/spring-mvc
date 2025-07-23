package com.xworkz.rain.controller;

import com.xworkz.rain.dto.NameDTO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class NameController {
    public NameController()
    {
        System.out.println("NameController constructor");
    }

    @RequestMapping("/name")
    public String onSubmit(NameDTO nameDTO, Model model)
    {
        System.out.println("Name form method");
        System.out.println("NameDto: "+nameDTO);

        model.addAttribute("nameDTO",nameDTO);

        return "/NameResult.jsp";
    }
}
