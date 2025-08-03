package com.xworkz.productcatalog.controller;

import com.xworkz.productcatalog.dto.ProductDTO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

@Controller
@RequestMapping("/")
public class ProductController {

    public ProductController()
    {
        System.out.println("Product controller in controller");
    }

    @RequestMapping("/product")
    public String getProduct(@Valid ProductDTO productDTO, BindingResult bindingResult, Model model)
    {
        System.out.println("getProduct method in controller");
        if(bindingResult.hasErrors()) {
            System.out.println("Error occurred");
            bindingResult.getFieldErrors().stream()
                    .map(fieldError -> fieldError.getField() + "- " + fieldError.getDefaultMessage())
                    .forEach(System.out::println);
            System.out.println("Submit failed");
            model.addAttribute("message", "Details not valid");
            model.addAttribute("dto", productDTO);
            return "Product";
        }
        try {
            byte[] bytes=productDTO.getProductImage().getBytes();
            Path path= Paths.get("D:\\Java\\File upload\\"+productDTO.getProductName()+System.currentTimeMillis());
            Files.write(path,bytes);
        }catch (IOException e)
        {
            System.out.println(e.getMessage());
            System.out.println("Error in file");
            model.addAttribute("message", "Details not valid");
            model.addAttribute("dto", productDTO);
            return "Product";
        }
        System.out.println("Product Submitted");
        model.addAttribute("message",productDTO.getProductName());
        return "ProductSuccess";

    }

}
