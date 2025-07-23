package com.xworkz.bag.controller;

import com.xworkz.bag.dto.ProductDTO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class ProductController {
    public ProductController()
    {
        System.out.println("ProductController constructor");
    }

    @RequestMapping("/product")
    public String onProduct(ProductDTO productDTO, Model model)
    {
        System.out.println("product details form method");

        System.out.println("Product details: "+productDTO);
        model.addAttribute("productDTO",productDTO);
        return "ProductDetailsResult.jsp";
    }
}
