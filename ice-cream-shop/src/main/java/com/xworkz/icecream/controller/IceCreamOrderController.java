package com.xworkz.icecream.controller;


import com.xworkz.icecream.dto.IceCreamOrderDTO;
import com.xworkz.icecream.service.IceCreamOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("/")
public class IceCreamOrderController {

    @Autowired
    private IceCreamOrderService iceCreamOrderService;

    public IceCreamOrderController()
    {
        System.out.println("IceCreamOrderController constructor");
    }

    @RequestMapping("/order")
    public String onOrder(IceCreamOrderDTO iceCreamOrderDTO, Model model) {
        System.out.println("ice cream order form method");

        System.out.println("Ice cream order Details: " + iceCreamOrderDTO);

        if (iceCreamOrderService.validate(iceCreamOrderDTO)) {
            model.addAttribute("name", iceCreamOrderDTO.getName());

            model.addAttribute("price", iceCreamOrderDTO.getQuantity() * getPrice(iceCreamOrderDTO.getFlavour()));
            return "OrderSuccess.jsp";
        } else {
            System.out.println("Invalid Details");
            model.addAttribute("message", "Invalid details");
            return "Order.jsp";
        }
    }

    public double getPrice(String flavour)
    {
        Map<String,Double> price=new HashMap<>();
        price.put("Chocolate",50d);
        price.put("Pista",60d);
        price.put("Vanilla",80d);
        price.put("ButterScotch",30d);
        price.put("StrawBerry",90d);
        price.put("Mango",75d);

        return price.get(flavour);
    }

}
