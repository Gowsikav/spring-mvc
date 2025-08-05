package com.xworkz.excel_read.controller;

import com.xworkz.excel_read.dto.ExcelDTO;
import com.xworkz.excel_read.service.ExcelServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
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
public class ExcelController {

    @Autowired
    private ExcelServiceImpl excelService;

    public ExcelController()
    {
        System.out.println("Excel controller constructor");
    }

    @RequestMapping("/upload")
    public String getExcel(@Valid ExcelDTO excelDTO, BindingResult bindingResult, Model model)
    {
        System.out.println("getExcel method in controller");
        if(bindingResult.hasErrors())
        {
            System.out.println("Fields have error");
            bindingResult.getFieldErrors().stream()
                    .map(fieldError -> fieldError.getField()+" : "+fieldError.getDefaultMessage())
                    .forEach(System.out::println);

            model.addAttribute("message","Invalid file");
            System.out.println("submit failed");
            return "index";
        }

        String fileName;
        try {
            byte[] bytes=excelDTO.getExcelFile().getBytes();
            Path path= Paths.get("D:\\Java\\File upload\\"+excelDTO.getExcelFile().getOriginalFilename()+System.currentTimeMillis());
            Files.write(path,bytes);
            fileName=path.getFileName().toString();
            System.out.println("File Name: "+fileName);
        } catch (IOException e) {
            System.out.println(e.getMessage());
            model.addAttribute("message","Invalid file");
            System.out.println("submit failed");
            return "index";
        }
        System.out.println("file saved in local");
        if(excelService.excelRead(excelDTO.getExcelFile(),fileName))
        {
            System.out.println("File read completed");
            return "UploadSuccess";
        }else {
            System.out.println("file not read");
        }
        model.addAttribute("message","Invalid file");
        System.out.println("submit failed");
        return "index";
    }
}
