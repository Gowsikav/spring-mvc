package com.xworkz.resume.controller;

import com.xworkz.resume.dto.ResumeDTO;
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
public class ResumeController {

    public ResumeController()
    {
        System.out.println("Resume controller constructor");
    }

    @RequestMapping("/resume")
    public String getResume(@Valid ResumeDTO resumeDTO, BindingResult bindingResult, Model model)
    {
        System.out.println("getResume method in controller");
        if(bindingResult.hasErrors())
        {
            bindingResult.getFieldErrors().stream()
                    .map(fieldError -> fieldError.getField()+" - "+fieldError.getDefaultMessage())
                    .forEach(System.out::println);
            System.out.println("Submit failed");
            model.addAttribute("message","Details not valid");
            model.addAttribute("dto",resumeDTO);
            return "Resume";
        }
        try {
            byte[] bytes = resumeDTO.getMultipartFile().getBytes();
            Path path = Paths.get("D:\\Java\\File upload\\" + resumeDTO.getFullName() + System.currentTimeMillis());
            Files.write(path,bytes);
        }catch (IOException e)
        {
            System.out.println(e.getMessage());
            System.out.println("Submit failed");
            model.addAttribute("message","Details not valid");
            model.addAttribute("dto",resumeDTO);
            return "Resume";
        }
        System.out.println("Submitted Successfully");
        model.addAttribute("fullName",resumeDTO.getFullName());
        return "ResumeSuccess";
    }
}
