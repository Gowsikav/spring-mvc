package com.xworkz.rain.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/")
public class FruitController {
    public FruitController()
    {
        System.out.println("FruitController constructor");
    }

    @RequestMapping("/fruit")
    public String onFruit(@RequestParam String fruitName, @RequestParam String color, @RequestParam String taste, @RequestParam String season,
                          @RequestParam String originCountry, @RequestParam float averageWeight, @RequestParam String vitamins,
                          @RequestParam boolean isTropical, @RequestParam double pricePerKg, @RequestParam boolean exported, Model model)
    {
        System.out.println("fruit form method");

        System.out.println("FruitName: "+fruitName);
        System.out.println("Colour: "+color);
        System.out.println("Taste: "+taste);
        System.out.println("Season: "+season);
        System.out.println("Origin Country: "+originCountry);
        System.out.println("Average Weight: "+averageWeight);
        System.out.println("Vitamins: "+vitamins);
        System.out.println("Is Tropical: "+isTropical);
        System.out.println("Price per kg: "+pricePerKg);
        System.out.println("Exported: "+exported);

        model.addAttribute("fruitName",fruitName);
        model.addAttribute("color",color);
        model.addAttribute("taste",taste);
        model.addAttribute("season",season);
        model.addAttribute("originCountry",originCountry);
        model.addAttribute("averageWeight", averageWeight);
        model.addAttribute("vitamins",vitamins);
        model.addAttribute("isTropical",isTropical);
        model.addAttribute("pricePerKg",pricePerKg);
        model.addAttribute("exported",exported);

        return "/FruitResult.jsp";
    }
}
