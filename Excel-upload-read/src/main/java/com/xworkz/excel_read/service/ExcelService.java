package com.xworkz.excel_read.service;

import org.springframework.web.multipart.MultipartFile;

public interface ExcelService {

    boolean excelRead(MultipartFile file,String fileName);
}
