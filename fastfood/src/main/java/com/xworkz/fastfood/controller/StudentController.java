package com.xworkz.fastfood.controller;

import com.xworkz.fastfood.dto.StudentDTO;
import jakarta.validation.Valid;
import lombok.Value;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Slf4j
@Controller
@RequestMapping("/")
public class StudentController {

    public StudentController()
    {
        log.info("StudentController constructor");
    }

    @GetMapping("/studentForm")
    public String getStudentForm()
    {
        log.info("getStudentForm method in student controller");
        return "student-form";
    }

    @PostMapping("/saveStudent")
    public String saveStudentForm(@Valid StudentDTO studentDTO, BindingResult bindingResult)
    {
        log.info("save student form metho in student controller");
        if(bindingResult.hasErrors())
        {
            bindingResult.getFieldErrors().stream().map(e->e.getField()+" -> "+e.getDefaultMessage())
                    .forEach(log::error);
        }
        log.info("studentDTO {}",studentDTO);
        return "student-form";
    }

}
