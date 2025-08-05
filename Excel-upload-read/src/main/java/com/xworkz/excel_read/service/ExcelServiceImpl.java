package com.xworkz.excel_read.service;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.FileInputStream;
import java.io.IOException;

@Service
public class ExcelServiceImpl implements ExcelService{

    public ExcelServiceImpl()
    {
        System.out.println("ExcelServiceImpl constructor");
    }

    @Override
    public boolean excelRead(MultipartFile file,String fileName) {
        String filepath="D:\\Java\\File upload\\"+fileName;
        System.out.println("excel read method in service");
        if(file.isEmpty())
        {
            System.out.println("file is empty");
            return false;
        }
        try{
            FileInputStream fileInputStream=new FileInputStream(filepath);
            Workbook workbook=null;
            if(filepath.contains(".xlsx"))
            {
                workbook= new XSSFWorkbook(fileInputStream);
            } else if (filepath.contains(".xls")) {
                workbook=new HSSFWorkbook(fileInputStream);
            }
            int noOfSheets;
            if(workbook!=null) {
                noOfSheets = workbook.getNumberOfSheets();
            }else {
                System.out.println("file have no sheets");
                return false;
            }
            for(int index=0;index<noOfSheets;index++)
            {
                Sheet sheet= workbook.getSheetAt(index);
                for (Row row : sheet) {
                    System.out.println("Row " + row.getRowNum());
                    for (Cell cell : row) {
                        switch (cell.getCellType()) {
                            case Cell.CELL_TYPE_STRING:
                                System.out.print(cell.getStringCellValue() + " ");
                                break;
                            case Cell.CELL_TYPE_NUMERIC:
                                System.out.print(cell.getNumericCellValue() + " ");
                        }
                    }
                    System.out.println();
                }
            }
            fileInputStream.close();
        }catch (IOException e)
        {
            System.out.println(e.getMessage());
            return false;
        }
        return true;
    }
}
