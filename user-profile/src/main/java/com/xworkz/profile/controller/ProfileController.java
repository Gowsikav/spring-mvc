package com.xworkz.profile.controller;

import com.xworkz.profile.dto.ProfileDTO;
import org.apache.commons.io.IOUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;
import java.io.*;
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
        String fileName;
        try{
            byte[] bytes=profileDTO.getProfilePicture().getBytes();
            Path path= Paths.get("D:\\Java\\File upload\\"+profileDTO.getName()+System.currentTimeMillis());
            Files.write(path,bytes);
            fileName=path.getFileName().toString();
            System.out.println("fileName: "+fileName);
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
        model.addAttribute("fileName",fileName);
        return "ProfileSuccess";
    }

    @GetMapping("/download")
    public void download(HttpServletResponse response, @RequestParam("profile") String profile)
    {
//        response.setContentType("image/jpg");
        File file =new File("D:\\Java\\File upload\\"+profile);
        System.out.println("profile: "+profile);
        try{
            InputStream inputStream=new BufferedInputStream(new FileInputStream(file));
            ServletOutputStream outputStream=response.getOutputStream();
            IOUtils.copy(inputStream,outputStream);
            response.flushBuffer();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
