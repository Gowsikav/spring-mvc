package com.xworkz.icecream.controller;

import com.xworkz.icecream.dto.IceCreamOrderDTO;
import com.xworkz.icecream.service.IceCreamOrderServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Controller
@RequestMapping("/")
public class IceCreamOrderController {

    @Autowired
    private IceCreamOrderServiceImpl iceCreamOrderService;

    public IceCreamOrderController() {
        System.out.println("IceCreamOrderController constructor");
    }

    @RequestMapping("/order")
    public String onOrder(@Valid IceCreamOrderDTO iceCreamOrderDTO, BindingResult bindingResult, Model model) {
        System.out.println("ice cream order form method");

        System.out.println("Ice cream order Details: " + iceCreamOrderDTO);
        if (bindingResult.hasErrors()) {

            bindingResult.getFieldErrors().forEach(error -> System.out.println(error.getField() + " : " + error.getDefaultMessage()));

            System.out.println("Invalid Details");
            model.addAttribute("dto", iceCreamOrderDTO);
            model.addAttribute("message", "Invalid details");
            return "Order";
        }

        if (iceCreamOrderService.validate(iceCreamOrderDTO)) {
            model.addAttribute("name", iceCreamOrderDTO.getName());
            double price = iceCreamOrderService.getPrice(iceCreamOrderDTO.getFlavour(), iceCreamOrderDTO);
            model.addAttribute("price", price);
            return "OrderSuccess";
        } else {
            System.out.println("Invalid Details");
            model.addAttribute("dto", iceCreamOrderDTO);
            model.addAttribute("message", "Invalid details");
            return "Order";
        }
    }

}
