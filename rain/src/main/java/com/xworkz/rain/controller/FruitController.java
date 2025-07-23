package com.xworkz.rain.controller;

import com.xworkz.rain.dto.FruitDTO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class FruitController {
    public FruitController()
    {
        System.out.println("FruitController constructor");
    }

    @RequestMapping("/fruit")
    public String onFruit(FruitDTO fruitDTO, Model model)
    {
        System.out.println("fruit form method");

        System.out.println("Fruit details: "+fruitDTO);
        model.addAttribute("fruitDTO",fruitDTO);

        return "/FruitResult.jsp";
    }
}
