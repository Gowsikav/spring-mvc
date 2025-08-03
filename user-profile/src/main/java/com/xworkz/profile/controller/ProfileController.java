package com.xworkz.profile.controller;

import com.xworkz.profile.dto.ProfileDTO;
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
public class ProfileController {

    public ProfileController()
    {
        System.out.println("ProfileController constructor");
    }

    @RequestMapping("/profile")
    public String getProfile(@Valid ProfileDTO profileDTO, BindingResult bindingResult, Model model)
    {
        System.out.println("getProfile method in controller");
        if(bindingResult.hasErrors())
        {
            System.out.println("Error occurred");
            bindingResult.getFieldErrors().stream()
                    .map(fieldError -> fieldError.getField()+" - "+fieldError.getDefaultMessage())
                    .forEach(System.out::println);
            System.out.println("Submission failed");
            model.addAttribute("dto",profileDTO);
            model.addAttribute("message","invalid details");
            return "Profile";
        }

        try{
            byte[] bytes=profileDTO.getProfilePicture().getBytes();
            Path path= Paths.get("D:\\Java\\File upload\\"+profileDTO.getName()+System.currentTimeMillis());
            Files.write(path,bytes);
        }catch (IOException e)
        {
            System.out.println(e.getMessage());
            System.out.println("Error in file upload");
            System.out.println("Submission failed");
            model.addAttribute("dto",profileDTO);
            model.addAttribute("message","invalid details");
            return "Profile";
        }

        System.out.println("Profile submitted");
        model.addAttribute("name",profileDTO.getName());
        return "ProfileSuccess";
    }
}
