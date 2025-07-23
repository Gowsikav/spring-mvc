package com.xworkz.bag.controller;

import com.xworkz.bag.dto.PersonDTO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class PersonController {
    public PersonController()
    {
        System.out.println("PersonController constructor");
    }

    @RequestMapping("/person")
    public String onPerson(PersonDTO personDTO, Model model)
    {
        System.out.println("person details form");

        System.out.println("Person details: "+personDTO);

        model.addAttribute("personDTO",personDTO);

        return "PersonDetailsResult.jsp";
    }
}
