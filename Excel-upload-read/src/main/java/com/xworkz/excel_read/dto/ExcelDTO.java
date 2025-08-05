package com.xworkz.excel_read.dto;

import lombok.Data;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.constraints.NotNull;

@Data
public class ExcelDTO {

    @NotNull(message = "Excel file is required")
    private MultipartFile excelFile;
}
